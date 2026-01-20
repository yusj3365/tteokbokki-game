package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelEntity is a Querydsl query type for FastChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelEntity extends EntityPathBase<FastChannelEntity> {

    private static final long serialVersionUID = -2139602492L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelEntity fastChannelEntity = new QFastChannelEntity("fastChannelEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelGenreEntity channelGenre;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath fcDashUrl = createString("fcDashUrl");

    public final NumberPath<Integer> fcDisplay = createNumber("fcDisplay", Integer.class);

    public final StringPath fcHlsUrl = createString("fcHlsUrl");

    public final NumberPath<Long> fcIdx = createNumber("fcIdx", Long.class);

    public final NumberPath<Integer> fcIsAdult = createNumber("fcIsAdult", Integer.class);

    public final StringPath fcName = createString("fcName");

    public final NumberPath<Long> fcSeq = createNumber("fcSeq", Long.class);

    public final NumberPath<Integer> fcStatus = createNumber("fcStatus", Integer.class);

    public final StringPath fcUrl = createString("fcUrl");

    public final NumberPath<Integer> fcUse = createNumber("fcUse", Integer.class);

    public final StringPath fcUuid = createString("fcUuid");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelEntity(String variable) {
        this(FastChannelEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelEntity(Path<? extends FastChannelEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelEntity.class, metadata, inits);
    }

    public QFastChannelEntity(Class<? extends FastChannelEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channelGenre = inits.isInitialized("channelGenre") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelGenreEntity(forProperty("channelGenre")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

