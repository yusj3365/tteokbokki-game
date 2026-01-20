package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFastChannelProgramPlayingEntity is a Querydsl query type for FastChannelProgramPlayingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelProgramPlayingEntity extends EntityPathBase<FastChannelProgramPlayingEntity> {

    private static final long serialVersionUID = 1599278510L;

    public static final QFastChannelProgramPlayingEntity fastChannelProgramPlayingEntity = new QFastChannelProgramPlayingEntity("fastChannelProgramPlayingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath channelName = createString("channelName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> fcppIdx = createNumber("fcppIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> fcppTime = createDateTime("fcppTime", java.time.LocalDateTime.class);

    public final StringPath fcpUuid = createString("fcpUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelProgramPlayingEntity(String variable) {
        super(FastChannelProgramPlayingEntity.class, forVariable(variable));
    }

    public QFastChannelProgramPlayingEntity(Path<? extends FastChannelProgramPlayingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFastChannelProgramPlayingEntity(PathMetadata metadata) {
        super(FastChannelProgramPlayingEntity.class, metadata);
    }

}

