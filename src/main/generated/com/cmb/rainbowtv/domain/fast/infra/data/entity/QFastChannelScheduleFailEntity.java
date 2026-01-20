package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelScheduleFailEntity is a Querydsl query type for FastChannelScheduleFailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelScheduleFailEntity extends EntityPathBase<FastChannelScheduleFailEntity> {

    private static final long serialVersionUID = 1134512889L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelScheduleFailEntity fastChannelScheduleFailEntity = new QFastChannelScheduleFailEntity("fastChannelScheduleFailEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final NumberPath<Long> fcsfIdx = createNumber("fcsfIdx", Long.class);

    public final StringPath fcUuid = createString("fcUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelScheduleFailEntity(String variable) {
        this(FastChannelScheduleFailEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelScheduleFailEntity(Path<? extends FastChannelScheduleFailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelScheduleFailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelScheduleFailEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelScheduleFailEntity.class, metadata, inits);
    }

    public QFastChannelScheduleFailEntity(Class<? extends FastChannelScheduleFailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
    }

}

