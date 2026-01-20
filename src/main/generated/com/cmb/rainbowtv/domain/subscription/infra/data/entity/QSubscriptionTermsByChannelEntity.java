package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionTermsByChannelEntity is a Querydsl query type for SubscriptionTermsByChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionTermsByChannelEntity extends EntityPathBase<SubscriptionTermsByChannelEntity> {

    private static final long serialVersionUID = -790770358L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionTermsByChannelEntity subscriptionTermsByChannelEntity = new QSubscriptionTermsByChannelEntity("subscriptionTermsByChannelEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelEntity channel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemByBundleEntity itemByBundle;

    public final NumberPath<Long> stbcIdx = createNumber("stbcIdx", Long.class);

    public final QSubscriptionTermsEntity subscriptionTerms;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionTermsByChannelEntity(String variable) {
        this(SubscriptionTermsByChannelEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionTermsByChannelEntity(Path<? extends SubscriptionTermsByChannelEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionTermsByChannelEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionTermsByChannelEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionTermsByChannelEntity.class, metadata, inits);
    }

    public QSubscriptionTermsByChannelEntity(Class<? extends SubscriptionTermsByChannelEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelEntity(forProperty("channel")) : null;
        this.itemByBundle = inits.isInitialized("itemByBundle") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemByBundleEntity(forProperty("itemByBundle"), inits.get("itemByBundle")) : null;
        this.subscriptionTerms = inits.isInitialized("subscriptionTerms") ? new QSubscriptionTermsEntity(forProperty("subscriptionTerms"), inits.get("subscriptionTerms")) : null;
    }

}

