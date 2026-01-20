package com.cmb.rainbowtv.domain.promotion.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPromotionByTradeEntity is a Querydsl query type for PromotionByTradeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPromotionByTradeEntity extends EntityPathBase<PromotionByTradeEntity> {

    private static final long serialVersionUID = -444240050L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPromotionByTradeEntity promotionByTradeEntity = new QPromotionByTradeEntity("promotionByTradeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> pbtIdx = createNumber("pbtIdx", Long.class);

    public final com.cmb.rainbowtv.domain.prize.infra.data.entity.QPrizeTradeHistoryEntity prizeTradeHistory;

    public final QPromotionRegistrantEntity promotionRegistrant;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPromotionByTradeEntity(String variable) {
        this(PromotionByTradeEntity.class, forVariable(variable), INITS);
    }

    public QPromotionByTradeEntity(Path<? extends PromotionByTradeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPromotionByTradeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPromotionByTradeEntity(PathMetadata metadata, PathInits inits) {
        this(PromotionByTradeEntity.class, metadata, inits);
    }

    public QPromotionByTradeEntity(Class<? extends PromotionByTradeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.prizeTradeHistory = inits.isInitialized("prizeTradeHistory") ? new com.cmb.rainbowtv.domain.prize.infra.data.entity.QPrizeTradeHistoryEntity(forProperty("prizeTradeHistory"), inits.get("prizeTradeHistory")) : null;
        this.promotionRegistrant = inits.isInitialized("promotionRegistrant") ? new QPromotionRegistrantEntity(forProperty("promotionRegistrant"), inits.get("promotionRegistrant")) : null;
    }

}

