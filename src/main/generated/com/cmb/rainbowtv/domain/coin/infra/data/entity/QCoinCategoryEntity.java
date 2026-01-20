package com.cmb.rainbowtv.domain.coin.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoinCategoryEntity is a Querydsl query type for CoinCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCoinCategoryEntity extends EntityPathBase<CoinCategoryEntity> {

    private static final long serialVersionUID = -1877647453L;

    public static final QCoinCategoryEntity coinCategoryEntity = new QCoinCategoryEntity("coinCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final EnumPath<com.cmb.rainbowtv.domain.coin.model.enums.CoinCategoryCodeEnum> ccCode = createEnum("ccCode", com.cmb.rainbowtv.domain.coin.model.enums.CoinCategoryCodeEnum.class);

    public final NumberPath<Long> ccIdx = createNumber("ccIdx", Long.class);

    public final StringPath ccName = createString("ccName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCoinCategoryEntity(String variable) {
        super(CoinCategoryEntity.class, forVariable(variable));
    }

    public QCoinCategoryEntity(Path<? extends CoinCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoinCategoryEntity(PathMetadata metadata) {
        super(CoinCategoryEntity.class, metadata);
    }

}

