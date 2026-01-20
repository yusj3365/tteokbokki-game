package com.cmb.rainbowtv.domain.point.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPointRateEntity is a Querydsl query type for PointRateEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointRateEntity extends EntityPathBase<PointRateEntity> {

    private static final long serialVersionUID = 1040821567L;

    public static final QPointRateEntity pointRateEntity = new QPointRateEntity("pointRateEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> prAdminNo = createNumber("prAdminNo", Long.class);

    public final DateTimePath<java.time.LocalDateTime> prEndDate = createDateTime("prEndDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> prIdx = createNumber("prIdx", Long.class);

    public final StringPath prInfo = createString("prInfo");

    public final DateTimePath<java.time.LocalDateTime> prStartDate = createDateTime("prStartDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> prTradeRate = createNumber("prTradeRate", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPointRateEntity(String variable) {
        super(PointRateEntity.class, forVariable(variable));
    }

    public QPointRateEntity(Path<? extends PointRateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPointRateEntity(PathMetadata metadata) {
        super(PointRateEntity.class, metadata);
    }

}

