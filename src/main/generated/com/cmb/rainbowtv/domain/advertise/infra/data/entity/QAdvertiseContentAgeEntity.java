package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentAgeEntity is a Querydsl query type for AdvertiseContentAgeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentAgeEntity extends EntityPathBase<AdvertiseContentAgeEntity> {

    private static final long serialVersionUID = 913346515L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentAgeEntity advertiseContentAgeEntity = new QAdvertiseContentAgeEntity("advertiseContentAgeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acaIdx = createNumber("acaIdx", Long.class);

    public final NumberPath<Integer> acaType = createNumber("acaType", Integer.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentAgeEntity(String variable) {
        this(AdvertiseContentAgeEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentAgeEntity(Path<? extends AdvertiseContentAgeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentAgeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentAgeEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentAgeEntity.class, metadata, inits);
    }

    public QAdvertiseContentAgeEntity(Class<? extends AdvertiseContentAgeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
    }

}

