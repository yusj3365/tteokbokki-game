package com.cmb.rainbowtv.domain.top10.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTop10CategoryMediaAutoEntity is a Querydsl query type for Top10CategoryMediaAutoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTop10CategoryMediaAutoEntity extends EntityPathBase<Top10CategoryMediaAutoEntity> {

    private static final long serialVersionUID = 1760617332L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTop10CategoryMediaAutoEntity top10CategoryMediaAutoEntity = new QTop10CategoryMediaAutoEntity("top10CategoryMediaAutoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> tcmaIdx = createNumber("tcmaIdx", Long.class);

    public final NumberPath<Integer> tcmaRanking = createNumber("tcmaRanking", Integer.class);

    public final QTop10CategoryEntity top10Category;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTop10CategoryMediaAutoEntity(String variable) {
        this(Top10CategoryMediaAutoEntity.class, forVariable(variable), INITS);
    }

    public QTop10CategoryMediaAutoEntity(Path<? extends Top10CategoryMediaAutoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTop10CategoryMediaAutoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTop10CategoryMediaAutoEntity(PathMetadata metadata, PathInits inits) {
        this(Top10CategoryMediaAutoEntity.class, metadata, inits);
    }

    public QTop10CategoryMediaAutoEntity(Class<? extends Top10CategoryMediaAutoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.top10Category = inits.isInitialized("top10Category") ? new QTop10CategoryEntity(forProperty("top10Category")) : null;
    }

}

