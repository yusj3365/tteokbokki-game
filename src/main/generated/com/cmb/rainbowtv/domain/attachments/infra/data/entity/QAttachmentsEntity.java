package com.cmb.rainbowtv.domain.attachments.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAttachmentsEntity is a Querydsl query type for AttachmentsEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAttachmentsEntity extends EntityPathBase<AttachmentsEntity> {

    private static final long serialVersionUID = 1219135039L;

    public static final QAttachmentsEntity attachmentsEntity = new QAttachmentsEntity("attachmentsEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> atContainerId = createNumber("atContainerId", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.attachments.model.enums.ContainerType> atContainerType = createEnum("atContainerType", com.cmb.rainbowtv.domain.attachments.model.enums.ContainerType.class);

    public final StringPath atContentType = createString("atContentType");

    public final StringPath atDescription = createString("atDescription");

    public final StringPath atDigest = createString("atDigest");

    public final StringPath atDiskDirectory = createString("atDiskDirectory");

    public final StringPath atDiskFilename = createString("atDiskFilename");

    public final NumberPath<Integer> atDownloads = createNumber("atDownloads", Integer.class);

    public final StringPath atFileExtension = createString("atFileExtension");

    public final StringPath atFilename = createString("atFilename");

    public final NumberPath<Long> atFilesize = createNumber("atFilesize", Long.class);

    public final NumberPath<Long> atIdx = createNumber("atIdx", Long.class);

    public final NumberPath<Integer> atSeq = createNumber("atSeq", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbNo = createNumber("mbNo", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAttachmentsEntity(String variable) {
        super(AttachmentsEntity.class, forVariable(variable));
    }

    public QAttachmentsEntity(Path<? extends AttachmentsEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAttachmentsEntity(PathMetadata metadata) {
        super(AttachmentsEntity.class, metadata);
    }

}

