package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityChannelProgramLinkEntity is a Querydsl query type for CityChannelProgramLinkEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelProgramLinkEntity extends EntityPathBase<CityChannelProgramLinkEntity> {

    private static final long serialVersionUID = 1369710421L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityChannelProgramLinkEntity cityChannelProgramLinkEntity = new QCityChannelProgramLinkEntity("cityChannelProgramLinkEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> ccplIdx = createNumber("ccplIdx", Long.class);

    public final NumberPath<Long> ccplMedia = createNumber("ccplMedia", Long.class);

    public final TimePath<java.time.LocalTime> ccplStartTime = createTime("ccplStartTime", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> ccplStayTime = createTime("ccplStayTime", java.time.LocalTime.class);

    public final StringPath ccplText = createString("ccplText");

    public final StringPath ccplUrl = createString("ccplUrl");

    public final QCityChannelProgramEntity cityChannelProgram;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.cmb.rainbowtv.domain.citychannel.infra.data.entity.enums.ProgramLinkTypeEnum> programLinkTypeEnum = createEnum("programLinkTypeEnum", com.cmb.rainbowtv.domain.citychannel.infra.data.entity.enums.ProgramLinkTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelProgramLinkEntity(String variable) {
        this(CityChannelProgramLinkEntity.class, forVariable(variable), INITS);
    }

    public QCityChannelProgramLinkEntity(Path<? extends CityChannelProgramLinkEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityChannelProgramLinkEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityChannelProgramLinkEntity(PathMetadata metadata, PathInits inits) {
        this(CityChannelProgramLinkEntity.class, metadata, inits);
    }

    public QCityChannelProgramLinkEntity(Class<? extends CityChannelProgramLinkEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityChannelProgram = inits.isInitialized("cityChannelProgram") ? new QCityChannelProgramEntity(forProperty("cityChannelProgram"), inits.get("cityChannelProgram")) : null;
    }

}

