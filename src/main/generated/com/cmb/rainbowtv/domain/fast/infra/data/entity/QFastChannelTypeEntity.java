package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelTypeEntity is a Querydsl query type for FastChannelTypeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelTypeEntity extends EntityPathBase<FastChannelTypeEntity> {

    private static final long serialVersionUID = 247599390L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelTypeEntity fastChannelTypeEntity = new QFastChannelTypeEntity("fastChannelTypeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final NumberPath<Long> fctIdx = createNumber("fctIdx", Long.class);

    public final NumberPath<Long> fctType = createNumber("fctType", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelTypeEntity(String variable) {
        this(FastChannelTypeEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelTypeEntity(Path<? extends FastChannelTypeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelTypeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelTypeEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelTypeEntity.class, metadata, inits);
    }

    public QFastChannelTypeEntity(Class<? extends FastChannelTypeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
    }

}

