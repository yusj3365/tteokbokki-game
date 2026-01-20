package com.cmb.rainbowtv.domain.auth.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberAuthenticationEntity is a Querydsl query type for MemberAuthenticationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberAuthenticationEntity extends EntityPathBase<MemberAuthenticationEntity> {

    private static final long serialVersionUID = 1728671663L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberAuthenticationEntity memberAuthenticationEntity = new QMemberAuthenticationEntity("memberAuthenticationEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mauBirth = createString("mauBirth");

    public final StringPath mauCode = createString("mauCode");

    public final NumberPath<Long> mauIdx = createNumber("mauIdx", Long.class);

    public final StringPath mauName = createString("mauName");

    public final StringPath mauReqno = createString("mauReqno");

    public final DateTimePath<java.time.LocalDateTime> mauTime = createDateTime("mauTime", java.time.LocalDateTime.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberAuthenticationEntity(String variable) {
        this(MemberAuthenticationEntity.class, forVariable(variable), INITS);
    }

    public QMemberAuthenticationEntity(Path<? extends MemberAuthenticationEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberAuthenticationEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberAuthenticationEntity(PathMetadata metadata, PathInits inits) {
        this(MemberAuthenticationEntity.class, metadata, inits);
    }

    public QMemberAuthenticationEntity(Class<? extends MemberAuthenticationEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

