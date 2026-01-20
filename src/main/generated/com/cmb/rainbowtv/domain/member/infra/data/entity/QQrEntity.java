package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQrEntity is a Querydsl query type for QrEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQrEntity extends EntityPathBase<QrEntity> {

    private static final long serialVersionUID = -1055614612L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQrEntity qrEntity = new QQrEntity("qrEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberEntity member;

    public final StringPath qrAuth = createString("qrAuth");

    public final StringPath qrCode = createString("qrCode");

    public final DateTimePath<java.time.LocalDateTime> qrExpired = createDateTime("qrExpired", java.time.LocalDateTime.class);

    public final NumberPath<Long> qrIdx = createNumber("qrIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QQrEntity(String variable) {
        this(QrEntity.class, forVariable(variable), INITS);
    }

    public QQrEntity(Path<? extends QrEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQrEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQrEntity(PathMetadata metadata, PathInits inits) {
        this(QrEntity.class, metadata, inits);
    }

    public QQrEntity(Class<? extends QrEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

