package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaListDailyEntity is a Querydsl query type for MediaListDailyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaListDailyEntity extends EntityPathBase<MediaListDailyEntity> {

    private static final long serialVersionUID = 1276330842L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaListDailyEntity mediaListDailyEntity = new QMediaListDailyEntity("mediaListDailyEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<java.math.BigDecimal> avgTotalViews = createNumber("avgTotalViews", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> avgUniqueViews = createNumber("avgUniqueViews", java.math.BigDecimal.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final NumberPath<Long> mldIdx = createNumber("mldIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaListDailyEntity(String variable) {
        this(MediaListDailyEntity.class, forVariable(variable), INITS);
    }

    public QMediaListDailyEntity(Path<? extends MediaListDailyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaListDailyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaListDailyEntity(PathMetadata metadata, PathInits inits) {
        this(MediaListDailyEntity.class, metadata, inits);
    }

    public QMediaListDailyEntity(Class<? extends MediaListDailyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

