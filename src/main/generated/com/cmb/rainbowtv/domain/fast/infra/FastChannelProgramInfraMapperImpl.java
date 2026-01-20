package com.cmb.rainbowtv.domain.fast.infra;

import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdSetEntity;
import com.cmb.rainbowtv.domain.advertise.model.AdSet;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelGenreEntity;
import com.cmb.rainbowtv.domain.channel.model.ChannelGenre;
import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastChannelAdEntity;
import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastChannelEntity;
import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastChannelProgramEntity;
import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastChannelProgramLinkEntity;
import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastChannelProgramPlayingEntity;
import com.cmb.rainbowtv.domain.fast.model.FastChannel;
import com.cmb.rainbowtv.domain.fast.model.FastChannelAd;
import com.cmb.rainbowtv.domain.fast.model.FastChannelProgram;
import com.cmb.rainbowtv.domain.fast.model.FastChannelProgramLink;
import com.cmb.rainbowtv.domain.fast.model.FastChannelProgramPlaying;
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
public class FastChannelProgramInfraMapperImpl implements FastChannelProgramInfraMapper {

    @Override
    public FastChannelProgram toFastChannelProgram(FastChannelProgramEntity fastChannelProgramEntity) {
        if ( fastChannelProgramEntity == null ) {
            return null;
        }

        FastChannelProgram.FastChannelProgramBuilder<?, ?> fastChannelProgram = FastChannelProgram.builder();

        fastChannelProgram.createdAt( fastChannelProgramEntity.getCreatedAt() );
        fastChannelProgram.updatedAt( fastChannelProgramEntity.getUpdatedAt() );
        fastChannelProgram.fcpIdx( fastChannelProgramEntity.getFcpIdx() );
        fastChannelProgram.fastChannel( fastChannelEntityToFastChannel( fastChannelProgramEntity.getFastChannel() ) );
        fastChannelProgram.fastChannelAd( fastChannelAdEntityToFastChannelAd( fastChannelProgramEntity.getFastChannelAd() ) );
        fastChannelProgram.fcpType( fastChannelProgramEntity.getFcpType() );
        fastChannelProgram.fcpKey( fastChannelProgramEntity.getFcpKey() );
        fastChannelProgram.fcpSeq( fastChannelProgramEntity.getFcpSeq() );
        fastChannelProgram.fcpUuid( fastChannelProgramEntity.getFcpUuid() );
        fastChannelProgram.fcpNext( fastChannelProgramEntity.getFcpNext() );
        fastChannelProgram.fmIdx( fastChannelProgramEntity.getFmIdx() );

        return fastChannelProgram.build();
    }

    @Override
    public FastChannelProgramEntity toFastChannelProgramEntity(FastChannelProgram fastChannelProgram) {
        if ( fastChannelProgram == null ) {
            return null;
        }

        FastChannelProgramEntity.FastChannelProgramEntityBuilder fastChannelProgramEntity = FastChannelProgramEntity.builder();

        fastChannelProgramEntity.fcpIdx( fastChannelProgram.getFcpIdx() );
        fastChannelProgramEntity.fastChannel( fastChannelToFastChannelEntity( fastChannelProgram.getFastChannel() ) );
        fastChannelProgramEntity.fastChannelAd( fastChannelAdToFastChannelAdEntity( fastChannelProgram.getFastChannelAd() ) );
        fastChannelProgramEntity.fcpType( fastChannelProgram.getFcpType() );
        fastChannelProgramEntity.fcpKey( fastChannelProgram.getFcpKey() );
        fastChannelProgramEntity.fcpSeq( fastChannelProgram.getFcpSeq() );
        fastChannelProgramEntity.fcpUuid( fastChannelProgram.getFcpUuid() );
        fastChannelProgramEntity.fcpNext( fastChannelProgram.getFcpNext() );
        fastChannelProgramEntity.fmIdx( fastChannelProgram.getFmIdx() );

        return fastChannelProgramEntity.build();
    }

    @Override
    public FastChannelProgram toFastChannelProgramWithIgnore(FastChannelProgramEntity fastChannelProgramEntity) {
        if ( fastChannelProgramEntity == null ) {
            return null;
        }

        FastChannelProgram.FastChannelProgramBuilder<?, ?> fastChannelProgram = FastChannelProgram.builder();

        fastChannelProgram.createdAt( fastChannelProgramEntity.getCreatedAt() );
        fastChannelProgram.updatedAt( fastChannelProgramEntity.getUpdatedAt() );
        fastChannelProgram.fcpIdx( fastChannelProgramEntity.getFcpIdx() );
        fastChannelProgram.fastChannel( fastChannelEntityToFastChannel( fastChannelProgramEntity.getFastChannel() ) );
        fastChannelProgram.fcpType( fastChannelProgramEntity.getFcpType() );
        fastChannelProgram.fcpKey( fastChannelProgramEntity.getFcpKey() );
        fastChannelProgram.fcpSeq( fastChannelProgramEntity.getFcpSeq() );
        fastChannelProgram.fcpUuid( fastChannelProgramEntity.getFcpUuid() );
        fastChannelProgram.fcpNext( fastChannelProgramEntity.getFcpNext() );
        fastChannelProgram.fmIdx( fastChannelProgramEntity.getFmIdx() );

        return fastChannelProgram.build();
    }

    @Override
    public List<FastChannelProgram> toProgramList(List<FastChannelProgramEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FastChannelProgram> list = new ArrayList<FastChannelProgram>( entities.size() );
        for ( FastChannelProgramEntity fastChannelProgramEntity : entities ) {
            list.add( toFastChannelProgram( fastChannelProgramEntity ) );
        }

        return list;
    }

    @Override
    public List<FastChannelProgramEntity> toProgramEntityList(List<FastChannelProgram> models) {
        if ( models == null ) {
            return null;
        }

        List<FastChannelProgramEntity> list = new ArrayList<FastChannelProgramEntity>( models.size() );
        for ( FastChannelProgram fastChannelProgram : models ) {
            list.add( toFastChannelProgramEntity( fastChannelProgram ) );
        }

        return list;
    }

    @Override
    public FastChannelProgramPlayingEntity toFastChannelProgramPlayingEntity(FastChannelProgramPlaying fastChannelProgramPlaying) {
        if ( fastChannelProgramPlaying == null ) {
            return null;
        }

        FastChannelProgramPlayingEntity.FastChannelProgramPlayingEntityBuilder fastChannelProgramPlayingEntity = FastChannelProgramPlayingEntity.builder();

        fastChannelProgramPlayingEntity.fcppIdx( fastChannelProgramPlaying.getFcppIdx() );
        fastChannelProgramPlayingEntity.fcpUuid( fastChannelProgramPlaying.getFcpUuid() );
        fastChannelProgramPlayingEntity.channelName( fastChannelProgramPlaying.getChannelName() );
        fastChannelProgramPlayingEntity.fcppTime( fastChannelProgramPlaying.getFcppTime() );

        return fastChannelProgramPlayingEntity.build();
    }

    @Override
    public FastChannelProgramLinkEntity toFastChannelProgramLinkEntity(FastChannelProgramLink fastChannelProgramLink) {
        if ( fastChannelProgramLink == null ) {
            return null;
        }

        FastChannelProgramLinkEntity.FastChannelProgramLinkEntityBuilder fastChannelProgramLinkEntity = FastChannelProgramLinkEntity.builder();

        fastChannelProgramLinkEntity.fcplIdx( fastChannelProgramLink.getFcplIdx() );
        fastChannelProgramLinkEntity.fastChannelProgram( toFastChannelProgramEntity( fastChannelProgramLink.getFastChannelProgram() ) );
        fastChannelProgramLinkEntity.programLinkTypeEnum( fastChannelProgramLink.getProgramLinkTypeEnum() );
        fastChannelProgramLinkEntity.fcplStartTime( fastChannelProgramLink.getFcplStartTime() );
        fastChannelProgramLinkEntity.fcplStayTime( fastChannelProgramLink.getFcplStayTime() );
        fastChannelProgramLinkEntity.fcplText( fastChannelProgramLink.getFcplText() );
        fastChannelProgramLinkEntity.fcplUrl( fastChannelProgramLink.getFcplUrl() );
        fastChannelProgramLinkEntity.fcplMedia( fastChannelProgramLink.getFcplMedia() );

        return fastChannelProgramLinkEntity.build();
    }

    @Override
    public FastChannelProgramLink toFastChannelProgramLink(FastChannelProgramLinkEntity fastChannelProgramLinkEntity) {
        if ( fastChannelProgramLinkEntity == null ) {
            return null;
        }

        FastChannelProgramLink.FastChannelProgramLinkBuilder<?, ?> fastChannelProgramLink = FastChannelProgramLink.builder();

        fastChannelProgramLink.createdAt( fastChannelProgramLinkEntity.getCreatedAt() );
        fastChannelProgramLink.updatedAt( fastChannelProgramLinkEntity.getUpdatedAt() );
        fastChannelProgramLink.fcplIdx( fastChannelProgramLinkEntity.getFcplIdx() );
        fastChannelProgramLink.fastChannelProgram( toFastChannelProgram( fastChannelProgramLinkEntity.getFastChannelProgram() ) );
        fastChannelProgramLink.programLinkTypeEnum( fastChannelProgramLinkEntity.getProgramLinkTypeEnum() );
        fastChannelProgramLink.fcplStartTime( fastChannelProgramLinkEntity.getFcplStartTime() );
        fastChannelProgramLink.fcplStayTime( fastChannelProgramLinkEntity.getFcplStayTime() );
        fastChannelProgramLink.fcplText( fastChannelProgramLinkEntity.getFcplText() );
        fastChannelProgramLink.fcplUrl( fastChannelProgramLinkEntity.getFcplUrl() );
        fastChannelProgramLink.fcplMedia( fastChannelProgramLinkEntity.getFcplMedia() );

        return fastChannelProgramLink.build();
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

    protected FastChannel fastChannelEntityToFastChannel(FastChannelEntity fastChannelEntity) {
        if ( fastChannelEntity == null ) {
            return null;
        }

        FastChannel.FastChannelBuilder<?, ?> fastChannel = FastChannel.builder();

        fastChannel.createdAt( fastChannelEntity.getCreatedAt() );
        fastChannel.updatedAt( fastChannelEntity.getUpdatedAt() );
        fastChannel.fcIdx( fastChannelEntity.getFcIdx() );
        fastChannel.fcUuid( fastChannelEntity.getFcUuid() );
        if ( fastChannelEntity.getFcSeq() != null ) {
            fastChannel.fcSeq( fastChannelEntity.getFcSeq().intValue() );
        }
        fastChannel.fcIsAdult( fastChannelEntity.getFcIsAdult() );
        fastChannel.fcName( fastChannelEntity.getFcName() );
        fastChannel.member( memberEntityToMember( fastChannelEntity.getMember() ) );
        fastChannel.channelGenre( channelGenreEntityToChannelGenre( fastChannelEntity.getChannelGenre() ) );
        fastChannel.fcUrl( fastChannelEntity.getFcUrl() );
        fastChannel.fcHlsUrl( fastChannelEntity.getFcHlsUrl() );
        fastChannel.fcDashUrl( fastChannelEntity.getFcDashUrl() );
        fastChannel.fcStatus( fastChannelEntity.getFcStatus() );
        fastChannel.fcDisplay( fastChannelEntity.getFcDisplay() );
        fastChannel.fcUse( fastChannelEntity.getFcUse() );

        return fastChannel.build();
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

    protected FastChannelAd fastChannelAdEntityToFastChannelAd(FastChannelAdEntity fastChannelAdEntity) {
        if ( fastChannelAdEntity == null ) {
            return null;
        }

        FastChannelAd.FastChannelAdBuilder<?, ?> fastChannelAd = FastChannelAd.builder();

        fastChannelAd.createdAt( fastChannelAdEntity.getCreatedAt() );
        fastChannelAd.updatedAt( fastChannelAdEntity.getUpdatedAt() );
        fastChannelAd.fcaIdx( fastChannelAdEntity.getFcaIdx() );
        fastChannelAd.fastChannel( fastChannelEntityToFastChannel( fastChannelAdEntity.getFastChannel() ) );
        fastChannelAd.adSet( adSetEntityToAdSet( fastChannelAdEntity.getAdSet() ) );
        fastChannelAd.fcaSeq( fastChannelAdEntity.getFcaSeq() );

        return fastChannelAd.build();
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

    protected FastChannelEntity fastChannelToFastChannelEntity(FastChannel fastChannel) {
        if ( fastChannel == null ) {
            return null;
        }

        FastChannelEntity.FastChannelEntityBuilder fastChannelEntity = FastChannelEntity.builder();

        fastChannelEntity.fcIdx( fastChannel.getFcIdx() );
        fastChannelEntity.fcUuid( fastChannel.getFcUuid() );
        if ( fastChannel.getFcSeq() != null ) {
            fastChannelEntity.fcSeq( fastChannel.getFcSeq().longValue() );
        }
        fastChannelEntity.fcIsAdult( fastChannel.getFcIsAdult() );
        fastChannelEntity.fcName( fastChannel.getFcName() );
        fastChannelEntity.member( memberToMemberEntity( fastChannel.getMember() ) );
        fastChannelEntity.channelGenre( channelGenreToChannelGenreEntity( fastChannel.getChannelGenre() ) );
        fastChannelEntity.fcUrl( fastChannel.getFcUrl() );
        fastChannelEntity.fcHlsUrl( fastChannel.getFcHlsUrl() );
        fastChannelEntity.fcDashUrl( fastChannel.getFcDashUrl() );
        fastChannelEntity.fcStatus( fastChannel.getFcStatus() );
        fastChannelEntity.fcDisplay( fastChannel.getFcDisplay() );
        fastChannelEntity.fcUse( fastChannel.getFcUse() );

        return fastChannelEntity.build();
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

    protected FastChannelAdEntity fastChannelAdToFastChannelAdEntity(FastChannelAd fastChannelAd) {
        if ( fastChannelAd == null ) {
            return null;
        }

        FastChannelAdEntity.FastChannelAdEntityBuilder fastChannelAdEntity = FastChannelAdEntity.builder();

        fastChannelAdEntity.fcaIdx( fastChannelAd.getFcaIdx() );
        fastChannelAdEntity.fastChannel( fastChannelToFastChannelEntity( fastChannelAd.getFastChannel() ) );
        fastChannelAdEntity.adSet( adSetToAdSetEntity( fastChannelAd.getAdSet() ) );
        fastChannelAdEntity.fcaSeq( fastChannelAd.getFcaSeq() );

        return fastChannelAdEntity.build();
    }
}
