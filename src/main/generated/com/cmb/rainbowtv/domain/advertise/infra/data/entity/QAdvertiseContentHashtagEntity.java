package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentHashtagEntity is a Querydsl query type for AdvertiseContentHashtagEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentHashtagEntity extends EntityPathBase<AdvertiseContentHashtagEntity> {

    private static final long serialVersionUID = 1420121184L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentHashtagEntity advertiseContentHashtagEntity = new QAdvertiseContentHashtagEntity("advertiseContentHashtagEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> achtIdx = createNumber("achtIdx", Long.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.hashtag.infra.data.entity.QHashtagEntity hashtag;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentHashtagEntity(String variable) {
        this(AdvertiseContentHashtagEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentHashtagEntity(Path<? extends AdvertiseContentHashtagEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentHashtagEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentHashtagEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentHashtagEntity.class, metadata, inits);
    }

    public QAdvertiseContentHashtagEntity(Class<? extends AdvertiseContentHashtagEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
        this.hashtag = inits.isInitialized("hashtag") ? new com.cmb.rainbowtv.domain.hashtag.infra.data.entity.QHashtagEntity(forProperty("hashtag")) : null;
    }

}

