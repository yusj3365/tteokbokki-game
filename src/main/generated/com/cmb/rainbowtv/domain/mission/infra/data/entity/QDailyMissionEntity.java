package com.cmb.rainbowtv.domain.mission.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDailyMissionEntity is a Querydsl query type for DailyMissionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDailyMissionEntity extends EntityPathBase<DailyMissionEntity> {

    private static final long serialVersionUID = 2067345934L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDailyMissionEntity dailyMissionEntity = new QDailyMissionEntity("dailyMissionEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<java.math.BigDecimal> dmCount = createNumber("dmCount", java.math.BigDecimal.class);

    public final NumberPath<Long> dmIdx = createNumber("dmIdx", Long.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath pdCode = createString("pdCode");

    public final com.cmb.rainbowtv.domain.point.infra.data.entity.QPointDefineEntity pointDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QDailyMissionEntity(String variable) {
        this(DailyMissionEntity.class, forVariable(variable), INITS);
    }

    public QDailyMissionEntity(Path<? extends DailyMissionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDailyMissionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDailyMissionEntity(PathMetadata metadata, PathInits inits) {
        this(DailyMissionEntity.class, metadata, inits);
    }

    public QDailyMissionEntity(Class<? extends DailyMissionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.pointDefine = inits.isInitialized("pointDefine") ? new com.cmb.rainbowtv.domain.point.infra.data.entity.QPointDefineEntity(forProperty("pointDefine"), inits.get("pointDefine")) : null;
    }

}

