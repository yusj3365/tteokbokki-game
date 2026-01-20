package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaClassEntity is a Querydsl query type for MediaClassEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaClassEntity extends EntityPathBase<MediaClassEntity> {

    private static final long serialVersionUID = -1662131977L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaClassEntity mediaClassEntity = new QMediaClassEntity("mediaClassEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mclsHp = createString("mclsHp");

    public final NumberPath<Long> mclsIdx = createNumber("mclsIdx", Long.class);

    public final StringPath mclsName = createString("mclsName");

    public final QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaClassEntity(String variable) {
        this(MediaClassEntity.class, forVariable(variable), INITS);
    }

    public QMediaClassEntity(Path<? extends MediaClassEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaClassEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaClassEntity(PathMetadata metadata, PathInits inits) {
        this(MediaClassEntity.class, metadata, inits);
    }

    public QMediaClassEntity(Class<? extends MediaClassEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

