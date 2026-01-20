package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelProgramRetryEntity is a Querydsl query type for CityChannelProgramRetryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelProgramRetryEntity extends EntityPathBase<CityChannelProgramRetryEntity> {

    private static final long serialVersionUID = 1482075347L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelProgramRetryEntity cityChannelProgramRetryEntity = new QCityChannelProgramRetryEntity("cityChannelProgramRetryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> ccprIdx = createNumber("ccprIdx", Long.class);

    public final StringPath ccpUuid = createString("ccpUuid");

    public final StringPath channelName = createString("channelName");

    public final QCityChannelEntity cityChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelProgramRetryEntity(String variable) {
        this(CityChannelProgramRetryEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelProgramRetryEntity(Path<? extends CityChannelProgramRetryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelProgramRetryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelProgramRetryEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelProgramRetryEntity.class, metadata, inits);
    }

    public QCityChannelProgramRetryEntity(Class<? extends CityChannelProgramRetryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
    }

}

