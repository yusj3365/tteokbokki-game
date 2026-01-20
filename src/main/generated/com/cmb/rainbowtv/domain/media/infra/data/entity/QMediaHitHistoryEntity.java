package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaHitHistoryEntity is a Querydsl query type for MediaHitHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaHitHistoryEntity extends EntityPathBase<MediaHitHistoryEntity> {

    private static final long serialVersionUID = 91382984L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaHitHistoryEntity mediaHitHistoryEntity = new QMediaHitHistoryEntity("mediaHitHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.LpTypeInHitHistoryEnum> lpTypeInHitHistory = createEnum("lpTypeInHitHistory", com.cmb.rainbowtv.domain.media.model.enums.LpTypeInHitHistoryEnum.class);

    public final QMediaEntity media;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> mhhIdx = createNumber("mhhIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaHitHistoryEntity(String variable) {
        this(MediaHitHistoryEntity.class, forVariable(variable), INITS);
    }

    public QMediaHitHistoryEntity(Path<? extends MediaHitHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaHitHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaHitHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(MediaHitHistoryEntity.class, metadata, inits);
    }

    public QMediaHitHistoryEntity(Class<? extends MediaHitHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

