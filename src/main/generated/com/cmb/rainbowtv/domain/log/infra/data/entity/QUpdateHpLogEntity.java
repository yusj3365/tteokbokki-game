package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUpdateHpLogEntity is a Querydsl query type for UpdateHpLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUpdateHpLogEntity extends EntityPathBase<UpdateHpLogEntity> {

    private static final long serialVersionUID = -1492844874L;

    public static final QUpdateHpLogEntity updateHpLogEntity = new QUpdateHpLogEntity("updateHpLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbId = createString("mbId");

    public final StringPath originHp = createString("originHp");

    public final NumberPath<Long> ulIdx = createNumber("ulIdx", Long.class);

    public final StringPath ulIp = createString("ulIp");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath updatedHp = createString("updatedHp");

    public QUpdateHpLogEntity(String variable) {
        super(UpdateHpLogEntity.class, forVariable(variable));
    }

    public QUpdateHpLogEntity(Path<? extends UpdateHpLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUpdateHpLogEntity(PathMetadata metadata) {
        super(UpdateHpLogEntity.class, metadata);
    }

}

