package com.cmb.rainbowtv.domain.memberDelivery.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.memberDelivery.infra.data.entity.MemberDeliveryEntity;
import com.cmb.rainbowtv.domain.memberDelivery.model.MemberDelivery;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:47+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class MemberDeliveryInfraMapperImpl implements MemberDeliveryInfraMapper {

    @Override
    public MemberDeliveryEntity toMemberDeliveryEntity(MemberDelivery memberDelivery) {
        if ( memberDelivery == null ) {
            return null;
        }

        MemberDeliveryEntity.MemberDeliveryEntityBuilder memberDeliveryEntity = MemberDeliveryEntity.builder();

        memberDeliveryEntity.mdIdx( memberDelivery.getMdIdx() );
        memberDeliveryEntity.member( memberToMemberEntity( memberDelivery.getMember() ) );
        memberDeliveryEntity.mdReceiver( memberDelivery.getMdReceiver() );
        memberDeliveryEntity.mdTel( memberDelivery.getMdTel() );
        memberDeliveryEntity.mdAddr( memberDelivery.getMdAddr() );
        memberDeliveryEntity.mdAddrDetail( memberDelivery.getMdAddrDetail() );
        memberDeliveryEntity.mdZipcode( memberDelivery.getMdZipcode() );
        memberDeliveryEntity.mdIsDefault( memberDelivery.getMdIsDefault() );
        memberDeliveryEntity.areaDefine( areaDefineToAreaDefineEntity( memberDelivery.getAreaDefine() ) );

        return memberDeliveryEntity.build();
    }

    @Override
    public MemberDelivery toMemberDelivery(MemberDeliveryEntity memberDeliveryEntity) {
        if ( memberDeliveryEntity == null ) {
            return null;
        }

        MemberDelivery.MemberDeliveryBuilder<?, ?> memberDelivery = MemberDelivery.builder();

        memberDelivery.createdAt( memberDeliveryEntity.getCreatedAt() );
        memberDelivery.updatedAt( memberDeliveryEntity.getUpdatedAt() );
        memberDelivery.mdIdx( memberDeliveryEntity.getMdIdx() );
        memberDelivery.member( memberEntityToMember( memberDeliveryEntity.getMember() ) );
        memberDelivery.mdReceiver( memberDeliveryEntity.getMdReceiver() );
        memberDelivery.mdTel( memberDeliveryEntity.getMdTel() );
        memberDelivery.mdAddr( memberDeliveryEntity.getMdAddr() );
        memberDelivery.mdAddrDetail( memberDeliveryEntity.getMdAddrDetail() );
        memberDelivery.mdZipcode( memberDeliveryEntity.getMdZipcode() );
        memberDelivery.mdIsDefault( memberDeliveryEntity.getMdIsDefault() );
        memberDelivery.areaDefine( areaDefineEntityToAreaDefine( memberDeliveryEntity.getAreaDefine() ) );

        return memberDelivery.build();
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
}
