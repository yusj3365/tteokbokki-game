package com.cmb.rainbowtv.domain.banner.infra;

import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerByAgeEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerByAiEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerByAreaEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerByMemberEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerByMenuEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerBySexEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerSettingEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.BannerStatsEntity;
import com.cmb.rainbowtv.domain.banner.infra.data.entity.PopupTypeSettingEntity;
import com.cmb.rainbowtv.domain.banner.model.Banner;
import com.cmb.rainbowtv.domain.banner.model.BannerByAge;
import com.cmb.rainbowtv.domain.banner.model.BannerByAi;
import com.cmb.rainbowtv.domain.banner.model.BannerByArea;
import com.cmb.rainbowtv.domain.banner.model.BannerByMember;
import com.cmb.rainbowtv.domain.banner.model.BannerByMenu;
import com.cmb.rainbowtv.domain.banner.model.BannerBySex;
import com.cmb.rainbowtv.domain.banner.model.BannerSetting;
import com.cmb.rainbowtv.domain.banner.model.BannerStats;
import com.cmb.rainbowtv.domain.banner.model.PopupTypeSetting;
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
import com.cmb.rainbowtv.domain.notice.infra.data.entity.NoticeEntity;
import com.cmb.rainbowtv.domain.notice.model.PostNotice;
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
public class BannerV2AdminInfraMapperImpl implements BannerV2AdminInfraMapper {

    @Override
    public BannerEntity toBannerEntity(Banner banner) {
        if ( banner == null ) {
            return null;
        }

        BannerEntity.BannerEntityBuilder bannerEntity = BannerEntity.builder();

        bannerEntity.baIdx( banner.getBaIdx() );
        bannerEntity.baType( banner.getBaType() );
        bannerEntity.mediaCategory( mediaCategoryToMediaCategoryEntity( banner.getMediaCategory() ) );
        bannerEntity.baStatus( banner.getBaStatus() );
        bannerEntity.baManageType( banner.getBaManageType() );
        bannerEntity.baUrl( banner.getBaUrl() );
        bannerEntity.baDisplayTime( banner.getBaDisplayTime() );
        bannerEntity.baDisplayStartedAt( banner.getBaDisplayStartedAt() );
        bannerEntity.baDisplayFinishedAt( banner.getBaDisplayFinishedAt() );
        bannerEntity.baDashUrl( banner.getBaDashUrl() );
        bannerEntity.baHlsUrl( banner.getBaHlsUrl() );
        bannerEntity.guid( banner.getGuid() );
        bannerEntity.mediaPackageId( banner.getMediaPackageId() );
        bannerEntity.baAosDisplay( banner.getBaAosDisplay() );
        bannerEntity.baSmartDisplay( banner.getBaSmartDisplay() );
        bannerEntity.baOttAppDisplay( banner.getBaOttAppDisplay() );
        bannerEntity.notice( postNoticeToNoticeEntity( banner.getNotice() ) );
        bannerEntity.media( mediaToMediaEntity( banner.getMedia() ) );
        bannerEntity.baDisplay( banner.getBaDisplay() );
        bannerEntity.baPopUpType( banner.getBaPopUpType() );

        return bannerEntity.build();
    }

    @Override
    public Banner toBanner(BannerEntity save) {
        if ( save == null ) {
            return null;
        }

        Banner.BannerBuilder<?, ?> banner = Banner.builder();

        banner.createdAt( save.getCreatedAt() );
        banner.updatedAt( save.getUpdatedAt() );
        banner.baIdx( save.getBaIdx() );
        banner.baType( save.getBaType() );
        banner.mediaCategory( mediaCategoryEntityToMediaCategory( save.getMediaCategory() ) );
        banner.baStatus( save.getBaStatus() );
        banner.baManageType( save.getBaManageType() );
        banner.baUrl( save.getBaUrl() );
        banner.baDisplayTime( save.getBaDisplayTime() );
        banner.baDisplayStartedAt( save.getBaDisplayStartedAt() );
        banner.baDisplayFinishedAt( save.getBaDisplayFinishedAt() );
        banner.baDashUrl( save.getBaDashUrl() );
        banner.baHlsUrl( save.getBaHlsUrl() );
        banner.guid( save.getGuid() );
        banner.mediaPackageId( save.getMediaPackageId() );
        banner.baAosDisplay( save.getBaAosDisplay() );
        banner.baSmartDisplay( save.getBaSmartDisplay() );
        banner.baOttAppDisplay( save.getBaOttAppDisplay() );
        banner.notice( noticeEntityToPostNotice( save.getNotice() ) );
        banner.media( mediaEntityToMedia( save.getMedia() ) );
        banner.baDisplay( save.getBaDisplay() );
        banner.baPopUpType( save.getBaPopUpType() );

        return banner.build();
    }

    @Override
    public BannerByMemberEntity toBannerByMemberEntity(BannerByMember entity) {
        if ( entity == null ) {
            return null;
        }

        BannerByMemberEntity.BannerByMemberEntityBuilder bannerByMemberEntity = BannerByMemberEntity.builder();

        bannerByMemberEntity.bbmIdx( entity.getBbmIdx() );
        bannerByMemberEntity.banner( toBannerEntity( entity.getBanner() ) );
        bannerByMemberEntity.bbmType( entity.getBbmType() );

        return bannerByMemberEntity.build();
    }

    @Override
    public List<BannerByMemberEntity> toBannerByMemberEntityList(List<BannerByMember> list) {
        if ( list == null ) {
            return null;
        }

        List<BannerByMemberEntity> list1 = new ArrayList<BannerByMemberEntity>( list.size() );
        for ( BannerByMember bannerByMember : list ) {
            list1.add( toBannerByMemberEntity( bannerByMember ) );
        }

        return list1;
    }

    @Override
    public BannerBySexEntity toBannerBySexEntity(BannerBySex entity) {
        if ( entity == null ) {
            return null;
        }

        BannerBySexEntity.BannerBySexEntityBuilder bannerBySexEntity = BannerBySexEntity.builder();

        bannerBySexEntity.bbsIdx( entity.getBbsIdx() );
        bannerBySexEntity.banner( toBannerEntity( entity.getBanner() ) );
        bannerBySexEntity.bbsSex( entity.getBbsSex() );

        return bannerBySexEntity.build();
    }

    @Override
    public List<BannerBySexEntity> toBannerBySexEntityList(List<BannerBySex> list) {
        if ( list == null ) {
            return null;
        }

        List<BannerBySexEntity> list1 = new ArrayList<BannerBySexEntity>( list.size() );
        for ( BannerBySex bannerBySex : list ) {
            list1.add( toBannerBySexEntity( bannerBySex ) );
        }

        return list1;
    }

    @Override
    public BannerByAgeEntity toBannerByAgeEntity(BannerByAge entity) {
        if ( entity == null ) {
            return null;
        }

        BannerByAgeEntity.BannerByAgeEntityBuilder bannerByAgeEntity = BannerByAgeEntity.builder();

        bannerByAgeEntity.bbaIdx( entity.getBbaIdx() );
        bannerByAgeEntity.banner( toBannerEntity( entity.getBanner() ) );
        bannerByAgeEntity.bbaType( entity.getBbaType() );

        return bannerByAgeEntity.build();
    }

    @Override
    public List<BannerByAgeEntity> toBannerByAgeEntityList(List<BannerByAge> list) {
        if ( list == null ) {
            return null;
        }

        List<BannerByAgeEntity> list1 = new ArrayList<BannerByAgeEntity>( list.size() );
        for ( BannerByAge bannerByAge : list ) {
            list1.add( toBannerByAgeEntity( bannerByAge ) );
        }

        return list1;
    }

    @Override
    public BannerByAreaEntity toBannerByAreaEntity(BannerByArea entity) {
        if ( entity == null ) {
            return null;
        }

        BannerByAreaEntity.BannerByAreaEntityBuilder bannerByAreaEntity = BannerByAreaEntity.builder();

        bannerByAreaEntity.bbaIdx( entity.getBbaIdx() );
        bannerByAreaEntity.banner( toBannerEntity( entity.getBanner() ) );
        bannerByAreaEntity.adShortSi( entity.getAdShortSi() );

        return bannerByAreaEntity.build();
    }

    @Override
    public List<BannerByAreaEntity> toBannerByAreaEntityList(List<BannerByArea> list) {
        if ( list == null ) {
            return null;
        }

        List<BannerByAreaEntity> list1 = new ArrayList<BannerByAreaEntity>( list.size() );
        for ( BannerByArea bannerByArea : list ) {
            list1.add( toBannerByAreaEntity( bannerByArea ) );
        }

        return list1;
    }

    @Override
    public BannerByMenuEntity toBannerByMenuEntity(BannerByMenu entity) {
        if ( entity == null ) {
            return null;
        }

        BannerByMenuEntity.BannerByMenuEntityBuilder bannerByMenuEntity = BannerByMenuEntity.builder();

        bannerByMenuEntity.bbmIdx( entity.getBbmIdx() );
        bannerByMenuEntity.banner( toBannerEntity( entity.getBanner() ) );
        bannerByMenuEntity.bbmType( entity.getBbmType() );

        return bannerByMenuEntity.build();
    }

    @Override
    public List<BannerByMenuEntity> toBannerByMenuEntityList(List<BannerByMenu> list) {
        if ( list == null ) {
            return null;
        }

        List<BannerByMenuEntity> list1 = new ArrayList<BannerByMenuEntity>( list.size() );
        for ( BannerByMenu bannerByMenu : list ) {
            list1.add( toBannerByMenuEntity( bannerByMenu ) );
        }

        return list1;
    }

    @Override
    public BannerSetting toBannerSetting(BannerSettingEntity bannerSettingEntity) {
        if ( bannerSettingEntity == null ) {
            return null;
        }

        BannerSetting.BannerSettingBuilder<?, ?> bannerSetting = BannerSetting.builder();

        bannerSetting.createdAt( bannerSettingEntity.getCreatedAt() );
        bannerSetting.updatedAt( bannerSettingEntity.getUpdatedAt() );
        bannerSetting.bsIdx( bannerSettingEntity.getBsIdx() );
        bannerSetting.bsManageType( bannerSettingEntity.getBsManageType() );
        bannerSetting.bsDisplayTime( bannerSettingEntity.getBsDisplayTime() );
        bannerSetting.bsDisplaySize( bannerSettingEntity.getBsDisplaySize() );
        bannerSetting.bsPopupType( bannerSettingEntity.getBsPopupType() );

        return bannerSetting.build();
    }

    @Override
    public List<BannerSetting> toBannerSettingList(List<BannerSettingEntity> bannerSettingEntity) {
        if ( bannerSettingEntity == null ) {
            return null;
        }

        List<BannerSetting> list = new ArrayList<BannerSetting>( bannerSettingEntity.size() );
        for ( BannerSettingEntity bannerSettingEntity1 : bannerSettingEntity ) {
            list.add( toBannerSetting( bannerSettingEntity1 ) );
        }

        return list;
    }

    @Override
    public BannerSettingEntity toBannerSettingEntity(BannerSetting bannerSetting) {
        if ( bannerSetting == null ) {
            return null;
        }

        BannerSettingEntity.BannerSettingEntityBuilder bannerSettingEntity = BannerSettingEntity.builder();

        bannerSettingEntity.bsIdx( bannerSetting.getBsIdx() );
        bannerSettingEntity.bsManageType( bannerSetting.getBsManageType() );
        bannerSettingEntity.bsDisplayTime( bannerSetting.getBsDisplayTime() );
        bannerSettingEntity.bsDisplaySize( bannerSetting.getBsDisplaySize() );
        bannerSettingEntity.bsPopupType( bannerSetting.getBsPopupType() );

        return bannerSettingEntity.build();
    }

    @Override
    public BannerByAi toBannerByAi(BannerByAiEntity bannerByAiEntity) {
        if ( bannerByAiEntity == null ) {
            return null;
        }

        BannerByAi.BannerByAiBuilder<?, ?> bannerByAi = BannerByAi.builder();

        bannerByAi.createdAt( bannerByAiEntity.getCreatedAt() );
        bannerByAi.updatedAt( bannerByAiEntity.getUpdatedAt() );
        bannerByAi.bbaIdx( bannerByAiEntity.getBbaIdx() );
        bannerByAi.banner( toBanner( bannerByAiEntity.getBanner() ) );
        bannerByAi.mcType( bannerByAiEntity.getMcType() );
        bannerByAi.mcIdx( bannerByAiEntity.getMcIdx() );
        bannerByAi.mgIdx( bannerByAiEntity.getMgIdx() );

        return bannerByAi.build();
    }

    @Override
    public BannerByAiEntity toBannerByAiEntity(BannerByAi bannerByAiEntity) {
        if ( bannerByAiEntity == null ) {
            return null;
        }

        BannerByAiEntity.BannerByAiEntityBuilder bannerByAiEntity1 = BannerByAiEntity.builder();

        bannerByAiEntity1.bbaIdx( bannerByAiEntity.getBbaIdx() );
        bannerByAiEntity1.banner( toBannerEntity( bannerByAiEntity.getBanner() ) );
        bannerByAiEntity1.mcType( bannerByAiEntity.getMcType() );
        bannerByAiEntity1.mcIdx( bannerByAiEntity.getMcIdx() );
        bannerByAiEntity1.mgIdx( bannerByAiEntity.getMgIdx() );

        return bannerByAiEntity1.build();
    }

    @Override
    public BannerStatsEntity toBannerStatsEntity(BannerStats bannerStats) {
        if ( bannerStats == null ) {
            return null;
        }

        BannerStatsEntity.BannerStatsEntityBuilder bannerStatsEntity = BannerStatsEntity.builder();

        bannerStatsEntity.bsIdx( bannerStats.getBsIdx() );
        bannerStatsEntity.banner( toBannerEntity( bannerStats.getBanner() ) );
        bannerStatsEntity.bsType( bannerStats.getBsType() );
        bannerStatsEntity.bsViewCnt( bannerStats.getBsViewCnt() );
        bannerStatsEntity.bsClickCnt( bannerStats.getBsClickCnt() );

        return bannerStatsEntity.build();
    }

    @Override
    public List<BannerStatsEntity> toBannerStatsEntityList(List<BannerStats> bannerStatsList) {
        if ( bannerStatsList == null ) {
            return null;
        }

        List<BannerStatsEntity> list = new ArrayList<BannerStatsEntity>( bannerStatsList.size() );
        for ( BannerStats bannerStats : bannerStatsList ) {
            list.add( toBannerStatsEntity( bannerStats ) );
        }

        return list;
    }

    @Override
    public PopupTypeSetting toPopupTypeSetting(PopupTypeSettingEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PopupTypeSetting.PopupTypeSettingBuilder<?, ?> popupTypeSetting = PopupTypeSetting.builder();

        popupTypeSetting.createdAt( entity.getCreatedAt() );
        popupTypeSetting.updatedAt( entity.getUpdatedAt() );
        popupTypeSetting.ptsIdx( entity.getPtsIdx() );
        popupTypeSetting.ptsChannelType( entity.getPtsChannelType() );
        popupTypeSetting.ptsChannelName( entity.getPtsChannelName() );
        popupTypeSetting.ptsPopupType( entity.getPtsPopupType() );

        return popupTypeSetting.build();
    }

    @Override
    public List<PopupTypeSetting> toPopupTypeSettingList(List<PopupTypeSettingEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PopupTypeSetting> list = new ArrayList<PopupTypeSetting>( entityList.size() );
        for ( PopupTypeSettingEntity popupTypeSettingEntity : entityList ) {
            list.add( toPopupTypeSetting( popupTypeSettingEntity ) );
        }

        return list;
    }

    @Override
    public PopupTypeSettingEntity toPopupTypeSettingEntity(PopupTypeSetting model) {
        if ( model == null ) {
            return null;
        }

        PopupTypeSettingEntity.PopupTypeSettingEntityBuilder popupTypeSettingEntity = PopupTypeSettingEntity.builder();

        popupTypeSettingEntity.ptsIdx( model.getPtsIdx() );
        popupTypeSettingEntity.ptsChannelType( model.getPtsChannelType() );
        popupTypeSettingEntity.ptsChannelName( model.getPtsChannelName() );
        popupTypeSettingEntity.ptsPopupType( model.getPtsPopupType() );

        return popupTypeSettingEntity.build();
    }

    @Override
    public List<BannerByMenu> toBannerByMenuList(List<BannerByMenuEntity> byBannerBaIdxIn) {
        if ( byBannerBaIdxIn == null ) {
            return null;
        }

        List<BannerByMenu> list = new ArrayList<BannerByMenu>( byBannerBaIdxIn.size() );
        for ( BannerByMenuEntity bannerByMenuEntity : byBannerBaIdxIn ) {
            list.add( bannerByMenuEntityToBannerByMenu( bannerByMenuEntity ) );
        }

        return list;
    }

    @Override
    public List<BannerByMember> toBannerByMemberList(List<BannerByMemberEntity> byBannerBaIdxIn) {
        if ( byBannerBaIdxIn == null ) {
            return null;
        }

        List<BannerByMember> list = new ArrayList<BannerByMember>( byBannerBaIdxIn.size() );
        for ( BannerByMemberEntity bannerByMemberEntity : byBannerBaIdxIn ) {
            list.add( bannerByMemberEntityToBannerByMember( bannerByMemberEntity ) );
        }

        return list;
    }

    @Override
    public List<BannerBySex> toBannerBySexList(List<BannerBySexEntity> byBannerBaIdxIn) {
        if ( byBannerBaIdxIn == null ) {
            return null;
        }

        List<BannerBySex> list = new ArrayList<BannerBySex>( byBannerBaIdxIn.size() );
        for ( BannerBySexEntity bannerBySexEntity : byBannerBaIdxIn ) {
            list.add( bannerBySexEntityToBannerBySex( bannerBySexEntity ) );
        }

        return list;
    }

    @Override
    public List<BannerByArea> toBannerByAreaList(List<BannerByAreaEntity> byBannerBaIdxIn) {
        if ( byBannerBaIdxIn == null ) {
            return null;
        }

        List<BannerByArea> list = new ArrayList<BannerByArea>( byBannerBaIdxIn.size() );
        for ( BannerByAreaEntity bannerByAreaEntity : byBannerBaIdxIn ) {
            list.add( bannerByAreaEntityToBannerByArea( bannerByAreaEntity ) );
        }

        return list;
    }

    @Override
    public List<BannerByAge> toBannerByAgeList(List<BannerByAgeEntity> byBannerBaIdxIn) {
        if ( byBannerBaIdxIn == null ) {
            return null;
        }

        List<BannerByAge> list = new ArrayList<BannerByAge>( byBannerBaIdxIn.size() );
        for ( BannerByAgeEntity bannerByAgeEntity : byBannerBaIdxIn ) {
            list.add( bannerByAgeEntityToBannerByAge( bannerByAgeEntity ) );
        }

        return list;
    }

    @Override
    public List<BannerStats> toBannerStatsList(List<BannerStatsEntity> byBannerBaIdxIn) {
        if ( byBannerBaIdxIn == null ) {
            return null;
        }

        List<BannerStats> list = new ArrayList<BannerStats>( byBannerBaIdxIn.size() );
        for ( BannerStatsEntity bannerStatsEntity : byBannerBaIdxIn ) {
            list.add( bannerStatsEntityToBannerStats( bannerStatsEntity ) );
        }

        return list;
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

    protected NoticeEntity postNoticeToNoticeEntity(PostNotice postNotice) {
        if ( postNotice == null ) {
            return null;
        }

        NoticeEntity.NoticeEntityBuilder noticeEntity = NoticeEntity.builder();

        noticeEntity.wrId( postNotice.getWrId() );
        noticeEntity.member( memberToMemberEntity( postNotice.getMember() ) );
        noticeEntity.wrType( postNotice.getWrType() );
        noticeEntity.wrParent( postNotice.getWrParent() );
        noticeEntity.wrSubject( postNotice.getWrSubject() );
        noticeEntity.wrContent( postNotice.getWrContent() );
        noticeEntity.wrHit( postNotice.getWrHit() );
        noticeEntity.wrIsBlind( postNotice.getWrIsBlind() );
        noticeEntity.wrUse( postNotice.getWrUse() );
        noticeEntity.wrDatetime( postNotice.getWrDatetime() );
        noticeEntity.wrSeq( postNotice.getWrSeq() );
        noticeEntity.wrCommentCnt( postNotice.getWrCommentCnt() );
        noticeEntity.wrDisplay( postNotice.getWrDisplay() );
        noticeEntity.wrSeparate( postNotice.getWrSeparate() );

        return noticeEntity.build();
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

    protected PostNotice noticeEntityToPostNotice(NoticeEntity noticeEntity) {
        if ( noticeEntity == null ) {
            return null;
        }

        PostNotice.PostNoticeBuilder<?, ?> postNotice = PostNotice.builder();

        postNotice.createdAt( noticeEntity.getCreatedAt() );
        postNotice.updatedAt( noticeEntity.getUpdatedAt() );
        postNotice.wrId( noticeEntity.getWrId() );
        postNotice.member( memberEntityToMember( noticeEntity.getMember() ) );
        postNotice.wrType( noticeEntity.getWrType() );
        postNotice.wrParent( noticeEntity.getWrParent() );
        postNotice.wrSubject( noticeEntity.getWrSubject() );
        postNotice.wrContent( noticeEntity.getWrContent() );
        postNotice.wrHit( noticeEntity.getWrHit() );
        postNotice.wrIsBlind( noticeEntity.getWrIsBlind() );
        postNotice.wrUse( noticeEntity.getWrUse() );
        postNotice.wrDatetime( noticeEntity.getWrDatetime() );
        postNotice.wrSeq( noticeEntity.getWrSeq() );
        postNotice.wrCommentCnt( noticeEntity.getWrCommentCnt() );
        postNotice.wrDisplay( noticeEntity.getWrDisplay() );
        postNotice.wrSeparate( noticeEntity.getWrSeparate() );

        return postNotice.build();
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

    protected BannerByMenu bannerByMenuEntityToBannerByMenu(BannerByMenuEntity bannerByMenuEntity) {
        if ( bannerByMenuEntity == null ) {
            return null;
        }

        BannerByMenu.BannerByMenuBuilder<?, ?> bannerByMenu = BannerByMenu.builder();

        bannerByMenu.createdAt( bannerByMenuEntity.getCreatedAt() );
        bannerByMenu.updatedAt( bannerByMenuEntity.getUpdatedAt() );
        bannerByMenu.bbmIdx( bannerByMenuEntity.getBbmIdx() );
        bannerByMenu.banner( toBanner( bannerByMenuEntity.getBanner() ) );
        bannerByMenu.bbmType( bannerByMenuEntity.getBbmType() );

        return bannerByMenu.build();
    }

    protected BannerByMember bannerByMemberEntityToBannerByMember(BannerByMemberEntity bannerByMemberEntity) {
        if ( bannerByMemberEntity == null ) {
            return null;
        }

        BannerByMember.BannerByMemberBuilder<?, ?> bannerByMember = BannerByMember.builder();

        bannerByMember.createdAt( bannerByMemberEntity.getCreatedAt() );
        bannerByMember.updatedAt( bannerByMemberEntity.getUpdatedAt() );
        bannerByMember.bbmIdx( bannerByMemberEntity.getBbmIdx() );
        bannerByMember.banner( toBanner( bannerByMemberEntity.getBanner() ) );
        bannerByMember.bbmType( bannerByMemberEntity.getBbmType() );

        return bannerByMember.build();
    }

    protected BannerBySex bannerBySexEntityToBannerBySex(BannerBySexEntity bannerBySexEntity) {
        if ( bannerBySexEntity == null ) {
            return null;
        }

        BannerBySex.BannerBySexBuilder<?, ?> bannerBySex = BannerBySex.builder();

        bannerBySex.createdAt( bannerBySexEntity.getCreatedAt() );
        bannerBySex.updatedAt( bannerBySexEntity.getUpdatedAt() );
        bannerBySex.bbsIdx( bannerBySexEntity.getBbsIdx() );
        bannerBySex.banner( toBanner( bannerBySexEntity.getBanner() ) );
        bannerBySex.bbsSex( bannerBySexEntity.getBbsSex() );

        return bannerBySex.build();
    }

    protected BannerByArea bannerByAreaEntityToBannerByArea(BannerByAreaEntity bannerByAreaEntity) {
        if ( bannerByAreaEntity == null ) {
            return null;
        }

        BannerByArea.BannerByAreaBuilder<?, ?> bannerByArea = BannerByArea.builder();

        bannerByArea.createdAt( bannerByAreaEntity.getCreatedAt() );
        bannerByArea.updatedAt( bannerByAreaEntity.getUpdatedAt() );
        bannerByArea.bbaIdx( bannerByAreaEntity.getBbaIdx() );
        bannerByArea.banner( toBanner( bannerByAreaEntity.getBanner() ) );
        bannerByArea.adShortSi( bannerByAreaEntity.getAdShortSi() );

        return bannerByArea.build();
    }

    protected BannerByAge bannerByAgeEntityToBannerByAge(BannerByAgeEntity bannerByAgeEntity) {
        if ( bannerByAgeEntity == null ) {
            return null;
        }

        BannerByAge.BannerByAgeBuilder<?, ?> bannerByAge = BannerByAge.builder();

        bannerByAge.createdAt( bannerByAgeEntity.getCreatedAt() );
        bannerByAge.updatedAt( bannerByAgeEntity.getUpdatedAt() );
        bannerByAge.bbaIdx( bannerByAgeEntity.getBbaIdx() );
        bannerByAge.banner( toBanner( bannerByAgeEntity.getBanner() ) );
        bannerByAge.bbaType( bannerByAgeEntity.getBbaType() );

        return bannerByAge.build();
    }

    protected BannerStats bannerStatsEntityToBannerStats(BannerStatsEntity bannerStatsEntity) {
        if ( bannerStatsEntity == null ) {
            return null;
        }

        BannerStats.BannerStatsBuilder<?, ?> bannerStats = BannerStats.builder();

        bannerStats.createdAt( bannerStatsEntity.getCreatedAt() );
        bannerStats.updatedAt( bannerStatsEntity.getUpdatedAt() );
        bannerStats.bsIdx( bannerStatsEntity.getBsIdx() );
        bannerStats.banner( toBanner( bannerStatsEntity.getBanner() ) );
        bannerStats.bsType( bannerStatsEntity.getBsType() );
        bannerStats.bsViewCnt( bannerStatsEntity.getBsViewCnt() );
        bannerStats.bsClickCnt( bannerStatsEntity.getBsClickCnt() );

        return bannerStats.build();
    }
}
