package com.cmb.rainbowtv.domain.point.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPointByRouletteEntity is a Querydsl query type for PointByRouletteEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointByRouletteEntity extends EntityPathBase<PointByRouletteEntity> {

    private static final long serialVersionUID = -1018625142L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPointByRouletteEntity pointByRouletteEntity = new QPointByRouletteEntity("pointByRouletteEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> pbrIdx = createNumber("pbrIdx", Long.class);

    public final QPointEntity point;

    public final QRoulettePercentageEntity roulettePercentage;

    public final NumberPath<Long> rpPercentage = createNumber("rpPercentage", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPointByRouletteEntity(String variable) {
        this(PointByRouletteEntity.class, forVariable(variable), INITS);
    }

    public QPointByRouletteEntity(Path<? extends PointByRouletteEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPointByRouletteEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPointByRouletteEntity(PathMetadata metadata, PathInits inits) {
        this(PointByRouletteEntity.class, metadata, inits);
    }

    public QPointByRouletteEntity(Class<? extends PointByRouletteEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.point = inits.isInitialized("point") ? new QPointEntity(forProperty("point"), inits.get("point")) : null;
        this.roulettePercentage = inits.isInitialized("roulettePercentage") ? new QRoulettePercentageEntity(forProperty("roulettePercentage")) : null;
    }

}

