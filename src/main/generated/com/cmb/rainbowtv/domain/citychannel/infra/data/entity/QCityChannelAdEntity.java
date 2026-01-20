package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelAdEntity is a Querydsl query type for CityChannelAdEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelAdEntity extends EntityPathBase<CityChannelAdEntity> {

    private static final long serialVersionUID = 1681403442L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelAdEntity cityChannelAdEntity = new QCityChannelAdEntity("cityChannelAdEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity adSet;

    public final NumberPath<Long> ccaIdx = createNumber("ccaIdx", Long.class);

    public final NumberPath<Long> ccaSeq = createNumber("ccaSeq", Long.class);

    public final QCityChannelEntity cityChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelAdEntity(String variable) {
        this(CityChannelAdEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelAdEntity(Path<? extends CityChannelAdEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelAdEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelAdEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelAdEntity.class, metadata, inits);
    }

    public QCityChannelAdEntity(Class<? extends CityChannelAdEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adSet = inits.isInitialized("adSet") ? new com.cmb.rainbowtv.domain.advertise.infra.data.entity.QAdSetEntity(forProperty("adSet")) : null;
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
    }

}

