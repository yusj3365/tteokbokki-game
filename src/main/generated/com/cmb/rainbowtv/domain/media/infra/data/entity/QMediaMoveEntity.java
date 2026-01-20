package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMediaMoveEntity is a Querydsl query type for MediaMoveEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaMoveEntity extends EntityPathBase<MediaMoveEntity> {

    private static final long serialVersionUID = 906471960L;

    public static final QMediaMoveEntity mediaMoveEntity = new QMediaMoveEntity("mediaMoveEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> fmIdx = createNumber("fmIdx", Long.class);

    public final NumberPath<Long> meIdx = createNumber("meIdx", Long.class);

    public final NumberPath<Long> mmIdx = createNumber("mmIdx", Long.class);

    public final NumberPath<Long> mmOriginId = createNumber("mmOriginId", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MoveTypeEnum> mmOriginType = createEnum("mmOriginType", com.cmb.rainbowtv.domain.media.model.enums.MoveTypeEnum.class);

    public final NumberPath<Integer> mmThumbnail = createNumber("mmThumbnail", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MoveTypeEnum> mmType = createEnum("mmType", com.cmb.rainbowtv.domain.media.model.enums.MoveTypeEnum.class);

    public final NumberPath<Integer> mmVideo = createNumber("mmVideo", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaMoveEntity(String variable) {
        super(MediaMoveEntity.class, forVariable(variable));
    }

    public QMediaMoveEntity(Path<? extends MediaMoveEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMediaMoveEntity(PathMetadata metadata) {
        super(MediaMoveEntity.class, metadata);
    }

}

