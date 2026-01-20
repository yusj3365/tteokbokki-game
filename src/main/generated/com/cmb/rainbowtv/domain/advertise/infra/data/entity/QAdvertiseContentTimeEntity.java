package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentTimeEntity is a Querydsl query type for AdvertiseContentTimeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentTimeEntity extends EntityPathBase<AdvertiseContentTimeEntity> {

    private static final long serialVersionUID = 1999115551L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentTimeEntity advertiseContentTimeEntity = new QAdvertiseContentTimeEntity("advertiseContentTimeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> actIdx = createNumber("actIdx", Long.class);

    public final NumberPath<Integer> actType = createNumber("actType", Integer.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentTimeEntity(String variable) {
        this(AdvertiseContentTimeEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentTimeEntity(Path<? extends AdvertiseContentTimeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentTimeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentTimeEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentTimeEntity.class, metadata, inits);
    }

    public QAdvertiseContentTimeEntity(Class<? extends AdvertiseContentTimeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
    }

}

