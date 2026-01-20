package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseMetadataEntity is a Querydsl query type for AdvertiseMetadataEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseMetadataEntity extends EntityPathBase<AdvertiseMetadataEntity> {

    private static final long serialVersionUID = 904684796L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseMetadataEntity advertiseMetadataEntity = new QAdvertiseMetadataEntity("advertiseMetadataEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QAdvertiseContentEntity advertiseContent;

    public final NumberPath<Long> amIdx = createNumber("amIdx", Long.class);

    public final StringPath amKeywords = createString("amKeywords");

    public final StringPath amProducer = createString("amProducer");

    public final StringPath amSynopsis = createString("amSynopsis");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseMetadataEntity(String variable) {
        this(AdvertiseMetadataEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseMetadataEntity(Path<? extends AdvertiseMetadataEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseMetadataEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseMetadataEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseMetadataEntity.class, metadata, inits);
    }

    public QAdvertiseMetadataEntity(Class<? extends AdvertiseMetadataEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContent = inits.isInitialized("advertiseContent") ? new QAdvertiseContentEntity(forProperty("advertiseContent"), inits.get("advertiseContent")) : null;
    }

}

