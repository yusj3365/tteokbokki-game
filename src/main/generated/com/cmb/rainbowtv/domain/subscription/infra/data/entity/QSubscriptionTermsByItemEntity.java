package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubscriptionTermsByItemEntity is a Querydsl query type for SubscriptionTermsByItemEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionTermsByItemEntity extends EntityPathBase<SubscriptionTermsByItemEntity> {

    private static final long serialVersionUID = 409866450L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSubscriptionTermsByItemEntity subscriptionTermsByItemEntity = new QSubscriptionTermsByItemEntity("subscriptionTermsByItemEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity item;

    public final NumberPath<Long> stbiIdx = createNumber("stbiIdx", Long.class);

    public final NumberPath<Integer> stbiQty = createNumber("stbiQty", Integer.class);

    public final QSubscriptionTermsEntity subscriptionTerms;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionTermsByItemEntity(String variable) {
        this(SubscriptionTermsByItemEntity.class, forVariable(variable), INITS);
    }

    public QSubscriptionTermsByItemEntity(Path<? extends SubscriptionTermsByItemEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSubscriptionTermsByItemEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSubscriptionTermsByItemEntity(PathMetadata metadata, PathInits inits) {
        this(SubscriptionTermsByItemEntity.class, metadata, inits);
    }

    public QSubscriptionTermsByItemEntity(Class<? extends SubscriptionTermsByItemEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity(forProperty("item")) : null;
        this.subscriptionTerms = inits.isInitialized("subscriptionTerms") ? new QSubscriptionTermsEntity(forProperty("subscriptionTerms"), inits.get("subscriptionTerms")) : null;
    }

}

