package com.cmb.rainbowtv.domain.cart.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCartExpressEntity is a Querydsl query type for CartExpressEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCartExpressEntity extends EntityPathBase<CartExpressEntity> {

    private static final long serialVersionUID = -1697408271L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCartExpressEntity cartExpressEntity = new QCartExpressEntity("cartExpressEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCartEntity cart;

    public final StringPath ceDeliveryCompany = createString("ceDeliveryCompany");

    public final NumberPath<Long> ceIdx = createNumber("ceIdx", Long.class);

    public final StringPath ceInvoice = createString("ceInvoice");

    public final DateTimePath<java.time.LocalDateTime> ceInvoiceEndTime = createDateTime("ceInvoiceEndTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> ceInvoiceReadyTime = createDateTime("ceInvoiceReadyTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> ceInvoiceTime = createDateTime("ceInvoiceTime", java.time.LocalDateTime.class);

    public final StringPath ceUuid = createString("ceUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.global.define.express.infra.data.entity.QExpressDefineEntity expressDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCartExpressEntity(String variable) {
        this(CartExpressEntity.class, forVariable(variable), INITS);
    }

    public QCartExpressEntity(Path<? extends CartExpressEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCartExpressEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCartExpressEntity(PathMetadata metadata, PathInits inits) {
        this(CartExpressEntity.class, metadata, inits);
    }

    public QCartExpressEntity(Class<? extends CartExpressEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cart = inits.isInitialized("cart") ? new QCartEntity(forProperty("cart"), inits.get("cart")) : null;
        this.expressDefine = inits.isInitialized("expressDefine") ? new com.cmb.rainbowtv.global.define.express.infra.data.entity.QExpressDefineEntity(forProperty("expressDefine")) : null;
    }

}

