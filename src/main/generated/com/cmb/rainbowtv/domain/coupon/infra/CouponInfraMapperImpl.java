package com.cmb.rainbowtv.domain.coupon.infra;

import com.cmb.rainbowtv.domain.coupon.infra.data.entity.CouponByItemEntity;
import com.cmb.rainbowtv.domain.coupon.infra.data.entity.CouponByMemberSegmentEntity;
import com.cmb.rainbowtv.domain.coupon.infra.data.entity.CouponEntity;
import com.cmb.rainbowtv.domain.coupon.infra.data.entity.MemberByCouponEntity;
import com.cmb.rainbowtv.domain.coupon.infra.data.entity.MemberByCouponHistoryEntity;
import com.cmb.rainbowtv.domain.coupon.model.Coupon;
import com.cmb.rainbowtv.domain.coupon.model.CouponByItem;
import com.cmb.rainbowtv.domain.coupon.model.CouponByMemberSegment;
import com.cmb.rainbowtv.domain.coupon.model.MemberByCoupon;
import com.cmb.rainbowtv.domain.coupon.model.MemberByCouponHistory;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaCategoryEntity;
import com.cmb.rainbowtv.domain.media.model.MediaCategory;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemEntity;
import com.cmb.rainbowtv.domain.product.model.Item;
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
public class CouponInfraMapperImpl implements CouponInfraMapper {

    @Override
    public CouponEntity toEntity(Coupon coupon) {
        if ( coupon == null ) {
            return null;
        }

        CouponEntity.CouponEntityBuilder couponEntity = CouponEntity.builder();

        couponEntity.coIdx( coupon.getCoIdx() );
        couponEntity.coType( coupon.getCoType() );
        couponEntity.coTitle( coupon.getCoTitle() );
        couponEntity.member( memberToMemberEntity( coupon.getMember() ) );
        couponEntity.coSaleType( coupon.getCoSaleType() );
        couponEntity.coSaleNumber( coupon.getCoSaleNumber() );
        couponEntity.coSaleMax( coupon.getCoSaleMax() );
        couponEntity.coHaveCriteria( coupon.getCoHaveCriteria() );
        couponEntity.coCriteria( coupon.getCoCriteria() );
        couponEntity.coSubCriteria( coupon.getCoSubCriteria() );
        couponEntity.coNthTime( coupon.getCoNthTime() );
        couponEntity.coCouponSt( coupon.getCoCouponSt() );
        couponEntity.coCouponEd( coupon.getCoCouponEd() );
        couponEntity.coSendNow( coupon.getCoSendNow() );
        couponEntity.coScheduleTime( coupon.getCoScheduleTime() );
        couponEntity.coSendAlarm( coupon.getCoSendAlarm() );
        couponEntity.coSendPush( coupon.getCoSendPush() );
        couponEntity.coUse( coupon.getCoUse() );
        couponEntity.coDeleteNo( coupon.getCoDeleteNo() );
        couponEntity.isType( coupon.getIsType() );
        couponEntity.coStatus( coupon.getCoStatus() );
        couponEntity.mediaCategory( mediaCategoryToMediaCategoryEntity( coupon.getMediaCategory() ) );

        return couponEntity.build();
    }

    @Override
    public Coupon toModel(CouponEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Coupon.CouponBuilder<?, ?> coupon = Coupon.builder();

        coupon.createdAt( entity.getCreatedAt() );
        coupon.updatedAt( entity.getUpdatedAt() );
        coupon.coIdx( entity.getCoIdx() );
        coupon.coType( entity.getCoType() );
        coupon.coTitle( entity.getCoTitle() );
        coupon.member( memberEntityToMember( entity.getMember() ) );
        coupon.coSaleType( entity.getCoSaleType() );
        coupon.coSaleNumber( entity.getCoSaleNumber() );
        coupon.coSaleMax( entity.getCoSaleMax() );
        coupon.coHaveCriteria( entity.getCoHaveCriteria() );
        coupon.coCriteria( entity.getCoCriteria() );
        coupon.coSubCriteria( entity.getCoSubCriteria() );
        coupon.coNthTime( entity.getCoNthTime() );
        coupon.coCouponSt( entity.getCoCouponSt() );
        coupon.coCouponEd( entity.getCoCouponEd() );
        coupon.coSendNow( entity.getCoSendNow() );
        coupon.coScheduleTime( entity.getCoScheduleTime() );
        coupon.coSendAlarm( entity.getCoSendAlarm() );
        coupon.coSendPush( entity.getCoSendPush() );
        coupon.coUse( entity.getCoUse() );
        coupon.coDeleteNo( entity.getCoDeleteNo() );
        coupon.isType( entity.getIsType() );
        coupon.coStatus( entity.getCoStatus() );
        coupon.mediaCategory( mediaCategoryEntityToMediaCategory( entity.getMediaCategory() ) );

        return coupon.build();
    }

    @Override
    public CouponByItemEntity toEntity(CouponByItem item) {
        if ( item == null ) {
            return null;
        }

        CouponByItemEntity.CouponByItemEntityBuilder couponByItemEntity = CouponByItemEntity.builder();

        couponByItemEntity.cbiIdx( item.getCbiIdx() );
        couponByItemEntity.coupon( toEntity( item.getCoupon() ) );
        couponByItemEntity.item( itemToItemEntity( item.getItem() ) );

        return couponByItemEntity.build();
    }

    @Override
    public CouponByMemberSegmentEntity toEntity(CouponByMemberSegment segment) {
        if ( segment == null ) {
            return null;
        }

        CouponByMemberSegmentEntity.CouponByMemberSegmentEntityBuilder couponByMemberSegmentEntity = CouponByMemberSegmentEntity.builder();

        couponByMemberSegmentEntity.cbmsIdx( segment.getCbmsIdx() );
        couponByMemberSegmentEntity.coupon( toEntity( segment.getCoupon() ) );
        couponByMemberSegmentEntity.csIdx( segment.getCsIdx() );

        return couponByMemberSegmentEntity.build();
    }

    @Override
    public MemberByCouponEntity toEntity(MemberByCoupon memberByCoupon) {
        if ( memberByCoupon == null ) {
            return null;
        }

        MemberByCouponEntity.MemberByCouponEntityBuilder memberByCouponEntity = MemberByCouponEntity.builder();

        memberByCouponEntity.mbcIdx( memberByCoupon.getMbcIdx() );
        memberByCouponEntity.member( memberToMemberEntity1( memberByCoupon.getMember() ) );
        memberByCouponEntity.coupon( toEntity( memberByCoupon.getCoupon() ) );
        memberByCouponEntity.mbcStatus( memberByCoupon.getMbcStatus() );

        return memberByCouponEntity.build();
    }

    @Override
    public List<CouponByItemEntity> toCouponByItemEntityList(List<CouponByItem> couponByItemList) {
        if ( couponByItemList == null ) {
            return null;
        }

        List<CouponByItemEntity> list = new ArrayList<CouponByItemEntity>( couponByItemList.size() );
        for ( CouponByItem couponByItem : couponByItemList ) {
            list.add( toEntity( couponByItem ) );
        }

        return list;
    }

    @Override
    public List<CouponByItem> toCouponByItemList(List<CouponByItemEntity> couponByItemListEntity) {
        if ( couponByItemListEntity == null ) {
            return null;
        }

        List<CouponByItem> list = new ArrayList<CouponByItem>( couponByItemListEntity.size() );
        for ( CouponByItemEntity couponByItemEntity : couponByItemListEntity ) {
            list.add( couponByItemEntityToCouponByItem( couponByItemEntity ) );
        }

        return list;
    }

    @Override
    public List<CouponByMemberSegmentEntity> toCouponByMemberSegmentEntityList(List<CouponByMemberSegment> couponByMemberSegmentList) {
        if ( couponByMemberSegmentList == null ) {
            return null;
        }

        List<CouponByMemberSegmentEntity> list = new ArrayList<CouponByMemberSegmentEntity>( couponByMemberSegmentList.size() );
        for ( CouponByMemberSegment couponByMemberSegment : couponByMemberSegmentList ) {
            list.add( toEntity( couponByMemberSegment ) );
        }

        return list;
    }

    @Override
    public List<MemberByCouponEntity> toMemberByCouponEntityList(List<MemberByCoupon> list) {
        if ( list == null ) {
            return null;
        }

        List<MemberByCouponEntity> list1 = new ArrayList<MemberByCouponEntity>( list.size() );
        for ( MemberByCoupon memberByCoupon : list ) {
            list1.add( toEntity( memberByCoupon ) );
        }

        return list1;
    }

    @Override
    public List<MemberByCoupon> toMemberByCouponList(List<MemberByCouponEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<MemberByCoupon> list1 = new ArrayList<MemberByCoupon>( list.size() );
        for ( MemberByCouponEntity memberByCouponEntity : list ) {
            list1.add( toMemberByCouponModel( memberByCouponEntity ) );
        }

        return list1;
    }

    @Override
    public MemberByCoupon toMemberByCouponModel(MemberByCouponEntity firstByCouponCoIdx) {
        if ( firstByCouponCoIdx == null ) {
            return null;
        }

        MemberByCoupon.MemberByCouponBuilder<?, ?> memberByCoupon = MemberByCoupon.builder();

        memberByCoupon.createdAt( firstByCouponCoIdx.getCreatedAt() );
        memberByCoupon.updatedAt( firstByCouponCoIdx.getUpdatedAt() );
        memberByCoupon.mbcIdx( firstByCouponCoIdx.getMbcIdx() );
        memberByCoupon.member( memberEntityToMember1( firstByCouponCoIdx.getMember() ) );
        memberByCoupon.coupon( toModel( firstByCouponCoIdx.getCoupon() ) );
        memberByCoupon.mbcStatus( firstByCouponCoIdx.getMbcStatus() );

        return memberByCoupon.build();
    }

    @Override
    public List<CouponByMemberSegment> toCouponByMemberSegmentList(List<CouponByMemberSegmentEntity> couponByMemberSegmentListEntity) {
        if ( couponByMemberSegmentListEntity == null ) {
            return null;
        }

        List<CouponByMemberSegment> list = new ArrayList<CouponByMemberSegment>( couponByMemberSegmentListEntity.size() );
        for ( CouponByMemberSegmentEntity couponByMemberSegmentEntity : couponByMemberSegmentListEntity ) {
            list.add( couponByMemberSegmentEntityToCouponByMemberSegment( couponByMemberSegmentEntity ) );
        }

        return list;
    }

    @Override
    public MemberByCouponHistory toMemberByCouponHistoryModel(MemberByCouponHistoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MemberByCouponHistory.MemberByCouponHistoryBuilder<?, ?> memberByCouponHistory = MemberByCouponHistory.builder();

        memberByCouponHistory.createdAt( entity.getCreatedAt() );
        memberByCouponHistory.updatedAt( entity.getUpdatedAt() );
        memberByCouponHistory.mbchIdx( entity.getMbchIdx() );
        memberByCouponHistory.memberByCoupon( memberByCouponEntityToMemberByCoupon( entity.getMemberByCoupon() ) );
        memberByCouponHistory.cartIdx( entity.getCartIdx() );
        memberByCouponHistory.mbchPrice( entity.getMbchPrice() );

        return memberByCouponHistory.build();
    }

    @Override
    public List<MemberByCouponHistory> toMemberByCouponHistoryList(List<MemberByCouponHistoryEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MemberByCouponHistory> list = new ArrayList<MemberByCouponHistory>( entities.size() );
        for ( MemberByCouponHistoryEntity memberByCouponHistoryEntity : entities ) {
            list.add( toMemberByCouponHistoryModel( memberByCouponHistoryEntity ) );
        }

        return list;
    }

    @Override
    public MemberByCouponHistoryEntity toMemberByCouponHistoryEntity(MemberByCouponHistory model) {
        if ( model == null ) {
            return null;
        }

        MemberByCouponHistoryEntity.MemberByCouponHistoryEntityBuilder memberByCouponHistoryEntity = MemberByCouponHistoryEntity.builder();

        memberByCouponHistoryEntity.mbchIdx( model.getMbchIdx() );
        memberByCouponHistoryEntity.memberByCoupon( toEntity( model.getMemberByCoupon() ) );
        memberByCouponHistoryEntity.cartIdx( model.getCartIdx() );
        memberByCouponHistoryEntity.mbchPrice( model.getMbchPrice() );

        return memberByCouponHistoryEntity.build();
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

    protected MemberEntity memberToMemberEntity1(Member member) {
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

    protected CouponByItem couponByItemEntityToCouponByItem(CouponByItemEntity couponByItemEntity) {
        if ( couponByItemEntity == null ) {
            return null;
        }

        CouponByItem.CouponByItemBuilder<?, ?> couponByItem = CouponByItem.builder();

        couponByItem.createdAt( couponByItemEntity.getCreatedAt() );
        couponByItem.updatedAt( couponByItemEntity.getUpdatedAt() );
        couponByItem.cbiIdx( couponByItemEntity.getCbiIdx() );
        couponByItem.coupon( toModel( couponByItemEntity.getCoupon() ) );
        couponByItem.item( itemEntityToItem( couponByItemEntity.getItem() ) );

        return couponByItem.build();
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

    protected Member memberEntityToMember1(MemberEntity memberEntity) {
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

    protected CouponByMemberSegment couponByMemberSegmentEntityToCouponByMemberSegment(CouponByMemberSegmentEntity couponByMemberSegmentEntity) {
        if ( couponByMemberSegmentEntity == null ) {
            return null;
        }

        CouponByMemberSegment.CouponByMemberSegmentBuilder<?, ?> couponByMemberSegment = CouponByMemberSegment.builder();

        couponByMemberSegment.createdAt( couponByMemberSegmentEntity.getCreatedAt() );
        couponByMemberSegment.updatedAt( couponByMemberSegmentEntity.getUpdatedAt() );
        couponByMemberSegment.cbmsIdx( couponByMemberSegmentEntity.getCbmsIdx() );
        couponByMemberSegment.coupon( toModel( couponByMemberSegmentEntity.getCoupon() ) );
        couponByMemberSegment.csIdx( couponByMemberSegmentEntity.getCsIdx() );

        return couponByMemberSegment.build();
    }

    protected Member memberEntityToMember2(MemberEntity memberEntity) {
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

    protected Member memberEntityToMember3(MemberEntity memberEntity) {
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

    protected Coupon couponEntityToCoupon(CouponEntity couponEntity) {
        if ( couponEntity == null ) {
            return null;
        }

        Coupon.CouponBuilder<?, ?> coupon = Coupon.builder();

        coupon.createdAt( couponEntity.getCreatedAt() );
        coupon.updatedAt( couponEntity.getUpdatedAt() );
        coupon.coIdx( couponEntity.getCoIdx() );
        coupon.coType( couponEntity.getCoType() );
        coupon.coTitle( couponEntity.getCoTitle() );
        coupon.member( memberEntityToMember3( couponEntity.getMember() ) );
        coupon.coSaleType( couponEntity.getCoSaleType() );
        coupon.coSaleNumber( couponEntity.getCoSaleNumber() );
        coupon.coSaleMax( couponEntity.getCoSaleMax() );
        coupon.coHaveCriteria( couponEntity.getCoHaveCriteria() );
        coupon.coCriteria( couponEntity.getCoCriteria() );
        coupon.coSubCriteria( couponEntity.getCoSubCriteria() );
        coupon.coNthTime( couponEntity.getCoNthTime() );
        coupon.coCouponSt( couponEntity.getCoCouponSt() );
        coupon.coCouponEd( couponEntity.getCoCouponEd() );
        coupon.coSendNow( couponEntity.getCoSendNow() );
        coupon.coScheduleTime( couponEntity.getCoScheduleTime() );
        coupon.coSendAlarm( couponEntity.getCoSendAlarm() );
        coupon.coSendPush( couponEntity.getCoSendPush() );
        coupon.coUse( couponEntity.getCoUse() );
        coupon.coDeleteNo( couponEntity.getCoDeleteNo() );
        coupon.isType( couponEntity.getIsType() );
        coupon.coStatus( couponEntity.getCoStatus() );
        coupon.mediaCategory( mediaCategoryEntityToMediaCategory( couponEntity.getMediaCategory() ) );

        return coupon.build();
    }

    protected MemberByCoupon memberByCouponEntityToMemberByCoupon(MemberByCouponEntity memberByCouponEntity) {
        if ( memberByCouponEntity == null ) {
            return null;
        }

        MemberByCoupon.MemberByCouponBuilder<?, ?> memberByCoupon = MemberByCoupon.builder();

        memberByCoupon.createdAt( memberByCouponEntity.getCreatedAt() );
        memberByCoupon.updatedAt( memberByCouponEntity.getUpdatedAt() );
        memberByCoupon.mbcIdx( memberByCouponEntity.getMbcIdx() );
        memberByCoupon.member( memberEntityToMember2( memberByCouponEntity.getMember() ) );
        memberByCoupon.coupon( couponEntityToCoupon( memberByCouponEntity.getCoupon() ) );
        memberByCoupon.mbcStatus( memberByCouponEntity.getMbcStatus() );

        return memberByCoupon.build();
    }
}
