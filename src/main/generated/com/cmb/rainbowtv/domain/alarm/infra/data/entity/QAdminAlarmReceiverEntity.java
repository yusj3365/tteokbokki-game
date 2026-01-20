package com.cmb.rainbowtv.domain.alarm.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminAlarmReceiverEntity is a Querydsl query type for AdminAlarmReceiverEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminAlarmReceiverEntity extends EntityPathBase<AdminAlarmReceiverEntity> {

    private static final long serialVersionUID = 194088711L;

    public static final QAdminAlarmReceiverEntity adminAlarmReceiverEntity = new QAdminAlarmReceiverEntity("adminAlarmReceiverEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> aarIdx = createNumber("aarIdx", Long.class);

    public final StringPath aarName = createString("aarName");

    public final StringPath aarPhoneNum = createString("aarPhoneNum");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminAlarmReceiverEntity(String variable) {
        super(AdminAlarmReceiverEntity.class, forVariable(variable));
    }

    public QAdminAlarmReceiverEntity(Path<? extends AdminAlarmReceiverEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminAlarmReceiverEntity(PathMetadata metadata) {
        super(AdminAlarmReceiverEntity.class, metadata);
    }

}

