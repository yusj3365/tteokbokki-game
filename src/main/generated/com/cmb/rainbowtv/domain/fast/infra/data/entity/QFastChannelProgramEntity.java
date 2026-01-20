package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelProgramEntity is a Querydsl query type for FastChannelProgramEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelProgramEntity extends EntityPathBase<FastChannelProgramEntity> {

    private static final long serialVersionUID = -418025850L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelProgramEntity fastChannelProgramEntity = new QFastChannelProgramEntity("fastChannelProgramEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final QFastChannelAdEntity fastChannelAd;

    public final NumberPath<Long> fcpIdx = createNumber("fcpIdx", Long.class);

    public final NumberPath<Long> fcpKey = createNumber("fcpKey", Long.class);

    public final StringPath fcpNext = createString("fcpNext");

    public final NumberPath<Long> fcpSeq = createNumber("fcpSeq", Long.class);

    public final NumberPath<Integer> fcpType = createNumber("fcpType", Integer.class);

    public final StringPath fcpUuid = createString("fcpUuid");

    public final NumberPath<Long> fmIdx = createNumber("fmIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelProgramEntity(String variable) {
        this(FastChannelProgramEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelProgramEntity(Path<? extends FastChannelProgramEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelProgramEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelProgramEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelProgramEntity.class, metadata, inits);
    }

    public QFastChannelProgramEntity(Class<? extends FastChannelProgramEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
        this.fastChannelAd = inits.isInitialized("fastChannelAd") ? new QFastChannelAdEntity(forProperty("fastChannelAd"), inits.get("fastChannelAd")) : null;
    }

}

