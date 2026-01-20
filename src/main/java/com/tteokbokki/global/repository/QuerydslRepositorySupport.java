package com.tteokbokki.global.repository;

import com.cmb.rainbowtv.global.dto.request.CursorSearchRequest;
import com.cmb.rainbowtv.global.dto.request.SearchRequest;
import com.cmb.rainbowtv.global.dto.request.enums.DirProp;
import com.cmb.rainbowtv.global.dto.request.enums.OrderProp;
import com.cmb.rainbowtv.global.exception.CustomException;
import com.cmb.rainbowtv.global.exception.ErrorCode;
import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathBuilder;
import com.querydsl.jpa.JPQLTemplates;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.data.querydsl.SimpleEntityPathResolver;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;


@Repository
public abstract class QuerydslRepositorySupport {

    private final Class<?> domainClass;
    private Querydsl querydsl;
    private EntityManager entityManager;
    private JPAQueryFactory queryFactory;

    public QuerydslRepositorySupport(Class<?> domainClass) {
        Assert.notNull(domainClass, "Domain class must not be null!");
        this.domainClass = domainClass;
    }

    @PostConstruct
    public void validate() {
        Assert.notNull(entityManager, "EntityManager must not be null!");
        Assert.notNull(querydsl, "Querydsl must not be null!");
        Assert.notNull(queryFactory, "QueryFactory must not be null!");
    }

    protected JPAQueryFactory getQueryFactory() {
        return queryFactory;
    }

    protected Querydsl getQuerydsl() {
        return querydsl;
    }

    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        Assert.notNull(entityManager, "EntityManager must not be null!");
        JpaEntityInformation entityInformation = JpaEntityInformationSupport.getEntityInformation(domainClass, entityManager);
        SimpleEntityPathResolver resolver = SimpleEntityPathResolver.INSTANCE;
        EntityPath path = resolver.createPath(entityInformation.getJavaType());
        this.entityManager = entityManager;
        this.querydsl = new Querydsl(entityManager, new PathBuilder<>(path.getType(), path.getMetadata()));
        this.queryFactory = new JPAQueryFactory(JPQLTemplates.DEFAULT, entityManager);
    }

    protected <T> JPAQuery<T> select(Expression<T> expr) {
        return getQueryFactory().select(expr);
    }

    protected <T> JPAQuery<T> selectFrom(EntityPath<T> from) {
        return getQueryFactory().selectFrom(from);
    }

    protected OrderSpecifier<?>[] createOrderFilter(SearchRequest searchRequest,
        BiFunction<OrderProp, DirProp, OrderSpecifier<?>> createOrderSpecifier) {
        List<OrderSpecifier<?>> orders = new ArrayList<>();
        List<OrderProp> props = searchRequest.getProps();
        List<DirProp> dirs = searchRequest.getDirs();
        if (props.size() != dirs.size()) {
            throw new CustomException(ErrorCode.INVALID_ORDER_PARAMETER);
        }

        for (int i = 0; i < props.size(); i++) {
            orders.add(createOrderSpecifier.apply(props.get(i), dirs.get(i)));
        }
        return orders.toArray(OrderSpecifier[]::new);
    }

    protected OrderSpecifier<?> createOrderFilter(
        CursorSearchRequest searchRequest,
        BiFunction<OrderProp, DirProp, OrderSpecifier<?>> createOrderSpecifier
    ) {
        DirProp dir = searchRequest.getDir();
        OrderProp prop = OrderProp.idx;
        if (searchRequest.getProp() != null) {
            prop = searchRequest.getProp();
        }

        return createOrderSpecifier.apply(prop, dir);
    }

    protected Expression<?>[] combineSelectArray(List<List<Expression<?>>> lists) {
        List<Expression<?>> mainList = new ArrayList<>();
        for (List<Expression<?>> list : lists) {
            mainList.addAll(list);
        }
        return mainList.toArray(Expression<?>[]::new);
    }

    @SafeVarargs
    protected final <T> void applyFiltersIfNotCountQuery(JPAQuery<T> query, Expression<T> select, Function<JPAQuery<T>, T>... filters) {
        if (!Long.class.isAssignableFrom(select.getType())) {
            for (Function<JPAQuery<T>, T> filter : filters) {
                filter.apply(query);
            }
        }
    }

    @SafeVarargs
    protected final <T> void applyFiltersIfCountQuery(JPAQuery<T> query, Expression<T> select, Function<JPAQuery<T>, T>... filters) {
        if (Long.class.isAssignableFrom(select.getType())) {
            for (Function<JPAQuery<T>, T> filter : filters) {
                filter.apply(query);
            }
        }
    }

    protected final <T> void applyPaginationIfPaging(JPAQuery<T> query, Expression<T> select, SearchRequest req) {
        if (!Long.class.isAssignableFrom(select.getType()) && req.isPaging()) {
            query
                .offset(req.setOffset())
                .limit(req.getSize());
        }
    }

    // 2025.04.08 pagination 간소화를 위해 추가 --

    protected <T> JPAQuery<T> applyOrderOffset(
        SearchRequest req,
        JPAQuery<T> query,
        Expression<T> select,
        BiFunction<OrderProp, DirProp, OrderSpecifier<?>> orderSpecifierProvider
    ) {
        if (!Long.class.isAssignableFrom(select.getType())) {
            query.orderBy(createOrderFilter(req, orderSpecifierProvider));
            if (req.isPaging()) {
                query.offset(req.setOffset())
                    .limit(req.getSize());
            }
        }
        return query;
    }

    protected <T> JPAQuery<T> applyOrderCursor(
        CursorSearchRequest req,
        JPAQuery<T> query,
        Expression<T> select,
        BiFunction<OrderProp, DirProp, OrderSpecifier<?>> orderSpecifierProvider,
        NumberPath<?> idx
    ) {
        if (!Long.class.isAssignableFrom(select.getType())) {
            Long cursorId = Optional.ofNullable(req.getCursorId())
                .orElse(-1L);
            DirProp dir = Optional.ofNullable(req.getDir())
                .orElse(DirProp.asc);
            Long size = Optional.ofNullable(req.getSize())
                .orElse(10L);
            query
                .where(cursorFilter(cursorId, dir, idx))
                .orderBy(createOrderFilter(req, orderSpecifierProvider))
                .limit(size + 1);
        }
        return query;
    }

    abstract protected OrderSpecifier<?> orderSpecifier(OrderProp prop, DirProp dir);

    protected final BooleanExpression cursorFilter(Long cursorId, DirProp dir, NumberPath<?> idx) {
        if (cursorId == -1L) { // 맨 처음부터 조회(오름차순, 내림차순 구분 없음)
            return null;
        }
        if (dir.equals(DirProp.desc)) { // cursorId부터 내림차순 조회
            return idx.lt(cursorId);
        }
        return idx.gt(cursorId);        // cursorId부터 오름차순 조회
    }

    // ---------------------------------------

}
