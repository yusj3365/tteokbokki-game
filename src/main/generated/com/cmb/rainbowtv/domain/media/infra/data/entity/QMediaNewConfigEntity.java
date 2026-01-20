package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMediaNewConfigEntity is a Querydsl query type for MediaNewConfigEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaNewConfigEntity extends EntityPathBase<MediaNewConfigEntity> {

    private static final long serialVersionUID = 1994533633L;

    public static final QMediaNewConfigEntity mediaNewConfigEntity = new QMediaNewConfigEntity("mediaNewConfigEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MncDayEnum> mncDay = createEnum("mncDay", com.cmb.rainbowtv.domain.media.model.enums.MncDayEnum.class);

    public final NumberPath<Long> mncIdx = createNumber("mncIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaNewConfigEntity(String variable) {
        super(MediaNewConfigEntity.class, forVariable(variable));
    }

    public QMediaNewConfigEntity(Path<? extends MediaNewConfigEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMediaNewConfigEntity(PathMetadata metadata) {
        super(MediaNewConfigEntity.class, metadata);
    }

}

