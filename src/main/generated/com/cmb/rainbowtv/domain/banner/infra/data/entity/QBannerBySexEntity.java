package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerBySexEntity is a Querydsl query type for BannerBySexEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerBySexEntity extends EntityPathBase<BannerBySexEntity> {

    private static final long serialVersionUID = -1532041456L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerBySexEntity bannerBySexEntity = new QBannerBySexEntity("bannerBySexEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QBannerEntity banner;

    public final NumberPath<Long> bbsIdx = createNumber("bbsIdx", Long.class);

    public final NumberPath<Integer> bbsSex = createNumber("bbsSex", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerBySexEntity(String variable) {
        this(BannerBySexEntity.class, forVariable(variable), INITS);
    }

    public QBannerBySexEntity(Path<? extends BannerBySexEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerBySexEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerBySexEntity(PathMetadata metadata, PathInits inits) {
        this(BannerBySexEntity.class, metadata, inits);
    }

    public QBannerBySexEntity(Class<? extends BannerBySexEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.banner = inits.isInitialized("banner") ? new QBannerEntity(forProperty("banner"), inits.get("banner")) : null;
    }

}

