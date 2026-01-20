package com.cmb.rainbowtv.domain.memberPartner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberPartnerEntity is a Querydsl query type for MemberPartnerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberPartnerEntity extends EntityPathBase<MemberPartnerEntity> {

    private static final long serialVersionUID = -554819397L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberPartnerEntity memberPartnerEntity = new QMemberPartnerEntity("memberPartnerEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final DateTimePath<java.time.LocalDateTime> mpCancelDate = createDateTime("mpCancelDate", java.time.LocalDateTime.class);

    public final StringPath mpCancelReason = createString("mpCancelReason");

    public final NumberPath<Integer> mpCategory = createNumber("mpCategory", Integer.class);

    public final NumberPath<Long> mpIdx = createNumber("mpIdx", Long.class);

    public final NumberPath<Integer> mpStatus = createNumber("mpStatus", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.member.model.enums.MpTypeEnum> mpType = createEnum("mpType", com.cmb.rainbowtv.domain.member.model.enums.MpTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberPartnerEntity(String variable) {
        this(MemberPartnerEntity.class, forVariable(variable), INITS);
    }

    public QMemberPartnerEntity(Path<? extends MemberPartnerEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberPartnerEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberPartnerEntity(PathMetadata metadata, PathInits inits) {
        this(MemberPartnerEntity.class, metadata, inits);
    }

    public QMemberPartnerEntity(Class<? extends MemberPartnerEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

