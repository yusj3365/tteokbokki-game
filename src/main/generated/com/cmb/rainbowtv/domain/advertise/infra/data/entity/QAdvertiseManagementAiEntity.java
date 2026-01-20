package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdvertiseManagementAiEntity is a Querydsl query type for AdvertiseManagementAiEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseManagementAiEntity extends EntityPathBase<AdvertiseManagementAiEntity> {

    private static final long serialVersionUID = 1999432600L;

    public static final QAdvertiseManagementAiEntity advertiseManagementAiEntity = new QAdvertiseManagementAiEntity("advertiseManagementAiEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> amaAi = createNumber("amaAi", Integer.class);

    public final NumberPath<Long> amaIdx = createNumber("amaIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseManagementAiEntity(String variable) {
        super(AdvertiseManagementAiEntity.class, forVariable(variable));
    }

    public QAdvertiseManagementAiEntity(Path<? extends AdvertiseManagementAiEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdvertiseManagementAiEntity(PathMetadata metadata) {
        super(AdvertiseManagementAiEntity.class, metadata);
    }

}

