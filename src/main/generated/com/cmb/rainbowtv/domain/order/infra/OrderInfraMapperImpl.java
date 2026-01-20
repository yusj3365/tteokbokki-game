package com.cmb.rainbowtv.domain.order.infra;

import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentEntity;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContent;
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
import com.cmb.rainbowtv.domain.order.infra.data.entity.OrderAddressEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.OrderByAdvertiseEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.OrderByMediaEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.OrderEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.OrderPointScheduleEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.OrderRefundEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.OrderTradeEntity;
import com.cmb.rainbowtv.domain.order.infra.data.entity.RefundEntity;
import com.cmb.rainbowtv.domain.order.model.Order;
import com.cmb.rainbowtv.domain.order.model.OrderAddress;
import com.cmb.rainbowtv.domain.order.model.OrderByAdvertise;
import com.cmb.rainbowtv.domain.order.model.OrderByMedia;
import com.cmb.rainbowtv.domain.order.model.OrderPointSchedule;
import com.cmb.rainbowtv.domain.order.model.OrderRefund;
import com.cmb.rainbowtv.domain.order.model.OrderTrade;
import com.cmb.rainbowtv.domain.order.model.Refund;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointDefineCodeEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointDefineEntity;
import com.cmb.rainbowtv.domain.point.model.PointDefine;
import com.cmb.rainbowtv.domain.point.model.PointDefineCode;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemEntity;
import com.cmb.rainbowtv.domain.product.model.Item;
import com.cmb.rainbowtv.global.define.bankCode.infra.data.entity.BankCodeDefineEntity;
import com.cmb.rainbowtv.global.define.bankCode.model.BankCodeDefine;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:48+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class OrderInfraMapperImpl implements OrderInfraMapper {

    @Override
    public Order toOrder(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }

        Order.OrderBuilder<?, ?> order = Order.builder();

        order.createdAt( orderEntity.getCreatedAt() );
        order.updatedAt( orderEntity.getUpdatedAt() );
        order.ordIdx( orderEntity.getOrdIdx() );
        order.ordId( orderEntity.getOrdId() );
        order.ordType( orderEntity.getOrdType() );
        order.member( memberEntityToMember( orderEntity.getMember() ) );
        order.ordStatus( orderEntity.getOrdStatus() );
        order.ordName( orderEntity.getOrdName() );
        order.ordCount( orderEntity.getOrdCount() );
        order.ordPriceOrg( orderEntity.getOrdPriceOrg() );
        order.ordPrice( orderEntity.getOrdPrice() );
        order.ordDepositPrice( orderEntity.getOrdDepositPrice() );
        order.ordCouponPrice( orderEntity.getOrdCouponPrice() );
        order.ordReceiptPoint( orderEntity.getOrdReceiptPoint() );
        order.ordSendPrice( orderEntity.getOrdSendPrice() );
        order.ordCancelPrice( orderEntity.getOrdCancelPrice() );
        order.ordRefundPrice( orderEntity.getOrdRefundPrice() );
        order.bankCodeDefine( bankCodeDefineEntityToBankCodeDefine( orderEntity.getBankCodeDefine() ) );
        order.ordRefundBankName( orderEntity.getOrdRefundBankName() );
        order.ordRefundBankAccount( orderEntity.getOrdRefundBankAccount() );
        order.ordBankAccount( orderEntity.getOrdBankAccount() );
        order.ordReceiptTime( orderEntity.getOrdReceiptTime() );
        order.ordMemo( orderEntity.getOrdMemo() );
        order.ordModHistory( orderEntity.getOrdModHistory() );
        order.ordPayment( orderEntity.getOrdPayment() );
        order.ordPg( orderEntity.getOrdPg() );
        order.ordPgKey( orderEntity.getOrdPgKey() );
        order.ordTaxFlag( orderEntity.getOrdTaxFlag() );
        order.ordTaxMny( orderEntity.getOrdTaxMny() );
        order.ordVatMny( orderEntity.getOrdVatMny() );
        order.ordFreeMny( orderEntity.getOrdFreeMny() );
        order.ordCancelDate( orderEntity.getOrdCancelDate() );
        order.ordRefundAdminNo( orderEntity.getOrdRefundAdminNo() );
        order.ordRefundAdmin( orderEntity.getOrdRefundAdmin() );
        order.ordRefundDate( orderEntity.getOrdRefundDate() );
        order.ordSalePrice( orderEntity.getOrdSalePrice() );
        order.ordMountainPrice( orderEntity.getOrdMountainPrice() );
        order.ordDeliveryWaitDate( orderEntity.getOrdDeliveryWaitDate() );
        order.drdDeliveryCompleteDate( orderEntity.getDrdDeliveryCompleteDate() );

        return order.build();
    }

    @Override
    public OrderEntity toOrderEntity(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderEntity.OrderEntityBuilder orderEntity = OrderEntity.builder();

        orderEntity.ordIdx( order.getOrdIdx() );
        orderEntity.ordId( order.getOrdId() );
        orderEntity.ordType( order.getOrdType() );
        orderEntity.member( memberToMemberEntity( order.getMember() ) );
        orderEntity.ordStatus( order.getOrdStatus() );
        orderEntity.ordName( order.getOrdName() );
        orderEntity.ordCount( order.getOrdCount() );
        orderEntity.ordPriceOrg( order.getOrdPriceOrg() );
        orderEntity.ordPrice( order.getOrdPrice() );
        orderEntity.ordDepositPrice( order.getOrdDepositPrice() );
        orderEntity.ordCouponPrice( order.getOrdCouponPrice() );
        orderEntity.ordReceiptPoint( order.getOrdReceiptPoint() );
        orderEntity.ordSendPrice( order.getOrdSendPrice() );
        orderEntity.ordCancelPrice( order.getOrdCancelPrice() );
        orderEntity.ordRefundPrice( order.getOrdRefundPrice() );
        orderEntity.bankCodeDefine( bankCodeDefineToBankCodeDefineEntity( order.getBankCodeDefine() ) );
        orderEntity.ordRefundBankName( order.getOrdRefundBankName() );
        orderEntity.ordRefundBankAccount( order.getOrdRefundBankAccount() );
        orderEntity.ordBankAccount( order.getOrdBankAccount() );
        orderEntity.ordReceiptTime( order.getOrdReceiptTime() );
        orderEntity.ordMemo( order.getOrdMemo() );
        orderEntity.ordModHistory( order.getOrdModHistory() );
        orderEntity.ordPayment( order.getOrdPayment() );
        orderEntity.ordPg( order.getOrdPg() );
        orderEntity.ordPgKey( order.getOrdPgKey() );
        orderEntity.ordTaxFlag( order.getOrdTaxFlag() );
        orderEntity.ordTaxMny( order.getOrdTaxMny() );
        orderEntity.ordVatMny( order.getOrdVatMny() );
        orderEntity.ordFreeMny( order.getOrdFreeMny() );
        orderEntity.ordCancelDate( order.getOrdCancelDate() );
        orderEntity.ordRefundAdminNo( order.getOrdRefundAdminNo() );
        orderEntity.ordRefundAdmin( order.getOrdRefundAdmin() );
        orderEntity.ordRefundDate( order.getOrdRefundDate() );
        orderEntity.ordSalePrice( order.getOrdSalePrice() );
        orderEntity.ordMountainPrice( order.getOrdMountainPrice() );
        orderEntity.ordDeliveryWaitDate( order.getOrdDeliveryWaitDate() );
        orderEntity.drdDeliveryCompleteDate( order.getDrdDeliveryCompleteDate() );

        return orderEntity.build();
    }

    @Override
    public RefundEntity toRefundEntity(Refund refund) {
        if ( refund == null ) {
            return null;
        }

        RefundEntity.RefundEntityBuilder refundEntity = RefundEntity.builder();

        refundEntity.reIdx( refund.getReIdx() );
        refundEntity.member( memberToMemberEntity( refund.getMember() ) );
        refundEntity.order( toOrderEntity( refund.getOrder() ) );
        refundEntity.reWriter( memberToMemberEntity( refund.getReWriter() ) );
        refundEntity.reApprover( memberToMemberEntity( refund.getReApprover() ) );
        refundEntity.reManager( memberToMemberEntity( refund.getReManager() ) );
        refundEntity.reStatus( refund.getReStatus() );
        refundEntity.reStatusDate( refund.getReStatusDate() );
        refundEntity.reStatusReason( refund.getReStatusReason() );
        refundEntity.reRequestDate( refund.getReRequestDate() );
        refundEntity.reRequestPrice( refund.getReRequestPrice() );
        refundEntity.reContent( refund.getReContent() );
        refundEntity.reDetail( refund.getReDetail() );

        return refundEntity.build();
    }

    @Override
    public Refund toRefund(RefundEntity refundEntity) {
        if ( refundEntity == null ) {
            return null;
        }

        Refund.RefundBuilder<?, ?> refund = Refund.builder();

        refund.createdAt( refundEntity.getCreatedAt() );
        refund.updatedAt( refundEntity.getUpdatedAt() );
        refund.reIdx( refundEntity.getReIdx() );
        refund.member( memberEntityToMember( refundEntity.getMember() ) );
        refund.order( toOrder( refundEntity.getOrder() ) );
        refund.reWriter( memberEntityToMember( refundEntity.getReWriter() ) );
        refund.reApprover( memberEntityToMember( refundEntity.getReApprover() ) );
        refund.reManager( memberEntityToMember( refundEntity.getReManager() ) );
        refund.reStatus( refundEntity.getReStatus() );
        refund.reStatusDate( refundEntity.getReStatusDate() );
        refund.reStatusReason( refundEntity.getReStatusReason() );
        refund.reRequestDate( refundEntity.getReRequestDate() );
        refund.reRequestPrice( refundEntity.getReRequestPrice() );
        refund.reContent( refundEntity.getReContent() );
        refund.reDetail( refundEntity.getReDetail() );

        return refund.build();
    }

    @Override
    public OrderRefundEntity toOrderRefundEntity(OrderRefund orderRefund) {
        if ( orderRefund == null ) {
            return null;
        }

        OrderRefundEntity.OrderRefundEntityBuilder orderRefundEntity = OrderRefundEntity.builder();

        orderRefundEntity.oreIdx( orderRefund.getOreIdx() );
        orderRefundEntity.order( toOrderEntity( orderRefund.getOrder() ) );
        orderRefundEntity.oreStatus( orderRefund.getOreStatus() );
        orderRefundEntity.oreFruit( orderRefund.getOreFruit() );
        orderRefundEntity.oreUserContent( orderRefund.getOreUserContent() );
        orderRefundEntity.oreAdminContent( orderRefund.getOreAdminContent() );
        orderRefundEntity.oreDenyReason( orderRefund.getOreDenyReason() );
        if ( orderRefund.getOreUserReasonType() != null ) {
            orderRefundEntity.oreUserReasonType( orderRefund.getOreUserReasonType().longValue() );
        }
        orderRefundEntity.oreSendPrice( orderRefund.getOreSendPrice() );
        orderRefundEntity.oreRefundPrice( orderRefund.getOreRefundPrice() );
        orderRefundEntity.oreRequireAt( orderRefund.getOreRequireAt() );
        orderRefundEntity.oreAcceptAt( orderRefund.getOreAcceptAt() );
        orderRefundEntity.oreDenyAt( orderRefund.getOreDenyAt() );
        orderRefundEntity.oreDoneAt( orderRefund.getOreDoneAt() );

        return orderRefundEntity.build();
    }

    @Override
    public List<OrderRefund> toOrderRefundList(List<OrderRefundEntity> orderRefundEntityList) {
        if ( orderRefundEntityList == null ) {
            return null;
        }

        List<OrderRefund> list = new ArrayList<OrderRefund>( orderRefundEntityList.size() );
        for ( OrderRefundEntity orderRefundEntity : orderRefundEntityList ) {
            list.add( toOrderRefund( orderRefundEntity ) );
        }

        return list;
    }

    @Override
    public List<Refund> toRefundList(List<RefundEntity> refundEntities) {
        if ( refundEntities == null ) {
            return null;
        }

        List<Refund> list = new ArrayList<Refund>( refundEntities.size() );
        for ( RefundEntity refundEntity : refundEntities ) {
            list.add( toRefund( refundEntity ) );
        }

        return list;
    }

    @Override
    public OrderRefund toOrderRefund(OrderRefundEntity orderRefundEntity) {
        if ( orderRefundEntity == null ) {
            return null;
        }

        OrderRefund.OrderRefundBuilder<?, ?> orderRefund = OrderRefund.builder();

        orderRefund.createdAt( orderRefundEntity.getCreatedAt() );
        orderRefund.updatedAt( orderRefundEntity.getUpdatedAt() );
        orderRefund.oreIdx( orderRefundEntity.getOreIdx() );
        orderRefund.order( toOrder( orderRefundEntity.getOrder() ) );
        orderRefund.oreStatus( orderRefundEntity.getOreStatus() );
        orderRefund.oreFruit( orderRefundEntity.getOreFruit() );
        orderRefund.oreUserContent( orderRefundEntity.getOreUserContent() );
        orderRefund.oreAdminContent( orderRefundEntity.getOreAdminContent() );
        orderRefund.oreDenyReason( orderRefundEntity.getOreDenyReason() );
        if ( orderRefundEntity.getOreUserReasonType() != null ) {
            orderRefund.oreUserReasonType( orderRefundEntity.getOreUserReasonType().intValue() );
        }
        orderRefund.oreSendPrice( orderRefundEntity.getOreSendPrice() );
        orderRefund.oreRefundPrice( orderRefundEntity.getOreRefundPrice() );
        orderRefund.oreRequireAt( orderRefundEntity.getOreRequireAt() );
        orderRefund.oreAcceptAt( orderRefundEntity.getOreAcceptAt() );
        orderRefund.oreDenyAt( orderRefundEntity.getOreDenyAt() );
        orderRefund.oreDoneAt( orderRefundEntity.getOreDoneAt() );

        return orderRefund.build();
    }

    @Override
    public OrderByAdvertise toOrderByAdvertise(OrderByAdvertiseEntity orderByAdvertiseEntity) {
        if ( orderByAdvertiseEntity == null ) {
            return null;
        }

        OrderByAdvertise.OrderByAdvertiseBuilder<?, ?> orderByAdvertise = OrderByAdvertise.builder();

        orderByAdvertise.createdAt( orderByAdvertiseEntity.getCreatedAt() );
        orderByAdvertise.updatedAt( orderByAdvertiseEntity.getUpdatedAt() );
        orderByAdvertise.obaIdx( orderByAdvertiseEntity.getObaIdx() );
        orderByAdvertise.order( toOrder( orderByAdvertiseEntity.getOrder() ) );
        orderByAdvertise.advertiseContent( advertiseContentEntityToAdvertiseContent( orderByAdvertiseEntity.getAdvertiseContent() ) );

        return orderByAdvertise.build();
    }

    @Override
    public OrderPointScheduleEntity toOrderPointScheduleEntity(OrderPointSchedule orderPointSchedule) {
        if ( orderPointSchedule == null ) {
            return null;
        }

        OrderPointScheduleEntity.OrderPointScheduleEntityBuilder orderPointScheduleEntity = OrderPointScheduleEntity.builder();

        orderPointScheduleEntity.opsIdx( orderPointSchedule.getOpsIdx() );
        orderPointScheduleEntity.pointDefine( pointDefineToPointDefineEntity( orderPointSchedule.getPointDefine() ) );
        orderPointScheduleEntity.order( toOrderEntity( orderPointSchedule.getOrder() ) );
        orderPointScheduleEntity.opsPaidPoint( orderPointSchedule.getOpsPaidPoint() );
        orderPointScheduleEntity.opsPayDate( orderPointSchedule.getOpsPayDate() );

        return orderPointScheduleEntity.build();
    }

    @Override
    public OrderTrade toOrderTrade(OrderTradeEntity orderTradeEntity) {
        if ( orderTradeEntity == null ) {
            return null;
        }

        OrderTrade.OrderTradeBuilder<?, ?> orderTrade = OrderTrade.builder();

        orderTrade.createdAt( orderTradeEntity.getCreatedAt() );
        orderTrade.updatedAt( orderTradeEntity.getUpdatedAt() );
        orderTrade.otIdx( orderTradeEntity.getOtIdx() );
        orderTrade.order( toOrder( orderTradeEntity.getOrder() ) );
        orderTrade.otStatus( orderTradeEntity.getOtStatus() );
        orderTrade.otFruit( orderTradeEntity.getOtFruit() );
        orderTrade.otUserContent( orderTradeEntity.getOtUserContent() );
        orderTrade.otAdminContent( orderTradeEntity.getOtAdminContent() );
        orderTrade.otDenyReason( orderTradeEntity.getOtDenyReason() );
        if ( orderTradeEntity.getOtUserReasonType() != null ) {
            orderTrade.otUserReasonType( orderTradeEntity.getOtUserReasonType().intValue() );
        }
        orderTrade.otSendPrice( orderTradeEntity.getOtSendPrice() );
        orderTrade.otRequireAt( orderTradeEntity.getOtRequireAt() );
        orderTrade.otAcceptAt( orderTradeEntity.getOtAcceptAt() );
        orderTrade.otDenyAt( orderTradeEntity.getOtDenyAt() );
        orderTrade.otDoneAt( orderTradeEntity.getOtDoneAt() );

        return orderTrade.build();
    }

    @Override
    public List<OrderTrade> toOrderTradeList(List<OrderTradeEntity> orderTradeEntity) {
        if ( orderTradeEntity == null ) {
            return null;
        }

        List<OrderTrade> list = new ArrayList<OrderTrade>( orderTradeEntity.size() );
        for ( OrderTradeEntity orderTradeEntity1 : orderTradeEntity ) {
            list.add( toOrderTrade( orderTradeEntity1 ) );
        }

        return list;
    }

    @Override
    public OrderTradeEntity toOrderTradeEntity(OrderTrade orderTrade) {
        if ( orderTrade == null ) {
            return null;
        }

        OrderTradeEntity.OrderTradeEntityBuilder orderTradeEntity = OrderTradeEntity.builder();

        orderTradeEntity.otIdx( orderTrade.getOtIdx() );
        orderTradeEntity.order( toOrderEntity( orderTrade.getOrder() ) );
        orderTradeEntity.otStatus( orderTrade.getOtStatus() );
        orderTradeEntity.otFruit( orderTrade.getOtFruit() );
        orderTradeEntity.otUserContent( orderTrade.getOtUserContent() );
        orderTradeEntity.otAdminContent( orderTrade.getOtAdminContent() );
        orderTradeEntity.otDenyReason( orderTrade.getOtDenyReason() );
        if ( orderTrade.getOtUserReasonType() != null ) {
            orderTradeEntity.otUserReasonType( orderTrade.getOtUserReasonType().longValue() );
        }
        orderTradeEntity.otSendPrice( orderTrade.getOtSendPrice() );
        orderTradeEntity.otRequireAt( orderTrade.getOtRequireAt() );
        orderTradeEntity.otAcceptAt( orderTrade.getOtAcceptAt() );
        orderTradeEntity.otDenyAt( orderTrade.getOtDenyAt() );
        orderTradeEntity.otDoneAt( orderTrade.getOtDoneAt() );

        return orderTradeEntity.build();
    }

    @Override
    public OrderAddress toOrderAddress(OrderAddressEntity orderAddressEntity) {
        if ( orderAddressEntity == null ) {
            return null;
        }

        OrderAddress.OrderAddressBuilder<?, ?> orderAddress = OrderAddress.builder();

        orderAddress.createdAt( orderAddressEntity.getCreatedAt() );
        orderAddress.updatedAt( orderAddressEntity.getUpdatedAt() );
        orderAddress.oaIdx( orderAddressEntity.getOaIdx() );
        orderAddress.order( toOrder( orderAddressEntity.getOrder() ) );
        orderAddress.oaName( orderAddressEntity.getOaName() );
        orderAddress.oaHp( orderAddressEntity.getOaHp() );
        orderAddress.oaZip( orderAddressEntity.getOaZip() );
        orderAddress.oaAddr( orderAddressEntity.getOaAddr() );
        orderAddress.oaAddrDetail( orderAddressEntity.getOaAddrDetail() );
        orderAddress.oaMemo( orderAddressEntity.getOaMemo() );

        return orderAddress.build();
    }

    @Override
    public OrderAddressEntity toOrderAddressEntity(OrderAddress orderAddress) {
        if ( orderAddress == null ) {
            return null;
        }

        OrderAddressEntity.OrderAddressEntityBuilder orderAddressEntity = OrderAddressEntity.builder();

        orderAddressEntity.oaIdx( orderAddress.getOaIdx() );
        orderAddressEntity.order( toOrderEntity( orderAddress.getOrder() ) );
        orderAddressEntity.oaName( orderAddress.getOaName() );
        orderAddressEntity.oaHp( orderAddress.getOaHp() );
        orderAddressEntity.oaZip( orderAddress.getOaZip() );
        orderAddressEntity.oaAddr( orderAddress.getOaAddr() );
        orderAddressEntity.oaAddrDetail( orderAddress.getOaAddrDetail() );
        orderAddressEntity.oaMemo( orderAddress.getOaMemo() );

        return orderAddressEntity.build();
    }

    @Override
    public OrderByAdvertiseEntity toOrderByAdvertiseEntity(OrderByAdvertise orderByAdvertise) {
        if ( orderByAdvertise == null ) {
            return null;
        }

        OrderByAdvertiseEntity.OrderByAdvertiseEntityBuilder orderByAdvertiseEntity = OrderByAdvertiseEntity.builder();

        orderByAdvertiseEntity.obaIdx( orderByAdvertise.getObaIdx() );
        orderByAdvertiseEntity.order( toOrderEntity( orderByAdvertise.getOrder() ) );
        orderByAdvertiseEntity.advertiseContent( advertiseContentToAdvertiseContentEntity( orderByAdvertise.getAdvertiseContent() ) );

        return orderByAdvertiseEntity.build();
    }

    @Override
    public OrderByMediaEntity toOrderByMediaEntity(OrderByMedia orderByMedia) {
        if ( orderByMedia == null ) {
            return null;
        }

        OrderByMediaEntity.OrderByMediaEntityBuilder orderByMediaEntity = OrderByMediaEntity.builder();

        orderByMediaEntity.obmIdx( orderByMedia.getObmIdx() );
        orderByMediaEntity.order( toOrderEntity( orderByMedia.getOrder() ) );
        orderByMediaEntity.media( mediaToMediaEntity( orderByMedia.getMedia() ) );

        return orderByMediaEntity.build();
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

    protected BankCodeDefine bankCodeDefineEntityToBankCodeDefine(BankCodeDefineEntity bankCodeDefineEntity) {
        if ( bankCodeDefineEntity == null ) {
            return null;
        }

        BankCodeDefine.BankCodeDefineBuilder<?, ?> bankCodeDefine = BankCodeDefine.builder();

        bankCodeDefine.baIdx( bankCodeDefineEntity.getBaIdx() );
        bankCodeDefine.baCode( bankCodeDefineEntity.getBaCode() );
        bankCodeDefine.baName( bankCodeDefineEntity.getBaName() );
        bankCodeDefine.isUsed( bankCodeDefineEntity.getIsUsed() );
        bankCodeDefine.baSeq( bankCodeDefineEntity.getBaSeq() );

        return bankCodeDefine.build();
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

    protected BankCodeDefineEntity bankCodeDefineToBankCodeDefineEntity(BankCodeDefine bankCodeDefine) {
        if ( bankCodeDefine == null ) {
            return null;
        }

        BankCodeDefineEntity.BankCodeDefineEntityBuilder bankCodeDefineEntity = BankCodeDefineEntity.builder();

        bankCodeDefineEntity.baIdx( bankCodeDefine.getBaIdx() );
        bankCodeDefineEntity.baCode( bankCodeDefine.getBaCode() );
        bankCodeDefineEntity.baName( bankCodeDefine.getBaName() );
        bankCodeDefineEntity.isUsed( bankCodeDefine.getIsUsed() );
        bankCodeDefineEntity.baSeq( bankCodeDefine.getBaSeq() );

        return bankCodeDefineEntity.build();
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

    protected AdvertiseContent advertiseContentEntityToAdvertiseContent(AdvertiseContentEntity advertiseContentEntity) {
        if ( advertiseContentEntity == null ) {
            return null;
        }

        AdvertiseContent.AdvertiseContentBuilder<?, ?> advertiseContent = AdvertiseContent.builder();

        advertiseContent.createdAt( advertiseContentEntity.getCreatedAt() );
        advertiseContent.updatedAt( advertiseContentEntity.getUpdatedAt() );
        advertiseContent.acIdx( advertiseContentEntity.getAcIdx() );
        advertiseContent.acUuid( advertiseContentEntity.getAcUuid() );
        advertiseContent.member( memberEntityToMember( advertiseContentEntity.getMember() ) );
        advertiseContent.item( itemEntityToItem( advertiseContentEntity.getItem() ) );
        advertiseContent.acAdmNo( advertiseContentEntity.getAcAdmNo() );
        advertiseContent.acIsPaid( advertiseContentEntity.getAcIsPaid() );
        advertiseContent.acPublishTax( advertiseContentEntity.getAcPublishTax() );
        advertiseContent.acIsUse( advertiseContentEntity.getAcIsUse() );
        advertiseContent.acAdmission( advertiseContentEntity.getAcAdmission() );
        advertiseContent.acStatus( advertiseContentEntity.getAcStatus() );
        advertiseContent.acPriceType( advertiseContentEntity.getAcPriceType() );
        advertiseContent.acPrice( advertiseContentEntity.getAcPrice() );
        advertiseContent.acPriceCount( advertiseContentEntity.getAcPriceCount() );
        advertiseContent.acWithoutPaid( advertiseContentEntity.getAcWithoutPaid() );
        advertiseContent.lpType( advertiseContentEntity.getLpType() );

        return advertiseContent.build();
    }

    protected PointDefineCodeEntity pointDefineCodeToPointDefineCodeEntity(PointDefineCode pointDefineCode) {
        if ( pointDefineCode == null ) {
            return null;
        }

        PointDefineCodeEntity.PointDefineCodeEntityBuilder pointDefineCodeEntity = PointDefineCodeEntity.builder();

        pointDefineCodeEntity.pdcIdx( pointDefineCode.getPdcIdx() );
        pointDefineCodeEntity.pdcCategory( pointDefineCode.getPdcCategory() );
        pointDefineCodeEntity.pdcCategoryKo( pointDefineCode.getPdcCategoryKo() );
        pointDefineCodeEntity.pdcJoin( pointDefineCode.getPdcJoin() );
        pointDefineCodeEntity.pdCode( pointDefineCode.getPdCode() );
        pointDefineCodeEntity.pdcApplicableProduct( pointDefineCode.getPdcApplicableProduct() );
        pointDefineCodeEntity.pdcName( pointDefineCode.getPdcName() );
        pointDefineCodeEntity.pdcReason( pointDefineCode.getPdcReason() );
        pointDefineCodeEntity.pdcIsDuplication( pointDefineCode.getPdcIsDuplication() );
        pointDefineCodeEntity.pdcIsFirst( pointDefineCode.getPdcIsFirst() );
        pointDefineCodeEntity.pdcMaxCnt( pointDefineCode.getPdcMaxCnt() );
        pointDefineCodeEntity.pdcMaxCntType( pointDefineCode.getPdcMaxCntType() );
        pointDefineCodeEntity.pdcStandardType( pointDefineCode.getPdcStandardType() );
        pointDefineCodeEntity.pdcApplicableProductEn( pointDefineCode.getPdcApplicableProductEn() );
        pointDefineCodeEntity.pdcNameEn( pointDefineCode.getPdcNameEn() );
        pointDefineCodeEntity.pdcUserReason( pointDefineCode.getPdcUserReason() );

        return pointDefineCodeEntity.build();
    }

    protected PointDefineEntity pointDefineToPointDefineEntity(PointDefine pointDefine) {
        if ( pointDefine == null ) {
            return null;
        }

        PointDefineEntity.PointDefineEntityBuilder pointDefineEntity = PointDefineEntity.builder();

        pointDefineEntity.pdIdx( pointDefine.getPdIdx() );
        pointDefineEntity.pdCategory( pointDefine.getPdCategory() );
        pointDefineEntity.pointCodeDefine( pointDefineCodeToPointDefineCodeEntity( pointDefine.getPointCodeDefine() ) );
        pointDefineEntity.pdReason( pointDefine.getPdReason() );
        pointDefineEntity.pdPoint( pointDefine.getPdPoint() );
        pointDefineEntity.pd1stStandard( pointDefine.getPd1stStandard() );
        pointDefineEntity.pd2ndStandard( pointDefine.getPd2ndStandard() );
        pointDefineEntity.pdIsUse( pointDefine.getPdIsUse() );
        pointDefineEntity.pdJoin( pointDefine.getPdJoin() );
        pointDefineEntity.pdStatus( pointDefine.getPdStatus() );
        pointDefineEntity.pdRegister( pointDefine.getPdRegister() );
        pointDefineEntity.pdPolicyStart( pointDefine.getPdPolicyStart() );
        pointDefineEntity.pdPolicyEnd( pointDefine.getPdPolicyEnd() );

        return pointDefineEntity.build();
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

    protected AdvertiseContentEntity advertiseContentToAdvertiseContentEntity(AdvertiseContent advertiseContent) {
        if ( advertiseContent == null ) {
            return null;
        }

        AdvertiseContentEntity.AdvertiseContentEntityBuilder advertiseContentEntity = AdvertiseContentEntity.builder();

        advertiseContentEntity.acIdx( advertiseContent.getAcIdx() );
        advertiseContentEntity.acUuid( advertiseContent.getAcUuid() );
        advertiseContentEntity.member( memberToMemberEntity( advertiseContent.getMember() ) );
        advertiseContentEntity.item( itemToItemEntity( advertiseContent.getItem() ) );
        advertiseContentEntity.acAdmNo( advertiseContent.getAcAdmNo() );
        advertiseContentEntity.acIsPaid( advertiseContent.getAcIsPaid() );
        advertiseContentEntity.acPublishTax( advertiseContent.getAcPublishTax() );
        advertiseContentEntity.acIsUse( advertiseContent.getAcIsUse() );
        advertiseContentEntity.acAdmission( advertiseContent.getAcAdmission() );
        advertiseContentEntity.acStatus( advertiseContent.getAcStatus() );
        advertiseContentEntity.acPriceType( advertiseContent.getAcPriceType() );
        advertiseContentEntity.acPrice( advertiseContent.getAcPrice() );
        advertiseContentEntity.acPriceCount( advertiseContent.getAcPriceCount() );
        advertiseContentEntity.acWithoutPaid( advertiseContent.getAcWithoutPaid() );
        advertiseContentEntity.lpType( advertiseContent.getLpType() );

        return advertiseContentEntity.build();
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
}
