package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChannelAlarmEntity is a Querydsl query type for ChannelAlarmEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelAlarmEntity extends EntityPathBase<ChannelAlarmEntity> {

    private static final long serialVersionUID = 1063366290L;

    public static final QChannelAlarmEntity channelAlarmEntity = new QChannelAlarmEntity("channelAlarmEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> caIdx = createNumber("caIdx", Long.class);

    public final StringPath caMail = createString("caMail");

    public final TimePath<java.time.LocalTime> caTime = createTime("caTime", java.time.LocalTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelAlarmEntity(String variable) {
        super(ChannelAlarmEntity.class, forVariable(variable));
    }

    public QChannelAlarmEntity(Path<? extends ChannelAlarmEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannelAlarmEntity(PathMetadata metadata) {
        super(ChannelAlarmEntity.class, metadata);
    }

}

