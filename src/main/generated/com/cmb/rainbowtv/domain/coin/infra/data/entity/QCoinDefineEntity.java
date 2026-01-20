package com.cmb.rainbowtv.domain.coin.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoinDefineEntity is a Querydsl query type for CoinDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoinDefineEntity extends EntityPathBase<CoinDefineEntity> {

    private static final long serialVersionUID = 1107237664L;

    public static final QCoinDefineEntity coinDefineEntity = new QCoinDefineEntity("coinDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final EnumPath<com.cmb.rainbowtv.domain.coin.model.enums.CoinCategoryDefineEnum> cdCategory = createEnum("cdCategory", com.cmb.rainbowtv.domain.coin.model.enums.CoinCategoryDefineEnum.class);

    public final EnumPath<com.cmb.rainbowtv.domain.coin.model.enums.CoinCodeEnum> cdCode = createEnum("cdCode", com.cmb.rainbowtv.domain.coin.model.enums.CoinCodeEnum.class);

    public final NumberPath<Long> cdCoin = createNumber("cdCoin", Long.class);

    public final NumberPath<Long> cdIdx = createNumber("cdIdx", Long.class);

    public final NumberPath<Integer> cdIsUse = createNumber("cdIsUse", Integer.class);

    public final StringPath cdReason = createString("cdReason");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoinDefineEntity(String variable) {
        super(CoinDefineEntity.class, forVariable(variable));
    }

    public QCoinDefineEntity(Path<? extends CoinDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoinDefineEntity(PathMetadata metadata) {
        super(CoinDefineEntity.class, metadata);
    }

}

