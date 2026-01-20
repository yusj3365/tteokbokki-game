package com.cmb.rainbowtv.domain.content.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContentRecommendEntity is a Querydsl query type for ContentRecommendEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContentRecommendEntity extends EntityPathBase<ContentRecommendEntity> {

    private static final long serialVersionUID = -1742066479L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContentRecommendEntity contentRecommendEntity = new QContentRecommendEntity("contentRecommendEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QContentRecommendMenuEntity contentRecommendMenu;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> crIdx = createNumber("crIdx", Long.class);

    public final NumberPath<Long> crSeq = createNumber("crSeq", Long.class);

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QContentRecommendEntity(String variable) {
        this(ContentRecommendEntity.class, forVariable(variable), INITS);
    }

    public QContentRecommendEntity(Path<? extends ContentRecommendEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QContentRecommendEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QContentRecommendEntity(PathMetadata metadata, PathInits inits) {
        this(ContentRecommendEntity.class, metadata, inits);
    }

    public QContentRecommendEntity(Class<? extends ContentRecommendEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.contentRecommendMenu = inits.isInitialized("contentRecommendMenu") ? new QContentRecommendMenuEntity(forProperty("contentRecommendMenu"), inits.get("contentRecommendMenu")) : null;
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

