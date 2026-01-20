package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemByBundleEntity is a Querydsl query type for ItemByBundleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemByBundleEntity extends EntityPathBase<ItemByBundleEntity> {

    private static final long serialVersionUID = -943770492L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemByBundleEntity itemByBundleEntity = new QItemByBundleEntity("itemByBundleEntity");

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelBundleEntity channelBundle;

    public final NumberPath<Long> ibbIdx = createNumber("ibbIdx", Long.class);

    public final QItemEntity item;

    public QItemByBundleEntity(String variable) {
        this(ItemByBundleEntity.class, forVariable(variable), INITS);
    }

    public QItemByBundleEntity(Path<? extends ItemByBundleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemByBundleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemByBundleEntity(PathMetadata metadata, PathInits inits) {
        this(ItemByBundleEntity.class, metadata, inits);
    }

    public QItemByBundleEntity(Class<? extends ItemByBundleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channelBundle = inits.isInitialized("channelBundle") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelBundleEntity(forProperty("channelBundle")) : null;
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
    }

}

