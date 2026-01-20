package com.cmb.rainbowtv.domain.log.infra;

import com.cmb.rainbowtv.domain.log.infra.data.entity.ChkpwLogEntity;
import com.cmb.rainbowtv.domain.log.infra.data.entity.DeactivateLogEntity;
import com.cmb.rainbowtv.domain.log.infra.data.entity.LoginLogHistoryEntity;
import com.cmb.rainbowtv.domain.log.infra.data.entity.LoginPlatformEntity;
import com.cmb.rainbowtv.domain.log.infra.data.entity.MemberTvLogEntity;
import com.cmb.rainbowtv.domain.log.infra.data.entity.UpdateHpLogEntity;
import com.cmb.rainbowtv.domain.log.model.ChkpwLog;
import com.cmb.rainbowtv.domain.log.model.DeactivateLog;
import com.cmb.rainbowtv.domain.log.model.LoginLogHistory;
import com.cmb.rainbowtv.domain.log.model.LoginPlatform;
import com.cmb.rainbowtv.domain.log.model.MemberTvLog;
import com.cmb.rainbowtv.domain.log.model.UpdateHpLog;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:41+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class LogInfraMapperImpl implements LogInfraMapper {

    @Override
    public UpdateHpLogEntity toUpdateHpLogEntity(UpdateHpLog updateHpLog) {
        if ( updateHpLog == null ) {
            return null;
        }

        UpdateHpLogEntity.UpdateHpLogEntityBuilder updateHpLogEntity = UpdateHpLogEntity.builder();

        updateHpLogEntity.ulIdx( updateHpLog.getUlIdx() );
        updateHpLogEntity.mbId( updateHpLog.getMbId() );
        updateHpLogEntity.ulIp( updateHpLog.getUlIp() );
        updateHpLogEntity.originHp( updateHpLog.getOriginHp() );
        updateHpLogEntity.updatedHp( updateHpLog.getUpdatedHp() );

        return updateHpLogEntity.build();
    }

    @Override
    public LoginLogHistoryEntity toLoginLogEntity(LoginLogHistory loginLog) {
        if ( loginLog == null ) {
            return null;
        }

        LoginLogHistoryEntity.LoginLogHistoryEntityBuilder loginLogHistoryEntity = LoginLogHistoryEntity.builder();

        loginLogHistoryEntity.lhIdx( loginLog.getLhIdx() );
        loginLogHistoryEntity.mbId( loginLog.getMbId() );
        loginLogHistoryEntity.clientIp( loginLog.getClientIp() );

        return loginLogHistoryEntity.build();
    }

    @Override
    public DeactivateLogEntity toDeactivateLogEntity(DeactivateLog deactivateLog) {
        if ( deactivateLog == null ) {
            return null;
        }

        DeactivateLogEntity.DeactivateLogEntityBuilder deactivateLogEntity = DeactivateLogEntity.builder();

        deactivateLogEntity.dlIdx( deactivateLog.getDlIdx() );
        deactivateLogEntity.mbId( deactivateLog.getMbId() );
        deactivateLogEntity.clientIp( deactivateLog.getClientIp() );

        return deactivateLogEntity.build();
    }

    @Override
    public LoginPlatformEntity toLoginPlatformEntity(LoginPlatform loginPlatform) {
        if ( loginPlatform == null ) {
            return null;
        }

        LoginPlatformEntity.LoginPlatformEntityBuilder loginPlatformEntity = LoginPlatformEntity.builder();

        loginPlatformEntity.lpIdx( loginPlatform.getLpIdx() );
        loginPlatformEntity.member( memberToMemberEntity( loginPlatform.getMember() ) );
        loginPlatformEntity.lpType( loginPlatform.getLpType() );
        loginPlatformEntity.lpDeviceCode( loginPlatform.getLpDeviceCode() );
        loginPlatformEntity.lpVersion( loginPlatform.getLpVersion() );
        loginPlatformEntity.arLatestVersion( loginPlatform.getArLatestVersion() );

        return loginPlatformEntity.build();
    }

    @Override
    public ChkpwLogEntity toChkpwLogEntity(ChkpwLog chkpwLog) {
        if ( chkpwLog == null ) {
            return null;
        }

        ChkpwLogEntity.ChkpwLogEntityBuilder chkpwLogEntity = ChkpwLogEntity.builder();

        chkpwLogEntity.clIdx( chkpwLog.getClIdx() );
        chkpwLogEntity.mbId( chkpwLog.getMbId() );
        chkpwLogEntity.clIp( chkpwLog.getClIp() );
        chkpwLogEntity.clChk( chkpwLog.getClChk() );

        return chkpwLogEntity.build();
    }

    @Override
    public ChkpwLog toChkpwLogModel(ChkpwLogEntity save) {
        if ( save == null ) {
            return null;
        }

        ChkpwLog.ChkpwLogBuilder<?, ?> chkpwLog = ChkpwLog.builder();

        chkpwLog.createdAt( save.getCreatedAt() );
        chkpwLog.updatedAt( save.getUpdatedAt() );
        chkpwLog.clIdx( save.getClIdx() );
        chkpwLog.mbId( save.getMbId() );
        chkpwLog.clIp( save.getClIp() );
        chkpwLog.clChk( save.getClChk() );

        return chkpwLog.build();
    }

    @Override
    public MemberTvLogEntity toMemberTvLogEntity(MemberTvLog memberTvLog) {
        if ( memberTvLog == null ) {
            return null;
        }

        MemberTvLogEntity.MemberTvLogEntityBuilder memberTvLogEntity = MemberTvLogEntity.builder();

        memberTvLogEntity.mtlIdx( memberTvLog.getMtlIdx() );
        memberTvLogEntity.member( memberToMemberEntity( memberTvLog.getMember() ) );
        memberTvLogEntity.mbId( memberTvLog.getMbId() );
        memberTvLogEntity.mtlTypeEnum( memberTvLog.getMtlTypeEnum() );

        return memberTvLogEntity.build();
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
}
