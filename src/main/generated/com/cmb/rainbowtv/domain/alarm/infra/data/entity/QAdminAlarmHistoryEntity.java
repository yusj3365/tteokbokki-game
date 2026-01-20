package com.cmb.rainbowtv.domain.alarm.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminAlarmHistoryEntity is a Querydsl query type for AdminAlarmHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminAlarmHistoryEntity extends EntityPathBase<AdminAlarmHistoryEntity> {

    private static final long serialVersionUID = 229200546L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminAlarmHistoryEntity adminAlarmHistoryEntity = new QAdminAlarmHistoryEntity("adminAlarmHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath aahContent = createString("aahContent");

    public final NumberPath<Long> aahIdx = createNumber("aahIdx", Long.class);

    public final NumberPath<Long> aahKey = createNumber("aahKey", Long.class);

    public final NumberPath<Integer> aahPush = createNumber("aahPush", Integer.class);

    public final StringPath aahTitle = createString("aahTitle");

    public final EnumPath<com.cmb.rainbowtv.domain.alarm.model.enums.AahTypeEnum> aahType = createEnum("aahType", com.cmb.rainbowtv.domain.alarm.model.enums.AahTypeEnum.class);

    public final NumberPath<Integer> aahUse = createNumber("aahUse", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminAlarmHistoryEntity(String variable) {
        this(AdminAlarmHistoryEntity.class, forVariable(variable), INITS);
    }

    public QAdminAlarmHistoryEntity(Path<? extends AdminAlarmHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminAlarmHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminAlarmHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(AdminAlarmHistoryEntity.class, metadata, inits);
    }

    public QAdminAlarmHistoryEntity(Class<? extends AdminAlarmHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

