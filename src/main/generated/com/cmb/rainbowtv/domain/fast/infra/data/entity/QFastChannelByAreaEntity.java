package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelByAreaEntity is a Querydsl query type for FastChannelByAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelByAreaEntity extends EntityPathBase<FastChannelByAreaEntity> {

    private static final long serialVersionUID = -2037802072L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelByAreaEntity fastChannelByAreaEntity = new QFastChannelByAreaEntity("fastChannelByAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final NumberPath<Long> fcbaIdx = createNumber("fcbaIdx", Long.class);

    public final NumberPath<Integer> fcbaSi = createNumber("fcbaSi", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelByAreaEntity(String variable) {
        this(FastChannelByAreaEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelByAreaEntity(Path<? extends FastChannelByAreaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelByAreaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelByAreaEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelByAreaEntity.class, metadata, inits);
    }

    public QFastChannelByAreaEntity(Class<? extends FastChannelByAreaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
    }

}

