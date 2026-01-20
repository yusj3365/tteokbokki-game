package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelAdRetryEntity is a Querydsl query type for FastChannelAdRetryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelAdRetryEntity extends EntityPathBase<FastChannelAdRetryEntity> {

    private static final long serialVersionUID = 1149075335L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelAdRetryEntity fastChannelAdRetryEntity = new QFastChannelAdRetryEntity("fastChannelAdRetryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath adBreakArr = createString("adBreakArr");

    public final com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity adSet;

    public final StringPath beforeProgramName = createString("beforeProgramName");

    public final StringPath channelName = createString("channelName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelProgramEntity fastChannelProgram;

    public final NumberPath<Long> fcarIdx = createNumber("fcarIdx", Long.class);

    public final StringPath guid = createString("guid");

    public final StringPath transitionArr = createString("transitionArr");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelAdRetryEntity(String variable) {
        this(FastChannelAdRetryEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelAdRetryEntity(Path<? extends FastChannelAdRetryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelAdRetryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelAdRetryEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelAdRetryEntity.class, metadata, inits);
    }

    public QFastChannelAdRetryEntity(Class<? extends FastChannelAdRetryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adSet = inits.isInitialized("adSet") ? new com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity(forProperty("adSet")) : null;
        this.fastChannelProgram = inits.isInitialized("fastChannelProgram") ? new QFastChannelProgramEntity(forProperty("fastChannelProgram"), inits.get("fastChannelProgram")) : null;
    }

}

