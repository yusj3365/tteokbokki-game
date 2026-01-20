package com.cmb.rainbowtv.domain.snsChannel.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.snsChannel.infra.data.entity.SnsChannelEntity;
import com.cmb.rainbowtv.domain.snsChannel.infra.data.entity.SnsChannelLinkEntity;
import com.cmb.rainbowtv.domain.snsChannel.infra.data.entity.SnsEnterEntity;
import com.cmb.rainbowtv.domain.snsChannel.infra.data.entity.SnsJoinEntity;
import com.cmb.rainbowtv.domain.snsChannel.model.SnsChannel;
import com.cmb.rainbowtv.domain.snsChannel.model.SnsChannelLink;
import com.cmb.rainbowtv.domain.snsChannel.model.SnsEnter;
import com.cmb.rainbowtv.domain.snsChannel.model.SnsJoin;
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
public class SnsStatisticsInfraMapperImpl implements SnsStatisticsInfraMapper {

    @Override
    public SnsJoinEntity toSnsJoinEntity(SnsJoin snsJoin) {
        if ( snsJoin == null ) {
            return null;
        }

        SnsJoinEntity.SnsJoinEntityBuilder snsJoinEntity = SnsJoinEntity.builder();

        snsJoinEntity.sjIdx( snsJoin.getSjIdx() );
        snsJoinEntity.snsChannelLink( snsChannelLinkToSnsChannelLinkEntity( snsJoin.getSnsChannelLink() ) );
        snsJoinEntity.sjDevice( snsJoin.getSjDevice() );
        snsJoinEntity.sjSo( snsJoin.getSjSo() );
        snsJoinEntity.sjBirth( snsJoin.getSjBirth() );
        snsJoinEntity.sjArea( snsJoin.getSjArea() );

        return snsJoinEntity.build();
    }

    @Override
    public SnsJoin toSnsJoin(SnsJoinEntity save) {
        if ( save == null ) {
            return null;
        }

        SnsJoin.SnsJoinBuilder<?, ?> snsJoin = SnsJoin.builder();

        snsJoin.createdAt( save.getCreatedAt() );
        snsJoin.updatedAt( save.getUpdatedAt() );
        snsJoin.sjIdx( save.getSjIdx() );
        snsJoin.snsChannelLink( snsChannelLinkEntityToSnsChannelLink( save.getSnsChannelLink() ) );
        snsJoin.sjDevice( save.getSjDevice() );
        snsJoin.sjSo( save.getSjSo() );
        snsJoin.sjBirth( save.getSjBirth() );
        snsJoin.sjArea( save.getSjArea() );

        return snsJoin.build();
    }

    @Override
    public SnsEnterEntity toSnsEnterEntity(SnsEnter snsEnter) {
        if ( snsEnter == null ) {
            return null;
        }

        SnsEnterEntity.SnsEnterEntityBuilder snsEnterEntity = SnsEnterEntity.builder();

        snsEnterEntity.seIdx( snsEnter.getSeIdx() );
        snsEnterEntity.snsChannelLink( snsChannelLinkToSnsChannelLinkEntity( snsEnter.getSnsChannelLink() ) );
        snsEnterEntity.seDevice( snsEnter.getSeDevice() );
        snsEnterEntity.seSo( snsEnter.getSeSo() );
        snsEnterEntity.seBirth( snsEnter.getSeBirth() );
        snsEnterEntity.seArea( snsEnter.getSeArea() );

        return snsEnterEntity.build();
    }

    @Override
    public SnsEnter toSnsEnter(SnsEnterEntity save) {
        if ( save == null ) {
            return null;
        }

        SnsEnter.SnsEnterBuilder<?, ?> snsEnter = SnsEnter.builder();

        snsEnter.createdAt( save.getCreatedAt() );
        snsEnter.updatedAt( save.getUpdatedAt() );
        snsEnter.seIdx( save.getSeIdx() );
        snsEnter.snsChannelLink( snsChannelLinkEntityToSnsChannelLink( save.getSnsChannelLink() ) );
        snsEnter.seDevice( save.getSeDevice() );
        snsEnter.seSo( save.getSeSo() );
        snsEnter.seBirth( save.getSeBirth() );
        snsEnter.seArea( save.getSeArea() );

        return snsEnter.build();
    }

    protected SnsChannelEntity snsChannelToSnsChannelEntity(SnsChannel snsChannel) {
        if ( snsChannel == null ) {
            return null;
        }

        SnsChannelEntity.SnsChannelEntityBuilder snsChannelEntity = SnsChannelEntity.builder();

        snsChannelEntity.scIdx( snsChannel.getScIdx() );
        snsChannelEntity.scName( snsChannel.getScName() );

        return snsChannelEntity.build();
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

    protected SnsChannelLinkEntity snsChannelLinkToSnsChannelLinkEntity(SnsChannelLink snsChannelLink) {
        if ( snsChannelLink == null ) {
            return null;
        }

        SnsChannelLinkEntity.SnsChannelLinkEntityBuilder snsChannelLinkEntity = SnsChannelLinkEntity.builder();

        snsChannelLinkEntity.sclIdx( snsChannelLink.getSclIdx() );
        snsChannelLinkEntity.snsChannel( snsChannelToSnsChannelEntity( snsChannelLink.getSnsChannel() ) );
        snsChannelLinkEntity.sclUrl( snsChannelLink.getSclUrl() );
        snsChannelLinkEntity.member( memberToMemberEntity( snsChannelLink.getMember() ) );

        return snsChannelLinkEntity.build();
    }

    protected SnsChannel snsChannelEntityToSnsChannel(SnsChannelEntity snsChannelEntity) {
        if ( snsChannelEntity == null ) {
            return null;
        }

        SnsChannel.SnsChannelBuilder<?, ?> snsChannel = SnsChannel.builder();

        snsChannel.createdAt( snsChannelEntity.getCreatedAt() );
        snsChannel.updatedAt( snsChannelEntity.getUpdatedAt() );
        snsChannel.scIdx( snsChannelEntity.getScIdx() );
        snsChannel.scName( snsChannelEntity.getScName() );

        return snsChannel.build();
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

    protected SnsChannelLink snsChannelLinkEntityToSnsChannelLink(SnsChannelLinkEntity snsChannelLinkEntity) {
        if ( snsChannelLinkEntity == null ) {
            return null;
        }

        SnsChannelLink.SnsChannelLinkBuilder<?, ?> snsChannelLink = SnsChannelLink.builder();

        snsChannelLink.createdAt( snsChannelLinkEntity.getCreatedAt() );
        snsChannelLink.updatedAt( snsChannelLinkEntity.getUpdatedAt() );
        snsChannelLink.sclIdx( snsChannelLinkEntity.getSclIdx() );
        snsChannelLink.snsChannel( snsChannelEntityToSnsChannel( snsChannelLinkEntity.getSnsChannel() ) );
        snsChannelLink.sclUrl( snsChannelLinkEntity.getSclUrl() );
        snsChannelLink.member( memberEntityToMember( snsChannelLinkEntity.getMember() ) );

        return snsChannelLink.build();
    }
}
