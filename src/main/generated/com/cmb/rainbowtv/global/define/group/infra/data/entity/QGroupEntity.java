package com.cmb.rainbowtv.global.define.group.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGroupEntity is a Querydsl query type for GroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGroupEntity extends EntityPathBase<GroupEntity> {

    private static final long serialVersionUID = 1529681837L;

    public static final QGroupEntity groupEntity = new QGroupEntity("groupEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath grContent = createString("grContent");

    public final NumberPath<Long> grIdx = createNumber("grIdx", Long.class);

    public final NumberPath<Integer> grIsDefault = createNumber("grIsDefault", Integer.class);

    public final NumberPath<Integer> grIsSuper = createNumber("grIsSuper", Integer.class);

    public final NumberPath<Integer> grLevel = createNumber("grLevel", Integer.class);

    public final StringPath grName = createString("grName");

    public final EnumPath<com.cmb.rainbowtv.global.define.group.model.enums.GTypeEnum> grType = createEnum("grType", com.cmb.rainbowtv.global.define.group.model.enums.GTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QGroupEntity(String variable) {
        super(GroupEntity.class, forVariable(variable));
    }

    public QGroupEntity(Path<? extends GroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGroupEntity(PathMetadata metadata) {
        super(GroupEntity.class, metadata);
    }

}

