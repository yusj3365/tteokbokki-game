package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerEntity is a Querydsl query type for BannerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerEntity extends EntityPathBase<BannerEntity> {

    private static final long serialVersionUID = 1655540581L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerEntity bannerEntity = new QBannerEntity("bannerEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> baAosDisplay = createNumber("baAosDisplay", Integer.class);

    public final StringPath baDashUrl = createString("baDashUrl");

    public final NumberPath<Integer> baDisplay = createNumber("baDisplay", Integer.class);

    public final TimePath<java.time.LocalTime> baDisplayFinishedAt = createTime("baDisplayFinishedAt", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> baDisplayStartedAt = createTime("baDisplayStartedAt", java.time.LocalTime.class);

    public final NumberPath<Integer> baDisplayTime = createNumber("baDisplayTime", Integer.class);

    public final StringPath baHlsUrl = createString("baHlsUrl");

    public final NumberPath<Long> baIdx = createNumber("baIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.banner.model.enums.BManageTypeEnum> baManageType = createEnum("baManageType", com.cmb.rainbowtv.domain.banner.model.enums.BManageTypeEnum.class);

    public final NumberPath<Integer> baOttAppDisplay = createNumber("baOttAppDisplay", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.banner.model.enums.BPopUpType> baPopUpType = createEnum("baPopUpType", com.cmb.rainbowtv.domain.banner.model.enums.BPopUpType.class);

    public final NumberPath<Integer> baSmartDisplay = createNumber("baSmartDisplay", Integer.class);

    public final NumberPath<Integer> baStatus = createNumber("baStatus", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.banner.model.enums.BTypeEnum> baType = createEnum("baType", com.cmb.rainbowtv.domain.banner.model.enums.BTypeEnum.class);

    public final StringPath baUrl = createString("baUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath guid = createString("guid");

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity mediaCategory;

    public final StringPath mediaPackageId = createString("mediaPackageId");

    public final com.cmb.rainbowtv.domain.notice.infra.data.entity.QNoticeEntity notice;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerEntity(String variable) {
        this(BannerEntity.class, forVariable(variable), INITS);
    }

    public QBannerEntity(Path<? extends BannerEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerEntity(PathMetadata metadata, PathInits inits) {
        this(BannerEntity.class, metadata, inits);
    }

    public QBannerEntity(Class<? extends BannerEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.mediaCategory = inits.isInitialized("mediaCategory") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity(forProperty("mediaCategory")) : null;
        this.notice = inits.isInitialized("notice") ? new com.cmb.rainbowtv.domain.notice.infra.data.entity.QNoticeEntity(forProperty("notice"), inits.get("notice")) : null;
    }

}

