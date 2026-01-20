package com.cmb.rainbowtv.domain.memberPartner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberPartnerMediaEntity is a Querydsl query type for MemberPartnerMediaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberPartnerMediaEntity extends EntityPathBase<MemberPartnerMediaEntity> {

    private static final long serialVersionUID = -1396977905L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPartnerMediaEntity memberPartnerMediaEntity = new QMemberPartnerMediaEntity("memberPartnerMediaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberPartnerEntity memberPartner;

    public final StringPath mpmAddress = createString("mpmAddress");

    public final StringPath mpmAddressDetail = createString("mpmAddressDetail");

    public final StringPath mpmCompany = createString("mpmCompany");

    public final StringPath mpmHp = createString("mpmHp");

    public final NumberPath<Long> mpmIdx = createNumber("mpmIdx", Long.class);

    public final StringPath mpmZipCode = createString("mpmZipCode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberPartnerMediaEntity(String variable) {
        this(MemberPartnerMediaEntity.class, forVariable(variable), INITS);
    }

    public QMemberPartnerMediaEntity(Path<? extends MemberPartnerMediaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberPartnerMediaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberPartnerMediaEntity(PathMetadata metadata, PathInits inits) {
        this(MemberPartnerMediaEntity.class, metadata, inits);
    }

    public QMemberPartnerMediaEntity(Class<? extends MemberPartnerMediaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberPartner = inits.isInitialized("memberPartner") ? new QMemberPartnerEntity(forProperty("memberPartner"), inits.get("memberPartner")) : null;
    }

}

