package com.cmb.rainbowtv.domain.snsChannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSnsJoinEntity is a Querydsl query type for SnsJoinEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSnsJoinEntity extends EntityPathBase<SnsJoinEntity> {

    private static final long serialVersionUID = 1523595150L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSnsJoinEntity snsJoinEntity = new QSnsJoinEntity("snsJoinEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> sjArea = createNumber("sjArea", Long.class);

    public final StringPath sjBirth = createString("sjBirth");

    public final NumberPath<Integer> sjDevice = createNumber("sjDevice", Integer.class);

    public final NumberPath<Long> sjIdx = createNumber("sjIdx", Long.class);

    public final StringPath sjSo = createString("sjSo");

    public final QSnsChannelLinkEntity snsChannelLink;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSnsJoinEntity(String variable) {
        this(SnsJoinEntity.class, forVariable(variable), INITS);
    }

    public QSnsJoinEntity(Path<? extends SnsJoinEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSnsJoinEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSnsJoinEntity(PathMetadata metadata, PathInits inits) {
        this(SnsJoinEntity.class, metadata, inits);
    }

    public QSnsJoinEntity(Class<? extends SnsJoinEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.snsChannelLink = inits.isInitialized("snsChannelLink") ? new QSnsChannelLinkEntity(forProperty("snsChannelLink"), inits.get("snsChannelLink")) : null;
    }

}

