package com.cmb.rainbowtv.domain.transmission.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransmissionImpossibleDeviceEntity is a Querydsl query type for TransmissionImpossibleDeviceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTransmissionImpossibleDeviceEntity extends EntityPathBase<TransmissionImpossibleDeviceEntity> {

    private static final long serialVersionUID = -1359599152L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransmissionImpossibleDeviceEntity transmissionImpossibleDeviceEntity = new QTransmissionImpossibleDeviceEntity("transmissionImpossibleDeviceEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> tidIdx = createNumber("tidIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.transmission.model.enums.TidTypeEnum> tidType = createEnum("tidType", com.cmb.rainbowtv.domain.transmission.model.enums.TidTypeEnum.class);

    public final QTransmissionImpossibleEntity transmissionImpossible;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTransmissionImpossibleDeviceEntity(String variable) {
        this(TransmissionImpossibleDeviceEntity.class, forVariable(variable), INITS);
    }

    public QTransmissionImpossibleDeviceEntity(Path<? extends TransmissionImpossibleDeviceEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransmissionImpossibleDeviceEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransmissionImpossibleDeviceEntity(PathMetadata metadata, PathInits inits) {
        this(TransmissionImpossibleDeviceEntity.class, metadata, inits);
    }

    public QTransmissionImpossibleDeviceEntity(Class<? extends TransmissionImpossibleDeviceEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.transmissionImpossible = inits.isInitialized("transmissionImpossible") ? new QTransmissionImpossibleEntity(forProperty("transmissionImpossible"), inits.get("transmissionImpossible")) : null;
    }

}

