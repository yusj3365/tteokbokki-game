package com.cmb.rainbowtv.domain.serial.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.serial.infra.data.entity.SerialApplyEntity;
import com.cmb.rainbowtv.domain.serial.infra.data.entity.SerialEntity;
import com.cmb.rainbowtv.domain.serial.infra.data.entity.SerialMemberEntity;
import com.cmb.rainbowtv.domain.serial.infra.data.entity.SerialMemberHistoryEntity;
import com.cmb.rainbowtv.domain.serial.model.Serial;
import com.cmb.rainbowtv.domain.serial.model.SerialApply;
import com.cmb.rainbowtv.domain.serial.model.SerialMember;
import com.cmb.rainbowtv.domain.serial.model.SerialMemberHistory;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
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
public class SerialInfraMapperImpl implements SerialInfraMapper {

    @Override
    public List<SerialMemberEntity> toSerialMemberEntityList(List<SerialMember> serialMemberList) {
        if ( serialMemberList == null ) {
            return null;
        }

        List<SerialMemberEntity> list = new ArrayList<SerialMemberEntity>( serialMemberList.size() );
        for ( SerialMember serialMember : serialMemberList ) {
            list.add( toSerialMemberEntity( serialMember ) );
        }

        return list;
    }

    @Override
    public SerialMember toSerialMember(SerialMemberEntity serialMemberEntity) {
        if ( serialMemberEntity == null ) {
            return null;
        }

        SerialMember.SerialMemberBuilder<?, ?> serialMember = SerialMember.builder();

        serialMember.createdAt( serialMemberEntity.getCreatedAt() );
        serialMember.updatedAt( serialMemberEntity.getUpdatedAt() );
        serialMember.smIdx( serialMemberEntity.getSmIdx() );
        serialMember.member( memberEntityToMember( serialMemberEntity.getMember() ) );
        serialMember.serial( toSerial( serialMemberEntity.getSerial() ) );

        return serialMember.build();
    }

    @Override
    public SerialMemberHistory toSerialMemberHistory(SerialMemberHistoryEntity serialMemberHistoryEntity) {
        if ( serialMemberHistoryEntity == null ) {
            return null;
        }

        SerialMemberHistory.SerialMemberHistoryBuilder<?, ?> serialMemberHistory = SerialMemberHistory.builder();

        serialMemberHistory.createdAt( serialMemberHistoryEntity.getCreatedAt() );
        serialMemberHistory.updatedAt( serialMemberHistoryEntity.getUpdatedAt() );
        serialMemberHistory.smhIdx( serialMemberHistoryEntity.getSmhIdx() );
        serialMemberHistory.member( memberEntityToMember( serialMemberHistoryEntity.getMember() ) );
        serialMemberHistory.serial( toSerial( serialMemberHistoryEntity.getSerial() ) );
        serialMemberHistory.smhStatus( serialMemberHistoryEntity.getSmhStatus() );
        serialMemberHistory.smhConnect( serialMemberHistoryEntity.getSmhConnect() );
        serialMemberHistory.smhDisconnect( serialMemberHistoryEntity.getSmhDisconnect() );

        return serialMemberHistory.build();
    }

    @Override
    public SerialMemberHistoryEntity toSerialMemberHistoryEntity(SerialMemberHistory serialMemberHistory) {
        if ( serialMemberHistory == null ) {
            return null;
        }

        SerialMemberHistoryEntity.SerialMemberHistoryEntityBuilder serialMemberHistoryEntity = SerialMemberHistoryEntity.builder();

        serialMemberHistoryEntity.smhIdx( serialMemberHistory.getSmhIdx() );
        serialMemberHistoryEntity.member( memberToMemberEntity( serialMemberHistory.getMember() ) );
        serialMemberHistoryEntity.serial( toSerialEntity( serialMemberHistory.getSerial() ) );
        serialMemberHistoryEntity.smhStatus( serialMemberHistory.getSmhStatus() );
        serialMemberHistoryEntity.smhConnect( serialMemberHistory.getSmhConnect() );
        serialMemberHistoryEntity.smhDisconnect( serialMemberHistory.getSmhDisconnect() );

        return serialMemberHistoryEntity.build();
    }

    @Override
    public Serial toSerial(SerialEntity serialEntity) {
        if ( serialEntity == null ) {
            return null;
        }

        Serial.SerialBuilder<?, ?> serial = Serial.builder();

        serial.createdAt( serialEntity.getCreatedAt() );
        serial.updatedAt( serialEntity.getUpdatedAt() );
        serial.seIdx( serialEntity.getSeIdx() );
        serial.seNumber( serialEntity.getSeNumber() );
        serial.seStatus( serialEntity.getSeStatus() );
        serial.seUse( serialEntity.getSeUse() );
        serial.seUsid( serialEntity.getSeUsid() );
        serial.seTurnStatus( serialEntity.getSeTurnStatus() );

        return serial.build();
    }

    @Override
    public SerialEntity toSerialEntity(Serial serial) {
        if ( serial == null ) {
            return null;
        }

        SerialEntity.SerialEntityBuilder serialEntity = SerialEntity.builder();

        serialEntity.seIdx( serial.getSeIdx() );
        serialEntity.seNumber( serial.getSeNumber() );
        serialEntity.seStatus( serial.getSeStatus() );
        serialEntity.seUse( serial.getSeUse() );
        serialEntity.seUsid( serial.getSeUsid() );
        serialEntity.seTurnStatus( serial.getSeTurnStatus() );

        return serialEntity.build();
    }

    @Override
    public SerialMemberEntity toSerialMemberEntity(SerialMember newSerialMemberModel) {
        if ( newSerialMemberModel == null ) {
            return null;
        }

        SerialMemberEntity.SerialMemberEntityBuilder serialMemberEntity = SerialMemberEntity.builder();

        serialMemberEntity.smIdx( newSerialMemberModel.getSmIdx() );
        serialMemberEntity.member( memberToMemberEntity( newSerialMemberModel.getMember() ) );
        serialMemberEntity.serial( toSerialEntity( newSerialMemberModel.getSerial() ) );

        return serialMemberEntity.build();
    }

    @Override
    public List<Serial> toSerialModelList(List<SerialEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<Serial> list = new ArrayList<Serial>( allById.size() );
        for ( SerialEntity serialEntity : allById ) {
            list.add( toSerial( serialEntity ) );
        }

        return list;
    }

    @Override
    public SerialApply toSerialApplyModel(SerialApplyEntity byId) {
        if ( byId == null ) {
            return null;
        }

        SerialApply.SerialApplyBuilder<?, ?> serialApply = SerialApply.builder();

        serialApply.createdAt( byId.getCreatedAt() );
        serialApply.updatedAt( byId.getUpdatedAt() );
        serialApply.saIdx( byId.getSaIdx() );
        serialApply.member( byId.getMember() );
        serialApply.saName( byId.getSaName() );
        serialApply.saHp( byId.getSaHp() );
        serialApply.saZipcode( byId.getSaZipcode() );
        serialApply.saAddr( byId.getSaAddr() );
        serialApply.saAddrDetail( byId.getSaAddrDetail() );
        serialApply.saStatus( byId.getSaStatus() );

        return serialApply.build();
    }

    @Override
    public SerialApplyEntity toSerialApplyEntity(SerialApply serialApplyModel) {
        if ( serialApplyModel == null ) {
            return null;
        }

        SerialApplyEntity.SerialApplyEntityBuilder serialApplyEntity = SerialApplyEntity.builder();

        serialApplyEntity.saIdx( serialApplyModel.getSaIdx() );
        serialApplyEntity.member( serialApplyModel.getMember() );
        serialApplyEntity.saName( serialApplyModel.getSaName() );
        serialApplyEntity.saHp( serialApplyModel.getSaHp() );
        serialApplyEntity.saZipcode( serialApplyModel.getSaZipcode() );
        serialApplyEntity.saAddr( serialApplyModel.getSaAddr() );
        serialApplyEntity.saAddrDetail( serialApplyModel.getSaAddrDetail() );
        serialApplyEntity.saStatus( serialApplyModel.getSaStatus() );

        return serialApplyEntity.build();
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
