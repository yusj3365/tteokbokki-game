package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberCreatorEntity is a Querydsl query type for MemberCreatorEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberCreatorEntity extends EntityPathBase<MemberCreatorEntity> {

    private static final long serialVersionUID = 756236717L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberCreatorEntity memberCreatorEntity = new QMemberCreatorEntity("memberCreatorEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbCompany = createString("mbCompany");

    public final NumberPath<Long> mcIdx = createNumber("mcIdx", Long.class);

    public final QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberCreatorEntity(String variable) {
        this(MemberCreatorEntity.class, forVariable(variable), INITS);
    }

    public QMemberCreatorEntity(Path<? extends MemberCreatorEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberCreatorEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberCreatorEntity(PathMetadata metadata, PathInits inits) {
        this(MemberCreatorEntity.class, metadata, inits);
    }

    public QMemberCreatorEntity(Class<? extends MemberCreatorEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

