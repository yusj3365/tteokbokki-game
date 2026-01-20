package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemSubscribeEntity is a Querydsl query type for ItemSubscribeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemSubscribeEntity extends EntityPathBase<ItemSubscribeEntity> {

    private static final long serialVersionUID = -1182763195L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemSubscribeEntity itemSubscribeEntity = new QItemSubscribeEntity("itemSubscribeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> isCycleTime = createNumber("isCycleTime", Long.class);

    public final NumberPath<Long> isCycleType = createNumber("isCycleType", Long.class);

    public final NumberPath<Long> isIdx = createNumber("isIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.product.model.enums.ItemSubscribeTypeEnum> isType = createEnum("isType", com.cmb.rainbowtv.domain.product.model.enums.ItemSubscribeTypeEnum.class);

    public final QItemEntity item;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QItemSubscribeEntity(String variable) {
        this(ItemSubscribeEntity.class, forVariable(variable), INITS);
    }

    public QItemSubscribeEntity(Path<? extends ItemSubscribeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemSubscribeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemSubscribeEntity(PathMetadata metadata, PathInits inits) {
        this(ItemSubscribeEntity.class, metadata, inits);
    }

    public QItemSubscribeEntity(Class<? extends ItemSubscribeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
    }

}

