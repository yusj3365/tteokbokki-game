package com.cmb.rainbowtv.domain.session.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberDeviceSessionEntity is a Querydsl query type for MemberDeviceSessionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberDeviceSessionEntity extends EntityPathBase<MemberDeviceSessionEntity> {

    private static final long serialVersionUID = 1819607643L;

    public static final QMemberDeviceSessionEntity memberDeviceSessionEntity = new QMemberDeviceSessionEntity("memberDeviceSessionEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath deviceCode = createString("deviceCode");

    public final NumberPath<Long> mbNo = createNumber("mbNo", Long.class);

    public final NumberPath<Long> mdsIdx = createNumber("mdsIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.DeviceTypeEnum> platform = createEnum("platform", com.cmb.rainbowtv.domain.media.model.enums.DeviceTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberDeviceSessionEntity(String variable) {
        super(MemberDeviceSessionEntity.class, forVariable(variable));
    }

    public QMemberDeviceSessionEntity(Path<? extends MemberDeviceSessionEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberDeviceSessionEntity(PathMetadata metadata) {
        super(MemberDeviceSessionEntity.class, metadata);
    }

}

