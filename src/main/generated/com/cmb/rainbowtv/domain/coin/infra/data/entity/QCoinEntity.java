package com.cmb.rainbowtv.domain.coin.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoinEntity is a Querydsl query type for CoinEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoinEntity extends EntityPathBase<CoinEntity> {

    private static final long serialVersionUID = 1637887749L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoinEntity coinEntity = new QCoinEntity("coinEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> coCoin = createNumber("coCoin", Long.class);

    public final NumberPath<Long> coCoinHistory = createNumber("coCoinHistory", Long.class);

    public final DatePath<java.time.LocalDate> coExpireDate = createDate("coExpireDate", java.time.LocalDate.class);

    public final NumberPath<Long> coIdx = createNumber("coIdx", Long.class);

    public final QCoinCategoryEntity coinCategory;

    public final QCoinDefineEntity coinDefine;

    public final StringPath coLegacyCode = createString("coLegacyCode");

    public final StringPath coReason = createString("coReason");

    public final StringPath coUuid = createString("coUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoinEntity(String variable) {
        this(CoinEntity.class, forVariable(variable), INITS);
    }

    public QCoinEntity(Path<? extends CoinEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoinEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoinEntity(PathMetadata metadata, PathInits inits) {
        this(CoinEntity.class, metadata, inits);
    }

    public QCoinEntity(Class<? extends CoinEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coinCategory = inits.isInitialized("coinCategory") ? new QCoinCategoryEntity(forProperty("coinCategory")) : null;
        this.coinDefine = inits.isInitialized("coinDefine") ? new QCoinDefineEntity(forProperty("coinDefine")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

