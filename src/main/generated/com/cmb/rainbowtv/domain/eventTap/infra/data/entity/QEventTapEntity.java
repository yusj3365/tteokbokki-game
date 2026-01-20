package com.cmb.rainbowtv.domain.eventTap.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEventTapEntity is a Querydsl query type for EventTapEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEventTapEntity extends EntityPathBase<EventTapEntity> {

    private static final long serialVersionUID = 848470021L;

    public static final QEventTapEntity eventTapEntity = new QEventTapEntity("eventTapEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.cmb.rainbowtv.domain.eventTap.model.enums.EventTapCodeEnum> etCode = createEnum("etCode", com.cmb.rainbowtv.domain.eventTap.model.enums.EventTapCodeEnum.class);

    public final NumberPath<Long> etIdx = createNumber("etIdx", Long.class);

    public final NumberPath<Integer> etIsVisible = createNumber("etIsVisible", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QEventTapEntity(String variable) {
        super(EventTapEntity.class, forVariable(variable));
    }

    public QEventTapEntity(Path<? extends EventTapEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEventTapEntity(PathMetadata metadata) {
        super(EventTapEntity.class, metadata);
    }

}

