package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLoginLogEntity is a Querydsl query type for LoginLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLoginLogEntity extends EntityPathBase<LoginLogEntity> {

    private static final long serialVersionUID = 104705982L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLoginLogEntity loginLogEntity = new QLoginLogEntity("loginLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath clientIp = createString("clientIp");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DatePath<java.time.LocalDate> llDate = createDate("llDate", java.time.LocalDate.class);

    public final NumberPath<Long> llIdx = createNumber("llIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.log.model.enums.LlTypeEnum> llType = createEnum("llType", com.cmb.rainbowtv.domain.log.model.enums.LlTypeEnum.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QLoginLogEntity(String variable) {
        this(LoginLogEntity.class, forVariable(variable), INITS);
    }

    public QLoginLogEntity(Path<? extends LoginLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLoginLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLoginLogEntity(PathMetadata metadata, PathInits inits) {
        this(LoginLogEntity.class, metadata, inits);
    }

    public QLoginLogEntity(Class<? extends LoginLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

