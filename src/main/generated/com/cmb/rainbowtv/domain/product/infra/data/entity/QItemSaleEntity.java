package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemSaleEntity is a Querydsl query type for ItemSaleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemSaleEntity extends EntityPathBase<ItemSaleEntity> {

    private static final long serialVersionUID = -1703245166L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemSaleEntity itemSaleEntity = new QItemSaleEntity("itemSaleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> isCategory = createNumber("isCategory", Integer.class);

    public final NumberPath<Long> isIdx = createNumber("isIdx", Long.class);

    public final NumberPath<Integer> isIsSpecificDiscount = createNumber("isIsSpecificDiscount", Integer.class);

    public final NumberPath<Long> isQuantity = createNumber("isQuantity", Long.class);

    public final DatePath<java.time.LocalDate> isSpecificEnd = createDate("isSpecificEnd", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> isSpecificStart = createDate("isSpecificStart", java.time.LocalDate.class);

    public final QItemEntity item;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QItemSaleEntity(String variable) {
        this(ItemSaleEntity.class, forVariable(variable), INITS);
    }

    public QItemSaleEntity(Path<? extends ItemSaleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemSaleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemSaleEntity(PathMetadata metadata, PathInits inits) {
        this(ItemSaleEntity.class, metadata, inits);
    }

    public QItemSaleEntity(Class<? extends ItemSaleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
    }

}

