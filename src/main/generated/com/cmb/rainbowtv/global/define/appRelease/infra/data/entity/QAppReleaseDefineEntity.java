package com.cmb.rainbowtv.global.define.appRelease.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAppReleaseDefineEntity is a Querydsl query type for AppReleaseDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAppReleaseDefineEntity extends EntityPathBase<AppReleaseDefineEntity> {

    private static final long serialVersionUID = -57780656L;

    public static final QAppReleaseDefineEntity appReleaseDefineEntity = new QAppReleaseDefineEntity("appReleaseDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final EnumPath<com.cmb.rainbowtv.global.define.appRelease.model.enums.AppTypeDefineEnum> appTypeDefineEnum = createEnum("appTypeDefineEnum", com.cmb.rainbowtv.global.define.appRelease.model.enums.AppTypeDefineEnum.class);

    public final NumberPath<java.math.BigDecimal> arCriticalSection = createNumber("arCriticalSection", java.math.BigDecimal.class);

    public final NumberPath<Integer> arDelete = createNumber("arDelete", Integer.class);

    public final NumberPath<Long> arIdx = createNumber("arIdx", Long.class);

    public final NumberPath<Integer> arIsRelease = createNumber("arIsRelease", Integer.class);

    public final NumberPath<java.math.BigDecimal> arLatestVersion = createNumber("arLatestVersion", java.math.BigDecimal.class);

    public final StringPath arReleaseNote = createString("arReleaseNote");

    public final StringPath arUrl = createString("arUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath statisticsUrl = createString("statisticsUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAppReleaseDefineEntity(String variable) {
        super(AppReleaseDefineEntity.class, forVariable(variable));
    }

    public QAppReleaseDefineEntity(Path<? extends AppReleaseDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAppReleaseDefineEntity(PathMetadata metadata) {
        super(AppReleaseDefineEntity.class, metadata);
    }

}

