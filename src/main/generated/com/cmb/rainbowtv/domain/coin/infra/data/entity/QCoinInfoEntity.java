package com.cmb.rainbowtv.domain.coin.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoinInfoEntity is a Querydsl query type for CoinInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoinInfoEntity extends EntityPathBase<CoinInfoEntity> {

    private static final long serialVersionUID = 936993875L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoinInfoEntity coinInfoEntity = new QCoinInfoEntity("coinInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> ciCoin = createNumber("ciCoin", Long.class);

    public final DatePath<java.time.LocalDate> ciExpireDate = createDate("ciExpireDate", java.time.LocalDate.class);

    public final NumberPath<Long> ciIdx = createNumber("ciIdx", Long.class);

    public final NumberPath<Long> ciParent = createNumber("ciParent", Long.class);

    public final QCoinEntity coin;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoinInfoEntity(String variable) {
        this(CoinInfoEntity.class, forVariable(variable), INITS);
    }

    public QCoinInfoEntity(Path<? extends CoinInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoinInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoinInfoEntity(PathMetadata metadata, PathInits inits) {
        this(CoinInfoEntity.class, metadata, inits);
    }

    public QCoinInfoEntity(Class<? extends CoinInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoinEntity(forProperty("coin"), inits.get("coin")) : null;
    }

}

