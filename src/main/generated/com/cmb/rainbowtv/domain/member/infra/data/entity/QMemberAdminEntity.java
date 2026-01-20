package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberAdminEntity is a Querydsl query type for MemberAdminEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberAdminEntity extends EntityPathBase<MemberAdminEntity> {

    private static final long serialVersionUID = 1900094992L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberAdminEntity memberAdminEntity = new QMemberAdminEntity("memberAdminEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> madCmsAccess = createNumber("madCmsAccess", Integer.class);

    public final NumberPath<Integer> madCrmAccess = createNumber("madCrmAccess", Integer.class);

    public final NumberPath<Long> madIdx = createNumber("madIdx", Long.class);

    public final NumberPath<Integer> madLongTermStatus = createNumber("madLongTermStatus", Integer.class);

    public final StringPath mbCompany = createString("mbCompany");

    public final StringPath mbEmployeeNumber = createString("mbEmployeeNumber");

    public final QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberAdminEntity(String variable) {
        this(MemberAdminEntity.class, forVariable(variable), INITS);
    }

    public QMemberAdminEntity(Path<? extends MemberAdminEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberAdminEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberAdminEntity(PathMetadata metadata, PathInits inits) {
        this(MemberAdminEntity.class, metadata, inits);
    }

    public QMemberAdminEntity(Class<? extends MemberAdminEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

