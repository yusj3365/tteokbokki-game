package com.cmb.rainbowtv.domain.snsChannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSnsEnterEntity is a Querydsl query type for SnsEnterEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSnsEnterEntity extends EntityPathBase<SnsEnterEntity> {

    private static final long serialVersionUID = -525467878L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSnsEnterEntity snsEnterEntity = new QSnsEnterEntity("snsEnterEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> seArea = createNumber("seArea", Long.class);

    public final StringPath seBirth = createString("seBirth");

    public final NumberPath<Integer> seDevice = createNumber("seDevice", Integer.class);

    public final NumberPath<Long> seIdx = createNumber("seIdx", Long.class);

    public final StringPath seSo = createString("seSo");

    public final QSnsChannelLinkEntity snsChannelLink;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSnsEnterEntity(String variable) {
        this(SnsEnterEntity.class, forVariable(variable), INITS);
    }

    public QSnsEnterEntity(Path<? extends SnsEnterEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSnsEnterEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSnsEnterEntity(PathMetadata metadata, PathInits inits) {
        this(SnsEnterEntity.class, metadata, inits);
    }

    public QSnsEnterEntity(Class<? extends SnsEnterEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.snsChannelLink = inits.isInitialized("snsChannelLink") ? new QSnsChannelLinkEntity(forProperty("snsChannelLink"), inits.get("snsChannelLink")) : null;
    }

}

