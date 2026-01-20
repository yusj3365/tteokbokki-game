package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaLikeEntity is a Querydsl query type for MediaLikeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaLikeEntity extends EntityPathBase<MediaLikeEntity> {

    private static final long serialVersionUID = 1366733150L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaLikeEntity mediaLikeEntity = new QMediaLikeEntity("mediaLikeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> mlIdx = createNumber("mlIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaLikeEntity(String variable) {
        this(MediaLikeEntity.class, forVariable(variable), INITS);
    }

    public QMediaLikeEntity(Path<? extends MediaLikeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaLikeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaLikeEntity(PathMetadata metadata, PathInits inits) {
        this(MediaLikeEntity.class, metadata, inits);
    }

    public QMediaLikeEntity(Class<? extends MediaLikeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

