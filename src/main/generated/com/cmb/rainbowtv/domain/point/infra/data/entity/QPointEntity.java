package com.cmb.rainbowtv.domain.point.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPointEntity is a Querydsl query type for PointEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointEntity extends EntityPathBase<PointEntity> {

    private static final long serialVersionUID = -1708709313L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPointEntity pointEntity = new QPointEntity("pointEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final QPointDefineCodeEntity pointCodeDefine;

    public final QPointDefineEntity pointDefine;

    public final DatePath<java.time.LocalDate> prExpireDate = createDate("prExpireDate", java.time.LocalDate.class);

    public final NumberPath<Long> prIdx = createNumber("prIdx", Long.class);

    public final NumberPath<Long> prKey = createNumber("prKey", Long.class);

    public final NumberPath<Long> prPoint = createNumber("prPoint", Long.class);

    public final NumberPath<Long> prPointHistory = createNumber("prPointHistory", Long.class);

    public final StringPath prReason = createString("prReason");

    public final StringPath prUuid = createString("prUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPointEntity(String variable) {
        this(PointEntity.class, forVariable(variable), INITS);
    }

    public QPointEntity(Path<? extends PointEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPointEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPointEntity(PathMetadata metadata, PathInits inits) {
        this(PointEntity.class, metadata, inits);
    }

    public QPointEntity(Class<? extends PointEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.pointCodeDefine = inits.isInitialized("pointCodeDefine") ? new QPointDefineCodeEntity(forProperty("pointCodeDefine")) : null;
        this.pointDefine = inits.isInitialized("pointDefine") ? new QPointDefineEntity(forProperty("pointDefine"), inits.get("pointDefine")) : null;
    }

}

