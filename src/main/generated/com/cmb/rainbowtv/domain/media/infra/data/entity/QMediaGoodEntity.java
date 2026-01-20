package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaGoodEntity is a Querydsl query type for MediaGoodEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaGoodEntity extends EntityPathBase<MediaGoodEntity> {

    private static final long serialVersionUID = 1883278852L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaGoodEntity mediaGoodEntity = new QMediaGoodEntity("mediaGoodEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbNo = createString("mbNo");

    public final QMediaEntity media;

    public final NumberPath<Long> mgIdx = createNumber("mgIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaGoodEntity(String variable) {
        this(MediaGoodEntity.class, forVariable(variable), INITS);
    }

    public QMediaGoodEntity(Path<? extends MediaGoodEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaGoodEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaGoodEntity(PathMetadata metadata, PathInits inits) {
        this(MediaGoodEntity.class, metadata, inits);
    }

    public QMediaGoodEntity(Class<? extends MediaGoodEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

