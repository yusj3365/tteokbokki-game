package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentDenyReasonEntity is a Querydsl query type for AdvertiseContentDenyReasonEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentDenyReasonEntity extends EntityPathBase<AdvertiseContentDenyReasonEntity> {

    private static final long serialVersionUID = -949962686L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentDenyReasonEntity advertiseContentDenyReasonEntity = new QAdvertiseContentDenyReasonEntity("advertiseContentDenyReasonEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acdrIdx = createNumber("acdrIdx", Long.class);

    public final StringPath acdrReason = createString("acdrReason");

    public final QAdvertiseContentEntity advertiseContent;

    public final QAdvertiseContentDetailEntity advertiseContentDetail;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentDenyReasonEntity(String variable) {
        this(AdvertiseContentDenyReasonEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentDenyReasonEntity(Path<? extends AdvertiseContentDenyReasonEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentDenyReasonEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentDenyReasonEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentDenyReasonEntity.class, metadata, inits);
    }

    public QAdvertiseContentDenyReasonEntity(Class<? extends AdvertiseContentDenyReasonEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContent = inits.isInitialized("advertiseContent") ? new QAdvertiseContentEntity(forProperty("advertiseContent"), inits.get("advertiseContent")) : null;
        this.advertiseContentDetail = inits.isInitialized("advertiseContentDetail") ? new QAdvertiseContentDetailEntity(forProperty("advertiseContentDetail"), inits.get("advertiseContentDetail")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

