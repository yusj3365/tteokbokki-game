package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaByAreaEntity is a Querydsl query type for MediaByAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaByAreaEntity extends EntityPathBase<MediaByAreaEntity> {

    private static final long serialVersionUID = 1071560843L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaByAreaEntity mediaByAreaEntity = new QMediaByAreaEntity("mediaByAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbaIdx = createNumber("mbaIdx", Long.class);

    public final NumberPath<Integer> mbaSi = createNumber("mbaSi", Integer.class);

    public final QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaByAreaEntity(String variable) {
        this(MediaByAreaEntity.class, forVariable(variable), INITS);
    }

    public QMediaByAreaEntity(Path<? extends MediaByAreaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaByAreaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaByAreaEntity(PathMetadata metadata, PathInits inits) {
        this(MediaByAreaEntity.class, metadata, inits);
    }

    public QMediaByAreaEntity(Class<? extends MediaByAreaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

