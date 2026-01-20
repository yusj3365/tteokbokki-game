package com.cmb.rainbowtv.domain.prize.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPrizeTradeHistoryEntity is a Querydsl query type for PrizeTradeHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrizeTradeHistoryEntity extends EntityPathBase<PrizeTradeHistoryEntity> {

    private static final long serialVersionUID = 896782579L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPrizeTradeHistoryEntity prizeTradeHistoryEntity = new QPrizeTradeHistoryEntity("prizeTradeHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath cpCode = createString("cpCode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final QPrizeEntity prize;

    public final StringPath pthAddr = createString("pthAddr");

    public final StringPath pthAddrDetail = createString("pthAddrDetail");

    public final StringPath pthCancelReason = createString("pthCancelReason");

    public final NumberPath<Long> pthIdx = createNumber("pthIdx", Long.class);

    public final StringPath pthReceiver = createString("pthReceiver");

    public final NumberPath<Integer> pthStatus = createNumber("pthStatus", Integer.class);

    public final StringPath pthTel = createString("pthTel");

    public final StringPath pthZipcode = createString("pthZipcode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPrizeTradeHistoryEntity(String variable) {
        this(PrizeTradeHistoryEntity.class, forVariable(variable), INITS);
    }

    public QPrizeTradeHistoryEntity(Path<? extends PrizeTradeHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPrizeTradeHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPrizeTradeHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(PrizeTradeHistoryEntity.class, metadata, inits);
    }

    public QPrizeTradeHistoryEntity(Class<? extends PrizeTradeHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.prize = inits.isInitialized("prize") ? new QPrizeEntity(forProperty("prize")) : null;
    }

}

