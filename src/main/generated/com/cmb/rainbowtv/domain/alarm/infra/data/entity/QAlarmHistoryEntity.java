package com.cmb.rainbowtv.domain.alarm.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAlarmHistoryEntity is a Querydsl query type for AlarmHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlarmHistoryEntity extends EntityPathBase<AlarmHistoryEntity> {

    private static final long serialVersionUID = 833739897L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAlarmHistoryEntity alarmHistoryEntity = new QAlarmHistoryEntity("alarmHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath ahCode = createString("ahCode");

    public final StringPath ahContent = createString("ahContent");

    public final NumberPath<Long> ahIdx = createNumber("ahIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.alarm.model.enums.AhImageTypeEnum> ahImageType = createEnum("ahImageType", com.cmb.rainbowtv.domain.alarm.model.enums.AhImageTypeEnum.class);

    public final NumberPath<Integer> ahIsRead = createNumber("ahIsRead", Integer.class);

    public final NumberPath<Long> ahKey = createNumber("ahKey", Long.class);

    public final StringPath ahMethod = createString("ahMethod");

    public final StringPath ahTitle = createString("ahTitle");

    public final StringPath ahType = createString("ahType");

    public final StringPath ahUrl = createString("ahUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAlarmHistoryEntity(String variable) {
        this(AlarmHistoryEntity.class, forVariable(variable), INITS);
    }

    public QAlarmHistoryEntity(Path<? extends AlarmHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAlarmHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAlarmHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(AlarmHistoryEntity.class, metadata, inits);
    }

    public QAlarmHistoryEntity(Class<? extends AlarmHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

