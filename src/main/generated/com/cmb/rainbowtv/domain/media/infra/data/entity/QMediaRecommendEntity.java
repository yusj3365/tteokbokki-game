package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaRecommendEntity is a Querydsl query type for MediaRecommendEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaRecommendEntity extends EntityPathBase<MediaRecommendEntity> {

    private static final long serialVersionUID = 1157080891L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaRecommendEntity mediaRecommendEntity = new QMediaRecommendEntity("mediaRecommendEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaCategoryEntity mediaCategory;

    public final NumberPath<Integer> mrDisplay = createNumber("mrDisplay", Integer.class);

    public final NumberPath<Long> mrIdx = createNumber("mrIdx", Long.class);

    public final StringPath mrName = createString("mrName");

    public final NumberPath<Long> mrSeq = createNumber("mrSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaRecommendEntity(String variable) {
        this(MediaRecommendEntity.class, forVariable(variable), INITS);
    }

    public QMediaRecommendEntity(Path<? extends MediaRecommendEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaRecommendEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaRecommendEntity(PathMetadata metadata, PathInits inits) {
        this(MediaRecommendEntity.class, metadata, inits);
    }

    public QMediaRecommendEntity(Class<? extends MediaRecommendEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaCategory = inits.isInitialized("mediaCategory") ? new QMediaCategoryEntity(forProperty("mediaCategory")) : null;
    }

}

