package com.cmb.rainbowtv.domain.billing.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBillingNaverEntity is a Querydsl query type for BillingNaverEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBillingNaverEntity extends EntityPathBase<BillingNaverEntity> {

    private static final long serialVersionUID = 1765508897L;

    public static final QBillingNaverEntity billingNaverEntity = new QBillingNaverEntity("billingNaverEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath actionType = createString("actionType");

    public final DateTimePath<java.time.LocalDateTime> billingAt = createDateTime("billingAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> bnIdx = createNumber("bnIdx", Long.class);

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath preRecurrentId = createString("preRecurrentId");

    public final StringPath recurrentId = createString("recurrentId");

    public final StringPath reserveId = createString("reserveId");

    public final StringPath tempReceiptId = createString("tempReceiptId");

    public final DateTimePath<java.time.LocalDateTime> unSubscribeAt = createDateTime("unSubscribeAt", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath userEmail = createString("userEmail");

    public final StringPath userIdentifier = createString("userIdentifier");

    public QBillingNaverEntity(String variable) {
        super(BillingNaverEntity.class, forVariable(variable));
    }

    public QBillingNaverEntity(Path<? extends BillingNaverEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBillingNaverEntity(PathMetadata metadata) {
        super(BillingNaverEntity.class, metadata);
    }

}

