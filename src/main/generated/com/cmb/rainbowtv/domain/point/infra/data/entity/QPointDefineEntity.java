package com.cmb.rainbowtv.domain.point.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPointDefineEntity is a Querydsl query type for PointDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointDefineEntity extends EntityPathBase<PointDefineEntity> {

    private static final long serialVersionUID = 910639834L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPointDefineEntity pointDefineEntity = new QPointDefineEntity("pointDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> pd1stStandard = createNumber("pd1stStandard", Long.class);

    public final NumberPath<Long> pd2ndStandard = createNumber("pd2ndStandard", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.point.model.enums.PointCategoryEnum> pdCategory = createEnum("pdCategory", com.cmb.rainbowtv.domain.point.model.enums.PointCategoryEnum.class);

    public final NumberPath<Long> pdIdx = createNumber("pdIdx", Long.class);

    public final NumberPath<Integer> pdIsUse = createNumber("pdIsUse", Integer.class);

    public final StringPath pdJoin = createString("pdJoin");

    public final NumberPath<Long> pdPoint = createNumber("pdPoint", Long.class);

    public final DatePath<java.time.LocalDate> pdPolicyEnd = createDate("pdPolicyEnd", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> pdPolicyStart = createDate("pdPolicyStart", java.time.LocalDate.class);

    public final StringPath pdReason = createString("pdReason");

    public final NumberPath<Long> pdRegister = createNumber("pdRegister", Long.class);

    public final NumberPath<Integer> pdStatus = createNumber("pdStatus", Integer.class);

    public final QPointDefineCodeEntity pointCodeDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPointDefineEntity(String variable) {
        this(PointDefineEntity.class, forVariable(variable), INITS);
    }

    public QPointDefineEntity(Path<? extends PointDefineEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPointDefineEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPointDefineEntity(PathMetadata metadata, PathInits inits) {
        this(PointDefineEntity.class, metadata, inits);
    }

    public QPointDefineEntity(Class<? extends PointDefineEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pointCodeDefine = inits.isInitialized("pointCodeDefine") ? new QPointDefineCodeEntity(forProperty("pointCodeDefine")) : null;
    }

}

