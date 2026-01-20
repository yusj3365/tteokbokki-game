package com.cmb.rainbowtv.domain.memberPartner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberPartnerAdvertisementEntity is a Querydsl query type for MemberPartnerAdvertisementEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberPartnerAdvertisementEntity extends EntityPathBase<MemberPartnerAdvertisementEntity> {

    private static final long serialVersionUID = -1009931152L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPartnerAdvertisementEntity memberPartnerAdvertisementEntity = new QMemberPartnerAdvertisementEntity("memberPartnerAdvertisementEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberPartnerEntity memberPartner;

    public final StringPath mpaAddress = createString("mpaAddress");

    public final StringPath mpaAddressDetail = createString("mpaAddressDetail");

    public final StringPath mpaCompany = createString("mpaCompany");

    public final StringPath mpaHp = createString("mpaHp");

    public final NumberPath<Long> mpaIdx = createNumber("mpaIdx", Long.class);

    public final StringPath mpaZipCode = createString("mpaZipCode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberPartnerAdvertisementEntity(String variable) {
        this(MemberPartnerAdvertisementEntity.class, forVariable(variable), INITS);
    }

    public QMemberPartnerAdvertisementEntity(Path<? extends MemberPartnerAdvertisementEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberPartnerAdvertisementEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberPartnerAdvertisementEntity(PathMetadata metadata, PathInits inits) {
        this(MemberPartnerAdvertisementEntity.class, metadata, inits);
    }

    public QMemberPartnerAdvertisementEntity(Class<? extends MemberPartnerAdvertisementEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberPartner = inits.isInitialized("memberPartner") ? new QMemberPartnerEntity(forProperty("memberPartner"), inits.get("memberPartner")) : null;
    }

}

