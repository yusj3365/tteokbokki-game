package com.cmb.rainbowtv.domain.config.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QConfigEntity is a Querydsl query type for ConfigEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConfigEntity extends EntityPathBase<ConfigEntity> {

    private static final long serialVersionUID = -372727771L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConfigEntity configEntity = new QConfigEntity("configEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath coConfig = createString("coConfig");

    public final NumberPath<Long> coIdx = createNumber("coIdx", Long.class);

    public final QConfigCategoryEntity configCategory;

    public final EnumPath<com.cmb.rainbowtv.domain.config.model.enums.ConfigTypeEnum> coType = createEnum("coType", com.cmb.rainbowtv.domain.config.model.enums.ConfigTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QConfigEntity(String variable) {
        this(ConfigEntity.class, forVariable(variable), INITS);
    }

    public QConfigEntity(Path<? extends ConfigEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QConfigEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QConfigEntity(PathMetadata metadata, PathInits inits) {
        this(ConfigEntity.class, metadata, inits);
    }

    public QConfigEntity(Class<? extends ConfigEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.configCategory = inits.isInitialized("configCategory") ? new QConfigCategoryEntity(forProperty("configCategory")) : null;
    }

}

