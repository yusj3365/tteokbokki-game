package com.cmb.rainbowtv.domain.promotion.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPromotionByPointEntity is a Querydsl query type for PromotionByPointEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPromotionByPointEntity extends EntityPathBase<PromotionByPointEntity> {

    private static final long serialVersionUID = 2139292282L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPromotionByPointEntity promotionByPointEntity = new QPromotionByPointEntity("promotionByPointEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> pbpIdx = createNumber("pbpIdx", Long.class);

    public final com.cmb.rainbowtv.domain.point.infra.data.entity.QPointEntity point;

    public final QPromotionRegistrantEntity promotionRegistrant;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPromotionByPointEntity(String variable) {
        this(PromotionByPointEntity.class, forVariable(variable), INITS);
    }

    public QPromotionByPointEntity(Path<? extends PromotionByPointEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPromotionByPointEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPromotionByPointEntity(PathMetadata metadata, PathInits inits) {
        this(PromotionByPointEntity.class, metadata, inits);
    }

    public QPromotionByPointEntity(Class<? extends PromotionByPointEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.point = inits.isInitialized("point") ? new com.cmb.rainbowtv.domain.point.infra.data.entity.QPointEntity(forProperty("point"), inits.get("point")) : null;
        this.promotionRegistrant = inits.isInitialized("promotionRegistrant") ? new QPromotionRegistrantEntity(forProperty("promotionRegistrant"), inits.get("promotionRegistrant")) : null;
    }

}

