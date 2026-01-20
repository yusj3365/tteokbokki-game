package com.cmb.rainbowtv.domain.content.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHomeDisplayEntity is a Querydsl query type for HomeDisplayEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHomeDisplayEntity extends EntityPathBase<HomeDisplayEntity> {

    private static final long serialVersionUID = -1696009477L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHomeDisplayEntity homeDisplayEntity = new QHomeDisplayEntity("homeDisplayEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> hdCategory = createNumber("hdCategory", Integer.class);

    public final NumberPath<Integer> hdHit = createNumber("hdHit", Integer.class);

    public final NumberPath<Long> hdIdx = createNumber("hdIdx", Long.class);

    public final NumberPath<Integer> hdIsDisplay = createNumber("hdIsDisplay", Integer.class);

    public final NumberPath<Integer> hdSeq = createNumber("hdSeq", Integer.class);

    public final StringPath hdTitle1 = createString("hdTitle1");

    public final StringPath hdTitle2 = createString("hdTitle2");

    public final NumberPath<Integer> hdTitleDisplay = createNumber("hdTitleDisplay", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.content.model.enums.HdTypeEnum> hdType = createEnum("hdType", com.cmb.rainbowtv.domain.content.model.enums.HdTypeEnum.class);

    public final NumberPath<Integer> hdView = createNumber("hdView", Integer.class);

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QHomeDisplayEntity(String variable) {
        this(HomeDisplayEntity.class, forVariable(variable), INITS);
    }

    public QHomeDisplayEntity(Path<? extends HomeDisplayEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHomeDisplayEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHomeDisplayEntity(PathMetadata metadata, PathInits inits) {
        this(HomeDisplayEntity.class, metadata, inits);
    }

    public QHomeDisplayEntity(Class<? extends HomeDisplayEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

