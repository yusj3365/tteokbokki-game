package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberInfoEntity is a Querydsl query type for MemberInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberInfoEntity extends EntityPathBase<MemberInfoEntity> {

    private static final long serialVersionUID = 390789235L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberInfoEntity memberInfoEntity = new QMemberInfoEntity("memberInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> aaIdx = createNumber("aaIdx", Long.class);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbAddr = createString("mbAddr");

    public final StringPath mbAddrDetail = createString("mbAddrDetail");

    public final StringPath mbBirth = createString("mbBirth");

    public final StringPath mbBirthJ = createString("mbBirthJ");

    public final StringPath mbDeviceToken = createString("mbDeviceToken");

    public final StringPath mbEmail = createString("mbEmail");

    public final NumberPath<Integer> mbIsSettop = createNumber("mbIsSettop", Integer.class);

    public final NumberPath<Integer> mbJoinRoute = createNumber("mbJoinRoute", Integer.class);

    public final StringPath mbMemo = createString("mbMemo");

    public final StringPath mbNick = createString("mbNick");

    public final StringPath mbNumber = createString("mbNumber");

    public final NumberPath<Integer> mbSendStatus = createNumber("mbSendStatus", Integer.class);

    public final NumberPath<Integer> mbSex = createNumber("mbSex", Integer.class);

    public final NumberPath<Integer> mbUserType = createNumber("mbUserType", Integer.class);

    public final StringPath mbZipCode = createString("mbZipCode");

    public final QMemberEntity member;

    public final QMemberOrganizationEntity memberOrganization;

    public final StringPath miBusinessRegistrationNumber = createString("miBusinessRegistrationNumber");

    public final NumberPath<Integer> miDeliveryAddrConf = createNumber("miDeliveryAddrConf", Integer.class);

    public final NumberPath<Integer> miDeliveryHpConf = createNumber("miDeliveryHpConf", Integer.class);

    public final NumberPath<Long> miIdx = createNumber("miIdx", Long.class);

    public final NumberPath<Integer> miIsApp = createNumber("miIsApp", Integer.class);

    public final NumberPath<Integer> miIsInterest = createNumber("miIsInterest", Integer.class);

    public final NumberPath<Integer> miIsLeader = createNumber("miIsLeader", Integer.class);

    public final NumberPath<Integer> miJoinType = createNumber("miJoinType", Integer.class);

    public final StringPath miNote = createString("miNote");

    public final StringPath miOrganizerCompany = createString("miOrganizerCompany");

    public final StringPath miOrganizerName = createString("miOrganizerName");

    public final NumberPath<Integer> miRainbow = createNumber("miRainbow", Integer.class);

    public final StringPath miRecommendCode = createString("miRecommendCode");

    public final NumberPath<Integer> miRegisterType = createNumber("miRegisterType", Integer.class);

    public final StringPath miRNum = createString("miRNum");

    public final NumberPath<Integer> miUseMethod = createNumber("miUseMethod", Integer.class);

    public final com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity soDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberInfoEntity(String variable) {
        this(MemberInfoEntity.class, forVariable(variable), INITS);
    }

    public QMemberInfoEntity(Path<? extends MemberInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberInfoEntity(PathMetadata metadata, PathInits inits) {
        this(MemberInfoEntity.class, metadata, inits);
    }

    public QMemberInfoEntity(Class<? extends MemberInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.memberOrganization = inits.isInitialized("memberOrganization") ? new QMemberOrganizationEntity(forProperty("memberOrganization")) : null;
        this.soDefine = inits.isInitialized("soDefine") ? new com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity(forProperty("soDefine"), inits.get("soDefine")) : null;
    }

}

