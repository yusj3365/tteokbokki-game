package com.cmb.rainbowtv.domain.promotion.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPromotionRegistrantEntity is a Querydsl query type for PromotionRegistrantEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPromotionRegistrantEntity extends EntityPathBase<PromotionRegistrantEntity> {

    private static final long serialVersionUID = 1375990256L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPromotionRegistrantEntity promotionRegistrantEntity = new QPromotionRegistrantEntity("promotionRegistrantEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCommonPromotionEntity commonPromotion;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> preIdx = createNumber("preIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPromotionRegistrantEntity(String variable) {
        this(PromotionRegistrantEntity.class, forVariable(variable), INITS);
    }

    public QPromotionRegistrantEntity(Path<? extends PromotionRegistrantEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPromotionRegistrantEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPromotionRegistrantEntity(PathMetadata metadata, PathInits inits) {
        this(PromotionRegistrantEntity.class, metadata, inits);
    }

    public QPromotionRegistrantEntity(Class<? extends PromotionRegistrantEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.commonPromotion = inits.isInitialized("commonPromotion") ? new QCommonPromotionEntity(forProperty("commonPromotion"), inits.get("commonPromotion")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

