package com.cmb.rainbowtv.domain.memberPartner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberPartnerOutInfoEntity is a Querydsl query type for MemberPartnerOutInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberPartnerOutInfoEntity extends EntityPathBase<MemberPartnerOutInfoEntity> {

    private static final long serialVersionUID = 1522195527L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPartnerOutInfoEntity memberPartnerOutInfoEntity = new QMemberPartnerOutInfoEntity("memberPartnerOutInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberPartnerEntity memberPartner;

    public final StringPath mpoiAddress = createString("mpoiAddress");

    public final StringPath mpoiAddressDetail = createString("mpoiAddressDetail");

    public final NumberPath<Integer> mpoiCategory = createNumber("mpoiCategory", Integer.class);

    public final StringPath mpoiCompany = createString("mpoiCompany");

    public final StringPath mpoiHp = createString("mpoiHp");

    public final NumberPath<Long> mpoiIdx = createNumber("mpoiIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.member.model.enums.MpTypeEnum> mpoiType = createEnum("mpoiType", com.cmb.rainbowtv.domain.member.model.enums.MpTypeEnum.class);

    public final StringPath mpoiZipCode = createString("mpoiZipCode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberPartnerOutInfoEntity(String variable) {
        this(MemberPartnerOutInfoEntity.class, forVariable(variable), INITS);
    }

    public QMemberPartnerOutInfoEntity(Path<? extends MemberPartnerOutInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberPartnerOutInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberPartnerOutInfoEntity(PathMetadata metadata, PathInits inits) {
        this(MemberPartnerOutInfoEntity.class, metadata, inits);
    }

    public QMemberPartnerOutInfoEntity(Class<? extends MemberPartnerOutInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberPartner = inits.isInitialized("memberPartner") ? new QMemberPartnerEntity(forProperty("memberPartner"), inits.get("memberPartner")) : null;
    }

}

