package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaBySoEntity is a Querydsl query type for MediaBySoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaBySoEntity extends EntityPathBase<MediaBySoEntity> {

    private static final long serialVersionUID = 1589727706L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaBySoEntity mediaBySoEntity = new QMediaBySoEntity("mediaBySoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbsIdx = createNumber("mbsIdx", Long.class);

    public final QMediaEntity media;

    public final com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity soDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaBySoEntity(String variable) {
        this(MediaBySoEntity.class, forVariable(variable), INITS);
    }

    public QMediaBySoEntity(Path<? extends MediaBySoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaBySoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaBySoEntity(PathMetadata metadata, PathInits inits) {
        this(MediaBySoEntity.class, metadata, inits);
    }

    public QMediaBySoEntity(Class<? extends MediaBySoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.soDefine = inits.isInitialized("soDefine") ? new com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity(forProperty("soDefine"), inits.get("soDefine")) : null;
    }

}

