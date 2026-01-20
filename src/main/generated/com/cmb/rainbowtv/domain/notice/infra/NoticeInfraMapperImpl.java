package com.cmb.rainbowtv.domain.notice.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.notice.infra.data.entity.NoticeEntity;
import com.cmb.rainbowtv.domain.notice.model.PostNotice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:45+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class NoticeInfraMapperImpl implements NoticeInfraMapper {

    @Override
    public NoticeEntity toPostNoticeEntity(PostNotice postNotice) {
        if ( postNotice == null ) {
            return null;
        }

        NoticeEntity.NoticeEntityBuilder noticeEntity = NoticeEntity.builder();

        noticeEntity.wrId( postNotice.getWrId() );
        noticeEntity.member( memberToMemberEntity( postNotice.getMember() ) );
        noticeEntity.wrType( postNotice.getWrType() );
        noticeEntity.wrParent( postNotice.getWrParent() );
        noticeEntity.wrSubject( postNotice.getWrSubject() );
        noticeEntity.wrContent( postNotice.getWrContent() );
        noticeEntity.wrHit( postNotice.getWrHit() );
        noticeEntity.wrIsBlind( postNotice.getWrIsBlind() );
        noticeEntity.wrUse( postNotice.getWrUse() );
        noticeEntity.wrDatetime( postNotice.getWrDatetime() );
        noticeEntity.wrSeq( postNotice.getWrSeq() );
        noticeEntity.wrCommentCnt( postNotice.getWrCommentCnt() );
        noticeEntity.wrDisplay( postNotice.getWrDisplay() );
        noticeEntity.wrSeparate( postNotice.getWrSeparate() );

        return noticeEntity.build();
    }

    @Override
    public PostNotice toPostNotice(NoticeEntity noticeEntity) {
        if ( noticeEntity == null ) {
            return null;
        }

        PostNotice.PostNoticeBuilder<?, ?> postNotice = PostNotice.builder();

        postNotice.createdAt( noticeEntity.getCreatedAt() );
        postNotice.updatedAt( noticeEntity.getUpdatedAt() );
        postNotice.wrId( noticeEntity.getWrId() );
        postNotice.member( memberEntityToMember( noticeEntity.getMember() ) );
        postNotice.wrType( noticeEntity.getWrType() );
        postNotice.wrParent( noticeEntity.getWrParent() );
        postNotice.wrSubject( noticeEntity.getWrSubject() );
        postNotice.wrContent( noticeEntity.getWrContent() );
        postNotice.wrHit( noticeEntity.getWrHit() );
        postNotice.wrIsBlind( noticeEntity.getWrIsBlind() );
        postNotice.wrUse( noticeEntity.getWrUse() );
        postNotice.wrDatetime( noticeEntity.getWrDatetime() );
        postNotice.wrSeq( noticeEntity.getWrSeq() );
        postNotice.wrCommentCnt( noticeEntity.getWrCommentCnt() );
        postNotice.wrDisplay( noticeEntity.getWrDisplay() );
        postNotice.wrSeparate( noticeEntity.getWrSeparate() );

        return postNotice.build();
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
