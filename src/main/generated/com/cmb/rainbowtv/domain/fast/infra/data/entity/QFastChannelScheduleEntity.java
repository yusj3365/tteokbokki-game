package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelScheduleEntity is a Querydsl query type for FastChannelScheduleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelScheduleEntity extends EntityPathBase<FastChannelScheduleEntity> {

    private static final long serialVersionUID = 1876148795L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelScheduleEntity fastChannelScheduleEntity = new QFastChannelScheduleEntity("fastChannelScheduleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final ArrayPath<byte[], Byte> fcData = createArray("fcData", byte[].class);

    public final NumberPath<Long> fcsIdx = createNumber("fcsIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelScheduleEntity(String variable) {
        this(FastChannelScheduleEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelScheduleEntity(Path<? extends FastChannelScheduleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelScheduleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelScheduleEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelScheduleEntity.class, metadata, inits);
    }

    public QFastChannelScheduleEntity(Class<? extends FastChannelScheduleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
    }

}

