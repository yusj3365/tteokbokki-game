package com.cmb.rainbowtv.domain.media.infra;

import com.cmb.rainbowtv.domain.classarea.infra.data.entity.ClassAreaEntity;
import com.cmb.rainbowtv.domain.classarea.model.ClassArea;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaByAreaEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaByClassAreaEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaByDeleteReasonEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaByItemEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaBySoEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaCategoryEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaClassEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaClickLogEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaClinicEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaDeleteReasonDefineEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaGenreEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaHeartEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaHistoryEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaInterestfreeEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaKeywordEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaListDailyEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaMetadataEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaMoveEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaNewConfigEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaRecommendEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaSeriesContentEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaShopDetailEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaShopEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaUploaderListEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaVodEntity;
import com.cmb.rainbowtv.domain.media.model.Media;
import com.cmb.rainbowtv.domain.media.model.MediaByArea;
import com.cmb.rainbowtv.domain.media.model.MediaByClassArea;
import com.cmb.rainbowtv.domain.media.model.MediaByDeleteReason;
import com.cmb.rainbowtv.domain.media.model.MediaByItem;
import com.cmb.rainbowtv.domain.media.model.MediaBySo;
import com.cmb.rainbowtv.domain.media.model.MediaCategory;
import com.cmb.rainbowtv.domain.media.model.MediaClass;
import com.cmb.rainbowtv.domain.media.model.MediaClickLog;
import com.cmb.rainbowtv.domain.media.model.MediaClinic;
import com.cmb.rainbowtv.domain.media.model.MediaDeleteReason;
import com.cmb.rainbowtv.domain.media.model.MediaDeleteReasonDefine;
import com.cmb.rainbowtv.domain.media.model.MediaGenre;
import com.cmb.rainbowtv.domain.media.model.MediaHeart;
import com.cmb.rainbowtv.domain.media.model.MediaHistory;
import com.cmb.rainbowtv.domain.media.model.MediaInterestfree;
import com.cmb.rainbowtv.domain.media.model.MediaKeyword;
import com.cmb.rainbowtv.domain.media.model.MediaListDaily;
import com.cmb.rainbowtv.domain.media.model.MediaMetadata;
import com.cmb.rainbowtv.domain.media.model.MediaMove;
import com.cmb.rainbowtv.domain.media.model.MediaNewConfig;
import com.cmb.rainbowtv.domain.media.model.MediaRecommend;
import com.cmb.rainbowtv.domain.media.model.MediaSeriesContent;
import com.cmb.rainbowtv.domain.media.model.MediaShop;
import com.cmb.rainbowtv.domain.media.model.MediaShopDetail;
import com.cmb.rainbowtv.domain.media.model.MediaUploaderList;
import com.cmb.rainbowtv.domain.media.model.MediaVod;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.product.infra.ProductAdminInfraMapper;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import com.cmb.rainbowtv.global.define.so.infra.data.entity.SoDefineEntity;
import com.cmb.rainbowtv.global.define.so.model.SoDefine;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:49+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class MediaInfraMapperImpl implements MediaInfraMapper {

    @Autowired
    private ProductAdminInfraMapper productAdminInfraMapper;

    @Override
    public List<Media> toMediaList(List<MediaEntity> mediaEntityList) {
        if ( mediaEntityList == null ) {
            return null;
        }

        List<Media> list = new ArrayList<Media>( mediaEntityList.size() );
        for ( MediaEntity mediaEntity : mediaEntityList ) {
            list.add( toMedia( mediaEntity ) );
        }

        return list;
    }

    @Override
    public MediaDeleteReason toMediaDeleteReason(MediaDeleteReasonDefineEntity mediaDeleteReasonDefineEntity) {
        if ( mediaDeleteReasonDefineEntity == null ) {
            return null;
        }

        MediaDeleteReason.MediaDeleteReasonBuilder<?, ?> mediaDeleteReason = MediaDeleteReason.builder();

        mediaDeleteReason.createdAt( mediaDeleteReasonDefineEntity.getCreatedAt() );
        mediaDeleteReason.updatedAt( mediaDeleteReasonDefineEntity.getUpdatedAt() );
        mediaDeleteReason.mdrIdx( mediaDeleteReasonDefineEntity.getMdrIdx() );
        mediaDeleteReason.mdrReason( mediaDeleteReasonDefineEntity.getMdrReason() );
        mediaDeleteReason.mdrType( mediaDeleteReasonDefineEntity.getMdrType() );

        return mediaDeleteReason.build();
    }

    @Override
    public MediaDeleteReasonDefine toMediaDeleteReasonDefine(MediaDeleteReasonDefineEntity mediaDeleteReasonDefineEntity) {
        if ( mediaDeleteReasonDefineEntity == null ) {
            return null;
        }

        MediaDeleteReasonDefine.MediaDeleteReasonDefineBuilder<?, ?> mediaDeleteReasonDefine = MediaDeleteReasonDefine.builder();

        mediaDeleteReasonDefine.createdAt( mediaDeleteReasonDefineEntity.getCreatedAt() );
        mediaDeleteReasonDefine.updatedAt( mediaDeleteReasonDefineEntity.getUpdatedAt() );
        mediaDeleteReasonDefine.mdrIdx( mediaDeleteReasonDefineEntity.getMdrIdx() );
        mediaDeleteReasonDefine.mdrReason( mediaDeleteReasonDefineEntity.getMdrReason() );
        mediaDeleteReasonDefine.mdrType( mediaDeleteReasonDefineEntity.getMdrType() );

        return mediaDeleteReasonDefine.build();
    }

    @Override
    public MediaByDeleteReasonEntity toMediaByDeleteReasonEntity(MediaByDeleteReason mediaByDeleteReason) {
        if ( mediaByDeleteReason == null ) {
            return null;
        }

        MediaByDeleteReasonEntity.MediaByDeleteReasonEntityBuilder mediaByDeleteReasonEntity = MediaByDeleteReasonEntity.builder();

        mediaByDeleteReasonEntity.mbdrIdx( mediaByDeleteReason.getMbdrIdx() );
        mediaByDeleteReasonEntity.media( toMediaEntity( mediaByDeleteReason.getMedia() ) );
        mediaByDeleteReasonEntity.mediaDeleteReasonDefine( mediaDeleteReasonToMediaDeleteReasonDefineEntity( mediaByDeleteReason.getMediaDeleteReasonDefine() ) );

        return mediaByDeleteReasonEntity.build();
    }

    @Override
    public MediaShop toMediaShop(MediaShopEntity mediaShopEntity) {
        if ( mediaShopEntity == null ) {
            return null;
        }

        MediaShop.MediaShopBuilder<?, ?> mediaShop = MediaShop.builder();

        mediaShop.createdAt( mediaShopEntity.getCreatedAt() );
        mediaShop.updatedAt( mediaShopEntity.getUpdatedAt() );
        mediaShop.msIdx( mediaShopEntity.getMsIdx() );
        mediaShop.media( toMedia( mediaShopEntity.getMedia() ) );
        mediaShop.msType( mediaShopEntity.getMsType() );
        mediaShop.msWebUrl( mediaShopEntity.getMsWebUrl() );
        mediaShop.msStatus( mediaShopEntity.getMsStatus() );
        mediaShop.msCategory( mediaShopEntity.getMsCategory() );
        mediaShop.msCompany( mediaShopEntity.getMsCompany() );
        mediaShop.msHp( mediaShopEntity.getMsHp() );
        mediaShop.msAge( mediaShopEntity.getMsAge() );
        mediaShop.msButtonName( mediaShopEntity.getMsButtonName() );

        return mediaShop.build();
    }

    @Override
    public MediaShopEntity toMediaShopEntity(MediaShop mediaShop) {
        if ( mediaShop == null ) {
            return null;
        }

        MediaShopEntity.MediaShopEntityBuilder mediaShopEntity = MediaShopEntity.builder();

        mediaShopEntity.msIdx( mediaShop.getMsIdx() );
        mediaShopEntity.media( toMediaEntity( mediaShop.getMedia() ) );
        mediaShopEntity.msType( mediaShop.getMsType() );
        mediaShopEntity.msWebUrl( mediaShop.getMsWebUrl() );
        mediaShopEntity.msStatus( mediaShop.getMsStatus() );
        mediaShopEntity.msCategory( mediaShop.getMsCategory() );
        mediaShopEntity.msCompany( mediaShop.getMsCompany() );
        mediaShopEntity.msHp( mediaShop.getMsHp() );
        mediaShopEntity.msAge( mediaShop.getMsAge() );
        mediaShopEntity.msButtonName( mediaShop.getMsButtonName() );

        return mediaShopEntity.build();
    }

    @Override
    public MediaGenre toMediaGenre(MediaGenreEntity mediaGenreEntity) {
        if ( mediaGenreEntity == null ) {
            return null;
        }

        MediaGenre.MediaGenreBuilder<?, ?> mediaGenre = MediaGenre.builder();

        mediaGenre.createdAt( mediaGenreEntity.getCreatedAt() );
        mediaGenre.updatedAt( mediaGenreEntity.getUpdatedAt() );
        mediaGenre.mgIdx( mediaGenreEntity.getMgIdx() );
        mediaGenre.mediaCategory( toMediaCategory( mediaGenreEntity.getMediaCategory() ) );
        mediaGenre.mgName( mediaGenreEntity.getMgName() );
        mediaGenre.mgSeq( mediaGenreEntity.getMgSeq() );

        return mediaGenre.build();
    }

    @Override
    public MediaEntity toMediaEntity(Media media) {
        if ( media == null ) {
            return null;
        }

        MediaEntity.MediaEntityBuilder mediaEntity = MediaEntity.builder();

        mediaEntity.meIdx( media.getMeIdx() );
        mediaEntity.meUuid( media.getMeUuid() );
        mediaEntity.mediaCategory( toMediaCategoryEntity( media.getMediaCategory() ) );
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
        mediaEntity.mediaGenre( toMediaGenreEntity( media.getMediaGenre() ) );
        mediaEntity.sourceLocationName( media.getSourceLocationName() );
        mediaEntity.meAosDisplay( media.getMeAosDisplay() );
        mediaEntity.meSmartDisplay( media.getMeSmartDisplay() );
        mediaEntity.meOttAppDisplay( media.getMeOttAppDisplay() );
        mediaEntity.lpType( media.getLpType() );

        return mediaEntity.build();
    }

    @Override
    public Media toMedia(MediaEntity mediaEntity) {
        if ( mediaEntity == null ) {
            return null;
        }

        Media.MediaBuilder<?, ?> media = Media.builder();

        media.createdAt( mediaEntity.getCreatedAt() );
        media.updatedAt( mediaEntity.getUpdatedAt() );
        media.meIdx( mediaEntity.getMeIdx() );
        media.meUuid( mediaEntity.getMeUuid() );
        media.mediaCategory( toMediaCategory( mediaEntity.getMediaCategory() ) );
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
        media.mediaGenre( toMediaGenre( mediaEntity.getMediaGenre() ) );
        media.sourceLocationName( mediaEntity.getSourceLocationName() );
        media.meAosDisplay( mediaEntity.getMeAosDisplay() );
        media.meSmartDisplay( mediaEntity.getMeSmartDisplay() );
        media.meOttAppDisplay( mediaEntity.getMeOttAppDisplay() );
        media.lpType( mediaEntity.getLpType() );

        return media.build();
    }

    @Override
    public MediaByAreaEntity toMediaByAreaEntity(MediaByArea mediaByArea) {
        if ( mediaByArea == null ) {
            return null;
        }

        MediaByAreaEntity.MediaByAreaEntityBuilder mediaByAreaEntity = MediaByAreaEntity.builder();

        mediaByAreaEntity.mbaIdx( mediaByArea.getMbaIdx() );
        mediaByAreaEntity.media( toMediaEntity( mediaByArea.getMedia() ) );
        mediaByAreaEntity.areaDefine( areaDefineToAreaDefineEntity( mediaByArea.getAreaDefine() ) );
        mediaByAreaEntity.mbaSi( mediaByArea.getMbaSi() );

        return mediaByAreaEntity.build();
    }

    @Override
    public MediaByArea toMediaByArea(MediaByAreaEntity mediaByAreaEntity) {
        if ( mediaByAreaEntity == null ) {
            return null;
        }

        MediaByArea.MediaByAreaBuilder<?, ?> mediaByArea = MediaByArea.builder();

        mediaByArea.createdAt( mediaByAreaEntity.getCreatedAt() );
        mediaByArea.updatedAt( mediaByAreaEntity.getUpdatedAt() );
        mediaByArea.mbaIdx( mediaByAreaEntity.getMbaIdx() );
        mediaByArea.media( toMedia( mediaByAreaEntity.getMedia() ) );
        mediaByArea.areaDefine( areaDefineEntityToAreaDefine( mediaByAreaEntity.getAreaDefine() ) );
        mediaByArea.mbaSi( mediaByAreaEntity.getMbaSi() );

        return mediaByArea.build();
    }

    @Override
    public List<MediaByArea> toMediaByAreaList(List<MediaByAreaEntity> mediaByAreaEntityList) {
        if ( mediaByAreaEntityList == null ) {
            return null;
        }

        List<MediaByArea> list = new ArrayList<MediaByArea>( mediaByAreaEntityList.size() );
        for ( MediaByAreaEntity mediaByAreaEntity : mediaByAreaEntityList ) {
            list.add( toMediaByArea( mediaByAreaEntity ) );
        }

        return list;
    }

    @Override
    public List<MediaByAreaEntity> toMediaByAreaEntityList(List<MediaByArea> mediaByAreaList) {
        if ( mediaByAreaList == null ) {
            return null;
        }

        List<MediaByAreaEntity> list = new ArrayList<MediaByAreaEntity>( mediaByAreaList.size() );
        for ( MediaByArea mediaByArea : mediaByAreaList ) {
            list.add( toMediaByAreaEntity( mediaByArea ) );
        }

        return list;
    }

    @Override
    public MediaBySoEntity toMediaBySoEntity(MediaBySo mediaBySo) {
        if ( mediaBySo == null ) {
            return null;
        }

        MediaBySoEntity.MediaBySoEntityBuilder mediaBySoEntity = MediaBySoEntity.builder();

        mediaBySoEntity.mbsIdx( mediaBySo.getMbsIdx() );
        mediaBySoEntity.media( toMediaEntity( mediaBySo.getMedia() ) );
        mediaBySoEntity.soDefine( soDefineToSoDefineEntity( mediaBySo.getSoDefine() ) );

        return mediaBySoEntity.build();
    }

    @Override
    public MediaBySo toMediaBySo(MediaBySoEntity mediaBySoEntity) {
        if ( mediaBySoEntity == null ) {
            return null;
        }

        MediaBySo.MediaBySoBuilder<?, ?> mediaBySo = MediaBySo.builder();

        mediaBySo.createdAt( mediaBySoEntity.getCreatedAt() );
        mediaBySo.updatedAt( mediaBySoEntity.getUpdatedAt() );
        mediaBySo.mbsIdx( mediaBySoEntity.getMbsIdx() );
        mediaBySo.media( toMedia( mediaBySoEntity.getMedia() ) );
        mediaBySo.soDefine( soDefineEntityToSoDefine( mediaBySoEntity.getSoDefine() ) );

        return mediaBySo.build();
    }

    @Override
    public List<MediaBySo> toMediaBySoList(List<MediaBySoEntity> mediaBySoEntity) {
        if ( mediaBySoEntity == null ) {
            return null;
        }

        List<MediaBySo> list = new ArrayList<MediaBySo>( mediaBySoEntity.size() );
        for ( MediaBySoEntity mediaBySoEntity1 : mediaBySoEntity ) {
            list.add( toMediaBySo( mediaBySoEntity1 ) );
        }

        return list;
    }

    @Override
    public List<MediaBySoEntity> toMediaBySoListEntity(List<MediaBySo> mediaBySoList) {
        if ( mediaBySoList == null ) {
            return null;
        }

        List<MediaBySoEntity> list = new ArrayList<MediaBySoEntity>( mediaBySoList.size() );
        for ( MediaBySo mediaBySo : mediaBySoList ) {
            list.add( toMediaBySoEntity( mediaBySo ) );
        }

        return list;
    }

    @Override
    public MediaListDaily toMediaListDaily(MediaListDailyEntity mediaListDailyEntity) {
        if ( mediaListDailyEntity == null ) {
            return null;
        }

        MediaListDaily.MediaListDailyBuilder<?, ?> mediaListDaily = MediaListDaily.builder();

        mediaListDaily.createdAt( mediaListDailyEntity.getCreatedAt() );
        mediaListDaily.updatedAt( mediaListDailyEntity.getUpdatedAt() );
        mediaListDaily.mldIdx( mediaListDailyEntity.getMldIdx() );
        mediaListDaily.media( toMedia( mediaListDailyEntity.getMedia() ) );
        mediaListDaily.avgTotalViews( mediaListDailyEntity.getAvgTotalViews() );
        mediaListDaily.avgUniqueViews( mediaListDailyEntity.getAvgUniqueViews() );

        return mediaListDaily.build();
    }

    @Override
    public MediaListDailyEntity toMediaListDailyEntity(MediaListDaily mediaListDaily) {
        if ( mediaListDaily == null ) {
            return null;
        }

        MediaListDailyEntity.MediaListDailyEntityBuilder mediaListDailyEntity = MediaListDailyEntity.builder();

        mediaListDailyEntity.mldIdx( mediaListDaily.getMldIdx() );
        mediaListDailyEntity.media( toMediaEntity( mediaListDaily.getMedia() ) );
        mediaListDailyEntity.avgTotalViews( mediaListDaily.getAvgTotalViews() );
        mediaListDailyEntity.avgUniqueViews( mediaListDaily.getAvgUniqueViews() );

        return mediaListDailyEntity.build();
    }

    @Override
    public MediaByClassAreaEntity toMediaByClassAreaEntity(MediaByClassArea mediaByClassArea) {
        if ( mediaByClassArea == null ) {
            return null;
        }

        MediaByClassAreaEntity.MediaByClassAreaEntityBuilder mediaByClassAreaEntity = MediaByClassAreaEntity.builder();

        mediaByClassAreaEntity.mbcaIdx( mediaByClassArea.getMbcaIdx() );
        mediaByClassAreaEntity.classArea( classAreaToClassAreaEntity( mediaByClassArea.getClassArea() ) );
        mediaByClassAreaEntity.media( toMediaEntity( mediaByClassArea.getMedia() ) );

        return mediaByClassAreaEntity.build();
    }

    @Override
    public MediaByClassArea toMediaByClassArea(MediaByClassAreaEntity mediaByClassAreaEntity) {
        if ( mediaByClassAreaEntity == null ) {
            return null;
        }

        MediaByClassArea.MediaByClassAreaBuilder<?, ?> mediaByClassArea = MediaByClassArea.builder();

        mediaByClassArea.createdAt( mediaByClassAreaEntity.getCreatedAt() );
        mediaByClassArea.updatedAt( mediaByClassAreaEntity.getUpdatedAt() );
        mediaByClassArea.mbcaIdx( mediaByClassAreaEntity.getMbcaIdx() );
        mediaByClassArea.classArea( classAreaEntityToClassArea( mediaByClassAreaEntity.getClassArea() ) );
        mediaByClassArea.media( toMedia( mediaByClassAreaEntity.getMedia() ) );

        return mediaByClassArea.build();
    }

    @Override
    public MediaVod toMediaVod(MediaVodEntity mediaVodEntity) {
        if ( mediaVodEntity == null ) {
            return null;
        }

        MediaVod.MediaVodBuilder<?, ?> mediaVod = MediaVod.builder();

        mediaVod.createdAt( mediaVodEntity.getCreatedAt() );
        mediaVod.updatedAt( mediaVodEntity.getUpdatedAt() );
        mediaVod.mvIdx( mediaVodEntity.getMvIdx() );
        mediaVod.media( toMedia( mediaVodEntity.getMedia() ) );
        mediaVod.mvBroadcastDate( mediaVodEntity.getMvBroadcastDate() );
        mediaVod.mvAgeLimit( mediaVodEntity.getMvAgeLimit() );

        return mediaVod.build();
    }

    @Override
    public MediaVodEntity toMediaVodEntity(MediaVod mediaVod) {
        if ( mediaVod == null ) {
            return null;
        }

        MediaVodEntity.MediaVodEntityBuilder mediaVodEntity = MediaVodEntity.builder();

        mediaVodEntity.mvIdx( mediaVod.getMvIdx() );
        mediaVodEntity.media( toMediaEntity( mediaVod.getMedia() ) );
        mediaVodEntity.mvBroadcastDate( mediaVod.getMvBroadcastDate() );
        mediaVodEntity.mvAgeLimit( mediaVod.getMvAgeLimit() );

        return mediaVodEntity.build();
    }

    @Override
    public MediaClass toMediaClass(MediaClassEntity mediaClassEntity) {
        if ( mediaClassEntity == null ) {
            return null;
        }

        MediaClass.MediaClassBuilder<?, ?> mediaClass = MediaClass.builder();

        mediaClass.createdAt( mediaClassEntity.getCreatedAt() );
        mediaClass.updatedAt( mediaClassEntity.getUpdatedAt() );
        mediaClass.mclsIdx( mediaClassEntity.getMclsIdx() );
        mediaClass.media( toMedia( mediaClassEntity.getMedia() ) );
        mediaClass.mclsName( mediaClassEntity.getMclsName() );
        mediaClass.mclsHp( mediaClassEntity.getMclsHp() );

        return mediaClass.build();
    }

    @Override
    public MediaClinic toMediaClinic(MediaClinicEntity MediaClinicEntity) {
        if ( MediaClinicEntity == null ) {
            return null;
        }

        MediaClinic.MediaClinicBuilder<?, ?> mediaClinic = MediaClinic.builder();

        mediaClinic.createdAt( MediaClinicEntity.getCreatedAt() );
        mediaClinic.updatedAt( MediaClinicEntity.getUpdatedAt() );
        mediaClinic.mclnIdx( MediaClinicEntity.getMclnIdx() );
        mediaClinic.media( toMedia( MediaClinicEntity.getMedia() ) );
        mediaClinic.mclnName( MediaClinicEntity.getMclnName() );
        mediaClinic.mclnHp( MediaClinicEntity.getMclnHp() );

        return mediaClinic.build();
    }

    @Override
    public MediaClassEntity toMediaClassEntity(MediaClass mediaClass) {
        if ( mediaClass == null ) {
            return null;
        }

        MediaClassEntity.MediaClassEntityBuilder mediaClassEntity = MediaClassEntity.builder();

        mediaClassEntity.mclsIdx( mediaClass.getMclsIdx() );
        mediaClassEntity.media( toMediaEntity( mediaClass.getMedia() ) );
        mediaClassEntity.mclsName( mediaClass.getMclsName() );
        mediaClassEntity.mclsHp( mediaClass.getMclsHp() );

        return mediaClassEntity.build();
    }

    @Override
    public MediaClinicEntity toMediaClinicEntity(MediaClinic mediaClinic) {
        if ( mediaClinic == null ) {
            return null;
        }

        MediaClinicEntity.MediaClinicEntityBuilder mediaClinicEntity = MediaClinicEntity.builder();

        mediaClinicEntity.mclnIdx( mediaClinic.getMclnIdx() );
        mediaClinicEntity.media( toMediaEntity( mediaClinic.getMedia() ) );
        mediaClinicEntity.mclnName( mediaClinic.getMclnName() );
        mediaClinicEntity.mclnHp( mediaClinic.getMclnHp() );

        return mediaClinicEntity.build();
    }

    @Override
    public MediaSeriesContent toMediaSeriesContent(MediaSeriesContentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MediaSeriesContent.MediaSeriesContentBuilder<?, ?> mediaSeriesContent = MediaSeriesContent.builder();

        mediaSeriesContent.createdAt( entity.getCreatedAt() );
        mediaSeriesContent.updatedAt( entity.getUpdatedAt() );
        mediaSeriesContent.mscIdx( entity.getMscIdx() );
        mediaSeriesContent.seriesTitle( toMedia( entity.getSeriesTitle() ) );
        mediaSeriesContent.seriesContent( toMedia( entity.getSeriesContent() ) );
        mediaSeriesContent.mscEpisode( entity.getMscEpisode() );

        return mediaSeriesContent.build();
    }

    @Override
    public MediaSeriesContentEntity toMediaSeriesContentEntity(MediaSeriesContent seriesContent) {
        if ( seriesContent == null ) {
            return null;
        }

        MediaSeriesContentEntity.MediaSeriesContentEntityBuilder mediaSeriesContentEntity = MediaSeriesContentEntity.builder();

        mediaSeriesContentEntity.mscIdx( seriesContent.getMscIdx() );
        mediaSeriesContentEntity.seriesTitle( toMediaEntity( seriesContent.getSeriesTitle() ) );
        mediaSeriesContentEntity.seriesContent( toMediaEntity( seriesContent.getSeriesContent() ) );
        mediaSeriesContentEntity.mscEpisode( seriesContent.getMscEpisode() );

        return mediaSeriesContentEntity.build();
    }

    @Override
    public List<MediaSeriesContent> toMediaSeriesContentList(List<MediaSeriesContentEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MediaSeriesContent> list = new ArrayList<MediaSeriesContent>( entityList.size() );
        for ( MediaSeriesContentEntity mediaSeriesContentEntity : entityList ) {
            list.add( toMediaSeriesContent( mediaSeriesContentEntity ) );
        }

        return list;
    }

    @Override
    public MediaInterestfreeEntity toMediaInterestfreeEntity(MediaInterestfree interestfree) {
        if ( interestfree == null ) {
            return null;
        }

        MediaInterestfreeEntity.MediaInterestfreeEntityBuilder mediaInterestfreeEntity = MediaInterestfreeEntity.builder();

        mediaInterestfreeEntity.miIdx( interestfree.getMiIdx() );
        mediaInterestfreeEntity.miMonth( interestfree.getMiMonth() );
        mediaInterestfreeEntity.media( toMediaEntity( interestfree.getMedia() ) );

        return mediaInterestfreeEntity.build();
    }

    @Override
    public MediaCategory toMediaCategory(MediaCategoryEntity mediaCategoryEntity) {
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

    @Override
    public MediaCategoryEntity toMediaCategoryEntity(MediaCategory mediaCategory) {
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

    @Override
    public MediaRecommendEntity toMediaRecommendEntity(MediaRecommend mediaRecommend) {
        if ( mediaRecommend == null ) {
            return null;
        }

        MediaRecommendEntity.MediaRecommendEntityBuilder mediaRecommendEntity = MediaRecommendEntity.builder();

        mediaRecommendEntity.mrIdx( mediaRecommend.getMrIdx() );
        mediaRecommendEntity.mediaCategory( toMediaCategoryEntity( mediaRecommend.getMediaCategory() ) );
        mediaRecommendEntity.mrName( mediaRecommend.getMrName() );
        mediaRecommendEntity.mrDisplay( mediaRecommend.getMrDisplay() );
        mediaRecommendEntity.mrSeq( mediaRecommend.getMrSeq() );

        return mediaRecommendEntity.build();
    }

    @Override
    public MediaGenreEntity toMediaGenreEntity(MediaGenre mediaGenre) {
        if ( mediaGenre == null ) {
            return null;
        }

        MediaGenreEntity.MediaGenreEntityBuilder mediaGenreEntity = MediaGenreEntity.builder();

        mediaGenreEntity.mgIdx( mediaGenre.getMgIdx() );
        mediaGenreEntity.mediaCategory( toMediaCategoryEntity( mediaGenre.getMediaCategory() ) );
        mediaGenreEntity.mgName( mediaGenre.getMgName() );
        mediaGenreEntity.mgSeq( mediaGenre.getMgSeq() );

        return mediaGenreEntity.build();
    }

    @Override
    public List<MediaGenre> toMediaGenreList(List<MediaGenreEntity> mediaGenreEntityList) {
        if ( mediaGenreEntityList == null ) {
            return null;
        }

        List<MediaGenre> list = new ArrayList<MediaGenre>( mediaGenreEntityList.size() );
        for ( MediaGenreEntity mediaGenreEntity : mediaGenreEntityList ) {
            list.add( toMediaGenre( mediaGenreEntity ) );
        }

        return list;
    }

    @Override
    public MediaShopDetailEntity toMediaShopDetailEntity(MediaShopDetail mediaShopDetail) {
        if ( mediaShopDetail == null ) {
            return null;
        }

        MediaShopDetailEntity.MediaShopDetailEntityBuilder mediaShopDetailEntity = MediaShopDetailEntity.builder();

        mediaShopDetailEntity.msdIdx( mediaShopDetail.getMsdIdx() );
        mediaShopDetailEntity.mediaShop( toMediaShopEntity( mediaShopDetail.getMediaShop() ) );
        mediaShopDetailEntity.msdType( mediaShopDetail.getMsdType() );
        mediaShopDetailEntity.msdText( mediaShopDetail.getMsdText() );
        mediaShopDetailEntity.msdSeq( mediaShopDetail.getMsdSeq() );

        return mediaShopDetailEntity.build();
    }

    @Override
    public MediaShopDetail toMediaShopDetail(MediaShopDetailEntity mediaShopDetailEntity) {
        if ( mediaShopDetailEntity == null ) {
            return null;
        }

        MediaShopDetail.MediaShopDetailBuilder<?, ?> mediaShopDetail = MediaShopDetail.builder();

        mediaShopDetail.createdAt( mediaShopDetailEntity.getCreatedAt() );
        mediaShopDetail.updatedAt( mediaShopDetailEntity.getUpdatedAt() );
        mediaShopDetail.msdIdx( mediaShopDetailEntity.getMsdIdx() );
        mediaShopDetail.mediaShop( toMediaShop( mediaShopDetailEntity.getMediaShop() ) );
        mediaShopDetail.msdType( mediaShopDetailEntity.getMsdType() );
        mediaShopDetail.msdText( mediaShopDetailEntity.getMsdText() );
        mediaShopDetail.msdSeq( mediaShopDetailEntity.getMsdSeq() );

        return mediaShopDetail.build();
    }

    @Override
    public MediaNewConfig toMediaNewConfig(MediaNewConfigEntity mediaNewConfigEntity) {
        if ( mediaNewConfigEntity == null ) {
            return null;
        }

        MediaNewConfig.MediaNewConfigBuilder<?, ?> mediaNewConfig = MediaNewConfig.builder();

        mediaNewConfig.createdAt( mediaNewConfigEntity.getCreatedAt() );
        mediaNewConfig.updatedAt( mediaNewConfigEntity.getUpdatedAt() );
        mediaNewConfig.mncIdx( mediaNewConfigEntity.getMncIdx() );
        mediaNewConfig.mncDay( mediaNewConfigEntity.getMncDay() );

        return mediaNewConfig.build();
    }

    @Override
    public MediaNewConfigEntity toMediaNewConfigEntity(MediaNewConfig mediaNewConfig) {
        if ( mediaNewConfig == null ) {
            return null;
        }

        MediaNewConfigEntity.MediaNewConfigEntityBuilder mediaNewConfigEntity = MediaNewConfigEntity.builder();

        mediaNewConfigEntity.mncIdx( mediaNewConfig.getMncIdx() );
        mediaNewConfigEntity.mncDay( mediaNewConfig.getMncDay() );

        return mediaNewConfigEntity.build();
    }

    @Override
    public MediaHeart toMediaHeart(MediaHeartEntity mediaHeartEntity) {
        if ( mediaHeartEntity == null ) {
            return null;
        }

        MediaHeart.MediaHeartBuilder<?, ?> mediaHeart = MediaHeart.builder();

        mediaHeart.createdAt( mediaHeartEntity.getCreatedAt() );
        mediaHeart.updatedAt( mediaHeartEntity.getUpdatedAt() );
        mediaHeart.mhIdx( mediaHeartEntity.getMhIdx() );
        mediaHeart.targetType( mediaHeartEntity.getTargetType() );
        mediaHeart.targetId( mediaHeartEntity.getTargetId() );
        mediaHeart.member( memberEntityToMember( mediaHeartEntity.getMember() ) );
        mediaHeart.mhStatus( mediaHeartEntity.getMhStatus() );

        return mediaHeart.build();
    }

    @Override
    public MediaHeartEntity toMediaHeartEntity(MediaHeart mediaHeart) {
        if ( mediaHeart == null ) {
            return null;
        }

        MediaHeartEntity.MediaHeartEntityBuilder mediaHeartEntity = MediaHeartEntity.builder();

        mediaHeartEntity.mhIdx( mediaHeart.getMhIdx() );
        mediaHeartEntity.targetType( mediaHeart.getTargetType() );
        mediaHeartEntity.targetId( mediaHeart.getTargetId() );
        mediaHeartEntity.member( memberToMemberEntity( mediaHeart.getMember() ) );
        mediaHeartEntity.mhStatus( mediaHeart.getMhStatus() );

        return mediaHeartEntity.build();
    }

    @Override
    public MediaMoveEntity toMediaMoveEntity(MediaMove mediaMove) {
        if ( mediaMove == null ) {
            return null;
        }

        MediaMoveEntity.MediaMoveEntityBuilder mediaMoveEntity = MediaMoveEntity.builder();

        mediaMoveEntity.mmIdx( mediaMove.getMmIdx() );
        mediaMoveEntity.mmType( mediaMove.getMmType() );
        mediaMoveEntity.mmOriginId( mediaMove.getMmOriginId() );
        mediaMoveEntity.mmOriginType( mediaMove.getMmOriginType() );
        mediaMoveEntity.meIdx( mediaMove.getMeIdx() );
        mediaMoveEntity.fmIdx( mediaMove.getFmIdx() );
        mediaMoveEntity.mmVideo( mediaMove.getMmVideo() );
        mediaMoveEntity.mmThumbnail( mediaMove.getMmThumbnail() );

        return mediaMoveEntity.build();
    }

    @Override
    public MediaMove toMediaMove(MediaMoveEntity mediaMoveEntity) {
        if ( mediaMoveEntity == null ) {
            return null;
        }

        MediaMove.MediaMoveBuilder<?, ?> mediaMove = MediaMove.builder();

        mediaMove.createdAt( mediaMoveEntity.getCreatedAt() );
        mediaMove.updatedAt( mediaMoveEntity.getUpdatedAt() );
        mediaMove.mmIdx( mediaMoveEntity.getMmIdx() );
        mediaMove.mmType( mediaMoveEntity.getMmType() );
        mediaMove.mmOriginId( mediaMoveEntity.getMmOriginId() );
        mediaMove.mmOriginType( mediaMoveEntity.getMmOriginType() );
        mediaMove.meIdx( mediaMoveEntity.getMeIdx() );
        mediaMove.fmIdx( mediaMoveEntity.getFmIdx() );
        mediaMove.mmVideo( mediaMoveEntity.getMmVideo() );
        mediaMove.mmThumbnail( mediaMoveEntity.getMmThumbnail() );

        return mediaMove.build();
    }

    @Override
    public MediaHistory toMediaHistory(MediaHistoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MediaHistory.MediaHistoryBuilder<?, ?> mediaHistory = MediaHistory.builder();

        mediaHistory.createdAt( entity.getCreatedAt() );
        mediaHistory.updatedAt( entity.getUpdatedAt() );
        mediaHistory.mhIdx( entity.getMhIdx() );
        mediaHistory.media( toMedia( entity.getMedia() ) );
        mediaHistory.mbNo( memberEntityToMember( entity.getMbNo() ) );
        mediaHistory.mhTimelineSt( entity.getMhTimelineSt() );
        mediaHistory.mhTimelineEd( entity.getMhTimelineEd() );
        mediaHistory.mhDateSt( entity.getMhDateSt() );
        mediaHistory.mhDateEd( entity.getMhDateEd() );
        mediaHistory.mhDelete( entity.getMhDelete() );

        return mediaHistory.build();
    }

    @Override
    public MediaHistoryEntity toMediaHistoryEntity(MediaHistory model) {
        if ( model == null ) {
            return null;
        }

        MediaHistoryEntity.MediaHistoryEntityBuilder mediaHistoryEntity = MediaHistoryEntity.builder();

        mediaHistoryEntity.mhIdx( model.getMhIdx() );
        mediaHistoryEntity.media( toMediaEntity( model.getMedia() ) );
        mediaHistoryEntity.mbNo( memberToMemberEntity( model.getMbNo() ) );
        mediaHistoryEntity.mhTimelineSt( model.getMhTimelineSt() );
        mediaHistoryEntity.mhTimelineEd( model.getMhTimelineEd() );
        mediaHistoryEntity.mhDateSt( model.getMhDateSt() );
        mediaHistoryEntity.mhDateEd( model.getMhDateEd() );
        mediaHistoryEntity.mhDelete( model.getMhDelete() );

        return mediaHistoryEntity.build();
    }

    @Override
    public MediaMetadata toMediaMetadata(MediaMetadataEntity mediaMetadataEntity) {
        if ( mediaMetadataEntity == null ) {
            return null;
        }

        MediaMetadata.MediaMetadataBuilder<?, ?> mediaMetadata = MediaMetadata.builder();

        mediaMetadata.createdAt( mediaMetadataEntity.getCreatedAt() );
        mediaMetadata.updatedAt( mediaMetadataEntity.getUpdatedAt() );
        mediaMetadata.mmIdx( mediaMetadataEntity.getMmIdx() );
        mediaMetadata.media( toMedia( mediaMetadataEntity.getMedia() ) );
        mediaMetadata.mmProducer( mediaMetadataEntity.getMmProducer() );
        mediaMetadata.mmSynopsis( mediaMetadataEntity.getMmSynopsis() );
        mediaMetadata.mmKeywords( mediaMetadataEntity.getMmKeywords() );

        return mediaMetadata.build();
    }

    @Override
    public MediaMetadataEntity toMediaMetadataEntity(MediaMetadata mediaMetadata) {
        if ( mediaMetadata == null ) {
            return null;
        }

        MediaMetadataEntity.MediaMetadataEntityBuilder mediaMetadataEntity = MediaMetadataEntity.builder();

        mediaMetadataEntity.mmIdx( mediaMetadata.getMmIdx() );
        mediaMetadataEntity.media( toMediaEntity( mediaMetadata.getMedia() ) );
        mediaMetadataEntity.mmProducer( mediaMetadata.getMmProducer() );
        mediaMetadataEntity.mmSynopsis( mediaMetadata.getMmSynopsis() );
        mediaMetadataEntity.mmKeywords( mediaMetadata.getMmKeywords() );

        return mediaMetadataEntity.build();
    }

    @Override
    public MediaKeyword toMediaKeyword(MediaKeywordEntity mediaKeywordEntity) {
        if ( mediaKeywordEntity == null ) {
            return null;
        }

        MediaKeyword.MediaKeywordBuilder<?, ?> mediaKeyword = MediaKeyword.builder();

        mediaKeyword.createdAt( mediaKeywordEntity.getCreatedAt() );
        mediaKeyword.updatedAt( mediaKeywordEntity.getUpdatedAt() );
        mediaKeyword.mkIdx( mediaKeywordEntity.getMkIdx() );
        mediaKeyword.mediaMetadata( toMediaMetadata( mediaKeywordEntity.getMediaMetadata() ) );
        mediaKeyword.mkKeyword( mediaKeywordEntity.getMkKeyword() );

        return mediaKeyword.build();
    }

    @Override
    public MediaKeywordEntity toMediaKeywordEntity(MediaKeyword mediaKeyword) {
        if ( mediaKeyword == null ) {
            return null;
        }

        MediaKeywordEntity.MediaKeywordEntityBuilder mediaKeywordEntity = MediaKeywordEntity.builder();

        mediaKeywordEntity.mkIdx( mediaKeyword.getMkIdx() );
        mediaKeywordEntity.mediaMetadata( toMediaMetadataEntity( mediaKeyword.getMediaMetadata() ) );
        mediaKeywordEntity.mkKeyword( mediaKeyword.getMkKeyword() );

        return mediaKeywordEntity.build();
    }

    @Override
    public List<MediaKeyword> toMediaKeywordList(List<MediaKeywordEntity> mediaKeywordEntityList) {
        if ( mediaKeywordEntityList == null ) {
            return null;
        }

        List<MediaKeyword> list = new ArrayList<MediaKeyword>( mediaKeywordEntityList.size() );
        for ( MediaKeywordEntity mediaKeywordEntity : mediaKeywordEntityList ) {
            list.add( toMediaKeyword( mediaKeywordEntity ) );
        }

        return list;
    }

    @Override
    public MediaByItemEntity toMediaByItemEntity(MediaByItem mediaByItem) {
        if ( mediaByItem == null ) {
            return null;
        }

        MediaByItemEntity.MediaByItemEntityBuilder mediaByItemEntity = MediaByItemEntity.builder();

        mediaByItemEntity.mbiIdx( mediaByItem.getMbiIdx() );
        mediaByItemEntity.media( toMediaEntity( mediaByItem.getMedia() ) );
        mediaByItemEntity.item( productAdminInfraMapper.toItemEntity( mediaByItem.getItem() ) );

        return mediaByItemEntity.build();
    }

    @Override
    public MediaByItem toMediaByItem(MediaByItemEntity mediaByItemEntity) {
        if ( mediaByItemEntity == null ) {
            return null;
        }

        MediaByItem.MediaByItemBuilder<?, ?> mediaByItem = MediaByItem.builder();

        mediaByItem.createdAt( mediaByItemEntity.getCreatedAt() );
        mediaByItem.updatedAt( mediaByItemEntity.getUpdatedAt() );
        mediaByItem.mbiIdx( mediaByItemEntity.getMbiIdx() );
        mediaByItem.media( toMedia( mediaByItemEntity.getMedia() ) );
        mediaByItem.item( productAdminInfraMapper.toItem( mediaByItemEntity.getItem() ) );

        return mediaByItem.build();
    }

    @Override
    public List<MediaByItem> toMediaByItemList(List<MediaByItemEntity> mediaByItemEntityList) {
        if ( mediaByItemEntityList == null ) {
            return null;
        }

        List<MediaByItem> list = new ArrayList<MediaByItem>( mediaByItemEntityList.size() );
        for ( MediaByItemEntity mediaByItemEntity : mediaByItemEntityList ) {
            list.add( toMediaByItem( mediaByItemEntity ) );
        }

        return list;
    }

    @Override
    public List<MediaByItemEntity> toMediaByItemEntityList(List<MediaByItem> mediaByItemList) {
        if ( mediaByItemList == null ) {
            return null;
        }

        List<MediaByItemEntity> list = new ArrayList<MediaByItemEntity>( mediaByItemList.size() );
        for ( MediaByItem mediaByItem : mediaByItemList ) {
            list.add( toMediaByItemEntity( mediaByItem ) );
        }

        return list;
    }

    @Override
    public MediaUploaderListEntity toMediaUploaderListEntity(MediaUploaderList mediaUploaderList) {
        if ( mediaUploaderList == null ) {
            return null;
        }

        MediaUploaderListEntity.MediaUploaderListEntityBuilder mediaUploaderListEntity = MediaUploaderListEntity.builder();

        mediaUploaderListEntity.mulIdx( mediaUploaderList.getMulIdx() );
        mediaUploaderListEntity.media( toMediaEntity( mediaUploaderList.getMedia() ) );
        mediaUploaderListEntity.mulViewCnt( mediaUploaderList.getMulViewCnt() );
        mediaUploaderListEntity.mulClickCnt( mediaUploaderList.getMulClickCnt() );

        return mediaUploaderListEntity.build();
    }

    @Override
    public MediaClickLogEntity toMediaClickLogEntity(MediaClickLog from) {
        if ( from == null ) {
            return null;
        }

        MediaClickLogEntity.MediaClickLogEntityBuilder mediaClickLogEntity = MediaClickLogEntity.builder();

        mediaClickLogEntity.mclIdx( from.getMclIdx() );
        mediaClickLogEntity.media( toMediaEntity( from.getMedia() ) );
        mediaClickLogEntity.member( memberToMemberEntity( from.getMember() ) );
        mediaClickLogEntity.mclPlatform( from.getMclPlatform() );
        mediaClickLogEntity.mclPagePath( from.getMclPagePath() );
        mediaClickLogEntity.mclAi( from.getMclAi() );

        return mediaClickLogEntity.build();
    }

    protected MediaDeleteReasonDefineEntity mediaDeleteReasonToMediaDeleteReasonDefineEntity(MediaDeleteReason mediaDeleteReason) {
        if ( mediaDeleteReason == null ) {
            return null;
        }

        MediaDeleteReasonDefineEntity.MediaDeleteReasonDefineEntityBuilder mediaDeleteReasonDefineEntity = MediaDeleteReasonDefineEntity.builder();

        mediaDeleteReasonDefineEntity.mdrIdx( mediaDeleteReason.getMdrIdx() );
        mediaDeleteReasonDefineEntity.mdrReason( mediaDeleteReason.getMdrReason() );
        mediaDeleteReasonDefineEntity.mdrType( mediaDeleteReason.getMdrType() );

        return mediaDeleteReasonDefineEntity.build();
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

    protected SoDefineEntity soDefineToSoDefineEntity(SoDefine soDefine) {
        if ( soDefine == null ) {
            return null;
        }

        SoDefineEntity.SoDefineEntityBuilder soDefineEntity = SoDefineEntity.builder();

        soDefineEntity.sdIdx( soDefine.getSdIdx() );
        soDefineEntity.sdDepth( soDefine.getSdDepth() );
        soDefineEntity.sdParent( soDefine.getSdParent() );
        soDefineEntity.areaDefine( areaDefineToAreaDefineEntity( soDefine.getAreaDefine() ) );
        soDefineEntity.sdName( soDefine.getSdName() );
        soDefineEntity.sdOption( soDefine.getSdOption() );
        soDefineEntity.sdSi( soDefine.getSdSi() );

        return soDefineEntity.build();
    }

    protected SoDefine soDefineEntityToSoDefine(SoDefineEntity soDefineEntity) {
        if ( soDefineEntity == null ) {
            return null;
        }

        SoDefine.SoDefineBuilder soDefine = SoDefine.builder();

        soDefine.sdIdx( soDefineEntity.getSdIdx() );
        soDefine.sdDepth( soDefineEntity.getSdDepth() );
        soDefine.sdParent( soDefineEntity.getSdParent() );
        soDefine.areaDefine( areaDefineEntityToAreaDefine( soDefineEntity.getAreaDefine() ) );
        soDefine.sdName( soDefineEntity.getSdName() );
        soDefine.sdOption( soDefineEntity.getSdOption() );
        soDefine.sdSi( soDefineEntity.getSdSi() );

        return soDefine.build();
    }

    protected ClassAreaEntity classAreaToClassAreaEntity(ClassArea classArea) {
        if ( classArea == null ) {
            return null;
        }

        ClassAreaEntity.ClassAreaEntityBuilder classAreaEntity = ClassAreaEntity.builder();

        classAreaEntity.caIdx( classArea.getCaIdx() );
        classAreaEntity.caName( classArea.getCaName() );
        classAreaEntity.caSeq( classArea.getCaSeq() );
        classAreaEntity.aosDisplay( classArea.getAosDisplay() );
        classAreaEntity.smartDisplay( classArea.getSmartDisplay() );
        classAreaEntity.ottAppDisplay( classArea.getOttAppDisplay() );
        classAreaEntity.caDefault( classArea.getCaDefault() );

        return classAreaEntity.build();
    }

    protected ClassArea classAreaEntityToClassArea(ClassAreaEntity classAreaEntity) {
        if ( classAreaEntity == null ) {
            return null;
        }

        ClassArea.ClassAreaBuilder<?, ?> classArea = ClassArea.builder();

        classArea.createdAt( classAreaEntity.getCreatedAt() );
        classArea.updatedAt( classAreaEntity.getUpdatedAt() );
        classArea.caIdx( classAreaEntity.getCaIdx() );
        classArea.caName( classAreaEntity.getCaName() );
        classArea.caSeq( classAreaEntity.getCaSeq() );
        classArea.aosDisplay( classAreaEntity.getAosDisplay() );
        classArea.smartDisplay( classAreaEntity.getSmartDisplay() );
        classArea.ottAppDisplay( classAreaEntity.getOttAppDisplay() );
        classArea.caDefault( classAreaEntity.getCaDefault() );

        return classArea.build();
    }
}
