package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaByDeleteReasonEntity is a Querydsl query type for MediaByDeleteReasonEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaByDeleteReasonEntity extends EntityPathBase<MediaByDeleteReasonEntity> {

    private static final long serialVersionUID = 1556470605L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaByDeleteReasonEntity mediaByDeleteReasonEntity = new QMediaByDeleteReasonEntity("mediaByDeleteReasonEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbdrIdx = createNumber("mbdrIdx", Long.class);

    public final QMediaEntity media;

    public final QMediaDeleteReasonDefineEntity mediaDeleteReasonDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaByDeleteReasonEntity(String variable) {
        this(MediaByDeleteReasonEntity.class, forVariable(variable), INITS);
    }

    public QMediaByDeleteReasonEntity(Path<? extends MediaByDeleteReasonEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaByDeleteReasonEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaByDeleteReasonEntity(PathMetadata metadata, PathInits inits) {
        this(MediaByDeleteReasonEntity.class, metadata, inits);
    }

    public QMediaByDeleteReasonEntity(Class<? extends MediaByDeleteReasonEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.mediaDeleteReasonDefine = inits.isInitialized("mediaDeleteReasonDefine") ? new QMediaDeleteReasonDefineEntity(forProperty("mediaDeleteReasonDefine")) : null;
    }

}

