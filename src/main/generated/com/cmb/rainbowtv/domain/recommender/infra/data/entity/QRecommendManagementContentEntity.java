package com.cmb.rainbowtv.domain.recommender.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecommendManagementContentEntity is a Querydsl query type for RecommendManagementContentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecommendManagementContentEntity extends EntityPathBase<RecommendManagementContentEntity> {

    private static final long serialVersionUID = -180118920L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecommendManagementContentEntity recommendManagementContentEntity = new QRecommendManagementContentEntity("recommendManagementContentEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QRecommendManagementEntity recommendManagement;

    public final NumberPath<Long> rmcContent = createNumber("rmcContent", Long.class);

    public final NumberPath<Long> rmcIdx = createNumber("rmcIdx", Long.class);

    public final NumberPath<Integer> rmcSeq = createNumber("rmcSeq", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QRecommendManagementContentEntity(String variable) {
        this(RecommendManagementContentEntity.class, forVariable(variable), INITS);
    }

    public QRecommendManagementContentEntity(Path<? extends RecommendManagementContentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecommendManagementContentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecommendManagementContentEntity(PathMetadata metadata, PathInits inits) {
        this(RecommendManagementContentEntity.class, metadata, inits);
    }

    public QRecommendManagementContentEntity(Class<? extends RecommendManagementContentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.recommendManagement = inits.isInitialized("recommendManagement") ? new QRecommendManagementEntity(forProperty("recommendManagement")) : null;
    }

}

