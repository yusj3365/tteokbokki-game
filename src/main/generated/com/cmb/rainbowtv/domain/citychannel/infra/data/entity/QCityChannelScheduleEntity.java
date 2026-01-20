package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelScheduleEntity is a Querydsl query type for CityChannelScheduleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelScheduleEntity extends EntityPathBase<CityChannelScheduleEntity> {

    private static final long serialVersionUID = -1681611610L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelScheduleEntity cityChannelScheduleEntity = new QCityChannelScheduleEntity("cityChannelScheduleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final ArrayPath<byte[], Byte> ccData = createArray("ccData", byte[].class);

    public final NumberPath<Long> ccsIdx = createNumber("ccsIdx", Long.class);

    public final QCityChannelEntity cityChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelScheduleEntity(String variable) {
        this(CityChannelScheduleEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelScheduleEntity(Path<? extends CityChannelScheduleEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelScheduleEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelScheduleEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelScheduleEntity.class, metadata, inits);
    }

    public QCityChannelScheduleEntity(Class<? extends CityChannelScheduleEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
    }

}

