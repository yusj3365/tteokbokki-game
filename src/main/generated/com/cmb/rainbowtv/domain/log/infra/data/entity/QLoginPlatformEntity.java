package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLoginPlatformEntity is a Querydsl query type for LoginPlatformEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLoginPlatformEntity extends EntityPathBase<LoginPlatformEntity> {

    private static final long serialVersionUID = 2054629663L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLoginPlatformEntity loginPlatformEntity = new QLoginPlatformEntity("loginPlatformEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath arLatestVersion = createString("arLatestVersion");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath lpDeviceCode = createString("lpDeviceCode");

    public final NumberPath<Long> lpIdx = createNumber("lpIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.log.model.enums.LogTypeEnum> lpType = createEnum("lpType", com.cmb.rainbowtv.domain.log.model.enums.LogTypeEnum.class);

    public final StringPath lpVersion = createString("lpVersion");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QLoginPlatformEntity(String variable) {
        this(LoginPlatformEntity.class, forVariable(variable), INITS);
    }

    public QLoginPlatformEntity(Path<? extends LoginPlatformEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLoginPlatformEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLoginPlatformEntity(PathMetadata metadata, PathInits inits) {
        this(LoginPlatformEntity.class, metadata, inits);
    }

    public QLoginPlatformEntity(Class<? extends LoginPlatformEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

