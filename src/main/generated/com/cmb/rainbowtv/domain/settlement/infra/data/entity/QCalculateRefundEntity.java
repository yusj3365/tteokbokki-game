package com.cmb.rainbowtv.domain.settlement.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalculateRefundEntity is a Querydsl query type for CalculateRefundEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalculateRefundEntity extends EntityPathBase<CalculateRefundEntity> {

    private static final long serialVersionUID = 848784392L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalculateRefundEntity calculateRefundEntity = new QCalculateRefundEntity("calculateRefundEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCalculateEntity calculate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<java.math.BigDecimal> crFeeRefund = createNumber("crFeeRefund", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> crFeeRefundSum = createNumber("crFeeRefundSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> crFeeRefundSurtax = createNumber("crFeeRefundSurtax", java.math.BigDecimal.class);

    public final NumberPath<Long> crIdx = createNumber("crIdx", Long.class);

    public final NumberPath<java.math.BigDecimal> crRefund = createNumber("crRefund", java.math.BigDecimal.class);

    public final StringPath crRefundAt = createString("crRefundAt");

    public final StringPath crRefundMember = createString("crRefundMember");

    public final NumberPath<java.math.BigDecimal> crRefundSum = createNumber("crRefundSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> crRefundSurtax = createNumber("crRefundSurtax", java.math.BigDecimal.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCalculateRefundEntity(String variable) {
        this(CalculateRefundEntity.class, forVariable(variable), INITS);
    }

    public QCalculateRefundEntity(Path<? extends CalculateRefundEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalculateRefundEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalculateRefundEntity(PathMetadata metadata, PathInits inits) {
        this(CalculateRefundEntity.class, metadata, inits);
    }

    public QCalculateRefundEntity(Class<? extends CalculateRefundEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.calculate = inits.isInitialized("calculate") ? new QCalculateEntity(forProperty("calculate"), inits.get("calculate")) : null;
    }

}

