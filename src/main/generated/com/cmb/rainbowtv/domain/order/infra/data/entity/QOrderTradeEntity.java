package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderTradeEntity is a Querydsl query type for OrderTradeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderTradeEntity extends EntityPathBase<OrderTradeEntity> {

    private static final long serialVersionUID = -1477350769L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderTradeEntity orderTradeEntity = new QOrderTradeEntity("orderTradeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QOrderEntity order;

    public final DateTimePath<java.time.LocalDateTime> otAcceptAt = createDateTime("otAcceptAt", java.time.LocalDateTime.class);

    public final StringPath otAdminContent = createString("otAdminContent");

    public final DateTimePath<java.time.LocalDateTime> otDenyAt = createDateTime("otDenyAt", java.time.LocalDateTime.class);

    public final StringPath otDenyReason = createString("otDenyReason");

    public final DateTimePath<java.time.LocalDateTime> otDoneAt = createDateTime("otDoneAt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> otFruit = createNumber("otFruit", Integer.class);

    public final NumberPath<Long> otIdx = createNumber("otIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> otRequireAt = createDateTime("otRequireAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> otSendPrice = createNumber("otSendPrice", Long.class);

    public final NumberPath<Integer> otStatus = createNumber("otStatus", Integer.class);

    public final StringPath otUserContent = createString("otUserContent");

    public final NumberPath<Long> otUserReasonType = createNumber("otUserReasonType", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderTradeEntity(String variable) {
        this(OrderTradeEntity.class, forVariable(variable), INITS);
    }

    public QOrderTradeEntity(Path<? extends OrderTradeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderTradeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderTradeEntity(PathMetadata metadata, PathInits inits) {
        this(OrderTradeEntity.class, metadata, inits);
    }

    public QOrderTradeEntity(Class<? extends OrderTradeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrderEntity(forProperty("order"), inits.get("order")) : null;
    }

}

