package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemChannelEntity is a Querydsl query type for ItemChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemChannelEntity extends EntityPathBase<ItemChannelEntity> {

    private static final long serialVersionUID = -1949981122L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemChannelEntity itemChannelEntity = new QItemChannelEntity("itemChannelEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelEntity channel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> icIdx = createNumber("icIdx", Long.class);

    public final QItemEntity item;

    public final QItemByBundleEntity itemByBundle;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QItemChannelEntity(String variable) {
        this(ItemChannelEntity.class, forVariable(variable), INITS);
    }

    public QItemChannelEntity(Path<? extends ItemChannelEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemChannelEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemChannelEntity(PathMetadata metadata, PathInits inits) {
        this(ItemChannelEntity.class, metadata, inits);
    }

    public QItemChannelEntity(Class<? extends ItemChannelEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelEntity(forProperty("channel")) : null;
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
        this.itemByBundle = inits.isInitialized("itemByBundle") ? new QItemByBundleEntity(forProperty("itemByBundle"), inits.get("itemByBundle")) : null;
    }

}

