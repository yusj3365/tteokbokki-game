package com.cmb.rainbowtv.domain.search.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSearchKeywordEntity is a Querydsl query type for SearchKeywordEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSearchKeywordEntity extends EntityPathBase<SearchKeywordEntity> {

    private static final long serialVersionUID = 1649936874L;

    public static final QSearchKeywordEntity searchKeywordEntity = new QSearchKeywordEntity("searchKeywordEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath skAiResult = createString("skAiResult");

    public final NumberPath<Integer> skDay = createNumber("skDay", Integer.class);

    public final NumberPath<Long> skIdx = createNumber("skIdx", Long.class);

    public final StringPath skKeywords = createString("skKeywords");

    public final NumberPath<Integer> skMonth = createNumber("skMonth", Integer.class);

    public final NumberPath<Integer> skYear = createNumber("skYear", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSearchKeywordEntity(String variable) {
        super(SearchKeywordEntity.class, forVariable(variable));
    }

    public QSearchKeywordEntity(Path<? extends SearchKeywordEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSearchKeywordEntity(PathMetadata metadata) {
        super(SearchKeywordEntity.class, metadata);
    }

}

