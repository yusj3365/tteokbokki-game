package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelAdEntity is a Querydsl query type for FastChannelAdEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelAdEntity extends EntityPathBase<FastChannelAdEntity> {

    private static final long serialVersionUID = 1123966855L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelAdEntity fastChannelAdEntity = new QFastChannelAdEntity("fastChannelAdEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity adSet;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final NumberPath<Long> fcaIdx = createNumber("fcaIdx", Long.class);

    public final NumberPath<Long> fcaSeq = createNumber("fcaSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelAdEntity(String variable) {
        this(FastChannelAdEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelAdEntity(Path<? extends FastChannelAdEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelAdEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelAdEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelAdEntity.class, metadata, inits);
    }

    public QFastChannelAdEntity(Class<? extends FastChannelAdEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adSet = inits.isInitialized("adSet") ? new com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity(forProperty("adSet")) : null;
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
    }

}

