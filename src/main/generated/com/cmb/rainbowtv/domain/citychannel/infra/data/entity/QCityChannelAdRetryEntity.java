package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelAdRetryEntity is a Querydsl query type for CityChannelAdRetryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelAdRetryEntity extends EntityPathBase<CityChannelAdRetryEntity> {

    private static final long serialVersionUID = -1459543108L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelAdRetryEntity cityChannelAdRetryEntity = new QCityChannelAdRetryEntity("cityChannelAdRetryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath adBreakArr = createString("adBreakArr");

    public final com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity adSet;

    public final StringPath beforeProgramName = createString("beforeProgramName");

    public final NumberPath<Long> ccarIdx = createNumber("ccarIdx", Long.class);

    public final StringPath channelName = createString("channelName");

    public final QCityChannelProgramEntity cityChannelProgram;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath guid = createString("guid");

    public final StringPath transitionArr = createString("transitionArr");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelAdRetryEntity(String variable) {
        this(CityChannelAdRetryEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelAdRetryEntity(Path<? extends CityChannelAdRetryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelAdRetryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelAdRetryEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelAdRetryEntity.class, metadata, inits);
    }

    public QCityChannelAdRetryEntity(Class<? extends CityChannelAdRetryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adSet = inits.isInitialized("adSet") ? new com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity(forProperty("adSet")) : null;
        this.cityChannelProgram = inits.isInitialized("cityChannelProgram") ? new QCityChannelProgramEntity(forProperty("cityChannelProgram"), inits.get("cityChannelProgram")) : null;
    }

}

