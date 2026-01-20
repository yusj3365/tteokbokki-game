package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentLinkEntity is a Querydsl query type for AdvertiseContentLinkEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentLinkEntity extends EntityPathBase<AdvertiseContentLinkEntity> {

    private static final long serialVersionUID = 2049121420L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentLinkEntity advertiseContentLinkEntity = new QAdvertiseContentLinkEntity("advertiseContentLinkEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> aclIdx = createNumber("aclIdx", Long.class);

    public final NumberPath<Long> aclKey = createNumber("aclKey", Long.class);

    public final StringPath aclLink = createString("aclLink");

    public final NumberPath<Integer> aclLinkEnabled = createNumber("aclLinkEnabled", Integer.class);

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentLinkTypeEnum> advertiseContentLinkType = createEnum("advertiseContentLinkType", com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentLinkTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentLinkEntity(String variable) {
        this(AdvertiseContentLinkEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentLinkEntity(Path<? extends AdvertiseContentLinkEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentLinkEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentLinkEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentLinkEntity.class, metadata, inits);
    }

    public QAdvertiseContentLinkEntity(Class<? extends AdvertiseContentLinkEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
    }

}

