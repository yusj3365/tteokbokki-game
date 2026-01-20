package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberTvLogEntity is a Querydsl query type for MemberTvLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberTvLogEntity extends EntityPathBase<MemberTvLogEntity> {

    private static final long serialVersionUID = -1714481141L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberTvLogEntity memberTvLogEntity = new QMemberTvLogEntity("memberTvLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbId = createString("mbId");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> mtlIdx = createNumber("mtlIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.member.model.enums.MtlTypeEnum> mtlTypeEnum = createEnum("mtlTypeEnum", com.cmb.rainbowtv.domain.member.model.enums.MtlTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberTvLogEntity(String variable) {
        this(MemberTvLogEntity.class, forVariable(variable), INITS);
    }

    public QMemberTvLogEntity(Path<? extends MemberTvLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberTvLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberTvLogEntity(PathMetadata metadata, PathInits inits) {
        this(MemberTvLogEntity.class, metadata, inits);
    }

    public QMemberTvLogEntity(Class<? extends MemberTvLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

