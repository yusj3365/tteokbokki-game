package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMediaDeleteReasonDefineEntity is a Querydsl query type for MediaDeleteReasonDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaDeleteReasonDefineEntity extends EntityPathBase<MediaDeleteReasonDefineEntity> {

    private static final long serialVersionUID = 674891505L;

    public static final QMediaDeleteReasonDefineEntity mediaDeleteReasonDefineEntity = new QMediaDeleteReasonDefineEntity("mediaDeleteReasonDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mdrIdx = createNumber("mdrIdx", Long.class);

    public final StringPath mdrReason = createString("mdrReason");

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MdrTypeDefineEnum> mdrType = createEnum("mdrType", com.cmb.rainbowtv.domain.media.model.enums.MdrTypeDefineEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaDeleteReasonDefineEntity(String variable) {
        super(MediaDeleteReasonDefineEntity.class, forVariable(variable));
    }

    public QMediaDeleteReasonDefineEntity(Path<? extends MediaDeleteReasonDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMediaDeleteReasonDefineEntity(PathMetadata metadata) {
        super(MediaDeleteReasonDefineEntity.class, metadata);
    }

}

