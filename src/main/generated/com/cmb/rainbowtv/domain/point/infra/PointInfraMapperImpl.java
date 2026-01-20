package com.cmb.rainbowtv.domain.point.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointByRouletteEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointDefineCodeEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointDefineEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointInfoEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointRateEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.RoulettePercentageEntity;
import com.cmb.rainbowtv.domain.point.model.Point;
import com.cmb.rainbowtv.domain.point.model.PointByRoulette;
import com.cmb.rainbowtv.domain.point.model.PointDefine;
import com.cmb.rainbowtv.domain.point.model.PointDefineCode;
import com.cmb.rainbowtv.domain.point.model.PointInfo;
import com.cmb.rainbowtv.domain.point.model.PointRate;
import com.cmb.rainbowtv.domain.point.model.RoulettePercentage;
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
public class PointInfraMapperImpl implements PointInfraMapper {

    @Override
    public PointDefine toPointDefine(PointDefineEntity pointDefineEntity) {
        if ( pointDefineEntity == null ) {
            return null;
        }

        PointDefine.PointDefineBuilder<?, ?> pointDefine = PointDefine.builder();

        pointDefine.createdAt( pointDefineEntity.getCreatedAt() );
        pointDefine.updatedAt( pointDefineEntity.getUpdatedAt() );
        pointDefine.pdIdx( pointDefineEntity.getPdIdx() );
        pointDefine.pdCategory( pointDefineEntity.getPdCategory() );
        pointDefine.pointCodeDefine( toPointCodeDefine( pointDefineEntity.getPointCodeDefine() ) );
        pointDefine.pdReason( pointDefineEntity.getPdReason() );
        pointDefine.pdPoint( pointDefineEntity.getPdPoint() );
        pointDefine.pd1stStandard( pointDefineEntity.getPd1stStandard() );
        pointDefine.pd2ndStandard( pointDefineEntity.getPd2ndStandard() );
        pointDefine.pdIsUse( pointDefineEntity.getPdIsUse() );
        pointDefine.pdJoin( pointDefineEntity.getPdJoin() );
        pointDefine.pdStatus( pointDefineEntity.getPdStatus() );
        pointDefine.pdRegister( pointDefineEntity.getPdRegister() );
        pointDefine.pdPolicyStart( pointDefineEntity.getPdPolicyStart() );
        pointDefine.pdPolicyEnd( pointDefineEntity.getPdPolicyEnd() );

        return pointDefine.build();
    }

    @Override
    public List<PointDefine> toPointDefineList(List<PointDefineEntity> pointDefineEntityList) {
        if ( pointDefineEntityList == null ) {
            return null;
        }

        List<PointDefine> list = new ArrayList<PointDefine>( pointDefineEntityList.size() );
        for ( PointDefineEntity pointDefineEntity : pointDefineEntityList ) {
            list.add( toPointDefine( pointDefineEntity ) );
        }

        return list;
    }

    @Override
    public PointDefineCode toPointCodeDefine(PointDefineCodeEntity pointCodeDefineEntity) {
        if ( pointCodeDefineEntity == null ) {
            return null;
        }

        PointDefineCode.PointDefineCodeBuilder<?, ?> pointDefineCode = PointDefineCode.builder();

        pointDefineCode.createdAt( pointCodeDefineEntity.getCreatedAt() );
        pointDefineCode.updatedAt( pointCodeDefineEntity.getUpdatedAt() );
        pointDefineCode.pdcIdx( pointCodeDefineEntity.getPdcIdx() );
        pointDefineCode.pdcCategory( pointCodeDefineEntity.getPdcCategory() );
        pointDefineCode.pdcCategoryKo( pointCodeDefineEntity.getPdcCategoryKo() );
        pointDefineCode.pdcJoin( pointCodeDefineEntity.getPdcJoin() );
        pointDefineCode.pdCode( pointCodeDefineEntity.getPdCode() );
        pointDefineCode.pdcApplicableProduct( pointCodeDefineEntity.getPdcApplicableProduct() );
        pointDefineCode.pdcName( pointCodeDefineEntity.getPdcName() );
        pointDefineCode.pdcReason( pointCodeDefineEntity.getPdcReason() );
        pointDefineCode.pdcIsDuplication( pointCodeDefineEntity.getPdcIsDuplication() );
        pointDefineCode.pdcIsFirst( pointCodeDefineEntity.getPdcIsFirst() );
        pointDefineCode.pdcMaxCnt( pointCodeDefineEntity.getPdcMaxCnt() );
        pointDefineCode.pdcMaxCntType( pointCodeDefineEntity.getPdcMaxCntType() );
        pointDefineCode.pdcStandardType( pointCodeDefineEntity.getPdcStandardType() );
        pointDefineCode.pdcApplicableProductEn( pointCodeDefineEntity.getPdcApplicableProductEn() );
        pointDefineCode.pdcNameEn( pointCodeDefineEntity.getPdcNameEn() );
        pointDefineCode.pdcUserReason( pointCodeDefineEntity.getPdcUserReason() );

        return pointDefineCode.build();
    }

    @Override
    public Point toPointModel(PointEntity save) {
        if ( save == null ) {
            return null;
        }

        Point.PointBuilder<?, ?> point = Point.builder();

        point.createdAt( save.getCreatedAt() );
        point.updatedAt( save.getUpdatedAt() );
        point.prIdx( save.getPrIdx() );
        point.pointDefine( toPointDefine( save.getPointDefine() ) );
        point.pointCodeDefine( toPointCodeDefine( save.getPointCodeDefine() ) );
        point.prUuid( save.getPrUuid() );
        point.member( memberEntityToMember( save.getMember() ) );
        point.prReason( save.getPrReason() );
        point.prPoint( save.getPrPoint() );
        point.prPointHistory( save.getPrPointHistory() );
        point.prKey( save.getPrKey() );
        point.prExpireDate( save.getPrExpireDate() );

        return point.build();
    }

    @Override
    public PointEntity toPointEntity(Point point) {
        if ( point == null ) {
            return null;
        }

        PointEntity.PointEntityBuilder pointEntity = PointEntity.builder();

        pointEntity.prIdx( point.getPrIdx() );
        pointEntity.pointDefine( toPointDefineEntity( point.getPointDefine() ) );
        pointEntity.pointCodeDefine( pointDefineCodeToPointDefineCodeEntity( point.getPointCodeDefine() ) );
        pointEntity.prUuid( point.getPrUuid() );
        pointEntity.member( memberToMemberEntity( point.getMember() ) );
        pointEntity.prReason( point.getPrReason() );
        pointEntity.prPoint( point.getPrPoint() );
        pointEntity.prPointHistory( point.getPrPointHistory() );
        pointEntity.prKey( point.getPrKey() );
        pointEntity.prExpireDate( point.getPrExpireDate() );

        return pointEntity.build();
    }

    @Override
    public PointInfoEntity toPointInfoEntity(PointInfo pointInfo) {
        if ( pointInfo == null ) {
            return null;
        }

        PointInfoEntity.PointInfoEntityBuilder pointInfoEntity = PointInfoEntity.builder();

        pointInfoEntity.piIdx( pointInfo.getPiIdx() );
        pointInfoEntity.point( toPointEntity( pointInfo.getPoint() ) );
        pointInfoEntity.piParent( pointInfo.getPiParent() );
        pointInfoEntity.piPoint( pointInfo.getPiPoint() );
        pointInfoEntity.piExpireDate( pointInfo.getPiExpireDate() );

        return pointInfoEntity.build();
    }

    @Override
    public PointInfo toPointInfoModel(PointInfoEntity save) {
        if ( save == null ) {
            return null;
        }

        PointInfo.PointInfoBuilder<?, ?> pointInfo = PointInfo.builder();

        pointInfo.createdAt( save.getCreatedAt() );
        pointInfo.updatedAt( save.getUpdatedAt() );
        pointInfo.piIdx( save.getPiIdx() );
        pointInfo.point( toPointModel( save.getPoint() ) );
        pointInfo.piParent( save.getPiParent() );
        pointInfo.piPoint( save.getPiPoint() );
        pointInfo.piExpireDate( save.getPiExpireDate() );

        return pointInfo.build();
    }

    @Override
    public List<PointInfoEntity> toPointInfoEntityList(List<PointInfo> pointInfoList) {
        if ( pointInfoList == null ) {
            return null;
        }

        List<PointInfoEntity> list = new ArrayList<PointInfoEntity>( pointInfoList.size() );
        for ( PointInfo pointInfo : pointInfoList ) {
            list.add( toPointInfoEntity( pointInfo ) );
        }

        return list;
    }

    @Override
    public PointRate toPointRate(PointRateEntity duplicatePointRate) {
        if ( duplicatePointRate == null ) {
            return null;
        }

        PointRate.PointRateBuilder<?, ?> pointRate = PointRate.builder();

        pointRate.createdAt( duplicatePointRate.getCreatedAt() );
        pointRate.updatedAt( duplicatePointRate.getUpdatedAt() );
        pointRate.prIdx( duplicatePointRate.getPrIdx() );
        pointRate.prInfo( duplicatePointRate.getPrInfo() );
        pointRate.prTradeRate( duplicatePointRate.getPrTradeRate() );
        pointRate.prAdminNo( duplicatePointRate.getPrAdminNo() );
        pointRate.prStartDate( duplicatePointRate.getPrStartDate() );
        pointRate.prEndDate( duplicatePointRate.getPrEndDate() );

        return pointRate.build();
    }

    @Override
    public PointRateEntity toPointrateEntity(PointRate pointRate) {
        if ( pointRate == null ) {
            return null;
        }

        PointRateEntity.PointRateEntityBuilder pointRateEntity = PointRateEntity.builder();

        pointRateEntity.prIdx( pointRate.getPrIdx() );
        pointRateEntity.prInfo( pointRate.getPrInfo() );
        pointRateEntity.prTradeRate( pointRate.getPrTradeRate() );
        pointRateEntity.prAdminNo( pointRate.getPrAdminNo() );
        pointRateEntity.prStartDate( pointRate.getPrStartDate() );
        pointRateEntity.prEndDate( pointRate.getPrEndDate() );

        return pointRateEntity.build();
    }

    @Override
    public PointDefineEntity toPointDefineEntity(PointDefine pointDefine) {
        if ( pointDefine == null ) {
            return null;
        }

        PointDefineEntity.PointDefineEntityBuilder pointDefineEntity = PointDefineEntity.builder();

        pointDefineEntity.pdIdx( pointDefine.getPdIdx() );
        pointDefineEntity.pdCategory( pointDefine.getPdCategory() );
        pointDefineEntity.pointCodeDefine( pointDefineCodeToPointDefineCodeEntity( pointDefine.getPointCodeDefine() ) );
        pointDefineEntity.pdReason( pointDefine.getPdReason() );
        pointDefineEntity.pdPoint( pointDefine.getPdPoint() );
        pointDefineEntity.pd1stStandard( pointDefine.getPd1stStandard() );
        pointDefineEntity.pd2ndStandard( pointDefine.getPd2ndStandard() );
        pointDefineEntity.pdIsUse( pointDefine.getPdIsUse() );
        pointDefineEntity.pdJoin( pointDefine.getPdJoin() );
        pointDefineEntity.pdStatus( pointDefine.getPdStatus() );
        pointDefineEntity.pdRegister( pointDefine.getPdRegister() );
        pointDefineEntity.pdPolicyStart( pointDefine.getPdPolicyStart() );
        pointDefineEntity.pdPolicyEnd( pointDefine.getPdPolicyEnd() );

        return pointDefineEntity.build();
    }

    @Override
    public RoulettePercentage toRoulettePercentage(RoulettePercentageEntity entity) {
        if ( entity == null ) {
            return null;
        }

        RoulettePercentage.RoulettePercentageBuilder<?, ?> roulettePercentage = RoulettePercentage.builder();

        roulettePercentage.createdAt( entity.getCreatedAt() );
        roulettePercentage.updatedAt( entity.getUpdatedAt() );
        roulettePercentage.rpIdx( entity.getRpIdx() );
        roulettePercentage.rpPoint( entity.getRpPoint() );
        roulettePercentage.rpPercentage( entity.getRpPercentage() );

        return roulettePercentage.build();
    }

    @Override
    public RoulettePercentageEntity toRoulettePercentageEntity(RoulettePercentage roulettePercentage) {
        if ( roulettePercentage == null ) {
            return null;
        }

        RoulettePercentageEntity.RoulettePercentageEntityBuilder roulettePercentageEntity = RoulettePercentageEntity.builder();

        roulettePercentageEntity.rpIdx( roulettePercentage.getRpIdx() );
        roulettePercentageEntity.rpPoint( roulettePercentage.getRpPoint() );
        roulettePercentageEntity.rpPercentage( roulettePercentage.getRpPercentage() );

        return roulettePercentageEntity.build();
    }

    @Override
    public List<RoulettePercentage> toRoulettePercentageList(List<RoulettePercentageEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<RoulettePercentage> list = new ArrayList<RoulettePercentage>( allById.size() );
        for ( RoulettePercentageEntity roulettePercentageEntity : allById ) {
            list.add( toRoulettePercentage( roulettePercentageEntity ) );
        }

        return list;
    }

    @Override
    public Iterable<RoulettePercentageEntity> toRoulettePercentageEntityList(List<RoulettePercentage> rouletteByIdList) {
        if ( rouletteByIdList == null ) {
            return null;
        }

        ArrayList<RoulettePercentageEntity> iterable = new ArrayList<RoulettePercentageEntity>( rouletteByIdList.size() );
        for ( RoulettePercentage roulettePercentage : rouletteByIdList ) {
            iterable.add( toRoulettePercentageEntity( roulettePercentage ) );
        }

        return iterable;
    }

    @Override
    public PointByRouletteEntity toPointByRouletteEntity(PointByRoulette pointByRoulette) {
        if ( pointByRoulette == null ) {
            return null;
        }

        PointByRouletteEntity.PointByRouletteEntityBuilder pointByRouletteEntity = PointByRouletteEntity.builder();

        pointByRouletteEntity.pbrIdx( pointByRoulette.getPbrIdx() );
        pointByRouletteEntity.point( toPointEntity( pointByRoulette.getPoint() ) );
        pointByRouletteEntity.roulettePercentage( toRoulettePercentageEntity( pointByRoulette.getRoulettePercentage() ) );
        pointByRouletteEntity.rpPercentage( pointByRoulette.getRpPercentage() );

        return pointByRouletteEntity.build();
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

    protected PointDefineCodeEntity pointDefineCodeToPointDefineCodeEntity(PointDefineCode pointDefineCode) {
        if ( pointDefineCode == null ) {
            return null;
        }

        PointDefineCodeEntity.PointDefineCodeEntityBuilder pointDefineCodeEntity = PointDefineCodeEntity.builder();

        pointDefineCodeEntity.pdcIdx( pointDefineCode.getPdcIdx() );
        pointDefineCodeEntity.pdcCategory( pointDefineCode.getPdcCategory() );
        pointDefineCodeEntity.pdcCategoryKo( pointDefineCode.getPdcCategoryKo() );
        pointDefineCodeEntity.pdcJoin( pointDefineCode.getPdcJoin() );
        pointDefineCodeEntity.pdCode( pointDefineCode.getPdCode() );
        pointDefineCodeEntity.pdcApplicableProduct( pointDefineCode.getPdcApplicableProduct() );
        pointDefineCodeEntity.pdcName( pointDefineCode.getPdcName() );
        pointDefineCodeEntity.pdcReason( pointDefineCode.getPdcReason() );
        pointDefineCodeEntity.pdcIsDuplication( pointDefineCode.getPdcIsDuplication() );
        pointDefineCodeEntity.pdcIsFirst( pointDefineCode.getPdcIsFirst() );
        pointDefineCodeEntity.pdcMaxCnt( pointDefineCode.getPdcMaxCnt() );
        pointDefineCodeEntity.pdcMaxCntType( pointDefineCode.getPdcMaxCntType() );
        pointDefineCodeEntity.pdcStandardType( pointDefineCode.getPdcStandardType() );
        pointDefineCodeEntity.pdcApplicableProductEn( pointDefineCode.getPdcApplicableProductEn() );
        pointDefineCodeEntity.pdcNameEn( pointDefineCode.getPdcNameEn() );
        pointDefineCodeEntity.pdcUserReason( pointDefineCode.getPdcUserReason() );

        return pointDefineCodeEntity.build();
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
