package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelEntity is a Querydsl query type for CityChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelEntity extends EntityPathBase<CityChannelEntity> {

    private static final long serialVersionUID = 479969071L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelEntity cityChannelEntity = new QCityChannelEntity("cityChannelEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath ccDashUrl = createString("ccDashUrl");

    public final NumberPath<Integer> ccDisplay = createNumber("ccDisplay", Integer.class);

    public final StringPath ccHlsUrl = createString("ccHlsUrl");

    public final NumberPath<Long> ccIdx = createNumber("ccIdx", Long.class);

    public final NumberPath<Integer> ccIsAdult = createNumber("ccIsAdult", Integer.class);

    public final StringPath ccName = createString("ccName");

    public final NumberPath<Integer> ccSeq = createNumber("ccSeq", Integer.class);

    public final NumberPath<Integer> ccStatus = createNumber("ccStatus", Integer.class);

    public final StringPath ccUrl = createString("ccUrl");

    public final NumberPath<Integer> ccUse = createNumber("ccUse", Integer.class);

    public final StringPath ccUuid = createString("ccUuid");

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelGenreEntity channelGenre;

    public final QCityChannelCategoryEntity cityChannelCategory;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelEntity(String variable) {
        this(CityChannelEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelEntity(Path<? extends CityChannelEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelEntity.class, metadata, inits);
    }

    public QCityChannelEntity(Class<? extends CityChannelEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channelGenre = inits.isInitialized("channelGenre") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelGenreEntity(forProperty("channelGenre")) : null;
        this.cityChannelCategory = inits.isInitialized("cityChannelCategory") ? new QCityChannelCategoryEntity(forProperty("cityChannelCategory")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

