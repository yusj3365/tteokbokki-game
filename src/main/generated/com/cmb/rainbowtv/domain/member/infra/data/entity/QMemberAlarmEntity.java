package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberAlarmEntity is a Querydsl query type for MemberAlarmEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberAlarmEntity extends EntityPathBase<MemberAlarmEntity> {

    private static final long serialVersionUID = -1839475822L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberAlarmEntity memberAlarmEntity = new QMemberAlarmEntity("memberAlarmEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> maAgreeAdvertising = createNumber("maAgreeAdvertising", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> maAgreeAdvertisingDate = createDateTime("maAgreeAdvertisingDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> maAgreeNight = createNumber("maAgreeNight", Integer.class);

    public final NumberPath<Integer> maEmailAgree = createNumber("maEmailAgree", Integer.class);

    public final NumberPath<Integer> maHomeChoice = createNumber("maHomeChoice", Integer.class);

    public final NumberPath<Long> maIdx = createNumber("maIdx", Long.class);

    public final NumberPath<Integer> maMarketingUse = createNumber("maMarketingUse", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> maMarketingUseDate = createDateTime("maMarketingUseDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> maPartnerPushAgree = createNumber("maPartnerPushAgree", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> maPartnerPushAgreeDate = createDateTime("maPartnerPushAgreeDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> maPrivacy = createNumber("maPrivacy", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> maPrivacyDate = createDateTime("maPrivacyDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> maPushAgree = createNumber("maPushAgree", Integer.class);

    public final NumberPath<Integer> maSmsSnsAgree = createNumber("maSmsSnsAgree", Integer.class);

    public final QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberAlarmEntity(String variable) {
        this(MemberAlarmEntity.class, forVariable(variable), INITS);
    }

    public QMemberAlarmEntity(Path<? extends MemberAlarmEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberAlarmEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberAlarmEntity(PathMetadata metadata, PathInits inits) {
        this(MemberAlarmEntity.class, metadata, inits);
    }

    public QMemberAlarmEntity(Class<? extends MemberAlarmEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

