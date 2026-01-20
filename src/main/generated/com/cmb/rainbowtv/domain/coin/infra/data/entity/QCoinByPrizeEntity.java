package com.cmb.rainbowtv.domain.coin.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoinByPrizeEntity is a Querydsl query type for CoinByPrizeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoinByPrizeEntity extends EntityPathBase<CoinByPrizeEntity> {

    private static final long serialVersionUID = 2085636188L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoinByPrizeEntity coinByPrizeEntity = new QCoinByPrizeEntity("coinByPrizeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cbpIdx = createNumber("cbpIdx", Long.class);

    public final QCoinEntity coin;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.prize.infra.data.entity.QPrizeTradeHistoryEntity prizeTradeHistory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoinByPrizeEntity(String variable) {
        this(CoinByPrizeEntity.class, forVariable(variable), INITS);
    }

    public QCoinByPrizeEntity(Path<? extends CoinByPrizeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoinByPrizeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoinByPrizeEntity(PathMetadata metadata, PathInits inits) {
        this(CoinByPrizeEntity.class, metadata, inits);
    }

    public QCoinByPrizeEntity(Class<? extends CoinByPrizeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoinEntity(forProperty("coin"), inits.get("coin")) : null;
        this.prizeTradeHistory = inits.isInitialized("prizeTradeHistory") ? new com.cmb.rainbowtv.domain.prize.infra.data.entity.QPrizeTradeHistoryEntity(forProperty("prizeTradeHistory"), inits.get("prizeTradeHistory")) : null;
    }

}

