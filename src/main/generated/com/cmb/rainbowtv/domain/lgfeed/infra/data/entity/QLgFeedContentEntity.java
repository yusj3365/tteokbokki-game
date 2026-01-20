package com.cmb.rainbowtv.domain.lgfeed.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLgFeedContentEntity is a Querydsl query type for LgFeedContentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLgFeedContentEntity extends EntityPathBase<LgFeedContentEntity> {

    private static final long serialVersionUID = -46733510L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLgFeedContentEntity lgFeedContentEntity = new QLgFeedContentEntity("lgFeedContentEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath lfcDeeplinkId = createString("lfcDeeplinkId");

    public final NumberPath<Long> lfcIdx = createNumber("lfcIdx", Long.class);

    public final NumberPath<Long> lfcSeq = createNumber("lfcSeq", Long.class);

    public final StringPath lfcThumbUrl = createString("lfcThumbUrl");

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity mediaCategory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QLgFeedContentEntity(String variable) {
        this(LgFeedContentEntity.class, forVariable(variable), INITS);
    }

    public QLgFeedContentEntity(Path<? extends LgFeedContentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLgFeedContentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLgFeedContentEntity(PathMetadata metadata, PathInits inits) {
        this(LgFeedContentEntity.class, metadata, inits);
    }

    public QLgFeedContentEntity(Class<? extends LgFeedContentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.mediaCategory = inits.isInitialized("mediaCategory") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity(forProperty("mediaCategory")) : null;
    }

}

