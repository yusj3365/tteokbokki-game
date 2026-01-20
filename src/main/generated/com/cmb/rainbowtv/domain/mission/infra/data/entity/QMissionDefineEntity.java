package com.cmb.rainbowtv.domain.mission.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMissionDefineEntity is a Querydsl query type for MissionDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMissionDefineEntity extends EntityPathBase<MissionDefineEntity> {

    private static final long serialVersionUID = 424771858L;

    public static final QMissionDefineEntity missionDefineEntity = new QMissionDefineEntity("missionDefineEntity");

    public final StringPath mContent = createString("mContent");

    public final NumberPath<Long> mIdx = createNumber("mIdx", Long.class);

    public final NumberPath<Integer> mIsDisplay = createNumber("mIsDisplay", Integer.class);

    public final NumberPath<Long> mKoin = createNumber("mKoin", Long.class);

    public final StringPath mName = createString("mName");

    public final NumberPath<Long> mSeq = createNumber("mSeq", Long.class);

    public final NumberPath<Long> mTotal = createNumber("mTotal", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.mission.model.enums.MissionTypeEnum> mType = createEnum("mType", com.cmb.rainbowtv.domain.mission.model.enums.MissionTypeEnum.class);

    public final NumberPath<Integer> mUse = createNumber("mUse", Integer.class);

    public QMissionDefineEntity(String variable) {
        super(MissionDefineEntity.class, forVariable(variable));
    }

    public QMissionDefineEntity(Path<? extends MissionDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMissionDefineEntity(PathMetadata metadata) {
        super(MissionDefineEntity.class, metadata);
    }

}

