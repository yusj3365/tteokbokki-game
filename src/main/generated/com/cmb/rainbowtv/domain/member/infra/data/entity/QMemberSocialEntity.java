package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberSocialEntity is a Querydsl query type for MemberSocialEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberSocialEntity extends EntityPathBase<MemberSocialEntity> {

    private static final long serialVersionUID = -1632381070L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberSocialEntity memberSocialEntity = new QMemberSocialEntity("memberSocialEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath accessToken = createString("accessToken");

    public final StringPath appleAosRefreshToken = createString("appleAosRefreshToken");

    public final StringPath appleIosRefreshToken = createString("appleIosRefreshToken");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberEntity member;

    public final NumberPath<Long> msIdx = createNumber("msIdx", Long.class);

    public final StringPath refreshToken = createString("refreshToken");

    public final StringPath socialId = createString("socialId");

    public final StringPath socialKey = createString("socialKey");

    public final StringPath socialType = createString("socialType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberSocialEntity(String variable) {
        this(MemberSocialEntity.class, forVariable(variable), INITS);
    }

    public QMemberSocialEntity(Path<? extends MemberSocialEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberSocialEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberSocialEntity(PathMetadata metadata, PathInits inits) {
        this(MemberSocialEntity.class, metadata, inits);
    }

    public QMemberSocialEntity(Class<? extends MemberSocialEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

