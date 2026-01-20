package com.cmb.rainbowtv.domain.config.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QConfigCategoryEntity is a Querydsl query type for ConfigCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConfigCategoryEntity extends EntityPathBase<ConfigCategoryEntity> {

    private static final long serialVersionUID = 768258243L;

    public static final QConfigCategoryEntity configCategoryEntity = new QConfigCategoryEntity("configCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath ccClass = createString("ccClass");

    public final NumberPath<Integer> ccFix = createNumber("ccFix", Integer.class);

    public final NumberPath<Long> ccIdx = createNumber("ccIdx", Long.class);

    public final StringPath ccName = createString("ccName");

    public final StringPath ccNameEn = createString("ccNameEn");

    public final EnumPath<com.cmb.rainbowtv.domain.config.model.enums.ConfigCategoryTypeEnum> ccSeparate = createEnum("ccSeparate", com.cmb.rainbowtv.domain.config.model.enums.ConfigCategoryTypeEnum.class);

    public final NumberPath<Long> ccSeq = createNumber("ccSeq", Long.class);

    public final NumberPath<Integer> ccType = createNumber("ccType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QConfigCategoryEntity(String variable) {
        super(ConfigCategoryEntity.class, forVariable(variable));
    }

    public QConfigCategoryEntity(Path<? extends ConfigCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QConfigCategoryEntity(PathMetadata metadata) {
        super(ConfigCategoryEntity.class, metadata);
    }

}

