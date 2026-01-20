package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaKeywordEntity is a Querydsl query type for MediaKeywordEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaKeywordEntity extends EntityPathBase<MediaKeywordEntity> {

    private static final long serialVersionUID = -1369174616L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaKeywordEntity mediaKeywordEntity = new QMediaKeywordEntity("mediaKeywordEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaMetadataEntity mediaMetadata;

    public final NumberPath<Long> mkIdx = createNumber("mkIdx", Long.class);

    public final StringPath mkKeyword = createString("mkKeyword");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaKeywordEntity(String variable) {
        this(MediaKeywordEntity.class, forVariable(variable), INITS);
    }

    public QMediaKeywordEntity(Path<? extends MediaKeywordEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaKeywordEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaKeywordEntity(PathMetadata metadata, PathInits inits) {
        this(MediaKeywordEntity.class, metadata, inits);
    }

    public QMediaKeywordEntity(Class<? extends MediaKeywordEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaMetadata = inits.isInitialized("mediaMetadata") ? new QMediaMetadataEntity(forProperty("mediaMetadata"), inits.get("mediaMetadata")) : null;
    }

}

