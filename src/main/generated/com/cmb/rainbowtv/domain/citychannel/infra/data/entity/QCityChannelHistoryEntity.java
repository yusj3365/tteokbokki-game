package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelHistoryEntity is a Querydsl query type for CityChannelHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelHistoryEntity extends EntityPathBase<CityChannelHistoryEntity> {

    private static final long serialVersionUID = -243200821L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelHistoryEntity cityChannelHistoryEntity = new QCityChannelHistoryEntity("cityChannelHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cchIdx = createNumber("cchIdx", Long.class);

    public final QCityChannelEntity cityChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelHistoryEntity(String variable) {
        this(CityChannelHistoryEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelHistoryEntity(Path<? extends CityChannelHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelHistoryEntity.class, metadata, inits);
    }

    public QCityChannelHistoryEntity(Class<? extends CityChannelHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityChannel = inits.isInitialized("cityChannel") ? new QCityChannelEntity(forProperty("cityChannel"), inits.get("cityChannel")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

