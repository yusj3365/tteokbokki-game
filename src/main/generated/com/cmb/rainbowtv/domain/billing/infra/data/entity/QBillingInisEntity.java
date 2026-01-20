package com.cmb.rainbowtv.domain.billing.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBillingInisEntity is a Querydsl query type for BillingInisEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBillingInisEntity extends EntityPathBase<BillingInisEntity> {

    private static final long serialVersionUID = 420588036L;

    public static final QBillingInisEntity billingInisEntity = new QBillingInisEntity("billingInisEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath authkey = createString("authkey");

    public final NumberPath<Long> biIdx = createNumber("biIdx", Long.class);

    public final StringPath billkey = createString("billkey");

    public final StringPath buyerEmail = createString("buyerEmail");

    public final StringPath buyerName = createString("buyerName");

    public final StringPath buyerTel = createString("buyerTel");

    public final StringPath cardcd = createString("cardcd");

    public final NumberPath<Integer> cardkind = createNumber("cardkind", Integer.class);

    public final StringPath cardno = createString("cardno");

    public final NumberPath<Integer> checkFlag = createNumber("checkFlag", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath data1 = createString("data1");

    public final StringPath goodName = createString("goodName");

    public final StringPath hppcorp = createString("hppcorp");

    public final StringPath merchantreserved = createString("merchantreserved");

    public final StringPath mid = createString("mid");

    public final StringPath orderid = createString("orderid");

    public final StringPath pgauthdate = createString("pgauthdate");

    public final StringPath pgauthtime = createString("pgauthtime");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath resultcode = createString("resultcode");

    public final StringPath resultmsg = createString("resultmsg");

    public final StringPath tid = createString("tid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBillingInisEntity(String variable) {
        super(BillingInisEntity.class, forVariable(variable));
    }

    public QBillingInisEntity(Path<? extends BillingInisEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBillingInisEntity(PathMetadata metadata) {
        super(BillingInisEntity.class, metadata);
    }

}

