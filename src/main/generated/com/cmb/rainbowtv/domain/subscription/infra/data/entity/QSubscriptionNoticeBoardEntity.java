package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionNoticeBoardEntity is a Querydsl query type for SubscriptionNoticeBoardEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionNoticeBoardEntity extends EntityPathBase<SubscriptionNoticeBoardEntity> {

    private static final long serialVersionUID = 75874703L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionNoticeBoardEntity subscriptionNoticeBoardEntity = new QSubscriptionNoticeBoardEntity("subscriptionNoticeBoardEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> snbIdx = createNumber("snbIdx", Long.class);

    public final QSubscriptionNoticeEntity subscriptionNotice;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final com.cmb.rainbowtv.domain.memberMemo.infra.data.entity.QWriteMemoEntity writeMemo;

    public QSubscriptionNoticeBoardEntity(String variable) {
        this(SubscriptionNoticeBoardEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionNoticeBoardEntity(Path<? extends SubscriptionNoticeBoardEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionNoticeBoardEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionNoticeBoardEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionNoticeBoardEntity.class, metadata, inits);
    }

    public QSubscriptionNoticeBoardEntity(Class<? extends SubscriptionNoticeBoardEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.subscriptionNotice = inits.isInitialized("subscriptionNotice") ? new QSubscriptionNoticeEntity(forProperty("subscriptionNotice"), inits.get("subscriptionNotice")) : null;
        this.writeMemo = inits.isInitialized("writeMemo") ? new com.cmb.rainbowtv.domain.memberMemo.infra.data.entity.QWriteMemoEntity(forProperty("writeMemo"), inits.get("writeMemo")) : null;
    }

}

