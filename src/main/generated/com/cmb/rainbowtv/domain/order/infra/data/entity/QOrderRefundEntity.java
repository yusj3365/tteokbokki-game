package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderRefundEntity is a Querydsl query type for OrderRefundEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderRefundEntity extends EntityPathBase<OrderRefundEntity> {

    private static final long serialVersionUID = 498824787L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderRefundEntity orderRefundEntity = new QOrderRefundEntity("orderRefundEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QOrderEntity order;

    public final DateTimePath<java.time.LocalDateTime> oreAcceptAt = createDateTime("oreAcceptAt", java.time.LocalDateTime.class);

    public final StringPath oreAdminContent = createString("oreAdminContent");

    public final DateTimePath<java.time.LocalDateTime> oreDenyAt = createDateTime("oreDenyAt", java.time.LocalDateTime.class);

    public final StringPath oreDenyReason = createString("oreDenyReason");

    public final DateTimePath<java.time.LocalDateTime> oreDoneAt = createDateTime("oreDoneAt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> oreFruit = createNumber("oreFruit", Integer.class);

    public final NumberPath<Long> oreIdx = createNumber("oreIdx", Long.class);

    public final NumberPath<Long> oreRefundPrice = createNumber("oreRefundPrice", Long.class);

    public final DateTimePath<java.time.LocalDateTime> oreRequireAt = createDateTime("oreRequireAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> oreSendPrice = createNumber("oreSendPrice", Long.class);

    public final NumberPath<Integer> oreStatus = createNumber("oreStatus", Integer.class);

    public final StringPath oreUserContent = createString("oreUserContent");

    public final NumberPath<Long> oreUserReasonType = createNumber("oreUserReasonType", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderRefundEntity(String variable) {
        this(OrderRefundEntity.class, forVariable(variable), INITS);
    }

    public QOrderRefundEntity(Path<? extends OrderRefundEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderRefundEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderRefundEntity(PathMetadata metadata, PathInits inits) {
        this(OrderRefundEntity.class, metadata, inits);
    }

    public QOrderRefundEntity(Class<? extends OrderRefundEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrderEntity(forProperty("order"), inits.get("order")) : null;
    }

}

