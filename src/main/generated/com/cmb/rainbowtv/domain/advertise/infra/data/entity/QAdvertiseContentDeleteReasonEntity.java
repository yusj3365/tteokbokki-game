package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentDeleteReasonEntity is a Querydsl query type for AdvertiseContentDeleteReasonEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentDeleteReasonEntity extends EntityPathBase<AdvertiseContentDeleteReasonEntity> {

    private static final long serialVersionUID = 1437323681L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentDeleteReasonEntity advertiseContentDeleteReasonEntity = new QAdvertiseContentDeleteReasonEntity("advertiseContentDeleteReasonEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acdrIdx = createNumber("acdrIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDeleteReasonTypeEnum> acdrReason = createEnum("acdrReason", com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDeleteReasonTypeEnum.class);

    public final QAdvertiseContentEntity advertiseContent;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentDeleteReasonEntity(String variable) {
        this(AdvertiseContentDeleteReasonEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentDeleteReasonEntity(Path<? extends AdvertiseContentDeleteReasonEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentDeleteReasonEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentDeleteReasonEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentDeleteReasonEntity.class, metadata, inits);
    }

    public QAdvertiseContentDeleteReasonEntity(Class<? extends AdvertiseContentDeleteReasonEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContent = inits.isInitialized("advertiseContent") ? new QAdvertiseContentEntity(forProperty("advertiseContent"), inits.get("advertiseContent")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

