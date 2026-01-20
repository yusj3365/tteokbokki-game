package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberDormancyEntity is a Querydsl query type for MemberDormancyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberDormancyEntity extends EntityPathBase<MemberDormancyEntity> {

    private static final long serialVersionUID = -1761895186L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberDormancyEntity memberDormancyEntity = new QMemberDormancyEntity("memberDormancyEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DatePath<java.time.LocalDate> mbBirth = createDate("mbBirth", java.time.LocalDate.class);

    public final StringPath mbCompany = createString("mbCompany");

    public final StringPath mbEmail = createString("mbEmail");

    public final StringPath mbHp = createString("mbHp");

    public final StringPath mbName = createString("mbName");

    public final StringPath mbNick = createString("mbNick");

    public final NumberPath<Integer> mbSex = createNumber("mbSex", Integer.class);

    public final NumberPath<Long> mdIdx = createNumber("mdIdx", Long.class);

    public final QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberDormancyEntity(String variable) {
        this(MemberDormancyEntity.class, forVariable(variable), INITS);
    }

    public QMemberDormancyEntity(Path<? extends MemberDormancyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberDormancyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberDormancyEntity(PathMetadata metadata, PathInits inits) {
        this(MemberDormancyEntity.class, metadata, inits);
    }

    public QMemberDormancyEntity(Class<? extends MemberDormancyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

