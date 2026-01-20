package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaRecommendListEntity is a Querydsl query type for MediaRecommendListEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaRecommendListEntity extends EntityPathBase<MediaRecommendListEntity> {

    private static final long serialVersionUID = 2082630009L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaRecommendListEntity mediaRecommendListEntity = new QMediaRecommendListEntity("mediaRecommendListEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final QMediaRecommendEntity mediaRecommend;

    public final NumberPath<Long> mrlIdx = createNumber("mrlIdx", Long.class);

    public final NumberPath<Long> mrlSeq = createNumber("mrlSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaRecommendListEntity(String variable) {
        this(MediaRecommendListEntity.class, forVariable(variable), INITS);
    }

    public QMediaRecommendListEntity(Path<? extends MediaRecommendListEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaRecommendListEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaRecommendListEntity(PathMetadata metadata, PathInits inits) {
        this(MediaRecommendListEntity.class, metadata, inits);
    }

    public QMediaRecommendListEntity(Class<? extends MediaRecommendListEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.mediaRecommend = inits.isInitialized("mediaRecommend") ? new QMediaRecommendEntity(forProperty("mediaRecommend"), inits.get("mediaRecommend")) : null;
    }

}

