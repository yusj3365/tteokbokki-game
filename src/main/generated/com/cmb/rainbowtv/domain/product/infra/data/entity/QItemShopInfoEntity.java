package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemShopInfoEntity is a Querydsl query type for ItemShopInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemShopInfoEntity extends EntityPathBase<ItemShopInfoEntity> {

    private static final long serialVersionUID = -2142306993L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemShopInfoEntity itemShopInfoEntity = new QItemShopInfoEntity("itemShopInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath isiDetailedProductDescription = createString("isiDetailedProductDescription");

    public final NumberPath<Integer> isiFeePayment = createNumber("isiFeePayment", Integer.class);

    public final NumberPath<Integer> isiFeeRate = createNumber("isiFeeRate", Integer.class);

    public final NumberPath<Long> isiIdx = createNumber("isiIdx", Long.class);

    public final NumberPath<Integer> isiInvest = createNumber("isiInvest", Integer.class);

    public final StringPath isiManufacturingCompany = createString("isiManufacturingCompany");

    public final DatePath<java.time.LocalDate> isiManufacturingDate = createDate("isiManufacturingDate", java.time.LocalDate.class);

    public final StringPath isiOrigin = createString("isiOrigin");

    public final QItemEntity item;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QItemShopInfoEntity(String variable) {
        this(ItemShopInfoEntity.class, forVariable(variable), INITS);
    }

    public QItemShopInfoEntity(Path<? extends ItemShopInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemShopInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemShopInfoEntity(PathMetadata metadata, PathInits inits) {
        this(ItemShopInfoEntity.class, metadata, inits);
    }

    public QItemShopInfoEntity(Class<? extends ItemShopInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
    }

}

