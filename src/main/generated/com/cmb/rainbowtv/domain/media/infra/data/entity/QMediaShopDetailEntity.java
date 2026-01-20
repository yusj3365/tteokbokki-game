package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaShopDetailEntity is a Querydsl query type for MediaShopDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaShopDetailEntity extends EntityPathBase<MediaShopDetailEntity> {

    private static final long serialVersionUID = -2072559186L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaShopDetailEntity mediaShopDetailEntity = new QMediaShopDetailEntity("mediaShopDetailEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaShopEntity mediaShop;

    public final NumberPath<Long> msdIdx = createNumber("msdIdx", Long.class);

    public final NumberPath<Long> msdSeq = createNumber("msdSeq", Long.class);

    public final StringPath msdText = createString("msdText");

    public final NumberPath<Integer> msdType = createNumber("msdType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaShopDetailEntity(String variable) {
        this(MediaShopDetailEntity.class, forVariable(variable), INITS);
    }

    public QMediaShopDetailEntity(Path<? extends MediaShopDetailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaShopDetailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaShopDetailEntity(PathMetadata metadata, PathInits inits) {
        this(MediaShopDetailEntity.class, metadata, inits);
    }

    public QMediaShopDetailEntity(Class<? extends MediaShopDetailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaShop = inits.isInitialized("mediaShop") ? new QMediaShopEntity(forProperty("mediaShop"), inits.get("mediaShop")) : null;
    }

}

