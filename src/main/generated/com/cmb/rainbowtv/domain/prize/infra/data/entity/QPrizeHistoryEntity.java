package com.cmb.rainbowtv.domain.prize.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPrizeHistoryEntity is a Querydsl query type for PrizeHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrizeHistoryEntity extends EntityPathBase<PrizeHistoryEntity> {

    private static final long serialVersionUID = 398901047L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPrizeHistoryEntity prizeHistoryEntity = new QPrizeHistoryEntity("prizeHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.coin.infra.data.entity.QCoinEntity coin;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> phIdx = createNumber("phIdx", Long.class);

    public final NumberPath<Integer> phStatus = createNumber("phStatus", Integer.class);

    public final QPrizeEntity prize;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPrizeHistoryEntity(String variable) {
        this(PrizeHistoryEntity.class, forVariable(variable), INITS);
    }

    public QPrizeHistoryEntity(Path<? extends PrizeHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPrizeHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPrizeHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(PrizeHistoryEntity.class, metadata, inits);
    }

    public QPrizeHistoryEntity(Class<? extends PrizeHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new com.cmb.rainbowtv.domain.coin.infra.data.entity.QCoinEntity(forProperty("coin"), inits.get("coin")) : null;
        this.prize = inits.isInitialized("prize") ? new QPrizeEntity(forProperty("prize")) : null;
    }

}

