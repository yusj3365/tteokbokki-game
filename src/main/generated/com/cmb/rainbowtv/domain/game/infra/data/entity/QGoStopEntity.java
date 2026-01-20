package com.cmb.rainbowtv.domain.game.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGoStopEntity is a Querydsl query type for GoStopEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGoStopEntity extends EntityPathBase<GoStopEntity> {

    private static final long serialVersionUID = -1434106627L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGoStopEntity goStopEntity = new QGoStopEntity("goStopEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> gsIdx = createNumber("gsIdx", Long.class);

    public final NumberPath<Integer> gUse = createNumber("gUse", Integer.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QGoStopEntity(String variable) {
        this(GoStopEntity.class, forVariable(variable), INITS);
    }

    public QGoStopEntity(Path<? extends GoStopEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGoStopEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGoStopEntity(PathMetadata metadata, PathInits inits) {
        this(GoStopEntity.class, metadata, inits);
    }

    public QGoStopEntity(Class<? extends GoStopEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

