package com.cmb.rainbowtv.domain.coupon.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCouponByMemberSegmentEntity is a Querydsl query type for CouponByMemberSegmentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponByMemberSegmentEntity extends EntityPathBase<CouponByMemberSegmentEntity> {

    private static final long serialVersionUID = -273088093L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCouponByMemberSegmentEntity couponByMemberSegmentEntity = new QCouponByMemberSegmentEntity("couponByMemberSegmentEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cbmsIdx = createNumber("cbmsIdx", Long.class);

    public final QCouponEntity coupon;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> csIdx = createNumber("csIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCouponByMemberSegmentEntity(String variable) {
        this(CouponByMemberSegmentEntity.class, forVariable(variable), INITS);
    }

    public QCouponByMemberSegmentEntity(Path<? extends CouponByMemberSegmentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCouponByMemberSegmentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCouponByMemberSegmentEntity(PathMetadata metadata, PathInits inits) {
        this(CouponByMemberSegmentEntity.class, metadata, inits);
    }

    public QCouponByMemberSegmentEntity(Class<? extends CouponByMemberSegmentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coupon = inits.isInitialized("coupon") ? new QCouponEntity(forProperty("coupon"), inits.get("coupon")) : null;
    }

}

