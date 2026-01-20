package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberOutInfoEntity is a Querydsl query type for MemberOutInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberOutInfoEntity extends EntityPathBase<MemberOutInfoEntity> {

    private static final long serialVersionUID = -2053603683L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberOutInfoEntity memberOutInfoEntity = new QMemberOutInfoEntity("memberOutInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbAddr = createString("mbAddr");

    public final StringPath mbAddrDetail = createString("mbAddrDetail");

    public final StringPath mbBirth = createString("mbBirth");

    public final StringPath mbEmail = createString("mbEmail");

    public final StringPath mbHp = createString("mbHp");

    public final StringPath mbId = createString("mbId");

    public final StringPath mbName = createString("mbName");

    public final StringPath mbNick = createString("mbNick");

    public final NumberPath<Long> mbNo = createNumber("mbNo", Long.class);

    public final NumberPath<Integer> mbSex = createNumber("mbSex", Integer.class);

    public final StringPath mbZipCode = createString("mbZipCode");

    public final StringPath miRNum = createString("miRNum");

    public final NumberPath<Long> moiIdx = createNumber("moiIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberOutInfoEntity(String variable) {
        this(MemberOutInfoEntity.class, forVariable(variable), INITS);
    }

    public QMemberOutInfoEntity(Path<? extends MemberOutInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberOutInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberOutInfoEntity(PathMetadata metadata, PathInits inits) {
        this(MemberOutInfoEntity.class, metadata, inits);
    }

    public QMemberOutInfoEntity(Class<? extends MemberOutInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
    }

}

