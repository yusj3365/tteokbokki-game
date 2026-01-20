package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberAdultPasswordEntity is a Querydsl query type for MemberAdultPasswordEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberAdultPasswordEntity extends EntityPathBase<MemberAdultPasswordEntity> {

    private static final long serialVersionUID = 766555830L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberAdultPasswordEntity memberAdultPasswordEntity = new QMemberAdultPasswordEntity("memberAdultPasswordEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mapIdx = createNumber("mapIdx", Long.class);

    public final StringPath mapPassword = createString("mapPassword");

    public final QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberAdultPasswordEntity(String variable) {
        this(MemberAdultPasswordEntity.class, forVariable(variable), INITS);
    }

    public QMemberAdultPasswordEntity(Path<? extends MemberAdultPasswordEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberAdultPasswordEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberAdultPasswordEntity(PathMetadata metadata, PathInits inits) {
        this(MemberAdultPasswordEntity.class, metadata, inits);
    }

    public QMemberAdultPasswordEntity(Class<? extends MemberAdultPasswordEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

