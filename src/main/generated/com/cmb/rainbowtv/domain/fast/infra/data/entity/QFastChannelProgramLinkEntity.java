package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelProgramLinkEntity is a Querydsl query type for FastChannelProgramLinkEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelProgramLinkEntity extends EntityPathBase<FastChannelProgramLinkEntity> {

    private static final long serialVersionUID = -592994912L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelProgramLinkEntity fastChannelProgramLinkEntity = new QFastChannelProgramLinkEntity("fastChannelProgramLinkEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelProgramEntity fastChannelProgram;

    public final NumberPath<Long> fcplIdx = createNumber("fcplIdx", Long.class);

    public final NumberPath<Long> fcplMedia = createNumber("fcplMedia", Long.class);

    public final TimePath<java.time.LocalTime> fcplStartTime = createTime("fcplStartTime", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> fcplStayTime = createTime("fcplStayTime", java.time.LocalTime.class);

    public final StringPath fcplText = createString("fcplText");

    public final StringPath fcplUrl = createString("fcplUrl");

    public final EnumPath<com.cmb.rainbowtv.domain.citychannel.infra.data.entity.enums.ProgramLinkTypeEnum> programLinkTypeEnum = createEnum("programLinkTypeEnum", com.cmb.rainbowtv.domain.citychannel.infra.data.entity.enums.ProgramLinkTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelProgramLinkEntity(String variable) {
        this(FastChannelProgramLinkEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelProgramLinkEntity(Path<? extends FastChannelProgramLinkEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelProgramLinkEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelProgramLinkEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelProgramLinkEntity.class, metadata, inits);
    }

    public QFastChannelProgramLinkEntity(Class<? extends FastChannelProgramLinkEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastChannelProgram = inits.isInitialized("fastChannelProgram") ? new QFastChannelProgramEntity(forProperty("fastChannelProgram"), inits.get("fastChannelProgram")) : null;
    }

}

