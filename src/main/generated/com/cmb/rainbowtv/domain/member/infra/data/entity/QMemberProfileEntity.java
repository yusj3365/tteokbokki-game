package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberProfileEntity is a Querydsl query type for MemberProfileEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberProfileEntity extends EntityPathBase<MemberProfileEntity> {

    private static final long serialVersionUID = -1714194070L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberProfileEntity memberProfileEntity = new QMemberProfileEntity("memberProfileEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbProfile = createNumber("mbProfile", Long.class);

    public final QMemberEntity member;

    public final NumberPath<Long> mpIdx = createNumber("mpIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberProfileEntity(String variable) {
        this(MemberProfileEntity.class, forVariable(variable), INITS);
    }

    public QMemberProfileEntity(Path<? extends MemberProfileEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberProfileEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberProfileEntity(PathMetadata metadata, PathInits inits) {
        this(MemberProfileEntity.class, metadata, inits);
    }

    public QMemberProfileEntity(Class<? extends MemberProfileEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

