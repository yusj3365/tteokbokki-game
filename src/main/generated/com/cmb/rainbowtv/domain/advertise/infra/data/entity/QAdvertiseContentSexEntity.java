package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentSexEntity is a Querydsl query type for AdvertiseContentSexEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentSexEntity extends EntityPathBase<AdvertiseContentSexEntity> {

    private static final long serialVersionUID = -1064015366L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentSexEntity advertiseContentSexEntity = new QAdvertiseContentSexEntity("advertiseContentSexEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acsIdx = createNumber("acsIdx", Long.class);

    public final NumberPath<Integer> acsSex = createNumber("acsSex", Integer.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentSexEntity(String variable) {
        this(AdvertiseContentSexEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentSexEntity(Path<? extends AdvertiseContentSexEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentSexEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentSexEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentSexEntity.class, metadata, inits);
    }

    public QAdvertiseContentSexEntity(Class<? extends AdvertiseContentSexEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
    }

}

