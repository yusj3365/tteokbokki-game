package com.cmb.rainbowtv.domain.billing.infra;

import com.cmb.rainbowtv.domain.billing.infra.data.entity.BillingAcceptInisEntity;
import com.cmb.rainbowtv.domain.billing.infra.data.entity.BillingInisEntity;
import com.cmb.rainbowtv.domain.billing.infra.data.entity.BillingKakaoEntity;
import com.cmb.rainbowtv.domain.billing.infra.data.entity.BillingNaverEntity;
import com.cmb.rainbowtv.domain.billing.model.BillingAcceptInis;
import com.cmb.rainbowtv.domain.billing.model.BillingInis;
import com.cmb.rainbowtv.domain.billing.model.BillingKakao;
import com.cmb.rainbowtv.domain.billing.model.BillingNaver;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:47+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class BillingInfraMapperImpl implements BillingInfraMapper {

    @Override
    public BillingNaver toBillingNaver(BillingNaverEntity naverEntity) {
        if ( naverEntity == null ) {
            return null;
        }

        BillingNaver.BillingNaverBuilder<?, ?> billingNaver = BillingNaver.builder();

        billingNaver.createdAt( naverEntity.getCreatedAt() );
        billingNaver.updatedAt( naverEntity.getUpdatedAt() );
        billingNaver.bnIdx( naverEntity.getBnIdx() );
        billingNaver.code( naverEntity.getCode() );
        billingNaver.reserveId( naverEntity.getReserveId() );
        billingNaver.tempReceiptId( naverEntity.getTempReceiptId() );
        billingNaver.recurrentId( naverEntity.getRecurrentId() );
        billingNaver.actionType( naverEntity.getActionType() );
        billingNaver.preRecurrentId( naverEntity.getPreRecurrentId() );
        billingNaver.userEmail( naverEntity.getUserEmail() );
        billingNaver.userIdentifier( naverEntity.getUserIdentifier() );
        billingNaver.billingAt( naverEntity.getBillingAt() );
        billingNaver.unSubscribeAt( naverEntity.getUnSubscribeAt() );

        return billingNaver.build();
    }

    @Override
    public BillingNaverEntity toBillingNaverEntity(BillingNaver naver) {
        if ( naver == null ) {
            return null;
        }

        BillingNaverEntity.BillingNaverEntityBuilder billingNaverEntity = BillingNaverEntity.builder();

        billingNaverEntity.bnIdx( naver.getBnIdx() );
        billingNaverEntity.code( naver.getCode() );
        billingNaverEntity.reserveId( naver.getReserveId() );
        billingNaverEntity.tempReceiptId( naver.getTempReceiptId() );
        billingNaverEntity.recurrentId( naver.getRecurrentId() );
        billingNaverEntity.actionType( naver.getActionType() );
        billingNaverEntity.preRecurrentId( naver.getPreRecurrentId() );
        billingNaverEntity.userEmail( naver.getUserEmail() );
        billingNaverEntity.userIdentifier( naver.getUserIdentifier() );
        billingNaverEntity.billingAt( naver.getBillingAt() );
        billingNaverEntity.unSubscribeAt( naver.getUnSubscribeAt() );

        return billingNaverEntity.build();
    }

    @Override
    public BillingInis toBillingInis(BillingInisEntity billingInisEntity) {
        if ( billingInisEntity == null ) {
            return null;
        }

        BillingInis.BillingInisBuilder<?, ?> billingInis = BillingInis.builder();

        billingInis.createdAt( billingInisEntity.getCreatedAt() );
        billingInis.updatedAt( billingInisEntity.getUpdatedAt() );
        billingInis.biIdx( billingInisEntity.getBiIdx() );
        billingInis.resultcode( billingInisEntity.getResultcode() );
        billingInis.resultmsg( billingInisEntity.getResultmsg() );
        billingInis.pgauthdate( billingInisEntity.getPgauthdate() );
        billingInis.pgauthtime( billingInisEntity.getPgauthtime() );
        billingInis.tid( billingInisEntity.getTid() );
        billingInis.mid( billingInisEntity.getMid() );
        billingInis.orderid( billingInisEntity.getOrderid() );
        billingInis.billkey( billingInisEntity.getBillkey() );
        billingInis.authkey( billingInisEntity.getAuthkey() );
        billingInis.merchantreserved( billingInisEntity.getMerchantreserved() );
        billingInis.cardcd( billingInisEntity.getCardcd() );
        billingInis.cardno( billingInisEntity.getCardno() );
        billingInis.cardkind( billingInisEntity.getCardkind() );
        billingInis.checkFlag( billingInisEntity.getCheckFlag() );
        billingInis.data1( billingInisEntity.getData1() );
        billingInis.hppcorp( billingInisEntity.getHppcorp() );
        billingInis.goodName( billingInisEntity.getGoodName() );
        billingInis.buyerName( billingInisEntity.getBuyerName() );
        billingInis.buyerEmail( billingInisEntity.getBuyerEmail() );
        billingInis.buyerTel( billingInisEntity.getBuyerTel() );
        billingInis.price( billingInisEntity.getPrice() );

        return billingInis.build();
    }

    @Override
    public BillingInisEntity toBillingInisEntity(BillingInis billingInis) {
        if ( billingInis == null ) {
            return null;
        }

        BillingInisEntity.BillingInisEntityBuilder billingInisEntity = BillingInisEntity.builder();

        billingInisEntity.biIdx( billingInis.getBiIdx() );
        billingInisEntity.resultcode( billingInis.getResultcode() );
        billingInisEntity.resultmsg( billingInis.getResultmsg() );
        billingInisEntity.pgauthdate( billingInis.getPgauthdate() );
        billingInisEntity.pgauthtime( billingInis.getPgauthtime() );
        billingInisEntity.tid( billingInis.getTid() );
        billingInisEntity.mid( billingInis.getMid() );
        billingInisEntity.orderid( billingInis.getOrderid() );
        billingInisEntity.billkey( billingInis.getBillkey() );
        billingInisEntity.authkey( billingInis.getAuthkey() );
        billingInisEntity.merchantreserved( billingInis.getMerchantreserved() );
        billingInisEntity.cardcd( billingInis.getCardcd() );
        billingInisEntity.cardno( billingInis.getCardno() );
        billingInisEntity.cardkind( billingInis.getCardkind() );
        billingInisEntity.checkFlag( billingInis.getCheckFlag() );
        billingInisEntity.data1( billingInis.getData1() );
        billingInisEntity.hppcorp( billingInis.getHppcorp() );
        billingInisEntity.goodName( billingInis.getGoodName() );
        billingInisEntity.buyerName( billingInis.getBuyerName() );
        billingInisEntity.buyerEmail( billingInis.getBuyerEmail() );
        billingInisEntity.buyerTel( billingInis.getBuyerTel() );
        billingInisEntity.price( billingInis.getPrice() );

        return billingInisEntity.build();
    }

    @Override
    public BillingAcceptInis toBillingAcceptInis(BillingAcceptInisEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BillingAcceptInis.BillingAcceptInisBuilder<?, ?> billingAcceptInis = BillingAcceptInis.builder();

        billingAcceptInis.createdAt( entity.getCreatedAt() );
        billingAcceptInis.updatedAt( entity.getUpdatedAt() );
        billingAcceptInis.baiIdx( entity.getBaiIdx() );
        billingAcceptInis.resultCode( entity.getResultCode() );
        billingAcceptInis.resultMsg( entity.getResultMsg() );
        billingAcceptInis.payDate( entity.getPayDate() );
        billingAcceptInis.payTime( entity.getPayTime() );
        billingAcceptInis.payAuthCode( entity.getPayAuthCode() );
        billingAcceptInis.tid( entity.getTid() );
        billingAcceptInis.mid( entity.getMid() );
        billingAcceptInis.price( entity.getPrice() );
        billingAcceptInis.cardCode( entity.getCardCode() );
        billingAcceptInis.cardQuota( entity.getCardQuota() );
        billingAcceptInis.checkFlg( entity.getCheckFlg() );
        billingAcceptInis.prtcCode( entity.getPrtcCode() );
        billingAcceptInis.orderid( entity.getOrderid() );

        return billingAcceptInis.build();
    }

    @Override
    public BillingAcceptInisEntity toBillingAcceptInisEntity(BillingAcceptInis model) {
        if ( model == null ) {
            return null;
        }

        BillingAcceptInisEntity.BillingAcceptInisEntityBuilder billingAcceptInisEntity = BillingAcceptInisEntity.builder();

        billingAcceptInisEntity.baiIdx( model.getBaiIdx() );
        billingAcceptInisEntity.resultCode( model.getResultCode() );
        billingAcceptInisEntity.resultMsg( model.getResultMsg() );
        billingAcceptInisEntity.payDate( model.getPayDate() );
        billingAcceptInisEntity.payTime( model.getPayTime() );
        billingAcceptInisEntity.payAuthCode( model.getPayAuthCode() );
        billingAcceptInisEntity.tid( model.getTid() );
        billingAcceptInisEntity.mid( model.getMid() );
        billingAcceptInisEntity.price( model.getPrice() );
        billingAcceptInisEntity.cardCode( model.getCardCode() );
        billingAcceptInisEntity.cardQuota( model.getCardQuota() );
        billingAcceptInisEntity.checkFlg( model.getCheckFlg() );
        billingAcceptInisEntity.prtcCode( model.getPrtcCode() );
        billingAcceptInisEntity.orderid( model.getOrderid() );

        return billingAcceptInisEntity.build();
    }

    @Override
    public BillingKakao toBillingKakao(BillingKakaoEntity billingKakaoEntity) {
        if ( billingKakaoEntity == null ) {
            return null;
        }

        BillingKakao.BillingKakaoBuilder<?, ?> billingKakao = BillingKakao.builder();

        billingKakao.createdAt( billingKakaoEntity.getCreatedAt() );
        billingKakao.updatedAt( billingKakaoEntity.getUpdatedAt() );
        billingKakao.bkIdx( billingKakaoEntity.getBkIdx() );
        billingKakao.code( billingKakaoEntity.getCode() );
        billingKakao.tid( billingKakaoEntity.getTid() );
        billingKakao.sid( billingKakaoEntity.getSid() );
        billingKakao.partnerUserId( billingKakaoEntity.getPartnerUserId() );

        return billingKakao.build();
    }

    @Override
    public BillingKakaoEntity toBillingKakaoEntity(BillingKakao billingKakao) {
        if ( billingKakao == null ) {
            return null;
        }

        BillingKakaoEntity.BillingKakaoEntityBuilder billingKakaoEntity = BillingKakaoEntity.builder();

        billingKakaoEntity.bkIdx( billingKakao.getBkIdx() );
        billingKakaoEntity.code( billingKakao.getCode() );
        billingKakaoEntity.tid( billingKakao.getTid() );
        billingKakaoEntity.sid( billingKakao.getSid() );
        billingKakaoEntity.partnerUserId( billingKakao.getPartnerUserId() );

        return billingKakaoEntity.build();
    }
}
