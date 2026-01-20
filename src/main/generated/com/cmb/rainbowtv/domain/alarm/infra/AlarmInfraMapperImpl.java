package com.cmb.rainbowtv.domain.alarm.infra;

import com.cmb.rainbowtv.domain.alarm.infra.data.entity.AdminAlarmHistoryEntity;
import com.cmb.rainbowtv.domain.alarm.infra.data.entity.AlarmHistoryEntity;
import com.cmb.rainbowtv.domain.alarm.infra.data.entity.AlarmSettingEntity;
import com.cmb.rainbowtv.domain.alarm.model.AdminAlarmHistory;
import com.cmb.rainbowtv.domain.alarm.model.AlarmHistory;
import com.cmb.rainbowtv.domain.alarm.model.AlarmSetting;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
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
public class AlarmInfraMapperImpl implements AlarmInfraMapper {

    @Override
    public List<AlarmHistoryEntity> toAlarmHistoryEntityList(List<AlarmHistory> alarmHistories) {
        if ( alarmHistories == null ) {
            return null;
        }

        List<AlarmHistoryEntity> list = new ArrayList<AlarmHistoryEntity>( alarmHistories.size() );
        for ( AlarmHistory alarmHistory : alarmHistories ) {
            list.add( toAlarmHistoryEntity( alarmHistory ) );
        }

        return list;
    }

    @Override
    public AlarmSetting toAlarmSetting(AlarmSettingEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AlarmSetting.AlarmSettingBuilder<?, ?> alarmSetting = AlarmSetting.builder();

        alarmSetting.createdAt( entity.getCreatedAt() );
        alarmSetting.updatedAt( entity.getUpdatedAt() );
        alarmSetting.asIdx( entity.getAsIdx() );
        alarmSetting.asType( entity.getAsType() );
        alarmSetting.asRun( entity.getAsRun() );
        alarmSetting.asTime( entity.getAsTime() );

        return alarmSetting.build();
    }

    @Override
    public AlarmSettingEntity toAlarmSettingEntity(AlarmSetting alarmSetting) {
        if ( alarmSetting == null ) {
            return null;
        }

        AlarmSettingEntity.AlarmSettingEntityBuilder alarmSettingEntity = AlarmSettingEntity.builder();

        alarmSettingEntity.asIdx( alarmSetting.getAsIdx() );
        alarmSettingEntity.asType( alarmSetting.getAsType() );
        alarmSettingEntity.asRun( alarmSetting.getAsRun() );
        alarmSettingEntity.asTime( alarmSetting.getAsTime() );

        return alarmSettingEntity.build();
    }

    @Override
    public AdminAlarmHistoryEntity toAdminAlarmHistoryEntity(AdminAlarmHistory adminAlarmHistory) {
        if ( adminAlarmHistory == null ) {
            return null;
        }

        AdminAlarmHistoryEntity.AdminAlarmHistoryEntityBuilder adminAlarmHistoryEntity = AdminAlarmHistoryEntity.builder();

        adminAlarmHistoryEntity.aahIdx( adminAlarmHistory.getAahIdx() );
        adminAlarmHistoryEntity.aahPush( adminAlarmHistory.getAahPush() );
        adminAlarmHistoryEntity.aahTitle( adminAlarmHistory.getAahTitle() );
        adminAlarmHistoryEntity.aahContent( adminAlarmHistory.getAahContent() );
        adminAlarmHistoryEntity.member( memberToMemberEntity( adminAlarmHistory.getMember() ) );
        adminAlarmHistoryEntity.aahType( adminAlarmHistory.getAahType() );
        adminAlarmHistoryEntity.aahKey( adminAlarmHistory.getAahKey() );
        adminAlarmHistoryEntity.aahUse( adminAlarmHistory.getAahUse() );

        return adminAlarmHistoryEntity.build();
    }

    @Override
    public AdminAlarmHistory toAdminAlarmHistory(AdminAlarmHistoryEntity save) {
        if ( save == null ) {
            return null;
        }

        AdminAlarmHistory.AdminAlarmHistoryBuilder<?, ?> adminAlarmHistory = AdminAlarmHistory.builder();

        adminAlarmHistory.createdAt( save.getCreatedAt() );
        adminAlarmHistory.updatedAt( save.getUpdatedAt() );
        adminAlarmHistory.aahIdx( save.getAahIdx() );
        adminAlarmHistory.aahPush( save.getAahPush() );
        adminAlarmHistory.aahTitle( save.getAahTitle() );
        adminAlarmHistory.aahContent( save.getAahContent() );
        adminAlarmHistory.member( memberEntityToMember( save.getMember() ) );
        adminAlarmHistory.aahType( save.getAahType() );
        adminAlarmHistory.aahKey( save.getAahKey() );
        adminAlarmHistory.aahUse( save.getAahUse() );

        return adminAlarmHistory.build();
    }

    @Override
    public AlarmHistory toAlarmHistory(AlarmHistoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AlarmHistory.AlarmHistoryBuilder<?, ?> alarmHistory = AlarmHistory.builder();

        alarmHistory.createdAt( entity.getCreatedAt() );
        alarmHistory.updatedAt( entity.getUpdatedAt() );
        alarmHistory.ahIdx( entity.getAhIdx() );
        alarmHistory.ahCode( entity.getAhCode() );
        alarmHistory.member( memberEntityToMember( entity.getMember() ) );
        alarmHistory.ahTitle( entity.getAhTitle() );
        alarmHistory.ahContent( entity.getAhContent() );
        alarmHistory.ahMethod( entity.getAhMethod() );
        alarmHistory.ahKey( entity.getAhKey() );
        alarmHistory.ahIsRead( entity.getAhIsRead() );
        alarmHistory.ahType( entity.getAhType() );
        alarmHistory.ahImageType( entity.getAhImageType() );
        alarmHistory.ahUrl( entity.getAhUrl() );

        return alarmHistory.build();
    }

    @Override
    public AlarmHistoryEntity toAlarmHistoryEntity(AlarmHistory model) {
        if ( model == null ) {
            return null;
        }

        AlarmHistoryEntity.AlarmHistoryEntityBuilder alarmHistoryEntity = AlarmHistoryEntity.builder();

        alarmHistoryEntity.ahIdx( model.getAhIdx() );
        alarmHistoryEntity.ahCode( model.getAhCode() );
        alarmHistoryEntity.member( memberToMemberEntity( model.getMember() ) );
        alarmHistoryEntity.ahTitle( model.getAhTitle() );
        alarmHistoryEntity.ahContent( model.getAhContent() );
        alarmHistoryEntity.ahMethod( model.getAhMethod() );
        alarmHistoryEntity.ahKey( model.getAhKey() );
        alarmHistoryEntity.ahIsRead( model.getAhIsRead() );
        alarmHistoryEntity.ahType( model.getAhType() );
        alarmHistoryEntity.ahImageType( model.getAhImageType() );
        alarmHistoryEntity.ahUrl( model.getAhUrl() );

        return alarmHistoryEntity.build();
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
}
