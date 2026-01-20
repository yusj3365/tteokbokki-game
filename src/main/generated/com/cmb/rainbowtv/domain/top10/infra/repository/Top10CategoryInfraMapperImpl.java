package com.cmb.rainbowtv.domain.top10.infra.repository;

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
import com.cmb.rainbowtv.domain.top10.infra.data.entity.Top10CategoryEntity;
import com.cmb.rainbowtv.domain.top10.infra.data.entity.Top10CategoryMediaAutoEntity;
import com.cmb.rainbowtv.domain.top10.infra.data.entity.Top10CategoryMediaEntity;
import com.cmb.rainbowtv.domain.top10.model.Top10Category;
import com.cmb.rainbowtv.domain.top10.model.Top10CategoryMedia;
import com.cmb.rainbowtv.domain.top10.model.Top10CategoryMediaAuto;
import com.cmb.rainbowtv.domain.top10.model.enums.Top10ContentEnum;
import com.cmb.rainbowtv.domain.top10.model.enums.Top10DisplayEnum;
import com.cmb.rainbowtv.domain.top10.model.enums.Top10TypeEnum;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:47+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class Top10CategoryInfraMapperImpl implements Top10CategoryInfraMapper {

    @Override
    public Top10Category toTop10Category(Top10CategoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Top10Category.Top10CategoryBuilder<?, ?> top10Category = Top10Category.builder();

        top10Category.createdAt( entity.getCreatedAt() );
        top10Category.updatedAt( entity.getUpdatedAt() );
        top10Category.tcIdx( entity.getTcIdx() );
        top10Category.tcDisplay( entity.getTcDisplay() );
        top10Category.tcName( entity.getTcName() );
        top10Category.tcAuto( entity.getTcAuto() );
        top10Category.tcContent( entity.getTcContent() );
        top10Category.tcType( entity.getTcType() );

        return top10Category.build();
    }

    @Override
    public List<Top10Category> toTop10CategoryList(List<Top10CategoryEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<Top10Category> list = new ArrayList<Top10Category>( entityList.size() );
        for ( Top10CategoryEntity top10CategoryEntity : entityList ) {
            list.add( toTop10Category( top10CategoryEntity ) );
        }

        return list;
    }

    @Override
    public Top10CategoryEntity toTop10CategoryEntity(Top10Category top10Category) {
        if ( top10Category == null ) {
            return null;
        }

        Long tcIdx = null;
        Top10DisplayEnum tcDisplay = null;
        String tcName = null;
        Integer tcAuto = null;
        Top10ContentEnum tcContent = null;
        Top10TypeEnum tcType = null;

        tcIdx = top10Category.getTcIdx();
        tcDisplay = top10Category.getTcDisplay();
        tcName = top10Category.getTcName();
        tcAuto = top10Category.getTcAuto();
        tcContent = top10Category.getTcContent();
        tcType = top10Category.getTcType();

        Top10CategoryEntity top10CategoryEntity = new Top10CategoryEntity( tcIdx, tcDisplay, tcName, tcAuto, tcContent, tcType );

        top10CategoryEntity.setCreatedAt( top10Category.getCreatedAt() );
        top10CategoryEntity.setUpdatedAt( top10Category.getUpdatedAt() );

        return top10CategoryEntity;
    }

    @Override
    public Top10CategoryMediaEntity toTop10CategoryMediaEntity(Top10CategoryMedia top10CategoryMedia) {
        if ( top10CategoryMedia == null ) {
            return null;
        }

        Long tcmIdx = null;
        Top10CategoryEntity top10Category = null;
        MediaEntity media = null;
        Integer tcmSeq = null;

        tcmIdx = top10CategoryMedia.getTcmIdx();
        top10Category = toTop10CategoryEntity( top10CategoryMedia.getTop10Category() );
        media = mediaToMediaEntity( top10CategoryMedia.getMedia() );
        tcmSeq = top10CategoryMedia.getTcmSeq();

        Top10CategoryMediaEntity top10CategoryMediaEntity = new Top10CategoryMediaEntity( tcmIdx, top10Category, media, tcmSeq );

        top10CategoryMediaEntity.setCreatedAt( top10CategoryMedia.getCreatedAt() );
        top10CategoryMediaEntity.setUpdatedAt( top10CategoryMedia.getUpdatedAt() );

        return top10CategoryMediaEntity;
    }

    @Override
    public Top10CategoryMediaAutoEntity toTop10CategoryMediaAutoEntity(Top10CategoryMediaAuto model) {
        if ( model == null ) {
            return null;
        }

        Long tcmaIdx = null;
        Top10CategoryEntity top10Category = null;
        MediaEntity media = null;
        MemberEntity member = null;
        Integer tcmaRanking = null;

        tcmaIdx = model.getTcmaIdx();
        top10Category = toTop10CategoryEntity( model.getTop10Category() );
        media = mediaToMediaEntity( model.getMedia() );
        member = memberToMemberEntity( model.getMember() );
        tcmaRanking = model.getTcmaRanking();

        Top10CategoryMediaAutoEntity top10CategoryMediaAutoEntity = new Top10CategoryMediaAutoEntity( tcmaIdx, top10Category, media, member, tcmaRanking );

        top10CategoryMediaAutoEntity.setCreatedAt( model.getCreatedAt() );
        top10CategoryMediaAutoEntity.setUpdatedAt( model.getUpdatedAt() );

        return top10CategoryMediaAutoEntity;
    }

    @Override
    public List<Top10CategoryMediaAutoEntity> toTop10CategoryMediaAutoEntityList(List<Top10CategoryMediaAuto> list) {
        if ( list == null ) {
            return null;
        }

        List<Top10CategoryMediaAutoEntity> list1 = new ArrayList<Top10CategoryMediaAutoEntity>( list.size() );
        for ( Top10CategoryMediaAuto top10CategoryMediaAuto : list ) {
            list1.add( toTop10CategoryMediaAutoEntity( top10CategoryMediaAuto ) );
        }

        return list1;
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
