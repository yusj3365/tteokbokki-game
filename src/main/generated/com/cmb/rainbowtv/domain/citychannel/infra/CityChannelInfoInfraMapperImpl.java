package com.cmb.rainbowtv.domain.citychannel.infra;

import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdSetEntity;
import com.cmb.rainbowtv.domain.advertise.model.AdSet;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelGenreEntity;
import com.cmb.rainbowtv.domain.channel.model.ChannelGenre;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelAdEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelCategoryEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelProgramEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelProgramLinkEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelProgramPlayingEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelScheduleEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelScheduleFailEntity;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannel;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelAd;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelCategory;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelProgram;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelProgramLink;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelProgramPlaying;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelSchedule;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelScheduleFail;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:49+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CityChannelInfoInfraMapperImpl implements CityChannelInfoInfraMapper {

    @Override
    public CityChannel toCityChannel(CityChannelEntity CityChannelEntity) {
        if ( CityChannelEntity == null ) {
            return null;
        }

        CityChannel.CityChannelBuilder<?, ?> cityChannel = CityChannel.builder();

        cityChannel.createdAt( CityChannelEntity.getCreatedAt() );
        cityChannel.updatedAt( CityChannelEntity.getUpdatedAt() );
        cityChannel.ccIdx( CityChannelEntity.getCcIdx() );
        cityChannel.ccUuid( CityChannelEntity.getCcUuid() );
        cityChannel.ccSeq( CityChannelEntity.getCcSeq() );
        cityChannel.ccIsAdult( CityChannelEntity.getCcIsAdult() );
        cityChannel.ccName( CityChannelEntity.getCcName() );
        cityChannel.member( memberEntityToMember( CityChannelEntity.getMember() ) );
        cityChannel.channelGenre( channelGenreEntityToChannelGenre( CityChannelEntity.getChannelGenre() ) );
        cityChannel.cityChannelCategory( toCityChannelCategory( CityChannelEntity.getCityChannelCategory() ) );
        cityChannel.ccUrl( CityChannelEntity.getCcUrl() );
        cityChannel.ccHlsUrl( CityChannelEntity.getCcHlsUrl() );
        cityChannel.ccDashUrl( CityChannelEntity.getCcDashUrl() );
        cityChannel.ccStatus( CityChannelEntity.getCcStatus() );
        cityChannel.ccDisplay( CityChannelEntity.getCcDisplay() );
        cityChannel.ccUse( CityChannelEntity.getCcUse() );

        return cityChannel.build();
    }

    @Override
    public CityChannelEntity toCityChannelEntity(CityChannel ChannelInfo) {
        if ( ChannelInfo == null ) {
            return null;
        }

        CityChannelEntity.CityChannelEntityBuilder cityChannelEntity = CityChannelEntity.builder();

        cityChannelEntity.ccIdx( ChannelInfo.getCcIdx() );
        cityChannelEntity.ccUuid( ChannelInfo.getCcUuid() );
        cityChannelEntity.ccSeq( ChannelInfo.getCcSeq() );
        cityChannelEntity.ccIsAdult( ChannelInfo.getCcIsAdult() );
        cityChannelEntity.ccName( ChannelInfo.getCcName() );
        cityChannelEntity.member( memberToMemberEntity( ChannelInfo.getMember() ) );
        cityChannelEntity.channelGenre( channelGenreToChannelGenreEntity( ChannelInfo.getChannelGenre() ) );
        cityChannelEntity.cityChannelCategory( toCityChannelCategoryEntity( ChannelInfo.getCityChannelCategory() ) );
        cityChannelEntity.ccUrl( ChannelInfo.getCcUrl() );
        cityChannelEntity.ccHlsUrl( ChannelInfo.getCcHlsUrl() );
        cityChannelEntity.ccDashUrl( ChannelInfo.getCcDashUrl() );
        cityChannelEntity.ccStatus( ChannelInfo.getCcStatus() );
        cityChannelEntity.ccDisplay( ChannelInfo.getCcDisplay() );
        cityChannelEntity.ccUse( ChannelInfo.getCcUse() );

        return cityChannelEntity.build();
    }

    @Override
    public CityChannelCategoryEntity toCityChannelCategoryEntity(CityChannelCategory cityChannelCategory) {
        if ( cityChannelCategory == null ) {
            return null;
        }

        CityChannelCategoryEntity.CityChannelCategoryEntityBuilder cityChannelCategoryEntity = CityChannelCategoryEntity.builder();

        cityChannelCategoryEntity.cccIdx( cityChannelCategory.getCccIdx() );
        cityChannelCategoryEntity.cccSeq( cityChannelCategory.getCccSeq() );
        cityChannelCategoryEntity.cccName( cityChannelCategory.getCccName() );
        cityChannelCategoryEntity.cccDisplay( cityChannelCategory.getCccDisplay() );
        cityChannelCategoryEntity.deletedAt( cityChannelCategory.getDeletedAt() );

        return cityChannelCategoryEntity.build();
    }

    @Override
    public CityChannelCategory toCityChannelCategory(CityChannelCategoryEntity save) {
        if ( save == null ) {
            return null;
        }

        CityChannelCategory.CityChannelCategoryBuilder<?, ?> cityChannelCategory = CityChannelCategory.builder();

        cityChannelCategory.createdAt( save.getCreatedAt() );
        cityChannelCategory.updatedAt( save.getUpdatedAt() );
        cityChannelCategory.cccIdx( save.getCccIdx() );
        cityChannelCategory.cccSeq( save.getCccSeq() );
        cityChannelCategory.cccName( save.getCccName() );
        cityChannelCategory.cccDisplay( save.getCccDisplay() );
        cityChannelCategory.deletedAt( save.getDeletedAt() );

        return cityChannelCategory.build();
    }

    @Override
    public List<CityChannelProgramEntity> toProgramEntityList(List<CityChannelProgram> programs) {
        if ( programs == null ) {
            return null;
        }

        List<CityChannelProgramEntity> list = new ArrayList<CityChannelProgramEntity>( programs.size() );
        for ( CityChannelProgram cityChannelProgram : programs ) {
            list.add( toCityChannelProgramEntity( cityChannelProgram ) );
        }

        return list;
    }

    @Override
    public CityChannelAd toCityChannelAd(CityChannelAdEntity adSetEntity) {
        if ( adSetEntity == null ) {
            return null;
        }

        CityChannelAd.CityChannelAdBuilder<?, ?> cityChannelAd = CityChannelAd.builder();

        cityChannelAd.createdAt( adSetEntity.getCreatedAt() );
        cityChannelAd.updatedAt( adSetEntity.getUpdatedAt() );
        cityChannelAd.ccaIdx( adSetEntity.getCcaIdx() );
        cityChannelAd.cityChannel( toCityChannel( adSetEntity.getCityChannel() ) );
        cityChannelAd.adSet( adSetEntityToAdSet( adSetEntity.getAdSet() ) );
        cityChannelAd.ccaSeq( adSetEntity.getCcaSeq() );

        return cityChannelAd.build();
    }

    @Override
    public CityChannelProgram toCityChannelProgram(CityChannelProgramEntity cityChannelProgramEntity) {
        if ( cityChannelProgramEntity == null ) {
            return null;
        }

        CityChannelProgram.CityChannelProgramBuilder<?, ?> cityChannelProgram = CityChannelProgram.builder();

        cityChannelProgram.createdAt( cityChannelProgramEntity.getCreatedAt() );
        cityChannelProgram.updatedAt( cityChannelProgramEntity.getUpdatedAt() );
        cityChannelProgram.ccpIdx( cityChannelProgramEntity.getCcpIdx() );
        cityChannelProgram.cityChannel( toCityChannel( cityChannelProgramEntity.getCityChannel() ) );
        cityChannelProgram.ccpType( cityChannelProgramEntity.getCcpType() );
        cityChannelProgram.ccpKey( cityChannelProgramEntity.getCcpKey() );
        cityChannelProgram.ccpSeq( cityChannelProgramEntity.getCcpSeq() );
        cityChannelProgram.ccpUuid( cityChannelProgramEntity.getCcpUuid() );
        cityChannelProgram.ccpNext( cityChannelProgramEntity.getCcpNext() );

        return cityChannelProgram.build();
    }

    @Override
    public CityChannelProgramEntity toCityChannelProgramEntity(CityChannelProgram cityChannelProgram) {
        if ( cityChannelProgram == null ) {
            return null;
        }

        CityChannelProgramEntity.CityChannelProgramEntityBuilder cityChannelProgramEntity = CityChannelProgramEntity.builder();

        cityChannelProgramEntity.ccpIdx( cityChannelProgram.getCcpIdx() );
        cityChannelProgramEntity.cityChannel( toCityChannelEntity( cityChannelProgram.getCityChannel() ) );
        cityChannelProgramEntity.cityChannelAd( cityChannelAdToCityChannelAdEntity( cityChannelProgram.getCityChannelAd() ) );
        cityChannelProgramEntity.ccpType( cityChannelProgram.getCcpType() );
        cityChannelProgramEntity.ccpKey( cityChannelProgram.getCcpKey() );
        cityChannelProgramEntity.ccpSeq( cityChannelProgram.getCcpSeq() );
        cityChannelProgramEntity.ccpUuid( cityChannelProgram.getCcpUuid() );
        cityChannelProgramEntity.ccpNext( cityChannelProgram.getCcpNext() );

        return cityChannelProgramEntity.build();
    }

    @Override
    public List<CityChannelAdEntity> toAdEntityList(List<CityChannelAd> ads) {
        if ( ads == null ) {
            return null;
        }

        List<CityChannelAdEntity> list = new ArrayList<CityChannelAdEntity>( ads.size() );
        for ( CityChannelAd cityChannelAd : ads ) {
            list.add( cityChannelAdToCityChannelAdEntity( cityChannelAd ) );
        }

        return list;
    }

    @Override
    public CityChannelProgramPlayingEntity toCityChannelProgramPlayingEntity(CityChannelProgramPlaying cityChannelProgramPlaying) {
        if ( cityChannelProgramPlaying == null ) {
            return null;
        }

        CityChannelProgramPlayingEntity.CityChannelProgramPlayingEntityBuilder cityChannelProgramPlayingEntity = CityChannelProgramPlayingEntity.builder();

        cityChannelProgramPlayingEntity.ccppIdx( cityChannelProgramPlaying.getCcppIdx() );
        cityChannelProgramPlayingEntity.ccpUuid( cityChannelProgramPlaying.getCcpUuid() );
        cityChannelProgramPlayingEntity.channelName( cityChannelProgramPlaying.getChannelName() );
        cityChannelProgramPlayingEntity.ccppTime( cityChannelProgramPlaying.getCcppTime() );

        return cityChannelProgramPlayingEntity.build();
    }

    @Override
    public CityChannelScheduleEntity toCityChannelScheduleEntity(CityChannelSchedule cityChannelSchedule) {
        if ( cityChannelSchedule == null ) {
            return null;
        }

        CityChannelScheduleEntity.CityChannelScheduleEntityBuilder cityChannelScheduleEntity = CityChannelScheduleEntity.builder();

        cityChannelScheduleEntity.ccsIdx( cityChannelSchedule.getCcsIdx() );
        cityChannelScheduleEntity.cityChannel( toCityChannelEntity( cityChannelSchedule.getCityChannel() ) );
        byte[] ccData = cityChannelSchedule.getCcData();
        if ( ccData != null ) {
            cityChannelScheduleEntity.ccData( Arrays.copyOf( ccData, ccData.length ) );
        }

        return cityChannelScheduleEntity.build();
    }

    @Override
    public CityChannelScheduleFailEntity toCityChannelScheduleFail(CityChannelScheduleFail cityChannelScheduleFail) {
        if ( cityChannelScheduleFail == null ) {
            return null;
        }

        CityChannelScheduleFailEntity.CityChannelScheduleFailEntityBuilder cityChannelScheduleFailEntity = CityChannelScheduleFailEntity.builder();

        cityChannelScheduleFailEntity.ccsfIdx( cityChannelScheduleFail.getCcsfIdx() );
        cityChannelScheduleFailEntity.cityChannel( toCityChannelEntity( cityChannelScheduleFail.getCityChannel() ) );
        cityChannelScheduleFailEntity.ccUuid( cityChannelScheduleFail.getCcUuid() );

        return cityChannelScheduleFailEntity.build();
    }

    @Override
    public CityChannelProgramLinkEntity toCityChannelProgramLinkEntity(CityChannelProgramLink cityChannelProgramLink) {
        if ( cityChannelProgramLink == null ) {
            return null;
        }

        CityChannelProgramLinkEntity.CityChannelProgramLinkEntityBuilder cityChannelProgramLinkEntity = CityChannelProgramLinkEntity.builder();

        cityChannelProgramLinkEntity.ccplIdx( cityChannelProgramLink.getCcplIdx() );
        cityChannelProgramLinkEntity.cityChannelProgram( toCityChannelProgramEntity( cityChannelProgramLink.getCityChannelProgram() ) );
        cityChannelProgramLinkEntity.programLinkTypeEnum( cityChannelProgramLink.getProgramLinkTypeEnum() );
        cityChannelProgramLinkEntity.ccplStartTime( cityChannelProgramLink.getCcplStartTime() );
        cityChannelProgramLinkEntity.ccplStayTime( cityChannelProgramLink.getCcplStayTime() );
        cityChannelProgramLinkEntity.ccplText( cityChannelProgramLink.getCcplText() );
        cityChannelProgramLinkEntity.ccplUrl( cityChannelProgramLink.getCcplUrl() );
        cityChannelProgramLinkEntity.ccplMedia( cityChannelProgramLink.getCcplMedia() );

        return cityChannelProgramLinkEntity.build();
    }

    @Override
    public CityChannelProgramLink toCityChannelProgramLink(CityChannelProgramLinkEntity cityChannelProgramLinkEntity) {
        if ( cityChannelProgramLinkEntity == null ) {
            return null;
        }

        CityChannelProgramLink.CityChannelProgramLinkBuilder<?, ?> cityChannelProgramLink = CityChannelProgramLink.builder();

        cityChannelProgramLink.createdAt( cityChannelProgramLinkEntity.getCreatedAt() );
        cityChannelProgramLink.updatedAt( cityChannelProgramLinkEntity.getUpdatedAt() );
        cityChannelProgramLink.ccplIdx( cityChannelProgramLinkEntity.getCcplIdx() );
        cityChannelProgramLink.cityChannelProgram( toCityChannelProgram( cityChannelProgramLinkEntity.getCityChannelProgram() ) );
        cityChannelProgramLink.programLinkTypeEnum( cityChannelProgramLinkEntity.getProgramLinkTypeEnum() );
        cityChannelProgramLink.ccplStartTime( cityChannelProgramLinkEntity.getCcplStartTime() );
        cityChannelProgramLink.ccplStayTime( cityChannelProgramLinkEntity.getCcplStayTime() );
        cityChannelProgramLink.ccplText( cityChannelProgramLinkEntity.getCcplText() );
        cityChannelProgramLink.ccplUrl( cityChannelProgramLinkEntity.getCcplUrl() );
        cityChannelProgramLink.ccplMedia( cityChannelProgramLinkEntity.getCcplMedia() );

        return cityChannelProgramLink.build();
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

    protected ChannelGenreEntity channelGenreToChannelGenreEntity(ChannelGenre channelGenre) {
        if ( channelGenre == null ) {
            return null;
        }

        ChannelGenreEntity.ChannelGenreEntityBuilder channelGenreEntity = ChannelGenreEntity.builder();

        channelGenreEntity.cgIdx( channelGenre.getCgIdx() );
        channelGenreEntity.cgName( channelGenre.getCgName() );

        return channelGenreEntity.build();
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

    protected AdSetEntity adSetToAdSetEntity(AdSet adSet) {
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

    protected CityChannelAdEntity cityChannelAdToCityChannelAdEntity(CityChannelAd cityChannelAd) {
        if ( cityChannelAd == null ) {
            return null;
        }

        CityChannelAdEntity.CityChannelAdEntityBuilder cityChannelAdEntity = CityChannelAdEntity.builder();

        cityChannelAdEntity.ccaIdx( cityChannelAd.getCcaIdx() );
        cityChannelAdEntity.cityChannel( toCityChannelEntity( cityChannelAd.getCityChannel() ) );
        cityChannelAdEntity.adSet( adSetToAdSetEntity( cityChannelAd.getAdSet() ) );
        cityChannelAdEntity.ccaSeq( cityChannelAd.getCcaSeq() );

        return cityChannelAdEntity.build();
    }
}
