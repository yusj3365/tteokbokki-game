package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayInisEntity is a Querydsl query type for PayInisEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayInisEntity extends EntityPathBase<PayInisEntity> {

    private static final long serialVersionUID = 1084913668L;

    public static final QPayInisEntity payInisEntity = new QPayInisEntity("payInisEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath acctBankCode = createString("acctBankCode");

    public final StringPath acctName = createString("acctName");

    public final DateTimePath<java.time.LocalDateTime> applDate = createDateTime("applDate", java.time.LocalDateTime.class);

    public final StringPath applNum = createString("applNum");

    public final DateTimePath<java.time.LocalDateTime> applTime = createDateTime("applTime", java.time.LocalDateTime.class);

    public final StringPath buyerEmail = createString("buyerEmail");

    public final StringPath buyerName = createString("buyerName");

    public final StringPath buyerTel = createString("buyerTel");

    public final StringPath cardBankCode = createString("cardBankCode");

    public final StringPath cardBillkey = createString("cardBillkey");

    public final NumberPath<Integer> cardCheckFlag = createNumber("cardCheckFlag", Integer.class);

    public final StringPath cardCode = createString("cardCode");

    public final NumberPath<Integer> cardCorpFlag = createNumber("cardCorpFlag", Integer.class);

    public final NumberPath<Long> cardCouponDiscount = createNumber("cardCouponDiscount", Long.class);

    public final NumberPath<Long> cardCouponPrice = createNumber("cardCouponPrice", Long.class);

    public final NumberPath<Long> cardInterest = createNumber("cardInterest", Long.class);

    public final StringPath cardNum = createString("cardNum");

    public final NumberPath<Long> cardPoint = createNumber("cardPoint", Long.class);

    public final NumberPath<Integer> cardPrtcCode = createNumber("cardPrtcCode", Integer.class);

    public final StringPath cardQuota = createString("cardQuota");

    public final StringPath cardSrcCode = createString("cardSrcCode");

    public final NumberPath<Long> cardUsePoint = createNumber("cardUsePoint", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath cshrApplNum = createString("cshrApplNum");

    public final StringPath cshrApplPrice = createString("cshrApplPrice");

    public final StringPath cshrDt = createString("cshrDt");

    public final StringPath cshrResultCode = createString("cshrResultCode");

    public final NumberPath<Integer> cshrType = createNumber("cshrType", Integer.class);

    public final StringPath currency = createString("currency");

    public final StringPath custEmail = createString("custEmail");

    public final StringPath eventCode = createString("eventCode");

    public final StringPath fnNm = createString("fnNm");

    public final StringPath goodName = createString("goodName");

    public final NumberPath<Long> gsptApplPrice = createNumber("gsptApplPrice", Long.class);

    public final NumberPath<Long> gsptPayPrice = createNumber("gsptPayPrice", Long.class);

    public final NumberPath<Long> gsptSavePrice = createNumber("gsptSavePrice", Long.class);

    public final StringPath moid = createString("moid");

    public final NumberPath<Long> naverpointCshrApplAmt = createNumber("naverpointCshrApplAmt", Long.class);

    public final NumberPath<Integer> naverpointCshrApplYn = createNumber("naverpointCshrApplYn", Integer.class);

    public final NumberPath<Long> naverpointUseFreePoint = createNumber("naverpointUseFreePoint", Long.class);

    public final DateTimePath<java.time.LocalDateTime> ocbApplDate = createDateTime("ocbApplDate", java.time.LocalDateTime.class);

    public final StringPath ocbNum = createString("ocbNum");

    public final StringPath ocbPayApplNum = createString("ocbPayApplNum");

    public final NumberPath<Long> ocbPayPrice = createNumber("ocbPayPrice", Long.class);

    public final StringPath ocbSaveApplNum = createString("ocbSaveApplNum");

    public final NumberPath<Long> orgPrice = createNumber("orgPrice", Long.class);

    public final StringPath paFnCd2 = createString("paFnCd2");

    public final StringPath paNoti = createString("paNoti");

    public final StringPath paNotiUrl = createString("paNotiUrl");

    public final StringPath payMethod = createString("payMethod");

    public final StringPath payOption = createString("payOption");

    public final NumberPath<Long> piIdx = createNumber("piIdx", Long.class);

    public final StringPath resultCode = createString("resultCode");

    public final StringPath resultMsg = createString("resultMsg");

    public final StringPath tid = createString("tid");

    public final NumberPath<Long> totPrice = createNumber("totPrice", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath upntPayOption = createString("upntPayOption");

    public final NumberPath<Long> upntPayPrice = createNumber("upntPayPrice", Long.class);

    public final NumberPath<Long> upntSavePrice = createNumber("upntSavePrice", Long.class);

    public final NumberPath<Long> upointApplPrice = createNumber("upointApplPrice", Long.class);

    public final StringPath upointNum = createString("upointNum");

    public final NumberPath<Long> upointUsablePoint = createNumber("upointUsablePoint", Long.class);

    public final StringPath vactBankCode = createString("vactBankCode");

    public final StringPath vactBankName = createString("vactBankName");

    public final DateTimePath<java.time.LocalDateTime> vactCancelDateTime = createDateTime("vactCancelDateTime", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> vactDateTime = createDateTime("vactDateTime", java.time.LocalDateTime.class);

    public final StringPath vactInputName = createString("vactInputName");

    public final StringPath vactName = createString("vactName");

    public final StringPath vactNum = createString("vactNum");

    public QPayInisEntity(String variable) {
        super(PayInisEntity.class, forVariable(variable));
    }

    public QPayInisEntity(Path<? extends PayInisEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayInisEntity(PathMetadata metadata) {
        super(PayInisEntity.class, metadata);
    }

}

