package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelScheduleEntity is a Querydsl query type for ChannelScheduleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelScheduleEntity extends EntityPathBase<ChannelScheduleEntity> {

    private static final long serialVersionUID = -53368932L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelScheduleEntity channelScheduleEntity = new QChannelScheduleEntity("channelScheduleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QChannelEntity channel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath csActor = createString("csActor");

    public final NumberPath<Integer> csBlock = createNumber("csBlock", Integer.class);

    public final StringPath csDirector = createString("csDirector");

    public final DateTimePath<java.time.LocalDateTime> csEndTime = createDateTime("csEndTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> csIdx = createNumber("csIdx", Long.class);

    public final StringPath csName = createString("csName");

    public final DateTimePath<java.time.LocalDateTime> csStartTime = createDateTime("csStartTime", java.time.LocalDateTime.class);

    public final StringPath csSynopsis = createString("csSynopsis");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelScheduleEntity(String variable) {
        this(ChannelScheduleEntity.class, forVariable(variable), INITS);
    }

    public QChannelScheduleEntity(Path<? extends ChannelScheduleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelScheduleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelScheduleEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelScheduleEntity.class, metadata, inits);
    }

    public QChannelScheduleEntity(Class<? extends ChannelScheduleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel")) : null;
    }

}

