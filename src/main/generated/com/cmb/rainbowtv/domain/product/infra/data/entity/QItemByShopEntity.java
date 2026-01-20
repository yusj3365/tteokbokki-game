package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemByShopEntity is a Querydsl query type for ItemByShopEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemByShopEntity extends EntityPathBase<ItemByShopEntity> {

    private static final long serialVersionUID = 1595444152L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemByShopEntity itemByShopEntity = new QItemByShopEntity("itemByShopEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> ibsIdx = createNumber("ibsIdx", Long.class);

    public final QItemEntity item;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QItemByShopEntity(String variable) {
        this(ItemByShopEntity.class, forVariable(variable), INITS);
    }

    public QItemByShopEntity(Path<? extends ItemByShopEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemByShopEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemByShopEntity(PathMetadata metadata, PathInits inits) {
        this(ItemByShopEntity.class, metadata, inits);
    }

    public QItemByShopEntity(Class<? extends ItemByShopEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

