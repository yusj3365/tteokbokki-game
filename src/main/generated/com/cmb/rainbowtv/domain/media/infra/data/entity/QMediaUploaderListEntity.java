package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaUploaderListEntity is a Querydsl query type for MediaUploaderListEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaUploaderListEntity extends EntityPathBase<MediaUploaderListEntity> {

    private static final long serialVersionUID = -1715333581L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaUploaderListEntity mediaUploaderListEntity = new QMediaUploaderListEntity("mediaUploaderListEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final NumberPath<Long> mulClickCnt = createNumber("mulClickCnt", Long.class);

    public final NumberPath<Long> mulIdx = createNumber("mulIdx", Long.class);

    public final NumberPath<Long> mulViewCnt = createNumber("mulViewCnt", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaUploaderListEntity(String variable) {
        this(MediaUploaderListEntity.class, forVariable(variable), INITS);
    }

    public QMediaUploaderListEntity(Path<? extends MediaUploaderListEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaUploaderListEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaUploaderListEntity(PathMetadata metadata, PathInits inits) {
        this(MediaUploaderListEntity.class, metadata, inits);
    }

    public QMediaUploaderListEntity(Class<? extends MediaUploaderListEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

