package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentPeriodEntity is a Querydsl query type for AdvertiseContentPeriodEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentPeriodEntity extends EntityPathBase<AdvertiseContentPeriodEntity> {

    private static final long serialVersionUID = -1683723949L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentPeriodEntity advertiseContentPeriodEntity = new QAdvertiseContentPeriodEntity("advertiseContentPeriodEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acpIdx = createNumber("acpIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> acpPostEd = createDateTime("acpPostEd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> acpPostSt = createDateTime("acpPostSt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> acpSeq = createNumber("acpSeq", Integer.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentPeriodEntity(String variable) {
        this(AdvertiseContentPeriodEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentPeriodEntity(Path<? extends AdvertiseContentPeriodEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentPeriodEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentPeriodEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentPeriodEntity.class, metadata, inits);
    }

    public QAdvertiseContentPeriodEntity(Class<? extends AdvertiseContentPeriodEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
    }

}

