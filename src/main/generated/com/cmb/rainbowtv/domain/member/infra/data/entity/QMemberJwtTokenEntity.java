package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberJwtTokenEntity is a Querydsl query type for MemberJwtTokenEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberJwtTokenEntity extends EntityPathBase<MemberJwtTokenEntity> {

    private static final long serialVersionUID = 73994551L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberJwtTokenEntity memberJwtTokenEntity = new QMemberJwtTokenEntity("memberJwtTokenEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberEntity member;

    public final NumberPath<Long> mjtIdx = createNumber("mjtIdx", Long.class);

    public final StringPath mjtJwtToken = createString("mjtJwtToken");

    public final EnumPath<com.cmb.rainbowtv.domain.member.model.enums.MjtTypeEnum> mjtTypeEnum = createEnum("mjtTypeEnum", com.cmb.rainbowtv.domain.member.model.enums.MjtTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberJwtTokenEntity(String variable) {
        this(MemberJwtTokenEntity.class, forVariable(variable), INITS);
    }

    public QMemberJwtTokenEntity(Path<? extends MemberJwtTokenEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberJwtTokenEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberJwtTokenEntity(PathMetadata metadata, PathInits inits) {
        this(MemberJwtTokenEntity.class, metadata, inits);
    }

    public QMemberJwtTokenEntity(Class<? extends MemberJwtTokenEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

