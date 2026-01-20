package com.cmb.rainbowtv.domain.product.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelBundleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelBundle;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaCategoryEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaGenreEntity;
import com.cmb.rainbowtv.domain.media.model.Media;
import com.cmb.rainbowtv.domain.media.model.MediaCategory;
import com.cmb.rainbowtv.domain.media.model.MediaGenre;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemAdvertiseEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemByBundleEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemByShopEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemChannelEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemDeliveryEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemPaymentKeyEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemSaleEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemShopInfoEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemSubscribeEntity;
import com.cmb.rainbowtv.domain.product.model.Item;
import com.cmb.rainbowtv.domain.product.model.ItemAdvertise;
import com.cmb.rainbowtv.domain.product.model.ItemByBundle;
import com.cmb.rainbowtv.domain.product.model.ItemByShop;
import com.cmb.rainbowtv.domain.product.model.ItemChannel;
import com.cmb.rainbowtv.domain.product.model.ItemDelivery;
import com.cmb.rainbowtv.domain.product.model.ItemPaymentKey;
import com.cmb.rainbowtv.domain.product.model.ItemSale;
import com.cmb.rainbowtv.domain.product.model.ItemShopInfo;
import com.cmb.rainbowtv.domain.product.model.ItemSubscribe;
import com.cmb.rainbowtv.global.define.express.infra.data.entity.ExpressDefineEntity;
import com.cmb.rainbowtv.global.define.express.model.ExpressDefine;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:49+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ProductAdminInfraMapperImpl implements ProductAdminInfraMapper {

    @Override
    public List<Item> toModelList(List<ItemEntity> byMediaCategoryAndItemList) {
        if ( byMediaCategoryAndItemList == null ) {
            return null;
        }

        List<Item> list = new ArrayList<Item>( byMediaCategoryAndItemList.size() );
        for ( ItemEntity itemEntity : byMediaCategoryAndItemList ) {
            list.add( toItem( itemEntity ) );
        }

        return list;
    }

    @Override
    public Item toItem(ItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Item.ItemBuilder<?, ?> item = Item.builder();

        item.createdAt( entity.getCreatedAt() );
        item.updatedAt( entity.getUpdatedAt() );
        item.itIdx( entity.getItIdx() );
        item.itType( entity.getItType() );
        item.itSeq( entity.getItSeq() );
        item.itSku( entity.getItSku() );
        item.itName( entity.getItName() );
        item.itBrand( entity.getItBrand() );
        item.itModel( entity.getItModel() );
        item.itDetail( entity.getItDetail() );
        item.itPrice( entity.getItPrice() );
        item.itPriceOrg( entity.getItPriceOrg() );
        if ( entity.getItStockQty() != null ) {
            item.itStockQty( entity.getItStockQty().intValue() );
        }
        item.itStockUse( entity.getItStockUse() );
        item.itSendType( entity.getItSendType() );
        item.itSendBaseline( entity.getItSendBaseline() );
        item.itSendPrice( entity.getItSendPrice() );
        item.itSales( entity.getItSales() );
        item.itUse( entity.getItUse() );
        item.itDisplay( entity.getItDisplay() );
        item.itIsSale( entity.getItIsSale() );
        item.itIsDelete( entity.getItIsDelete() );
        item.itMemo( entity.getItMemo() );

        return item.build();
    }

    @Override
    public ItemEntity toItemEntity(Item item) {
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

    @Override
    public ItemByShop toItemByShop(ItemByShopEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ItemByShop.ItemByShopBuilder<?, ?> itemByShop = ItemByShop.builder();

        itemByShop.createdAt( entity.getCreatedAt() );
        itemByShop.updatedAt( entity.getUpdatedAt() );
        itemByShop.ibsIdx( entity.getIbsIdx() );
        itemByShop.item( toItem( entity.getItem() ) );
        itemByShop.media( mediaEntityToMedia( entity.getMedia() ) );

        return itemByShop.build();
    }

    @Override
    public ItemByShopEntity toItemByShopEntity(ItemByShop entity) {
        if ( entity == null ) {
            return null;
        }

        ItemByShopEntity.ItemByShopEntityBuilder itemByShopEntity = ItemByShopEntity.builder();

        itemByShopEntity.ibsIdx( entity.getIbsIdx() );
        itemByShopEntity.item( toItemEntity( entity.getItem() ) );
        itemByShopEntity.media( mediaToMediaEntity( entity.getMedia() ) );

        return itemByShopEntity.build();
    }

    @Override
    public ItemSubscribeEntity toItemSubscribeEntity(ItemSubscribe itemSubscribe) {
        if ( itemSubscribe == null ) {
            return null;
        }

        ItemSubscribeEntity.ItemSubscribeEntityBuilder itemSubscribeEntity = ItemSubscribeEntity.builder();

        itemSubscribeEntity.isIdx( itemSubscribe.getIsIdx() );
        itemSubscribeEntity.item( toItemEntity( itemSubscribe.getItem() ) );
        itemSubscribeEntity.isCycleType( itemSubscribe.getIsCycleType() );
        itemSubscribeEntity.isCycleTime( itemSubscribe.getIsCycleTime() );
        itemSubscribeEntity.isType( itemSubscribe.getIsType() );

        return itemSubscribeEntity.build();
    }

    @Override
    public List<ItemChannelEntity> toItemChannelEntity(List<ItemChannel> list) {
        if ( list == null ) {
            return null;
        }

        List<ItemChannelEntity> list1 = new ArrayList<ItemChannelEntity>( list.size() );
        for ( ItemChannel itemChannel : list ) {
            list1.add( itemChannelToItemChannelEntity( itemChannel ) );
        }

        return list1;
    }

    @Override
    public ItemChannel toItemChannel(ItemChannelEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ItemChannel.ItemChannelBuilder<?, ?> itemChannel = ItemChannel.builder();

        itemChannel.createdAt( entity.getCreatedAt() );
        itemChannel.updatedAt( entity.getUpdatedAt() );
        itemChannel.icIdx( entity.getIcIdx() );
        itemChannel.item( toItem( entity.getItem() ) );
        itemChannel.channel( channelEntityToChannel( entity.getChannel() ) );
        itemChannel.itemByBundle( toItemByBUndle( entity.getItemByBundle() ) );

        return itemChannel.build();
    }

    @Override
    public ItemPaymentKeyEntity toItemPaymentKeyEntity(ItemPaymentKey itemPaymentKey) {
        if ( itemPaymentKey == null ) {
            return null;
        }

        ItemPaymentKeyEntity.ItemPaymentKeyEntityBuilder itemPaymentKeyEntity = ItemPaymentKeyEntity.builder();

        itemPaymentKeyEntity.ipkIdx( itemPaymentKey.getIpkIdx() );
        itemPaymentKeyEntity.item( toItemEntity( itemPaymentKey.getItem() ) );
        itemPaymentKeyEntity.ipkApple( itemPaymentKey.getIpkApple() );
        itemPaymentKeyEntity.ipkGoogle( itemPaymentKey.getIpkGoogle() );

        return itemPaymentKeyEntity.build();
    }

    @Override
    public ItemByBundleEntity toItemByBundleEntity(ItemByBundle from) {
        if ( from == null ) {
            return null;
        }

        ItemByBundleEntity.ItemByBundleEntityBuilder itemByBundleEntity = ItemByBundleEntity.builder();

        itemByBundleEntity.ibbIdx( from.getIbbIdx() );
        itemByBundleEntity.item( toItemEntity( from.getItem() ) );
        itemByBundleEntity.channelBundle( channelBundleToChannelBundleEntity( from.getChannelBundle() ) );

        return itemByBundleEntity.build();
    }

    @Override
    public ItemByBundle toItemByBUndle(ItemByBundleEntity save) {
        if ( save == null ) {
            return null;
        }

        ItemByBundle.ItemByBundleBuilder<?, ?> itemByBundle = ItemByBundle.builder();

        itemByBundle.ibbIdx( save.getIbbIdx() );
        itemByBundle.item( toItem( save.getItem() ) );
        itemByBundle.channelBundle( channelBundleEntityToChannelBundle( save.getChannelBundle() ) );

        return itemByBundle.build();
    }

    @Override
    public ItemSubscribe toItemSubscribe(ItemSubscribeEntity itemSubscribeEntity) {
        if ( itemSubscribeEntity == null ) {
            return null;
        }

        ItemSubscribe.ItemSubscribeBuilder<?, ?> itemSubscribe = ItemSubscribe.builder();

        itemSubscribe.createdAt( itemSubscribeEntity.getCreatedAt() );
        itemSubscribe.updatedAt( itemSubscribeEntity.getUpdatedAt() );
        itemSubscribe.isIdx( itemSubscribeEntity.getIsIdx() );
        itemSubscribe.item( toItem( itemSubscribeEntity.getItem() ) );
        itemSubscribe.isCycleType( itemSubscribeEntity.getIsCycleType() );
        itemSubscribe.isCycleTime( itemSubscribeEntity.getIsCycleTime() );
        itemSubscribe.isType( itemSubscribeEntity.getIsType() );

        return itemSubscribe.build();
    }

    @Override
    public ItemPaymentKey toItemPaymentKey(ItemPaymentKeyEntity itemPaymentKeyEntity) {
        if ( itemPaymentKeyEntity == null ) {
            return null;
        }

        ItemPaymentKey.ItemPaymentKeyBuilder<?, ?> itemPaymentKey = ItemPaymentKey.builder();

        itemPaymentKey.ipkIdx( itemPaymentKeyEntity.getIpkIdx() );
        itemPaymentKey.item( toItem( itemPaymentKeyEntity.getItem() ) );
        itemPaymentKey.ipkApple( itemPaymentKeyEntity.getIpkApple() );
        itemPaymentKey.ipkGoogle( itemPaymentKeyEntity.getIpkGoogle() );

        return itemPaymentKey.build();
    }

    @Override
    public ItemAdvertise toItemAdvertise(ItemAdvertiseEntity itemAdvertiseEntity) {
        if ( itemAdvertiseEntity == null ) {
            return null;
        }

        ItemAdvertise.ItemAdvertiseBuilder<?, ?> itemAdvertise = ItemAdvertise.builder();

        itemAdvertise.iaIdx( itemAdvertiseEntity.getIaIdx() );
        itemAdvertise.item( toItem( itemAdvertiseEntity.getItem() ) );
        itemAdvertise.iaType( itemAdvertiseEntity.getIaType() );
        itemAdvertise.iaCount( itemAdvertiseEntity.getIaCount() );
        itemAdvertise.iaTime( itemAdvertiseEntity.getIaTime() );
        itemAdvertise.iaLevel( itemAdvertiseEntity.getIaLevel() );

        return itemAdvertise.build();
    }

    @Override
    public ItemShopInfoEntity toItemShopInfoEntity(ItemShopInfo itemShopInfo) {
        if ( itemShopInfo == null ) {
            return null;
        }

        ItemShopInfoEntity.ItemShopInfoEntityBuilder itemShopInfoEntity = ItemShopInfoEntity.builder();

        itemShopInfoEntity.isiIdx( itemShopInfo.getIsiIdx() );
        itemShopInfoEntity.item( toItemEntity( itemShopInfo.getItem() ) );
        itemShopInfoEntity.isiFeePayment( itemShopInfo.getIsiFeePayment() );
        itemShopInfoEntity.isiFeeRate( itemShopInfo.getIsiFeeRate() );
        itemShopInfoEntity.isiInvest( itemShopInfo.getIsiInvest() );
        itemShopInfoEntity.isiManufacturingCompany( itemShopInfo.getIsiManufacturingCompany() );
        itemShopInfoEntity.isiOrigin( itemShopInfo.getIsiOrigin() );
        itemShopInfoEntity.isiManufacturingDate( itemShopInfo.getIsiManufacturingDate() );
        itemShopInfoEntity.isiDetailedProductDescription( itemShopInfo.getIsiDetailedProductDescription() );

        return itemShopInfoEntity.build();
    }

    @Override
    public ItemDeliveryEntity toItemDeliveryEntity(ItemDelivery itemDelivery) {
        if ( itemDelivery == null ) {
            return null;
        }

        ItemDeliveryEntity.ItemDeliveryEntityBuilder itemDeliveryEntity = ItemDeliveryEntity.builder();

        itemDeliveryEntity.idIdx( itemDelivery.getIdIdx() );
        itemDeliveryEntity.item( toItemEntity( itemDelivery.getItem() ) );
        itemDeliveryEntity.expressDefine( expressDefineToExpressDefineEntity( itemDelivery.getExpressDefine() ) );
        itemDeliveryEntity.idMountainCost( itemDelivery.getIdMountainCost() );
        itemDeliveryEntity.idAddr( itemDelivery.getIdAddr() );
        itemDeliveryEntity.idAddrDetail( itemDelivery.getIdAddrDetail() );
        itemDeliveryEntity.idShippingDescription( itemDelivery.getIdShippingDescription() );
        itemDeliveryEntity.idExchangeBankName( itemDelivery.getIdExchangeBankName() );
        itemDeliveryEntity.idExchangeAccount( itemDelivery.getIdExchangeAccount() );
        itemDeliveryEntity.idExchangeBankOwner( itemDelivery.getIdExchangeBankOwner() );
        itemDeliveryEntity.idExchangeNotice( itemDelivery.getIdExchangeNotice() );
        itemDeliveryEntity.idAsPhoneNumber( itemDelivery.getIdAsPhoneNumber() );
        itemDeliveryEntity.idAsGuide( itemDelivery.getIdAsGuide() );
        itemDeliveryEntity.idAsNotice( itemDelivery.getIdAsNotice() );

        return itemDeliveryEntity.build();
    }

    @Override
    public ItemSaleEntity toItemSaleEntity(ItemSale itemSale) {
        if ( itemSale == null ) {
            return null;
        }

        ItemSaleEntity.ItemSaleEntityBuilder itemSaleEntity = ItemSaleEntity.builder();

        itemSaleEntity.isIdx( itemSale.getIsIdx() );
        itemSaleEntity.item( toItemEntity( itemSale.getItem() ) );
        itemSaleEntity.isCategory( itemSale.getIsCategory() );
        itemSaleEntity.isIsSpecificDiscount( itemSale.getIsIsSpecificDiscount() );
        itemSaleEntity.isSpecificStart( itemSale.getIsSpecificStart() );
        itemSaleEntity.isSpecificEnd( itemSale.getIsSpecificEnd() );
        itemSaleEntity.isQuantity( itemSale.getIsQuantity() );

        return itemSaleEntity.build();
    }

    @Override
    public ItemShopInfo toItemShopInfo(ItemShopInfoEntity itemShopInfoEntity) {
        if ( itemShopInfoEntity == null ) {
            return null;
        }

        ItemShopInfo.ItemShopInfoBuilder<?, ?> itemShopInfo = ItemShopInfo.builder();

        itemShopInfo.createdAt( itemShopInfoEntity.getCreatedAt() );
        itemShopInfo.updatedAt( itemShopInfoEntity.getUpdatedAt() );
        itemShopInfo.isiIdx( itemShopInfoEntity.getIsiIdx() );
        itemShopInfo.item( toItem( itemShopInfoEntity.getItem() ) );
        itemShopInfo.isiFeePayment( itemShopInfoEntity.getIsiFeePayment() );
        itemShopInfo.isiFeeRate( itemShopInfoEntity.getIsiFeeRate() );
        itemShopInfo.isiInvest( itemShopInfoEntity.getIsiInvest() );
        itemShopInfo.isiManufacturingCompany( itemShopInfoEntity.getIsiManufacturingCompany() );
        itemShopInfo.isiOrigin( itemShopInfoEntity.getIsiOrigin() );
        itemShopInfo.isiManufacturingDate( itemShopInfoEntity.getIsiManufacturingDate() );
        itemShopInfo.isiDetailedProductDescription( itemShopInfoEntity.getIsiDetailedProductDescription() );

        return itemShopInfo.build();
    }

    @Override
    public ItemDelivery toItemDelivery(ItemDeliveryEntity itemDeliveryEntity) {
        if ( itemDeliveryEntity == null ) {
            return null;
        }

        ItemDelivery.ItemDeliveryBuilder<?, ?> itemDelivery = ItemDelivery.builder();

        itemDelivery.createdAt( itemDeliveryEntity.getCreatedAt() );
        itemDelivery.updatedAt( itemDeliveryEntity.getUpdatedAt() );
        itemDelivery.idIdx( itemDeliveryEntity.getIdIdx() );
        itemDelivery.item( toItem( itemDeliveryEntity.getItem() ) );
        itemDelivery.expressDefine( expressDefineEntityToExpressDefine( itemDeliveryEntity.getExpressDefine() ) );
        itemDelivery.idMountainCost( itemDeliveryEntity.getIdMountainCost() );
        itemDelivery.idAddr( itemDeliveryEntity.getIdAddr() );
        itemDelivery.idAddrDetail( itemDeliveryEntity.getIdAddrDetail() );
        itemDelivery.idShippingDescription( itemDeliveryEntity.getIdShippingDescription() );
        itemDelivery.idExchangeBankName( itemDeliveryEntity.getIdExchangeBankName() );
        itemDelivery.idExchangeAccount( itemDeliveryEntity.getIdExchangeAccount() );
        itemDelivery.idExchangeBankOwner( itemDeliveryEntity.getIdExchangeBankOwner() );
        itemDelivery.idExchangeNotice( itemDeliveryEntity.getIdExchangeNotice() );
        itemDelivery.idAsPhoneNumber( itemDeliveryEntity.getIdAsPhoneNumber() );
        itemDelivery.idAsGuide( itemDeliveryEntity.getIdAsGuide() );
        itemDelivery.idAsNotice( itemDeliveryEntity.getIdAsNotice() );

        return itemDelivery.build();
    }

    @Override
    public ItemSale toItemSale(ItemSaleEntity itemSaleEntity) {
        if ( itemSaleEntity == null ) {
            return null;
        }

        ItemSale.ItemSaleBuilder<?, ?> itemSale = ItemSale.builder();

        itemSale.createdAt( itemSaleEntity.getCreatedAt() );
        itemSale.updatedAt( itemSaleEntity.getUpdatedAt() );
        itemSale.isIdx( itemSaleEntity.getIsIdx() );
        itemSale.item( toItem( itemSaleEntity.getItem() ) );
        itemSale.isCategory( itemSaleEntity.getIsCategory() );
        itemSale.isIsSpecificDiscount( itemSaleEntity.getIsIsSpecificDiscount() );
        itemSale.isSpecificStart( itemSaleEntity.getIsSpecificStart() );
        itemSale.isSpecificEnd( itemSaleEntity.getIsSpecificEnd() );
        itemSale.isQuantity( itemSaleEntity.getIsQuantity() );

        return itemSale.build();
    }

    @Override
    public List<ItemByBundle> toItemByBundleList(List<ItemByBundleEntity> itemByBundleEntityList) {
        if ( itemByBundleEntityList == null ) {
            return null;
        }

        List<ItemByBundle> list = new ArrayList<ItemByBundle>( itemByBundleEntityList.size() );
        for ( ItemByBundleEntity itemByBundleEntity : itemByBundleEntityList ) {
            list.add( toItemByBUndle( itemByBundleEntity ) );
        }

        return list;
    }

    protected MediaCategory mediaCategoryEntityToMediaCategory(MediaCategoryEntity mediaCategoryEntity) {
        if ( mediaCategoryEntity == null ) {
            return null;
        }

        MediaCategory.MediaCategoryBuilder<?, ?> mediaCategory = MediaCategory.builder();

        mediaCategory.createdAt( mediaCategoryEntity.getCreatedAt() );
        mediaCategory.updatedAt( mediaCategoryEntity.getUpdatedAt() );
        mediaCategory.mcIdx( mediaCategoryEntity.getMcIdx() );
        mediaCategory.mcType( mediaCategoryEntity.getMcType() );
        mediaCategory.mcParent( mediaCategoryEntity.getMcParent() );
        mediaCategory.mcDepth( mediaCategoryEntity.getMcDepth() );
        mediaCategory.mcClass( mediaCategoryEntity.getMcClass() );
        mediaCategory.mcKind( mediaCategoryEntity.getMcKind() );
        mediaCategory.mcPackage( mediaCategoryEntity.getMcPackage() );
        mediaCategory.mcView( mediaCategoryEntity.getMcView() );
        mediaCategory.mcUrl( mediaCategoryEntity.getMcUrl() );
        mediaCategory.mcChannel( mediaCategoryEntity.getMcChannel() );
        mediaCategory.mcName( mediaCategoryEntity.getMcName() );
        mediaCategory.mcGenre( mediaCategoryEntity.getMcGenre() );
        mediaCategory.mcSeq( mediaCategoryEntity.getMcSeq() );
        mediaCategory.mcDashUrl( mediaCategoryEntity.getMcDashUrl() );
        mediaCategory.mcHlsUrl( mediaCategoryEntity.getMcHlsUrl() );
        mediaCategory.guid( mediaCategoryEntity.getGuid() );
        mediaCategory.mediaPackageId( mediaCategoryEntity.getMediaPackageId() );
        mediaCategory.mcStatus( mediaCategoryEntity.getMcStatus() );
        mediaCategory.mcLgPackage( mediaCategoryEntity.getMcLgPackage() );
        mediaCategory.mcTizenPackage( mediaCategoryEntity.getMcTizenPackage() );
        mediaCategory.mcGameUrl( mediaCategoryEntity.getMcGameUrl() );
        mediaCategory.mcIsGame( mediaCategoryEntity.getMcIsGame() );
        mediaCategory.aosDisplay( mediaCategoryEntity.getAosDisplay() );
        mediaCategory.smartDisplay( mediaCategoryEntity.getSmartDisplay() );
        mediaCategory.ottAppDisplay( mediaCategoryEntity.getOttAppDisplay() );
        mediaCategory.mcAosPackage( mediaCategoryEntity.getMcAosPackage() );
        mediaCategory.mcIosPackage( mediaCategoryEntity.getMcIosPackage() );
        mediaCategory.mcVideoType( mediaCategoryEntity.getMcVideoType() );
        mediaCategory.mcAttribute( mediaCategoryEntity.getMcAttribute() );

        return mediaCategory.build();
    }

    protected Group groupEntityToGroup(GroupEntity groupEntity) {
        if ( groupEntity == null ) {
            return null;
        }

        Group.GroupBuilder<?, ?> group = Group.builder();

        group.createdAt( groupEntity.getCreatedAt() );
        group.updatedAt( groupEntity.getUpdatedAt() );
        group.grIdx( groupEntity.getGrIdx() );
        group.grType( groupEntity.getGrType() );
        group.grLevel( groupEntity.getGrLevel() );
        group.grName( groupEntity.getGrName() );
        group.grContent( groupEntity.getGrContent() );
        group.grIsDefault( groupEntity.getGrIsDefault() );
        group.grIsSuper( groupEntity.getGrIsSuper() );

        return group.build();
    }

    protected MemberSuspensionCategory memberSuspensionCategoryEntityToMemberSuspensionCategory(MemberSuspensionCategoryEntity memberSuspensionCategoryEntity) {
        if ( memberSuspensionCategoryEntity == null ) {
            return null;
        }

        MemberSuspensionCategory.MemberSuspensionCategoryBuilder<?, ?> memberSuspensionCategory = MemberSuspensionCategory.builder();

        memberSuspensionCategory.mscIdx( memberSuspensionCategoryEntity.getMscIdx() );
        memberSuspensionCategory.mscCategory( memberSuspensionCategoryEntity.getMscCategory() );
        memberSuspensionCategory.mscCode( memberSuspensionCategoryEntity.getMscCode() );
        memberSuspensionCategory.mscRequireInput( memberSuspensionCategoryEntity.getMscRequireInput() );
        memberSuspensionCategory.mscIsUse( memberSuspensionCategoryEntity.getMscIsUse() );
        memberSuspensionCategory.mscIsAdmin( memberSuspensionCategoryEntity.getMscIsAdmin() );

        return memberSuspensionCategory.build();
    }

    protected Member memberEntityToMember(MemberEntity memberEntity) {
        if ( memberEntity == null ) {
            return null;
        }

        Member.MemberBuilder<?, ?> member = Member.builder();

        member.createdAt( memberEntity.getCreatedAt() );
        member.updatedAt( memberEntity.getUpdatedAt() );
        member.mbNo( memberEntity.getMbNo() );
        member.mbIp( memberEntity.getMbIp() );
        member.mbId( memberEntity.getMbId() );
        member.mbPassword( memberEntity.getMbPassword() );
        member.mbPasswordUpdatedDate( memberEntity.getMbPasswordUpdatedDate() );
        member.mbUuid( memberEntity.getMbUuid() );
        member.mbName( memberEntity.getMbName() );
        member.mbHp( memberEntity.getMbHp() );
        member.group( groupEntityToGroup( memberEntity.getGroup() ) );
        member.mbLastLogin( memberEntity.getMbLastLogin() );
        member.mbIsUse( memberEntity.getMbIsUse() );
        member.mbJoinDate( memberEntity.getMbJoinDate() );
        member.mbStatus( memberEntity.getMbStatus() );
        member.mbCategory( memberEntity.getMbCategory() );
        member.mbIsVerify( memberEntity.getMbIsVerify() );
        member.deletedAt( memberEntity.getDeletedAt() );
        member.mbAnd( memberEntity.getMbAnd() );
        member.mbSmart( memberEntity.getMbSmart() );
        member.mbSmartStatus( memberEntity.getMbSmartStatus() );
        member.mbCertificationDate( memberEntity.getMbCertificationDate() );
        member.mbAdminNo( memberEntity.getMbAdminNo() );
        member.mbTelephone( memberEntity.getMbTelephone() );
        member.memberSuspensionCategory( memberSuspensionCategoryEntityToMemberSuspensionCategory( memberEntity.getMemberSuspensionCategory() ) );
        member.mbEnd( memberEntity.getMbEnd() );

        return member.build();
    }

    protected MediaGenre mediaGenreEntityToMediaGenre(MediaGenreEntity mediaGenreEntity) {
        if ( mediaGenreEntity == null ) {
            return null;
        }

        MediaGenre.MediaGenreBuilder<?, ?> mediaGenre = MediaGenre.builder();

        mediaGenre.createdAt( mediaGenreEntity.getCreatedAt() );
        mediaGenre.updatedAt( mediaGenreEntity.getUpdatedAt() );
        mediaGenre.mgIdx( mediaGenreEntity.getMgIdx() );
        mediaGenre.mediaCategory( mediaCategoryEntityToMediaCategory( mediaGenreEntity.getMediaCategory() ) );
        mediaGenre.mgName( mediaGenreEntity.getMgName() );
        mediaGenre.mgSeq( mediaGenreEntity.getMgSeq() );

        return mediaGenre.build();
    }

    protected Media mediaEntityToMedia(MediaEntity mediaEntity) {
        if ( mediaEntity == null ) {
            return null;
        }

        Media.MediaBuilder<?, ?> media = Media.builder();

        media.createdAt( mediaEntity.getCreatedAt() );
        media.updatedAt( mediaEntity.getUpdatedAt() );
        media.meIdx( mediaEntity.getMeIdx() );
        media.meUuid( mediaEntity.getMeUuid() );
        media.mediaCategory( mediaCategoryEntityToMediaCategory( mediaEntity.getMediaCategory() ) );
        media.meName( mediaEntity.getMeName() );
        media.meName2( mediaEntity.getMeName2() );
        media.meNameHomeShow( mediaEntity.getMeNameHomeShow() );
        media.mePriceType( mediaEntity.getMePriceType() );
        media.mePrice( mediaEntity.getMePrice() );
        media.mePriceCoin( mediaEntity.getMePriceCoin() );
        media.meFeeType( mediaEntity.getMeFeeType() );
        media.meFee( mediaEntity.getMeFee() );
        media.meInvest( mediaEntity.getMeInvest() );
        media.member( memberEntityToMember( mediaEntity.getMember() ) );
        media.meProducer( mediaEntity.getMeProducer() );
        media.meRunningTime( mediaEntity.getMeRunningTime() );
        media.meStatus( mediaEntity.getMeStatus() );
        media.meDashUrl( mediaEntity.getMeDashUrl() );
        media.meHlsUrl( mediaEntity.getMeHlsUrl() );
        media.guid( mediaEntity.getGuid() );
        media.mediaPackageId( mediaEntity.getMediaPackageId() );
        media.meUse( mediaEntity.getMeUse() );
        media.meHit( mediaEntity.getMeHit() );
        media.mePostTimeSt( mediaEntity.getMePostTimeSt() );
        media.mePostTimeEd( mediaEntity.getMePostTimeEd() );
        media.mePreview( mediaEntity.getMePreview() );
        media.meGenreType( mediaEntity.getMeGenreType() );
        media.meIsAllow( mediaEntity.getMeIsAllow() );
        media.meSeq( mediaEntity.getMeSeq() );
        media.deletedAt( mediaEntity.getDeletedAt() );
        media.meReason( mediaEntity.getMeReason() );
        media.meAllowDate( mediaEntity.getMeAllowDate() );
        media.meAllowAdminNo( mediaEntity.getMeAllowAdminNo() );
        media.meSeriesType( mediaEntity.getMeSeriesType() );
        media.meAutoDelete( mediaEntity.getMeAutoDelete() );
        media.meDenyDate( mediaEntity.getMeDenyDate() );
        media.meActor( mediaEntity.getMeActor() );
        media.meInfo( mediaEntity.getMeInfo() );
        media.meVersion( mediaEntity.getMeVersion() );
        media.mediaGenre( mediaGenreEntityToMediaGenre( mediaEntity.getMediaGenre() ) );
        media.sourceLocationName( mediaEntity.getSourceLocationName() );
        media.meAosDisplay( mediaEntity.getMeAosDisplay() );
        media.meSmartDisplay( mediaEntity.getMeSmartDisplay() );
        media.meOttAppDisplay( mediaEntity.getMeOttAppDisplay() );
        media.lpType( mediaEntity.getLpType() );

        return media.build();
    }

    protected MediaCategoryEntity mediaCategoryToMediaCategoryEntity(MediaCategory mediaCategory) {
        if ( mediaCategory == null ) {
            return null;
        }

        MediaCategoryEntity.MediaCategoryEntityBuilder mediaCategoryEntity = MediaCategoryEntity.builder();

        mediaCategoryEntity.mcIdx( mediaCategory.getMcIdx() );
        mediaCategoryEntity.mcType( mediaCategory.getMcType() );
        mediaCategoryEntity.mcParent( mediaCategory.getMcParent() );
        mediaCategoryEntity.mcDepth( mediaCategory.getMcDepth() );
        mediaCategoryEntity.mcClass( mediaCategory.getMcClass() );
        mediaCategoryEntity.mcKind( mediaCategory.getMcKind() );
        mediaCategoryEntity.mcPackage( mediaCategory.getMcPackage() );
        mediaCategoryEntity.mcView( mediaCategory.getMcView() );
        mediaCategoryEntity.mcUrl( mediaCategory.getMcUrl() );
        mediaCategoryEntity.mcChannel( mediaCategory.getMcChannel() );
        mediaCategoryEntity.mcName( mediaCategory.getMcName() );
        mediaCategoryEntity.mcGenre( mediaCategory.getMcGenre() );
        mediaCategoryEntity.mcSeq( mediaCategory.getMcSeq() );
        mediaCategoryEntity.mcDashUrl( mediaCategory.getMcDashUrl() );
        mediaCategoryEntity.mcHlsUrl( mediaCategory.getMcHlsUrl() );
        mediaCategoryEntity.guid( mediaCategory.getGuid() );
        mediaCategoryEntity.mediaPackageId( mediaCategory.getMediaPackageId() );
        mediaCategoryEntity.mcStatus( mediaCategory.getMcStatus() );
        mediaCategoryEntity.mcLgPackage( mediaCategory.getMcLgPackage() );
        mediaCategoryEntity.mcTizenPackage( mediaCategory.getMcTizenPackage() );
        mediaCategoryEntity.mcGameUrl( mediaCategory.getMcGameUrl() );
        mediaCategoryEntity.mcIsGame( mediaCategory.getMcIsGame() );
        mediaCategoryEntity.aosDisplay( mediaCategory.getAosDisplay() );
        mediaCategoryEntity.smartDisplay( mediaCategory.getSmartDisplay() );
        mediaCategoryEntity.ottAppDisplay( mediaCategory.getOttAppDisplay() );
        mediaCategoryEntity.mcAosPackage( mediaCategory.getMcAosPackage() );
        mediaCategoryEntity.mcIosPackage( mediaCategory.getMcIosPackage() );
        mediaCategoryEntity.mcVideoType( mediaCategory.getMcVideoType() );
        mediaCategoryEntity.mcAttribute( mediaCategory.getMcAttribute() );

        return mediaCategoryEntity.build();
    }

    protected GroupEntity groupToGroupEntity(Group group) {
        if ( group == null ) {
            return null;
        }

        GroupEntity.GroupEntityBuilder<?, ?> groupEntity = GroupEntity.builder();

        groupEntity.createdAt( group.getCreatedAt() );
        groupEntity.updatedAt( group.getUpdatedAt() );
        groupEntity.grIdx( group.getGrIdx() );
        groupEntity.grType( group.getGrType() );
        groupEntity.grLevel( group.getGrLevel() );
        groupEntity.grName( group.getGrName() );
        groupEntity.grContent( group.getGrContent() );
        groupEntity.grIsDefault( group.getGrIsDefault() );
        groupEntity.grIsSuper( group.getGrIsSuper() );

        return groupEntity.build();
    }

    protected MemberSuspensionCategoryEntity memberSuspensionCategoryToMemberSuspensionCategoryEntity(MemberSuspensionCategory memberSuspensionCategory) {
        if ( memberSuspensionCategory == null ) {
            return null;
        }

        MemberSuspensionCategoryEntity.MemberSuspensionCategoryEntityBuilder memberSuspensionCategoryEntity = MemberSuspensionCategoryEntity.builder();

        memberSuspensionCategoryEntity.mscIdx( memberSuspensionCategory.getMscIdx() );
        memberSuspensionCategoryEntity.mscCategory( memberSuspensionCategory.getMscCategory() );
        memberSuspensionCategoryEntity.mscCode( memberSuspensionCategory.getMscCode() );
        memberSuspensionCategoryEntity.mscRequireInput( memberSuspensionCategory.getMscRequireInput() );
        memberSuspensionCategoryEntity.mscIsUse( memberSuspensionCategory.getMscIsUse() );
        memberSuspensionCategoryEntity.mscIsAdmin( memberSuspensionCategory.getMscIsAdmin() );

        return memberSuspensionCategoryEntity.build();
    }

    protected MemberEntity memberToMemberEntity(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberEntity.MemberEntityBuilder<?, ?> memberEntity = MemberEntity.builder();

        memberEntity.createdAt( member.getCreatedAt() );
        memberEntity.updatedAt( member.getUpdatedAt() );
        memberEntity.mbNo( member.getMbNo() );
        memberEntity.mbIp( member.getMbIp() );
        memberEntity.mbId( member.getMbId() );
        memberEntity.mbPassword( member.getMbPassword() );
        memberEntity.mbPasswordUpdatedDate( member.getMbPasswordUpdatedDate() );
        memberEntity.mbUuid( member.getMbUuid() );
        memberEntity.mbName( member.getMbName() );
        memberEntity.mbHp( member.getMbHp() );
        memberEntity.group( groupToGroupEntity( member.getGroup() ) );
        memberEntity.mbLastLogin( member.getMbLastLogin() );
        memberEntity.mbIsUse( member.getMbIsUse() );
        memberEntity.mbJoinDate( member.getMbJoinDate() );
        memberEntity.mbStatus( member.getMbStatus() );
        memberEntity.mbCategory( member.getMbCategory() );
        memberEntity.mbIsVerify( member.getMbIsVerify() );
        memberEntity.deletedAt( member.getDeletedAt() );
        memberEntity.mbAnd( member.getMbAnd() );
        memberEntity.mbSmart( member.getMbSmart() );
        memberEntity.mbSmartStatus( member.getMbSmartStatus() );
        memberEntity.mbCertificationDate( member.getMbCertificationDate() );
        memberEntity.mbAdminNo( member.getMbAdminNo() );
        memberEntity.mbTelephone( member.getMbTelephone() );
        memberEntity.memberSuspensionCategory( memberSuspensionCategoryToMemberSuspensionCategoryEntity( member.getMemberSuspensionCategory() ) );
        memberEntity.mbEnd( member.getMbEnd() );

        return memberEntity.build();
    }

    protected MediaGenreEntity mediaGenreToMediaGenreEntity(MediaGenre mediaGenre) {
        if ( mediaGenre == null ) {
            return null;
        }

        MediaGenreEntity.MediaGenreEntityBuilder mediaGenreEntity = MediaGenreEntity.builder();

        mediaGenreEntity.mgIdx( mediaGenre.getMgIdx() );
        mediaGenreEntity.mediaCategory( mediaCategoryToMediaCategoryEntity( mediaGenre.getMediaCategory() ) );
        mediaGenreEntity.mgName( mediaGenre.getMgName() );
        mediaGenreEntity.mgSeq( mediaGenre.getMgSeq() );

        return mediaGenreEntity.build();
    }

    protected MediaEntity mediaToMediaEntity(Media media) {
        if ( media == null ) {
            return null;
        }

        MediaEntity.MediaEntityBuilder mediaEntity = MediaEntity.builder();

        mediaEntity.meIdx( media.getMeIdx() );
        mediaEntity.meUuid( media.getMeUuid() );
        mediaEntity.mediaCategory( mediaCategoryToMediaCategoryEntity( media.getMediaCategory() ) );
        mediaEntity.meName( media.getMeName() );
        mediaEntity.meName2( media.getMeName2() );
        mediaEntity.meNameHomeShow( media.getMeNameHomeShow() );
        mediaEntity.mePriceType( media.getMePriceType() );
        mediaEntity.mePrice( media.getMePrice() );
        mediaEntity.mePriceCoin( media.getMePriceCoin() );
        mediaEntity.meFeeType( media.getMeFeeType() );
        mediaEntity.meFee( media.getMeFee() );
        mediaEntity.meInvest( media.getMeInvest() );
        mediaEntity.member( memberToMemberEntity( media.getMember() ) );
        mediaEntity.meProducer( media.getMeProducer() );
        mediaEntity.meRunningTime( media.getMeRunningTime() );
        mediaEntity.meStatus( media.getMeStatus() );
        mediaEntity.meDashUrl( media.getMeDashUrl() );
        mediaEntity.meHlsUrl( media.getMeHlsUrl() );
        mediaEntity.guid( media.getGuid() );
        mediaEntity.mediaPackageId( media.getMediaPackageId() );
        mediaEntity.meUse( media.getMeUse() );
        mediaEntity.meHit( media.getMeHit() );
        mediaEntity.mePostTimeSt( media.getMePostTimeSt() );
        mediaEntity.mePostTimeEd( media.getMePostTimeEd() );
        mediaEntity.mePreview( media.getMePreview() );
        mediaEntity.meGenreType( media.getMeGenreType() );
        mediaEntity.meIsAllow( media.getMeIsAllow() );
        mediaEntity.meSeq( media.getMeSeq() );
        mediaEntity.deletedAt( media.getDeletedAt() );
        mediaEntity.meReason( media.getMeReason() );
        mediaEntity.meAllowDate( media.getMeAllowDate() );
        mediaEntity.meAllowAdminNo( media.getMeAllowAdminNo() );
        mediaEntity.meSeriesType( media.getMeSeriesType() );
        mediaEntity.meAutoDelete( media.getMeAutoDelete() );
        mediaEntity.meDenyDate( media.getMeDenyDate() );
        mediaEntity.meActor( media.getMeActor() );
        mediaEntity.meInfo( media.getMeInfo() );
        mediaEntity.meVersion( media.getMeVersion() );
        mediaEntity.mediaGenre( mediaGenreToMediaGenreEntity( media.getMediaGenre() ) );
        mediaEntity.sourceLocationName( media.getSourceLocationName() );
        mediaEntity.meAosDisplay( media.getMeAosDisplay() );
        mediaEntity.meSmartDisplay( media.getMeSmartDisplay() );
        mediaEntity.meOttAppDisplay( media.getMeOttAppDisplay() );
        mediaEntity.lpType( media.getLpType() );

        return mediaEntity.build();
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

    protected ItemChannelEntity itemChannelToItemChannelEntity(ItemChannel itemChannel) {
        if ( itemChannel == null ) {
            return null;
        }

        ItemChannelEntity.ItemChannelEntityBuilder itemChannelEntity = ItemChannelEntity.builder();

        itemChannelEntity.icIdx( itemChannel.getIcIdx() );
        itemChannelEntity.item( toItemEntity( itemChannel.getItem() ) );
        itemChannelEntity.channel( channelToChannelEntity( itemChannel.getChannel() ) );
        itemChannelEntity.itemByBundle( toItemByBundleEntity( itemChannel.getItemByBundle() ) );

        return itemChannelEntity.build();
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

    protected ExpressDefineEntity expressDefineToExpressDefineEntity(ExpressDefine expressDefine) {
        if ( expressDefine == null ) {
            return null;
        }

        ExpressDefineEntity.ExpressDefineEntityBuilder expressDefineEntity = ExpressDefineEntity.builder();

        expressDefineEntity.edIdx( expressDefine.getEdIdx() );
        expressDefineEntity.edName( expressDefine.getEdName() );
        expressDefineEntity.edUrl( expressDefine.getEdUrl() );
        expressDefineEntity.edCode( expressDefine.getEdCode() );
        expressDefineEntity.edIsGlobal( expressDefine.getEdIsGlobal() );
        expressDefineEntity.edIsUse( expressDefine.getEdIsUse() );

        return expressDefineEntity.build();
    }

    protected ExpressDefine expressDefineEntityToExpressDefine(ExpressDefineEntity expressDefineEntity) {
        if ( expressDefineEntity == null ) {
            return null;
        }

        ExpressDefine.ExpressDefineBuilder<?, ?> expressDefine = ExpressDefine.builder();

        expressDefine.createdAt( expressDefineEntity.getCreatedAt() );
        expressDefine.updatedAt( expressDefineEntity.getUpdatedAt() );
        expressDefine.edIdx( expressDefineEntity.getEdIdx() );
        expressDefine.edName( expressDefineEntity.getEdName() );
        expressDefine.edUrl( expressDefineEntity.getEdUrl() );
        expressDefine.edCode( expressDefineEntity.getEdCode() );
        expressDefine.edIsGlobal( expressDefineEntity.getEdIsGlobal() );
        expressDefine.edIsUse( expressDefineEntity.getEdIsUse() );

        return expressDefine.build();
    }
}
