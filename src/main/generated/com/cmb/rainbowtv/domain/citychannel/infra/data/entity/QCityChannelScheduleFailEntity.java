package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelScheduleFailEntity is a Querydsl query type for CityChannelScheduleFailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelScheduleFailEntity extends EntityPathBase<CityChannelScheduleFailEntity> {

    private static final long serialVersionUID = 1848836068L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelScheduleFailEntity cityChannelScheduleFailEntity = new QCityChannelScheduleFailEntity("cityChannelScheduleFailEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> ccsfIdx = createNumber("ccsfIdx", Long.class);

    public final StringPath ccUuid = createString("ccUuid");

    public final QCityChannelEntity cityChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelScheduleFailEntity(String variable) {
        this(CityChannelScheduleFailEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelScheduleFailEntity(Path<? extends CityChannelScheduleFailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelScheduleFailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelScheduleFailEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelScheduleFailEntity.class, metadata, inits);
    }

    public QCityChannelScheduleFailEntity(Class<? extends CityChannelScheduleFailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
    }

}

