package com.cmb.rainbowtv.domain.billing.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBillingAcceptInisEntity is a Querydsl query type for BillingAcceptInisEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBillingAcceptInisEntity extends EntityPathBase<BillingAcceptInisEntity> {

    private static final long serialVersionUID = 755835820L;

    public static final QBillingAcceptInisEntity billingAcceptInisEntity = new QBillingAcceptInisEntity("billingAcceptInisEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> baiIdx = createNumber("baiIdx", Long.class);

    public final StringPath cardCode = createString("cardCode");

    public final StringPath cardQuota = createString("cardQuota");

    public final StringPath checkFlg = createString("checkFlg");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mid = createString("mid");

    public final StringPath orderid = createString("orderid");

    public final StringPath payAuthCode = createString("payAuthCode");

    public final StringPath payDate = createString("payDate");

    public final StringPath payTime = createString("payTime");

    public final StringPath price = createString("price");

    public final StringPath prtcCode = createString("prtcCode");

    public final StringPath resultCode = createString("resultCode");

    public final StringPath resultMsg = createString("resultMsg");

    public final StringPath tid = createString("tid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBillingAcceptInisEntity(String variable) {
        super(BillingAcceptInisEntity.class, forVariable(variable));
    }

    public QBillingAcceptInisEntity(Path<? extends BillingAcceptInisEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBillingAcceptInisEntity(PathMetadata metadata) {
        super(BillingAcceptInisEntity.class, metadata);
    }

}

