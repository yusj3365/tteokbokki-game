package com.cmb.rainbowtv.domain.point.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPointInfoEntity is a Querydsl query type for PointInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointInfoEntity extends EntityPathBase<PointInfoEntity> {

    private static final long serialVersionUID = -1852034419L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPointInfoEntity pointInfoEntity = new QPointInfoEntity("pointInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DatePath<java.time.LocalDate> piExpireDate = createDate("piExpireDate", java.time.LocalDate.class);

    public final NumberPath<Long> piIdx = createNumber("piIdx", Long.class);

    public final NumberPath<Long> piParent = createNumber("piParent", Long.class);

    public final NumberPath<Long> piPoint = createNumber("piPoint", Long.class);

    public final QPointEntity point;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPointInfoEntity(String variable) {
        this(PointInfoEntity.class, forVariable(variable), INITS);
    }

    public QPointInfoEntity(Path<? extends PointInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPointInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPointInfoEntity(PathMetadata metadata, PathInits inits) {
        this(PointInfoEntity.class, metadata, inits);
    }

    public QPointInfoEntity(Class<? extends PointInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.point = inits.isInitialized("point") ? new QPointEntity(forProperty("point"), inits.get("point")) : null;
    }

}

