package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemAdvertiseEntity is a Querydsl query type for ItemAdvertiseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemAdvertiseEntity extends EntityPathBase<ItemAdvertiseEntity> {

    private static final long serialVersionUID = 650864738L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemAdvertiseEntity itemAdvertiseEntity = new QItemAdvertiseEntity("itemAdvertiseEntity");

    public final NumberPath<Long> iaCount = createNumber("iaCount", Long.class);

    public final NumberPath<Long> iaIdx = createNumber("iaIdx", Long.class);

    public final StringPath iaLevel = createString("iaLevel");

    public final NumberPath<Long> iaTime = createNumber("iaTime", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.product.model.enums.ItemAdvertiseTypeEnum> iaType = createEnum("iaType", com.cmb.rainbowtv.domain.product.model.enums.ItemAdvertiseTypeEnum.class);

    public final QItemEntity item;

    public QItemAdvertiseEntity(String variable) {
        this(ItemAdvertiseEntity.class, forVariable(variable), INITS);
    }

    public QItemAdvertiseEntity(Path<? extends ItemAdvertiseEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemAdvertiseEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemAdvertiseEntity(PathMetadata metadata, PathInits inits) {
        this(ItemAdvertiseEntity.class, metadata, inits);
    }

    public QItemAdvertiseEntity(Class<? extends ItemAdvertiseEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
    }

}

