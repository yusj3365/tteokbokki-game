package com.cmb.rainbowtv.domain.coupon.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCouponByItemEntity is a Querydsl query type for CouponByItemEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponByItemEntity extends EntityPathBase<CouponByItemEntity> {

    private static final long serialVersionUID = -1415388209L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCouponByItemEntity couponByItemEntity = new QCouponByItemEntity("couponByItemEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cbiIdx = createNumber("cbiIdx", Long.class);

    public final QCouponEntity coupon;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity item;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCouponByItemEntity(String variable) {
        this(CouponByItemEntity.class, forVariable(variable), INITS);
    }

    public QCouponByItemEntity(Path<? extends CouponByItemEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCouponByItemEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCouponByItemEntity(PathMetadata metadata, PathInits inits) {
        this(CouponByItemEntity.class, metadata, inits);
    }

    public QCouponByItemEntity(Class<? extends CouponByItemEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coupon = inits.isInitialized("coupon") ? new QCouponEntity(forProperty("coupon"), inits.get("coupon")) : null;
        this.item = inits.isInitialized("item") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity(forProperty("item")) : null;
    }

}

