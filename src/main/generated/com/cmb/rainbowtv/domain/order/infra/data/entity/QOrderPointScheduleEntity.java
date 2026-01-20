package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderPointScheduleEntity is a Querydsl query type for OrderPointScheduleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderPointScheduleEntity extends EntityPathBase<OrderPointScheduleEntity> {

    private static final long serialVersionUID = 1717999410L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderPointScheduleEntity orderPointScheduleEntity = new QOrderPointScheduleEntity("orderPointScheduleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> opsIdx = createNumber("opsIdx", Long.class);

    public final NumberPath<Long> opsPaidPoint = createNumber("opsPaidPoint", Long.class);

    public final DatePath<java.time.LocalDate> opsPayDate = createDate("opsPayDate", java.time.LocalDate.class);

    public final QOrderEntity order;

    public final com.cmb.rainbowtv.domain.point.infra.data.entity.QPointDefineEntity pointDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderPointScheduleEntity(String variable) {
        this(OrderPointScheduleEntity.class, forVariable(variable), INITS);
    }

    public QOrderPointScheduleEntity(Path<? extends OrderPointScheduleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderPointScheduleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderPointScheduleEntity(PathMetadata metadata, PathInits inits) {
        this(OrderPointScheduleEntity.class, metadata, inits);
    }

    public QOrderPointScheduleEntity(Class<? extends OrderPointScheduleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrderEntity(forProperty("order"), inits.get("order")) : null;
        this.pointDefine = inits.isInitialized("pointDefine") ? new com.cmb.rainbowtv.domain.point.infra.data.entity.QPointDefineEntity(forProperty("pointDefine"), inits.get("pointDefine")) : null;
    }

}

