package com.cmb.rainbowtv.domain.promotion.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPromotionPrizeEntity is a Querydsl query type for PromotionPrizeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPromotionPrizeEntity extends EntityPathBase<PromotionPrizeEntity> {

    private static final long serialVersionUID = 842399699L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPromotionPrizeEntity promotionPrizeEntity = new QPromotionPrizeEntity("promotionPrizeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCommonPromotionEntity commonPromotion;

    public final NumberPath<Long> cpIdx = createNumber("cpIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.prize.infra.data.entity.QPrizeEntity prize;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPromotionPrizeEntity(String variable) {
        this(PromotionPrizeEntity.class, forVariable(variable), INITS);
    }

    public QPromotionPrizeEntity(Path<? extends PromotionPrizeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPromotionPrizeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPromotionPrizeEntity(PathMetadata metadata, PathInits inits) {
        this(PromotionPrizeEntity.class, metadata, inits);
    }

    public QPromotionPrizeEntity(Class<? extends PromotionPrizeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.commonPromotion = inits.isInitialized("commonPromotion") ? new QCommonPromotionEntity(forProperty("commonPromotion"), inits.get("commonPromotion")) : null;
        this.prize = inits.isInitialized("prize") ? new com.cmb.rainbowtv.domain.prize.infra.data.entity.QPrizeEntity(forProperty("prize")) : null;
    }

}

