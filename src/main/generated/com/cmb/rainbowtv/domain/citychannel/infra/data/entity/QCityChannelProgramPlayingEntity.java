package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCityChannelProgramPlayingEntity is a Querydsl query type for CityChannelProgramPlayingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelProgramPlayingEntity extends EntityPathBase<CityChannelProgramPlayingEntity> {

    private static final long serialVersionUID = 869086169L;

    public static final QCityChannelProgramPlayingEntity cityChannelProgramPlayingEntity = new QCityChannelProgramPlayingEntity("cityChannelProgramPlayingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> ccppIdx = createNumber("ccppIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> ccppTime = createDateTime("ccppTime", java.time.LocalDateTime.class);

    public final StringPath ccpUuid = createString("ccpUuid");

    public final StringPath channelName = createString("channelName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelProgramPlayingEntity(String variable) {
        super(CityChannelProgramPlayingEntity.class, forVariable(variable));
    }

    public QCityChannelProgramPlayingEntity(Path<? extends CityChannelProgramPlayingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCityChannelProgramPlayingEntity(PathMetadata metadata) {
        super(CityChannelProgramPlayingEntity.class, metadata);
    }

}

