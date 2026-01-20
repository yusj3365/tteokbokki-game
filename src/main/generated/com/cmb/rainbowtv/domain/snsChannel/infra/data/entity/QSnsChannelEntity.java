package com.cmb.rainbowtv.domain.snsChannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSnsChannelEntity is a Querydsl query type for SnsChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSnsChannelEntity extends EntityPathBase<SnsChannelEntity> {

    private static final long serialVersionUID = -588229307L;

    public static final QSnsChannelEntity snsChannelEntity = new QSnsChannelEntity("snsChannelEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> scIdx = createNumber("scIdx", Long.class);

    public final StringPath scName = createString("scName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSnsChannelEntity(String variable) {
        super(SnsChannelEntity.class, forVariable(variable));
    }

    public QSnsChannelEntity(Path<? extends SnsChannelEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSnsChannelEntity(PathMetadata metadata) {
        super(SnsChannelEntity.class, metadata);
    }

}

