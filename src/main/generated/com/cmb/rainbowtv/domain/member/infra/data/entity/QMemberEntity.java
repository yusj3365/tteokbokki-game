package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberEntity is a Querydsl query type for MemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberEntity extends EntityPathBase<MemberEntity> {

    private static final long serialVersionUID = -2009017563L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberEntity memberEntity = new QMemberEntity("memberEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final com.cmb.rainbowtv.global.define.group.infra.data.entity.QGroupEntity group;

    public final NumberPath<Long> mbAdminNo = createNumber("mbAdminNo", Long.class);

    public final NumberPath<Integer> mbAnd = createNumber("mbAnd", Integer.class);

    public final NumberPath<Integer> mbCategory = createNumber("mbCategory", Integer.class);

    public final DatePath<java.time.LocalDate> mbCertificationDate = createDate("mbCertificationDate", java.time.LocalDate.class);

    public final NumberPath<Integer> mbEnd = createNumber("mbEnd", Integer.class);

    public final StringPath mbHp = createString("mbHp");

    public final StringPath mbId = createString("mbId");

    public final StringPath mbIp = createString("mbIp");

    public final NumberPath<Integer> mbIsUse = createNumber("mbIsUse", Integer.class);

    public final NumberPath<Integer> mbIsVerify = createNumber("mbIsVerify", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> mbJoinDate = createDateTime("mbJoinDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> mbLastLogin = createDateTime("mbLastLogin", java.time.LocalDateTime.class);

    public final StringPath mbName = createString("mbName");

    public final NumberPath<Long> mbNo = createNumber("mbNo", Long.class);

    public final StringPath mbPassword = createString("mbPassword");

    public final DateTimePath<java.time.LocalDateTime> mbPasswordUpdatedDate = createDateTime("mbPasswordUpdatedDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> mbSmart = createNumber("mbSmart", Integer.class);

    public final NumberPath<Integer> mbSmartStatus = createNumber("mbSmartStatus", Integer.class);

    public final NumberPath<Integer> mbStatus = createNumber("mbStatus", Integer.class);

    public final StringPath mbTelephone = createString("mbTelephone");

    public final StringPath mbUuid = createString("mbUuid");

    public final QMemberSuspensionCategoryEntity memberSuspensionCategory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberEntity(String variable) {
        this(MemberEntity.class, forVariable(variable), INITS);
    }

    public QMemberEntity(Path<? extends MemberEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberEntity(PathMetadata metadata, PathInits inits) {
        this(MemberEntity.class, metadata, inits);
    }

    public QMemberEntity(Class<? extends MemberEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.group = inits.isInitialized("group") ? new com.cmb.rainbowtv.global.define.group.infra.data.entity.QGroupEntity(forProperty("group")) : null;
        this.memberSuspensionCategory = inits.isInitialized("memberSuspensionCategory") ? new QMemberSuspensionCategoryEntity(forProperty("memberSuspensionCategory")) : null;
    }

}

