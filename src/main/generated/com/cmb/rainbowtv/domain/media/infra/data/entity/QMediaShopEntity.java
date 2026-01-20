package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaShopEntity is a Querydsl query type for MediaShopEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaShopEntity extends EntityPathBase<MediaShopEntity> {

    private static final long serialVersionUID = 1352505725L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaShopEntity mediaShopEntity = new QMediaShopEntity("mediaShopEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MsAgeEnum> msAge = createEnum("msAge", com.cmb.rainbowtv.domain.media.model.enums.MsAgeEnum.class);

    public final StringPath msButtonName = createString("msButtonName");

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MsCategoryEnum> msCategory = createEnum("msCategory", com.cmb.rainbowtv.domain.media.model.enums.MsCategoryEnum.class);

    public final StringPath msCompany = createString("msCompany");

    public final StringPath msHp = createString("msHp");

    public final NumberPath<Long> msIdx = createNumber("msIdx", Long.class);

    public final NumberPath<Integer> msStatus = createNumber("msStatus", Integer.class);

    public final NumberPath<Integer> msType = createNumber("msType", Integer.class);

    public final StringPath msWebUrl = createString("msWebUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaShopEntity(String variable) {
        this(MediaShopEntity.class, forVariable(variable), INITS);
    }

    public QMediaShopEntity(Path<? extends MediaShopEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaShopEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaShopEntity(PathMetadata metadata, PathInits inits) {
        this(MediaShopEntity.class, metadata, inits);
    }

    public QMediaShopEntity(Class<? extends MediaShopEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

