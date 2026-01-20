package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaClinicEntity is a Querydsl query type for MediaClinicEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaClinicEntity extends EntityPathBase<MediaClinicEntity> {

    private static final long serialVersionUID = -1683200785L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaClinicEntity mediaClinicEntity = new QMediaClinicEntity("mediaClinicEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mclnHp = createString("mclnHp");

    public final NumberPath<Long> mclnIdx = createNumber("mclnIdx", Long.class);

    public final StringPath mclnName = createString("mclnName");

    public final QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaClinicEntity(String variable) {
        this(MediaClinicEntity.class, forVariable(variable), INITS);
    }

    public QMediaClinicEntity(Path<? extends MediaClinicEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaClinicEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaClinicEntity(PathMetadata metadata, PathInits inits) {
        this(MediaClinicEntity.class, metadata, inits);
    }

    public QMediaClinicEntity(Class<? extends MediaClinicEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

