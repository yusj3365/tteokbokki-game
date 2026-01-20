package com.cmb.rainbowtv.domain.top10.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTop10CategoryMediaEntity is a Querydsl query type for Top10CategoryMediaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTop10CategoryMediaEntity extends EntityPathBase<Top10CategoryMediaEntity> {

    private static final long serialVersionUID = 1460414949L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTop10CategoryMediaEntity top10CategoryMediaEntity = new QTop10CategoryMediaEntity("top10CategoryMediaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    public final NumberPath<Long> tcmIdx = createNumber("tcmIdx", Long.class);

    public final NumberPath<Integer> tcmSeq = createNumber("tcmSeq", Integer.class);

    public final QTop10CategoryEntity top10Category;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTop10CategoryMediaEntity(String variable) {
        this(Top10CategoryMediaEntity.class, forVariable(variable), INITS);
    }

    public QTop10CategoryMediaEntity(Path<? extends Top10CategoryMediaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTop10CategoryMediaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTop10CategoryMediaEntity(PathMetadata metadata, PathInits inits) {
        this(Top10CategoryMediaEntity.class, metadata, inits);
    }

    public QTop10CategoryMediaEntity(Class<? extends Top10CategoryMediaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.top10Category = inits.isInitialized("top10Category") ? new QTop10CategoryEntity(forProperty("top10Category")) : null;
    }

}

