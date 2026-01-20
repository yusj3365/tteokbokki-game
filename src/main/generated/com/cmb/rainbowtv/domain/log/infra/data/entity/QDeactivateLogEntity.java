package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDeactivateLogEntity is a Querydsl query type for DeactivateLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDeactivateLogEntity extends EntityPathBase<DeactivateLogEntity> {

    private static final long serialVersionUID = -28785325L;

    public static final QDeactivateLogEntity deactivateLogEntity = new QDeactivateLogEntity("deactivateLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath clientIp = createString("clientIp");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> dlIdx = createNumber("dlIdx", Long.class);

    public final StringPath mbId = createString("mbId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QDeactivateLogEntity(String variable) {
        super(DeactivateLogEntity.class, forVariable(variable));
    }

    public QDeactivateLogEntity(Path<? extends DeactivateLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDeactivateLogEntity(PathMetadata metadata) {
        super(DeactivateLogEntity.class, metadata);
    }

}

