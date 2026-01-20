package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBannerByMemberEntity is a Querydsl query type for BannerByMemberEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBannerByMemberEntity extends EntityPathBase<BannerByMemberEntity> {

    private static final long serialVersionUID = 764353174L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBannerByMemberEntity bannerByMemberEntity = new QBannerByMemberEntity("bannerByMemberEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QBannerEntity banner;

    public final NumberPath<Long> bbmIdx = createNumber("bbmIdx", Long.class);

    public final NumberPath<Integer> bbmType = createNumber("bbmType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBannerByMemberEntity(String variable) {
        this(BannerByMemberEntity.class, forVariable(variable), INITS);
    }

    public QBannerByMemberEntity(Path<? extends BannerByMemberEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBannerByMemberEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBannerByMemberEntity(PathMetadata metadata, PathInits inits) {
        this(BannerByMemberEntity.class, metadata, inits);
    }

    public QBannerByMemberEntity(Class<? extends BannerByMemberEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.banner = inits.isInitialized("banner") ? new QBannerEntity(forProperty("banner"), inits.get("banner")) : null;
    }

}

