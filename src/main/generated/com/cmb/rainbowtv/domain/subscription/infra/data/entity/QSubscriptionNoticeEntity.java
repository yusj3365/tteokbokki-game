package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionNoticeEntity is a Querydsl query type for SubscriptionNoticeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionNoticeEntity extends EntityPathBase<SubscriptionNoticeEntity> {

    private static final long serialVersionUID = 1653619965L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionNoticeEntity subscriptionNoticeEntity = new QSubscriptionNoticeEntity("subscriptionNoticeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity item;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final DatePath<java.time.LocalDate> snChangeDate = createDate("snChangeDate", java.time.LocalDate.class);

    public final StringPath snContext = createString("snContext");

    public final NumberPath<Integer> snEnd = createNumber("snEnd", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> snEndDate = createDateTime("snEndDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> snIdx = createNumber("snIdx", Long.class);

    public final NumberPath<Long> snPrice = createNumber("snPrice", Long.class);

    public final DateTimePath<java.time.LocalDateTime> snStartDate = createDateTime("snStartDate", java.time.LocalDateTime.class);

    public final QSubscriptionNoticeCategoryEntity subscriptionNoticeCategory;

    public final EnumPath<com.cmb.rainbowtv.domain.subscription.model.enums.SubscriptionNoticeTypeEnum> subscriptionNoticeType = createEnum("subscriptionNoticeType", com.cmb.rainbowtv.domain.subscription.model.enums.SubscriptionNoticeTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionNoticeEntity(String variable) {
        this(SubscriptionNoticeEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionNoticeEntity(Path<? extends SubscriptionNoticeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionNoticeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionNoticeEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionNoticeEntity.class, metadata, inits);
    }

    public QSubscriptionNoticeEntity(Class<? extends SubscriptionNoticeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity(forProperty("item")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.subscriptionNoticeCategory = inits.isInitialized("subscriptionNoticeCategory") ? new QSubscriptionNoticeCategoryEntity(forProperty("subscriptionNoticeCategory")) : null;
    }

}

