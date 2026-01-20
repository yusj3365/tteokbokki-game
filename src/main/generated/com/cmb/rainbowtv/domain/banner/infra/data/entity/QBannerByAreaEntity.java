package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerByAreaEntity is a Querydsl query type for BannerByAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerByAreaEntity extends EntityPathBase<BannerByAreaEntity> {

    private static final long serialVersionUID = 414148745L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerByAreaEntity bannerByAreaEntity = new QBannerByAreaEntity("bannerByAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath adShortSi = createString("adShortSi");

    public final QBannerEntity banner;

    public final NumberPath<Long> bbaIdx = createNumber("bbaIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerByAreaEntity(String variable) {
        this(BannerByAreaEntity.class, forVariable(variable), INITS);
    }

    public QBannerByAreaEntity(Path<? extends BannerByAreaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerByAreaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerByAreaEntity(PathMetadata metadata, PathInits inits) {
        this(BannerByAreaEntity.class, metadata, inits);
    }

    public QBannerByAreaEntity(Class<? extends BannerByAreaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.banner = inits.isInitialized("banner") ? new QBannerEntity(forProperty("banner"), inits.get("banner")) : null;
    }

}

