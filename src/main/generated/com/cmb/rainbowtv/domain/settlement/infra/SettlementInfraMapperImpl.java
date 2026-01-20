package com.cmb.rainbowtv.domain.settlement.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelBundleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelGenreEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelInfoEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelBundle;
import com.cmb.rainbowtv.domain.channel.model.ChannelGenre;
import com.cmb.rainbowtv.domain.channel.model.ChannelInfo;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemEntity;
import com.cmb.rainbowtv.domain.product.model.Item;
import com.cmb.rainbowtv.domain.settlement.infra.data.entity.CalculateEntity;
import com.cmb.rainbowtv.domain.settlement.infra.data.entity.CalculateRefundEntity;
import com.cmb.rainbowtv.domain.settlement.infra.data.entity.CalculateSettlementEntity;
import com.cmb.rainbowtv.domain.settlement.infra.data.entity.CalculateShopRefundEntity;
import com.cmb.rainbowtv.domain.settlement.model.Calculate;
import com.cmb.rainbowtv.domain.settlement.model.CalculateRefund;
import com.cmb.rainbowtv.domain.settlement.model.CalculateSettlement;
import com.cmb.rainbowtv.domain.settlement.model.CalculateShopRefund;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class SettlementInfraMapperImpl implements SettlementInfraMapper {

    @Override
    public Calculate toCalculate(CalculateEntity calculateEntity) {
        if ( calculateEntity == null ) {
            return null;
        }

        Calculate.CalculateBuilder<?, ?> calculate = Calculate.builder();

        calculate.createdAt( calculateEntity.getCreatedAt() );
        calculate.updatedAt( calculateEntity.getUpdatedAt() );
        calculate.caIdx( calculateEntity.getCaIdx() );
        calculate.caDefault( calculateEntity.getCaDefault() );
        calculate.caFactory( calculateEntity.getCaFactory() );
        calculate.caType( calculateEntity.getCaType() );
        calculate.caUuid( calculateEntity.getCaUuid() );
        calculate.caCorporate( calculateEntity.getCaCorporate() );
        calculate.caArea( calculateEntity.getCaArea() );
        calculate.caCustomer( calculateEntity.getCaCustomer() );
        calculate.caClient( calculateEntity.getCaClient() );
        calculate.caAddress( calculateEntity.getCaAddress() );
        calculate.caHp( calculateEntity.getCaHp() );
        calculate.item( itemEntityToItem( calculateEntity.getItem() ) );
        calculate.channelBundle( channelBundleEntityToChannelBundle( calculateEntity.getChannelBundle() ) );
        calculate.channelInfo( channelInfoEntityToChannelInfo( calculateEntity.getChannelInfo() ) );
        calculate.caItem( calculateEntity.getCaItem() );
        calculate.caItemName( calculateEntity.getCaItemName() );
        calculate.caItemOption( calculateEntity.getCaItemOption() );
        calculate.caOrderAt( calculateEntity.getCaOrderAt() );
        calculate.caOrderPg( calculateEntity.getCaOrderPg() );
        calculate.caOrderPayment( calculateEntity.getCaOrderPayment() );
        calculate.caStatus( calculateEntity.getCaStatus() );
        calculate.caFeeType( calculateEntity.getCaFeeType() );
        calculate.caUseCnt( calculateEntity.getCaUseCnt() );
        calculate.caMonth( calculateEntity.getCaMonth() );
        calculate.caChargeSupplyPrice( calculateEntity.getCaChargeSupplyPrice() );
        calculate.caChargeSurtax( calculateEntity.getCaChargeSurtax() );
        calculate.caChargeSum( calculateEntity.getCaChargeSum() );
        calculate.caDiscountSupplyPrice( calculateEntity.getCaDiscountSupplyPrice() );
        calculate.caDiscountSurtax( calculateEntity.getCaDiscountSurtax() );
        calculate.caDiscountSum( calculateEntity.getCaDiscountSum() );
        calculate.caActualSupplyPrice( calculateEntity.getCaActualSupplyPrice() );
        calculate.caActualSurtax( calculateEntity.getCaActualSurtax() );
        calculate.caActualSum( calculateEntity.getCaActualSum() );
        calculate.caFeeSupplyPrice( calculateEntity.getCaFeeSupplyPrice() );
        calculate.caFeeSurtax( calculateEntity.getCaFeeSurtax() );
        calculate.caFeeSum( calculateEntity.getCaFeeSum() );
        calculate.caStoredSupplyPrice( calculateEntity.getCaStoredSupplyPrice() );
        calculate.caStoredSurtax( calculateEntity.getCaStoredSurtax() );
        calculate.caStoredSum( calculateEntity.getCaStoredSum() );
        calculate.caEventAt( calculateEntity.getCaEventAt() );
        calculate.caUseDays( calculateEntity.getCaUseDays() );
        calculate.caRemainDays( calculateEntity.getCaRemainDays() );
        calculate.caAccruedSales( calculateEntity.getCaAccruedSales() );
        calculate.caAccruedSurtax( calculateEntity.getCaAccruedSurtax() );
        calculate.caAccruedSum( calculateEntity.getCaAccruedSum() );
        calculate.caUnearnedPrice( calculateEntity.getCaUnearnedPrice() );
        calculate.caUnearnedSurtax( calculateEntity.getCaUnearnedSurtax() );
        calculate.caUnearnedSum( calculateEntity.getCaUnearnedSum() );
        calculate.caStartDate( calculateEntity.getCaStartDate() );
        calculate.caEndDate( calculateEntity.getCaEndDate() );
        calculate.caPackage( calculateEntity.getCaPackage() );
        calculate.caFeeCase( calculateEntity.getCaFeeCase() );
        calculate.caFee( calculateEntity.getCaFee() );
        calculate.caInvest( calculateEntity.getCaInvest() );
        calculate.caDeliveryPrice( calculateEntity.getCaDeliveryPrice() );
        calculate.caDeliverySurtax( calculateEntity.getCaDeliverySurtax() );
        calculate.caDeliverySum( calculateEntity.getCaDeliverySum() );
        calculate.ordId( calculateEntity.getOrdId() );

        return calculate.build();
    }

    @Override
    public List<Calculate> toCalculateList(List<CalculateEntity> calculateEntity) {
        if ( calculateEntity == null ) {
            return null;
        }

        List<Calculate> list = new ArrayList<Calculate>( calculateEntity.size() );
        for ( CalculateEntity calculateEntity1 : calculateEntity ) {
            list.add( toCalculate( calculateEntity1 ) );
        }

        return list;
    }

    @Override
    public List<CalculateSettlement> toCalculateSettlementList(List<CalculateSettlementEntity> calculateEntity) {
        if ( calculateEntity == null ) {
            return null;
        }

        List<CalculateSettlement> list = new ArrayList<CalculateSettlement>( calculateEntity.size() );
        for ( CalculateSettlementEntity calculateSettlementEntity : calculateEntity ) {
            list.add( toCalculateSettlement( calculateSettlementEntity ) );
        }

        return list;
    }

    @Override
    public CalculateEntity toCalculateEntity(Calculate calculate) {
        if ( calculate == null ) {
            return null;
        }

        CalculateEntity.CalculateEntityBuilder calculateEntity = CalculateEntity.builder();

        calculateEntity.caIdx( calculate.getCaIdx() );
        calculateEntity.caDefault( calculate.getCaDefault() );
        calculateEntity.caFactory( calculate.getCaFactory() );
        calculateEntity.caType( calculate.getCaType() );
        calculateEntity.caUuid( calculate.getCaUuid() );
        calculateEntity.caCorporate( calculate.getCaCorporate() );
        calculateEntity.caArea( calculate.getCaArea() );
        calculateEntity.caCustomer( calculate.getCaCustomer() );
        calculateEntity.caClient( calculate.getCaClient() );
        calculateEntity.caAddress( calculate.getCaAddress() );
        calculateEntity.caHp( calculate.getCaHp() );
        calculateEntity.ordId( calculate.getOrdId() );
        calculateEntity.item( itemToItemEntity( calculate.getItem() ) );
        calculateEntity.channelBundle( channelBundleToChannelBundleEntity( calculate.getChannelBundle() ) );
        calculateEntity.channelInfo( channelInfoToChannelInfoEntity( calculate.getChannelInfo() ) );
        calculateEntity.caItem( calculate.getCaItem() );
        calculateEntity.caItemName( calculate.getCaItemName() );
        calculateEntity.caItemOption( calculate.getCaItemOption() );
        calculateEntity.caOrderAt( calculate.getCaOrderAt() );
        calculateEntity.caOrderPg( calculate.getCaOrderPg() );
        calculateEntity.caOrderPayment( calculate.getCaOrderPayment() );
        calculateEntity.caStatus( calculate.getCaStatus() );
        calculateEntity.caFeeType( calculate.getCaFeeType() );
        calculateEntity.caUseCnt( calculate.getCaUseCnt() );
        calculateEntity.caMonth( calculate.getCaMonth() );
        calculateEntity.caChargeSupplyPrice( calculate.getCaChargeSupplyPrice() );
        calculateEntity.caChargeSurtax( calculate.getCaChargeSurtax() );
        calculateEntity.caChargeSum( calculate.getCaChargeSum() );
        calculateEntity.caDiscountSupplyPrice( calculate.getCaDiscountSupplyPrice() );
        calculateEntity.caDiscountSurtax( calculate.getCaDiscountSurtax() );
        calculateEntity.caDiscountSum( calculate.getCaDiscountSum() );
        calculateEntity.caActualSupplyPrice( calculate.getCaActualSupplyPrice() );
        calculateEntity.caActualSurtax( calculate.getCaActualSurtax() );
        calculateEntity.caActualSum( calculate.getCaActualSum() );
        calculateEntity.caFeeSupplyPrice( calculate.getCaFeeSupplyPrice() );
        calculateEntity.caFeeSurtax( calculate.getCaFeeSurtax() );
        calculateEntity.caFeeSum( calculate.getCaFeeSum() );
        calculateEntity.caStoredSupplyPrice( calculate.getCaStoredSupplyPrice() );
        calculateEntity.caStoredSurtax( calculate.getCaStoredSurtax() );
        calculateEntity.caStoredSum( calculate.getCaStoredSum() );
        calculateEntity.caEventAt( calculate.getCaEventAt() );
        calculateEntity.caUseDays( calculate.getCaUseDays() );
        calculateEntity.caRemainDays( calculate.getCaRemainDays() );
        calculateEntity.caAccruedSales( calculate.getCaAccruedSales() );
        calculateEntity.caAccruedSurtax( calculate.getCaAccruedSurtax() );
        calculateEntity.caAccruedSum( calculate.getCaAccruedSum() );
        calculateEntity.caUnearnedPrice( calculate.getCaUnearnedPrice() );
        calculateEntity.caUnearnedSurtax( calculate.getCaUnearnedSurtax() );
        calculateEntity.caUnearnedSum( calculate.getCaUnearnedSum() );
        calculateEntity.caStartDate( calculate.getCaStartDate() );
        calculateEntity.caEndDate( calculate.getCaEndDate() );
        calculateEntity.caPackage( calculate.getCaPackage() );
        calculateEntity.caFeeCase( calculate.getCaFeeCase() );
        calculateEntity.caFee( calculate.getCaFee() );
        calculateEntity.caInvest( calculate.getCaInvest() );
        calculateEntity.caDeliveryPrice( calculate.getCaDeliveryPrice() );
        calculateEntity.caDeliverySurtax( calculate.getCaDeliverySurtax() );
        calculateEntity.caDeliverySum( calculate.getCaDeliverySum() );

        return calculateEntity.build();
    }

    @Override
    public CalculateSettlement toCalculateSettlement(CalculateSettlementEntity CalculateSettlementEntity) {
        if ( CalculateSettlementEntity == null ) {
            return null;
        }

        CalculateSettlement.CalculateSettlementBuilder<?, ?> calculateSettlement = CalculateSettlement.builder();

        calculateSettlement.createdAt( CalculateSettlementEntity.getCreatedAt() );
        calculateSettlement.updatedAt( CalculateSettlementEntity.getUpdatedAt() );
        calculateSettlement.csIdx( CalculateSettlementEntity.getCsIdx() );
        calculateSettlement.calculate( toCalculate( CalculateSettlementEntity.getCalculate() ) );
        calculateSettlement.csSettlementSupplyPrice( CalculateSettlementEntity.getCsSettlementSupplyPrice() );
        calculateSettlement.csSettlementSurtax( CalculateSettlementEntity.getCsSettlementSurtax() );
        calculateSettlement.csSettlementSum( CalculateSettlementEntity.getCsSettlementSum() );
        calculateSettlement.csAccruedSettlementSales( CalculateSettlementEntity.getCsAccruedSettlementSales() );
        calculateSettlement.csAccruedSettlementSurtax( CalculateSettlementEntity.getCsAccruedSettlementSurtax() );
        calculateSettlement.csAccruedSettlementSum( CalculateSettlementEntity.getCsAccruedSettlementSum() );
        calculateSettlement.csSettlementMonthPrice( CalculateSettlementEntity.getCsSettlementMonthPrice() );
        calculateSettlement.csSettlementMonthSurtax( CalculateSettlementEntity.getCsSettlementMonthSurtax() );
        calculateSettlement.csSettlementMonthSum( CalculateSettlementEntity.getCsSettlementMonthSum() );

        return calculateSettlement.build();
    }

    @Override
    public CalculateSettlementEntity toCalculateSettlementEntity(CalculateSettlement CalculateSettlement) {
        if ( CalculateSettlement == null ) {
            return null;
        }

        CalculateSettlementEntity.CalculateSettlementEntityBuilder calculateSettlementEntity = CalculateSettlementEntity.builder();

        calculateSettlementEntity.csIdx( CalculateSettlement.getCsIdx() );
        calculateSettlementEntity.calculate( toCalculateEntity( CalculateSettlement.getCalculate() ) );
        calculateSettlementEntity.csSettlementSupplyPrice( CalculateSettlement.getCsSettlementSupplyPrice() );
        calculateSettlementEntity.csSettlementSurtax( CalculateSettlement.getCsSettlementSurtax() );
        calculateSettlementEntity.csSettlementSum( CalculateSettlement.getCsSettlementSum() );
        calculateSettlementEntity.csAccruedSettlementSales( CalculateSettlement.getCsAccruedSettlementSales() );
        calculateSettlementEntity.csAccruedSettlementSurtax( CalculateSettlement.getCsAccruedSettlementSurtax() );
        calculateSettlementEntity.csAccruedSettlementSum( CalculateSettlement.getCsAccruedSettlementSum() );
        calculateSettlementEntity.csSettlementMonthPrice( CalculateSettlement.getCsSettlementMonthPrice() );
        calculateSettlementEntity.csSettlementMonthSurtax( CalculateSettlement.getCsSettlementMonthSurtax() );
        calculateSettlementEntity.csSettlementMonthSum( CalculateSettlement.getCsSettlementMonthSum() );

        return calculateSettlementEntity.build();
    }

    @Override
    public CalculateRefundEntity toCalculateRefundEntity(CalculateRefund calculateRefund) {
        if ( calculateRefund == null ) {
            return null;
        }

        CalculateRefundEntity.CalculateRefundEntityBuilder calculateRefundEntity = CalculateRefundEntity.builder();

        calculateRefundEntity.crIdx( calculateRefund.getCrIdx() );
        calculateRefundEntity.calculate( toCalculateEntity( calculateRefund.getCalculate() ) );
        calculateRefundEntity.crRefund( calculateRefund.getCrRefund() );
        calculateRefundEntity.crRefundSurtax( calculateRefund.getCrRefundSurtax() );
        calculateRefundEntity.crRefundSum( calculateRefund.getCrRefundSum() );
        calculateRefundEntity.crFeeRefund( calculateRefund.getCrFeeRefund() );
        calculateRefundEntity.crFeeRefundSurtax( calculateRefund.getCrFeeRefundSurtax() );
        calculateRefundEntity.crFeeRefundSum( calculateRefund.getCrFeeRefundSum() );
        calculateRefundEntity.crRefundAt( calculateRefund.getCrRefundAt() );
        calculateRefundEntity.crRefundMember( calculateRefund.getCrRefundMember() );

        return calculateRefundEntity.build();
    }

    @Override
    public CalculateShopRefund toCalculateShopRefund(CalculateShopRefundEntity calculateShopRefund) {
        if ( calculateShopRefund == null ) {
            return null;
        }

        CalculateShopRefund.CalculateShopRefundBuilder<?, ?> calculateShopRefund1 = CalculateShopRefund.builder();

        calculateShopRefund1.createdAt( calculateShopRefund.getCreatedAt() );
        calculateShopRefund1.updatedAt( calculateShopRefund.getUpdatedAt() );
        calculateShopRefund1.csrIdx( calculateShopRefund.getCsrIdx() );
        calculateShopRefund1.calculate( toCalculate( calculateShopRefund.getCalculate() ) );
        calculateShopRefund1.csrTradeCmbSupplyPrice( calculateShopRefund.getCsrTradeCmbSupplyPrice() );
        calculateShopRefund1.csrTradeCmbSurtax( calculateShopRefund.getCsrTradeCmbSurtax() );
        calculateShopRefund1.csrTradeCmbSum( calculateShopRefund.getCsrTradeCmbSum() );
        calculateShopRefund1.csrRefundCmbSupplyPrice( calculateShopRefund.getCsrRefundCmbSupplyPrice() );
        calculateShopRefund1.csrRefundCmbSurtax( calculateShopRefund.getCsrRefundCmbSurtax() );
        calculateShopRefund1.csrRefundCmbSum( calculateShopRefund.getCsrRefundCmbSum() );
        calculateShopRefund1.csrRefundUserSupplyPrice( calculateShopRefund.getCsrRefundUserSupplyPrice() );
        calculateShopRefund1.csrRefundUserSurtax( calculateShopRefund.getCsrRefundUserSurtax() );
        calculateShopRefund1.csrRefundUserSum( calculateShopRefund.getCsrRefundUserSum() );
        calculateShopRefund1.csrRefund( calculateShopRefund.getCsrRefund() );
        calculateShopRefund1.csrRefundSurtax( calculateShopRefund.getCsrRefundSurtax() );
        calculateShopRefund1.csrRefundSum( calculateShopRefund.getCsrRefundSum() );

        return calculateShopRefund1.build();
    }

    @Override
    public CalculateShopRefundEntity toCalculateShopRefundEntity(CalculateShopRefund calculateShopRefund) {
        if ( calculateShopRefund == null ) {
            return null;
        }

        CalculateShopRefundEntity.CalculateShopRefundEntityBuilder calculateShopRefundEntity = CalculateShopRefundEntity.builder();

        calculateShopRefundEntity.csrIdx( calculateShopRefund.getCsrIdx() );
        calculateShopRefundEntity.calculate( toCalculateEntity( calculateShopRefund.getCalculate() ) );
        calculateShopRefundEntity.csrTradeCmbSupplyPrice( calculateShopRefund.getCsrTradeCmbSupplyPrice() );
        calculateShopRefundEntity.csrTradeCmbSurtax( calculateShopRefund.getCsrTradeCmbSurtax() );
        calculateShopRefundEntity.csrTradeCmbSum( calculateShopRefund.getCsrTradeCmbSum() );
        calculateShopRefundEntity.csrRefundCmbSupplyPrice( calculateShopRefund.getCsrRefundCmbSupplyPrice() );
        calculateShopRefundEntity.csrRefundCmbSurtax( calculateShopRefund.getCsrRefundCmbSurtax() );
        calculateShopRefundEntity.csrRefundCmbSum( calculateShopRefund.getCsrRefundCmbSum() );
        calculateShopRefundEntity.csrRefundUserSupplyPrice( calculateShopRefund.getCsrRefundUserSupplyPrice() );
        calculateShopRefundEntity.csrRefundUserSurtax( calculateShopRefund.getCsrRefundUserSurtax() );
        calculateShopRefundEntity.csrRefundUserSum( calculateShopRefund.getCsrRefundUserSum() );
        calculateShopRefundEntity.csrRefund( calculateShopRefund.getCsrRefund() );
        calculateShopRefundEntity.csrRefundSurtax( calculateShopRefund.getCsrRefundSurtax() );
        calculateShopRefundEntity.csrRefundSum( calculateShopRefund.getCsrRefundSum() );

        return calculateShopRefundEntity.build();
    }

    protected Item itemEntityToItem(ItemEntity itemEntity) {
        if ( itemEntity == null ) {
            return null;
        }

        Item.ItemBuilder<?, ?> item = Item.builder();

        item.createdAt( itemEntity.getCreatedAt() );
        item.updatedAt( itemEntity.getUpdatedAt() );
        item.itIdx( itemEntity.getItIdx() );
        item.itType( itemEntity.getItType() );
        item.itSeq( itemEntity.getItSeq() );
        item.itSku( itemEntity.getItSku() );
        item.itName( itemEntity.getItName() );
        item.itBrand( itemEntity.getItBrand() );
        item.itModel( itemEntity.getItModel() );
        item.itDetail( itemEntity.getItDetail() );
        item.itPrice( itemEntity.getItPrice() );
        item.itPriceOrg( itemEntity.getItPriceOrg() );
        if ( itemEntity.getItStockQty() != null ) {
            item.itStockQty( itemEntity.getItStockQty().intValue() );
        }
        item.itStockUse( itemEntity.getItStockUse() );
        item.itSendType( itemEntity.getItSendType() );
        item.itSendBaseline( itemEntity.getItSendBaseline() );
        item.itSendPrice( itemEntity.getItSendPrice() );
        item.itSales( itemEntity.getItSales() );
        item.itUse( itemEntity.getItUse() );
        item.itDisplay( itemEntity.getItDisplay() );
        item.itIsSale( itemEntity.getItIsSale() );
        item.itIsDelete( itemEntity.getItIsDelete() );
        item.itMemo( itemEntity.getItMemo() );

        return item.build();
    }

    protected ChannelBundle channelBundleEntityToChannelBundle(ChannelBundleEntity channelBundleEntity) {
        if ( channelBundleEntity == null ) {
            return null;
        }

        ChannelBundle.ChannelBundleBuilder<?, ?> channelBundle = ChannelBundle.builder();

        channelBundle.createdAt( channelBundleEntity.getCreatedAt() );
        channelBundle.updatedAt( channelBundleEntity.getUpdatedAt() );
        channelBundle.cbIdx( channelBundleEntity.getCbIdx() );
        channelBundle.cbType( channelBundleEntity.getCbType() );
        channelBundle.cbName( channelBundleEntity.getCbName() );
        channelBundle.cbPrice( channelBundleEntity.getCbPrice() );
        channelBundle.cbFeeType( channelBundleEntity.getCbFeeType() );
        channelBundle.cbFee( channelBundleEntity.getCbFee() );
        channelBundle.cbInvest( channelBundleEntity.getCbInvest() );

        return channelBundle.build();
    }

    protected Channel channelEntityToChannel(ChannelEntity channelEntity) {
        if ( channelEntity == null ) {
            return null;
        }

        Channel.ChannelBuilder<?, ?> channel = Channel.builder();

        channel.createdAt( channelEntity.getCreatedAt() );
        channel.updatedAt( channelEntity.getUpdatedAt() );
        channel.caIdx( channelEntity.getCaIdx() );
        channel.caType( channelEntity.getCaType() );
        channel.caLiveChannel( channelEntity.getCaLiveChannel() );
        channel.caPackageChannel( channelEntity.getCaPackageChannel() );
        channel.caLiveInput( channelEntity.getCaLiveInput() );
        channel.caEndpoint( channelEntity.getCaEndpoint() );
        channel.caDestination( channelEntity.getCaDestination() );
        channel.caDestinationExtra( channelEntity.getCaDestinationExtra() );
        channel.caDashUrl( channelEntity.getCaDashUrl() );
        channel.caHlsUrl( channelEntity.getCaHlsUrl() );
        channel.caIsUse( channelEntity.getCaIsUse() );

        return channel.build();
    }

    protected ChannelGenre channelGenreEntityToChannelGenre(ChannelGenreEntity channelGenreEntity) {
        if ( channelGenreEntity == null ) {
            return null;
        }

        ChannelGenre.ChannelGenreBuilder<?, ?> channelGenre = ChannelGenre.builder();

        channelGenre.createdAt( channelGenreEntity.getCreatedAt() );
        channelGenre.updatedAt( channelGenreEntity.getUpdatedAt() );
        channelGenre.cgIdx( channelGenreEntity.getCgIdx() );
        channelGenre.cgName( channelGenreEntity.getCgName() );

        return channelGenre.build();
    }

    protected ChannelInfo channelInfoEntityToChannelInfo(ChannelInfoEntity channelInfoEntity) {
        if ( channelInfoEntity == null ) {
            return null;
        }

        ChannelInfo.ChannelInfoBuilder<?, ?> channelInfo = ChannelInfo.builder();

        channelInfo.createdAt( channelInfoEntity.getCreatedAt() );
        channelInfo.updatedAt( channelInfoEntity.getUpdatedAt() );
        channelInfo.ciIdx( channelInfoEntity.getCiIdx() );
        channelInfo.channel( channelEntityToChannel( channelInfoEntity.getChannel() ) );
        channelInfo.ciEpg( channelInfoEntity.getCiEpg() );
        channelInfo.ciBlackout( channelInfoEntity.getCiBlackout() );
        channelInfo.ciName( channelInfoEntity.getCiName() );
        channelInfo.ciStatus( channelInfoEntity.getCiStatus() );
        channelInfo.ciIsLive( channelInfoEntity.getCiIsLive() );
        channelInfo.ciSeq( channelInfoEntity.getCiSeq() );
        channelInfo.ciIsAdult( channelInfoEntity.getCiIsAdult() );
        channelInfo.ciIsPay( channelInfoEntity.getCiIsPay() );
        channelInfo.channelGenre( channelGenreEntityToChannelGenre( channelInfoEntity.getChannelGenre() ) );
        channelInfo.ciType( channelInfoEntity.getCiType() );
        channelInfo.ciFeeType( channelInfoEntity.getCiFeeType() );
        channelInfo.ciFee( channelInfoEntity.getCiFee() );
        channelInfo.ciInvest( channelInfoEntity.getCiInvest() );

        return channelInfo.build();
    }

    protected ItemEntity itemToItemEntity(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemEntity.ItemEntityBuilder itemEntity = ItemEntity.builder();

        itemEntity.itIdx( item.getItIdx() );
        itemEntity.itType( item.getItType() );
        itemEntity.itSeq( item.getItSeq() );
        itemEntity.itSku( item.getItSku() );
        itemEntity.itName( item.getItName() );
        itemEntity.itBrand( item.getItBrand() );
        itemEntity.itModel( item.getItModel() );
        itemEntity.itDetail( item.getItDetail() );
        itemEntity.itPrice( item.getItPrice() );
        itemEntity.itPriceOrg( item.getItPriceOrg() );
        if ( item.getItStockQty() != null ) {
            itemEntity.itStockQty( item.getItStockQty().longValue() );
        }
        itemEntity.itStockUse( item.getItStockUse() );
        itemEntity.itSendType( item.getItSendType() );
        itemEntity.itSendBaseline( item.getItSendBaseline() );
        itemEntity.itSendPrice( item.getItSendPrice() );
        itemEntity.itSales( item.getItSales() );
        itemEntity.itUse( item.getItUse() );
        itemEntity.itDisplay( item.getItDisplay() );
        itemEntity.itIsSale( item.getItIsSale() );
        itemEntity.itIsDelete( item.getItIsDelete() );
        itemEntity.itMemo( item.getItMemo() );

        return itemEntity.build();
    }

    protected ChannelBundleEntity channelBundleToChannelBundleEntity(ChannelBundle channelBundle) {
        if ( channelBundle == null ) {
            return null;
        }

        ChannelBundleEntity.ChannelBundleEntityBuilder channelBundleEntity = ChannelBundleEntity.builder();

        channelBundleEntity.cbIdx( channelBundle.getCbIdx() );
        channelBundleEntity.cbType( channelBundle.getCbType() );
        channelBundleEntity.cbName( channelBundle.getCbName() );
        channelBundleEntity.cbPrice( channelBundle.getCbPrice() );
        channelBundleEntity.cbFeeType( channelBundle.getCbFeeType() );
        channelBundleEntity.cbFee( channelBundle.getCbFee() );
        channelBundleEntity.cbInvest( channelBundle.getCbInvest() );

        return channelBundleEntity.build();
    }

    protected ChannelEntity channelToChannelEntity(Channel channel) {
        if ( channel == null ) {
            return null;
        }

        ChannelEntity.ChannelEntityBuilder channelEntity = ChannelEntity.builder();

        channelEntity.caIdx( channel.getCaIdx() );
        channelEntity.caType( channel.getCaType() );
        channelEntity.caLiveChannel( channel.getCaLiveChannel() );
        channelEntity.caPackageChannel( channel.getCaPackageChannel() );
        channelEntity.caLiveInput( channel.getCaLiveInput() );
        channelEntity.caEndpoint( channel.getCaEndpoint() );
        channelEntity.caDestination( channel.getCaDestination() );
        channelEntity.caDestinationExtra( channel.getCaDestinationExtra() );
        channelEntity.caDashUrl( channel.getCaDashUrl() );
        channelEntity.caHlsUrl( channel.getCaHlsUrl() );
        channelEntity.caIsUse( channel.getCaIsUse() );

        return channelEntity.build();
    }

    protected ChannelGenreEntity channelGenreToChannelGenreEntity(ChannelGenre channelGenre) {
        if ( channelGenre == null ) {
            return null;
        }

        ChannelGenreEntity.ChannelGenreEntityBuilder channelGenreEntity = ChannelGenreEntity.builder();

        channelGenreEntity.cgIdx( channelGenre.getCgIdx() );
        channelGenreEntity.cgName( channelGenre.getCgName() );

        return channelGenreEntity.build();
    }

    protected ChannelInfoEntity channelInfoToChannelInfoEntity(ChannelInfo channelInfo) {
        if ( channelInfo == null ) {
            return null;
        }

        ChannelInfoEntity.ChannelInfoEntityBuilder channelInfoEntity = ChannelInfoEntity.builder();

        channelInfoEntity.ciIdx( channelInfo.getCiIdx() );
        channelInfoEntity.channel( channelToChannelEntity( channelInfo.getChannel() ) );
        channelInfoEntity.ciEpg( channelInfo.getCiEpg() );
        channelInfoEntity.ciBlackout( channelInfo.getCiBlackout() );
        channelInfoEntity.ciName( channelInfo.getCiName() );
        channelInfoEntity.ciStatus( channelInfo.getCiStatus() );
        channelInfoEntity.ciIsLive( channelInfo.getCiIsLive() );
        channelInfoEntity.ciSeq( channelInfo.getCiSeq() );
        channelInfoEntity.ciIsAdult( channelInfo.getCiIsAdult() );
        channelInfoEntity.ciIsPay( channelInfo.getCiIsPay() );
        channelInfoEntity.channelGenre( channelGenreToChannelGenreEntity( channelInfo.getChannelGenre() ) );
        channelInfoEntity.ciType( channelInfo.getCiType() );
        channelInfoEntity.ciFeeType( channelInfo.getCiFeeType() );
        channelInfoEntity.ciFee( channelInfo.getCiFee() );
        channelInfoEntity.ciInvest( channelInfo.getCiInvest() );

        return channelInfoEntity.build();
    }
}
