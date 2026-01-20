package com.cmb.rainbowtv.domain.game.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOmokEntity is a Querydsl query type for OmokEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOmokEntity extends EntityPathBase<OmokEntity> {

    private static final long serialVersionUID = 1332315181L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOmokEntity omokEntity = new QOmokEntity("omokEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> oIdx = createNumber("oIdx", Long.class);

    public final NumberPath<Integer> oUse = createNumber("oUse", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOmokEntity(String variable) {
        this(OmokEntity.class, forVariable(variable), INITS);
    }

    public QOmokEntity(Path<? extends OmokEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOmokEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOmokEntity(PathMetadata metadata, PathInits inits) {
        this(OmokEntity.class, metadata, inits);
    }

    public QOmokEntity(Class<? extends OmokEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

