package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBannerSettingEntity is a Querydsl query type for BannerSettingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerSettingEntity extends EntityPathBase<BannerSettingEntity> {

    private static final long serialVersionUID = 604054673L;

    public static final QBannerSettingEntity bannerSettingEntity = new QBannerSettingEntity("bannerSettingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> bsDisplaySize = createNumber("bsDisplaySize", Integer.class);

    public final NumberPath<Integer> bsDisplayTime = createNumber("bsDisplayTime", Integer.class);

    public final NumberPath<Long> bsIdx = createNumber("bsIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.banner.model.enums.BManageTypeEnum> bsManageType = createEnum("bsManageType", com.cmb.rainbowtv.domain.banner.model.enums.BManageTypeEnum.class);

    public final EnumPath<com.cmb.rainbowtv.domain.banner.model.enums.BPopUpType> bsPopupType = createEnum("bsPopupType", com.cmb.rainbowtv.domain.banner.model.enums.BPopUpType.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerSettingEntity(String variable) {
        super(BannerSettingEntity.class, forVariable(variable));
    }

    public QBannerSettingEntity(Path<? extends BannerSettingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBannerSettingEntity(PathMetadata metadata) {
        super(BannerSettingEntity.class, metadata);
    }

}

