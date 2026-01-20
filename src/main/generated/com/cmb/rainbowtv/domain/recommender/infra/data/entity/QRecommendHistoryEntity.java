package com.cmb.rainbowtv.domain.recommender.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecommendHistoryEntity is a Querydsl query type for RecommendHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecommendHistoryEntity extends EntityPathBase<RecommendHistoryEntity> {

    private static final long serialVersionUID = 145719446L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecommendHistoryEntity recommendHistoryEntity = new QRecommendHistoryEntity("recommendHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity recommendee;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity recommender;

    public final NumberPath<Long> rhIdx = createNumber("rhIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QRecommendHistoryEntity(String variable) {
        this(RecommendHistoryEntity.class, forVariable(variable), INITS);
    }

    public QRecommendHistoryEntity(Path<? extends RecommendHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecommendHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecommendHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(RecommendHistoryEntity.class, metadata, inits);
    }

    public QRecommendHistoryEntity(Class<? extends RecommendHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.recommendee = inits.isInitialized("recommendee") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("recommendee"), inits.get("recommendee")) : null;
        this.recommender = inits.isInitialized("recommender") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("recommender"), inits.get("recommender")) : null;
    }

}

