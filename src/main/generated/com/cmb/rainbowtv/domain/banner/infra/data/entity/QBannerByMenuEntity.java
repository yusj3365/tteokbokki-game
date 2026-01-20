package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerByMenuEntity is a Querydsl query type for BannerByMenuEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerByMenuEntity extends EntityPathBase<BannerByMenuEntity> {

    private static final long serialVersionUID = -846313509L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerByMenuEntity bannerByMenuEntity = new QBannerByMenuEntity("bannerByMenuEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QBannerEntity banner;

    public final NumberPath<Long> bbmIdx = createNumber("bbmIdx", Long.class);

    public final StringPath bbmType = createString("bbmType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerByMenuEntity(String variable) {
        this(BannerByMenuEntity.class, forVariable(variable), INITS);
    }

    public QBannerByMenuEntity(Path<? extends BannerByMenuEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerByMenuEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerByMenuEntity(PathMetadata metadata, PathInits inits) {
        this(BannerByMenuEntity.class, metadata, inits);
    }

    public QBannerByMenuEntity(Class<? extends BannerByMenuEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.banner = inits.isInitialized("banner") ? new QBannerEntity(forProperty("banner"), inits.get("banner")) : null;
    }

}

