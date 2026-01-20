package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerByAiEntity is a Querydsl query type for BannerByAiEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerByAiEntity extends EntityPathBase<BannerByAiEntity> {

    private static final long serialVersionUID = 1881103908L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerByAiEntity bannerByAiEntity = new QBannerByAiEntity("bannerByAiEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QBannerEntity banner;

    public final NumberPath<Long> bbaIdx = createNumber("bbaIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mcIdx = createNumber("mcIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.MediaCategoryTypeEnum> mcType = createEnum("mcType", com.cmb.rainbowtv.domain.advertise.model.enums.MediaCategoryTypeEnum.class);

    public final NumberPath<Long> mgIdx = createNumber("mgIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerByAiEntity(String variable) {
        this(BannerByAiEntity.class, forVariable(variable), INITS);
    }

    public QBannerByAiEntity(Path<? extends BannerByAiEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerByAiEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerByAiEntity(PathMetadata metadata, PathInits inits) {
        this(BannerByAiEntity.class, metadata, inits);
    }

    public QBannerByAiEntity(Class<? extends BannerByAiEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.banner = inits.isInitialized("banner") ? new QBannerEntity(forProperty("banner"), inits.get("banner")) : null;
    }

}

