package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelByBundleEntity is a Querydsl query type for ChannelByBundleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelByBundleEntity extends EntityPathBase<ChannelByBundleEntity> {

    private static final long serialVersionUID = 1486454590L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelByBundleEntity channelByBundleEntity = new QChannelByBundleEntity("channelByBundleEntity");

    public final NumberPath<Long> cbbIdx = createNumber("cbbIdx", Long.class);

    public final QChannelEntity channel;

    public final QChannelBundleEntity channelBundle;

    public QChannelByBundleEntity(String variable) {
        this(ChannelByBundleEntity.class, forVariable(variable), INITS);
    }

    public QChannelByBundleEntity(Path<? extends ChannelByBundleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelByBundleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelByBundleEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelByBundleEntity.class, metadata, inits);
    }

    public QChannelByBundleEntity(Class<? extends ChannelByBundleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel")) : null;
        this.channelBundle = inits.isInitialized("channelBundle") ? new QChannelBundleEntity(forProperty("channelBundle")) : null;
    }

}

