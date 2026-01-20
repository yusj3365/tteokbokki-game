package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaSeriesContentEntity is a Querydsl query type for MediaSeriesContentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaSeriesContentEntity extends EntityPathBase<MediaSeriesContentEntity> {

    private static final long serialVersionUID = 887674369L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaSeriesContentEntity mediaSeriesContentEntity = new QMediaSeriesContentEntity("mediaSeriesContentEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mscEpisode = createNumber("mscEpisode", Long.class);

    public final NumberPath<Long> mscIdx = createNumber("mscIdx", Long.class);

    public final QMediaEntity seriesContent;

    public final QMediaEntity seriesTitle;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaSeriesContentEntity(String variable) {
        this(MediaSeriesContentEntity.class, forVariable(variable), INITS);
    }

    public QMediaSeriesContentEntity(Path<? extends MediaSeriesContentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaSeriesContentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaSeriesContentEntity(PathMetadata metadata, PathInits inits) {
        this(MediaSeriesContentEntity.class, metadata, inits);
    }

    public QMediaSeriesContentEntity(Class<? extends MediaSeriesContentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.seriesContent = inits.isInitialized("seriesContent") ? new QMediaEntity(forProperty("seriesContent"), inits.get("seriesContent")) : null;
        this.seriesTitle = inits.isInitialized("seriesTitle") ? new QMediaEntity(forProperty("seriesTitle"), inits.get("seriesTitle")) : null;
    }

}

