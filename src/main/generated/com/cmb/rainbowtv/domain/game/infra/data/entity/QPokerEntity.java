package com.cmb.rainbowtv.domain.game.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPokerEntity is a Querydsl query type for PokerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPokerEntity extends EntityPathBase<PokerEntity> {

    private static final long serialVersionUID = 1628950476L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPokerEntity pokerEntity = new QPokerEntity("pokerEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity entity;

    public final NumberPath<Long> pIdx = createNumber("pIdx", Long.class);

    public final NumberPath<Integer> pUse = createNumber("pUse", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPokerEntity(String variable) {
        this(PokerEntity.class, forVariable(variable), INITS);
    }

    public QPokerEntity(Path<? extends PokerEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPokerEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPokerEntity(PathMetadata metadata, PathInits inits) {
        this(PokerEntity.class, metadata, inits);
    }

    public QPokerEntity(Class<? extends PokerEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.entity = inits.isInitialized("entity") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("entity"), inits.get("entity")) : null;
    }

}

