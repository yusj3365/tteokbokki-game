package com.cmb.rainbowtv.domain.coin.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoinByMediaShopEntity is a Querydsl query type for CoinByMediaShopEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoinByMediaShopEntity extends EntityPathBase<CoinByMediaShopEntity> {

    private static final long serialVersionUID = -940558396L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoinByMediaShopEntity coinByMediaShopEntity = new QCoinByMediaShopEntity("coinByMediaShopEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cbmsIdx = createNumber("cbmsIdx", Long.class);

    public final QCoinEntity coin;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaShopTradeHistoryEntity mediaShopTradeHistory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoinByMediaShopEntity(String variable) {
        this(CoinByMediaShopEntity.class, forVariable(variable), INITS);
    }

    public QCoinByMediaShopEntity(Path<? extends CoinByMediaShopEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoinByMediaShopEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoinByMediaShopEntity(PathMetadata metadata, PathInits inits) {
        this(CoinByMediaShopEntity.class, metadata, inits);
    }

    public QCoinByMediaShopEntity(Class<? extends CoinByMediaShopEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoinEntity(forProperty("coin"), inits.get("coin")) : null;
        this.mediaShopTradeHistory = inits.isInitialized("mediaShopTradeHistory") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaShopTradeHistoryEntity(forProperty("mediaShopTradeHistory"), inits.get("mediaShopTradeHistory")) : null;
    }

}

