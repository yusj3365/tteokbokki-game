package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentAreaDefineEntity is a Querydsl query type for AdvertiseContentAreaDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentAreaDefineEntity extends EntityPathBase<AdvertiseContentAreaDefineEntity> {

    private static final long serialVersionUID = -1328716934L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentAreaDefineEntity advertiseContentAreaDefineEntity = new QAdvertiseContentAreaDefineEntity("advertiseContentAreaDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acadIdx = createNumber("acadIdx", Long.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentAreaDefineEntity(String variable) {
        this(AdvertiseContentAreaDefineEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentAreaDefineEntity(Path<? extends AdvertiseContentAreaDefineEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentAreaDefineEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentAreaDefineEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentAreaDefineEntity.class, metadata, inits);
    }

    public QAdvertiseContentAreaDefineEntity(Class<? extends AdvertiseContentAreaDefineEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
    }

}

