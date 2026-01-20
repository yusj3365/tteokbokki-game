package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelByAreaEntity is a Querydsl query type for ChannelByAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelByAreaEntity extends EntityPathBase<ChannelByAreaEntity> {

    private static final long serialVersionUID = -19700407L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelByAreaEntity channelByAreaEntity = new QChannelByAreaEntity("channelByAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    public final NumberPath<Long> cbaIdx = createNumber("cbaIdx", Long.class);

    public final NumberPath<Integer> cbaSi = createNumber("cbaSi", Integer.class);

    public final QChannelEntity channel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelByAreaEntity(String variable) {
        this(ChannelByAreaEntity.class, forVariable(variable), INITS);
    }

    public QChannelByAreaEntity(Path<? extends ChannelByAreaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelByAreaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelByAreaEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelByAreaEntity.class, metadata, inits);
    }

    public QChannelByAreaEntity(Class<? extends ChannelByAreaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel")) : null;
    }

}

