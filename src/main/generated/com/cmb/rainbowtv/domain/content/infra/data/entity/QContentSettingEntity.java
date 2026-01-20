package com.cmb.rainbowtv.domain.content.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QContentSettingEntity is a Querydsl query type for ContentSettingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContentSettingEntity extends EntityPathBase<ContentSettingEntity> {

    private static final long serialVersionUID = -1294022683L;

    public static final QContentSettingEntity contentSettingEntity = new QContentSettingEntity("contentSettingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> csDisplay = createNumber("csDisplay", Integer.class);

    public final NumberPath<Long> csIdx = createNumber("csIdx", Long.class);

    public final NumberPath<Integer> csType = createNumber("csType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QContentSettingEntity(String variable) {
        super(ContentSettingEntity.class, forVariable(variable));
    }

    public QContentSettingEntity(Path<? extends ContentSettingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContentSettingEntity(PathMetadata metadata) {
        super(ContentSettingEntity.class, metadata);
    }

}

