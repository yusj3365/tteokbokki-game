package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelProgramEntity is a Querydsl query type for CityChannelProgramEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelProgramEntity extends EntityPathBase<CityChannelProgramEntity> {

    private static final long serialVersionUID = 1268323003L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelProgramEntity cityChannelProgramEntity = new QCityChannelProgramEntity("cityChannelProgramEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> ccpIdx = createNumber("ccpIdx", Long.class);

    public final NumberPath<Long> ccpKey = createNumber("ccpKey", Long.class);

    public final StringPath ccpNext = createString("ccpNext");

    public final NumberPath<Long> ccpSeq = createNumber("ccpSeq", Long.class);

    public final NumberPath<Long> ccpType = createNumber("ccpType", Long.class);

    public final StringPath ccpUuid = createString("ccpUuid");

    public final QCityChannelEntity cityChannel;

    public final QCityChannelAdEntity cityChannelAd;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelProgramEntity(String variable) {
        this(CityChannelProgramEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelProgramEntity(Path<? extends CityChannelProgramEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelProgramEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelProgramEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelProgramEntity.class, metadata, inits);
    }

    public QCityChannelProgramEntity(Class<? extends CityChannelProgramEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
        this.cityChannelAd = inits.isInitialized("cityChannelAd") ? new QCityChannelAdEntity(forProperty("cityChannelAd"), inits.get("cityChannelAd")) : null;
    }

}

