package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaInterestfreeEntity is a Querydsl query type for MediaInterestfreeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaInterestfreeEntity extends EntityPathBase<MediaInterestfreeEntity> {

    private static final long serialVersionUID = 224516893L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaInterestfreeEntity mediaInterestfreeEntity = new QMediaInterestfreeEntity("mediaInterestfreeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final NumberPath<Long> miIdx = createNumber("miIdx", Long.class);

    public final NumberPath<Integer> miMonth = createNumber("miMonth", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaInterestfreeEntity(String variable) {
        this(MediaInterestfreeEntity.class, forVariable(variable), INITS);
    }

    public QMediaInterestfreeEntity(Path<? extends MediaInterestfreeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaInterestfreeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaInterestfreeEntity(PathMetadata metadata, PathInits inits) {
        this(MediaInterestfreeEntity.class, metadata, inits);
    }

    public QMediaInterestfreeEntity(Class<? extends MediaInterestfreeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

