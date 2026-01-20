package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionEntity is a Querydsl query type for SubscriptionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionEntity extends EntityPathBase<SubscriptionEntity> {

    private static final long serialVersionUID = 1963949445L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionEntity subscriptionEntity = new QSubscriptionEntity("subscriptionEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> isVn = createNumber("isVn", Integer.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final EnumPath<com.cmb.rainbowtv.domain.subscription.model.enums.SubscriptionTypeEnum> subscriptionType = createEnum("subscriptionType", com.cmb.rainbowtv.domain.subscription.model.enums.SubscriptionTypeEnum.class);

    public final NumberPath<Long> suCycleDay = createNumber("suCycleDay", Long.class);

    public final NumberPath<Long> suCycleType = createNumber("suCycleType", Long.class);

    public final NumberPath<Long> suIdx = createNumber("suIdx", Long.class);

    public final NumberPath<Integer> suStatus = createNumber("suStatus", Integer.class);

    public final StringPath suSubject = createString("suSubject");

    public final StringPath suUuid = createString("suUuid");

    public final DateTimePath<java.time.LocalDateTime> suWillCancel = createDateTime("suWillCancel", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionEntity(String variable) {
        this(SubscriptionEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionEntity(Path<? extends SubscriptionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionEntity.class, metadata, inits);
    }

    public QSubscriptionEntity(Class<? extends SubscriptionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

