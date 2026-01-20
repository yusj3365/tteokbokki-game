package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaMetadataEntity is a Querydsl query type for MediaMetadataEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaMetadataEntity extends EntityPathBase<MediaMetadataEntity> {

    private static final long serialVersionUID = -1727969034L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaMetadataEntity mediaMetadataEntity = new QMediaMetadataEntity("mediaMetadataEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final NumberPath<Long> mmIdx = createNumber("mmIdx", Long.class);

    public final StringPath mmKeywords = createString("mmKeywords");

    public final StringPath mmProducer = createString("mmProducer");

    public final StringPath mmSynopsis = createString("mmSynopsis");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaMetadataEntity(String variable) {
        this(MediaMetadataEntity.class, forVariable(variable), INITS);
    }

    public QMediaMetadataEntity(Path<? extends MediaMetadataEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaMetadataEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaMetadataEntity(PathMetadata metadata, PathInits inits) {
        this(MediaMetadataEntity.class, metadata, inits);
    }

    public QMediaMetadataEntity(Class<? extends MediaMetadataEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

