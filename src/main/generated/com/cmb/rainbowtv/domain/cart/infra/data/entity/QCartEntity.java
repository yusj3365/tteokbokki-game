package com.cmb.rainbowtv.domain.cart.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCartEntity is a Querydsl query type for CartEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCartEntity extends EntityPathBase<CartEntity> {

    private static final long serialVersionUID = 2009703973L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCartEntity cartEntity = new QCartEntity("cartEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath caHistory = createString("caHistory");

    public final NumberPath<Long> caIdx = createNumber("caIdx", Long.class);

    public final StringPath caName = createString("caName");

    public final NumberPath<java.math.BigDecimal> caPrice = createNumber("caPrice", java.math.BigDecimal.class);

    public final NumberPath<Integer> caQty = createNumber("caQty", Integer.class);

    public final NumberPath<Integer> caRefundPrice = createNumber("caRefundPrice", Integer.class);

    public final NumberPath<java.math.BigDecimal> caSalePrice = createNumber("caSalePrice", java.math.BigDecimal.class);

    public final NumberPath<Integer> caSendCost = createNumber("caSendCost", Integer.class);

    public final NumberPath<Integer> caStatus = createNumber("caStatus", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.cart.model.enums.CartTypeEnum> caType = createEnum("caType", com.cmb.rainbowtv.domain.cart.model.enums.CartTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity item;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath ordId = createString("ordId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCartEntity(String variable) {
        this(CartEntity.class, forVariable(variable), INITS);
    }

    public QCartEntity(Path<? extends CartEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCartEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCartEntity(PathMetadata metadata, PathInits inits) {
        this(CartEntity.class, metadata, inits);
    }

    public QCartEntity(Class<? extends CartEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity(forProperty("item")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

