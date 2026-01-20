package com.cmb.rainbowtv.domain.coin.infra;

import com.cmb.rainbowtv.domain.coin.infra.data.entity.CoinByMediaShopEntity;
import com.cmb.rainbowtv.domain.coin.infra.data.entity.CoinByMediaVodEntity;
import com.cmb.rainbowtv.domain.coin.infra.data.entity.CoinByPrizeEntity;
import com.cmb.rainbowtv.domain.coin.infra.data.entity.CoinCategoryEntity;
import com.cmb.rainbowtv.domain.coin.infra.data.entity.CoinDefineEntity;
import com.cmb.rainbowtv.domain.coin.infra.data.entity.CoinEntity;
import com.cmb.rainbowtv.domain.coin.infra.data.entity.CoinInfoEntity;
import com.cmb.rainbowtv.domain.coin.model.Coin;
import com.cmb.rainbowtv.domain.coin.model.CoinByMediaShop;
import com.cmb.rainbowtv.domain.coin.model.CoinByMediaVod;
import com.cmb.rainbowtv.domain.coin.model.CoinByPrize;
import com.cmb.rainbowtv.domain.coin.model.CoinCategory;
import com.cmb.rainbowtv.domain.coin.model.CoinDefine;
import com.cmb.rainbowtv.domain.coin.model.CoinInfo;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaCategoryEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaGenreEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaShopTradeHistoryEntity;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaVodTradeHistoryEntity;
import com.cmb.rainbowtv.domain.media.model.Media;
import com.cmb.rainbowtv.domain.media.model.MediaCategory;
import com.cmb.rainbowtv.domain.media.model.MediaGenre;
import com.cmb.rainbowtv.domain.media.model.MediaShopTradeHistory;
import com.cmb.rainbowtv.domain.media.model.MediaVodTradeHistory;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.prize.infra.data.entity.PrizeEntity;
import com.cmb.rainbowtv.domain.prize.infra.data.entity.PrizeTradeHistoryEntity;
import com.cmb.rainbowtv.domain.prize.model.Prize;
import com.cmb.rainbowtv.domain.prize.model.PrizeTradeHistory;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:45+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CoinInfraMapperImpl implements CoinInfraMapper {

    @Override
    public CoinDefine toCoinDefine(CoinDefineEntity byCdCode) {
        if ( byCdCode == null ) {
            return null;
        }

        CoinDefine.CoinDefineBuilder<?, ?> coinDefine = CoinDefine.builder();

        coinDefine.createdAt( byCdCode.getCreatedAt() );
        coinDefine.updatedAt( byCdCode.getUpdatedAt() );
        coinDefine.cdIdx( byCdCode.getCdIdx() );
        coinDefine.cdCategory( byCdCode.getCdCategory() );
        coinDefine.cdCode( byCdCode.getCdCode() );
        coinDefine.cdReason( byCdCode.getCdReason() );
        coinDefine.cdCoin( byCdCode.getCdCoin() );
        coinDefine.cdIsUse( byCdCode.getCdIsUse() );

        return coinDefine.build();
    }

    @Override
    public CoinEntity toCoinEntity(Coin coin) {
        if ( coin == null ) {
            return null;
        }

        CoinEntity.CoinEntityBuilder coinEntity = CoinEntity.builder();

        coinEntity.coIdx( coin.getCoIdx() );
        coinEntity.coinDefine( coinDefineToCoinDefineEntity( coin.getCoinDefine() ) );
        coinEntity.coUuid( coin.getCoUuid() );
        coinEntity.member( memberToMemberEntity( coin.getMember() ) );
        coinEntity.coReason( coin.getCoReason() );
        coinEntity.coCoin( coin.getCoCoin() );
        coinEntity.coCoinHistory( coin.getCoCoinHistory() );
        coinEntity.coExpireDate( coin.getCoExpireDate() );
        coinEntity.coinCategory( coinCategoryToCoinCategoryEntity( coin.getCoinCategory() ) );
        coinEntity.coLegacyCode( coin.getCoLegacyCode() );

        return coinEntity.build();
    }

    @Override
    public Coin toCoin(CoinEntity save) {
        if ( save == null ) {
            return null;
        }

        Coin.CoinBuilder<?, ?> coin = Coin.builder();

        coin.createdAt( save.getCreatedAt() );
        coin.updatedAt( save.getUpdatedAt() );
        coin.coIdx( save.getCoIdx() );
        coin.coinDefine( toCoinDefine( save.getCoinDefine() ) );
        coin.coUuid( save.getCoUuid() );
        coin.member( memberEntityToMember( save.getMember() ) );
        coin.coReason( save.getCoReason() );
        coin.coCoin( save.getCoCoin() );
        coin.coCoinHistory( save.getCoCoinHistory() );
        coin.coExpireDate( save.getCoExpireDate() );
        coin.coinCategory( toCoinCategory( save.getCoinCategory() ) );
        coin.coLegacyCode( save.getCoLegacyCode() );

        return coin.build();
    }

    @Override
    public CoinInfoEntity toCoinInfoEntity(CoinInfo coinInfo) {
        if ( coinInfo == null ) {
            return null;
        }

        CoinInfoEntity.CoinInfoEntityBuilder coinInfoEntity = CoinInfoEntity.builder();

        coinInfoEntity.ciIdx( coinInfo.getCiIdx() );
        coinInfoEntity.coin( toCoinEntity( coinInfo.getCoin() ) );
        coinInfoEntity.ciParent( coinInfo.getCiParent() );
        coinInfoEntity.ciCoin( coinInfo.getCiCoin() );
        coinInfoEntity.ciExpireDate( coinInfo.getCiExpireDate() );

        return coinInfoEntity.build();
    }

    @Override
    public CoinInfo toCoinInfo(CoinInfoEntity save) {
        if ( save == null ) {
            return null;
        }

        CoinInfo.CoinInfoBuilder<?, ?> coinInfo = CoinInfo.builder();

        coinInfo.createdAt( save.getCreatedAt() );
        coinInfo.updatedAt( save.getUpdatedAt() );
        coinInfo.ciIdx( save.getCiIdx() );
        coinInfo.coin( toCoin( save.getCoin() ) );
        coinInfo.ciParent( save.getCiParent() );
        coinInfo.ciCoin( save.getCiCoin() );
        coinInfo.ciExpireDate( save.getCiExpireDate() );

        return coinInfo.build();
    }

    @Override
    public List<CoinInfoEntity> toCoinInfoEntityList(List<CoinInfo> coinInfoList) {
        if ( coinInfoList == null ) {
            return null;
        }

        List<CoinInfoEntity> list = new ArrayList<CoinInfoEntity>( coinInfoList.size() );
        for ( CoinInfo coinInfo : coinInfoList ) {
            list.add( toCoinInfoEntity( coinInfo ) );
        }

        return list;
    }

    @Override
    public CoinByPrize toCoinByPrize(CoinByPrizeEntity coinByPrizeEntity) {
        if ( coinByPrizeEntity == null ) {
            return null;
        }

        CoinByPrize.CoinByPrizeBuilder<?, ?> coinByPrize = CoinByPrize.builder();

        coinByPrize.createdAt( coinByPrizeEntity.getCreatedAt() );
        coinByPrize.updatedAt( coinByPrizeEntity.getUpdatedAt() );
        coinByPrize.cbpIdx( coinByPrizeEntity.getCbpIdx() );
        coinByPrize.coin( toCoin( coinByPrizeEntity.getCoin() ) );
        coinByPrize.prizeTradeHistory( prizeTradeHistoryEntityToPrizeTradeHistory( coinByPrizeEntity.getPrizeTradeHistory() ) );

        return coinByPrize.build();
    }

    @Override
    public List<CoinInfo> toCoinInfoList(List<CoinInfoEntity> allByCoinCoIdx) {
        if ( allByCoinCoIdx == null ) {
            return null;
        }

        List<CoinInfo> list = new ArrayList<CoinInfo>( allByCoinCoIdx.size() );
        for ( CoinInfoEntity coinInfoEntity : allByCoinCoIdx ) {
            list.add( toCoinInfo( coinInfoEntity ) );
        }

        return list;
    }

    @Override
    public CoinCategory toCoinCategory(CoinCategoryEntity coinCategoryEntity) {
        if ( coinCategoryEntity == null ) {
            return null;
        }

        CoinCategory.CoinCategoryBuilder<?, ?> coinCategory = CoinCategory.builder();

        coinCategory.createdAt( coinCategoryEntity.getCreatedAt() );
        coinCategory.updatedAt( coinCategoryEntity.getUpdatedAt() );
        coinCategory.ccIdx( coinCategoryEntity.getCcIdx() );
        coinCategory.ccName( coinCategoryEntity.getCcName() );
        coinCategory.ccCode( coinCategoryEntity.getCcCode() );

        return coinCategory.build();
    }

    @Override
    public List<CoinEntity> toCoinEntityList(List<Coin> coinList) {
        if ( coinList == null ) {
            return null;
        }

        List<CoinEntity> list = new ArrayList<CoinEntity>( coinList.size() );
        for ( Coin coin : coinList ) {
            list.add( toCoinEntity( coin ) );
        }

        return list;
    }

    @Override
    public List<CoinCategory> toCoinCategoryList(List<CoinCategoryEntity> all) {
        if ( all == null ) {
            return null;
        }

        List<CoinCategory> list = new ArrayList<CoinCategory>( all.size() );
        for ( CoinCategoryEntity coinCategoryEntity : all ) {
            list.add( toCoinCategory( coinCategoryEntity ) );
        }

        return list;
    }

    @Override
    public CoinByPrizeEntity toCoinByPrizeEntity(CoinByPrize coinByPrize) {
        if ( coinByPrize == null ) {
            return null;
        }

        CoinByPrizeEntity.CoinByPrizeEntityBuilder coinByPrizeEntity = CoinByPrizeEntity.builder();

        coinByPrizeEntity.cbpIdx( coinByPrize.getCbpIdx() );
        coinByPrizeEntity.coin( toCoinEntity( coinByPrize.getCoin() ) );
        coinByPrizeEntity.prizeTradeHistory( prizeTradeHistoryToPrizeTradeHistoryEntity( coinByPrize.getPrizeTradeHistory() ) );

        return coinByPrizeEntity.build();
    }

    @Override
    public CoinByMediaShopEntity toCoinByMediaShopEntity(CoinByMediaShop coinByMediaShop) {
        if ( coinByMediaShop == null ) {
            return null;
        }

        CoinByMediaShopEntity.CoinByMediaShopEntityBuilder coinByMediaShopEntity = CoinByMediaShopEntity.builder();

        coinByMediaShopEntity.cbmsIdx( coinByMediaShop.getCbmsIdx() );
        coinByMediaShopEntity.coin( toCoinEntity( coinByMediaShop.getCoin() ) );
        coinByMediaShopEntity.mediaShopTradeHistory( mediaShopTradeHistoryToMediaShopTradeHistoryEntity( coinByMediaShop.getMediaShopTradeHistory() ) );

        return coinByMediaShopEntity.build();
    }

    @Override
    public CoinByMediaShop toCoinByMediaShop(CoinByMediaShopEntity coinByMediaShopEntity) {
        if ( coinByMediaShopEntity == null ) {
            return null;
        }

        CoinByMediaShop.CoinByMediaShopBuilder<?, ?> coinByMediaShop = CoinByMediaShop.builder();

        coinByMediaShop.createdAt( coinByMediaShopEntity.getCreatedAt() );
        coinByMediaShop.updatedAt( coinByMediaShopEntity.getUpdatedAt() );
        coinByMediaShop.cbmsIdx( coinByMediaShopEntity.getCbmsIdx() );
        coinByMediaShop.coin( toCoin( coinByMediaShopEntity.getCoin() ) );
        coinByMediaShop.mediaShopTradeHistory( mediaShopTradeHistoryEntityToMediaShopTradeHistory( coinByMediaShopEntity.getMediaShopTradeHistory() ) );

        return coinByMediaShop.build();
    }

    @Override
    public CoinByMediaVodEntity toCoinByMediaVodEntity(CoinByMediaVod coinByMediaVod) {
        if ( coinByMediaVod == null ) {
            return null;
        }

        CoinByMediaVodEntity.CoinByMediaVodEntityBuilder coinByMediaVodEntity = CoinByMediaVodEntity.builder();

        coinByMediaVodEntity.cbmvIdx( coinByMediaVod.getCbmvIdx() );
        coinByMediaVodEntity.coin( toCoinEntity( coinByMediaVod.getCoin() ) );
        coinByMediaVodEntity.mediaVodTradeHistory( mediaVodTradeHistoryToMediaVodTradeHistoryEntity( coinByMediaVod.getMediaVodTradeHistory() ) );

        return coinByMediaVodEntity.build();
    }

    @Override
    public CoinByMediaVod toCoinByMediaVod(CoinByMediaVodEntity coinByMediaVodEntity) {
        if ( coinByMediaVodEntity == null ) {
            return null;
        }

        CoinByMediaVod.CoinByMediaVodBuilder<?, ?> coinByMediaVod = CoinByMediaVod.builder();

        coinByMediaVod.createdAt( coinByMediaVodEntity.getCreatedAt() );
        coinByMediaVod.updatedAt( coinByMediaVodEntity.getUpdatedAt() );
        coinByMediaVod.cbmvIdx( coinByMediaVodEntity.getCbmvIdx() );
        coinByMediaVod.coin( toCoin( coinByMediaVodEntity.getCoin() ) );
        coinByMediaVod.mediaVodTradeHistory( mediaVodTradeHistoryEntityToMediaVodTradeHistory( coinByMediaVodEntity.getMediaVodTradeHistory() ) );

        return coinByMediaVod.build();
    }

    protected CoinDefineEntity coinDefineToCoinDefineEntity(CoinDefine coinDefine) {
        if ( coinDefine == null ) {
            return null;
        }

        CoinDefineEntity.CoinDefineEntityBuilder coinDefineEntity = CoinDefineEntity.builder();

        coinDefineEntity.cdIdx( coinDefine.getCdIdx() );
        coinDefineEntity.cdCategory( coinDefine.getCdCategory() );
        coinDefineEntity.cdCode( coinDefine.getCdCode() );
        coinDefineEntity.cdReason( coinDefine.getCdReason() );
        coinDefineEntity.cdCoin( coinDefine.getCdCoin() );
        coinDefineEntity.cdIsUse( coinDefine.getCdIsUse() );

        return coinDefineEntity.build();
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

    protected CoinCategoryEntity coinCategoryToCoinCategoryEntity(CoinCategory coinCategory) {
        if ( coinCategory == null ) {
            return null;
        }

        CoinCategoryEntity.CoinCategoryEntityBuilder coinCategoryEntity = CoinCategoryEntity.builder();

        coinCategoryEntity.ccIdx( coinCategory.getCcIdx() );
        coinCategoryEntity.ccName( coinCategory.getCcName() );
        coinCategoryEntity.ccCode( coinCategory.getCcCode() );

        return coinCategoryEntity.build();
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

    protected Prize prizeEntityToPrize(PrizeEntity prizeEntity) {
        if ( prizeEntity == null ) {
            return null;
        }

        Prize.PrizeBuilder prize = Prize.builder();

        prize.prIdx( prizeEntity.getPrIdx() );
        prize.prExchangeName( prizeEntity.getPrExchangeName() );
        prize.prPrice( prizeEntity.getPrPrice() );
        prize.prName( prizeEntity.getPrName() );
        prize.prIsUse( prizeEntity.getPrIsUse() );
        prize.prCategory( prizeEntity.getPrCategory() );
        prize.prCompany( prizeEntity.getPrCompany() );
        prize.prCode( prizeEntity.getPrCode() );
        prize.prPostTimeSt( prizeEntity.getPrPostTimeSt() );
        prize.prPostTimeEd( prizeEntity.getPrPostTimeEd() );
        prize.prSellStatus( prizeEntity.getPrSellStatus() );
        prize.prLimitAge( prizeEntity.getPrLimitAge() );
        prize.prInfo( prizeEntity.getPrInfo() );

        return prize.build();
    }

    protected PrizeTradeHistory prizeTradeHistoryEntityToPrizeTradeHistory(PrizeTradeHistoryEntity prizeTradeHistoryEntity) {
        if ( prizeTradeHistoryEntity == null ) {
            return null;
        }

        PrizeTradeHistory.PrizeTradeHistoryBuilder<?, ?> prizeTradeHistory = PrizeTradeHistory.builder();

        prizeTradeHistory.createdAt( prizeTradeHistoryEntity.getCreatedAt() );
        prizeTradeHistory.updatedAt( prizeTradeHistoryEntity.getUpdatedAt() );
        prizeTradeHistory.pthIdx( prizeTradeHistoryEntity.getPthIdx() );
        prizeTradeHistory.member( memberEntityToMember( prizeTradeHistoryEntity.getMember() ) );
        prizeTradeHistory.prize( prizeEntityToPrize( prizeTradeHistoryEntity.getPrize() ) );
        prizeTradeHistory.pthTel( prizeTradeHistoryEntity.getPthTel() );
        prizeTradeHistory.pthAddr( prizeTradeHistoryEntity.getPthAddr() );
        prizeTradeHistory.pthAddrDetail( prizeTradeHistoryEntity.getPthAddrDetail() );
        prizeTradeHistory.pthZipcode( prizeTradeHistoryEntity.getPthZipcode() );
        prizeTradeHistory.pthReceiver( prizeTradeHistoryEntity.getPthReceiver() );
        prizeTradeHistory.pthStatus( prizeTradeHistoryEntity.getPthStatus() );
        prizeTradeHistory.cpCode( prizeTradeHistoryEntity.getCpCode() );
        prizeTradeHistory.pthCancelReason( prizeTradeHistoryEntity.getPthCancelReason() );

        return prizeTradeHistory.build();
    }

    protected PrizeEntity prizeToPrizeEntity(Prize prize) {
        if ( prize == null ) {
            return null;
        }

        PrizeEntity.PrizeEntityBuilder prizeEntity = PrizeEntity.builder();

        prizeEntity.prIdx( prize.getPrIdx() );
        prizeEntity.prExchangeName( prize.getPrExchangeName() );
        prizeEntity.prPrice( prize.getPrPrice() );
        prizeEntity.prName( prize.getPrName() );
        prizeEntity.prIsUse( prize.getPrIsUse() );
        prizeEntity.prCategory( prize.getPrCategory() );
        prizeEntity.prCompany( prize.getPrCompany() );
        prizeEntity.prCode( prize.getPrCode() );
        prizeEntity.prPostTimeSt( prize.getPrPostTimeSt() );
        prizeEntity.prPostTimeEd( prize.getPrPostTimeEd() );
        prizeEntity.prSellStatus( prize.getPrSellStatus() );
        prizeEntity.prLimitAge( prize.getPrLimitAge() );
        prizeEntity.prInfo( prize.getPrInfo() );

        return prizeEntity.build();
    }

    protected PrizeTradeHistoryEntity prizeTradeHistoryToPrizeTradeHistoryEntity(PrizeTradeHistory prizeTradeHistory) {
        if ( prizeTradeHistory == null ) {
            return null;
        }

        PrizeTradeHistoryEntity.PrizeTradeHistoryEntityBuilder prizeTradeHistoryEntity = PrizeTradeHistoryEntity.builder();

        prizeTradeHistoryEntity.pthIdx( prizeTradeHistory.getPthIdx() );
        prizeTradeHistoryEntity.member( memberToMemberEntity( prizeTradeHistory.getMember() ) );
        prizeTradeHistoryEntity.prize( prizeToPrizeEntity( prizeTradeHistory.getPrize() ) );
        prizeTradeHistoryEntity.pthTel( prizeTradeHistory.getPthTel() );
        prizeTradeHistoryEntity.pthAddr( prizeTradeHistory.getPthAddr() );
        prizeTradeHistoryEntity.pthAddrDetail( prizeTradeHistory.getPthAddrDetail() );
        prizeTradeHistoryEntity.pthZipcode( prizeTradeHistory.getPthZipcode() );
        prizeTradeHistoryEntity.pthReceiver( prizeTradeHistory.getPthReceiver() );
        prizeTradeHistoryEntity.pthStatus( prizeTradeHistory.getPthStatus() );
        prizeTradeHistoryEntity.cpCode( prizeTradeHistory.getCpCode() );
        prizeTradeHistoryEntity.pthCancelReason( prizeTradeHistory.getPthCancelReason() );

        return prizeTradeHistoryEntity.build();
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

    protected MediaShopTradeHistoryEntity mediaShopTradeHistoryToMediaShopTradeHistoryEntity(MediaShopTradeHistory mediaShopTradeHistory) {
        if ( mediaShopTradeHistory == null ) {
            return null;
        }

        MediaShopTradeHistoryEntity.MediaShopTradeHistoryEntityBuilder mediaShopTradeHistoryEntity = MediaShopTradeHistoryEntity.builder();

        mediaShopTradeHistoryEntity.msthIdx( mediaShopTradeHistory.getMsthIdx() );
        mediaShopTradeHistoryEntity.member( memberToMemberEntity( mediaShopTradeHistory.getMember() ) );
        mediaShopTradeHistoryEntity.media( mediaToMediaEntity( mediaShopTradeHistory.getMedia() ) );
        mediaShopTradeHistoryEntity.msthTel( mediaShopTradeHistory.getMsthTel() );
        mediaShopTradeHistoryEntity.msthAddr( mediaShopTradeHistory.getMsthAddr() );
        mediaShopTradeHistoryEntity.msthAddrDetail( mediaShopTradeHistory.getMsthAddrDetail() );
        mediaShopTradeHistoryEntity.msthZipcode( mediaShopTradeHistory.getMsthZipcode() );
        mediaShopTradeHistoryEntity.msthReceiver( mediaShopTradeHistory.getMsthReceiver() );
        mediaShopTradeHistoryEntity.msthStatus( mediaShopTradeHistory.getMsthStatus() );
        mediaShopTradeHistoryEntity.mcAttribute( mediaShopTradeHistory.getMcAttribute() );
        mediaShopTradeHistoryEntity.msthCompany( mediaShopTradeHistory.getMsthCompany() );
        mediaShopTradeHistoryEntity.msthHp( mediaShopTradeHistory.getMsthHp() );
        mediaShopTradeHistoryEntity.msthCancelReason( mediaShopTradeHistory.getMsthCancelReason() );

        return mediaShopTradeHistoryEntity.build();
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

    protected MediaShopTradeHistory mediaShopTradeHistoryEntityToMediaShopTradeHistory(MediaShopTradeHistoryEntity mediaShopTradeHistoryEntity) {
        if ( mediaShopTradeHistoryEntity == null ) {
            return null;
        }

        MediaShopTradeHistory.MediaShopTradeHistoryBuilder<?, ?> mediaShopTradeHistory = MediaShopTradeHistory.builder();

        mediaShopTradeHistory.createdAt( mediaShopTradeHistoryEntity.getCreatedAt() );
        mediaShopTradeHistory.updatedAt( mediaShopTradeHistoryEntity.getUpdatedAt() );
        mediaShopTradeHistory.msthIdx( mediaShopTradeHistoryEntity.getMsthIdx() );
        mediaShopTradeHistory.member( memberEntityToMember( mediaShopTradeHistoryEntity.getMember() ) );
        mediaShopTradeHistory.media( mediaEntityToMedia( mediaShopTradeHistoryEntity.getMedia() ) );
        mediaShopTradeHistory.msthTel( mediaShopTradeHistoryEntity.getMsthTel() );
        mediaShopTradeHistory.msthAddr( mediaShopTradeHistoryEntity.getMsthAddr() );
        mediaShopTradeHistory.msthAddrDetail( mediaShopTradeHistoryEntity.getMsthAddrDetail() );
        mediaShopTradeHistory.msthZipcode( mediaShopTradeHistoryEntity.getMsthZipcode() );
        mediaShopTradeHistory.msthReceiver( mediaShopTradeHistoryEntity.getMsthReceiver() );
        mediaShopTradeHistory.msthStatus( mediaShopTradeHistoryEntity.getMsthStatus() );
        mediaShopTradeHistory.mcAttribute( mediaShopTradeHistoryEntity.getMcAttribute() );
        mediaShopTradeHistory.msthCompany( mediaShopTradeHistoryEntity.getMsthCompany() );
        mediaShopTradeHistory.msthHp( mediaShopTradeHistoryEntity.getMsthHp() );
        mediaShopTradeHistory.msthCancelReason( mediaShopTradeHistoryEntity.getMsthCancelReason() );

        return mediaShopTradeHistory.build();
    }

    protected MediaVodTradeHistoryEntity mediaVodTradeHistoryToMediaVodTradeHistoryEntity(MediaVodTradeHistory mediaVodTradeHistory) {
        if ( mediaVodTradeHistory == null ) {
            return null;
        }

        MediaVodTradeHistoryEntity.MediaVodTradeHistoryEntityBuilder mediaVodTradeHistoryEntity = MediaVodTradeHistoryEntity.builder();

        mediaVodTradeHistoryEntity.mvthIdx( mediaVodTradeHistory.getMvthIdx() );
        mediaVodTradeHistoryEntity.member( memberToMemberEntity( mediaVodTradeHistory.getMember() ) );
        mediaVodTradeHistoryEntity.media( mediaToMediaEntity( mediaVodTradeHistory.getMedia() ) );
        mediaVodTradeHistoryEntity.mvthUuid( mediaVodTradeHistory.getMvthUuid() );
        mediaVodTradeHistoryEntity.mvthMcName( mediaVodTradeHistory.getMvthMcName() );
        mediaVodTradeHistoryEntity.mvthMcType( mediaVodTradeHistory.getMvthMcType() );
        mediaVodTradeHistoryEntity.mvthMgName( mediaVodTradeHistory.getMvthMgName() );
        mediaVodTradeHistoryEntity.mvthStatus( mediaVodTradeHistory.getMvthStatus() );
        mediaVodTradeHistoryEntity.mvthCancelReason( mediaVodTradeHistory.getMvthCancelReason() );

        return mediaVodTradeHistoryEntity.build();
    }

    protected MediaVodTradeHistory mediaVodTradeHistoryEntityToMediaVodTradeHistory(MediaVodTradeHistoryEntity mediaVodTradeHistoryEntity) {
        if ( mediaVodTradeHistoryEntity == null ) {
            return null;
        }

        MediaVodTradeHistory.MediaVodTradeHistoryBuilder<?, ?> mediaVodTradeHistory = MediaVodTradeHistory.builder();

        mediaVodTradeHistory.createdAt( mediaVodTradeHistoryEntity.getCreatedAt() );
        mediaVodTradeHistory.updatedAt( mediaVodTradeHistoryEntity.getUpdatedAt() );
        mediaVodTradeHistory.mvthIdx( mediaVodTradeHistoryEntity.getMvthIdx() );
        mediaVodTradeHistory.member( memberEntityToMember( mediaVodTradeHistoryEntity.getMember() ) );
        mediaVodTradeHistory.media( mediaEntityToMedia( mediaVodTradeHistoryEntity.getMedia() ) );
        mediaVodTradeHistory.mvthUuid( mediaVodTradeHistoryEntity.getMvthUuid() );
        mediaVodTradeHistory.mvthMcName( mediaVodTradeHistoryEntity.getMvthMcName() );
        mediaVodTradeHistory.mvthMcType( mediaVodTradeHistoryEntity.getMvthMcType() );
        mediaVodTradeHistory.mvthMgName( mediaVodTradeHistoryEntity.getMvthMgName() );
        mediaVodTradeHistory.mvthStatus( mediaVodTradeHistoryEntity.getMvthStatus() );
        mediaVodTradeHistory.mvthCancelReason( mediaVodTradeHistoryEntity.getMvthCancelReason() );

        return mediaVodTradeHistory.build();
    }
}
