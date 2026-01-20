package com.cmb.rainbowtv.domain.serial.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSerialMemberHistoryEntity is a Querydsl query type for SerialMemberHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSerialMemberHistoryEntity extends EntityPathBase<SerialMemberHistoryEntity> {

    private static final long serialVersionUID = -195563557L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSerialMemberHistoryEntity serialMemberHistoryEntity = new QSerialMemberHistoryEntity("serialMemberHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final QSerialEntity serial;

    public final DateTimePath<java.time.LocalDateTime> smhConnect = createDateTime("smhConnect", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> smhDisconnect = createDateTime("smhDisconnect", java.time.LocalDateTime.class);

    public final NumberPath<Long> smhIdx = createNumber("smhIdx", Long.class);

    public final NumberPath<Integer> smhStatus = createNumber("smhStatus", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSerialMemberHistoryEntity(String variable) {
        this(SerialMemberHistoryEntity.class, forVariable(variable), INITS);
    }

    public QSerialMemberHistoryEntity(Path<? extends SerialMemberHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSerialMemberHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSerialMemberHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(SerialMemberHistoryEntity.class, metadata, inits);
    }

    public QSerialMemberHistoryEntity(Class<? extends SerialMemberHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.serial = inits.isInitialized("serial") ? new QSerialEntity(forProperty("serial")) : null;
    }

}

