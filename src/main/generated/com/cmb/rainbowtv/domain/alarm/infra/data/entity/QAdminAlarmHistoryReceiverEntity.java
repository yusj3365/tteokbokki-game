package com.cmb.rainbowtv.domain.alarm.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminAlarmHistoryReceiverEntity is a Querydsl query type for AdminAlarmHistoryReceiverEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminAlarmHistoryReceiverEntity extends EntityPathBase<AdminAlarmHistoryReceiverEntity> {

    private static final long serialVersionUID = 490310257L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminAlarmHistoryReceiverEntity adminAlarmHistoryReceiverEntity = new QAdminAlarmHistoryReceiverEntity("adminAlarmHistoryReceiverEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> aahrIdx = createNumber("aahrIdx", Long.class);

    public final NumberPath<Integer> aahrReceiver = createNumber("aahrReceiver", Integer.class);

    public final QAdminAlarmHistoryEntity adminAlarmHistory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminAlarmHistoryReceiverEntity(String variable) {
        this(AdminAlarmHistoryReceiverEntity.class, forVariable(variable), INITS);
    }

    public QAdminAlarmHistoryReceiverEntity(Path<? extends AdminAlarmHistoryReceiverEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminAlarmHistoryReceiverEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminAlarmHistoryReceiverEntity(PathMetadata metadata, PathInits inits) {
        this(AdminAlarmHistoryReceiverEntity.class, metadata, inits);
    }

    public QAdminAlarmHistoryReceiverEntity(Class<? extends AdminAlarmHistoryReceiverEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adminAlarmHistory = inits.isInitialized("adminAlarmHistory") ? new QAdminAlarmHistoryEntity(forProperty("adminAlarmHistory"), inits.get("adminAlarmHistory")) : null;
    }

}

