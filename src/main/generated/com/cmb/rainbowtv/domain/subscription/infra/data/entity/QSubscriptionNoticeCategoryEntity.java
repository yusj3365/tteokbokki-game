package com.cmb.rainbowtv.domain.subscription.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSubscriptionNoticeCategoryEntity is a Querydsl query type for SubscriptionNoticeCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubscriptionNoticeCategoryEntity extends EntityPathBase<SubscriptionNoticeCategoryEntity> {

    private static final long serialVersionUID = -1124862565L;

    public static final QSubscriptionNoticeCategoryEntity subscriptionNoticeCategoryEntity = new QSubscriptionNoticeCategoryEntity("subscriptionNoticeCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> sncIdx = createNumber("sncIdx", Long.class);

    public final StringPath sncName = createString("sncName");

    public final StringPath sncType = createString("sncType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSubscriptionNoticeCategoryEntity(String variable) {
        super(SubscriptionNoticeCategoryEntity.class, forVariable(variable));
    }

    public QSubscriptionNoticeCategoryEntity(Path<? extends SubscriptionNoticeCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubscriptionNoticeCategoryEntity(PathMetadata metadata) {
        super(SubscriptionNoticeCategoryEntity.class, metadata);
    }

}

