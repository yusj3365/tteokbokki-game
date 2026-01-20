package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderByMediaEntity is a Querydsl query type for OrderByMediaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderByMediaEntity extends EntityPathBase<OrderByMediaEntity> {

    private static final long serialVersionUID = 1008266808L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderByMediaEntity orderByMediaEntity = new QOrderByMediaEntity("orderByMediaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    public final NumberPath<Long> obmIdx = createNumber("obmIdx", Long.class);

    public final QOrderEntity order;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderByMediaEntity(String variable) {
        this(OrderByMediaEntity.class, forVariable(variable), INITS);
    }

    public QOrderByMediaEntity(Path<? extends OrderByMediaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderByMediaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderByMediaEntity(PathMetadata metadata, PathInits inits) {
        this(OrderByMediaEntity.class, metadata, inits);
    }

    public QOrderByMediaEntity(Class<? extends OrderByMediaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.order = inits.isInitialized("order") ? new QOrderEntity(forProperty("order"), inits.get("order")) : null;
    }

}

