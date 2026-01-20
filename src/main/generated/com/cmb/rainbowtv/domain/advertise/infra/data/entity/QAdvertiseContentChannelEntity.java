package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentChannelEntity is a Querydsl query type for AdvertiseContentChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentChannelEntity extends EntityPathBase<AdvertiseContentChannelEntity> {

    private static final long serialVersionUID = 1375670359L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentChannelEntity advertiseContentChannelEntity = new QAdvertiseContentChannelEntity("advertiseContentChannelEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> accIdx = createNumber("accIdx", Long.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.MediaCategoryTypeEnum> mcType = createEnum("mcType", com.cmb.rainbowtv.domain.advertise.model.enums.MediaCategoryTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentChannelEntity(String variable) {
        this(AdvertiseContentChannelEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentChannelEntity(Path<? extends AdvertiseContentChannelEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentChannelEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentChannelEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentChannelEntity.class, metadata, inits);
    }

    public QAdvertiseContentChannelEntity(Class<? extends AdvertiseContentChannelEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
    }

}

