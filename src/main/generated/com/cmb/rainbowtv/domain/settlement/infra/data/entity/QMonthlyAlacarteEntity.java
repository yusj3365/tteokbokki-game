package com.cmb.rainbowtv.domain.settlement.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMonthlyAlacarteEntity is a Querydsl query type for MonthlyAlacarteEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMonthlyAlacarteEntity extends EntityPathBase<MonthlyAlacarteEntity> {

    private static final long serialVersionUID = 1247233958L;

    public static final QMonthlyAlacarteEntity monthlyAlacarteEntity = new QMonthlyAlacarteEntity("monthlyAlacarteEntity");

    public final NumberPath<java.math.BigDecimal> caChargeSum = createNumber("caChargeSum", java.math.BigDecimal.class);

    public final StringPath caCorporate = createString("caCorporate");

    public final NumberPath<java.math.BigDecimal> caFee = createNumber("caFee", java.math.BigDecimal.class);

    public final NumberPath<Integer> caFeeCase = createNumber("caFeeCase", Integer.class);

    public final StringPath caMonth = createString("caMonth");

    public final NumberPath<Long> cancellations = createNumber("cancellations", Long.class);

    public final NumberPath<Long> cbIdx = createNumber("cbIdx", Long.class);

    public final StringPath cbName = createString("cbName");

    public final NumberPath<Long> ciIdx = createNumber("ciIdx", Long.class);

    public final StringPath ciName = createString("ciName");

    public final NumberPath<Long> iIdx = createNumber("iIdx", Long.class);

    public final NumberPath<Long> registrations = createNumber("registrations", Long.class);

    public final NumberPath<java.math.BigDecimal> totalAccruedSales = createNumber("totalAccruedSales", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalAccruedSettlementSales = createNumber("totalAccruedSettlementSales", java.math.BigDecimal.class);

    public QMonthlyAlacarteEntity(String variable) {
        super(MonthlyAlacarteEntity.class, forVariable(variable));
    }

    public QMonthlyAlacarteEntity(Path<? extends MonthlyAlacarteEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMonthlyAlacarteEntity(PathMetadata metadata) {
        super(MonthlyAlacarteEntity.class, metadata);
    }

}

