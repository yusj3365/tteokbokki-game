package com.cmb.rainbowtv.domain.serial.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSerialApplyEntity is a Querydsl query type for SerialApplyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSerialApplyEntity extends EntityPathBase<SerialApplyEntity> {

    private static final long serialVersionUID = 1827205551L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSerialApplyEntity serialApplyEntity = new QSerialApplyEntity("serialApplyEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath saAddr = createString("saAddr");

    public final StringPath saAddrDetail = createString("saAddrDetail");

    public final StringPath saHp = createString("saHp");

    public final NumberPath<Long> saIdx = createNumber("saIdx", Long.class);

    public final StringPath saName = createString("saName");

    public final NumberPath<Integer> saStatus = createNumber("saStatus", Integer.class);

    public final StringPath saZipcode = createString("saZipcode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSerialApplyEntity(String variable) {
        this(SerialApplyEntity.class, forVariable(variable), INITS);
    }

    public QSerialApplyEntity(Path<? extends SerialApplyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSerialApplyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSerialApplyEntity(PathMetadata metadata, PathInits inits) {
        this(SerialApplyEntity.class, metadata, inits);
    }

    public QSerialApplyEntity(Class<? extends SerialApplyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

