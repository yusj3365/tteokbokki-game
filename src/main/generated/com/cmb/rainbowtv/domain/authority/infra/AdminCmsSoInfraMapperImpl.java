package com.cmb.rainbowtv.domain.authority.infra;

import com.cmb.rainbowtv.domain.authority.infra.data.entity.AdminCmsSoEntity;
import com.cmb.rainbowtv.domain.authority.model.AdminCmsSo;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import com.cmb.rainbowtv.global.define.so.infra.data.entity.SoDefineEntity;
import com.cmb.rainbowtv.global.define.so.model.SoDefine;
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
public class AdminCmsSoInfraMapperImpl implements AdminCmsSoInfraMapper {

    @Override
    public AdminCmsSoEntity toAdminCmsSoEntity(AdminCmsSo adminCmsSo) {
        if ( adminCmsSo == null ) {
            return null;
        }

        AdminCmsSoEntity.AdminCmsSoEntityBuilder adminCmsSoEntity = AdminCmsSoEntity.builder();

        adminCmsSoEntity.acsIdx( adminCmsSo.getAcsIdx() );
        adminCmsSoEntity.member( memberToMemberEntity( adminCmsSo.getMember() ) );
        adminCmsSoEntity.soDefine( soDefineToSoDefineEntity( adminCmsSo.getSoDefine() ) );

        return adminCmsSoEntity.build();
    }

    @Override
    public AdminCmsSo toAdminCmsSo(AdminCmsSoEntity adminCmsSoEntity) {
        if ( adminCmsSoEntity == null ) {
            return null;
        }

        AdminCmsSo.AdminCmsSoBuilder<?, ?> adminCmsSo = AdminCmsSo.builder();

        adminCmsSo.createdAt( adminCmsSoEntity.getCreatedAt() );
        adminCmsSo.updatedAt( adminCmsSoEntity.getUpdatedAt() );
        adminCmsSo.acsIdx( adminCmsSoEntity.getAcsIdx() );
        adminCmsSo.member( memberEntityToMember( adminCmsSoEntity.getMember() ) );
        adminCmsSo.soDefine( soDefineEntityToSoDefine( adminCmsSoEntity.getSoDefine() ) );

        return adminCmsSo.build();
    }

    @Override
    public List<AdminCmsSo> toAdminCmsSoList(List<AdminCmsSoEntity> adminCmsSoEntities) {
        if ( adminCmsSoEntities == null ) {
            return null;
        }

        List<AdminCmsSo> list = new ArrayList<AdminCmsSo>( adminCmsSoEntities.size() );
        for ( AdminCmsSoEntity adminCmsSoEntity : adminCmsSoEntities ) {
            list.add( toAdminCmsSo( adminCmsSoEntity ) );
        }

        return list;
    }

    @Override
    public List<AdminCmsSoEntity> toAdminCmsSoEntityList(List<AdminCmsSo> adminCmsSoList) {
        if ( adminCmsSoList == null ) {
            return null;
        }

        List<AdminCmsSoEntity> list = new ArrayList<AdminCmsSoEntity>( adminCmsSoList.size() );
        for ( AdminCmsSo adminCmsSo : adminCmsSoList ) {
            list.add( toAdminCmsSoEntity( adminCmsSo ) );
        }

        return list;
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
