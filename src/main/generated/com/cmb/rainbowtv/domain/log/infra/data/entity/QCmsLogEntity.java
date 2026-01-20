package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCmsLogEntity is a Querydsl query type for CmsLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCmsLogEntity extends EntityPathBase<CmsLogEntity> {

    private static final long serialVersionUID = 1997861342L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCmsLogEntity cmsLogEntity = new QCmsLogEntity("cmsLogEntity");

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

    public QCmsLogEntity(String variable) {
        this(CmsLogEntity.class, forVariable(variable), INITS);
    }

    public QCmsLogEntity(Path<? extends CmsLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCmsLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCmsLogEntity(PathMetadata metadata, PathInits inits) {
        this(CmsLogEntity.class, metadata, inits);
    }

    public QCmsLogEntity(Class<? extends CmsLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

