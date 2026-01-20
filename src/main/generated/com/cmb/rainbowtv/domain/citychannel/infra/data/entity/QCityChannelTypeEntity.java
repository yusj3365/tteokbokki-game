package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelTypeEntity is a Querydsl query type for CityChannelTypeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelTypeEntity extends EntityPathBase<CityChannelTypeEntity> {

    private static final long serialVersionUID = -926752503L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelTypeEntity cityChannelTypeEntity = new QCityChannelTypeEntity("cityChannelTypeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cctIdx = createNumber("cctIdx", Long.class);

    public final NumberPath<Long> cctType = createNumber("cctType", Long.class);

    public final QCityChannelEntity cityChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelTypeEntity(String variable) {
        this(CityChannelTypeEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelTypeEntity(Path<? extends CityChannelTypeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelTypeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelTypeEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelTypeEntity.class, metadata, inits);
    }

    public QCityChannelTypeEntity(Class<? extends CityChannelTypeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
    }

}

