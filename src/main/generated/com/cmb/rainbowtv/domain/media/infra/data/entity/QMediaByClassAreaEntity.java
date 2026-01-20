package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaByClassAreaEntity is a Querydsl query type for MediaByClassAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaByClassAreaEntity extends EntityPathBase<MediaByClassAreaEntity> {

    private static final long serialVersionUID = -447792755L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaByClassAreaEntity mediaByClassAreaEntity = new QMediaByClassAreaEntity("mediaByClassAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.classarea.infra.data.entity.QClassAreaEntity classArea;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbcaIdx = createNumber("mbcaIdx", Long.class);

    public final QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaByClassAreaEntity(String variable) {
        this(MediaByClassAreaEntity.class, forVariable(variable), INITS);
    }

    public QMediaByClassAreaEntity(Path<? extends MediaByClassAreaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaByClassAreaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaByClassAreaEntity(PathMetadata metadata, PathInits inits) {
        this(MediaByClassAreaEntity.class, metadata, inits);
    }

    public QMediaByClassAreaEntity(Class<? extends MediaByClassAreaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.classArea = inits.isInitialized("classArea") ? new com.cmb.rainbowtv.domain.classarea.infra.data.entity.QClassAreaEntity(forProperty("classArea")) : null;
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

