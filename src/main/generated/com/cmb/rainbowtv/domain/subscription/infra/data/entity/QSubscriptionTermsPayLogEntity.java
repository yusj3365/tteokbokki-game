package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionTermsPayLogEntity is a Querydsl query type for SubscriptionTermsPayLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionTermsPayLogEntity extends EntityPathBase<SubscriptionTermsPayLogEntity> {

    private static final long serialVersionUID = 53384388L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionTermsPayLogEntity subscriptionTermsPayLogEntity = new QSubscriptionTermsPayLogEntity("subscriptionTermsPayLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> stplIdx = createNumber("stplIdx", Long.class);

    public final NumberPath<Integer> stplStatus = createNumber("stplStatus", Integer.class);

    public final StringPath stUuid = createString("stUuid");

    public final QSubscriptionTermsEntity subscriptionTermsEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionTermsPayLogEntity(String variable) {
        this(SubscriptionTermsPayLogEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionTermsPayLogEntity(Path<? extends SubscriptionTermsPayLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionTermsPayLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionTermsPayLogEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionTermsPayLogEntity.class, metadata, inits);
    }

    public QSubscriptionTermsPayLogEntity(Class<? extends SubscriptionTermsPayLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.subscriptionTermsEntity = inits.isInitialized("subscriptionTermsEntity") ? new QSubscriptionTermsEntity(forProperty("subscriptionTermsEntity"), inits.get("subscriptionTermsEntity")) : null;
    }

}

