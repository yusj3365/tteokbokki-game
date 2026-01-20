package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelProgramRetryEntity is a Querydsl query type for FastChannelProgramRetryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelProgramRetryEntity extends EntityPathBase<FastChannelProgramRetryEntity> {

    private static final long serialVersionUID = 767752168L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelProgramRetryEntity fastChannelProgramRetryEntity = new QFastChannelProgramRetryEntity("fastChannelProgramRetryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath channelName = createString("channelName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final NumberPath<Long> fcprIdx = createNumber("fcprIdx", Long.class);

    public final StringPath fcpUuid = createString("fcpUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelProgramRetryEntity(String variable) {
        this(FastChannelProgramRetryEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelProgramRetryEntity(Path<? extends FastChannelProgramRetryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelProgramRetryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelProgramRetryEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelProgramRetryEntity.class, metadata, inits);
    }

    public QFastChannelProgramRetryEntity(Class<? extends FastChannelProgramRetryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
    }

}

