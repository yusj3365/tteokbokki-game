package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderAddressEntity is a Querydsl query type for OrderAddressEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderAddressEntity extends EntityPathBase<OrderAddressEntity> {

    private static final long serialVersionUID = -813007073L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderAddressEntity orderAddressEntity = new QOrderAddressEntity("orderAddressEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath oaAddr = createString("oaAddr");

    public final StringPath oaAddrDetail = createString("oaAddrDetail");

    public final StringPath oaHp = createString("oaHp");

    public final NumberPath<Long> oaIdx = createNumber("oaIdx", Long.class);

    public final StringPath oaMemo = createString("oaMemo");

    public final StringPath oaName = createString("oaName");

    public final StringPath oaZip = createString("oaZip");

    public final QOrderEntity order;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderAddressEntity(String variable) {
        this(OrderAddressEntity.class, forVariable(variable), INITS);
    }

    public QOrderAddressEntity(Path<? extends OrderAddressEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderAddressEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderAddressEntity(PathMetadata metadata, PathInits inits) {
        this(OrderAddressEntity.class, metadata, inits);
    }

    public QOrderAddressEntity(Class<? extends OrderAddressEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrderEntity(forProperty("order"), inits.get("order")) : null;
    }

}

