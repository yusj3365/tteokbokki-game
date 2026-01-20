package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdSetEntity is a Querydsl query type for AdSetEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdSetEntity extends EntityPathBase<AdSetEntity> {

    private static final long serialVersionUID = 389662597L;

    public static final QAdSetEntity adSetEntity = new QAdSetEntity("adSetEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath asDashUrl = createString("asDashUrl");

    public final StringPath asHlsUrl = createString("asHlsUrl");

    public final NumberPath<Long> asIdx = createNumber("asIdx", Long.class);

    public final StringPath asName = createString("asName");

    public final DateTimePath<java.time.LocalDateTime> asPostTimeEd = createDateTime("asPostTimeEd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> asPostTimeSt = createDateTime("asPostTimeSt", java.time.LocalDateTime.class);

    public final NumberPath<Long> asRunningTime = createNumber("asRunningTime", Long.class);

    public final NumberPath<Integer> asStatus = createNumber("asStatus", Integer.class);

    public final NumberPath<Integer> asUse = createNumber("asUse", Integer.class);

    public final StringPath asUuid = createString("asUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath guid = createString("guid");

    public final StringPath mediaPackageId = createString("mediaPackageId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdSetEntity(String variable) {
        super(AdSetEntity.class, forVariable(variable));
    }

    public QAdSetEntity(Path<? extends AdSetEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdSetEntity(PathMetadata metadata) {
        super(AdSetEntity.class, metadata);
    }

}

