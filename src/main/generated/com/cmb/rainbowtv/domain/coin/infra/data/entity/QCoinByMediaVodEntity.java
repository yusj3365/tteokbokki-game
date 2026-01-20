package com.cmb.rainbowtv.domain.coin.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoinByMediaVodEntity is a Querydsl query type for CoinByMediaVodEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoinByMediaVodEntity extends EntityPathBase<CoinByMediaVodEntity> {

    private static final long serialVersionUID = -1714740765L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoinByMediaVodEntity coinByMediaVodEntity = new QCoinByMediaVodEntity("coinByMediaVodEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cbmvIdx = createNumber("cbmvIdx", Long.class);

    public final QCoinEntity coin;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaVodTradeHistoryEntity mediaVodTradeHistory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoinByMediaVodEntity(String variable) {
        this(CoinByMediaVodEntity.class, forVariable(variable), INITS);
    }

    public QCoinByMediaVodEntity(Path<? extends CoinByMediaVodEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoinByMediaVodEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoinByMediaVodEntity(PathMetadata metadata, PathInits inits) {
        this(CoinByMediaVodEntity.class, metadata, inits);
    }

    public QCoinByMediaVodEntity(Class<? extends CoinByMediaVodEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoinEntity(forProperty("coin"), inits.get("coin")) : null;
        this.mediaVodTradeHistory = inits.isInitialized("mediaVodTradeHistory") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaVodTradeHistoryEntity(forProperty("mediaVodTradeHistory"), inits.get("mediaVodTradeHistory")) : null;
    }

}

