package com.cmb.rainbowtv.domain.coupon.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberByCouponEntity is a Querydsl query type for MemberByCouponEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberByCouponEntity extends EntityPathBase<MemberByCouponEntity> {

    private static final long serialVersionUID = 30172118L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberByCouponEntity memberByCouponEntity = new QMemberByCouponEntity("memberByCouponEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QCouponEntity coupon;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbcIdx = createNumber("mbcIdx", Long.class);

    public final NumberPath<Integer> mbcStatus = createNumber("mbcStatus", Integer.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberByCouponEntity(String variable) {
        this(MemberByCouponEntity.class, forVariable(variable), INITS);
    }

    public QMemberByCouponEntity(Path<? extends MemberByCouponEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberByCouponEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberByCouponEntity(PathMetadata metadata, PathInits inits) {
        this(MemberByCouponEntity.class, metadata, inits);
    }

    public QMemberByCouponEntity(Class<? extends MemberByCouponEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coupon = inits.isInitialized("coupon") ? new QCouponEntity(forProperty("coupon"), inits.get("coupon")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

