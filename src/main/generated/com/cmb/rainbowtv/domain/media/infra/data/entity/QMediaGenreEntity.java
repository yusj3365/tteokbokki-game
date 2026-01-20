package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaGenreEntity is a Querydsl query type for MediaGenreEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaGenreEntity extends EntityPathBase<MediaGenreEntity> {

    private static final long serialVersionUID = 2105527490L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaGenreEntity mediaGenreEntity = new QMediaGenreEntity("mediaGenreEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaCategoryEntity mediaCategory;

    public final NumberPath<Long> mgIdx = createNumber("mgIdx", Long.class);

    public final StringPath mgName = createString("mgName");

    public final NumberPath<Integer> mgSeq = createNumber("mgSeq", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaGenreEntity(String variable) {
        this(MediaGenreEntity.class, forVariable(variable), INITS);
    }

    public QMediaGenreEntity(Path<? extends MediaGenreEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaGenreEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaGenreEntity(PathMetadata metadata, PathInits inits) {
        this(MediaGenreEntity.class, metadata, inits);
    }

    public QMediaGenreEntity(Class<? extends MediaGenreEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaCategory = inits.isInitialized("mediaCategory") ? new QMediaCategoryEntity(forProperty("mediaCategory")) : null;
    }

}

