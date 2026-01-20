package com.cmb.rainbowtv.domain.settlement.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalculateShopRefundEntity is a Querydsl query type for CalculateShopRefundEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalculateShopRefundEntity extends EntityPathBase<CalculateShopRefundEntity> {

    private static final long serialVersionUID = -1186870370L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalculateShopRefundEntity calculateShopRefundEntity = new QCalculateShopRefundEntity("calculateShopRefundEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCalculateEntity calculate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> csrIdx = createNumber("csrIdx", Long.class);

    public final NumberPath<java.math.BigDecimal> csrRefund = createNumber("csrRefund", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrRefundCmbSum = createNumber("csrRefundCmbSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrRefundCmbSupplyPrice = createNumber("csrRefundCmbSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrRefundCmbSurtax = createNumber("csrRefundCmbSurtax", java.math.BigDecimal.class);

    public final StringPath csrRefundSum = createString("csrRefundSum");

    public final NumberPath<java.math.BigDecimal> csrRefundSurtax = createNumber("csrRefundSurtax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrRefundUserSum = createNumber("csrRefundUserSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrRefundUserSupplyPrice = createNumber("csrRefundUserSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrRefundUserSurtax = createNumber("csrRefundUserSurtax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrTradeCmbSum = createNumber("csrTradeCmbSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrTradeCmbSupplyPrice = createNumber("csrTradeCmbSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csrTradeCmbSurtax = createNumber("csrTradeCmbSurtax", java.math.BigDecimal.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCalculateShopRefundEntity(String variable) {
        this(CalculateShopRefundEntity.class, forVariable(variable), INITS);
    }

    public QCalculateShopRefundEntity(Path<? extends CalculateShopRefundEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalculateShopRefundEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalculateShopRefundEntity(PathMetadata metadata, PathInits inits) {
        this(CalculateShopRefundEntity.class, metadata, inits);
    }

    public QCalculateShopRefundEntity(Class<? extends CalculateShopRefundEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.calculate = inits.isInitialized("calculate") ? new QCalculateEntity(forProperty("calculate"), inits.get("calculate")) : null;
    }

}

