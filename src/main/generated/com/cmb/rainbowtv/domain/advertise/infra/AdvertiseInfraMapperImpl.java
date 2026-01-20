package com.cmb.rainbowtv.domain.advertise.infra;

import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdSetEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdSetVideoEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentAgeEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentAreaDefineEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentChannelEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentDeleteReasonEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentDenyReasonEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentDetailEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentFeeEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentHashtagEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentLinkEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentPeriodEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentSexEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseContentTimeEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseKeywordEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseManagementAiEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseManagementEntity;
import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdvertiseMetadataEntity;
import com.cmb.rainbowtv.domain.advertise.model.AdSet;
import com.cmb.rainbowtv.domain.advertise.model.AdSetVideo;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContent;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentAge;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentAreaDefine;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentChannel;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentDeleteReason;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentDenyReason;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentDetail;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentFee;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentHashtag;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentLink;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentPeriod;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentSex;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentTime;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseKeyword;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseManagement;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseManagementAi;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseMetadata;
import com.cmb.rainbowtv.domain.hashtag.infra.data.entity.HashtagEntity;
import com.cmb.rainbowtv.domain.hashtag.model.Hashtag;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.product.infra.data.entity.ItemEntity;
import com.cmb.rainbowtv.domain.product.model.Item;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
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
public class AdvertiseInfraMapperImpl implements AdvertiseInfraMapper {

    @Override
    public AdvertiseContent toAdvertiseContent(AdvertiseContentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AdvertiseContent.AdvertiseContentBuilder<?, ?> advertiseContent = AdvertiseContent.builder();

        advertiseContent.createdAt( entity.getCreatedAt() );
        advertiseContent.updatedAt( entity.getUpdatedAt() );
        advertiseContent.acIdx( entity.getAcIdx() );
        advertiseContent.acUuid( entity.getAcUuid() );
        advertiseContent.member( memberEntityToMember( entity.getMember() ) );
        advertiseContent.item( itemEntityToItem( entity.getItem() ) );
        advertiseContent.acAdmNo( entity.getAcAdmNo() );
        advertiseContent.acIsPaid( entity.getAcIsPaid() );
        advertiseContent.acPublishTax( entity.getAcPublishTax() );
        advertiseContent.acIsUse( entity.getAcIsUse() );
        advertiseContent.acAdmission( entity.getAcAdmission() );
        advertiseContent.acStatus( entity.getAcStatus() );
        advertiseContent.acPriceType( entity.getAcPriceType() );
        advertiseContent.acPrice( entity.getAcPrice() );
        advertiseContent.acPriceCount( entity.getAcPriceCount() );
        advertiseContent.acWithoutPaid( entity.getAcWithoutPaid() );
        advertiseContent.lpType( entity.getLpType() );

        return advertiseContent.build();
    }

    @Override
    public AdvertiseContentEntity toAdvertiseContentEntity(AdvertiseContent content) {
        if ( content == null ) {
            return null;
        }

        AdvertiseContentEntity.AdvertiseContentEntityBuilder advertiseContentEntity = AdvertiseContentEntity.builder();

        advertiseContentEntity.acIdx( content.getAcIdx() );
        advertiseContentEntity.acUuid( content.getAcUuid() );
        advertiseContentEntity.member( memberToMemberEntity( content.getMember() ) );
        advertiseContentEntity.item( itemToItemEntity( content.getItem() ) );
        advertiseContentEntity.acAdmNo( content.getAcAdmNo() );
        advertiseContentEntity.acIsPaid( content.getAcIsPaid() );
        advertiseContentEntity.acPublishTax( content.getAcPublishTax() );
        advertiseContentEntity.acIsUse( content.getAcIsUse() );
        advertiseContentEntity.acAdmission( content.getAcAdmission() );
        advertiseContentEntity.acStatus( content.getAcStatus() );
        advertiseContentEntity.acPriceType( content.getAcPriceType() );
        advertiseContentEntity.acPrice( content.getAcPrice() );
        advertiseContentEntity.acPriceCount( content.getAcPriceCount() );
        advertiseContentEntity.acWithoutPaid( content.getAcWithoutPaid() );
        advertiseContentEntity.lpType( content.getLpType() );

        return advertiseContentEntity.build();
    }

    @Override
    public List<AdvertiseContentDetail> toAdvertiseContentDetailList(List<AdvertiseContentDetailEntity> contentDetailList) {
        if ( contentDetailList == null ) {
            return null;
        }

        List<AdvertiseContentDetail> list = new ArrayList<AdvertiseContentDetail>( contentDetailList.size() );
        for ( AdvertiseContentDetailEntity advertiseContentDetailEntity : contentDetailList ) {
            list.add( toAdvertiseContentDetail( advertiseContentDetailEntity ) );
        }

        return list;
    }

    @Override
    public AdvertiseContentDeleteReasonEntity toAdvertiseContentDeleteReasonEntity(AdvertiseContentDeleteReason deleteReason) {
        if ( deleteReason == null ) {
            return null;
        }

        AdvertiseContentDeleteReasonEntity.AdvertiseContentDeleteReasonEntityBuilder advertiseContentDeleteReasonEntity = AdvertiseContentDeleteReasonEntity.builder();

        advertiseContentDeleteReasonEntity.acdrIdx( deleteReason.getAcdrIdx() );
        advertiseContentDeleteReasonEntity.advertiseContent( toAdvertiseContentEntity( deleteReason.getAdvertiseContent() ) );
        advertiseContentDeleteReasonEntity.acdrReason( deleteReason.getAcdrReason() );
        advertiseContentDeleteReasonEntity.member( memberToMemberEntity( deleteReason.getMember() ) );

        return advertiseContentDeleteReasonEntity.build();
    }

    @Override
    public AdvertiseManagement toAdvertiseManagement(AdvertiseManagementEntity advertiseManagementEntity) {
        if ( advertiseManagementEntity == null ) {
            return null;
        }

        AdvertiseManagement.AdvertiseManagementBuilder<?, ?> advertiseManagement = AdvertiseManagement.builder();

        advertiseManagement.createdAt( advertiseManagementEntity.getCreatedAt() );
        advertiseManagement.updatedAt( advertiseManagementEntity.getUpdatedAt() );
        advertiseManagement.amIdx( advertiseManagementEntity.getAmIdx() );
        advertiseManagement.advertiseContentDetailType( advertiseManagementEntity.getAdvertiseContentDetailType() );
        advertiseManagement.amLengthMin( advertiseManagementEntity.getAmLengthMin() );
        advertiseManagement.amLengthMax( advertiseManagementEntity.getAmLengthMax() );
        advertiseManagement.amMaxCycle( advertiseManagementEntity.getAmMaxCycle() );
        advertiseManagement.amMiddleCycle( advertiseManagementEntity.getAmMiddleCycle() );
        advertiseManagement.amMinCycle( advertiseManagementEntity.getAmMinCycle() );
        advertiseManagement.amDisplay( advertiseManagementEntity.getAmDisplay() );

        return advertiseManagement.build();
    }

    @Override
    public AdvertiseManagementEntity toAdvertiseManagementEntity(AdvertiseManagement advertiseManagement) {
        if ( advertiseManagement == null ) {
            return null;
        }

        AdvertiseManagementEntity.AdvertiseManagementEntityBuilder advertiseManagementEntity = AdvertiseManagementEntity.builder();

        advertiseManagementEntity.amIdx( advertiseManagement.getAmIdx() );
        advertiseManagementEntity.advertiseContentDetailType( advertiseManagement.getAdvertiseContentDetailType() );
        advertiseManagementEntity.amLengthMin( advertiseManagement.getAmLengthMin() );
        advertiseManagementEntity.amLengthMax( advertiseManagement.getAmLengthMax() );
        advertiseManagementEntity.amMaxCycle( advertiseManagement.getAmMaxCycle() );
        advertiseManagementEntity.amMiddleCycle( advertiseManagement.getAmMiddleCycle() );
        advertiseManagementEntity.amMinCycle( advertiseManagement.getAmMinCycle() );
        advertiseManagementEntity.amDisplay( advertiseManagement.getAmDisplay() );

        return advertiseManagementEntity.build();
    }

    @Override
    public AdvertiseContentDetail toAdvertiseContentDetail(AdvertiseContentDetailEntity contentDetail) {
        if ( contentDetail == null ) {
            return null;
        }

        AdvertiseContentDetail.AdvertiseContentDetailBuilder<?, ?> advertiseContentDetail = AdvertiseContentDetail.builder();

        advertiseContentDetail.createdAt( contentDetail.getCreatedAt() );
        advertiseContentDetail.updatedAt( contentDetail.getUpdatedAt() );
        advertiseContentDetail.acdIdx( contentDetail.getAcdIdx() );
        advertiseContentDetail.advertiseContentDetailType( contentDetail.getAdvertiseContentDetailType() );
        advertiseContentDetail.advertiseContent( toAdvertiseContent( contentDetail.getAdvertiseContent() ) );
        advertiseContentDetail.acdAdmission( contentDetail.getAcdAdmission() );
        advertiseContentDetail.acdStatus( contentDetail.getAcdStatus() );
        advertiseContentDetail.acdName( contentDetail.getAcdName() );
        advertiseContentDetail.acdCompany( contentDetail.getAcdCompany() );
        advertiseContentDetail.acdCompanyHp( contentDetail.getAcdCompanyHp() );
        advertiseContentDetail.acdPostStart( contentDetail.getAcdPostStart() );
        advertiseContentDetail.acdPostEnd( contentDetail.getAcdPostEnd() );
        advertiseContentDetail.acdRunningTime( contentDetail.getAcdRunningTime() );
        advertiseContentDetail.acdVideoStatus( contentDetail.getAcdVideoStatus() );
        advertiseContentDetail.acdDashUrl( contentDetail.getAcdDashUrl() );
        advertiseContentDetail.acdHlsUrl( contentDetail.getAcdHlsUrl() );
        advertiseContentDetail.guid( contentDetail.getGuid() );
        advertiseContentDetail.mediaPackageId( contentDetail.getMediaPackageId() );
        advertiseContentDetail.acdHaveTarget( contentDetail.getAcdHaveTarget() );
        advertiseContentDetail.acdCount( contentDetail.getAcdCount() );
        advertiseContentDetail.acdSeq( contentDetail.getAcdSeq() );
        advertiseContentDetail.acdUrl( contentDetail.getAcdUrl() );

        return advertiseContentDetail.build();
    }

    @Override
    public AdvertiseContentDetailEntity toAdvertiseContentDetailEntity(AdvertiseContentDetail contentDetail) {
        if ( contentDetail == null ) {
            return null;
        }

        AdvertiseContentDetailEntity.AdvertiseContentDetailEntityBuilder advertiseContentDetailEntity = AdvertiseContentDetailEntity.builder();

        advertiseContentDetailEntity.acdIdx( contentDetail.getAcdIdx() );
        advertiseContentDetailEntity.advertiseContentDetailType( contentDetail.getAdvertiseContentDetailType() );
        advertiseContentDetailEntity.advertiseContent( toAdvertiseContentEntity( contentDetail.getAdvertiseContent() ) );
        advertiseContentDetailEntity.acdAdmission( contentDetail.getAcdAdmission() );
        advertiseContentDetailEntity.acdStatus( contentDetail.getAcdStatus() );
        advertiseContentDetailEntity.acdName( contentDetail.getAcdName() );
        advertiseContentDetailEntity.acdCompany( contentDetail.getAcdCompany() );
        advertiseContentDetailEntity.acdCompanyHp( contentDetail.getAcdCompanyHp() );
        advertiseContentDetailEntity.acdPostStart( contentDetail.getAcdPostStart() );
        advertiseContentDetailEntity.acdPostEnd( contentDetail.getAcdPostEnd() );
        advertiseContentDetailEntity.acdRunningTime( contentDetail.getAcdRunningTime() );
        advertiseContentDetailEntity.acdVideoStatus( contentDetail.getAcdVideoStatus() );
        advertiseContentDetailEntity.acdDashUrl( contentDetail.getAcdDashUrl() );
        advertiseContentDetailEntity.acdHlsUrl( contentDetail.getAcdHlsUrl() );
        advertiseContentDetailEntity.guid( contentDetail.getGuid() );
        advertiseContentDetailEntity.mediaPackageId( contentDetail.getMediaPackageId() );
        advertiseContentDetailEntity.acdHaveTarget( contentDetail.getAcdHaveTarget() );
        advertiseContentDetailEntity.acdCount( contentDetail.getAcdCount() );
        advertiseContentDetailEntity.acdSeq( contentDetail.getAcdSeq() );
        advertiseContentDetailEntity.acdUrl( contentDetail.getAcdUrl() );

        return advertiseContentDetailEntity.build();
    }

    @Override
    public AdvertiseContentChannelEntity toAdvertiseContentChannelEntity(AdvertiseContentChannel advertiseContentChannel) {
        if ( advertiseContentChannel == null ) {
            return null;
        }

        AdvertiseContentChannelEntity.AdvertiseContentChannelEntityBuilder advertiseContentChannelEntity = AdvertiseContentChannelEntity.builder();

        advertiseContentChannelEntity.accIdx( advertiseContentChannel.getAccIdx() );
        advertiseContentChannelEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentChannel.getAdvertiseContentDetail() ) );
        advertiseContentChannelEntity.mcType( advertiseContentChannel.getMcType() );

        return advertiseContentChannelEntity.build();
    }

    @Override
    public AdvertiseContentAgeEntity toAdvertiseContentAgeEntity(AdvertiseContentAge advertiseContentAge) {
        if ( advertiseContentAge == null ) {
            return null;
        }

        AdvertiseContentAgeEntity.AdvertiseContentAgeEntityBuilder advertiseContentAgeEntity = AdvertiseContentAgeEntity.builder();

        advertiseContentAgeEntity.acaIdx( advertiseContentAge.getAcaIdx() );
        advertiseContentAgeEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentAge.getAdvertiseContentDetail() ) );
        advertiseContentAgeEntity.acaType( advertiseContentAge.getAcaType() );

        return advertiseContentAgeEntity.build();
    }

    @Override
    public AdvertiseContentSexEntity toAdvertiseContentSexEntity(AdvertiseContentSex advertiseContentSex) {
        if ( advertiseContentSex == null ) {
            return null;
        }

        AdvertiseContentSexEntity.AdvertiseContentSexEntityBuilder advertiseContentSexEntity = AdvertiseContentSexEntity.builder();

        advertiseContentSexEntity.acsIdx( advertiseContentSex.getAcsIdx() );
        advertiseContentSexEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentSex.getAdvertiseContentDetail() ) );
        advertiseContentSexEntity.acsSex( advertiseContentSex.getAcsSex() );

        return advertiseContentSexEntity.build();
    }

    @Override
    public AdvertiseContentAreaDefineEntity toAdvertiseContentAreaDefineEntity(AdvertiseContentAreaDefine advertiseContentAreaDefine) {
        if ( advertiseContentAreaDefine == null ) {
            return null;
        }

        AdvertiseContentAreaDefineEntity.AdvertiseContentAreaDefineEntityBuilder advertiseContentAreaDefineEntity = AdvertiseContentAreaDefineEntity.builder();

        advertiseContentAreaDefineEntity.acadIdx( advertiseContentAreaDefine.getAcadIdx() );
        advertiseContentAreaDefineEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentAreaDefine.getAdvertiseContentDetail() ) );
        advertiseContentAreaDefineEntity.areaDefine( areaDefineToAreaDefineEntity( advertiseContentAreaDefine.getAreaDefine() ) );

        return advertiseContentAreaDefineEntity.build();
    }

    @Override
    public AdvertiseContentTimeEntity toAdvertiseContentTimeEntity(AdvertiseContentTime advertiseContentTime) {
        if ( advertiseContentTime == null ) {
            return null;
        }

        AdvertiseContentTimeEntity.AdvertiseContentTimeEntityBuilder advertiseContentTimeEntity = AdvertiseContentTimeEntity.builder();

        advertiseContentTimeEntity.actIdx( advertiseContentTime.getActIdx() );
        advertiseContentTimeEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentTime.getAdvertiseContentDetail() ) );
        advertiseContentTimeEntity.actType( advertiseContentTime.getActType() );

        return advertiseContentTimeEntity.build();
    }

    @Override
    public AdvertiseContentLinkEntity toAdvertiseContentLinkEntity(AdvertiseContentLink advertiseContentLink) {
        if ( advertiseContentLink == null ) {
            return null;
        }

        AdvertiseContentLinkEntity.AdvertiseContentLinkEntityBuilder advertiseContentLinkEntity = AdvertiseContentLinkEntity.builder();

        advertiseContentLinkEntity.aclIdx( advertiseContentLink.getAclIdx() );
        advertiseContentLinkEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentLink.getAdvertiseContentDetail() ) );
        advertiseContentLinkEntity.advertiseContentLinkType( advertiseContentLink.getAdvertiseContentLinkType() );
        advertiseContentLinkEntity.aclKey( advertiseContentLink.getAclKey() );
        advertiseContentLinkEntity.aclLink( advertiseContentLink.getAclLink() );
        advertiseContentLinkEntity.aclLinkEnabled( advertiseContentLink.getAclLinkEnabled() );

        return advertiseContentLinkEntity.build();
    }

    @Override
    public AdvertiseContentLink toAdvertiseContentLink(AdvertiseContentLinkEntity advertiseContentLinkEntity) {
        if ( advertiseContentLinkEntity == null ) {
            return null;
        }

        AdvertiseContentLink.AdvertiseContentLinkBuilder<?, ?> advertiseContentLink = AdvertiseContentLink.builder();

        advertiseContentLink.createdAt( advertiseContentLinkEntity.getCreatedAt() );
        advertiseContentLink.updatedAt( advertiseContentLinkEntity.getUpdatedAt() );
        advertiseContentLink.aclIdx( advertiseContentLinkEntity.getAclIdx() );
        advertiseContentLink.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentLinkEntity.getAdvertiseContentDetail() ) );
        advertiseContentLink.advertiseContentLinkType( advertiseContentLinkEntity.getAdvertiseContentLinkType() );
        advertiseContentLink.aclKey( advertiseContentLinkEntity.getAclKey() );
        advertiseContentLink.aclLink( advertiseContentLinkEntity.getAclLink() );
        advertiseContentLink.aclLinkEnabled( advertiseContentLinkEntity.getAclLinkEnabled() );

        return advertiseContentLink.build();
    }

    @Override
    public AdvertiseContentPeriodEntity toAdvertiseContentPeriodEntity(AdvertiseContentPeriod advertiseContentPeriod) {
        if ( advertiseContentPeriod == null ) {
            return null;
        }

        AdvertiseContentPeriodEntity.AdvertiseContentPeriodEntityBuilder advertiseContentPeriodEntity = AdvertiseContentPeriodEntity.builder();

        advertiseContentPeriodEntity.acpIdx( advertiseContentPeriod.getAcpIdx() );
        advertiseContentPeriodEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentPeriod.getAdvertiseContentDetail() ) );
        advertiseContentPeriodEntity.acpSeq( advertiseContentPeriod.getAcpSeq() );
        advertiseContentPeriodEntity.acpPostSt( advertiseContentPeriod.getAcpPostSt() );
        advertiseContentPeriodEntity.acpPostEd( advertiseContentPeriod.getAcpPostEd() );

        return advertiseContentPeriodEntity.build();
    }

    @Override
    public AdvertiseContentFeeEntity toAdvertiseContentFeeEntity(AdvertiseContentFee advertiseContentFee) {
        if ( advertiseContentFee == null ) {
            return null;
        }

        AdvertiseContentFeeEntity.AdvertiseContentFeeEntityBuilder advertiseContentFeeEntity = AdvertiseContentFeeEntity.builder();

        advertiseContentFeeEntity.acfIdx( advertiseContentFee.getAcfIdx() );
        advertiseContentFeeEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentFee.getAdvertiseContentDetail() ) );
        advertiseContentFeeEntity.acfType( advertiseContentFee.getAcfType() );
        advertiseContentFeeEntity.acfRate( advertiseContentFee.getAcfRate() );
        advertiseContentFeeEntity.acfInvest( advertiseContentFee.getAcfInvest() );

        return advertiseContentFeeEntity.build();
    }

    @Override
    public AdvertiseContentAge toAdvertiseContentAge(AdvertiseContentAgeEntity advertiseContentAgeEntity) {
        if ( advertiseContentAgeEntity == null ) {
            return null;
        }

        AdvertiseContentAge.AdvertiseContentAgeBuilder<?, ?> advertiseContentAge = AdvertiseContentAge.builder();

        advertiseContentAge.createdAt( advertiseContentAgeEntity.getCreatedAt() );
        advertiseContentAge.updatedAt( advertiseContentAgeEntity.getUpdatedAt() );
        advertiseContentAge.acaIdx( advertiseContentAgeEntity.getAcaIdx() );
        advertiseContentAge.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentAgeEntity.getAdvertiseContentDetail() ) );
        advertiseContentAge.acaType( advertiseContentAgeEntity.getAcaType() );

        return advertiseContentAge.build();
    }

    @Override
    public AdvertiseContentFee toAdvertiseContentFee(AdvertiseContentFeeEntity advertiseContentFeeEntity) {
        if ( advertiseContentFeeEntity == null ) {
            return null;
        }

        AdvertiseContentFee.AdvertiseContentFeeBuilder<?, ?> advertiseContentFee = AdvertiseContentFee.builder();

        advertiseContentFee.createdAt( advertiseContentFeeEntity.getCreatedAt() );
        advertiseContentFee.updatedAt( advertiseContentFeeEntity.getUpdatedAt() );
        advertiseContentFee.acfIdx( advertiseContentFeeEntity.getAcfIdx() );
        advertiseContentFee.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentFeeEntity.getAdvertiseContentDetail() ) );
        advertiseContentFee.acfType( advertiseContentFeeEntity.getAcfType() );
        advertiseContentFee.acfRate( advertiseContentFeeEntity.getAcfRate() );
        advertiseContentFee.acfInvest( advertiseContentFeeEntity.getAcfInvest() );

        return advertiseContentFee.build();
    }

    @Override
    public AdvertiseContentDenyReason toAdvertiseContentDenyReason(AdvertiseContentDenyReasonEntity advertiseContentDenyReasonEntity) {
        if ( advertiseContentDenyReasonEntity == null ) {
            return null;
        }

        AdvertiseContentDenyReason.AdvertiseContentDenyReasonBuilder<?, ?> advertiseContentDenyReason = AdvertiseContentDenyReason.builder();

        advertiseContentDenyReason.createdAt( advertiseContentDenyReasonEntity.getCreatedAt() );
        advertiseContentDenyReason.updatedAt( advertiseContentDenyReasonEntity.getUpdatedAt() );
        advertiseContentDenyReason.acdrIdx( advertiseContentDenyReasonEntity.getAcdrIdx() );
        advertiseContentDenyReason.member( memberEntityToMember( advertiseContentDenyReasonEntity.getMember() ) );
        advertiseContentDenyReason.advertiseContent( toAdvertiseContent( advertiseContentDenyReasonEntity.getAdvertiseContent() ) );
        advertiseContentDenyReason.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentDenyReasonEntity.getAdvertiseContentDetail() ) );
        advertiseContentDenyReason.acdrReason( advertiseContentDenyReasonEntity.getAcdrReason() );

        return advertiseContentDenyReason.build();
    }

    @Override
    public AdvertiseContentAreaDefine toAdvertiseContentAreaDefine(AdvertiseContentAreaDefineEntity advertiseContentAreaDefineEntity) {
        if ( advertiseContentAreaDefineEntity == null ) {
            return null;
        }

        AdvertiseContentAreaDefine.AdvertiseContentAreaDefineBuilder<?, ?> advertiseContentAreaDefine = AdvertiseContentAreaDefine.builder();

        advertiseContentAreaDefine.createdAt( advertiseContentAreaDefineEntity.getCreatedAt() );
        advertiseContentAreaDefine.updatedAt( advertiseContentAreaDefineEntity.getUpdatedAt() );
        advertiseContentAreaDefine.acadIdx( advertiseContentAreaDefineEntity.getAcadIdx() );
        advertiseContentAreaDefine.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentAreaDefineEntity.getAdvertiseContentDetail() ) );
        advertiseContentAreaDefine.areaDefine( areaDefineEntityToAreaDefine( advertiseContentAreaDefineEntity.getAreaDefine() ) );

        return advertiseContentAreaDefine.build();
    }

    @Override
    public AdvertiseContentChannel toAdvertiseContentChannel(AdvertiseContentChannelEntity advertiseContentChannelEntity) {
        if ( advertiseContentChannelEntity == null ) {
            return null;
        }

        AdvertiseContentChannel.AdvertiseContentChannelBuilder<?, ?> advertiseContentChannel = AdvertiseContentChannel.builder();

        advertiseContentChannel.createdAt( advertiseContentChannelEntity.getCreatedAt() );
        advertiseContentChannel.updatedAt( advertiseContentChannelEntity.getUpdatedAt() );
        advertiseContentChannel.accIdx( advertiseContentChannelEntity.getAccIdx() );
        advertiseContentChannel.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentChannelEntity.getAdvertiseContentDetail() ) );
        advertiseContentChannel.mcType( advertiseContentChannelEntity.getMcType() );

        return advertiseContentChannel.build();
    }

    @Override
    public AdSetVideoEntity toAdSetVideoEntity(AdSetVideo adSetVideo) {
        if ( adSetVideo == null ) {
            return null;
        }

        AdSetVideoEntity.AdSetVideoEntityBuilder adSetVideoEntity = AdSetVideoEntity.builder();

        adSetVideoEntity.asvIdx( adSetVideo.getAsvIdx() );
        adSetVideoEntity.adSet( toAdSetEntity( adSetVideo.getAdSet() ) );
        adSetVideoEntity.asvSeq( adSetVideo.getAsvSeq() );
        adSetVideoEntity.advertiseContent( toAdvertiseContentEntity( adSetVideo.getAdvertiseContent() ) );

        return adSetVideoEntity.build();
    }

    @Override
    public AdSetVideo toAdSetVideo(AdSetVideoEntity adSetVideoEntity) {
        if ( adSetVideoEntity == null ) {
            return null;
        }

        AdSetVideo.AdSetVideoBuilder<?, ?> adSetVideo = AdSetVideo.builder();

        adSetVideo.createdAt( adSetVideoEntity.getCreatedAt() );
        adSetVideo.updatedAt( adSetVideoEntity.getUpdatedAt() );
        adSetVideo.asvIdx( adSetVideoEntity.getAsvIdx() );
        adSetVideo.adSet( toAdSet( adSetVideoEntity.getAdSet() ) );
        adSetVideo.asvSeq( adSetVideoEntity.getAsvSeq() );
        adSetVideo.advertiseContent( toAdvertiseContent( adSetVideoEntity.getAdvertiseContent() ) );

        return adSetVideo.build();
    }

    @Override
    public AdSetEntity toAdSetEntity(AdSet adSet) {
        if ( adSet == null ) {
            return null;
        }

        AdSetEntity.AdSetEntityBuilder adSetEntity = AdSetEntity.builder();

        adSetEntity.asIdx( adSet.getAsIdx() );
        adSetEntity.asUse( adSet.getAsUse() );
        adSetEntity.asName( adSet.getAsName() );
        adSetEntity.asStatus( adSet.getAsStatus() );
        adSetEntity.asDashUrl( adSet.getAsDashUrl() );
        adSetEntity.asHlsUrl( adSet.getAsHlsUrl() );
        adSetEntity.asPostTimeSt( adSet.getAsPostTimeSt() );
        adSetEntity.asPostTimeEd( adSet.getAsPostTimeEd() );
        adSetEntity.guid( adSet.getGuid() );
        adSetEntity.mediaPackageId( adSet.getMediaPackageId() );
        adSetEntity.asUuid( adSet.getAsUuid() );
        adSetEntity.asRunningTime( adSet.getAsRunningTime() );

        return adSetEntity.build();
    }

    @Override
    public AdSet toAdSet(AdSetEntity adSetEntity) {
        if ( adSetEntity == null ) {
            return null;
        }

        AdSet.AdSetBuilder<?, ?> adSet = AdSet.builder();

        adSet.createdAt( adSetEntity.getCreatedAt() );
        adSet.updatedAt( adSetEntity.getUpdatedAt() );
        adSet.asIdx( adSetEntity.getAsIdx() );
        adSet.asUse( adSetEntity.getAsUse() );
        adSet.asName( adSetEntity.getAsName() );
        adSet.asStatus( adSetEntity.getAsStatus() );
        adSet.asDashUrl( adSetEntity.getAsDashUrl() );
        adSet.asHlsUrl( adSetEntity.getAsHlsUrl() );
        adSet.asPostTimeSt( adSetEntity.getAsPostTimeSt() );
        adSet.asPostTimeEd( adSetEntity.getAsPostTimeEd() );
        adSet.guid( adSetEntity.getGuid() );
        adSet.mediaPackageId( adSetEntity.getMediaPackageId() );
        adSet.asUuid( adSetEntity.getAsUuid() );
        adSet.asRunningTime( adSetEntity.getAsRunningTime() );

        return adSet.build();
    }

    @Override
    public List<AdvertiseContentPeriod> toAdvertiseContentPeriodList(List<AdvertiseContentPeriodEntity> periodListEntity) {
        if ( periodListEntity == null ) {
            return null;
        }

        List<AdvertiseContentPeriod> list = new ArrayList<AdvertiseContentPeriod>( periodListEntity.size() );
        for ( AdvertiseContentPeriodEntity advertiseContentPeriodEntity : periodListEntity ) {
            list.add( toAdvertiseContentPeriod( advertiseContentPeriodEntity ) );
        }

        return list;
    }

    @Override
    public AdvertiseContentTime toAdvertiseContentTime(AdvertiseContentTimeEntity advertiseContentTimeEntity) {
        if ( advertiseContentTimeEntity == null ) {
            return null;
        }

        AdvertiseContentTime.AdvertiseContentTimeBuilder<?, ?> advertiseContentTime = AdvertiseContentTime.builder();

        advertiseContentTime.createdAt( advertiseContentTimeEntity.getCreatedAt() );
        advertiseContentTime.updatedAt( advertiseContentTimeEntity.getUpdatedAt() );
        advertiseContentTime.actIdx( advertiseContentTimeEntity.getActIdx() );
        advertiseContentTime.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentTimeEntity.getAdvertiseContentDetail() ) );
        advertiseContentTime.actType( advertiseContentTimeEntity.getActType() );

        return advertiseContentTime.build();
    }

    @Override
    public AdvertiseContentSex toAdvertiseContentSex(AdvertiseContentSexEntity advertiseContentSexEntity) {
        if ( advertiseContentSexEntity == null ) {
            return null;
        }

        AdvertiseContentSex.AdvertiseContentSexBuilder<?, ?> advertiseContentSex = AdvertiseContentSex.builder();

        advertiseContentSex.createdAt( advertiseContentSexEntity.getCreatedAt() );
        advertiseContentSex.updatedAt( advertiseContentSexEntity.getUpdatedAt() );
        advertiseContentSex.acsIdx( advertiseContentSexEntity.getAcsIdx() );
        advertiseContentSex.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentSexEntity.getAdvertiseContentDetail() ) );
        advertiseContentSex.acsSex( advertiseContentSexEntity.getAcsSex() );

        return advertiseContentSex.build();
    }

    @Override
    public AdvertiseContentPeriod toAdvertiseContentPeriod(AdvertiseContentPeriodEntity advertiseContentPeriodEntity) {
        if ( advertiseContentPeriodEntity == null ) {
            return null;
        }

        AdvertiseContentPeriod.AdvertiseContentPeriodBuilder<?, ?> advertiseContentPeriod = AdvertiseContentPeriod.builder();

        advertiseContentPeriod.createdAt( advertiseContentPeriodEntity.getCreatedAt() );
        advertiseContentPeriod.updatedAt( advertiseContentPeriodEntity.getUpdatedAt() );
        advertiseContentPeriod.acpIdx( advertiseContentPeriodEntity.getAcpIdx() );
        advertiseContentPeriod.advertiseContentDetail( toAdvertiseContentDetail( advertiseContentPeriodEntity.getAdvertiseContentDetail() ) );
        advertiseContentPeriod.acpSeq( advertiseContentPeriodEntity.getAcpSeq() );
        advertiseContentPeriod.acpPostSt( advertiseContentPeriodEntity.getAcpPostSt() );
        advertiseContentPeriod.acpPostEd( advertiseContentPeriodEntity.getAcpPostEd() );

        return advertiseContentPeriod.build();
    }

    @Override
    public AdvertiseContentDenyReasonEntity toAdvertiseContentDenyReasonEntity(AdvertiseContentDenyReason advertiseContentDenyReason) {
        if ( advertiseContentDenyReason == null ) {
            return null;
        }

        AdvertiseContentDenyReasonEntity.AdvertiseContentDenyReasonEntityBuilder advertiseContentDenyReasonEntity = AdvertiseContentDenyReasonEntity.builder();

        advertiseContentDenyReasonEntity.acdrIdx( advertiseContentDenyReason.getAcdrIdx() );
        advertiseContentDenyReasonEntity.member( memberToMemberEntity( advertiseContentDenyReason.getMember() ) );
        advertiseContentDenyReasonEntity.advertiseContent( toAdvertiseContentEntity( advertiseContentDenyReason.getAdvertiseContent() ) );
        advertiseContentDenyReasonEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( advertiseContentDenyReason.getAdvertiseContentDetail() ) );
        advertiseContentDenyReasonEntity.acdrReason( advertiseContentDenyReason.getAcdrReason() );

        return advertiseContentDenyReasonEntity.build();
    }

    @Override
    public List<AdSet> toAdSetList(List<AdSetEntity> adSetListWithFastChannelAdByFcIdx) {
        if ( adSetListWithFastChannelAdByFcIdx == null ) {
            return null;
        }

        List<AdSet> list = new ArrayList<AdSet>( adSetListWithFastChannelAdByFcIdx.size() );
        for ( AdSetEntity adSetEntity : adSetListWithFastChannelAdByFcIdx ) {
            list.add( toAdSet( adSetEntity ) );
        }

        return list;
    }

    @Override
    public AdvertiseManagementAiEntity toAdvertiseManagementAiEntity(AdvertiseManagementAi model) {
        if ( model == null ) {
            return null;
        }

        AdvertiseManagementAiEntity.AdvertiseManagementAiEntityBuilder advertiseManagementAiEntity = AdvertiseManagementAiEntity.builder();

        advertiseManagementAiEntity.amaIdx( model.getAmaIdx() );
        advertiseManagementAiEntity.amaAi( model.getAmaAi() );

        return advertiseManagementAiEntity.build();
    }

    @Override
    public AdvertiseManagementAi toAdvertiseManagementAi(AdvertiseManagementAiEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AdvertiseManagementAi.AdvertiseManagementAiBuilder<?, ?> advertiseManagementAi = AdvertiseManagementAi.builder();

        advertiseManagementAi.createdAt( entity.getCreatedAt() );
        advertiseManagementAi.updatedAt( entity.getUpdatedAt() );
        advertiseManagementAi.amaIdx( entity.getAmaIdx() );
        advertiseManagementAi.amaAi( entity.getAmaAi() );

        return advertiseManagementAi.build();
    }

    @Override
    public AdvertiseContentHashtagEntity toAdvertiseContentHashtagEntity(AdvertiseContentHashtag model) {
        if ( model == null ) {
            return null;
        }

        AdvertiseContentHashtagEntity.AdvertiseContentHashtagEntityBuilder advertiseContentHashtagEntity = AdvertiseContentHashtagEntity.builder();

        advertiseContentHashtagEntity.achtIdx( model.getAchtIdx() );
        advertiseContentHashtagEntity.advertiseContentDetail( toAdvertiseContentDetailEntity( model.getAdvertiseContentDetail() ) );
        advertiseContentHashtagEntity.hashtag( hashtagToHashtagEntity( model.getHashtag() ) );

        return advertiseContentHashtagEntity.build();
    }

    @Override
    public AdvertiseContentHashtag toAdvertiseContentHashtag(AdvertiseContentHashtagEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AdvertiseContentHashtag.AdvertiseContentHashtagBuilder<?, ?> advertiseContentHashtag = AdvertiseContentHashtag.builder();

        advertiseContentHashtag.createdAt( entity.getCreatedAt() );
        advertiseContentHashtag.updatedAt( entity.getUpdatedAt() );
        advertiseContentHashtag.achtIdx( entity.getAchtIdx() );
        advertiseContentHashtag.advertiseContentDetail( toAdvertiseContentDetail( entity.getAdvertiseContentDetail() ) );
        advertiseContentHashtag.hashtag( hashtagEntityToHashtag( entity.getHashtag() ) );

        return advertiseContentHashtag.build();
    }

    @Override
    public AdvertiseMetadata toAdvertiseMetadata(AdvertiseMetadataEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AdvertiseMetadata.AdvertiseMetadataBuilder<?, ?> advertiseMetadata = AdvertiseMetadata.builder();

        advertiseMetadata.createdAt( entity.getCreatedAt() );
        advertiseMetadata.updatedAt( entity.getUpdatedAt() );
        advertiseMetadata.amIdx( entity.getAmIdx() );
        advertiseMetadata.advertiseContent( toAdvertiseContent( entity.getAdvertiseContent() ) );
        advertiseMetadata.amProducer( entity.getAmProducer() );
        advertiseMetadata.amSynopsis( entity.getAmSynopsis() );
        advertiseMetadata.amKeywords( entity.getAmKeywords() );

        return advertiseMetadata.build();
    }

    @Override
    public AdvertiseMetadataEntity toAdvertiseMetadataEntity(AdvertiseMetadata model) {
        if ( model == null ) {
            return null;
        }

        AdvertiseMetadataEntity.AdvertiseMetadataEntityBuilder advertiseMetadataEntity = AdvertiseMetadataEntity.builder();

        advertiseMetadataEntity.amIdx( model.getAmIdx() );
        advertiseMetadataEntity.advertiseContent( toAdvertiseContentEntity( model.getAdvertiseContent() ) );
        advertiseMetadataEntity.amProducer( model.getAmProducer() );
        advertiseMetadataEntity.amSynopsis( model.getAmSynopsis() );
        advertiseMetadataEntity.amKeywords( model.getAmKeywords() );

        return advertiseMetadataEntity.build();
    }

    @Override
    public AdvertiseKeyword toAdvertiseKeyword(AdvertiseKeywordEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AdvertiseKeyword.AdvertiseKeywordBuilder<?, ?> advertiseKeyword = AdvertiseKeyword.builder();

        advertiseKeyword.createdAt( entity.getCreatedAt() );
        advertiseKeyword.updatedAt( entity.getUpdatedAt() );
        advertiseKeyword.akIdx( entity.getAkIdx() );
        advertiseKeyword.advertiseMetadata( toAdvertiseMetadata( entity.getAdvertiseMetadata() ) );
        advertiseKeyword.akKeyword( entity.getAkKeyword() );

        return advertiseKeyword.build();
    }

    @Override
    public AdvertiseKeywordEntity toAdvertiseKeywordEntity(AdvertiseKeyword model) {
        if ( model == null ) {
            return null;
        }

        AdvertiseKeywordEntity.AdvertiseKeywordEntityBuilder advertiseKeywordEntity = AdvertiseKeywordEntity.builder();

        advertiseKeywordEntity.akIdx( model.getAkIdx() );
        advertiseKeywordEntity.advertiseMetadata( toAdvertiseMetadataEntity( model.getAdvertiseMetadata() ) );
        advertiseKeywordEntity.akKeyword( model.getAkKeyword() );

        return advertiseKeywordEntity.build();
    }

    @Override
    public List<AdvertiseKeyword> toAdvertiseKeywordList(List<AdvertiseKeywordEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AdvertiseKeyword> list = new ArrayList<AdvertiseKeyword>( entityList.size() );
        for ( AdvertiseKeywordEntity advertiseKeywordEntity : entityList ) {
            list.add( toAdvertiseKeyword( advertiseKeywordEntity ) );
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

    protected AreaDefineEntity areaDefineToAreaDefineEntity(AreaDefine areaDefine) {
        if ( areaDefine == null ) {
            return null;
        }

        AreaDefineEntity.AreaDefineEntityBuilder areaDefineEntity = AreaDefineEntity.builder();

        areaDefineEntity.adIdx( areaDefine.getAdIdx() );
        areaDefineEntity.adParent( areaDefine.getAdParent() );
        areaDefineEntity.adAdministCode( areaDefine.getAdAdministCode() );
        areaDefineEntity.adSi( areaDefine.getAdSi() );
        areaDefineEntity.adShortSi( areaDefine.getAdShortSi() );
        areaDefineEntity.adGu( areaDefine.getAdGu() );
        areaDefineEntity.adDong( areaDefine.getAdDong() );
        areaDefineEntity.adLegalCode( areaDefine.getAdLegalCode() );
        areaDefineEntity.adDongName( areaDefine.getAdDongName() );
        areaDefineEntity.adCreateDate( areaDefine.getAdCreateDate() );
        areaDefineEntity.adIsExpressCost( areaDefine.getAdIsExpressCost() );

        return areaDefineEntity.build();
    }

    protected AreaDefine areaDefineEntityToAreaDefine(AreaDefineEntity areaDefineEntity) {
        if ( areaDefineEntity == null ) {
            return null;
        }

        AreaDefine.AreaDefineBuilder areaDefine = AreaDefine.builder();

        areaDefine.adIdx( areaDefineEntity.getAdIdx() );
        areaDefine.adParent( areaDefineEntity.getAdParent() );
        areaDefine.adAdministCode( areaDefineEntity.getAdAdministCode() );
        areaDefine.adSi( areaDefineEntity.getAdSi() );
        areaDefine.adShortSi( areaDefineEntity.getAdShortSi() );
        areaDefine.adGu( areaDefineEntity.getAdGu() );
        areaDefine.adDong( areaDefineEntity.getAdDong() );
        areaDefine.adLegalCode( areaDefineEntity.getAdLegalCode() );
        areaDefine.adDongName( areaDefineEntity.getAdDongName() );
        areaDefine.adCreateDate( areaDefineEntity.getAdCreateDate() );
        areaDefine.adIsExpressCost( areaDefineEntity.getAdIsExpressCost() );

        return areaDefine.build();
    }

    protected HashtagEntity hashtagToHashtagEntity(Hashtag hashtag) {
        if ( hashtag == null ) {
            return null;
        }

        HashtagEntity.HashtagEntityBuilder hashtagEntity = HashtagEntity.builder();

        hashtagEntity.htIdx( hashtag.getHtIdx() );
        hashtagEntity.name( hashtag.getName() );

        return hashtagEntity.build();
    }

    protected Hashtag hashtagEntityToHashtag(HashtagEntity hashtagEntity) {
        if ( hashtagEntity == null ) {
            return null;
        }

        Hashtag.HashtagBuilder<?, ?> hashtag = Hashtag.builder();

        hashtag.createdAt( hashtagEntity.getCreatedAt() );
        hashtag.updatedAt( hashtagEntity.getUpdatedAt() );
        hashtag.htIdx( hashtagEntity.getHtIdx() );
        hashtag.name( hashtagEntity.getName() );

        return hashtag.build();
    }
}
