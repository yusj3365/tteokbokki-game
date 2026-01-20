package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastMediaInfoEntity is a Querydsl query type for FastMediaInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastMediaInfoEntity extends EntityPathBase<FastMediaInfoEntity> {

    private static final long serialVersionUID = -279219021L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastMediaInfoEntity fastMediaInfoEntity = new QFastMediaInfoEntity("fastMediaInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastMediaEntity fastMedia;

    public final StringPath fmiActors = createString("fmiActors");

    public final NumberPath<Integer> fmiBroadcastDate = createNumber("fmiBroadcastDate", Integer.class);

    public final StringPath fmiDirector = createString("fmiDirector");

    public final NumberPath<Long> fmiIdx = createNumber("fmiIdx", Long.class);

    public final StringPath fmiStory = createString("fmiStory");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastMediaInfoEntity(String variable) {
        this(FastMediaInfoEntity.class, forVariable(variable), INITS);
    }

    public QFastMediaInfoEntity(Path<? extends FastMediaInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastMediaInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastMediaInfoEntity(PathMetadata metadata, PathInits inits) {
        this(FastMediaInfoEntity.class, metadata, inits);
    }

    public QFastMediaInfoEntity(Class<? extends FastMediaInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastMedia = inits.isInitialized("fastMedia") ? new QFastMediaEntity(forProperty("fastMedia"), inits.get("fastMedia")) : null;
    }

}

