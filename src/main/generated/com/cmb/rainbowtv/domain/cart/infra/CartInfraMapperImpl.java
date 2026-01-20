package com.cmb.rainbowtv.domain.cart.infra;

import com.cmb.rainbowtv.domain.cart.infra.data.entity.CartEntity;
import com.cmb.rainbowtv.domain.cart.infra.data.entity.CartExpressEntity;
import com.cmb.rainbowtv.domain.cart.model.Cart;
import com.cmb.rainbowtv.domain.cart.model.CartExpress;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemEntity;
import com.cmb.rainbowtv.domain.product.model.Item;
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
    date = "2026-01-19T18:53:48+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CartInfraMapperImpl implements CartInfraMapper {

    @Override
    public Cart toCart(CartEntity cartEntity) {
        if ( cartEntity == null ) {
            return null;
        }

        Cart.CartBuilder<?, ?> cart = Cart.builder();

        cart.createdAt( cartEntity.getCreatedAt() );
        cart.updatedAt( cartEntity.getUpdatedAt() );
        cart.caIdx( cartEntity.getCaIdx() );
        cart.ordId( cartEntity.getOrdId() );
        cart.caType( cartEntity.getCaType() );
        cart.member( memberEntityToMember( cartEntity.getMember() ) );
        cart.item( itemEntityToItem( cartEntity.getItem() ) );
        cart.caName( cartEntity.getCaName() );
        cart.caStatus( cartEntity.getCaStatus() );
        cart.caRefundPrice( cartEntity.getCaRefundPrice() );
        cart.caPrice( cartEntity.getCaPrice() );
        cart.caQty( cartEntity.getCaQty() );
        cart.caSendCost( cartEntity.getCaSendCost() );
        cart.caHistory( cartEntity.getCaHistory() );
        cart.caSalePrice( cartEntity.getCaSalePrice() );

        return cart.build();
    }

    @Override
    public CartEntity toCartEntity(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        CartEntity.CartEntityBuilder cartEntity = CartEntity.builder();

        cartEntity.caIdx( cart.getCaIdx() );
        cartEntity.ordId( cart.getOrdId() );
        cartEntity.caType( cart.getCaType() );
        cartEntity.member( memberToMemberEntity( cart.getMember() ) );
        cartEntity.item( itemToItemEntity( cart.getItem() ) );
        cartEntity.caName( cart.getCaName() );
        cartEntity.caStatus( cart.getCaStatus() );
        cartEntity.caRefundPrice( cart.getCaRefundPrice() );
        cartEntity.caPrice( cart.getCaPrice() );
        cartEntity.caQty( cart.getCaQty() );
        cartEntity.caSendCost( cart.getCaSendCost() );
        cartEntity.caHistory( cart.getCaHistory() );
        cartEntity.caSalePrice( cart.getCaSalePrice() );

        return cartEntity.build();
    }

    @Override
    public List<CartExpress> toCartExpressList(List<CartExpressEntity> allByCartOrdId) {
        if ( allByCartOrdId == null ) {
            return null;
        }

        List<CartExpress> list = new ArrayList<CartExpress>( allByCartOrdId.size() );
        for ( CartExpressEntity cartExpressEntity : allByCartOrdId ) {
            list.add( toCartExpress( cartExpressEntity ) );
        }

        return list;
    }

    @Override
    public CartExpressEntity toCartExpressEntity(CartExpress cartExpress) {
        if ( cartExpress == null ) {
            return null;
        }

        CartExpressEntity.CartExpressEntityBuilder cartExpressEntity = CartExpressEntity.builder();

        cartExpressEntity.ceIdx( cartExpress.getCeIdx() );
        cartExpressEntity.cart( toCartEntity( cartExpress.getCart() ) );
        cartExpressEntity.ceUuid( cartExpress.getCeUuid() );
        cartExpressEntity.expressDefine( expressDefineToExpressDefineEntity( cartExpress.getExpressDefine() ) );
        cartExpressEntity.ceDeliveryCompany( cartExpress.getCeDeliveryCompany() );
        cartExpressEntity.ceInvoice( cartExpress.getCeInvoice() );
        cartExpressEntity.ceInvoiceReadyTime( cartExpress.getCeInvoiceReadyTime() );
        cartExpressEntity.ceInvoiceTime( cartExpress.getCeInvoiceTime() );
        cartExpressEntity.ceInvoiceEndTime( cartExpress.getCeInvoiceEndTime() );

        return cartExpressEntity.build();
    }

    @Override
    public CartExpress toCartExpress(CartExpressEntity cartExpressEntity) {
        if ( cartExpressEntity == null ) {
            return null;
        }

        CartExpress.CartExpressBuilder<?, ?> cartExpress = CartExpress.builder();

        cartExpress.createdAt( cartExpressEntity.getCreatedAt() );
        cartExpress.updatedAt( cartExpressEntity.getUpdatedAt() );
        cartExpress.ceIdx( cartExpressEntity.getCeIdx() );
        cartExpress.cart( toCart( cartExpressEntity.getCart() ) );
        cartExpress.ceUuid( cartExpressEntity.getCeUuid() );
        cartExpress.expressDefine( expressDefineEntityToExpressDefine( cartExpressEntity.getExpressDefine() ) );
        cartExpress.ceDeliveryCompany( cartExpressEntity.getCeDeliveryCompany() );
        cartExpress.ceInvoice( cartExpressEntity.getCeInvoice() );
        cartExpress.ceInvoiceReadyTime( cartExpressEntity.getCeInvoiceReadyTime() );
        cartExpress.ceInvoiceTime( cartExpressEntity.getCeInvoiceTime() );
        cartExpress.ceInvoiceEndTime( cartExpressEntity.getCeInvoiceEndTime() );

        return cartExpress.build();
    }

    @Override
    public List<Cart> toCartList(List<CartEntity> cartList) {
        if ( cartList == null ) {
            return null;
        }

        List<Cart> list = new ArrayList<Cart>( cartList.size() );
        for ( CartEntity cartEntity : cartList ) {
            list.add( toCart( cartEntity ) );
        }

        return list;
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
