package com.cmb.rainbowtv.domain.authority.infra;

import com.cmb.rainbowtv.domain.authority.infra.data.entity.AdminCrmMenuEntity;
import com.cmb.rainbowtv.domain.authority.model.AdminCrmMenu;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.global.define.authority.infra.data.entity.CrmAuthorityDefineEntity;
import com.cmb.rainbowtv.global.define.authority.model.CrmAuthorityDefine;
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
public class AdminCrmMenuInfraMapperImpl implements AdminCrmMenuInfraMapper {

    @Override
    public List<AdminCrmMenuEntity> toAdminCrmMenuEntityList(List<AdminCrmMenu> adminCrmMenus) {
        if ( adminCrmMenus == null ) {
            return null;
        }

        List<AdminCrmMenuEntity> list = new ArrayList<AdminCrmMenuEntity>( adminCrmMenus.size() );
        for ( AdminCrmMenu adminCrmMenu : adminCrmMenus ) {
            list.add( adminCrmMenuToAdminCrmMenuEntity( adminCrmMenu ) );
        }

        return list;
    }

    @Override
    public List<AdminCrmMenu> toAdminCrmMenuList(List<AdminCrmMenuEntity> adminCrmMenuEntities) {
        if ( adminCrmMenuEntities == null ) {
            return null;
        }

        List<AdminCrmMenu> list = new ArrayList<AdminCrmMenu>( adminCrmMenuEntities.size() );
        for ( AdminCrmMenuEntity adminCrmMenuEntity : adminCrmMenuEntities ) {
            list.add( toAdminCrmMenu( adminCrmMenuEntity ) );
        }

        return list;
    }

    @Override
    public AdminCrmMenu toAdminCrmMenu(AdminCrmMenuEntity adminCrmMenuEntity) {
        if ( adminCrmMenuEntity == null ) {
            return null;
        }

        AdminCrmMenu.AdminCrmMenuBuilder<?, ?> adminCrmMenu = AdminCrmMenu.builder();

        adminCrmMenu.createdAt( adminCrmMenuEntity.getCreatedAt() );
        adminCrmMenu.updatedAt( adminCrmMenuEntity.getUpdatedAt() );
        adminCrmMenu.acmIdx( adminCrmMenuEntity.getAcmIdx() );
        adminCrmMenu.member( memberEntityToMember( adminCrmMenuEntity.getMember() ) );
        adminCrmMenu.crmAuthorityDefine( crmAuthorityDefineEntityToCrmAuthorityDefine( adminCrmMenuEntity.getCrmAuthorityDefine() ) );

        return adminCrmMenu.build();
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

    protected CrmAuthorityDefineEntity crmAuthorityDefineToCrmAuthorityDefineEntity(CrmAuthorityDefine crmAuthorityDefine) {
        if ( crmAuthorityDefine == null ) {
            return null;
        }

        CrmAuthorityDefineEntity.CrmAuthorityDefineEntityBuilder crmAuthorityDefineEntity = CrmAuthorityDefineEntity.builder();

        crmAuthorityDefineEntity.cadIdx( crmAuthorityDefine.getCadIdx() );
        crmAuthorityDefineEntity.cadDepth( crmAuthorityDefine.getCadDepth() );
        crmAuthorityDefineEntity.cadParent( crmAuthorityDefine.getCadParent() );
        crmAuthorityDefineEntity.cadName( crmAuthorityDefine.getCadName() );
        crmAuthorityDefineEntity.cadRoute( crmAuthorityDefine.getCadRoute() );

        return crmAuthorityDefineEntity.build();
    }

    protected AdminCrmMenuEntity adminCrmMenuToAdminCrmMenuEntity(AdminCrmMenu adminCrmMenu) {
        if ( adminCrmMenu == null ) {
            return null;
        }

        AdminCrmMenuEntity.AdminCrmMenuEntityBuilder adminCrmMenuEntity = AdminCrmMenuEntity.builder();

        adminCrmMenuEntity.acmIdx( adminCrmMenu.getAcmIdx() );
        adminCrmMenuEntity.member( memberToMemberEntity( adminCrmMenu.getMember() ) );
        adminCrmMenuEntity.crmAuthorityDefine( crmAuthorityDefineToCrmAuthorityDefineEntity( adminCrmMenu.getCrmAuthorityDefine() ) );

        return adminCrmMenuEntity.build();
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

    protected CrmAuthorityDefine crmAuthorityDefineEntityToCrmAuthorityDefine(CrmAuthorityDefineEntity crmAuthorityDefineEntity) {
        if ( crmAuthorityDefineEntity == null ) {
            return null;
        }

        CrmAuthorityDefine.CrmAuthorityDefineBuilder<?, ?> crmAuthorityDefine = CrmAuthorityDefine.builder();

        crmAuthorityDefine.createdAt( crmAuthorityDefineEntity.getCreatedAt() );
        crmAuthorityDefine.updatedAt( crmAuthorityDefineEntity.getUpdatedAt() );
        crmAuthorityDefine.cadIdx( crmAuthorityDefineEntity.getCadIdx() );
        crmAuthorityDefine.cadDepth( crmAuthorityDefineEntity.getCadDepth() );
        crmAuthorityDefine.cadParent( crmAuthorityDefineEntity.getCadParent() );
        crmAuthorityDefine.cadName( crmAuthorityDefineEntity.getCadName() );
        crmAuthorityDefine.cadRoute( crmAuthorityDefineEntity.getCadRoute() );

        return crmAuthorityDefine.build();
    }
}
