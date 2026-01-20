package com.cmb.rainbowtv.domain.member.infra;

import com.cmb.rainbowtv.domain.log.infra.data.entity.LoginLogEntity;
import com.cmb.rainbowtv.domain.log.model.LoginLog;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaCategoryEntity;
import com.cmb.rainbowtv.domain.media.model.MediaCategory;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberAdminEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberAdultPasswordEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberAlarmEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberByInterestEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberInfoEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberJwtTokenEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberLastAdvertiseEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberOrganizationEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberOutCategoryEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberOutEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberOutInfoEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSocialEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberTokenEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.QrEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberAdmin;
import com.cmb.rainbowtv.domain.member.model.MemberAdultPassword;
import com.cmb.rainbowtv.domain.member.model.MemberAlarm;
import com.cmb.rainbowtv.domain.member.model.MemberByInterest;
import com.cmb.rainbowtv.domain.member.model.MemberInfo;
import com.cmb.rainbowtv.domain.member.model.MemberJwtToken;
import com.cmb.rainbowtv.domain.member.model.MemberLastAdvertise;
import com.cmb.rainbowtv.domain.member.model.MemberOrganization;
import com.cmb.rainbowtv.domain.member.model.MemberOut;
import com.cmb.rainbowtv.domain.member.model.MemberOutCategory;
import com.cmb.rainbowtv.domain.member.model.MemberOutInfo;
import com.cmb.rainbowtv.domain.member.model.MemberSocial;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.member.model.MemberToken;
import com.cmb.rainbowtv.domain.member.model.Qr;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import com.cmb.rainbowtv.global.define.so.infra.data.entity.SoDefineEntity;
import com.cmb.rainbowtv.global.define.so.model.SoDefine;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:47+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class MemberInfraMapperImpl implements MemberInfraMapper {

    @Override
    public MemberAlarmEntity toMemberAlarmEntity(MemberAlarm memberAlarm) {
        if ( memberAlarm == null ) {
            return null;
        }

        Long maIdx = null;
        MemberEntity member = null;
        Integer maAgreeAdvertising = null;
        LocalDateTime maAgreeAdvertisingDate = null;
        Integer maAgreeNight = null;
        Integer maPrivacy = null;
        LocalDateTime maPrivacyDate = null;
        Integer maEmailAgree = null;
        Integer maSmsSnsAgree = null;
        Integer maPushAgree = null;
        Integer maHomeChoice = null;
        Integer maMarketingUse = null;
        LocalDateTime maMarketingUseDate = null;
        Integer maPartnerPushAgree = null;
        LocalDateTime maPartnerPushAgreeDate = null;

        maIdx = memberAlarm.getMaIdx();
        member = toMemberEntity( memberAlarm.getMember() );
        maAgreeAdvertising = memberAlarm.getMaAgreeAdvertising();
        maAgreeAdvertisingDate = memberAlarm.getMaAgreeAdvertisingDate();
        maAgreeNight = memberAlarm.getMaAgreeNight();
        maPrivacy = memberAlarm.getMaPrivacy();
        maPrivacyDate = memberAlarm.getMaPrivacyDate();
        maEmailAgree = memberAlarm.getMaEmailAgree();
        maSmsSnsAgree = memberAlarm.getMaSmsSnsAgree();
        maPushAgree = memberAlarm.getMaPushAgree();
        maHomeChoice = memberAlarm.getMaHomeChoice();
        maMarketingUse = memberAlarm.getMaMarketingUse();
        maMarketingUseDate = memberAlarm.getMaMarketingUseDate();
        maPartnerPushAgree = memberAlarm.getMaPartnerPushAgree();
        maPartnerPushAgreeDate = memberAlarm.getMaPartnerPushAgreeDate();

        MemberAlarmEntity memberAlarmEntity = new MemberAlarmEntity( maIdx, member, maAgreeAdvertising, maAgreeAdvertisingDate, maAgreeNight, maPrivacy, maPrivacyDate, maEmailAgree, maSmsSnsAgree, maPushAgree, maHomeChoice, maMarketingUse, maMarketingUseDate, maPartnerPushAgree, maPartnerPushAgreeDate );

        memberAlarmEntity.setCreatedAt( memberAlarm.getCreatedAt() );
        memberAlarmEntity.setUpdatedAt( memberAlarm.getUpdatedAt() );

        return memberAlarmEntity;
    }

    @Override
    public MemberAlarm toMemberAlarm(MemberAlarmEntity memberAlarmEntity) {
        if ( memberAlarmEntity == null ) {
            return null;
        }

        MemberAlarm.MemberAlarmBuilder<?, ?> memberAlarm = MemberAlarm.builder();

        memberAlarm.createdAt( memberAlarmEntity.getCreatedAt() );
        memberAlarm.updatedAt( memberAlarmEntity.getUpdatedAt() );
        memberAlarm.maIdx( memberAlarmEntity.getMaIdx() );
        memberAlarm.member( toMember( memberAlarmEntity.getMember() ) );
        memberAlarm.maAgreeAdvertising( memberAlarmEntity.getMaAgreeAdvertising() );
        memberAlarm.maAgreeAdvertisingDate( memberAlarmEntity.getMaAgreeAdvertisingDate() );
        memberAlarm.maAgreeNight( memberAlarmEntity.getMaAgreeNight() );
        memberAlarm.maPrivacy( memberAlarmEntity.getMaPrivacy() );
        memberAlarm.maPrivacyDate( memberAlarmEntity.getMaPrivacyDate() );
        memberAlarm.maEmailAgree( memberAlarmEntity.getMaEmailAgree() );
        memberAlarm.maSmsSnsAgree( memberAlarmEntity.getMaSmsSnsAgree() );
        memberAlarm.maPushAgree( memberAlarmEntity.getMaPushAgree() );
        memberAlarm.maHomeChoice( memberAlarmEntity.getMaHomeChoice() );
        memberAlarm.maMarketingUse( memberAlarmEntity.getMaMarketingUse() );
        memberAlarm.maMarketingUseDate( memberAlarmEntity.getMaMarketingUseDate() );
        memberAlarm.maPartnerPushAgree( memberAlarmEntity.getMaPartnerPushAgree() );
        memberAlarm.maPartnerPushAgreeDate( memberAlarmEntity.getMaPartnerPushAgreeDate() );

        return memberAlarm.build();
    }

    @Override
    public MemberInfoEntity toMemberInfoEntity(MemberInfo memberInfo) {
        if ( memberInfo == null ) {
            return null;
        }

        MemberInfoEntity.MemberInfoEntityBuilder memberInfoEntity = MemberInfoEntity.builder();

        memberInfoEntity.miIdx( memberInfo.getMiIdx() );
        memberInfoEntity.member( toMemberEntity( memberInfo.getMember() ) );
        memberInfoEntity.mbNick( memberInfo.getMbNick() );
        memberInfoEntity.mbEmail( memberInfo.getMbEmail() );
        memberInfoEntity.mbBirth( memberInfo.getMbBirth() );
        memberInfoEntity.mbBirthJ( memberInfo.getMbBirthJ() );
        memberInfoEntity.mbSex( memberInfo.getMbSex() );
        memberInfoEntity.mbMemo( memberInfo.getMbMemo() );
        memberInfoEntity.mbDeviceToken( memberInfo.getMbDeviceToken() );
        memberInfoEntity.areaDefine( areaDefineToAreaDefineEntity( memberInfo.getAreaDefine() ) );
        memberInfoEntity.mbZipCode( memberInfo.getMbZipCode() );
        memberInfoEntity.mbAddr( memberInfo.getMbAddr() );
        memberInfoEntity.mbAddrDetail( memberInfo.getMbAddrDetail() );
        memberInfoEntity.mbJoinRoute( memberInfo.getMbJoinRoute() );
        memberInfoEntity.mbNumber( memberInfo.getMbNumber() );
        memberInfoEntity.aaIdx( memberInfo.getAaIdx() );
        memberInfoEntity.mbSendStatus( memberInfo.getMbSendStatus() );
        memberInfoEntity.mbIsSettop( memberInfo.getMbIsSettop() );
        memberInfoEntity.mbUserType( memberInfo.getMbUserType() );
        memberInfoEntity.miUseMethod( memberInfo.getMiUseMethod() );
        memberInfoEntity.miIsApp( memberInfo.getMiIsApp() );
        memberInfoEntity.miIsInterest( memberInfo.getMiIsInterest() );
        memberInfoEntity.miRNum( memberInfo.getMiRNum() );
        memberInfoEntity.miRegisterType( memberInfo.getMiRegisterType() );
        memberInfoEntity.miBusinessRegistrationNumber( memberInfo.getMiBusinessRegistrationNumber() );
        memberInfoEntity.miOrganizerName( memberInfo.getMiOrganizerName() );
        memberInfoEntity.miOrganizerCompany( memberInfo.getMiOrganizerCompany() );
        memberInfoEntity.miNote( memberInfo.getMiNote() );
        memberInfoEntity.soDefine( soDefineToSoDefineEntity( memberInfo.getSoDefine() ) );
        memberInfoEntity.miJoinType( memberInfo.getMiJoinType() );
        memberInfoEntity.miIsLeader( memberInfo.getMiIsLeader() );
        memberInfoEntity.memberOrganization( toMemberOrganizationEntity( memberInfo.getMemberOrganization() ) );
        memberInfoEntity.miRainbow( memberInfo.getMiRainbow() );
        memberInfoEntity.miDeliveryAddrConf( memberInfo.getMiDeliveryAddrConf() );
        memberInfoEntity.miDeliveryHpConf( memberInfo.getMiDeliveryHpConf() );
        memberInfoEntity.miRecommendCode( memberInfo.getMiRecommendCode() );

        return memberInfoEntity.build();
    }

    @Override
    public MemberInfo toMemberInfo(MemberInfoEntity infoEntity) {
        if ( infoEntity == null ) {
            return null;
        }

        MemberInfo.MemberInfoBuilder<?, ?> memberInfo = MemberInfo.builder();

        memberInfo.createdAt( infoEntity.getCreatedAt() );
        memberInfo.updatedAt( infoEntity.getUpdatedAt() );
        memberInfo.miIdx( infoEntity.getMiIdx() );
        memberInfo.member( toMember( infoEntity.getMember() ) );
        memberInfo.mbNick( infoEntity.getMbNick() );
        memberInfo.mbEmail( infoEntity.getMbEmail() );
        memberInfo.mbBirth( infoEntity.getMbBirth() );
        memberInfo.mbBirthJ( infoEntity.getMbBirthJ() );
        memberInfo.mbSex( infoEntity.getMbSex() );
        memberInfo.mbMemo( infoEntity.getMbMemo() );
        memberInfo.mbDeviceToken( infoEntity.getMbDeviceToken() );
        memberInfo.areaDefine( areaDefineEntityToAreaDefine( infoEntity.getAreaDefine() ) );
        memberInfo.mbZipCode( infoEntity.getMbZipCode() );
        memberInfo.mbAddr( infoEntity.getMbAddr() );
        memberInfo.mbAddrDetail( infoEntity.getMbAddrDetail() );
        memberInfo.mbJoinRoute( infoEntity.getMbJoinRoute() );
        memberInfo.mbNumber( infoEntity.getMbNumber() );
        memberInfo.aaIdx( infoEntity.getAaIdx() );
        memberInfo.mbSendStatus( infoEntity.getMbSendStatus() );
        memberInfo.mbIsSettop( infoEntity.getMbIsSettop() );
        memberInfo.mbUserType( infoEntity.getMbUserType() );
        memberInfo.miUseMethod( infoEntity.getMiUseMethod() );
        memberInfo.miIsApp( infoEntity.getMiIsApp() );
        memberInfo.miIsInterest( infoEntity.getMiIsInterest() );
        memberInfo.miRNum( infoEntity.getMiRNum() );
        memberInfo.miRegisterType( infoEntity.getMiRegisterType() );
        memberInfo.miBusinessRegistrationNumber( infoEntity.getMiBusinessRegistrationNumber() );
        memberInfo.miOrganizerName( infoEntity.getMiOrganizerName() );
        memberInfo.miOrganizerCompany( infoEntity.getMiOrganizerCompany() );
        memberInfo.miNote( infoEntity.getMiNote() );
        memberInfo.soDefine( soDefineEntityToSoDefine( infoEntity.getSoDefine() ) );
        memberInfo.miJoinType( infoEntity.getMiJoinType() );
        memberInfo.miIsLeader( infoEntity.getMiIsLeader() );
        memberInfo.memberOrganization( toMemberOrganization( infoEntity.getMemberOrganization() ) );
        memberInfo.miRainbow( infoEntity.getMiRainbow() );
        memberInfo.miDeliveryAddrConf( infoEntity.getMiDeliveryAddrConf() );
        memberInfo.miDeliveryHpConf( infoEntity.getMiDeliveryHpConf() );
        memberInfo.miRecommendCode( infoEntity.getMiRecommendCode() );

        return memberInfo.build();
    }

    @Override
    public MemberAdminEntity toMemberAdminEntity(MemberAdmin memberAdmin) {
        if ( memberAdmin == null ) {
            return null;
        }

        MemberAdminEntity.MemberAdminEntityBuilder memberAdminEntity = MemberAdminEntity.builder();

        memberAdminEntity.madIdx( memberAdmin.getMadIdx() );
        memberAdminEntity.member( toMemberEntity( memberAdmin.getMember() ) );
        memberAdminEntity.mbCompany( memberAdmin.getMbCompany() );
        memberAdminEntity.mbEmployeeNumber( memberAdmin.getMbEmployeeNumber() );
        memberAdminEntity.madLongTermStatus( memberAdmin.getMadLongTermStatus() );
        memberAdminEntity.madCmsAccess( memberAdmin.getMadCmsAccess() );
        memberAdminEntity.madCrmAccess( memberAdmin.getMadCrmAccess() );

        return memberAdminEntity.build();
    }

    @Override
    public MemberAdmin toMemberAdmin(MemberAdminEntity memberAdminEntity) {
        if ( memberAdminEntity == null ) {
            return null;
        }

        MemberAdmin.MemberAdminBuilder<?, ?> memberAdmin = MemberAdmin.builder();

        memberAdmin.createdAt( memberAdminEntity.getCreatedAt() );
        memberAdmin.updatedAt( memberAdminEntity.getUpdatedAt() );
        memberAdmin.madIdx( memberAdminEntity.getMadIdx() );
        memberAdmin.member( toMember( memberAdminEntity.getMember() ) );
        memberAdmin.mbCompany( memberAdminEntity.getMbCompany() );
        memberAdmin.mbEmployeeNumber( memberAdminEntity.getMbEmployeeNumber() );
        memberAdmin.madLongTermStatus( memberAdminEntity.getMadLongTermStatus() );
        memberAdmin.madCmsAccess( memberAdminEntity.getMadCmsAccess() );
        memberAdmin.madCrmAccess( memberAdminEntity.getMadCrmAccess() );

        return memberAdmin.build();
    }

    @Override
    public MemberSuspensionCategory toMemberSuspensionCategory(MemberSuspensionCategoryEntity memberSuspensionCategoryEntity) {
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

    @Override
    public MemberSuspensionCategoryEntity toMemberSuspensionCategoryEntity(MemberSuspensionCategory memberSuspensionCategory) {
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

    @Override
    public MemberEntity toMemberEntity(Member member) {
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
        memberEntity.memberSuspensionCategory( toMemberSuspensionCategoryEntity( member.getMemberSuspensionCategory() ) );
        memberEntity.mbEnd( member.getMbEnd() );

        return memberEntity.build();
    }

    @Override
    public Member toMember(MemberEntity memberEntity) {
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
        member.memberSuspensionCategory( toMemberSuspensionCategory( memberEntity.getMemberSuspensionCategory() ) );
        member.mbEnd( memberEntity.getMbEnd() );

        return member.build();
    }

    @Override
    public List<Member> toMemberList(List<MemberEntity> memberEntityList) {
        if ( memberEntityList == null ) {
            return null;
        }

        List<Member> list = new ArrayList<Member>( memberEntityList.size() );
        for ( MemberEntity memberEntity : memberEntityList ) {
            list.add( toMember( memberEntity ) );
        }

        return list;
    }

    @Override
    public MemberSocial toMemberSocial(MemberSocialEntity socialEntity) {
        if ( socialEntity == null ) {
            return null;
        }

        MemberSocial.MemberSocialBuilder<?, ?> memberSocial = MemberSocial.builder();

        memberSocial.createdAt( socialEntity.getCreatedAt() );
        memberSocial.updatedAt( socialEntity.getUpdatedAt() );
        memberSocial.msIdx( socialEntity.getMsIdx() );
        memberSocial.member( toMember( socialEntity.getMember() ) );
        memberSocial.socialType( socialEntity.getSocialType() );
        memberSocial.socialKey( socialEntity.getSocialKey() );
        memberSocial.socialId( socialEntity.getSocialId() );
        memberSocial.accessToken( socialEntity.getAccessToken() );
        memberSocial.refreshToken( socialEntity.getRefreshToken() );
        memberSocial.appleIosRefreshToken( socialEntity.getAppleIosRefreshToken() );
        memberSocial.appleAosRefreshToken( socialEntity.getAppleAosRefreshToken() );

        return memberSocial.build();
    }

    @Override
    public MemberSocialEntity toMemberSocialEntity(MemberSocial social) {
        if ( social == null ) {
            return null;
        }

        MemberSocialEntity.MemberSocialEntityBuilder memberSocialEntity = MemberSocialEntity.builder();

        memberSocialEntity.msIdx( social.getMsIdx() );
        memberSocialEntity.member( toMemberEntity( social.getMember() ) );
        memberSocialEntity.socialType( social.getSocialType() );
        memberSocialEntity.socialKey( social.getSocialKey() );
        memberSocialEntity.socialId( social.getSocialId() );
        memberSocialEntity.accessToken( social.getAccessToken() );
        memberSocialEntity.refreshToken( social.getRefreshToken() );
        memberSocialEntity.appleIosRefreshToken( social.getAppleIosRefreshToken() );
        memberSocialEntity.appleAosRefreshToken( social.getAppleAosRefreshToken() );

        return memberSocialEntity.build();
    }

    @Override
    public List<MemberToken> toMemberTokenList(List<MemberTokenEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<MemberToken> list = new ArrayList<MemberToken>( allById.size() );
        for ( MemberTokenEntity memberTokenEntity : allById ) {
            list.add( memberTokenEntityToMemberToken( memberTokenEntity ) );
        }

        return list;
    }

    @Override
    public MemberOrganizationEntity toMemberOrganizationEntity(MemberOrganization memberOrganization) {
        if ( memberOrganization == null ) {
            return null;
        }

        MemberOrganizationEntity.MemberOrganizationEntityBuilder memberOrganizationEntity = MemberOrganizationEntity.builder();

        memberOrganizationEntity.moIdx( memberOrganization.getMoIdx() );
        memberOrganizationEntity.moName( memberOrganization.getMoName() );
        memberOrganizationEntity.moCategory( memberOrganization.getMoCategory() );

        return memberOrganizationEntity.build();
    }

    @Override
    public MemberOrganization toMemberOrganization(MemberOrganizationEntity memberOrganizationEntity) {
        if ( memberOrganizationEntity == null ) {
            return null;
        }

        MemberOrganization.MemberOrganizationBuilder<?, ?> memberOrganization = MemberOrganization.builder();

        memberOrganization.createdAt( memberOrganizationEntity.getCreatedAt() );
        memberOrganization.updatedAt( memberOrganizationEntity.getUpdatedAt() );
        memberOrganization.moIdx( memberOrganizationEntity.getMoIdx() );
        memberOrganization.moName( memberOrganizationEntity.getMoName() );
        memberOrganization.moCategory( memberOrganizationEntity.getMoCategory() );

        return memberOrganization.build();
    }

    @Override
    public MemberAdultPasswordEntity toMemberAdultPasswordEntity(MemberAdultPassword memberAdultPassword) {
        if ( memberAdultPassword == null ) {
            return null;
        }

        MemberAdultPasswordEntity.MemberAdultPasswordEntityBuilder memberAdultPasswordEntity = MemberAdultPasswordEntity.builder();

        memberAdultPasswordEntity.mapIdx( memberAdultPassword.getMapIdx() );
        memberAdultPasswordEntity.member( toMemberEntity( memberAdultPassword.getMember() ) );
        memberAdultPasswordEntity.mapPassword( memberAdultPassword.getMapPassword() );

        return memberAdultPasswordEntity.build();
    }

    @Override
    public MemberAdultPassword toMemberAdultPassword(MemberAdultPasswordEntity memberAdultPasswordEntity) {
        if ( memberAdultPasswordEntity == null ) {
            return null;
        }

        MemberAdultPassword.MemberAdultPasswordBuilder<?, ?> memberAdultPassword = MemberAdultPassword.builder();

        memberAdultPassword.createdAt( memberAdultPasswordEntity.getCreatedAt() );
        memberAdultPassword.updatedAt( memberAdultPasswordEntity.getUpdatedAt() );
        memberAdultPassword.mapIdx( memberAdultPasswordEntity.getMapIdx() );
        memberAdultPassword.member( toMember( memberAdultPasswordEntity.getMember() ) );
        memberAdultPassword.mapPassword( memberAdultPasswordEntity.getMapPassword() );

        return memberAdultPassword.build();
    }

    @Override
    public MemberOutCategory toMemberOutCategory(MemberOutCategoryEntity memberOutCategoryEntity) {
        if ( memberOutCategoryEntity == null ) {
            return null;
        }

        MemberOutCategory.MemberOutCategoryBuilder<?, ?> memberOutCategory = MemberOutCategory.builder();

        memberOutCategory.mocIdx( memberOutCategoryEntity.getMocIdx() );
        memberOutCategory.mocCategory( memberOutCategoryEntity.getMocCategory() );
        memberOutCategory.mocRequireInput( memberOutCategoryEntity.getMocRequireInput() );
        memberOutCategory.mocIsUse( memberOutCategoryEntity.getMocIsUse() );
        memberOutCategory.mocIsAdmin( memberOutCategoryEntity.getMocIsAdmin() );

        return memberOutCategory.build();
    }

    @Override
    public MemberOutEntity toMemberOutEntity(MemberOut memberOut) {
        if ( memberOut == null ) {
            return null;
        }

        MemberOutEntity.MemberOutEntityBuilder memberOutEntity = MemberOutEntity.builder();

        memberOutEntity.moIdx( memberOut.getMoIdx() );
        memberOutEntity.mbNo( memberOut.getMbNo() );
        memberOutEntity.moIsSelf( memberOut.getMoIsSelf() );
        memberOutEntity.memberOutCategory( memberOutCategoryToMemberOutCategoryEntity( memberOut.getMemberOutCategory() ) );
        memberOutEntity.moStorageTerminationDate( memberOut.getMoStorageTerminationDate() );
        memberOutEntity.moType( memberOut.getMoType() );
        memberOutEntity.moReason( memberOut.getMoReason() );

        return memberOutEntity.build();
    }

    @Override
    public MemberOutInfoEntity toMemberOutInfoEntity(MemberOutInfo memberOutInfo) {
        if ( memberOutInfo == null ) {
            return null;
        }

        MemberOutInfoEntity.MemberOutInfoEntityBuilder memberOutInfoEntity = MemberOutInfoEntity.builder();

        memberOutInfoEntity.moiIdx( memberOutInfo.getMoiIdx() );
        memberOutInfoEntity.mbNo( memberOutInfo.getMbNo() );
        memberOutInfoEntity.mbName( memberOutInfo.getMbName() );
        memberOutInfoEntity.mbNick( memberOutInfo.getMbNick() );
        memberOutInfoEntity.mbSex( memberOutInfo.getMbSex() );
        memberOutInfoEntity.mbHp( memberOutInfo.getMbHp() );
        memberOutInfoEntity.areaDefine( areaDefineToAreaDefineEntity( memberOutInfo.getAreaDefine() ) );
        memberOutInfoEntity.mbBirth( memberOutInfo.getMbBirth() );
        memberOutInfoEntity.mbEmail( memberOutInfo.getMbEmail() );
        memberOutInfoEntity.mbId( memberOutInfo.getMbId() );
        memberOutInfoEntity.mbAddr( memberOutInfo.getMbAddr() );
        memberOutInfoEntity.mbAddrDetail( memberOutInfo.getMbAddrDetail() );
        memberOutInfoEntity.mbZipCode( memberOutInfo.getMbZipCode() );
        memberOutInfoEntity.miRNum( memberOutInfo.getMiRNum() );

        return memberOutInfoEntity.build();
    }

    @Override
    public Member toMemberFromMemberInfoEntity(MemberInfoEntity memberInfoEntity) {
        if ( memberInfoEntity == null ) {
            return null;
        }

        Member.MemberBuilder<?, ?> member = Member.builder();

        member.createdAt( memberInfoEntityMemberCreatedAt( memberInfoEntity ) );
        member.updatedAt( memberInfoEntityMemberUpdatedAt( memberInfoEntity ) );
        member.mbNo( memberInfoEntityMemberMbNo( memberInfoEntity ) );
        member.mbIp( memberInfoEntityMemberMbIp( memberInfoEntity ) );
        member.mbId( memberInfoEntityMemberMbId( memberInfoEntity ) );
        member.mbPassword( memberInfoEntityMemberMbPassword( memberInfoEntity ) );
        member.mbPasswordUpdatedDate( memberInfoEntityMemberMbPasswordUpdatedDate( memberInfoEntity ) );
        member.mbUuid( memberInfoEntityMemberMbUuid( memberInfoEntity ) );
        member.mbName( memberInfoEntityMemberMbName( memberInfoEntity ) );
        member.mbHp( memberInfoEntityMemberMbHp( memberInfoEntity ) );
        member.group( groupEntityToGroup( memberInfoEntityMemberGroup( memberInfoEntity ) ) );
        member.mbLastLogin( memberInfoEntityMemberMbLastLogin( memberInfoEntity ) );
        member.mbIsUse( memberInfoEntityMemberMbIsUse( memberInfoEntity ) );
        member.mbJoinDate( memberInfoEntityMemberMbJoinDate( memberInfoEntity ) );
        member.mbStatus( memberInfoEntityMemberMbStatus( memberInfoEntity ) );
        member.mbCategory( memberInfoEntityMemberMbCategory( memberInfoEntity ) );
        member.mbIsVerify( memberInfoEntityMemberMbIsVerify( memberInfoEntity ) );
        member.deletedAt( memberInfoEntityMemberDeletedAt( memberInfoEntity ) );
        member.mbAnd( memberInfoEntityMemberMbAnd( memberInfoEntity ) );
        member.mbSmart( memberInfoEntityMemberMbSmart( memberInfoEntity ) );
        member.mbSmartStatus( memberInfoEntityMemberMbSmartStatus( memberInfoEntity ) );
        member.mbCertificationDate( memberInfoEntityMemberMbCertificationDate( memberInfoEntity ) );
        member.mbAdminNo( memberInfoEntityMemberMbAdminNo( memberInfoEntity ) );
        member.mbTelephone( memberInfoEntityMemberMbTelephone( memberInfoEntity ) );
        member.memberSuspensionCategory( toMemberSuspensionCategory( memberInfoEntityMemberMemberSuspensionCategory( memberInfoEntity ) ) );
        member.mbEnd( memberInfoEntityMemberMbEnd( memberInfoEntity ) );

        return member.build();
    }

    @Override
    public Member toMemberFromMemberAdminEntity(MemberAdminEntity memberAdmin) {
        if ( memberAdmin == null ) {
            return null;
        }

        Member.MemberBuilder<?, ?> member = Member.builder();

        member.createdAt( memberAdminMemberCreatedAt( memberAdmin ) );
        member.updatedAt( memberAdminMemberUpdatedAt( memberAdmin ) );
        member.mbNo( memberAdminMemberMbNo( memberAdmin ) );
        member.mbIp( memberAdminMemberMbIp( memberAdmin ) );
        member.mbId( memberAdminMemberMbId( memberAdmin ) );
        member.mbPassword( memberAdminMemberMbPassword( memberAdmin ) );
        member.mbPasswordUpdatedDate( memberAdminMemberMbPasswordUpdatedDate( memberAdmin ) );
        member.mbUuid( memberAdminMemberMbUuid( memberAdmin ) );
        member.mbName( memberAdminMemberMbName( memberAdmin ) );
        member.mbHp( memberAdminMemberMbHp( memberAdmin ) );
        member.group( groupEntityToGroup( memberAdminMemberGroup( memberAdmin ) ) );
        member.mbLastLogin( memberAdminMemberMbLastLogin( memberAdmin ) );
        member.mbIsUse( memberAdminMemberMbIsUse( memberAdmin ) );
        member.mbJoinDate( memberAdminMemberMbJoinDate( memberAdmin ) );
        member.mbStatus( memberAdminMemberMbStatus( memberAdmin ) );
        member.mbCategory( memberAdminMemberMbCategory( memberAdmin ) );
        member.mbIsVerify( memberAdminMemberMbIsVerify( memberAdmin ) );
        member.deletedAt( memberAdminMemberDeletedAt( memberAdmin ) );
        member.mbAnd( memberAdminMemberMbAnd( memberAdmin ) );
        member.mbSmart( memberAdminMemberMbSmart( memberAdmin ) );
        member.mbSmartStatus( memberAdminMemberMbSmartStatus( memberAdmin ) );
        member.mbCertificationDate( memberAdminMemberMbCertificationDate( memberAdmin ) );
        member.mbAdminNo( memberAdminMemberMbAdminNo( memberAdmin ) );
        member.mbTelephone( memberAdminMemberMbTelephone( memberAdmin ) );
        member.memberSuspensionCategory( toMemberSuspensionCategory( memberAdminMemberMemberSuspensionCategory( memberAdmin ) ) );
        member.mbEnd( memberAdminMemberMbEnd( memberAdmin ) );

        return member.build();
    }

    @Override
    public List<Member> toMemberFromMemberAdminEntity(List<MemberAdminEntity> byMemberMbNoIn) {
        if ( byMemberMbNoIn == null ) {
            return null;
        }

        List<Member> list = new ArrayList<Member>( byMemberMbNoIn.size() );
        for ( MemberAdminEntity memberAdminEntity : byMemberMbNoIn ) {
            list.add( toMemberFromMemberAdminEntity( memberAdminEntity ) );
        }

        return list;
    }

    @Override
    public MemberJwtTokenEntity toMemberJwtTokenEntity(MemberJwtToken memberJwtToken) {
        if ( memberJwtToken == null ) {
            return null;
        }

        MemberJwtTokenEntity.MemberJwtTokenEntityBuilder memberJwtTokenEntity = MemberJwtTokenEntity.builder();

        memberJwtTokenEntity.mjtIdx( memberJwtToken.getMjtIdx() );
        memberJwtTokenEntity.member( toMemberEntity( memberJwtToken.getMember() ) );
        memberJwtTokenEntity.mjtJwtToken( memberJwtToken.getMjtJwtToken() );
        memberJwtTokenEntity.mjtTypeEnum( memberJwtToken.getMjtTypeEnum() );

        return memberJwtTokenEntity.build();
    }

    @Override
    public MemberJwtToken toMemberJwtToken(MemberJwtTokenEntity memberJwtTokenEntity) {
        if ( memberJwtTokenEntity == null ) {
            return null;
        }

        MemberJwtToken.MemberJwtTokenBuilder<?, ?> memberJwtToken = MemberJwtToken.builder();

        memberJwtToken.createdAt( memberJwtTokenEntity.getCreatedAt() );
        memberJwtToken.updatedAt( memberJwtTokenEntity.getUpdatedAt() );
        memberJwtToken.mjtIdx( memberJwtTokenEntity.getMjtIdx() );
        memberJwtToken.member( toMember( memberJwtTokenEntity.getMember() ) );
        memberJwtToken.mjtJwtToken( memberJwtTokenEntity.getMjtJwtToken() );
        memberJwtToken.mjtTypeEnum( memberJwtTokenEntity.getMjtTypeEnum() );

        return memberJwtToken.build();
    }

    @Override
    public MemberByInterest toMemberByInterest(MemberByInterestEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MemberByInterest.MemberByInterestBuilder<?, ?> memberByInterest = MemberByInterest.builder();

        memberByInterest.createdAt( entity.getCreatedAt() );
        memberByInterest.updatedAt( entity.getUpdatedAt() );
        memberByInterest.mbiIdx( entity.getMbiIdx() );
        memberByInterest.member( toMember( entity.getMember() ) );
        memberByInterest.mediaCategory( mediaCategoryEntityToMediaCategory( entity.getMediaCategory() ) );

        return memberByInterest.build();
    }

    @Override
    public List<MemberByInterest> toMemberByInterestList(List<MemberByInterestEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<MemberByInterest> list1 = new ArrayList<MemberByInterest>( list.size() );
        for ( MemberByInterestEntity memberByInterestEntity : list ) {
            list1.add( toMemberByInterest( memberByInterestEntity ) );
        }

        return list1;
    }

    @Override
    public LoginLogEntity toLoginLogEntity(LoginLog loginLog) {
        if ( loginLog == null ) {
            return null;
        }

        LoginLogEntity.LoginLogEntityBuilder loginLogEntity = LoginLogEntity.builder();

        loginLogEntity.llIdx( loginLog.getLlIdx() );
        loginLogEntity.llType( loginLog.getLlType() );
        loginLogEntity.member( toMemberEntity( loginLog.getMember() ) );
        loginLogEntity.clientIp( loginLog.getClientIp() );
        loginLogEntity.llDate( loginLog.getLlDate() );

        return loginLogEntity.build();
    }

    @Override
    public LoginLog toLoginLog(LoginLogEntity save) {
        if ( save == null ) {
            return null;
        }

        LoginLog.LoginLogBuilder<?, ?> loginLog = LoginLog.builder();

        loginLog.createdAt( save.getCreatedAt() );
        loginLog.updatedAt( save.getUpdatedAt() );
        loginLog.llIdx( save.getLlIdx() );
        loginLog.llType( save.getLlType() );
        loginLog.member( toMember( save.getMember() ) );
        loginLog.clientIp( save.getClientIp() );
        loginLog.llDate( save.getLlDate() );

        return loginLog.build();
    }

    @Override
    public MemberLastAdvertiseEntity toMemberLastAdvertiseEntity(MemberLastAdvertise model) {
        if ( model == null ) {
            return null;
        }

        MemberLastAdvertiseEntity.MemberLastAdvertiseEntityBuilder memberLastAdvertiseEntity = MemberLastAdvertiseEntity.builder();

        memberLastAdvertiseEntity.mlaIdx( model.getMlaIdx() );
        memberLastAdvertiseEntity.member( toMemberEntity( model.getMember() ) );
        memberLastAdvertiseEntity.acdTypeEnum( model.getAcdTypeEnum() );
        memberLastAdvertiseEntity.acdSeq( model.getAcdSeq() );

        return memberLastAdvertiseEntity.build();
    }

    @Override
    public Qr toQr(QrEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Qr.QrBuilder<?, ?> qr = Qr.builder();

        qr.createdAt( entity.getCreatedAt() );
        qr.updatedAt( entity.getUpdatedAt() );
        qr.qrIdx( entity.getQrIdx() );
        qr.member( toMember( entity.getMember() ) );
        qr.qrCode( entity.getQrCode() );
        qr.qrAuth( entity.getQrAuth() );
        qr.qrExpired( entity.getQrExpired() );

        return qr.build();
    }

    @Override
    public QrEntity toQrEntity(Qr qr) {
        if ( qr == null ) {
            return null;
        }

        QrEntity.QrEntityBuilder<?, ?> qrEntity = QrEntity.builder();

        qrEntity.createdAt( qr.getCreatedAt() );
        qrEntity.updatedAt( qr.getUpdatedAt() );
        qrEntity.qrIdx( qr.getQrIdx() );
        qrEntity.member( toMemberEntity( qr.getMember() ) );
        qrEntity.qrCode( qr.getQrCode() );
        qrEntity.qrAuth( qr.getQrAuth() );
        qrEntity.qrExpired( qr.getQrExpired() );

        return qrEntity.build();
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
        soDefine.sdName( soDefineEntity.getSdName() );
        soDefine.sdOption( soDefineEntity.getSdOption() );
        soDefine.sdSi( soDefineEntity.getSdSi() );

        return soDefine.build();
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

    protected MemberToken memberTokenEntityToMemberToken(MemberTokenEntity memberTokenEntity) {
        if ( memberTokenEntity == null ) {
            return null;
        }

        MemberToken.MemberTokenBuilder<?, ?> memberToken = MemberToken.builder();

        memberToken.createdAt( memberTokenEntity.getCreatedAt() );
        memberToken.updatedAt( memberTokenEntity.getUpdatedAt() );
        memberToken.mtIdx( memberTokenEntity.getMtIdx() );
        memberToken.member( toMember( memberTokenEntity.getMember() ) );
        memberToken.mtDeviceToken( memberTokenEntity.getMtDeviceToken() );

        return memberToken.build();
    }

    protected MemberOutCategoryEntity memberOutCategoryToMemberOutCategoryEntity(MemberOutCategory memberOutCategory) {
        if ( memberOutCategory == null ) {
            return null;
        }

        MemberOutCategoryEntity.MemberOutCategoryEntityBuilder memberOutCategoryEntity = MemberOutCategoryEntity.builder();

        memberOutCategoryEntity.mocIdx( memberOutCategory.getMocIdx() );
        memberOutCategoryEntity.mocCategory( memberOutCategory.getMocCategory() );
        memberOutCategoryEntity.mocRequireInput( memberOutCategory.getMocRequireInput() );
        memberOutCategoryEntity.mocIsUse( memberOutCategory.getMocIsUse() );
        memberOutCategoryEntity.mocIsAdmin( memberOutCategory.getMocIsAdmin() );

        return memberOutCategoryEntity.build();
    }

    private LocalDateTime memberInfoEntityMemberCreatedAt(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getCreatedAt();
    }

    private LocalDateTime memberInfoEntityMemberUpdatedAt(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getUpdatedAt();
    }

    private Long memberInfoEntityMemberMbNo(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbNo();
    }

    private String memberInfoEntityMemberMbIp(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbIp();
    }

    private String memberInfoEntityMemberMbId(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbId();
    }

    private String memberInfoEntityMemberMbPassword(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbPassword();
    }

    private LocalDateTime memberInfoEntityMemberMbPasswordUpdatedDate(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbPasswordUpdatedDate();
    }

    private String memberInfoEntityMemberMbUuid(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbUuid();
    }

    private String memberInfoEntityMemberMbName(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbName();
    }

    private String memberInfoEntityMemberMbHp(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbHp();
    }

    private GroupEntity memberInfoEntityMemberGroup(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getGroup();
    }

    private LocalDateTime memberInfoEntityMemberMbLastLogin(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbLastLogin();
    }

    private Integer memberInfoEntityMemberMbIsUse(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbIsUse();
    }

    private LocalDateTime memberInfoEntityMemberMbJoinDate(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbJoinDate();
    }

    private Integer memberInfoEntityMemberMbStatus(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbStatus();
    }

    private Integer memberInfoEntityMemberMbCategory(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbCategory();
    }

    private Integer memberInfoEntityMemberMbIsVerify(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbIsVerify();
    }

    private LocalDateTime memberInfoEntityMemberDeletedAt(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getDeletedAt();
    }

    private Integer memberInfoEntityMemberMbAnd(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbAnd();
    }

    private Integer memberInfoEntityMemberMbSmart(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbSmart();
    }

    private Integer memberInfoEntityMemberMbSmartStatus(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbSmartStatus();
    }

    private LocalDate memberInfoEntityMemberMbCertificationDate(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbCertificationDate();
    }

    private Long memberInfoEntityMemberMbAdminNo(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbAdminNo();
    }

    private String memberInfoEntityMemberMbTelephone(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbTelephone();
    }

    private MemberSuspensionCategoryEntity memberInfoEntityMemberMemberSuspensionCategory(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMemberSuspensionCategory();
    }

    private Integer memberInfoEntityMemberMbEnd(MemberInfoEntity memberInfoEntity) {
        MemberEntity member = memberInfoEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbEnd();
    }

    private LocalDateTime memberAdminMemberCreatedAt(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getCreatedAt();
    }

    private LocalDateTime memberAdminMemberUpdatedAt(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getUpdatedAt();
    }

    private Long memberAdminMemberMbNo(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbNo();
    }

    private String memberAdminMemberMbIp(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbIp();
    }

    private String memberAdminMemberMbId(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbId();
    }

    private String memberAdminMemberMbPassword(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbPassword();
    }

    private LocalDateTime memberAdminMemberMbPasswordUpdatedDate(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbPasswordUpdatedDate();
    }

    private String memberAdminMemberMbUuid(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbUuid();
    }

    private String memberAdminMemberMbName(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbName();
    }

    private String memberAdminMemberMbHp(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbHp();
    }

    private GroupEntity memberAdminMemberGroup(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getGroup();
    }

    private LocalDateTime memberAdminMemberMbLastLogin(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbLastLogin();
    }

    private Integer memberAdminMemberMbIsUse(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbIsUse();
    }

    private LocalDateTime memberAdminMemberMbJoinDate(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbJoinDate();
    }

    private Integer memberAdminMemberMbStatus(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbStatus();
    }

    private Integer memberAdminMemberMbCategory(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbCategory();
    }

    private Integer memberAdminMemberMbIsVerify(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbIsVerify();
    }

    private LocalDateTime memberAdminMemberDeletedAt(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getDeletedAt();
    }

    private Integer memberAdminMemberMbAnd(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbAnd();
    }

    private Integer memberAdminMemberMbSmart(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbSmart();
    }

    private Integer memberAdminMemberMbSmartStatus(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbSmartStatus();
    }

    private LocalDate memberAdminMemberMbCertificationDate(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbCertificationDate();
    }

    private Long memberAdminMemberMbAdminNo(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbAdminNo();
    }

    private String memberAdminMemberMbTelephone(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbTelephone();
    }

    private MemberSuspensionCategoryEntity memberAdminMemberMemberSuspensionCategory(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMemberSuspensionCategory();
    }

    private Integer memberAdminMemberMbEnd(MemberAdminEntity memberAdminEntity) {
        MemberEntity member = memberAdminEntity.getMember();
        if ( member == null ) {
            return null;
        }
        return member.getMbEnd();
    }

    protected MediaCategory mediaCategoryEntityToMediaCategory(MediaCategoryEntity mediaCategoryEntity) {
        if ( mediaCategoryEntity == null ) {
            return null;
        }

        MediaCategory.MediaCategoryBuilder<?, ?> mediaCategory = MediaCategory.builder();

        mediaCategory.createdAt( mediaCategoryEntity.getCreatedAt() );
        mediaCategory.updatedAt( mediaCategoryEntity.getUpdatedAt() );
        mediaCategory.mcIdx( mediaCategoryEntity.getMcIdx() );
        mediaCategory.mcType( mediaCategoryEntity.getMcType() );
        mediaCategory.mcParent( mediaCategoryEntity.getMcParent() );
        mediaCategory.mcDepth( mediaCategoryEntity.getMcDepth() );
        mediaCategory.mcClass( mediaCategoryEntity.getMcClass() );
        mediaCategory.mcKind( mediaCategoryEntity.getMcKind() );
        mediaCategory.mcPackage( mediaCategoryEntity.getMcPackage() );
        mediaCategory.mcView( mediaCategoryEntity.getMcView() );
        mediaCategory.mcUrl( mediaCategoryEntity.getMcUrl() );
        mediaCategory.mcChannel( mediaCategoryEntity.getMcChannel() );
        mediaCategory.mcName( mediaCategoryEntity.getMcName() );
        mediaCategory.mcGenre( mediaCategoryEntity.getMcGenre() );
        mediaCategory.mcSeq( mediaCategoryEntity.getMcSeq() );
        mediaCategory.mcDashUrl( mediaCategoryEntity.getMcDashUrl() );
        mediaCategory.mcHlsUrl( mediaCategoryEntity.getMcHlsUrl() );
        mediaCategory.guid( mediaCategoryEntity.getGuid() );
        mediaCategory.mediaPackageId( mediaCategoryEntity.getMediaPackageId() );
        mediaCategory.mcStatus( mediaCategoryEntity.getMcStatus() );
        mediaCategory.mcLgPackage( mediaCategoryEntity.getMcLgPackage() );
        mediaCategory.mcTizenPackage( mediaCategoryEntity.getMcTizenPackage() );
        mediaCategory.mcGameUrl( mediaCategoryEntity.getMcGameUrl() );
        mediaCategory.mcIsGame( mediaCategoryEntity.getMcIsGame() );
        mediaCategory.aosDisplay( mediaCategoryEntity.getAosDisplay() );
        mediaCategory.smartDisplay( mediaCategoryEntity.getSmartDisplay() );
        mediaCategory.ottAppDisplay( mediaCategoryEntity.getOttAppDisplay() );
        mediaCategory.mcAosPackage( mediaCategoryEntity.getMcAosPackage() );
        mediaCategory.mcIosPackage( mediaCategoryEntity.getMcIosPackage() );
        mediaCategory.mcVideoType( mediaCategoryEntity.getMcVideoType() );
        mediaCategory.mcAttribute( mediaCategoryEntity.getMcAttribute() );

        return mediaCategory.build();
    }
}
