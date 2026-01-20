package com.cmb.rainbowtv.domain.coupon.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCouponEntity is a Querydsl query type for CouponEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCouponEntity extends EntityPathBase<CouponEntity> {

    private static final long serialVersionUID = 596953253L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCouponEntity couponEntity = new QCouponEntity("couponEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final DateTimePath<java.time.LocalDateTime> coCouponEd = createDateTime("coCouponEd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> coCouponSt = createDateTime("coCouponSt", java.time.LocalDateTime.class);

    public final NumberPath<Long> coCriteria = createNumber("coCriteria", Long.class);

    public final NumberPath<Long> coDeleteNo = createNumber("coDeleteNo", Long.class);

    public final NumberPath<Integer> coHaveCriteria = createNumber("coHaveCriteria", Integer.class);

    public final NumberPath<Long> coIdx = createNumber("coIdx", Long.class);

    public final NumberPath<Long> coNthTime = createNumber("coNthTime", Long.class);

    public final NumberPath<Long> coSaleMax = createNumber("coSaleMax", Long.class);

    public final NumberPath<java.math.BigDecimal> coSaleNumber = createNumber("coSaleNumber", java.math.BigDecimal.class);

    public final EnumPath<com.cmb.rainbowtv.domain.coupon.model.enums.SaleTypeEnum> coSaleType = createEnum("coSaleType", com.cmb.rainbowtv.domain.coupon.model.enums.SaleTypeEnum.class);

    public final DateTimePath<java.time.LocalDateTime> coScheduleTime = createDateTime("coScheduleTime", java.time.LocalDateTime.class);

    public final NumberPath<Integer> coSendAlarm = createNumber("coSendAlarm", Integer.class);

    public final NumberPath<Integer> coSendNow = createNumber("coSendNow", Integer.class);

    public final NumberPath<Integer> coSendPush = createNumber("coSendPush", Integer.class);

    public final NumberPath<Integer> coStatus = createNumber("coStatus", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.coupon.model.enums.SubCriteriaEnum> coSubCriteria = createEnum("coSubCriteria", com.cmb.rainbowtv.domain.coupon.model.enums.SubCriteriaEnum.class);

    public final StringPath coTitle = createString("coTitle");

    public final EnumPath<com.cmb.rainbowtv.domain.coupon.model.enums.CouponTypeEnum> coType = createEnum("coType", com.cmb.rainbowtv.domain.coupon.model.enums.CouponTypeEnum.class);

    public final NumberPath<Integer> coUse = createNumber("coUse", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.cmb.rainbowtv.domain.coupon.model.enums.IsTypeEnum> isType = createEnum("isType", com.cmb.rainbowtv.domain.coupon.model.enums.IsTypeEnum.class);

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity mediaCategory;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCouponEntity(String variable) {
        this(CouponEntity.class, forVariable(variable), INITS);
    }

    public QCouponEntity(Path<? extends CouponEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCouponEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCouponEntity(PathMetadata metadata, PathInits inits) {
        this(CouponEntity.class, metadata, inits);
    }

    public QCouponEntity(Class<? extends CouponEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaCategory = inits.isInitialized("mediaCategory") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity(forProperty("mediaCategory")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

