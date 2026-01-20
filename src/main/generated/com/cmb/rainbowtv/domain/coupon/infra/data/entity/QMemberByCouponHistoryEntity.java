package com.cmb.rainbowtv.domain.coupon.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberByCouponHistoryEntity is a Querydsl query type for MemberByCouponHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberByCouponHistoryEntity extends EntityPathBase<MemberByCouponHistoryEntity> {

    private static final long serialVersionUID = -621531580L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberByCouponHistoryEntity memberByCouponHistoryEntity = new QMemberByCouponHistoryEntity("memberByCouponHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cartIdx = createNumber("cartIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbchIdx = createNumber("mbchIdx", Long.class);

    public final NumberPath<Long> mbchPrice = createNumber("mbchPrice", Long.class);

    public final QMemberByCouponEntity memberByCoupon;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberByCouponHistoryEntity(String variable) {
        this(MemberByCouponHistoryEntity.class, forVariable(variable), INITS);
    }

    public QMemberByCouponHistoryEntity(Path<? extends MemberByCouponHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberByCouponHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberByCouponHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(MemberByCouponHistoryEntity.class, metadata, inits);
    }

    public QMemberByCouponHistoryEntity(Class<? extends MemberByCouponHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberByCoupon = inits.isInitialized("memberByCoupon") ? new QMemberByCouponEntity(forProperty("memberByCoupon"), inits.get("memberByCoupon")) : null;
    }

}

