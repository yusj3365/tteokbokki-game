package com.cmb.rainbowtv.domain.order.infra;

import com.cmb.rainbowtv.domain.order.infra.data.entity.PayAppleEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.PayGoogleEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.PayInisEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.PayInisVBankEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.PayKakaoEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.PayNaverEntity;
import com.cmb.rainbowtv.domain.order.model.PayApple;
import com.cmb.rainbowtv.domain.order.model.PayGoogle;
import com.cmb.rainbowtv.domain.order.model.PayInis;
import com.cmb.rainbowtv.domain.order.model.PayInisVbank;
import com.cmb.rainbowtv.domain.order.model.PayKakao;
import com.cmb.rainbowtv.domain.order.model.PayNaver;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class PayInfraMapperImpl implements PayInfraMapper {

    @Override
    public PayNaver toPayNaver(PayNaverEntity payNaverEntity) {
        if ( payNaverEntity == null ) {
            return null;
        }

        PayNaver.PayNaverBuilder<?, ?> payNaver = PayNaver.builder();

        payNaver.createdAt( payNaverEntity.getCreatedAt() );
        payNaver.updatedAt( payNaverEntity.getUpdatedAt() );
        payNaver.pnIdx( payNaverEntity.getPnIdx() );
        payNaver.code( payNaverEntity.getCode() );
        payNaver.recurrentId( payNaverEntity.getRecurrentId() );
        payNaver.merchantPayId( payNaverEntity.getMerchantPayId() );
        payNaver.token( payNaverEntity.getToken() );
        payNaver.paymentId( payNaverEntity.getPaymentId() );
        payNaver.detail( payNaverEntity.getDetail() );
        payNaver.reservationAt( payNaverEntity.getReservationAt() );
        payNaver.payAt( payNaverEntity.getPayAt() );
        payNaver.errorAt( payNaverEntity.getErrorAt() );
        payNaver.errorCode( payNaverEntity.getErrorCode() );
        payNaver.errorMessage( payNaverEntity.getErrorMessage() );

        return payNaver.build();
    }

    @Override
    public PayNaverEntity toPayNaverEntity(PayNaver payNaver) {
        if ( payNaver == null ) {
            return null;
        }

        PayNaverEntity.PayNaverEntityBuilder payNaverEntity = PayNaverEntity.builder();

        payNaverEntity.pnIdx( payNaver.getPnIdx() );
        payNaverEntity.code( payNaver.getCode() );
        payNaverEntity.recurrentId( payNaver.getRecurrentId() );
        payNaverEntity.merchantPayId( payNaver.getMerchantPayId() );
        payNaverEntity.token( payNaver.getToken() );
        payNaverEntity.paymentId( payNaver.getPaymentId() );
        payNaverEntity.detail( payNaver.getDetail() );
        payNaverEntity.reservationAt( payNaver.getReservationAt() );
        payNaverEntity.payAt( payNaver.getPayAt() );
        payNaverEntity.errorAt( payNaver.getErrorAt() );
        payNaverEntity.errorCode( payNaver.getErrorCode() );
        payNaverEntity.errorMessage( payNaver.getErrorMessage() );

        return payNaverEntity.build();
    }

    @Override
    public PayInis toPayInis(PayInisEntity payInisEntity) {
        if ( payInisEntity == null ) {
            return null;
        }

        PayInis.PayInisBuilder<?, ?> payInis = PayInis.builder();

        payInis.createdAt( payInisEntity.getCreatedAt() );
        payInis.updatedAt( payInisEntity.getUpdatedAt() );
        payInis.piIdx( payInisEntity.getPiIdx() );
        payInis.resultCode( payInisEntity.getResultCode() );
        payInis.resultMsg( payInisEntity.getResultMsg() );
        payInis.tid( payInisEntity.getTid() );
        payInis.goodName( payInisEntity.getGoodName() );
        payInis.totPrice( payInisEntity.getTotPrice() );
        payInis.moid( payInisEntity.getMoid() );
        payInis.payMethod( payInisEntity.getPayMethod() );
        payInis.applNum( payInisEntity.getApplNum() );
        payInis.applDate( payInisEntity.getApplDate() );
        payInis.applTime( payInisEntity.getApplTime() );
        payInis.eventCode( payInisEntity.getEventCode() );
        payInis.buyerName( payInisEntity.getBuyerName() );
        payInis.buyerTel( payInisEntity.getBuyerTel() );
        payInis.buyerEmail( payInisEntity.getBuyerEmail() );
        payInis.custEmail( payInisEntity.getCustEmail() );
        payInis.cardNum( payInisEntity.getCardNum() );
        payInis.cardInterest( payInisEntity.getCardInterest() );
        payInis.cardQuota( payInisEntity.getCardQuota() );
        payInis.cardCode( payInisEntity.getCardCode() );
        payInis.cardCorpFlag( payInisEntity.getCardCorpFlag() );
        payInis.cardCheckFlag( payInisEntity.getCardCheckFlag() );
        payInis.cardPrtcCode( payInisEntity.getCardPrtcCode() );
        payInis.cardBankCode( payInisEntity.getCardBankCode() );
        payInis.cardSrcCode( payInisEntity.getCardSrcCode() );
        payInis.cardPoint( payInisEntity.getCardPoint() );
        payInis.cardCouponPrice( payInisEntity.getCardCouponPrice() );
        payInis.cardCouponDiscount( payInisEntity.getCardCouponDiscount() );
        payInis.cardUsePoint( payInisEntity.getCardUsePoint() );
        payInis.naverpointUseFreePoint( payInisEntity.getNaverpointUseFreePoint() );
        payInis.naverpointCshrApplYn( payInisEntity.getNaverpointCshrApplYn() );
        payInis.naverpointCshrApplAmt( payInisEntity.getNaverpointCshrApplAmt() );
        payInis.currency( payInisEntity.getCurrency() );
        payInis.orgPrice( payInisEntity.getOrgPrice() );
        payInis.cardBillkey( payInisEntity.getCardBillkey() );
        payInis.acctBankCode( payInisEntity.getAcctBankCode() );
        payInis.cshrResultCode( payInisEntity.getCshrResultCode() );
        payInis.cshrType( payInisEntity.getCshrType() );
        payInis.cshrApplNum( payInisEntity.getCshrApplNum() );
        payInis.cshrApplPrice( payInisEntity.getCshrApplPrice() );
        payInis.acctName( payInisEntity.getAcctName() );
        payInis.payOption( payInisEntity.getPayOption() );
        payInis.ocbNum( payInisEntity.getOcbNum() );
        payInis.ocbPayPrice( payInisEntity.getOcbPayPrice() );
        payInis.ocbSaveApplNum( payInisEntity.getOcbSaveApplNum() );
        payInis.ocbPayApplNum( payInisEntity.getOcbPayApplNum() );
        payInis.ocbApplDate( payInisEntity.getOcbApplDate() );
        payInis.upointNum( payInisEntity.getUpointNum() );
        payInis.upointUsablePoint( payInisEntity.getUpointUsablePoint() );
        payInis.upointApplPrice( payInisEntity.getUpointApplPrice() );
        payInis.upntPayOption( payInisEntity.getUpntPayOption() );
        payInis.upntSavePrice( payInisEntity.getUpntSavePrice() );
        payInis.upntPayPrice( payInisEntity.getUpntPayPrice() );
        payInis.gsptApplPrice( payInisEntity.getGsptApplPrice() );
        payInis.gsptSavePrice( payInisEntity.getGsptSavePrice() );
        payInis.gsptPayPrice( payInisEntity.getGsptPayPrice() );
        payInis.fnNm( payInisEntity.getFnNm() );
        payInis.cshrDt( payInisEntity.getCshrDt() );
        payInis.paNoti( payInisEntity.getPaNoti() );
        payInis.paFnCd2( payInisEntity.getPaFnCd2() );
        payInis.vactBankCode( payInisEntity.getVactBankCode() );
        payInis.vactBankName( payInisEntity.getVactBankName() );
        payInis.vactNum( payInisEntity.getVactNum() );
        payInis.vactName( payInisEntity.getVactName() );
        payInis.vactInputName( payInisEntity.getVactInputName() );
        payInis.vactDateTime( payInisEntity.getVactDateTime() );
        payInis.vactCancelDateTime( payInisEntity.getVactCancelDateTime() );
        payInis.paNotiUrl( payInisEntity.getPaNotiUrl() );

        return payInis.build();
    }

    @Override
    public PayInisEntity toPayInisEntity(PayInis payInis) {
        if ( payInis == null ) {
            return null;
        }

        PayInisEntity.PayInisEntityBuilder payInisEntity = PayInisEntity.builder();

        payInisEntity.piIdx( payInis.getPiIdx() );
        payInisEntity.resultCode( payInis.getResultCode() );
        payInisEntity.resultMsg( payInis.getResultMsg() );
        payInisEntity.tid( payInis.getTid() );
        payInisEntity.goodName( payInis.getGoodName() );
        payInisEntity.totPrice( payInis.getTotPrice() );
        payInisEntity.moid( payInis.getMoid() );
        payInisEntity.payMethod( payInis.getPayMethod() );
        payInisEntity.applNum( payInis.getApplNum() );
        payInisEntity.applDate( payInis.getApplDate() );
        payInisEntity.applTime( payInis.getApplTime() );
        payInisEntity.eventCode( payInis.getEventCode() );
        payInisEntity.buyerName( payInis.getBuyerName() );
        payInisEntity.buyerTel( payInis.getBuyerTel() );
        payInisEntity.buyerEmail( payInis.getBuyerEmail() );
        payInisEntity.custEmail( payInis.getCustEmail() );
        payInisEntity.cardNum( payInis.getCardNum() );
        payInisEntity.cardInterest( payInis.getCardInterest() );
        payInisEntity.cardQuota( payInis.getCardQuota() );
        payInisEntity.cardCode( payInis.getCardCode() );
        payInisEntity.cardCorpFlag( payInis.getCardCorpFlag() );
        payInisEntity.cardCheckFlag( payInis.getCardCheckFlag() );
        payInisEntity.cardPrtcCode( payInis.getCardPrtcCode() );
        payInisEntity.cardBankCode( payInis.getCardBankCode() );
        payInisEntity.cardSrcCode( payInis.getCardSrcCode() );
        payInisEntity.cardPoint( payInis.getCardPoint() );
        payInisEntity.cardCouponPrice( payInis.getCardCouponPrice() );
        payInisEntity.cardCouponDiscount( payInis.getCardCouponDiscount() );
        payInisEntity.cardUsePoint( payInis.getCardUsePoint() );
        payInisEntity.naverpointUseFreePoint( payInis.getNaverpointUseFreePoint() );
        payInisEntity.naverpointCshrApplYn( payInis.getNaverpointCshrApplYn() );
        payInisEntity.naverpointCshrApplAmt( payInis.getNaverpointCshrApplAmt() );
        payInisEntity.currency( payInis.getCurrency() );
        payInisEntity.orgPrice( payInis.getOrgPrice() );
        payInisEntity.cardBillkey( payInis.getCardBillkey() );
        payInisEntity.acctBankCode( payInis.getAcctBankCode() );
        payInisEntity.cshrResultCode( payInis.getCshrResultCode() );
        payInisEntity.cshrType( payInis.getCshrType() );
        payInisEntity.cshrApplNum( payInis.getCshrApplNum() );
        payInisEntity.cshrApplPrice( payInis.getCshrApplPrice() );
        payInisEntity.acctName( payInis.getAcctName() );
        payInisEntity.payOption( payInis.getPayOption() );
        payInisEntity.ocbNum( payInis.getOcbNum() );
        payInisEntity.ocbPayPrice( payInis.getOcbPayPrice() );
        payInisEntity.ocbSaveApplNum( payInis.getOcbSaveApplNum() );
        payInisEntity.ocbPayApplNum( payInis.getOcbPayApplNum() );
        payInisEntity.ocbApplDate( payInis.getOcbApplDate() );
        payInisEntity.upointNum( payInis.getUpointNum() );
        payInisEntity.upointUsablePoint( payInis.getUpointUsablePoint() );
        payInisEntity.upointApplPrice( payInis.getUpointApplPrice() );
        payInisEntity.upntPayOption( payInis.getUpntPayOption() );
        payInisEntity.upntSavePrice( payInis.getUpntSavePrice() );
        payInisEntity.upntPayPrice( payInis.getUpntPayPrice() );
        payInisEntity.gsptApplPrice( payInis.getGsptApplPrice() );
        payInisEntity.gsptSavePrice( payInis.getGsptSavePrice() );
        payInisEntity.gsptPayPrice( payInis.getGsptPayPrice() );
        payInisEntity.fnNm( payInis.getFnNm() );
        payInisEntity.cshrDt( payInis.getCshrDt() );
        payInisEntity.paNoti( payInis.getPaNoti() );
        payInisEntity.paFnCd2( payInis.getPaFnCd2() );
        payInisEntity.vactBankCode( payInis.getVactBankCode() );
        payInisEntity.vactBankName( payInis.getVactBankName() );
        payInisEntity.vactNum( payInis.getVactNum() );
        payInisEntity.vactName( payInis.getVactName() );
        payInisEntity.vactInputName( payInis.getVactInputName() );
        payInisEntity.vactDateTime( payInis.getVactDateTime() );
        payInisEntity.vactCancelDateTime( payInis.getVactCancelDateTime() );
        payInisEntity.paNotiUrl( payInis.getPaNotiUrl() );

        return payInisEntity.build();
    }

    @Override
    public PayInisVbank toPayInisVBank(PayInisVBankEntity bankEntity) {
        if ( bankEntity == null ) {
            return null;
        }

        PayInisVbank.PayInisVbankBuilder<?, ?> payInisVbank = PayInisVbank.builder();

        payInisVbank.createdAt( bankEntity.getCreatedAt() );
        payInisVbank.updatedAt( bankEntity.getUpdatedAt() );
        payInisVbank.pivIdx( bankEntity.getPivIdx() );
        payInisVbank.typeMsg( bankEntity.getTypeMsg() );
        payInisVbank.noTid( bankEntity.getNoTid() );
        payInisVbank.noOid( bankEntity.getNoOid() );
        payInisVbank.cdBank( bankEntity.getCdBank() );
        payInisVbank.cdDeal( bankEntity.getCdDeal() );
        payInisVbank.dtTrans( bankEntity.getDtTrans() );
        payInisVbank.tmTrans( bankEntity.getTmTrans() );
        payInisVbank.noVacct( bankEntity.getNoVacct() );
        payInisVbank.amtInput( bankEntity.getAmtInput() );
        payInisVbank.amtCheck( bankEntity.getAmtCheck() );
        payInisVbank.nmInputbank( bankEntity.getNmInputbank() );
        payInisVbank.nmInput( bankEntity.getNmInput() );
        payInisVbank.clClose( bankEntity.getClClose() );
        payInisVbank.flgClose( bankEntity.getFlgClose() );
        payInisVbank.dtInputstd( bankEntity.getDtInputstd() );
        payInisVbank.dtCalculstd( bankEntity.getDtCalculstd() );
        payInisVbank.clTrans( bankEntity.getClTrans() );
        payInisVbank.clKor( bankEntity.getClKor() );
        payInisVbank.dtCshr( bankEntity.getDtCshr() );
        payInisVbank.tmCshr( bankEntity.getTmCshr() );
        payInisVbank.noCshrAppl( bankEntity.getNoCshrAppl() );
        payInisVbank.noCshrTid( bankEntity.getNoCshrTid() );

        return payInisVbank.build();
    }

    @Override
    public PayInisVBankEntity toPayInisVBankEntity(PayInisVbank payInisVbank) {
        if ( payInisVbank == null ) {
            return null;
        }

        PayInisVBankEntity.PayInisVBankEntityBuilder payInisVBankEntity = PayInisVBankEntity.builder();

        payInisVBankEntity.pivIdx( payInisVbank.getPivIdx() );
        payInisVBankEntity.typeMsg( payInisVbank.getTypeMsg() );
        payInisVBankEntity.noTid( payInisVbank.getNoTid() );
        payInisVBankEntity.noOid( payInisVbank.getNoOid() );
        payInisVBankEntity.cdBank( payInisVbank.getCdBank() );
        payInisVBankEntity.cdDeal( payInisVbank.getCdDeal() );
        payInisVBankEntity.dtTrans( payInisVbank.getDtTrans() );
        payInisVBankEntity.tmTrans( payInisVbank.getTmTrans() );
        payInisVBankEntity.noVacct( payInisVbank.getNoVacct() );
        payInisVBankEntity.amtInput( payInisVbank.getAmtInput() );
        payInisVBankEntity.amtCheck( payInisVbank.getAmtCheck() );
        payInisVBankEntity.nmInputbank( payInisVbank.getNmInputbank() );
        payInisVBankEntity.nmInput( payInisVbank.getNmInput() );
        payInisVBankEntity.clClose( payInisVbank.getClClose() );
        payInisVBankEntity.flgClose( payInisVbank.getFlgClose() );
        payInisVBankEntity.dtInputstd( payInisVbank.getDtInputstd() );
        payInisVBankEntity.dtCalculstd( payInisVbank.getDtCalculstd() );
        payInisVBankEntity.clTrans( payInisVbank.getClTrans() );
        payInisVBankEntity.clKor( payInisVbank.getClKor() );
        payInisVBankEntity.dtCshr( payInisVbank.getDtCshr() );
        payInisVBankEntity.tmCshr( payInisVbank.getTmCshr() );
        payInisVBankEntity.noCshrAppl( payInisVbank.getNoCshrAppl() );
        payInisVBankEntity.noCshrTid( payInisVbank.getNoCshrTid() );

        return payInisVBankEntity.build();
    }

    @Override
    public PayKakao toPayKakao(PayKakaoEntity payKakaoEntity) {
        if ( payKakaoEntity == null ) {
            return null;
        }

        PayKakao.PayKakaoBuilder<?, ?> payKakao = PayKakao.builder();

        payKakao.createdAt( payKakaoEntity.getCreatedAt() );
        payKakao.updatedAt( payKakaoEntity.getUpdatedAt() );
        payKakao.pkIdx( payKakaoEntity.getPkIdx() );
        payKakao.code( payKakaoEntity.getCode() );
        payKakao.aid( payKakaoEntity.getAid() );
        payKakao.tid( payKakaoEntity.getTid() );
        payKakao.sid( payKakaoEntity.getSid() );
        payKakao.partnerOrderId( payKakaoEntity.getPartnerOrderId() );
        payKakao.partnerUserId( payKakaoEntity.getPartnerUserId() );
        payKakao.paymentMethodType( payKakaoEntity.getPaymentMethodType() );
        payKakao.amount( payKakaoEntity.getAmount() );
        payKakao.cardInfo( payKakaoEntity.getCardInfo() );
        payKakao.itemName( payKakaoEntity.getItemName() );
        payKakao.readyAt( payKakaoEntity.getReadyAt() );
        payKakao.approvedAt( payKakaoEntity.getApprovedAt() );
        payKakao.cancelAt( payKakaoEntity.getCancelAt() );
        payKakao.errorAt( payKakaoEntity.getErrorAt() );
        payKakao.errorCode( payKakaoEntity.getErrorCode() );
        payKakao.errorMessage( payKakaoEntity.getErrorMessage() );

        return payKakao.build();
    }

    @Override
    public PayKakaoEntity toPayKakaoEntity(PayKakao payKakao) {
        if ( payKakao == null ) {
            return null;
        }

        PayKakaoEntity.PayKakaoEntityBuilder payKakaoEntity = PayKakaoEntity.builder();

        payKakaoEntity.pkIdx( payKakao.getPkIdx() );
        payKakaoEntity.code( payKakao.getCode() );
        payKakaoEntity.aid( payKakao.getAid() );
        payKakaoEntity.tid( payKakao.getTid() );
        payKakaoEntity.sid( payKakao.getSid() );
        payKakaoEntity.partnerOrderId( payKakao.getPartnerOrderId() );
        payKakaoEntity.partnerUserId( payKakao.getPartnerUserId() );
        payKakaoEntity.paymentMethodType( payKakao.getPaymentMethodType() );
        payKakaoEntity.amount( payKakao.getAmount() );
        payKakaoEntity.cardInfo( payKakao.getCardInfo() );
        payKakaoEntity.itemName( payKakao.getItemName() );
        payKakaoEntity.readyAt( payKakao.getReadyAt() );
        payKakaoEntity.approvedAt( payKakao.getApprovedAt() );
        payKakaoEntity.cancelAt( payKakao.getCancelAt() );
        payKakaoEntity.errorAt( payKakao.getErrorAt() );
        payKakaoEntity.errorCode( payKakao.getErrorCode() );
        payKakaoEntity.errorMessage( payKakao.getErrorMessage() );

        return payKakaoEntity.build();
    }

    @Override
    public PayAppleEntity toPayAppleEntity(PayApple payApple) {
        if ( payApple == null ) {
            return null;
        }

        PayAppleEntity.PayAppleEntityBuilder payAppleEntity = PayAppleEntity.builder();

        payAppleEntity.paIdx( payApple.getPaIdx() );
        payAppleEntity.orUuid( payApple.getOrUuid() );
        payAppleEntity.paStatus( payApple.getPaStatus() );
        payAppleEntity.paOriginData( payApple.getPaOriginData() );

        return payAppleEntity.build();
    }

    @Override
    public PayGoogleEntity toPayGoogleEntity(PayGoogle payGoogle) {
        if ( payGoogle == null ) {
            return null;
        }

        PayGoogleEntity.PayGoogleEntityBuilder payGoogleEntity = PayGoogleEntity.builder();

        payGoogleEntity.pgIdx( payGoogle.getPgIdx() );
        payGoogleEntity.orUuid( payGoogle.getOrUuid() );
        payGoogleEntity.pgStatus( payGoogle.getPgStatus() );
        payGoogleEntity.orderId( payGoogle.getOrderId() );
        payGoogleEntity.pgOriginData( payGoogle.getPgOriginData() );

        return payGoogleEntity.build();
    }
}
