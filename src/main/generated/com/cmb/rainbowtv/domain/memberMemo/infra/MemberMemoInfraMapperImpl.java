package com.cmb.rainbowtv.domain.memberMemo.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.memberMemo.infra.data.entity.MemoWriterEntity;
import com.cmb.rainbowtv.domain.memberMemo.infra.data.entity.WriteMemoEntity;
import com.cmb.rainbowtv.domain.memberMemo.model.MemoWriter;
import com.cmb.rainbowtv.domain.memberMemo.model.WriteMemo;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:48+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class MemberMemoInfraMapperImpl implements MemberMemoInfraMapper {

    @Override
    public WriteMemoEntity toWriteMemoEntity(WriteMemo writeMemo) {
        if ( writeMemo == null ) {
            return null;
        }

        WriteMemoEntity.WriteMemoEntityBuilder writeMemoEntity = WriteMemoEntity.builder();

        writeMemoEntity.wrId( writeMemo.getWrId() );
        writeMemoEntity.member( memberToMemberEntity( writeMemo.getMember() ) );
        writeMemoEntity.wrType( writeMemo.getWrType() );
        writeMemoEntity.wrParent( writeMemo.getWrParent() );
        writeMemoEntity.wrSubject( writeMemo.getWrSubject() );
        writeMemoEntity.wrContent( writeMemo.getWrContent() );
        writeMemoEntity.wrHit( writeMemo.getWrHit() );
        writeMemoEntity.wrIsBlind( writeMemo.getWrIsBlind() );
        writeMemoEntity.wrUse( writeMemo.getWrUse() );
        writeMemoEntity.wrDatetime( writeMemo.getWrDatetime() );
        writeMemoEntity.wrSeq( writeMemo.getWrSeq() );
        writeMemoEntity.wrCommentCnt( writeMemo.getWrCommentCnt() );
        writeMemoEntity.wrDisplay( writeMemo.getWrDisplay() );
        writeMemoEntity.wrSeparate( writeMemo.getWrSeparate() );

        return writeMemoEntity.build();
    }

    @Override
    public WriteMemo toWriteMemo(WriteMemoEntity writeMemoEntity) {
        if ( writeMemoEntity == null ) {
            return null;
        }

        WriteMemo.WriteMemoBuilder<?, ?> writeMemo = WriteMemo.builder();

        writeMemo.createdAt( writeMemoEntity.getCreatedAt() );
        writeMemo.updatedAt( writeMemoEntity.getUpdatedAt() );
        writeMemo.wrId( writeMemoEntity.getWrId() );
        writeMemo.member( memberEntityToMember( writeMemoEntity.getMember() ) );
        writeMemo.wrType( writeMemoEntity.getWrType() );
        writeMemo.wrParent( writeMemoEntity.getWrParent() );
        writeMemo.wrSubject( writeMemoEntity.getWrSubject() );
        writeMemo.wrContent( writeMemoEntity.getWrContent() );
        writeMemo.wrHit( writeMemoEntity.getWrHit() );
        writeMemo.wrIsBlind( writeMemoEntity.getWrIsBlind() );
        writeMemo.wrUse( writeMemoEntity.getWrUse() );
        writeMemo.wrDatetime( writeMemoEntity.getWrDatetime() );
        writeMemo.wrSeq( writeMemoEntity.getWrSeq() );
        writeMemo.wrCommentCnt( writeMemoEntity.getWrCommentCnt() );
        writeMemo.wrDisplay( writeMemoEntity.getWrDisplay() );
        writeMemo.wrSeparate( writeMemoEntity.getWrSeparate() );

        return writeMemo.build();
    }

    @Override
    public MemoWriterEntity toMemoWriterEntity(MemoWriter memoWriter) {
        if ( memoWriter == null ) {
            return null;
        }

        MemoWriterEntity.MemoWriterEntityBuilder memoWriterEntity = MemoWriterEntity.builder();

        memoWriterEntity.mwIdx( memoWriter.getMwIdx() );
        memoWriterEntity.writeMemo( toWriteMemoEntity( memoWriter.getWriteMemo() ) );
        memoWriterEntity.member( memberToMemberEntity( memoWriter.getMember() ) );
        memoWriterEntity.mbName( memoWriter.getMbName() );

        return memoWriterEntity.build();
    }

    @Override
    public MemoWriter toMemoWriter(MemoWriterEntity memoWriterEntity) {
        if ( memoWriterEntity == null ) {
            return null;
        }

        MemoWriter.MemoWriterBuilder<?, ?> memoWriter = MemoWriter.builder();

        memoWriter.createdAt( memoWriterEntity.getCreatedAt() );
        memoWriter.updatedAt( memoWriterEntity.getUpdatedAt() );
        memoWriter.mwIdx( memoWriterEntity.getMwIdx() );
        memoWriter.writeMemo( toWriteMemo( memoWriterEntity.getWriteMemo() ) );
        memoWriter.member( memberEntityToMember( memoWriterEntity.getMember() ) );
        memoWriter.mbName( memoWriterEntity.getMbName() );

        return memoWriter.build();
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
