package com.cmb.rainbowtv.domain.alarm.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlarmSettingEntity is a Querydsl query type for AlarmSettingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlarmSettingEntity extends EntityPathBase<AlarmSettingEntity> {

    private static final long serialVersionUID = 371312949L;

    public static final QAlarmSettingEntity alarmSettingEntity = new QAlarmSettingEntity("alarmSettingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> asIdx = createNumber("asIdx", Long.class);

    public final NumberPath<Integer> asRun = createNumber("asRun", Integer.class);

    public final TimePath<java.time.LocalTime> asTime = createTime("asTime", java.time.LocalTime.class);

    public final StringPath asType = createString("asType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAlarmSettingEntity(String variable) {
        super(AlarmSettingEntity.class, forVariable(variable));
    }

    public QAlarmSettingEntity(Path<? extends AlarmSettingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlarmSettingEntity(PathMetadata metadata) {
        super(AlarmSettingEntity.class, metadata);
    }

}

