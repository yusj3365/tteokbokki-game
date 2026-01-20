package com.cmb.rainbowtv.domain.recommender.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRecommendManagementEntity is a Querydsl query type for RecommendManagementEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecommendManagementEntity extends EntityPathBase<RecommendManagementEntity> {

    private static final long serialVersionUID = 1166207655L;

    public static final QRecommendManagementEntity recommendManagementEntity = new QRecommendManagementEntity("recommendManagementEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> rmDisplay = createNumber("rmDisplay", Integer.class);

    public final NumberPath<Long> rmIdx = createNumber("rmIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.recommender.model.enums.RmMenuEnum> rmMenu = createEnum("rmMenu", com.cmb.rainbowtv.domain.recommender.model.enums.RmMenuEnum.class);

    public final StringPath rmTitle = createString("rmTitle");

    public final EnumPath<com.cmb.rainbowtv.domain.recommender.model.enums.RmTypeEnum> rmType = createEnum("rmType", com.cmb.rainbowtv.domain.recommender.model.enums.RmTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QRecommendManagementEntity(String variable) {
        super(RecommendManagementEntity.class, forVariable(variable));
    }

    public QRecommendManagementEntity(Path<? extends RecommendManagementEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRecommendManagementEntity(PathMetadata metadata) {
        super(RecommendManagementEntity.class, metadata);
    }

}

