package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderByAdvertiseEntity is a Querydsl query type for OrderByAdvertiseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderByAdvertiseEntity extends EntityPathBase<OrderByAdvertiseEntity> {

    private static final long serialVersionUID = 1720915899L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderByAdvertiseEntity orderByAdvertiseEntity = new QOrderByAdvertiseEntity("orderByAdvertiseEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdvertiseContentEntity advertiseContent;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> obaIdx = createNumber("obaIdx", Long.class);

    public final QOrderEntity order;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderByAdvertiseEntity(String variable) {
        this(OrderByAdvertiseEntity.class, forVariable(variable), INITS);
    }

    public QOrderByAdvertiseEntity(Path<? extends OrderByAdvertiseEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderByAdvertiseEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderByAdvertiseEntity(PathMetadata metadata, PathInits inits) {
        this(OrderByAdvertiseEntity.class, metadata, inits);
    }

    public QOrderByAdvertiseEntity(Class<? extends OrderByAdvertiseEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContent = inits.isInitialized("advertiseContent") ? new com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdvertiseContentEntity(forProperty("advertiseContent"), inits.get("advertiseContent")) : null;
        this.order = inits.isInitialized("order") ? new QOrderEntity(forProperty("order"), inits.get("order")) : null;
    }

}

