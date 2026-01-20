package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChannelEntity is a Querydsl query type for ChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelEntity extends EntityPathBase<ChannelEntity> {

    private static final long serialVersionUID = -1078061019L;

    public static final QChannelEntity channelEntity = new QChannelEntity("channelEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath caDashUrl = createString("caDashUrl");

    public final StringPath caDestination = createString("caDestination");

    public final StringPath caDestinationExtra = createString("caDestinationExtra");

    public final StringPath caEndpoint = createString("caEndpoint");

    public final StringPath caHlsUrl = createString("caHlsUrl");

    public final NumberPath<Long> caIdx = createNumber("caIdx", Long.class);

    public final NumberPath<Integer> caIsUse = createNumber("caIsUse", Integer.class);

    public final StringPath caLiveChannel = createString("caLiveChannel");

    public final StringPath caLiveInput = createString("caLiveInput");

    public final StringPath caPackageChannel = createString("caPackageChannel");

    public final StringPath caType = createString("caType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelEntity(String variable) {
        super(ChannelEntity.class, forVariable(variable));
    }

    public QChannelEntity(Path<? extends ChannelEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannelEntity(PathMetadata metadata) {
        super(ChannelEntity.class, metadata);
    }

}

