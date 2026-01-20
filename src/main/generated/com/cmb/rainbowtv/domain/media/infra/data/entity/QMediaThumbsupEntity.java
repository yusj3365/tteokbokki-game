package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaThumbsupEntity is a Querydsl query type for MediaThumbsupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaThumbsupEntity extends EntityPathBase<MediaThumbsupEntity> {

    private static final long serialVersionUID = -1717536833L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaThumbsupEntity mediaThumbsupEntity = new QMediaThumbsupEntity("mediaThumbsupEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity mbNo;

    public final QMediaEntity media;

    public final NumberPath<Long> mtIdx = createNumber("mtIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaThumbsupEntity(String variable) {
        this(MediaThumbsupEntity.class, forVariable(variable), INITS);
    }

    public QMediaThumbsupEntity(Path<? extends MediaThumbsupEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaThumbsupEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaThumbsupEntity(PathMetadata metadata, PathInits inits) {
        this(MediaThumbsupEntity.class, metadata, inits);
    }

    public QMediaThumbsupEntity(Class<? extends MediaThumbsupEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mbNo = inits.isInitialized("mbNo") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("mbNo"), inits.get("mbNo")) : null;
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

