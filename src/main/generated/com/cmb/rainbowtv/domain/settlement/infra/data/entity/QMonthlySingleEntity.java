package com.cmb.rainbowtv.domain.settlement.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMonthlySingleEntity is a Querydsl query type for MonthlySingleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMonthlySingleEntity extends EntityPathBase<MonthlySingleEntity> {

    private static final long serialVersionUID = -1956817729L;

    public static final QMonthlySingleEntity monthlySingleEntity = new QMonthlySingleEntity("monthlySingleEntity");

    public final NumberPath<java.math.BigDecimal> caChargeSum = createNumber("caChargeSum", java.math.BigDecimal.class);

    public final StringPath caCorporate = createString("caCorporate");

    public final NumberPath<java.math.BigDecimal> caFee = createNumber("caFee", java.math.BigDecimal.class);

    public final NumberPath<Integer> caFeeCase = createNumber("caFeeCase", Integer.class);

    public final StringPath caMonth = createString("caMonth");

    public final NumberPath<Long> cancellations = createNumber("cancellations", Long.class);

    public final NumberPath<Long> iIdx = createNumber("iIdx", Long.class);

    public final NumberPath<Long> registrations = createNumber("registrations", Long.class);

    public final NumberPath<java.math.BigDecimal> totalAccruedSales = createNumber("totalAccruedSales", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalAccruedSettlementSales = createNumber("totalAccruedSettlementSales", java.math.BigDecimal.class);

    public QMonthlySingleEntity(String variable) {
        super(MonthlySingleEntity.class, forVariable(variable));
    }

    public QMonthlySingleEntity(Path<? extends MonthlySingleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMonthlySingleEntity(PathMetadata metadata) {
        super(MonthlySingleEntity.class, metadata);
    }

}

