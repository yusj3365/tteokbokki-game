package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerByAgeEntity is a Querydsl query type for BannerByAgeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerByAgeEntity extends EntityPathBase<BannerByAgeEntity> {

    private static final long serialVersionUID = 445320425L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerByAgeEntity bannerByAgeEntity = new QBannerByAgeEntity("bannerByAgeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QBannerEntity banner;

    public final NumberPath<Long> bbaIdx = createNumber("bbaIdx", Long.class);

    public final NumberPath<Integer> bbaType = createNumber("bbaType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerByAgeEntity(String variable) {
        this(BannerByAgeEntity.class, forVariable(variable), INITS);
    }

    public QBannerByAgeEntity(Path<? extends BannerByAgeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerByAgeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerByAgeEntity(PathMetadata metadata, PathInits inits) {
        this(BannerByAgeEntity.class, metadata, inits);
    }

    public QBannerByAgeEntity(Class<? extends BannerByAgeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.banner = inits.isInitialized("banner") ? new QBannerEntity(forProperty("banner"), inits.get("banner")) : null;
    }

}

