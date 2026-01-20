package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaClickLogEntity is a Querydsl query type for MediaClickLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaClickLogEntity extends EntityPathBase<MediaClickLogEntity> {

    private static final long serialVersionUID = -612867933L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaClickLogEntity mediaClickLogEntity = new QMediaClickLogEntity("mediaClickLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> mclAi = createNumber("mclAi", Integer.class);

    public final NumberPath<Long> mclIdx = createNumber("mclIdx", Long.class);

    public final StringPath mclPagePath = createString("mclPagePath");

    public final StringPath mclPlatform = createString("mclPlatform");

    public final QMediaEntity media;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaClickLogEntity(String variable) {
        this(MediaClickLogEntity.class, forVariable(variable), INITS);
    }

    public QMediaClickLogEntity(Path<? extends MediaClickLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaClickLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaClickLogEntity(PathMetadata metadata, PathInits inits) {
        this(MediaClickLogEntity.class, metadata, inits);
    }

    public QMediaClickLogEntity(Class<? extends MediaClickLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

