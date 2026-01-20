package com.cmb.rainbowtv.domain.game.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHwatuEntity is a Querydsl query type for HwatuEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHwatuEntity extends EntityPathBase<HwatuEntity> {

    private static final long serialVersionUID = 1182121862L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHwatuEntity hwatuEntity = new QHwatuEntity("hwatuEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> hIdx = createNumber("hIdx", Long.class);

    public final NumberPath<Integer> hUse = createNumber("hUse", Integer.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QHwatuEntity(String variable) {
        this(HwatuEntity.class, forVariable(variable), INITS);
    }

    public QHwatuEntity(Path<? extends HwatuEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHwatuEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHwatuEntity(PathMetadata metadata, PathInits inits) {
        this(HwatuEntity.class, metadata, inits);
    }

    public QHwatuEntity(Class<? extends HwatuEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

