package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaVodEntity is a Querydsl query type for MediaVodEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaVodEntity extends EntityPathBase<MediaVodEntity> {

    private static final long serialVersionUID = -948034294L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaVodEntity mediaVodEntity = new QMediaVodEntity("mediaVodEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MvAgeLimitEnum> mvAgeLimit = createEnum("mvAgeLimit", com.cmb.rainbowtv.domain.media.model.enums.MvAgeLimitEnum.class);

    public final ComparablePath<java.time.Year> mvBroadcastDate = createComparable("mvBroadcastDate", java.time.Year.class);

    public final NumberPath<Long> mvIdx = createNumber("mvIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaVodEntity(String variable) {
        this(MediaVodEntity.class, forVariable(variable), INITS);
    }

    public QMediaVodEntity(Path<? extends MediaVodEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaVodEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaVodEntity(PathMetadata metadata, PathInits inits) {
        this(MediaVodEntity.class, metadata, inits);
    }

    public QMediaVodEntity(Class<? extends MediaVodEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

