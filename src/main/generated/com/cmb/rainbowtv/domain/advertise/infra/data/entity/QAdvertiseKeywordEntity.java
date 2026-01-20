package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseKeywordEntity is a Querydsl query type for AdvertiseKeywordEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseKeywordEntity extends EntityPathBase<AdvertiseKeywordEntity> {

    private static final long serialVersionUID = -314418974L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseKeywordEntity advertiseKeywordEntity = new QAdvertiseKeywordEntity("advertiseKeywordEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QAdvertiseMetadataEntity advertiseMetadata;

    public final NumberPath<Long> akIdx = createNumber("akIdx", Long.class);

    public final StringPath akKeyword = createString("akKeyword");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseKeywordEntity(String variable) {
        this(AdvertiseKeywordEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseKeywordEntity(Path<? extends AdvertiseKeywordEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseKeywordEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseKeywordEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseKeywordEntity.class, metadata, inits);
    }

    public QAdvertiseKeywordEntity(Class<? extends AdvertiseKeywordEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseMetadata = inits.isInitialized("advertiseMetadata") ? new QAdvertiseMetadataEntity(forProperty("advertiseMetadata"), inits.get("advertiseMetadata")) : null;
    }

}

