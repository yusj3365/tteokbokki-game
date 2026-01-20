package com.cmb.rainbowtv.domain.mission.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPartnerMissionEntity is a Querydsl query type for PartnerMissionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPartnerMissionEntity extends EntityPathBase<PartnerMissionEntity> {

    private static final long serialVersionUID = 1261658559L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPartnerMissionEntity partnerMissionEntity = new QPartnerMissionEntity("partnerMissionEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> pmIdx = createNumber("pmIdx", Long.class);

    public final com.cmb.rainbowtv.domain.point.infra.data.entity.QPointDefineEntity pointDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPartnerMissionEntity(String variable) {
        this(PartnerMissionEntity.class, forVariable(variable), INITS);
    }

    public QPartnerMissionEntity(Path<? extends PartnerMissionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPartnerMissionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPartnerMissionEntity(PathMetadata metadata, PathInits inits) {
        this(PartnerMissionEntity.class, metadata, inits);
    }

    public QPartnerMissionEntity(Class<? extends PartnerMissionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.pointDefine = inits.isInitialized("pointDefine") ? new com.cmb.rainbowtv.domain.point.infra.data.entity.QPointDefineEntity(forProperty("pointDefine"), inits.get("pointDefine")) : null;
    }

}

