package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrmLogEntity is a Querydsl query type for CrmLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrmLogEntity extends EntityPathBase<CrmLogEntity> {

    private static final long serialVersionUID = -1512847127L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrmLogEntity crmLogEntity = new QCrmLogEntity("crmLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath clAccess = createString("clAccess");

    public final StringPath clAction = createString("clAction");

    public final StringPath clClient = createString("clClient");

    public final DateTimePath<java.time.LocalDateTime> clDate = createDateTime("clDate", java.time.LocalDateTime.class);

    public final StringPath clDepth = createString("clDepth");

    public final StringPath clId = createString("clId");

    public final NumberPath<Long> clIdx = createNumber("clIdx", Long.class);

    public final StringPath clIp = createString("clIp");

    public final StringPath clName = createString("clName");

    public final StringPath clSo = createString("clSo");

    public final StringPath clType = createString("clType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCrmLogEntity(String variable) {
        this(CrmLogEntity.class, forVariable(variable), INITS);
    }

    public QCrmLogEntity(Path<? extends CrmLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrmLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrmLogEntity(PathMetadata metadata, PathInits inits) {
        this(CrmLogEntity.class, metadata, inits);
    }

    public QCrmLogEntity(Class<? extends CrmLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

