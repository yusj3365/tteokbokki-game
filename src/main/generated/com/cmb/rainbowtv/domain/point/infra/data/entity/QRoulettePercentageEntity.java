package com.cmb.rainbowtv.domain.point.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoulettePercentageEntity is a Querydsl query type for RoulettePercentageEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoulettePercentageEntity extends EntityPathBase<RoulettePercentageEntity> {

    private static final long serialVersionUID = 1639845125L;

    public static final QRoulettePercentageEntity roulettePercentageEntity = new QRoulettePercentageEntity("roulettePercentageEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> rpIdx = createNumber("rpIdx", Long.class);

    public final NumberPath<Long> rpPercentage = createNumber("rpPercentage", Long.class);

    public final NumberPath<Long> rpPoint = createNumber("rpPoint", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QRoulettePercentageEntity(String variable) {
        super(RoulettePercentageEntity.class, forVariable(variable));
    }

    public QRoulettePercentageEntity(Path<? extends RoulettePercentageEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoulettePercentageEntity(PathMetadata metadata) {
        super(RoulettePercentageEntity.class, metadata);
    }

}

