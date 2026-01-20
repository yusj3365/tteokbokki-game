package com.cmb.rainbowtv.domain.settlement.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalculateEntity is a Querydsl query type for CalculateEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalculateEntity extends EntityPathBase<CalculateEntity> {

    private static final long serialVersionUID = 1669154864L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalculateEntity calculateEntity = new QCalculateEntity("calculateEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<java.math.BigDecimal> caAccruedSales = createNumber("caAccruedSales", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caAccruedSum = createNumber("caAccruedSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caAccruedSurtax = createNumber("caAccruedSurtax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caActualSum = createNumber("caActualSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caActualSupplyPrice = createNumber("caActualSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caActualSurtax = createNumber("caActualSurtax", java.math.BigDecimal.class);

    public final StringPath caAddress = createString("caAddress");

    public final StringPath caArea = createString("caArea");

    public final NumberPath<java.math.BigDecimal> caChargeSum = createNumber("caChargeSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caChargeSupplyPrice = createNumber("caChargeSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caChargeSurtax = createNumber("caChargeSurtax", java.math.BigDecimal.class);

    public final StringPath caClient = createString("caClient");

    public final StringPath caCorporate = createString("caCorporate");

    public final StringPath caCustomer = createString("caCustomer");

    public final BooleanPath caDefault = createBoolean("caDefault");

    public final NumberPath<java.math.BigDecimal> caDeliveryPrice = createNumber("caDeliveryPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caDeliverySum = createNumber("caDeliverySum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caDeliverySurtax = createNumber("caDeliverySurtax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caDiscountSum = createNumber("caDiscountSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caDiscountSupplyPrice = createNumber("caDiscountSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caDiscountSurtax = createNumber("caDiscountSurtax", java.math.BigDecimal.class);

    public final DateTimePath<java.time.LocalDateTime> caEndDate = createDateTime("caEndDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> caEventAt = createDateTime("caEventAt", java.time.LocalDateTime.class);

    public final EnumPath<com.cmb.rainbowtv.domain.settlement.model.enums.CalculateFactoryEnum> caFactory = createEnum("caFactory", com.cmb.rainbowtv.domain.settlement.model.enums.CalculateFactoryEnum.class);

    public final NumberPath<java.math.BigDecimal> caFee = createNumber("caFee", java.math.BigDecimal.class);

    public final NumberPath<Integer> caFeeCase = createNumber("caFeeCase", Integer.class);

    public final NumberPath<java.math.BigDecimal> caFeeSum = createNumber("caFeeSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caFeeSupplyPrice = createNumber("caFeeSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caFeeSurtax = createNumber("caFeeSurtax", java.math.BigDecimal.class);

    public final StringPath caFeeType = createString("caFeeType");

    public final StringPath caHp = createString("caHp");

    public final NumberPath<Long> caIdx = createNumber("caIdx", Long.class);

    public final NumberPath<Integer> caInvest = createNumber("caInvest", Integer.class);

    public final StringPath caItem = createString("caItem");

    public final StringPath caItemName = createString("caItemName");

    public final StringPath caItemOption = createString("caItemOption");

    public final StringPath caMonth = createString("caMonth");

    public final StringPath caOrderAt = createString("caOrderAt");

    public final StringPath caOrderPayment = createString("caOrderPayment");

    public final StringPath caOrderPg = createString("caOrderPg");

    public final NumberPath<Integer> caPackage = createNumber("caPackage", Integer.class);

    public final NumberPath<Long> caRemainDays = createNumber("caRemainDays", Long.class);

    public final DateTimePath<java.time.LocalDateTime> caStartDate = createDateTime("caStartDate", java.time.LocalDateTime.class);

    public final StringPath caStatus = createString("caStatus");

    public final NumberPath<java.math.BigDecimal> caStoredSum = createNumber("caStoredSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caStoredSupplyPrice = createNumber("caStoredSupplyPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caStoredSurtax = createNumber("caStoredSurtax", java.math.BigDecimal.class);

    public final StringPath caType = createString("caType");

    public final NumberPath<java.math.BigDecimal> caUnearnedPrice = createNumber("caUnearnedPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caUnearnedSum = createNumber("caUnearnedSum", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> caUnearnedSurtax = createNumber("caUnearnedSurtax", java.math.BigDecimal.class);

    public final StringPath caUseCnt = createString("caUseCnt");

    public final StringPath caUseDays = createString("caUseDays");

    public final StringPath caUuid = createString("caUuid");

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelBundleEntity channelBundle;

    public final com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelInfoEntity channelInfo;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity item;

    public final StringPath ordId = createString("ordId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCalculateEntity(String variable) {
        this(CalculateEntity.class, forVariable(variable), INITS);
    }

    public QCalculateEntity(Path<? extends CalculateEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalculateEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalculateEntity(PathMetadata metadata, PathInits inits) {
        this(CalculateEntity.class, metadata, inits);
    }

    public QCalculateEntity(Class<? extends CalculateEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channelBundle = inits.isInitialized("channelBundle") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelBundleEntity(forProperty("channelBundle")) : null;
        this.channelInfo = inits.isInitialized("channelInfo") ? new com.cmb.rainbowtv.domain.channel.infra.data.entity.QChannelInfoEntity(forProperty("channelInfo"), inits.get("channelInfo")) : null;
        this.item = inits.isInitialized("item") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity(forProperty("item")) : null;
    }

}

