package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionTermsEntity is a Querydsl query type for SubscriptionTermsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionTermsEntity extends EntityPathBase<SubscriptionTermsEntity> {

    private static final long serialVersionUID = -1619348504L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionTermsEntity subscriptionTermsEntity = new QSubscriptionTermsEntity("subscriptionTermsEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.coupon.infra.data.entity.QMemberByCouponEntity memberByCoupon;

    public final StringPath ordId = createString("ordId");

    public final NumberPath<Long> stIdx = createNumber("stIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> stShippingDate = createDateTime("stShippingDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> stStatus = createNumber("stStatus", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> stSubscribeDate = createDateTime("stSubscribeDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> stTerm = createNumber("stTerm", Integer.class);

    public final NumberPath<Integer> stTrial = createNumber("stTrial", Integer.class);

    public final StringPath stUuid = createString("stUuid");

    public final QSubscriptionEntity subscription;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionTermsEntity(String variable) {
        this(SubscriptionTermsEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionTermsEntity(Path<? extends SubscriptionTermsEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionTermsEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionTermsEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionTermsEntity.class, metadata, inits);
    }

    public QSubscriptionTermsEntity(Class<? extends SubscriptionTermsEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberByCoupon = inits.isInitialized("memberByCoupon") ? new com.cmb.rainbowtv.domain.coupon.infra.data.entity.QMemberByCouponEntity(forProperty("memberByCoupon"), inits.get("memberByCoupon")) : null;
        this.subscription = inits.isInitialized("subscription") ? new QSubscriptionEntity(forProperty("subscription"), inits.get("subscription")) : null;
    }

}

