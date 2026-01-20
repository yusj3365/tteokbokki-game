package com.cmb.rainbowtv.domain.settlement.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalculateSettlementEntity is a Querydsl query type for CalculateSettlementEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalculateSettlementEntity extends EntityPathBase<CalculateSettlementEntity> {

    private static final long serialVersionUID = 1329217145L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalculateSettlementEntity calculateSettlementEntity = new QCalculateSettlementEntity("calculateSettlementEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCalculateEntity calculate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<java.math.BigDecimal> csAccruedSettlementSales = createNumber("csAccruedSettlementSales", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csAccruedSettlementSum = createNumber("csAccruedSettlementSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csAccruedSettlementSurtax = createNumber("csAccruedSettlementSurtax", java.math.BigDecimal.class);

    public final NumberPath<Long> csIdx = createNumber("csIdx", Long.class);

    public final NumberPath<java.math.BigDecimal> csSettlementMonthPrice = createNumber("csSettlementMonthPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csSettlementMonthSum = createNumber("csSettlementMonthSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csSettlementMonthSurtax = createNumber("csSettlementMonthSurtax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csSettlementSum = createNumber("csSettlementSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csSettlementSupplyPrice = createNumber("csSettlementSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> csSettlementSurtax = createNumber("csSettlementSurtax", java.math.BigDecimal.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCalculateSettlementEntity(String variable) {
        this(CalculateSettlementEntity.class, forVariable(variable), INITS);
    }

    public QCalculateSettlementEntity(Path<? extends CalculateSettlementEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalculateSettlementEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalculateSettlementEntity(PathMetadata metadata, PathInits inits) {
        this(CalculateSettlementEntity.class, metadata, inits);
    }

    public QCalculateSettlementEntity(Class<? extends CalculateSettlementEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.calculate = inits.isInitialized("calculate") ? new QCalculateEntity(forProperty("calculate"), inits.get("calculate")) : null;
    }

}

