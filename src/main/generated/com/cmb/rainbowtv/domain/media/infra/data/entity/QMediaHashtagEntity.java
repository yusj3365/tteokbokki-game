package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaHashtagEntity is a Querydsl query type for MediaHashtagEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaHashtagEntity extends EntityPathBase<MediaHashtagEntity> {

    private static final long serialVersionUID = -1803586229L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaHashtagEntity mediaHashtagEntity = new QMediaHashtagEntity("mediaHashtagEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.hashtag.infra.data.entity.QHashtagEntity hashtag;

    public final QMediaEntity media;

    public final NumberPath<Long> mhtIdx = createNumber("mhtIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaHashtagEntity(String variable) {
        this(MediaHashtagEntity.class, forVariable(variable), INITS);
    }

    public QMediaHashtagEntity(Path<? extends MediaHashtagEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaHashtagEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaHashtagEntity(PathMetadata metadata, PathInits inits) {
        this(MediaHashtagEntity.class, metadata, inits);
    }

    public QMediaHashtagEntity(Class<? extends MediaHashtagEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hashtag = inits.isInitialized("hashtag") ? new com.cmb.rainbowtv.domain.hashtag.infra.data.entity.QHashtagEntity(forProperty("hashtag")) : null;
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

