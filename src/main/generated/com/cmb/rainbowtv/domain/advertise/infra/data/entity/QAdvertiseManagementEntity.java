package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdvertiseManagementEntity is a Querydsl query type for AdvertiseManagementEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseManagementEntity extends EntityPathBase<AdvertiseManagementEntity> {

    private static final long serialVersionUID = 1476798608L;

    public static final QAdvertiseManagementEntity advertiseManagementEntity = new QAdvertiseManagementEntity("advertiseManagementEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDetailTypeEnum> advertiseContentDetailType = createEnum("advertiseContentDetailType", com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDetailTypeEnum.class);

    public final NumberPath<Integer> amDisplay = createNumber("amDisplay", Integer.class);

    public final NumberPath<Long> amIdx = createNumber("amIdx", Long.class);

    public final NumberPath<Long> amLengthMax = createNumber("amLengthMax", Long.class);

    public final NumberPath<Long> amLengthMin = createNumber("amLengthMin", Long.class);

    public final NumberPath<Long> amMaxCycle = createNumber("amMaxCycle", Long.class);

    public final NumberPath<Long> amMiddleCycle = createNumber("amMiddleCycle", Long.class);

    public final NumberPath<Integer> amMinCycle = createNumber("amMinCycle", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseManagementEntity(String variable) {
        super(AdvertiseManagementEntity.class, forVariable(variable));
    }

    public QAdvertiseManagementEntity(Path<? extends AdvertiseManagementEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdvertiseManagementEntity(PathMetadata metadata) {
        super(AdvertiseManagementEntity.class, metadata);
    }

}

