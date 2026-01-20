package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelPriceEntity is a Querydsl query type for ChannelPriceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelPriceEntity extends EntityPathBase<ChannelPriceEntity> {

    private static final long serialVersionUID = -1757361270L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelPriceEntity channelPriceEntity = new QChannelPriceEntity("channelPriceEntity");

    public final QChannelEntity channel;

    public final NumberPath<Long> cpIdx = createNumber("cpIdx", Long.class);

    public final NumberPath<Long> cpPrice = createNumber("cpPrice", Long.class);

    public QChannelPriceEntity(String variable) {
        this(ChannelPriceEntity.class, forVariable(variable), INITS);
    }

    public QChannelPriceEntity(Path<? extends ChannelPriceEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelPriceEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelPriceEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelPriceEntity.class, metadata, inits);
    }

    public QChannelPriceEntity(Class<? extends ChannelPriceEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel")) : null;
    }

}

