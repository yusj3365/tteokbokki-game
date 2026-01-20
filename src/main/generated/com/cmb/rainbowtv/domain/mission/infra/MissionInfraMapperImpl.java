package com.cmb.rainbowtv.domain.mission.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.mission.infra.data.entity.DailyMissionEntity;
import com.cmb.rainbowtv.domain.mission.infra.data.entity.PartnerMissionEntity;
import com.cmb.rainbowtv.domain.mission.model.DailyMission;
import com.cmb.rainbowtv.domain.mission.model.PartnerMission;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointDefineCodeEntity;
import com.cmb.rainbowtv.domain.point.infra.data.entity.PointDefineEntity;
import com.cmb.rainbowtv.domain.point.model.PointDefine;
import com.cmb.rainbowtv.domain.point.model.PointDefineCode;
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
public class MissionInfraMapperImpl implements MissionInfraMapper {

    @Override
    public PartnerMissionEntity toPartnerMissionEntity(PartnerMission partnerMission) {
        if ( partnerMission == null ) {
            return null;
        }

        PartnerMissionEntity.PartnerMissionEntityBuilder partnerMissionEntity = PartnerMissionEntity.builder();

        partnerMissionEntity.pmIdx( partnerMission.getPmIdx() );
        partnerMissionEntity.member( memberToMemberEntity( partnerMission.getMember() ) );
        partnerMissionEntity.pointDefine( pointDefineToPointDefineEntity( partnerMission.getPointDefine() ) );

        return partnerMissionEntity.build();
    }

    @Override
    public List<PartnerMissionEntity> toPartnerMissionEntityList(List<PartnerMission> partnerMissionList) {
        if ( partnerMissionList == null ) {
            return null;
        }

        List<PartnerMissionEntity> list = new ArrayList<PartnerMissionEntity>( partnerMissionList.size() );
        for ( PartnerMission partnerMission : partnerMissionList ) {
            list.add( toPartnerMissionEntity( partnerMission ) );
        }

        return list;
    }

    @Override
    public PartnerMission toPartnerMission(PartnerMissionEntity partnerMissionEntity) {
        if ( partnerMissionEntity == null ) {
            return null;
        }

        PartnerMission.PartnerMissionBuilder<?, ?> partnerMission = PartnerMission.builder();

        partnerMission.createdAt( partnerMissionEntity.getCreatedAt() );
        partnerMission.updatedAt( partnerMissionEntity.getUpdatedAt() );
        partnerMission.pmIdx( partnerMissionEntity.getPmIdx() );
        partnerMission.member( memberEntityToMember( partnerMissionEntity.getMember() ) );
        partnerMission.pointDefine( pointDefineEntityToPointDefine( partnerMissionEntity.getPointDefine() ) );

        return partnerMission.build();
    }

    @Override
    public List<PartnerMission> toPartnerMissionList(List<PartnerMissionEntity> partnerMissionEntityList) {
        if ( partnerMissionEntityList == null ) {
            return null;
        }

        List<PartnerMission> list = new ArrayList<PartnerMission>( partnerMissionEntityList.size() );
        for ( PartnerMissionEntity partnerMissionEntity : partnerMissionEntityList ) {
            list.add( toPartnerMission( partnerMissionEntity ) );
        }

        return list;
    }

    @Override
    public DailyMissionEntity toDailyMissionEntity(DailyMission dailyMission) {
        if ( dailyMission == null ) {
            return null;
        }

        DailyMissionEntity.DailyMissionEntityBuilder<?, ?> dailyMissionEntity = DailyMissionEntity.builder();

        dailyMissionEntity.member( memberToMemberEntity( dailyMission.getMember() ) );
        dailyMissionEntity.pdCode( dailyMission.getPdCode() );
        dailyMissionEntity.dmCount( dailyMission.getDmCount() );
        dailyMissionEntity.pointDefine( pointDefineToPointDefineEntity( dailyMission.getPointDefine() ) );

        return dailyMissionEntity.build();
    }

    @Override
    public DailyMission toDailyMission(DailyMissionEntity dailyMissionEntity) {
        if ( dailyMissionEntity == null ) {
            return null;
        }

        DailyMission.DailyMissionBuilder<?, ?> dailyMission = DailyMission.builder();

        dailyMission.createdAt( dailyMissionEntity.getCreatedAt() );
        dailyMission.updatedAt( dailyMissionEntity.getUpdatedAt() );
        dailyMission.dmIdx( dailyMissionEntity.getDmIdx() );
        dailyMission.member( memberEntityToMember( dailyMissionEntity.getMember() ) );
        dailyMission.pdCode( dailyMissionEntity.getPdCode() );
        dailyMission.dmCount( dailyMissionEntity.getDmCount() );
        dailyMission.pointDefine( pointDefineEntityToPointDefine( dailyMissionEntity.getPointDefine() ) );

        return dailyMission.build();
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

    protected PointDefineEntity pointDefineToPointDefineEntity(PointDefine pointDefine) {
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

    protected PointDefineCode pointDefineCodeEntityToPointDefineCode(PointDefineCodeEntity pointDefineCodeEntity) {
        if ( pointDefineCodeEntity == null ) {
            return null;
        }

        PointDefineCode.PointDefineCodeBuilder<?, ?> pointDefineCode = PointDefineCode.builder();

        pointDefineCode.createdAt( pointDefineCodeEntity.getCreatedAt() );
        pointDefineCode.updatedAt( pointDefineCodeEntity.getUpdatedAt() );
        pointDefineCode.pdcIdx( pointDefineCodeEntity.getPdcIdx() );
        pointDefineCode.pdcCategory( pointDefineCodeEntity.getPdcCategory() );
        pointDefineCode.pdcCategoryKo( pointDefineCodeEntity.getPdcCategoryKo() );
        pointDefineCode.pdcJoin( pointDefineCodeEntity.getPdcJoin() );
        pointDefineCode.pdCode( pointDefineCodeEntity.getPdCode() );
        pointDefineCode.pdcApplicableProduct( pointDefineCodeEntity.getPdcApplicableProduct() );
        pointDefineCode.pdcName( pointDefineCodeEntity.getPdcName() );
        pointDefineCode.pdcReason( pointDefineCodeEntity.getPdcReason() );
        pointDefineCode.pdcIsDuplication( pointDefineCodeEntity.getPdcIsDuplication() );
        pointDefineCode.pdcIsFirst( pointDefineCodeEntity.getPdcIsFirst() );
        pointDefineCode.pdcMaxCnt( pointDefineCodeEntity.getPdcMaxCnt() );
        pointDefineCode.pdcMaxCntType( pointDefineCodeEntity.getPdcMaxCntType() );
        pointDefineCode.pdcStandardType( pointDefineCodeEntity.getPdcStandardType() );
        pointDefineCode.pdcApplicableProductEn( pointDefineCodeEntity.getPdcApplicableProductEn() );
        pointDefineCode.pdcNameEn( pointDefineCodeEntity.getPdcNameEn() );
        pointDefineCode.pdcUserReason( pointDefineCodeEntity.getPdcUserReason() );

        return pointDefineCode.build();
    }

    protected PointDefine pointDefineEntityToPointDefine(PointDefineEntity pointDefineEntity) {
        if ( pointDefineEntity == null ) {
            return null;
        }

        PointDefine.PointDefineBuilder<?, ?> pointDefine = PointDefine.builder();

        pointDefine.createdAt( pointDefineEntity.getCreatedAt() );
        pointDefine.updatedAt( pointDefineEntity.getUpdatedAt() );
        pointDefine.pdIdx( pointDefineEntity.getPdIdx() );
        pointDefine.pdCategory( pointDefineEntity.getPdCategory() );
        pointDefine.pointCodeDefine( pointDefineCodeEntityToPointDefineCode( pointDefineEntity.getPointCodeDefine() ) );
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
}
