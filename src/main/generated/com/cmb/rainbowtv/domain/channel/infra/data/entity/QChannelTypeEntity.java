package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelTypeEntity is a Querydsl query type for ChannelTypeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelTypeEntity extends EntityPathBase<ChannelTypeEntity> {

    private static final long serialVersionUID = -259797249L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelTypeEntity channelTypeEntity = new QChannelTypeEntity("channelTypeEntity");

    public final QChannelEntity channel;

    public final NumberPath<Long> ctIdx = createNumber("ctIdx", Long.class);

    public final NumberPath<Long> ctType = createNumber("ctType", Long.class);

    public QChannelTypeEntity(String variable) {
        this(ChannelTypeEntity.class, forVariable(variable), INITS);
    }

    public QChannelTypeEntity(Path<? extends ChannelTypeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelTypeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelTypeEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelTypeEntity.class, metadata, inits);
    }

    public QChannelTypeEntity(Class<? extends ChannelTypeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel")) : null;
    }

}

