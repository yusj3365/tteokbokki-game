package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemPaymentKeyEntity is a Querydsl query type for ItemPaymentKeyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemPaymentKeyEntity extends EntityPathBase<ItemPaymentKeyEntity> {

    private static final long serialVersionUID = -505445052L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemPaymentKeyEntity itemPaymentKeyEntity = new QItemPaymentKeyEntity("itemPaymentKeyEntity");

    public final StringPath ipkApple = createString("ipkApple");

    public final StringPath ipkGoogle = createString("ipkGoogle");

    public final NumberPath<Long> ipkIdx = createNumber("ipkIdx", Long.class);

    public final QItemEntity item;

    public QItemPaymentKeyEntity(String variable) {
        this(ItemPaymentKeyEntity.class, forVariable(variable), INITS);
    }

    public QItemPaymentKeyEntity(Path<? extends ItemPaymentKeyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemPaymentKeyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemPaymentKeyEntity(PathMetadata metadata, PathInits inits) {
        this(ItemPaymentKeyEntity.class, metadata, inits);
    }

    public QItemPaymentKeyEntity(Class<? extends ItemPaymentKeyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
    }

}

