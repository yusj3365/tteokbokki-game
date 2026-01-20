package com.cmb.rainbowtv.domain.subscription.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelBundleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelBundle;
import com.cmb.rainbowtv.domain.coupon.infra.data.entity.CouponEntity;
import com.cmb.rainbowtv.domain.coupon.infra.data.entity.MemberByCouponEntity;
import com.cmb.rainbowtv.domain.coupon.model.Coupon;
import com.cmb.rainbowtv.domain.coupon.model.MemberByCoupon;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaCategoryEntity;
import com.cmb.rainbowtv.domain.media.model.MediaCategory;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemByBundleEntity;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemEntity;
import com.cmb.rainbowtv.domain.product.model.Item;
import com.cmb.rainbowtv.domain.product.model.ItemByBundle;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionEntity;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionNoticeCategoryEntity;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionNoticeConfirmEntity;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionNoticeEntity;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionTermsByChannelEntity;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionTermsByItemEntity;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionTermsEntity;
import com.cmb.rainbowtv.domain.subscription.infra.data.entity.SubscriptionTermsPayLogEntity;
import com.cmb.rainbowtv.domain.subscription.model.Subscription;
import com.cmb.rainbowtv.domain.subscription.model.SubscriptionNotice;
import com.cmb.rainbowtv.domain.subscription.model.SubscriptionNoticeCategory;
import com.cmb.rainbowtv.domain.subscription.model.SubscriptionNoticeConfirm;
import com.cmb.rainbowtv.domain.subscription.model.SubscriptionTerms;
import com.cmb.rainbowtv.domain.subscription.model.SubscriptionTermsByChannel;
import com.cmb.rainbowtv.domain.subscription.model.SubscriptionTermsByItem;
import com.cmb.rainbowtv.domain.subscription.model.SubscriptionTermsPayLog;
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
public class SubscriptionInfraMapperImpl implements SubscriptionInfraMapper {

    @Override
    public Subscription toSubscription(SubscriptionEntity subscriptionEntity) {
        if ( subscriptionEntity == null ) {
            return null;
        }

        Subscription.SubscriptionBuilder<?, ?> subscription = Subscription.builder();

        subscription.createdAt( subscriptionEntity.getCreatedAt() );
        subscription.updatedAt( subscriptionEntity.getUpdatedAt() );
        subscription.suIdx( subscriptionEntity.getSuIdx() );
        subscription.member( memberEntityToMember( subscriptionEntity.getMember() ) );
        subscription.subscriptionType( subscriptionEntity.getSubscriptionType() );
        subscription.suStatus( subscriptionEntity.getSuStatus() );
        subscription.suWillCancel( subscriptionEntity.getSuWillCancel() );
        subscription.suCycleType( subscriptionEntity.getSuCycleType() );
        subscription.suCycleDay( subscriptionEntity.getSuCycleDay() );
        subscription.suSubject( subscriptionEntity.getSuSubject() );
        subscription.suUuid( subscriptionEntity.getSuUuid() );
        subscription.isVn( subscriptionEntity.getIsVn() );

        return subscription.build();
    }

    @Override
    public List<Subscription> toSubscriptionList(List<SubscriptionEntity> subscriptionEntityList) {
        if ( subscriptionEntityList == null ) {
            return null;
        }

        List<Subscription> list = new ArrayList<Subscription>( subscriptionEntityList.size() );
        for ( SubscriptionEntity subscriptionEntity : subscriptionEntityList ) {
            list.add( toSubscription( subscriptionEntity ) );
        }

        return list;
    }

    @Override
    public SubscriptionEntity toSubscriptionEntity(Subscription subscription) {
        if ( subscription == null ) {
            return null;
        }

        SubscriptionEntity.SubscriptionEntityBuilder subscriptionEntity = SubscriptionEntity.builder();

        subscriptionEntity.suIdx( subscription.getSuIdx() );
        subscriptionEntity.member( memberToMemberEntity( subscription.getMember() ) );
        subscriptionEntity.subscriptionType( subscription.getSubscriptionType() );
        subscriptionEntity.suStatus( subscription.getSuStatus() );
        subscriptionEntity.suWillCancel( subscription.getSuWillCancel() );
        subscriptionEntity.suCycleType( subscription.getSuCycleType() );
        subscriptionEntity.suCycleDay( subscription.getSuCycleDay() );
        subscriptionEntity.suSubject( subscription.getSuSubject() );
        subscriptionEntity.suUuid( subscription.getSuUuid() );
        subscriptionEntity.isVn( subscription.getIsVn() );

        return subscriptionEntity.build();
    }

    @Override
    public List<SubscriptionTerms> toSubscriptionTermsList(List<SubscriptionTermsEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SubscriptionTerms> list = new ArrayList<SubscriptionTerms>( entityList.size() );
        for ( SubscriptionTermsEntity subscriptionTermsEntity : entityList ) {
            list.add( toSubscriptionTerms( subscriptionTermsEntity ) );
        }

        return list;
    }

    @Override
    public SubscriptionTerms toSubscriptionTerms(SubscriptionTermsEntity subscriptionTermsEntity) {
        if ( subscriptionTermsEntity == null ) {
            return null;
        }

        SubscriptionTerms.SubscriptionTermsBuilder<?, ?> subscriptionTerms = SubscriptionTerms.builder();

        subscriptionTerms.createdAt( subscriptionTermsEntity.getCreatedAt() );
        subscriptionTerms.updatedAt( subscriptionTermsEntity.getUpdatedAt() );
        subscriptionTerms.stIdx( subscriptionTermsEntity.getStIdx() );
        subscriptionTerms.subscription( toSubscription( subscriptionTermsEntity.getSubscription() ) );
        subscriptionTerms.ordId( subscriptionTermsEntity.getOrdId() );
        subscriptionTerms.stUuid( subscriptionTermsEntity.getStUuid() );
        subscriptionTerms.stTerm( subscriptionTermsEntity.getStTerm() );
        subscriptionTerms.stStatus( subscriptionTermsEntity.getStStatus() );
        subscriptionTerms.stSubscribeDate( subscriptionTermsEntity.getStSubscribeDate() );
        subscriptionTerms.stShippingDate( subscriptionTermsEntity.getStShippingDate() );
        subscriptionTerms.stTrial( subscriptionTermsEntity.getStTrial() );
        subscriptionTerms.memberByCoupon( memberByCouponEntityToMemberByCoupon( subscriptionTermsEntity.getMemberByCoupon() ) );

        return subscriptionTerms.build();
    }

    @Override
    public SubscriptionTermsEntity toSubscriptionTermsEntity(SubscriptionTerms subscriptionTerms) {
        if ( subscriptionTerms == null ) {
            return null;
        }

        SubscriptionTermsEntity.SubscriptionTermsEntityBuilder subscriptionTermsEntity = SubscriptionTermsEntity.builder();

        subscriptionTermsEntity.stIdx( subscriptionTerms.getStIdx() );
        subscriptionTermsEntity.subscription( toSubscriptionEntity( subscriptionTerms.getSubscription() ) );
        subscriptionTermsEntity.ordId( subscriptionTerms.getOrdId() );
        subscriptionTermsEntity.stUuid( subscriptionTerms.getStUuid() );
        subscriptionTermsEntity.stTerm( subscriptionTerms.getStTerm() );
        subscriptionTermsEntity.stStatus( subscriptionTerms.getStStatus() );
        subscriptionTermsEntity.stSubscribeDate( subscriptionTerms.getStSubscribeDate() );
        subscriptionTermsEntity.stShippingDate( subscriptionTerms.getStShippingDate() );
        subscriptionTermsEntity.stTrial( subscriptionTerms.getStTrial() );
        subscriptionTermsEntity.memberByCoupon( memberByCouponToMemberByCouponEntity( subscriptionTerms.getMemberByCoupon() ) );

        return subscriptionTermsEntity.build();
    }

    @Override
    public SubscriptionNoticeCategory toSubscriptionNoticeCategory(SubscriptionNoticeCategoryEntity subscriptionNoticeCategoryEntity) {
        if ( subscriptionNoticeCategoryEntity == null ) {
            return null;
        }

        SubscriptionNoticeCategory.SubscriptionNoticeCategoryBuilder<?, ?> subscriptionNoticeCategory = SubscriptionNoticeCategory.builder();

        subscriptionNoticeCategory.createdAt( subscriptionNoticeCategoryEntity.getCreatedAt() );
        subscriptionNoticeCategory.updatedAt( subscriptionNoticeCategoryEntity.getUpdatedAt() );
        subscriptionNoticeCategory.sncIdx( subscriptionNoticeCategoryEntity.getSncIdx() );
        subscriptionNoticeCategory.sncType( subscriptionNoticeCategoryEntity.getSncType() );
        subscriptionNoticeCategory.sncName( subscriptionNoticeCategoryEntity.getSncName() );

        return subscriptionNoticeCategory.build();
    }

    @Override
    public SubscriptionNoticeEntity toSubscriptionNoticeEntity(SubscriptionNotice subscriptionNotice) {
        if ( subscriptionNotice == null ) {
            return null;
        }

        SubscriptionNoticeEntity.SubscriptionNoticeEntityBuilder subscriptionNoticeEntity = SubscriptionNoticeEntity.builder();

        subscriptionNoticeEntity.snIdx( subscriptionNotice.getSnIdx() );
        subscriptionNoticeEntity.member( memberToMemberEntity( subscriptionNotice.getMember() ) );
        subscriptionNoticeEntity.subscriptionNoticeType( subscriptionNotice.getSubscriptionNoticeType() );
        subscriptionNoticeEntity.item( itemToItemEntity( subscriptionNotice.getItem() ) );
        subscriptionNoticeEntity.subscriptionNoticeCategory( subscriptionNoticeCategoryToSubscriptionNoticeCategoryEntity( subscriptionNotice.getSubscriptionNoticeCategory() ) );
        subscriptionNoticeEntity.snPrice( subscriptionNotice.getSnPrice() );
        subscriptionNoticeEntity.snContext( subscriptionNotice.getSnContext() );
        subscriptionNoticeEntity.snChangeDate( subscriptionNotice.getSnChangeDate() );
        subscriptionNoticeEntity.snStartDate( subscriptionNotice.getSnStartDate() );
        subscriptionNoticeEntity.snEndDate( subscriptionNotice.getSnEndDate() );
        subscriptionNoticeEntity.snEnd( subscriptionNotice.getSnEnd() );

        return subscriptionNoticeEntity.build();
    }

    @Override
    public SubscriptionNotice toSubscriptionNotice(SubscriptionNoticeEntity save) {
        if ( save == null ) {
            return null;
        }

        SubscriptionNotice.SubscriptionNoticeBuilder<?, ?> subscriptionNotice = SubscriptionNotice.builder();

        subscriptionNotice.createdAt( save.getCreatedAt() );
        subscriptionNotice.updatedAt( save.getUpdatedAt() );
        subscriptionNotice.snIdx( save.getSnIdx() );
        subscriptionNotice.member( memberEntityToMember( save.getMember() ) );
        subscriptionNotice.subscriptionNoticeType( save.getSubscriptionNoticeType() );
        subscriptionNotice.item( itemEntityToItem( save.getItem() ) );
        subscriptionNotice.subscriptionNoticeCategory( toSubscriptionNoticeCategory( save.getSubscriptionNoticeCategory() ) );
        subscriptionNotice.snPrice( save.getSnPrice() );
        subscriptionNotice.snContext( save.getSnContext() );
        subscriptionNotice.snChangeDate( save.getSnChangeDate() );
        subscriptionNotice.snStartDate( save.getSnStartDate() );
        subscriptionNotice.snEndDate( save.getSnEndDate() );
        subscriptionNotice.snEnd( save.getSnEnd() );

        return subscriptionNotice.build();
    }

    @Override
    public SubscriptionTermsByItem toSubscriptionTermsByItem(SubscriptionTermsByItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SubscriptionTermsByItem.SubscriptionTermsByItemBuilder<?, ?> subscriptionTermsByItem = SubscriptionTermsByItem.builder();

        subscriptionTermsByItem.createdAt( entity.getCreatedAt() );
        subscriptionTermsByItem.updatedAt( entity.getUpdatedAt() );
        subscriptionTermsByItem.stbiIdx( entity.getStbiIdx() );
        subscriptionTermsByItem.subscriptionTerms( toSubscriptionTerms( entity.getSubscriptionTerms() ) );
        subscriptionTermsByItem.item( itemEntityToItem( entity.getItem() ) );
        subscriptionTermsByItem.stbiQty( entity.getStbiQty() );

        return subscriptionTermsByItem.build();
    }

    @Override
    public SubscriptionTermsByItemEntity toSubscriptionTermsByItemEntity(SubscriptionTermsByItem model) {
        if ( model == null ) {
            return null;
        }

        SubscriptionTermsByItemEntity.SubscriptionTermsByItemEntityBuilder subscriptionTermsByItemEntity = SubscriptionTermsByItemEntity.builder();

        subscriptionTermsByItemEntity.stbiIdx( model.getStbiIdx() );
        subscriptionTermsByItemEntity.subscriptionTerms( toSubscriptionTermsEntity( model.getSubscriptionTerms() ) );
        subscriptionTermsByItemEntity.item( itemToItemEntity( model.getItem() ) );
        subscriptionTermsByItemEntity.stbiQty( model.getStbiQty() );

        return subscriptionTermsByItemEntity.build();
    }

    @Override
    public SubscriptionTermsByChannelEntity toSubscriptionTermsByChannelEntity(SubscriptionTermsByChannel model) {
        if ( model == null ) {
            return null;
        }

        SubscriptionTermsByChannelEntity.SubscriptionTermsByChannelEntityBuilder subscriptionTermsByChannelEntity = SubscriptionTermsByChannelEntity.builder();

        subscriptionTermsByChannelEntity.stbcIdx( model.getStbcIdx() );
        subscriptionTermsByChannelEntity.subscriptionTerms( toSubscriptionTermsEntity( model.getSubscriptionTerms() ) );
        subscriptionTermsByChannelEntity.channel( channelToChannelEntity( model.getChannel() ) );
        subscriptionTermsByChannelEntity.itemByBundle( itemByBundleToItemByBundleEntity( model.getItemByBundle() ) );

        return subscriptionTermsByChannelEntity.build();
    }

    @Override
    public SubscriptionTermsPayLogEntity toSubscriptionTermsPayLogEntity(SubscriptionTermsPayLog model) {
        if ( model == null ) {
            return null;
        }

        SubscriptionTermsPayLogEntity.SubscriptionTermsPayLogEntityBuilder subscriptionTermsPayLogEntity = SubscriptionTermsPayLogEntity.builder();

        subscriptionTermsPayLogEntity.stplIdx( model.getStplIdx() );
        subscriptionTermsPayLogEntity.subscriptionTermsEntity( toSubscriptionTermsEntity( model.getSubscriptionTermsEntity() ) );
        subscriptionTermsPayLogEntity.stUuid( model.getStUuid() );
        subscriptionTermsPayLogEntity.member( memberToMemberEntity( model.getMember() ) );
        subscriptionTermsPayLogEntity.stplStatus( model.getStplStatus() );

        return subscriptionTermsPayLogEntity.build();
    }

    @Override
    public SubscriptionNoticeConfirmEntity toSubscriptionNoticeConfirmEntity(SubscriptionNoticeConfirm model) {
        if ( model == null ) {
            return null;
        }

        SubscriptionNoticeConfirmEntity.SubscriptionNoticeConfirmEntityBuilder subscriptionNoticeConfirmEntity = SubscriptionNoticeConfirmEntity.builder();

        subscriptionNoticeConfirmEntity.sncIdx( model.getSncIdx() );
        subscriptionNoticeConfirmEntity.subscriptionNotice( toSubscriptionNoticeEntity( model.getSubscriptionNotice() ) );
        subscriptionNoticeConfirmEntity.member( memberToMemberEntity( model.getMember() ) );
        subscriptionNoticeConfirmEntity.subscription( toSubscriptionEntity( model.getSubscription() ) );

        return subscriptionNoticeConfirmEntity.build();
    }

    @Override
    public SubscriptionNoticeConfirm toSubscriptionNoticeConfirm(SubscriptionNoticeConfirmEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SubscriptionNoticeConfirm.SubscriptionNoticeConfirmBuilder<?, ?> subscriptionNoticeConfirm = SubscriptionNoticeConfirm.builder();

        subscriptionNoticeConfirm.createdAt( entity.getCreatedAt() );
        subscriptionNoticeConfirm.updatedAt( entity.getUpdatedAt() );
        subscriptionNoticeConfirm.sncIdx( entity.getSncIdx() );
        subscriptionNoticeConfirm.subscriptionNotice( toSubscriptionNotice( entity.getSubscriptionNotice() ) );
        subscriptionNoticeConfirm.member( memberEntityToMember( entity.getMember() ) );
        subscriptionNoticeConfirm.subscription( toSubscription( entity.getSubscription() ) );

        return subscriptionNoticeConfirm.build();
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
        coupon.member( memberEntityToMember( couponEntity.getMember() ) );
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
        memberByCoupon.member( memberEntityToMember( memberByCouponEntity.getMember() ) );
        memberByCoupon.coupon( couponEntityToCoupon( memberByCouponEntity.getCoupon() ) );
        memberByCoupon.mbcStatus( memberByCouponEntity.getMbcStatus() );

        return memberByCoupon.build();
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

    protected CouponEntity couponToCouponEntity(Coupon coupon) {
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

    protected MemberByCouponEntity memberByCouponToMemberByCouponEntity(MemberByCoupon memberByCoupon) {
        if ( memberByCoupon == null ) {
            return null;
        }

        MemberByCouponEntity.MemberByCouponEntityBuilder memberByCouponEntity = MemberByCouponEntity.builder();

        memberByCouponEntity.mbcIdx( memberByCoupon.getMbcIdx() );
        memberByCouponEntity.member( memberToMemberEntity( memberByCoupon.getMember() ) );
        memberByCouponEntity.coupon( couponToCouponEntity( memberByCoupon.getCoupon() ) );
        memberByCouponEntity.mbcStatus( memberByCoupon.getMbcStatus() );

        return memberByCouponEntity.build();
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

    protected SubscriptionNoticeCategoryEntity subscriptionNoticeCategoryToSubscriptionNoticeCategoryEntity(SubscriptionNoticeCategory subscriptionNoticeCategory) {
        if ( subscriptionNoticeCategory == null ) {
            return null;
        }

        SubscriptionNoticeCategoryEntity.SubscriptionNoticeCategoryEntityBuilder subscriptionNoticeCategoryEntity = SubscriptionNoticeCategoryEntity.builder();

        subscriptionNoticeCategoryEntity.sncIdx( subscriptionNoticeCategory.getSncIdx() );
        subscriptionNoticeCategoryEntity.sncType( subscriptionNoticeCategory.getSncType() );
        subscriptionNoticeCategoryEntity.sncName( subscriptionNoticeCategory.getSncName() );

        return subscriptionNoticeCategoryEntity.build();
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

    protected ItemByBundleEntity itemByBundleToItemByBundleEntity(ItemByBundle itemByBundle) {
        if ( itemByBundle == null ) {
            return null;
        }

        ItemByBundleEntity.ItemByBundleEntityBuilder itemByBundleEntity = ItemByBundleEntity.builder();

        itemByBundleEntity.ibbIdx( itemByBundle.getIbbIdx() );
        itemByBundleEntity.item( itemToItemEntity( itemByBundle.getItem() ) );
        itemByBundleEntity.channelBundle( channelBundleToChannelBundleEntity( itemByBundle.getChannelBundle() ) );

        return itemByBundleEntity.build();
    }
}
