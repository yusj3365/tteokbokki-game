package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionNoticeConfirmEntity is a Querydsl query type for SubscriptionNoticeConfirmEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionNoticeConfirmEntity extends EntityPathBase<SubscriptionNoticeConfirmEntity> {

    private static final long serialVersionUID = -1478378391L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionNoticeConfirmEntity subscriptionNoticeConfirmEntity = new QSubscriptionNoticeConfirmEntity("subscriptionNoticeConfirmEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> sncIdx = createNumber("sncIdx", Long.class);

    public final QSubscriptionEntity subscription;

    public final QSubscriptionNoticeEntity subscriptionNotice;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionNoticeConfirmEntity(String variable) {
        this(SubscriptionNoticeConfirmEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionNoticeConfirmEntity(Path<? extends SubscriptionNoticeConfirmEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionNoticeConfirmEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionNoticeConfirmEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionNoticeConfirmEntity.class, metadata, inits);
    }

    public QSubscriptionNoticeConfirmEntity(Class<? extends SubscriptionNoticeConfirmEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.subscription = inits.isInitialized("subscription") ? new QSubscriptionEntity(forProperty("subscription"), inits.get("subscription")) : null;
        this.subscriptionNotice = inits.isInitialized("subscriptionNotice") ? new QSubscriptionNoticeEntity(forProperty("subscriptionNotice"), inits.get("subscriptionNotice")) : null;
    }

}

