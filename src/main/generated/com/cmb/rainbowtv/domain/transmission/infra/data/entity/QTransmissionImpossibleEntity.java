package com.cmb.rainbowtv.domain.transmission.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransmissionImpossibleEntity is a Querydsl query type for TransmissionImpossibleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTransmissionImpossibleEntity extends EntityPathBase<TransmissionImpossibleEntity> {

    private static final long serialVersionUID = 1575795994L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransmissionImpossibleEntity transmissionImpossibleEntity = new QTransmissionImpossibleEntity("transmissionImpossibleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelEntity channel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> tiEndTime = createDateTime("tiEndTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> tiIdx = createNumber("tiIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> tiStartTime = createDateTime("tiStartTime", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTransmissionImpossibleEntity(String variable) {
        this(TransmissionImpossibleEntity.class, forVariable(variable), INITS);
    }

    public QTransmissionImpossibleEntity(Path<? extends TransmissionImpossibleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransmissionImpossibleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransmissionImpossibleEntity(PathMetadata metadata, PathInits inits) {
        this(TransmissionImpossibleEntity.class, metadata, inits);
    }

    public QTransmissionImpossibleEntity(Class<? extends TransmissionImpossibleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelEntity(forProperty("channel")) : null;
    }

}

