package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaByItemEntity is a Querydsl query type for MediaByItemEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaByItemEntity extends EntityPathBase<MediaByItemEntity> {

    private static final long serialVersionUID = -2055346543L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaByItemEntity mediaByItemEntity = new QMediaByItemEntity("mediaByItemEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity item;

    public final NumberPath<Long> mbiIdx = createNumber("mbiIdx", Long.class);

    public final QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaByItemEntity(String variable) {
        this(MediaByItemEntity.class, forVariable(variable), INITS);
    }

    public QMediaByItemEntity(Path<? extends MediaByItemEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaByItemEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaByItemEntity(PathMetadata metadata, PathInits inits) {
        this(MediaByItemEntity.class, metadata, inits);
    }

    public QMediaByItemEntity(Class<? extends MediaByItemEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity(forProperty("item")) : null;
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

