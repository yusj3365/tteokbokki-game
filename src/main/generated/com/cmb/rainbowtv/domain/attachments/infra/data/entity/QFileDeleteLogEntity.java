package com.cmb.rainbowtv.domain.attachments.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFileDeleteLogEntity is a Querydsl query type for FileDeleteLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFileDeleteLogEntity extends EntityPathBase<FileDeleteLogEntity> {

    private static final long serialVersionUID = -992652980L;

    public static final QFileDeleteLogEntity fileDeleteLogEntity = new QFileDeleteLogEntity("fileDeleteLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> atContainerId = createNumber("atContainerId", Integer.class);

    public final StringPath atContainerType = createString("atContainerType");

    public final StringPath atDiskFilename = createString("atDiskFilename");

    public final StringPath atFilename = createString("atFilename");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath fdlDashUrl = createString("fdlDashUrl");

    public final StringPath fdlHlsUrl = createString("fdlHlsUrl");

    public final NumberPath<Long> fdlIdx = createNumber("fdlIdx", Long.class);

    public final NumberPath<Integer> fdlStatus = createNumber("fdlStatus", Integer.class);

    public final StringPath guid = createString("guid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFileDeleteLogEntity(String variable) {
        super(FileDeleteLogEntity.class, forVariable(variable));
    }

    public QFileDeleteLogEntity(Path<? extends FileDeleteLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileDeleteLogEntity(PathMetadata metadata) {
        super(FileDeleteLogEntity.class, metadata);
    }

}

