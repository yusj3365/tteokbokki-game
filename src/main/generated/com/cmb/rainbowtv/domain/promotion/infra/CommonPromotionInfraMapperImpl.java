package com.cmb.rainbowtv.domain.promotion.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.prize.infra.data.entity.PrizeEntity;
import com.cmb.rainbowtv.domain.prize.model.Prize;
import com.cmb.rainbowtv.domain.promotion.infra.data.entity.CommonPromotionEntity;
import com.cmb.rainbowtv.domain.promotion.infra.data.entity.PromotionPointEntity;
import com.cmb.rainbowtv.domain.promotion.infra.data.entity.PromotionPrizeEntity;
import com.cmb.rainbowtv.domain.promotion.model.CommonPromotion;
import com.cmb.rainbowtv.domain.promotion.model.PromotionPoint;
import com.cmb.rainbowtv.domain.promotion.model.PromotionPrize;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CommonPromotionInfraMapperImpl implements CommonPromotionInfraMapper {

    @Override
    public CommonPromotionEntity toEntity(CommonPromotion commonPromotion) {
        if ( commonPromotion == null ) {
            return null;
        }

        CommonPromotionEntity.CommonPromotionEntityBuilder commonPromotionEntity = CommonPromotionEntity.builder();

        commonPromotionEntity.member( memberToMemberEntity( commonPromotion.getMember() ) );
        commonPromotionEntity.cpIdx( commonPromotion.getCpIdx() );
        commonPromotionEntity.cpType( commonPromotion.getCpType() );
        commonPromotionEntity.cpName( commonPromotion.getCpName() );
        commonPromotionEntity.cpCode( commonPromotion.getCpCode() );
        commonPromotionEntity.cpIssuedCount( commonPromotion.getCpIssuedCount() );
        commonPromotionEntity.cpStartDate( commonPromotion.getCpStartDate() );
        commonPromotionEntity.cpEndDate( commonPromotion.getCpEndDate() );
        commonPromotionEntity.cpIsUse( commonPromotion.getCpIsUse() );

        return commonPromotionEntity.build();
    }

    @Override
    public CommonPromotion fromEntity(CommonPromotionEntity save) {
        if ( save == null ) {
            return null;
        }

        CommonPromotion.CommonPromotionBuilder<?, ?> commonPromotion = CommonPromotion.builder();

        commonPromotion.member( memberEntityToMember( save.getMember() ) );
        commonPromotion.createdAt( save.getCreatedAt() );
        commonPromotion.updatedAt( save.getUpdatedAt() );
        commonPromotion.cpIdx( save.getCpIdx() );
        commonPromotion.cpType( save.getCpType() );
        commonPromotion.cpName( save.getCpName() );
        commonPromotion.cpCode( save.getCpCode() );
        commonPromotion.cpIssuedCount( save.getCpIssuedCount() );
        commonPromotion.cpStartDate( save.getCpStartDate() );
        commonPromotion.cpEndDate( save.getCpEndDate() );
        commonPromotion.cpIsUse( save.getCpIsUse() );

        return commonPromotion.build();
    }

    @Override
    public PromotionPrizeEntity toPromotionPrizeEntity(CommonPromotionEntity commonPromotion, Prize prize) {
        if ( commonPromotion == null && prize == null ) {
            return null;
        }

        PromotionPrizeEntity.PromotionPrizeEntityBuilder promotionPrizeEntity = PromotionPrizeEntity.builder();

        promotionPrizeEntity.commonPromotion( commonPromotion );
        promotionPrizeEntity.prize( prizeToPrizeEntity( prize ) );

        return promotionPrizeEntity.build();
    }

    @Override
    public PromotionPointEntity toPromotionPointEntity(CommonPromotionEntity commonPromotion, Long ppPoint) {
        if ( commonPromotion == null && ppPoint == null ) {
            return null;
        }

        PromotionPointEntity.PromotionPointEntityBuilder promotionPointEntity = PromotionPointEntity.builder();

        promotionPointEntity.commonPromotion( commonPromotion );
        promotionPointEntity.ppPoint( ppPoint );

        return promotionPointEntity.build();
    }

    @Override
    public PromotionPointEntity fromPromotionPoint(PromotionPoint promotionPoint) {
        if ( promotionPoint == null ) {
            return null;
        }

        PromotionPointEntity.PromotionPointEntityBuilder promotionPointEntity = PromotionPointEntity.builder();

        promotionPointEntity.commonPromotion( toEntity( promotionPoint.getCommonPromotion() ) );
        promotionPointEntity.cpIdx( promotionPoint.getCpIdx() );
        promotionPointEntity.ppPoint( promotionPoint.getPpPoint() );

        return promotionPointEntity.build();
    }

    @Override
    public PromotionPrizeEntity fromPromotionPrize(PromotionPrize promotionPrize) {
        if ( promotionPrize == null ) {
            return null;
        }

        PromotionPrizeEntity.PromotionPrizeEntityBuilder promotionPrizeEntity = PromotionPrizeEntity.builder();

        promotionPrizeEntity.commonPromotion( toEntity( promotionPrize.getCommonPromotion() ) );
        promotionPrizeEntity.prize( prizeToPrizeEntity( promotionPrize.getPrize() ) );
        promotionPrizeEntity.cpIdx( promotionPrize.getCpIdx() );

        return promotionPrizeEntity.build();
    }

    @Override
    public CommonPromotion toCommonPromotion(CommonPromotionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CommonPromotion.CommonPromotionBuilder<?, ?> commonPromotion = CommonPromotion.builder();

        commonPromotion.member( memberEntityToMember( entity.getMember() ) );
        commonPromotion.createdAt( entity.getCreatedAt() );
        commonPromotion.updatedAt( entity.getUpdatedAt() );
        commonPromotion.cpIdx( entity.getCpIdx() );
        commonPromotion.cpType( entity.getCpType() );
        commonPromotion.cpName( entity.getCpName() );
        commonPromotion.cpCode( entity.getCpCode() );
        commonPromotion.cpIssuedCount( entity.getCpIssuedCount() );
        commonPromotion.cpStartDate( entity.getCpStartDate() );
        commonPromotion.cpEndDate( entity.getCpEndDate() );
        commonPromotion.cpIsUse( entity.getCpIsUse() );

        return commonPromotion.build();
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
        member.mbEnd( memberEntity.getMbEnd() );

        return member.build();
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
}
