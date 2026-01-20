package com.cmb.rainbowtv.domain.prize.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.prize.infra.data.entity.PrizeCategoryEntity;
import com.cmb.rainbowtv.domain.prize.infra.data.entity.PrizeDetailDescriptionEntity;
import com.cmb.rainbowtv.domain.prize.infra.data.entity.PrizeEntity;
import com.cmb.rainbowtv.domain.prize.infra.data.entity.PrizeTradeHistoryEntity;
import com.cmb.rainbowtv.domain.prize.model.Prize;
import com.cmb.rainbowtv.domain.prize.model.PrizeCategory;
import com.cmb.rainbowtv.domain.prize.model.PrizeDetailDescription;
import com.cmb.rainbowtv.domain.prize.model.PrizeTradeHistory;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class PrizeAdminInfraMapperImpl implements PrizeAdminInfraMapper {

    @Override
    public Prize toPrize(PrizeEntity prizeEntity) {
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

    @Override
    public PrizeTradeHistory toPrizeTradeHistory(PrizeTradeHistoryEntity prizeTradeHistoryEntity) {
        if ( prizeTradeHistoryEntity == null ) {
            return null;
        }

        PrizeTradeHistory.PrizeTradeHistoryBuilder<?, ?> prizeTradeHistory = PrizeTradeHistory.builder();

        prizeTradeHistory.createdAt( prizeTradeHistoryEntity.getCreatedAt() );
        prizeTradeHistory.updatedAt( prizeTradeHistoryEntity.getUpdatedAt() );
        prizeTradeHistory.pthIdx( prizeTradeHistoryEntity.getPthIdx() );
        prizeTradeHistory.member( memberEntityToMember( prizeTradeHistoryEntity.getMember() ) );
        prizeTradeHistory.prize( toPrize( prizeTradeHistoryEntity.getPrize() ) );
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

    @Override
    public PrizeTradeHistoryEntity toPrizeTradeHistoryEntity(PrizeTradeHistory prizeTradeHistory) {
        if ( prizeTradeHistory == null ) {
            return null;
        }

        PrizeTradeHistoryEntity.PrizeTradeHistoryEntityBuilder prizeTradeHistoryEntity = PrizeTradeHistoryEntity.builder();

        prizeTradeHistoryEntity.pthIdx( prizeTradeHistory.getPthIdx() );
        prizeTradeHistoryEntity.member( memberToMemberEntity( prizeTradeHistory.getMember() ) );
        prizeTradeHistoryEntity.prize( toPrizeEntity( prizeTradeHistory.getPrize() ) );
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

    @Override
    public PrizeEntity toPrizeEntity(Prize prize) {
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

    @Override
    public List<PrizeCategory> toPrizeCategoryList(List<PrizeCategoryEntity> prizeCategoryEntities) {
        if ( prizeCategoryEntities == null ) {
            return null;
        }

        List<PrizeCategory> list = new ArrayList<PrizeCategory>( prizeCategoryEntities.size() );
        for ( PrizeCategoryEntity prizeCategoryEntity : prizeCategoryEntities ) {
            list.add( toPrizeCategory( prizeCategoryEntity ) );
        }

        return list;
    }

    @Override
    public List<Prize> toPrizeList(List<PrizeEntity> prizeEntities) {
        if ( prizeEntities == null ) {
            return null;
        }

        List<Prize> list = new ArrayList<Prize>( prizeEntities.size() );
        for ( PrizeEntity prizeEntity : prizeEntities ) {
            list.add( toPrize( prizeEntity ) );
        }

        return list;
    }

    @Override
    public PrizeDetailDescriptionEntity toPrizeDetailDescriptionEntity(PrizeDetailDescription prizeDetailDescription) {
        if ( prizeDetailDescription == null ) {
            return null;
        }

        PrizeDetailDescriptionEntity.PrizeDetailDescriptionEntityBuilder prizeDetailDescriptionEntity = PrizeDetailDescriptionEntity.builder();

        prizeDetailDescriptionEntity.pddIdx( prizeDetailDescription.getPddIdx() );
        prizeDetailDescriptionEntity.prize( toPrizeEntity( prizeDetailDescription.getPrize() ) );
        prizeDetailDescriptionEntity.pddType( prizeDetailDescription.getPddType() );
        prizeDetailDescriptionEntity.pddContent( prizeDetailDescription.getPddContent() );
        prizeDetailDescriptionEntity.pddSeq( prizeDetailDescription.getPddSeq() );

        return prizeDetailDescriptionEntity.build();
    }

    @Override
    public PrizeDetailDescription toPrizeDetailDescription(PrizeDetailDescriptionEntity prizeDetailDescriptionEntity) {
        if ( prizeDetailDescriptionEntity == null ) {
            return null;
        }

        PrizeDetailDescription.PrizeDetailDescriptionBuilder<?, ?> prizeDetailDescription = PrizeDetailDescription.builder();

        prizeDetailDescription.createdAt( prizeDetailDescriptionEntity.getCreatedAt() );
        prizeDetailDescription.updatedAt( prizeDetailDescriptionEntity.getUpdatedAt() );
        prizeDetailDescription.pddIdx( prizeDetailDescriptionEntity.getPddIdx() );
        prizeDetailDescription.prize( toPrize( prizeDetailDescriptionEntity.getPrize() ) );
        prizeDetailDescription.pddType( prizeDetailDescriptionEntity.getPddType() );
        prizeDetailDescription.pddContent( prizeDetailDescriptionEntity.getPddContent() );
        prizeDetailDescription.pddSeq( prizeDetailDescriptionEntity.getPddSeq() );

        return prizeDetailDescription.build();
    }

    @Override
    public PrizeCategory toPrizeCategory(PrizeCategoryEntity prizeCategoryEntity) {
        if ( prizeCategoryEntity == null ) {
            return null;
        }

        PrizeCategory.PrizeCategoryBuilder prizeCategory = PrizeCategory.builder();

        prizeCategory.pcIdx( prizeCategoryEntity.getPcIdx() );
        prizeCategory.prCategory( prizeCategoryEntity.getPrCategory() );
        prizeCategory.pcTitle( prizeCategoryEntity.getPcTitle() );
        prizeCategory.pcSeq( prizeCategoryEntity.getPcSeq() );
        prizeCategory.member( memberEntityToMember( prizeCategoryEntity.getMember() ) );

        return prizeCategory.build();
    }

    @Override
    public PrizeCategoryEntity toPrizeCategoryEntity(PrizeCategory prizeCategory) {
        if ( prizeCategory == null ) {
            return null;
        }

        PrizeCategoryEntity.PrizeCategoryEntityBuilder prizeCategoryEntity = PrizeCategoryEntity.builder();

        prizeCategoryEntity.pcIdx( prizeCategory.getPcIdx() );
        prizeCategoryEntity.prCategory( prizeCategory.getPrCategory() );
        prizeCategoryEntity.pcTitle( prizeCategory.getPcTitle() );
        prizeCategoryEntity.pcSeq( prizeCategory.getPcSeq() );
        prizeCategoryEntity.member( memberToMemberEntity( prizeCategory.getMember() ) );

        return prizeCategoryEntity.build();
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
}
