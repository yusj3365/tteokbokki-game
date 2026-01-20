package com.cmb.rainbowtv.domain.download.infra;

import com.cmb.rainbowtv.domain.download.infra.data.entity.DownloadHistoryEntity;
import com.cmb.rainbowtv.domain.download.infra.data.entity.DownloadRequestEntity;
import com.cmb.rainbowtv.domain.download.model.DownloadHistory;
import com.cmb.rainbowtv.domain.download.model.DownloadRequest;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import com.cmb.rainbowtv.global.define.so.infra.data.entity.SoDefineEntity;
import com.cmb.rainbowtv.global.define.so.model.SoDefine;
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
public class DownloadInfraMapperImpl implements DownloadInfraMapper {

    @Override
    public DownloadHistoryEntity toDownloadHistoryEntity(DownloadHistory downloadHistory) {
        if ( downloadHistory == null ) {
            return null;
        }

        DownloadHistoryEntity.DownloadHistoryEntityBuilder downloadHistoryEntity = DownloadHistoryEntity.builder();

        downloadHistoryEntity.dhIdx( downloadHistory.getDhIdx() );
        downloadHistoryEntity.dhGnbFirst( downloadHistory.getDhGnbFirst() );
        downloadHistoryEntity.dhGnbSecond( downloadHistory.getDhGnbSecond() );
        downloadHistoryEntity.dhGnbThird( downloadHistory.getDhGnbThird() );
        downloadHistoryEntity.dhGnbFourth( downloadHistory.getDhGnbFourth() );
        downloadHistoryEntity.dhGnbFifth( downloadHistory.getDhGnbFifth() );
        downloadHistoryEntity.member( memberToMemberEntity( downloadHistory.getMember() ) );
        downloadHistoryEntity.dhReason( downloadHistory.getDhReason() );
        downloadHistoryEntity.dhType( downloadHistory.getDhType() );

        return downloadHistoryEntity.build();
    }

    @Override
    public DownloadHistory toDownloadHistoryModel(DownloadHistoryEntity save) {
        if ( save == null ) {
            return null;
        }

        DownloadHistory.DownloadHistoryBuilder<?, ?> downloadHistory = DownloadHistory.builder();

        downloadHistory.createdAt( save.getCreatedAt() );
        downloadHistory.updatedAt( save.getUpdatedAt() );
        downloadHistory.dhIdx( save.getDhIdx() );
        downloadHistory.dhGnbFirst( save.getDhGnbFirst() );
        downloadHistory.dhGnbSecond( save.getDhGnbSecond() );
        downloadHistory.dhGnbThird( save.getDhGnbThird() );
        downloadHistory.dhGnbFourth( save.getDhGnbFourth() );
        downloadHistory.dhGnbFifth( save.getDhGnbFifth() );
        downloadHistory.member( memberEntityToMember( save.getMember() ) );
        downloadHistory.dhReason( save.getDhReason() );
        downloadHistory.dhType( save.getDhType() );

        return downloadHistory.build();
    }

    @Override
    public List<DownloadRequest> toDownloadRequestList(List<DownloadRequestEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<DownloadRequest> list = new ArrayList<DownloadRequest>( allById.size() );
        for ( DownloadRequestEntity downloadRequestEntity : allById ) {
            list.add( toDownloadRequest( downloadRequestEntity ) );
        }

        return list;
    }

    @Override
    public DownloadRequestEntity toDownloadRequestEntity(DownloadRequest save) {
        if ( save == null ) {
            return null;
        }

        DownloadRequestEntity.DownloadRequestEntityBuilder downloadRequestEntity = DownloadRequestEntity.builder();

        downloadRequestEntity.drIdx( save.getDrIdx() );
        downloadRequestEntity.member( memberToMemberEntity( save.getMember() ) );
        downloadRequestEntity.soDefine( soDefineToSoDefineEntity( save.getSoDefine() ) );
        downloadRequestEntity.drCategory( save.getDrCategory() );
        downloadRequestEntity.drTitle( save.getDrTitle() );
        downloadRequestEntity.drPurpose( save.getDrPurpose() );
        downloadRequestEntity.mbAdminNo( save.getMbAdminNo() );
        downloadRequestEntity.drDisposer( save.getDrDisposer() );
        downloadRequestEntity.drSubmit( save.getDrSubmit() );
        downloadRequestEntity.drSearchStart( save.getDrSearchStart() );
        downloadRequestEntity.drSearchEnd( save.getDrSearchEnd() );
        downloadRequestEntity.drRequestDate( save.getDrRequestDate() );
        downloadRequestEntity.drDownloadDeadline( save.getDrDownloadDeadline() );
        downloadRequestEntity.drExpireDate( save.getDrExpireDate() );
        downloadRequestEntity.drLeft( save.getDrLeft() );
        downloadRequestEntity.drStatus( save.getDrStatus() );
        downloadRequestEntity.mbApproveSuperNo( save.getMbApproveSuperNo() );
        downloadRequestEntity.drApproveDetail( save.getDrApproveDetail() );
        downloadRequestEntity.drApproveDate( save.getDrApproveDate() );
        downloadRequestEntity.drType( save.getDrType() );

        return downloadRequestEntity.build();
    }

    @Override
    public List<DownloadRequestEntity> toDownloadRequestEntityList(List<DownloadRequest> downloadRequestAllByDrIdxList) {
        if ( downloadRequestAllByDrIdxList == null ) {
            return null;
        }

        List<DownloadRequestEntity> list = new ArrayList<DownloadRequestEntity>( downloadRequestAllByDrIdxList.size() );
        for ( DownloadRequest downloadRequest : downloadRequestAllByDrIdxList ) {
            list.add( toDownloadRequestEntity( downloadRequest ) );
        }

        return list;
    }

    @Override
    public DownloadRequest toDownloadRequest(DownloadRequestEntity downloadRequestEntity) {
        if ( downloadRequestEntity == null ) {
            return null;
        }

        DownloadRequest.DownloadRequestBuilder<?, ?> downloadRequest = DownloadRequest.builder();

        downloadRequest.createdAt( downloadRequestEntity.getCreatedAt() );
        downloadRequest.updatedAt( downloadRequestEntity.getUpdatedAt() );
        downloadRequest.drIdx( downloadRequestEntity.getDrIdx() );
        downloadRequest.member( memberEntityToMember( downloadRequestEntity.getMember() ) );
        downloadRequest.soDefine( soDefineEntityToSoDefine( downloadRequestEntity.getSoDefine() ) );
        downloadRequest.drCategory( downloadRequestEntity.getDrCategory() );
        downloadRequest.drTitle( downloadRequestEntity.getDrTitle() );
        downloadRequest.drPurpose( downloadRequestEntity.getDrPurpose() );
        downloadRequest.mbAdminNo( downloadRequestEntity.getMbAdminNo() );
        downloadRequest.drDisposer( downloadRequestEntity.getDrDisposer() );
        downloadRequest.drSubmit( downloadRequestEntity.getDrSubmit() );
        downloadRequest.drSearchStart( downloadRequestEntity.getDrSearchStart() );
        downloadRequest.drSearchEnd( downloadRequestEntity.getDrSearchEnd() );
        downloadRequest.drRequestDate( downloadRequestEntity.getDrRequestDate() );
        downloadRequest.drDownloadDeadline( downloadRequestEntity.getDrDownloadDeadline() );
        downloadRequest.drExpireDate( downloadRequestEntity.getDrExpireDate() );
        downloadRequest.drLeft( downloadRequestEntity.getDrLeft() );
        downloadRequest.drStatus( downloadRequestEntity.getDrStatus() );
        downloadRequest.mbApproveSuperNo( downloadRequestEntity.getMbApproveSuperNo() );
        downloadRequest.drApproveDetail( downloadRequestEntity.getDrApproveDetail() );
        downloadRequest.drApproveDate( downloadRequestEntity.getDrApproveDate() );
        downloadRequest.drType( downloadRequestEntity.getDrType() );

        return downloadRequest.build();
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
}
