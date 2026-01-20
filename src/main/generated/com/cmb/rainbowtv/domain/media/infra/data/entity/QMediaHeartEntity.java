package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaHeartEntity is a Querydsl query type for MediaHeartEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaHeartEntity extends EntityPathBase<MediaHeartEntity> {

    private static final long serialVersionUID = -1536666299L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaHeartEntity mediaHeartEntity = new QMediaHeartEntity("mediaHeartEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> mhIdx = createNumber("mhIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.HeartStatusEnum> mhStatus = createEnum("mhStatus", com.cmb.rainbowtv.domain.media.model.enums.HeartStatusEnum.class);

    public final NumberPath<Long> targetId = createNumber("targetId", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.HeartTargetTypeEnum> targetType = createEnum("targetType", com.cmb.rainbowtv.domain.media.model.enums.HeartTargetTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaHeartEntity(String variable) {
        this(MediaHeartEntity.class, forVariable(variable), INITS);
    }

    public QMediaHeartEntity(Path<? extends MediaHeartEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaHeartEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaHeartEntity(PathMetadata metadata, PathInits inits) {
        this(MediaHeartEntity.class, metadata, inits);
    }

    public QMediaHeartEntity(Class<? extends MediaHeartEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

