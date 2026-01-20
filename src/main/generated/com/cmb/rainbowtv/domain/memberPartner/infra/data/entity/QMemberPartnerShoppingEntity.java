package com.cmb.rainbowtv.domain.memberPartner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberPartnerShoppingEntity is a Querydsl query type for MemberPartnerShoppingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberPartnerShoppingEntity extends EntityPathBase<MemberPartnerShoppingEntity> {

    private static final long serialVersionUID = -308545469L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPartnerShoppingEntity memberPartnerShoppingEntity = new QMemberPartnerShoppingEntity("memberPartnerShoppingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberPartnerEntity memberPartner;

    public final StringPath mpsAddress = createString("mpsAddress");

    public final StringPath mpsAddressDetail = createString("mpsAddressDetail");

    public final StringPath mpsCompany = createString("mpsCompany");

    public final StringPath mpsHp = createString("mpsHp");

    public final NumberPath<Long> mpsIdx = createNumber("mpsIdx", Long.class);

    public final StringPath mpsZipCode = createString("mpsZipCode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberPartnerShoppingEntity(String variable) {
        this(MemberPartnerShoppingEntity.class, forVariable(variable), INITS);
    }

    public QMemberPartnerShoppingEntity(Path<? extends MemberPartnerShoppingEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberPartnerShoppingEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberPartnerShoppingEntity(PathMetadata metadata, PathInits inits) {
        this(MemberPartnerShoppingEntity.class, metadata, inits);
    }

    public QMemberPartnerShoppingEntity(Class<? extends MemberPartnerShoppingEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberPartner = inits.isInitialized("memberPartner") ? new QMemberPartnerEntity(forProperty("memberPartner"), inits.get("memberPartner")) : null;
    }

}

