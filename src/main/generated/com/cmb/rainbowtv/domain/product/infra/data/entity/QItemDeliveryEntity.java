package com.cmb.rainbowtv.domain.product.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemDeliveryEntity is a Querydsl query type for ItemDeliveryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemDeliveryEntity extends EntityPathBase<ItemDeliveryEntity> {

    private static final long serialVersionUID = -109138817L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemDeliveryEntity itemDeliveryEntity = new QItemDeliveryEntity("itemDeliveryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.global.define.express.infra.data.entity.QExpressDefineEntity expressDefine;

    public final StringPath idAddr = createString("idAddr");

    public final StringPath idAddrDetail = createString("idAddrDetail");

    public final StringPath idAsGuide = createString("idAsGuide");

    public final StringPath idAsNotice = createString("idAsNotice");

    public final StringPath idAsPhoneNumber = createString("idAsPhoneNumber");

    public final StringPath idExchangeAccount = createString("idExchangeAccount");

    public final StringPath idExchangeBankName = createString("idExchangeBankName");

    public final StringPath idExchangeBankOwner = createString("idExchangeBankOwner");

    public final StringPath idExchangeNotice = createString("idExchangeNotice");

    public final NumberPath<Long> idIdx = createNumber("idIdx", Long.class);

    public final NumberPath<Long> idMountainCost = createNumber("idMountainCost", Long.class);

    public final StringPath idShippingDescription = createString("idShippingDescription");

    public final QItemEntity item;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QItemDeliveryEntity(String variable) {
        this(ItemDeliveryEntity.class, forVariable(variable), INITS);
    }

    public QItemDeliveryEntity(Path<? extends ItemDeliveryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemDeliveryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemDeliveryEntity(PathMetadata metadata, PathInits inits) {
        this(ItemDeliveryEntity.class, metadata, inits);
    }

    public QItemDeliveryEntity(Class<? extends ItemDeliveryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.expressDefine = inits.isInitialized("expressDefine") ? new com.cmb.rainbowtv.global.define.express.infra.data.entity.QExpressDefineEntity(forProperty("expressDefine")) : null;
        this.item = inits.isInitialized("item") ? new QItemEntity(forProperty("item")) : null;
    }

}

