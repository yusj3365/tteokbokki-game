package com.cmb.rainbowtv.domain.log.infra;

import com.cmb.rainbowtv.domain.log.infra.data.entity.CrmLogEntity;
import com.cmb.rainbowtv.domain.log.model.CrmLog;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:45+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CrmLogInfraMapperImpl implements CrmLogInfraMapper {

    @Override
    public CrmLogEntity toCrmLogEntity(CrmLog crmLog) {
        if ( crmLog == null ) {
            return null;
        }

        CrmLogEntity.CrmLogEntityBuilder crmLogEntity = CrmLogEntity.builder();

        crmLogEntity.clIdx( crmLog.getClIdx() );
        crmLogEntity.member( memberToMemberEntity( crmLog.getMember() ) );
        crmLogEntity.clDate( crmLog.getClDate() );
        crmLogEntity.clIp( crmLog.getClIp() );
        crmLogEntity.clId( crmLog.getClId() );
        crmLogEntity.clName( crmLog.getClName() );
        crmLogEntity.clType( crmLog.getClType() );
        crmLogEntity.clSo( crmLog.getClSo() );
        crmLogEntity.clDepth( crmLog.getClDepth() );
        crmLogEntity.clAccess( crmLog.getClAccess() );
        crmLogEntity.clAction( crmLog.getClAction() );
        crmLogEntity.clClient( crmLog.getClClient() );

        return crmLogEntity.build();
    }

    @Override
    public CrmLog toCrmLog(CrmLogEntity crmLogEntity) {
        if ( crmLogEntity == null ) {
            return null;
        }

        CrmLog.CrmLogBuilder<?, ?> crmLog = CrmLog.builder();

        crmLog.clIdx( crmLogEntity.getClIdx() );
        crmLog.member( memberEntityToMember( crmLogEntity.getMember() ) );
        crmLog.clDate( crmLogEntity.getClDate() );
        crmLog.clIp( crmLogEntity.getClIp() );
        crmLog.clId( crmLogEntity.getClId() );
        crmLog.clName( crmLogEntity.getClName() );
        crmLog.clType( crmLogEntity.getClType() );
        crmLog.clSo( crmLogEntity.getClSo() );
        crmLog.clDepth( crmLogEntity.getClDepth() );
        crmLog.clAccess( crmLogEntity.getClAccess() );
        crmLog.clAction( crmLogEntity.getClAction() );
        crmLog.clClient( crmLogEntity.getClClient() );

        return crmLog.build();
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
}
