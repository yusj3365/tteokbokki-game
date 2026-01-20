package com.cmb.rainbowtv.domain.serial.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSerialMemberEntity is a Querydsl query type for SerialMemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSerialMemberEntity extends EntityPathBase<SerialMemberEntity> {

    private static final long serialVersionUID = 1741106719L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSerialMemberEntity serialMemberEntity = new QSerialMemberEntity("serialMemberEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final QSerialEntity serial;

    public final NumberPath<Long> smIdx = createNumber("smIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSerialMemberEntity(String variable) {
        this(SerialMemberEntity.class, forVariable(variable), INITS);
    }

    public QSerialMemberEntity(Path<? extends SerialMemberEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSerialMemberEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSerialMemberEntity(PathMetadata metadata, PathInits inits) {
        this(SerialMemberEntity.class, metadata, inits);
    }

    public QSerialMemberEntity(Class<? extends SerialMemberEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.serial = inits.isInitialized("serial") ? new QSerialEntity(forProperty("serial")) : null;
    }

}

