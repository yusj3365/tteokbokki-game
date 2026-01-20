package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentFeeEntity is a Querydsl query type for AdvertiseContentFeeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentFeeEntity extends EntityPathBase<AdvertiseContentFeeEntity> {

    private static final long serialVersionUID = 1275355418L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentFeeEntity advertiseContentFeeEntity = new QAdvertiseContentFeeEntity("advertiseContentFeeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acfIdx = createNumber("acfIdx", Long.class);

    public final NumberPath<Integer> acfInvest = createNumber("acfInvest", Integer.class);

    public final NumberPath<Integer> acfRate = createNumber("acfRate", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentFeeTypeEnum> acfType = createEnum("acfType", com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentFeeTypeEnum.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentFeeEntity(String variable) {
        this(AdvertiseContentFeeEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentFeeEntity(Path<? extends AdvertiseContentFeeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentFeeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentFeeEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentFeeEntity.class, metadata, inits);
    }

    public QAdvertiseContentFeeEntity(Class<? extends AdvertiseContentFeeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
    }

}

