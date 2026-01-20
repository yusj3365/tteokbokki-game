package com.cmb.rainbowtv.domain.promotion.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommonPromotionEntity is a Querydsl query type for CommonPromotionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommonPromotionEntity extends EntityPathBase<CommonPromotionEntity> {

    private static final long serialVersionUID = -1421737158L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommonPromotionEntity commonPromotionEntity = new QCommonPromotionEntity("commonPromotionEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath cpCode = createString("cpCode");

    public final DateTimePath<java.time.LocalDateTime> cpEndDate = createDateTime("cpEndDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> cpIdx = createNumber("cpIdx", Long.class);

    public final NumberPath<Long> cpIssuedCount = createNumber("cpIssuedCount", Long.class);

    public final NumberPath<Integer> cpIsUse = createNumber("cpIsUse", Integer.class);

    public final StringPath cpName = createString("cpName");

    public final DateTimePath<java.time.LocalDateTime> cpStartDate = createDateTime("cpStartDate", java.time.LocalDateTime.class);

    public final EnumPath<com.cmb.rainbowtv.domain.promotion.model.enums.PromotionTypeEnum> cpType = createEnum("cpType", com.cmb.rainbowtv.domain.promotion.model.enums.PromotionTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCommonPromotionEntity(String variable) {
        this(CommonPromotionEntity.class, forVariable(variable), INITS);
    }

    public QCommonPromotionEntity(Path<? extends CommonPromotionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommonPromotionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommonPromotionEntity(PathMetadata metadata, PathInits inits) {
        this(CommonPromotionEntity.class, metadata, inits);
    }

    public QCommonPromotionEntity(Class<? extends CommonPromotionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

