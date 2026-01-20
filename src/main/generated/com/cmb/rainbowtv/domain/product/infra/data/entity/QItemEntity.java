package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QItemEntity is a Querydsl query type for ItemEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemEntity extends EntityPathBase<ItemEntity> {

    private static final long serialVersionUID = -357010581L;

    public static final QItemEntity itemEntity = new QItemEntity("itemEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath itBrand = createString("itBrand");

    public final StringPath itDetail = createString("itDetail");

    public final NumberPath<Integer> itDisplay = createNumber("itDisplay", Integer.class);

    public final NumberPath<Long> itIdx = createNumber("itIdx", Long.class);

    public final NumberPath<Integer> itIsDelete = createNumber("itIsDelete", Integer.class);

    public final NumberPath<Integer> itIsSale = createNumber("itIsSale", Integer.class);

    public final StringPath itMemo = createString("itMemo");

    public final StringPath itModel = createString("itModel");

    public final StringPath itName = createString("itName");

    public final NumberPath<Long> itPrice = createNumber("itPrice", Long.class);

    public final NumberPath<Long> itPriceOrg = createNumber("itPriceOrg", Long.class);

    public final NumberPath<Long> itSales = createNumber("itSales", Long.class);

    public final NumberPath<Long> itSendBaseline = createNumber("itSendBaseline", Long.class);

    public final NumberPath<Long> itSendPrice = createNumber("itSendPrice", Long.class);

    public final NumberPath<Integer> itSendType = createNumber("itSendType", Integer.class);

    public final NumberPath<Long> itSeq = createNumber("itSeq", Long.class);

    public final StringPath itSku = createString("itSku");

    public final NumberPath<Long> itStockQty = createNumber("itStockQty", Long.class);

    public final NumberPath<Integer> itStockUse = createNumber("itStockUse", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.product.model.enums.ItemTypeEnum> itType = createEnum("itType", com.cmb.rainbowtv.domain.product.model.enums.ItemTypeEnum.class);

    public final NumberPath<Integer> itUse = createNumber("itUse", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QItemEntity(String variable) {
        super(ItemEntity.class, forVariable(variable));
    }

    public QItemEntity(Path<? extends ItemEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemEntity(PathMetadata metadata) {
        super(ItemEntity.class, metadata);
    }

}

