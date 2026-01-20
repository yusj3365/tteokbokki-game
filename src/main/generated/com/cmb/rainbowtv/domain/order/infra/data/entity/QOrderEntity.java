package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderEntity is a Querydsl query type for OrderEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderEntity extends EntityPathBase<OrderEntity> {

    private static final long serialVersionUID = -740448581L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderEntity orderEntity = new QOrderEntity("orderEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.bankCode.infra.data.entity.QBankCodeDefineEntity bankCodeDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> drdDeliveryCompleteDate = createDateTime("drdDeliveryCompleteDate", java.time.LocalDateTime.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath ordBankAccount = createString("ordBankAccount");

    public final DateTimePath<java.time.LocalDateTime> ordCancelDate = createDateTime("ordCancelDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> ordCancelPrice = createNumber("ordCancelPrice", Long.class);

    public final NumberPath<Long> ordCount = createNumber("ordCount", Long.class);

    public final NumberPath<Long> ordCouponPrice = createNumber("ordCouponPrice", Long.class);

    public final DateTimePath<java.time.LocalDateTime> ordDeliveryWaitDate = createDateTime("ordDeliveryWaitDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> ordDepositPrice = createNumber("ordDepositPrice", Long.class);

    public final NumberPath<Long> ordFreeMny = createNumber("ordFreeMny", Long.class);

    public final StringPath ordId = createString("ordId");

    public final NumberPath<Long> ordIdx = createNumber("ordIdx", Long.class);

    public final StringPath ordMemo = createString("ordMemo");

    public final StringPath ordModHistory = createString("ordModHistory");

    public final NumberPath<Long> ordMountainPrice = createNumber("ordMountainPrice", Long.class);

    public final StringPath ordName = createString("ordName");

    public final NumberPath<Integer> ordPayment = createNumber("ordPayment", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.order.model.enums.OrPgEnum> ordPg = createEnum("ordPg", com.cmb.rainbowtv.domain.order.model.enums.OrPgEnum.class);

    public final StringPath ordPgKey = createString("ordPgKey");

    public final NumberPath<java.math.BigDecimal> ordPrice = createNumber("ordPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ordPriceOrg = createNumber("ordPriceOrg", java.math.BigDecimal.class);

    public final NumberPath<Long> ordReceiptPoint = createNumber("ordReceiptPoint", Long.class);

    public final DateTimePath<java.time.LocalDateTime> ordReceiptTime = createDateTime("ordReceiptTime", java.time.LocalDateTime.class);

    public final StringPath ordRefundAdmin = createString("ordRefundAdmin");

    public final NumberPath<Long> ordRefundAdminNo = createNumber("ordRefundAdminNo", Long.class);

    public final StringPath ordRefundBankAccount = createString("ordRefundBankAccount");

    public final StringPath ordRefundBankName = createString("ordRefundBankName");

    public final DateTimePath<java.time.LocalDateTime> ordRefundDate = createDateTime("ordRefundDate", java.time.LocalDateTime.class);

    public final NumberPath<java.math.BigDecimal> ordRefundPrice = createNumber("ordRefundPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> ordSalePrice = createNumber("ordSalePrice", java.math.BigDecimal.class);

    public final NumberPath<Long> ordSendPrice = createNumber("ordSendPrice", Long.class);

    public final NumberPath<Integer> ordStatus = createNumber("ordStatus", Integer.class);

    public final NumberPath<Integer> ordTaxFlag = createNumber("ordTaxFlag", Integer.class);

    public final NumberPath<Long> ordTaxMny = createNumber("ordTaxMny", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.order.model.enums.OrderTypeEnum> ordType = createEnum("ordType", com.cmb.rainbowtv.domain.order.model.enums.OrderTypeEnum.class);

    public final NumberPath<Long> ordVatMny = createNumber("ordVatMny", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QOrderEntity(String variable) {
        this(OrderEntity.class, forVariable(variable), INITS);
    }

    public QOrderEntity(Path<? extends OrderEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderEntity(PathMetadata metadata, PathInits inits) {
        this(OrderEntity.class, metadata, inits);
    }

    public QOrderEntity(Class<? extends OrderEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bankCodeDefine = inits.isInitialized("bankCodeDefine") ? new com.cmb.rainbowtv.global.define.bankCode.infra.data.entity.QBankCodeDefineEntity(forProperty("bankCodeDefine")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

