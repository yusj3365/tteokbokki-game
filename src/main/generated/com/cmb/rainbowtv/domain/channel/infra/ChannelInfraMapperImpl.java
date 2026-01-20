package com.cmb.rainbowtv.domain.channel.infra;

import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdSetEntity;
import com.cmb.rainbowtv.domain.advertise.model.AdSet;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelBundleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelByBundleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelGenreEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelInfoEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelPriceEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelScheduleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelSettingEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelTypeEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelBundle;
import com.cmb.rainbowtv.domain.channel.model.ChannelByBundle;
import com.cmb.rainbowtv.domain.channel.model.ChannelGenre;
import com.cmb.rainbowtv.domain.channel.model.ChannelInfo;
import com.cmb.rainbowtv.domain.channel.model.ChannelPrice;
import com.cmb.rainbowtv.domain.channel.model.ChannelSchedule;
import com.cmb.rainbowtv.domain.channel.model.ChannelSetting;
import com.cmb.rainbowtv.domain.channel.model.ChannelType;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelAdEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelCategoryEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelEntity;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannel;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelAd;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelCategory;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ChannelInfraMapperImpl implements ChannelInfraMapper {

    @Override
    public Channel toChannel(ChannelEntity channelEntity) {
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

    @Override
    public ChannelEntity toChannelEntity(Channel channel) {
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

    @Override
    public ChannelType toChannelType(ChannelTypeEntity channelTypeEntity) {
        if ( channelTypeEntity == null ) {
            return null;
        }

        ChannelType.ChannelTypeBuilder<?, ?> channelType = ChannelType.builder();

        channelType.ctIdx( channelTypeEntity.getCtIdx() );
        channelType.channel( toChannel( channelTypeEntity.getChannel() ) );
        channelType.ctType( channelTypeEntity.getCtType() );

        return channelType.build();
    }

    @Override
    public ChannelInfo toChannelInfo(ChannelInfoEntity channelInfo) {
        if ( channelInfo == null ) {
            return null;
        }

        ChannelInfo.ChannelInfoBuilder<?, ?> channelInfo1 = ChannelInfo.builder();

        channelInfo1.createdAt( channelInfo.getCreatedAt() );
        channelInfo1.updatedAt( channelInfo.getUpdatedAt() );
        channelInfo1.ciIdx( channelInfo.getCiIdx() );
        channelInfo1.channel( toChannel( channelInfo.getChannel() ) );
        channelInfo1.ciEpg( channelInfo.getCiEpg() );
        channelInfo1.ciBlackout( channelInfo.getCiBlackout() );
        channelInfo1.ciName( channelInfo.getCiName() );
        channelInfo1.ciStatus( channelInfo.getCiStatus() );
        channelInfo1.ciIsLive( channelInfo.getCiIsLive() );
        channelInfo1.ciSeq( channelInfo.getCiSeq() );
        channelInfo1.ciIsAdult( channelInfo.getCiIsAdult() );
        channelInfo1.ciIsPay( channelInfo.getCiIsPay() );
        channelInfo1.channelGenre( toChannelGenre( channelInfo.getChannelGenre() ) );
        channelInfo1.ciType( channelInfo.getCiType() );
        channelInfo1.ciFeeType( channelInfo.getCiFeeType() );
        channelInfo1.ciFee( channelInfo.getCiFee() );
        channelInfo1.ciInvest( channelInfo.getCiInvest() );

        return channelInfo1.build();
    }

    @Override
    public ChannelGenre toChannelGenre(ChannelGenreEntity channelGenre) {
        if ( channelGenre == null ) {
            return null;
        }

        ChannelGenre.ChannelGenreBuilder<?, ?> channelGenre1 = ChannelGenre.builder();

        channelGenre1.createdAt( channelGenre.getCreatedAt() );
        channelGenre1.updatedAt( channelGenre.getUpdatedAt() );
        channelGenre1.cgIdx( channelGenre.getCgIdx() );
        channelGenre1.cgName( channelGenre.getCgName() );

        return channelGenre1.build();
    }

    @Override
    public ChannelSetting toChannelSetting(ChannelSettingEntity channelSettingEntity) {
        if ( channelSettingEntity == null ) {
            return null;
        }

        ChannelSetting.ChannelSettingBuilder channelSetting = ChannelSetting.builder();

        channelSetting.csIdx( channelSettingEntity.getCsIdx() );
        channelSetting.csType( channelSettingEntity.getCsType() );
        channelSetting.csDisplay( channelSettingEntity.getCsDisplay() );

        return channelSetting.build();
    }

    @Override
    public ChannelSchedule toChannelSchedule(ChannelScheduleEntity channelScheduleEntity) {
        if ( channelScheduleEntity == null ) {
            return null;
        }

        ChannelSchedule.ChannelScheduleBuilder<?, ?> channelSchedule = ChannelSchedule.builder();

        channelSchedule.createdAt( channelScheduleEntity.getCreatedAt() );
        channelSchedule.updatedAt( channelScheduleEntity.getUpdatedAt() );
        channelSchedule.csIdx( channelScheduleEntity.getCsIdx() );
        channelSchedule.channel( toChannel( channelScheduleEntity.getChannel() ) );
        channelSchedule.csName( channelScheduleEntity.getCsName() );
        channelSchedule.csStartTime( channelScheduleEntity.getCsStartTime() );
        channelSchedule.csEndTime( channelScheduleEntity.getCsEndTime() );
        channelSchedule.csSynopsis( channelScheduleEntity.getCsSynopsis() );
        channelSchedule.csDirector( channelScheduleEntity.getCsDirector() );
        channelSchedule.csActor( channelScheduleEntity.getCsActor() );
        channelSchedule.csBlock( channelScheduleEntity.getCsBlock() );

        return channelSchedule.build();
    }

    @Override
    public ChannelBundle toChannelBundle(ChannelBundleEntity channelBundleEntity) {
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

    @Override
    public ChannelBundleEntity toChannelBundleEntity(ChannelBundle channelBundle) {
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

    @Override
    public CityChannelAd toCityChannelAd(CityChannelAdEntity cityChannelAdEntity) {
        if ( cityChannelAdEntity == null ) {
            return null;
        }

        CityChannelAd.CityChannelAdBuilder<?, ?> cityChannelAd = CityChannelAd.builder();

        cityChannelAd.createdAt( cityChannelAdEntity.getCreatedAt() );
        cityChannelAd.updatedAt( cityChannelAdEntity.getUpdatedAt() );
        cityChannelAd.ccaIdx( cityChannelAdEntity.getCcaIdx() );
        cityChannelAd.cityChannel( toCityChannel( cityChannelAdEntity.getCityChannel() ) );
        cityChannelAd.adSet( adSetEntityToAdSet( cityChannelAdEntity.getAdSet() ) );
        cityChannelAd.ccaSeq( cityChannelAdEntity.getCcaSeq() );

        return cityChannelAd.build();
    }

    @Override
    public List<Channel> toChannelList(List<ChannelEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Channel> list1 = new ArrayList<Channel>( list.size() );
        for ( ChannelEntity channelEntity : list ) {
            list1.add( toChannel( channelEntity ) );
        }

        return list1;
    }

    @Override
    public List<ChannelBundle> toChannelBundleList(List<ChannelBundleEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<ChannelBundle> list = new ArrayList<ChannelBundle>( allById.size() );
        for ( ChannelBundleEntity channelBundleEntity : allById ) {
            list.add( toChannelBundle( channelBundleEntity ) );
        }

        return list;
    }

    @Override
    public CityChannel toCityChannel(CityChannelEntity cityChannelEntity) {
        if ( cityChannelEntity == null ) {
            return null;
        }

        CityChannel.CityChannelBuilder<?, ?> cityChannel = CityChannel.builder();

        cityChannel.createdAt( cityChannelEntity.getCreatedAt() );
        cityChannel.updatedAt( cityChannelEntity.getUpdatedAt() );
        cityChannel.ccIdx( cityChannelEntity.getCcIdx() );
        cityChannel.ccUuid( cityChannelEntity.getCcUuid() );
        cityChannel.ccSeq( cityChannelEntity.getCcSeq() );
        cityChannel.ccIsAdult( cityChannelEntity.getCcIsAdult() );
        cityChannel.ccName( cityChannelEntity.getCcName() );
        cityChannel.member( memberEntityToMember( cityChannelEntity.getMember() ) );
        cityChannel.channelGenre( toChannelGenre( cityChannelEntity.getChannelGenre() ) );
        cityChannel.cityChannelCategory( cityChannelCategoryEntityToCityChannelCategory( cityChannelEntity.getCityChannelCategory() ) );
        cityChannel.ccUrl( cityChannelEntity.getCcUrl() );
        cityChannel.ccHlsUrl( cityChannelEntity.getCcHlsUrl() );
        cityChannel.ccDashUrl( cityChannelEntity.getCcDashUrl() );
        cityChannel.ccStatus( cityChannelEntity.getCcStatus() );
        cityChannel.ccDisplay( cityChannelEntity.getCcDisplay() );
        cityChannel.ccUse( cityChannelEntity.getCcUse() );

        return cityChannel.build();
    }

    @Override
    public ChannelSettingEntity toChannelSettingEntity(ChannelSetting channelSetting) {
        if ( channelSetting == null ) {
            return null;
        }

        ChannelSettingEntity.ChannelSettingEntityBuilder channelSettingEntity = ChannelSettingEntity.builder();

        channelSettingEntity.csIdx( channelSetting.getCsIdx() );
        channelSettingEntity.csType( channelSetting.getCsType() );
        channelSettingEntity.csDisplay( channelSetting.getCsDisplay() );

        return channelSettingEntity.build();
    }

    @Override
    public ChannelInfoEntity toChannelInfoEntity(ChannelInfo channelInfo) {
        if ( channelInfo == null ) {
            return null;
        }

        ChannelInfoEntity.ChannelInfoEntityBuilder channelInfoEntity = ChannelInfoEntity.builder();

        channelInfoEntity.ciIdx( channelInfo.getCiIdx() );
        channelInfoEntity.channel( toChannelEntity( channelInfo.getChannel() ) );
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

    @Override
    public ChannelScheduleEntity toChannelScheduleEntity(ChannelSchedule channelSchedule) {
        if ( channelSchedule == null ) {
            return null;
        }

        ChannelScheduleEntity.ChannelScheduleEntityBuilder channelScheduleEntity = ChannelScheduleEntity.builder();

        channelScheduleEntity.csIdx( channelSchedule.getCsIdx() );
        channelScheduleEntity.channel( toChannelEntity( channelSchedule.getChannel() ) );
        channelScheduleEntity.csName( channelSchedule.getCsName() );
        channelScheduleEntity.csStartTime( channelSchedule.getCsStartTime() );
        channelScheduleEntity.csEndTime( channelSchedule.getCsEndTime() );
        channelScheduleEntity.csSynopsis( channelSchedule.getCsSynopsis() );
        channelScheduleEntity.csDirector( channelSchedule.getCsDirector() );
        channelScheduleEntity.csActor( channelSchedule.getCsActor() );
        channelScheduleEntity.csBlock( channelSchedule.getCsBlock() );

        return channelScheduleEntity.build();
    }

    @Override
    public ChannelByBundleEntity toChannelByBundleEntity(ChannelEntity channelEntity, ChannelBundleEntity channelBundleEntity) {
        if ( channelEntity == null && channelBundleEntity == null ) {
            return null;
        }

        ChannelByBundleEntity.ChannelByBundleEntityBuilder channelByBundleEntity = ChannelByBundleEntity.builder();

        channelByBundleEntity.channel( channelEntity );
        channelByBundleEntity.channelBundle( channelBundleEntity );

        return channelByBundleEntity.build();
    }

    @Override
    public List<ChannelByBundle> toChannelByBundleList(List<ChannelByBundleEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ChannelByBundle> list1 = new ArrayList<ChannelByBundle>( list.size() );
        for ( ChannelByBundleEntity channelByBundleEntity : list ) {
            list1.add( channelByBundleEntityToChannelByBundle( channelByBundleEntity ) );
        }

        return list1;
    }

    @Override
    public ChannelByBundleEntity toChannelByBundleEntityModel(ChannelByBundle channelByBundle) {
        if ( channelByBundle == null ) {
            return null;
        }

        ChannelByBundleEntity.ChannelByBundleEntityBuilder channelByBundleEntity = ChannelByBundleEntity.builder();

        channelByBundleEntity.cbbIdx( channelByBundle.getCbbIdx() );
        channelByBundleEntity.channelBundle( toChannelBundleEntity( channelByBundle.getChannelBundle() ) );
        channelByBundleEntity.channel( toChannelEntity( channelByBundle.getChannel() ) );

        return channelByBundleEntity.build();
    }

    @Override
    public ChannelPriceEntity toChannelPriceEntity(ChannelPrice channelPrice) {
        if ( channelPrice == null ) {
            return null;
        }

        ChannelPriceEntity.ChannelPriceEntityBuilder channelPriceEntity = ChannelPriceEntity.builder();

        channelPriceEntity.cpIdx( channelPrice.getCpIdx() );
        channelPriceEntity.channel( toChannelEntity( channelPrice.getChannel() ) );
        channelPriceEntity.cpPrice( channelPrice.getCpPrice() );

        return channelPriceEntity.build();
    }

    @Override
    public ChannelPrice toChannelPrice(ChannelPriceEntity channelPriceEntity) {
        if ( channelPriceEntity == null ) {
            return null;
        }

        ChannelPrice.ChannelPriceBuilder<?, ?> channelPrice = ChannelPrice.builder();

        channelPrice.cpIdx( channelPriceEntity.getCpIdx() );
        channelPrice.channel( toChannel( channelPriceEntity.getChannel() ) );
        channelPrice.cpPrice( channelPriceEntity.getCpPrice() );

        return channelPrice.build();
    }

    protected AdSet adSetEntityToAdSet(AdSetEntity adSetEntity) {
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

    protected CityChannelCategory cityChannelCategoryEntityToCityChannelCategory(CityChannelCategoryEntity cityChannelCategoryEntity) {
        if ( cityChannelCategoryEntity == null ) {
            return null;
        }

        CityChannelCategory.CityChannelCategoryBuilder<?, ?> cityChannelCategory = CityChannelCategory.builder();

        cityChannelCategory.createdAt( cityChannelCategoryEntity.getCreatedAt() );
        cityChannelCategory.updatedAt( cityChannelCategoryEntity.getUpdatedAt() );
        cityChannelCategory.cccIdx( cityChannelCategoryEntity.getCccIdx() );
        cityChannelCategory.cccSeq( cityChannelCategoryEntity.getCccSeq() );
        cityChannelCategory.cccName( cityChannelCategoryEntity.getCccName() );
        cityChannelCategory.cccDisplay( cityChannelCategoryEntity.getCccDisplay() );
        cityChannelCategory.deletedAt( cityChannelCategoryEntity.getDeletedAt() );

        return cityChannelCategory.build();
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

    protected ChannelByBundle channelByBundleEntityToChannelByBundle(ChannelByBundleEntity channelByBundleEntity) {
        if ( channelByBundleEntity == null ) {
            return null;
        }

        ChannelByBundle.ChannelByBundleBuilder<?, ?> channelByBundle = ChannelByBundle.builder();

        channelByBundle.cbbIdx( channelByBundleEntity.getCbbIdx() );
        channelByBundle.channelBundle( toChannelBundle( channelByBundleEntity.getChannelBundle() ) );
        channelByBundle.channel( toChannel( channelByBundleEntity.getChannel() ) );

        return channelByBundle.build();
    }
}
