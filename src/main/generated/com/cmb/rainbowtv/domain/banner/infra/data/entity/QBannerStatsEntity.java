package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerStatsEntity is a Querydsl query type for BannerStatsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerStatsEntity extends EntityPathBase<BannerStatsEntity> {

    private static final long serialVersionUID = -337634528L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerStatsEntity bannerStatsEntity = new QBannerStatsEntity("bannerStatsEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QBannerEntity banner;

    public final NumberPath<Long> bsClickCnt = createNumber("bsClickCnt", Long.class);

    public final NumberPath<Long> bsIdx = createNumber("bsIdx", Long.class);

    public final NumberPath<Integer> bsType = createNumber("bsType", Integer.class);

    public final NumberPath<Long> bsViewCnt = createNumber("bsViewCnt", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerStatsEntity(String variable) {
        this(BannerStatsEntity.class, forVariable(variable), INITS);
    }

    public QBannerStatsEntity(Path<? extends BannerStatsEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerStatsEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerStatsEntity(PathMetadata metadata, PathInits inits) {
        this(BannerStatsEntity.class, metadata, inits);
    }

    public QBannerStatsEntity(Class<? extends BannerStatsEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.banner = inits.isInitialized("banner") ? new QBannerEntity(forProperty("banner"), inits.get("banner")) : null;
    }

}

