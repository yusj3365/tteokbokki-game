package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastMediaDeleteEntity is a Querydsl query type for FastMediaDeleteEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastMediaDeleteEntity extends EntityPathBase<FastMediaDeleteEntity> {

    private static final long serialVersionUID = -114521232L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastMediaDeleteEntity fastMediaDeleteEntity = new QFastMediaDeleteEntity("fastMediaDeleteEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastMediaEntity fastMedia;

    public final NumberPath<Long> mbdIdx = createNumber("mbdIdx", Long.class);

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaDeleteReasonDefineEntity mediaDeleteReasonDefine;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastMediaDeleteEntity(String variable) {
        this(FastMediaDeleteEntity.class, forVariable(variable), INITS);
    }

    public QFastMediaDeleteEntity(Path<? extends FastMediaDeleteEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastMediaDeleteEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastMediaDeleteEntity(PathMetadata metadata, PathInits inits) {
        this(FastMediaDeleteEntity.class, metadata, inits);
    }

    public QFastMediaDeleteEntity(Class<? extends FastMediaDeleteEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastMedia = inits.isInitialized("fastMedia") ? new QFastMediaEntity(forProperty("fastMedia"), inits.get("fastMedia")) : null;
        this.mediaDeleteReasonDefine = inits.isInitialized("mediaDeleteReasonDefine") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaDeleteReasonDefineEntity(forProperty("mediaDeleteReasonDefine")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

