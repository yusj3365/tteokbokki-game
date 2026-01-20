package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberTokenEntity is a Querydsl query type for MemberTokenEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberTokenEntity extends EntityPathBase<MemberTokenEntity> {

    private static final long serialVersionUID = 894743866L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberTokenEntity memberTokenEntity = new QMemberTokenEntity("memberTokenEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberEntity member;

    public final StringPath mtDeviceToken = createString("mtDeviceToken");

    public final NumberPath<Long> mtIdx = createNumber("mtIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberTokenEntity(String variable) {
        this(MemberTokenEntity.class, forVariable(variable), INITS);
    }

    public QMemberTokenEntity(Path<? extends MemberTokenEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberTokenEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberTokenEntity(PathMetadata metadata, PathInits inits) {
        this(MemberTokenEntity.class, metadata, inits);
    }

    public QMemberTokenEntity(Class<? extends MemberTokenEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

