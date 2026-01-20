package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaCommentEntity is a Querydsl query type for MediaCommentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaCommentEntity extends EntityPathBase<MediaCommentEntity> {

    private static final long serialVersionUID = -438817378L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaCommentEntity mediaCommentEntity = new QMediaCommentEntity("mediaCommentEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mcoComment = createString("mcoComment");

    public final NumberPath<Long> mcoIdx = createNumber("mcoIdx", Long.class);

    public final NumberPath<Integer> mcoTv = createNumber("mcoTv", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.McoTypeEnum> mcoType = createEnum("mcoType", com.cmb.rainbowtv.domain.media.model.enums.McoTypeEnum.class);

    public final QMediaEntity media;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaCommentEntity(String variable) {
        this(MediaCommentEntity.class, forVariable(variable), INITS);
    }

    public QMediaCommentEntity(Path<? extends MediaCommentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaCommentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaCommentEntity(PathMetadata metadata, PathInits inits) {
        this(MediaCommentEntity.class, metadata, inits);
    }

    public QMediaCommentEntity(Class<? extends MediaCommentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

