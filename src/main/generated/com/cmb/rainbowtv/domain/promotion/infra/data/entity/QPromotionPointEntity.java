package com.cmb.rainbowtv.domain.promotion.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPromotionPointEntity is a Querydsl query type for PromotionPointEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPromotionPointEntity extends EntityPathBase<PromotionPointEntity> {

    private static final long serialVersionUID = -1874261295L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPromotionPointEntity promotionPointEntity = new QPromotionPointEntity("promotionPointEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCommonPromotionEntity commonPromotion;

    public final NumberPath<Long> cpIdx = createNumber("cpIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> ppPoint = createNumber("ppPoint", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPromotionPointEntity(String variable) {
        this(PromotionPointEntity.class, forVariable(variable), INITS);
    }

    public QPromotionPointEntity(Path<? extends PromotionPointEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPromotionPointEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPromotionPointEntity(PathMetadata metadata, PathInits inits) {
        this(PromotionPointEntity.class, metadata, inits);
    }

    public QPromotionPointEntity(Class<? extends PromotionPointEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.commonPromotion = inits.isInitialized("commonPromotion") ? new QCommonPromotionEntity(forProperty("commonPromotion"), inits.get("commonPromotion")) : null;
    }

}

