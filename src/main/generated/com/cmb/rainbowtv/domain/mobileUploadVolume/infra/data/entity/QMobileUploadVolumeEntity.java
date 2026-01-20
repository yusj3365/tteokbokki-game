package com.cmb.rainbowtv.domain.mobileUploadVolume.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMobileUploadVolumeEntity is a Querydsl query type for MobileUploadVolumeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMobileUploadVolumeEntity extends EntityPathBase<MobileUploadVolumeEntity> {

    private static final long serialVersionUID = 2026584709L;

    public static final QMobileUploadVolumeEntity mobileUploadVolumeEntity = new QMobileUploadVolumeEntity("mobileUploadVolumeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> muvHaveLimit = createNumber("muvHaveLimit", Integer.class);

    public final NumberPath<Long> muvIdx = createNumber("muvIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.mobileUploadVolume.model.enums.MuvTypeEnum> muvType = createEnum("muvType", com.cmb.rainbowtv.domain.mobileUploadVolume.model.enums.MuvTypeEnum.class);

    public final NumberPath<Long> muvVolume = createNumber("muvVolume", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMobileUploadVolumeEntity(String variable) {
        super(MobileUploadVolumeEntity.class, forVariable(variable));
    }

    public QMobileUploadVolumeEntity(Path<? extends MobileUploadVolumeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMobileUploadVolumeEntity(PathMetadata metadata) {
        super(MobileUploadVolumeEntity.class, metadata);
    }

}

