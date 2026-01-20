package com.cmb.rainbowtv.domain.billing.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBillingKakaoEntity is a Querydsl query type for BillingKakaoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBillingKakaoEntity extends EntityPathBase<BillingKakaoEntity> {

    private static final long serialVersionUID = 224740500L;

    public static final QBillingKakaoEntity billingKakaoEntity = new QBillingKakaoEntity("billingKakaoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> bkIdx = createNumber("bkIdx", Long.class);

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath partnerUserId = createString("partnerUserId");

    public final StringPath sid = createString("sid");

    public final StringPath tid = createString("tid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBillingKakaoEntity(String variable) {
        super(BillingKakaoEntity.class, forVariable(variable));
    }

    public QBillingKakaoEntity(Path<? extends BillingKakaoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBillingKakaoEntity(PathMetadata metadata) {
        super(BillingKakaoEntity.class, metadata);
    }

}

