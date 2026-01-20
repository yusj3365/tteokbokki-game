package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaPopularEntity is a Querydsl query type for MediaPopularEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaPopularEntity extends EntityPathBase<MediaPopularEntity> {

    private static final long serialVersionUID = -1055101288L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaPopularEntity mediaPopularEntity = new QMediaPopularEntity("mediaPopularEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final NumberPath<Long> mpIdx = createNumber("mpIdx", Long.class);

    public final NumberPath<Long> mpViewCnt = createNumber("mpViewCnt", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaPopularEntity(String variable) {
        this(MediaPopularEntity.class, forVariable(variable), INITS);
    }

    public QMediaPopularEntity(Path<? extends MediaPopularEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaPopularEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaPopularEntity(PathMetadata metadata, PathInits inits) {
        this(MediaPopularEntity.class, metadata, inits);
    }

    public QMediaPopularEntity(Class<? extends MediaPopularEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

