package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelByAreaEntity is a Querydsl query type for CityChannelByAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelByAreaEntity extends EntityPathBase<CityChannelByAreaEntity> {

    private static final long serialVersionUID = -1013572397L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelByAreaEntity cityChannelByAreaEntity = new QCityChannelByAreaEntity("cityChannelByAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    public final NumberPath<Long> ccbaIdx = createNumber("ccbaIdx", Long.class);

    public final NumberPath<Integer> ccbaSi = createNumber("ccbaSi", Integer.class);

    public final QCityChannelEntity cityChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelByAreaEntity(String variable) {
        this(CityChannelByAreaEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelByAreaEntity(Path<? extends CityChannelByAreaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelByAreaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelByAreaEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelByAreaEntity.class, metadata, inits);
    }

    public QCityChannelByAreaEntity(Class<? extends CityChannelByAreaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
    }

}

