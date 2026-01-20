package com.cmb.rainbowtv.domain.game.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGameEntity is a Querydsl query type for GameEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGameEntity extends EntityPathBase<GameEntity> {

    private static final long serialVersionUID = -1396635163L;

    public static final QGameEntity gameEntity = new QGameEntity("gameEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> aosDisplay = createNumber("aosDisplay", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> gaClass = createNumber("gaClass", Integer.class);

    public final NumberPath<Long> gaIdx = createNumber("gaIdx", Long.class);

    public final StringPath gaIosPackage = createString("gaIosPackage");

    public final StringPath gaIosUrl = createString("gaIosUrl");

    public final NumberPath<Integer> gaIsAdult = createNumber("gaIsAdult", Integer.class);

    public final NumberPath<Integer> gaIsUse = createNumber("gaIsUse", Integer.class);

    public final StringPath gaLgUrl = createString("gaLgUrl");

    public final StringPath gaName = createString("gaName");

    public final StringPath gaSamsungUrl = createString("gaSamsungUrl");

    public final NumberPath<Integer> gaSeq = createNumber("gaSeq", Integer.class);

    public final StringPath gaTitle = createString("gaTitle");

    public final NumberPath<Integer> gaType = createNumber("gaType", Integer.class);

    public final StringPath gaUrl = createString("gaUrl");

    public final NumberPath<Integer> ottAppDisplay = createNumber("ottAppDisplay", Integer.class);

    public final NumberPath<Integer> smartDisplay = createNumber("smartDisplay", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QGameEntity(String variable) {
        super(GameEntity.class, forVariable(variable));
    }

    public QGameEntity(Path<? extends GameEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGameEntity(PathMetadata metadata) {
        super(GameEntity.class, metadata);
    }

}

