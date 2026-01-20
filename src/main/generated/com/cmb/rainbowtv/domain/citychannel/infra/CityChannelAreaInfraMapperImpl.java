package com.cmb.rainbowtv.domain.citychannel.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelGenreEntity;
import com.cmb.rainbowtv.domain.channel.model.ChannelGenre;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelByAreaEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelCategoryEntity;
import com.cmb.rainbowtv.domain.citychannel.infra.data.entity.CityChannelEntity;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannel;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelByArea;
import com.cmb.rainbowtv.domain.citychannel.model.CityChannelCategory;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:48+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CityChannelAreaInfraMapperImpl implements CityChannelAreaInfraMapper {

    @Override
    public CityChannelByArea toCityChannelByArea(CityChannelByAreaEntity cityChannelByAreaEntity) {
        if ( cityChannelByAreaEntity == null ) {
            return null;
        }

        CityChannelByArea.CityChannelByAreaBuilder<?, ?> cityChannelByArea = CityChannelByArea.builder();

        cityChannelByArea.createdAt( cityChannelByAreaEntity.getCreatedAt() );
        cityChannelByArea.updatedAt( cityChannelByAreaEntity.getUpdatedAt() );
        cityChannelByArea.ccbaIdx( cityChannelByAreaEntity.getCcbaIdx() );
        cityChannelByArea.cityChannel( cityChannelEntityToCityChannel( cityChannelByAreaEntity.getCityChannel() ) );
        cityChannelByArea.areaDefine( areaDefineEntityToAreaDefine( cityChannelByAreaEntity.getAreaDefine() ) );
        cityChannelByArea.ccbaSi( cityChannelByAreaEntity.getCcbaSi() );

        return cityChannelByArea.build();
    }

    @Override
    public CityChannelByAreaEntity toCityChannelByAreaEntity(CityChannelByArea cityChannelArea) {
        if ( cityChannelArea == null ) {
            return null;
        }

        CityChannelByAreaEntity.CityChannelByAreaEntityBuilder cityChannelByAreaEntity = CityChannelByAreaEntity.builder();

        cityChannelByAreaEntity.ccbaIdx( cityChannelArea.getCcbaIdx() );
        cityChannelByAreaEntity.cityChannel( cityChannelToCityChannelEntity( cityChannelArea.getCityChannel() ) );
        cityChannelByAreaEntity.areaDefine( areaDefineToAreaDefineEntity( cityChannelArea.getAreaDefine() ) );
        cityChannelByAreaEntity.ccbaSi( cityChannelArea.getCcbaSi() );

        return cityChannelByAreaEntity.build();
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

    protected CityChannel cityChannelEntityToCityChannel(CityChannelEntity cityChannelEntity) {
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
        cityChannel.channelGenre( channelGenreEntityToChannelGenre( cityChannelEntity.getChannelGenre() ) );
        cityChannel.cityChannelCategory( cityChannelCategoryEntityToCityChannelCategory( cityChannelEntity.getCityChannelCategory() ) );
        cityChannel.ccUrl( cityChannelEntity.getCcUrl() );
        cityChannel.ccHlsUrl( cityChannelEntity.getCcHlsUrl() );
        cityChannel.ccDashUrl( cityChannelEntity.getCcDashUrl() );
        cityChannel.ccStatus( cityChannelEntity.getCcStatus() );
        cityChannel.ccDisplay( cityChannelEntity.getCcDisplay() );
        cityChannel.ccUse( cityChannelEntity.getCcUse() );

        return cityChannel.build();
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

    protected CityChannelCategoryEntity cityChannelCategoryToCityChannelCategoryEntity(CityChannelCategory cityChannelCategory) {
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

    protected CityChannelEntity cityChannelToCityChannelEntity(CityChannel cityChannel) {
        if ( cityChannel == null ) {
            return null;
        }

        CityChannelEntity.CityChannelEntityBuilder cityChannelEntity = CityChannelEntity.builder();

        cityChannelEntity.ccIdx( cityChannel.getCcIdx() );
        cityChannelEntity.ccUuid( cityChannel.getCcUuid() );
        cityChannelEntity.ccSeq( cityChannel.getCcSeq() );
        cityChannelEntity.ccIsAdult( cityChannel.getCcIsAdult() );
        cityChannelEntity.ccName( cityChannel.getCcName() );
        cityChannelEntity.member( memberToMemberEntity( cityChannel.getMember() ) );
        cityChannelEntity.channelGenre( channelGenreToChannelGenreEntity( cityChannel.getChannelGenre() ) );
        cityChannelEntity.cityChannelCategory( cityChannelCategoryToCityChannelCategoryEntity( cityChannel.getCityChannelCategory() ) );
        cityChannelEntity.ccUrl( cityChannel.getCcUrl() );
        cityChannelEntity.ccHlsUrl( cityChannel.getCcHlsUrl() );
        cityChannelEntity.ccDashUrl( cityChannel.getCcDashUrl() );
        cityChannelEntity.ccStatus( cityChannel.getCcStatus() );
        cityChannelEntity.ccDisplay( cityChannel.getCcDisplay() );
        cityChannelEntity.ccUse( cityChannel.getCcUse() );

        return cityChannelEntity.build();
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
}
