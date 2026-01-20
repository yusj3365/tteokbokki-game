package com.cmb.rainbowtv.domain.qna.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.notice.model.enums.WriteTypeEnum;
import com.cmb.rainbowtv.domain.qna.infra.data.entity.QnaAnswerWriterEntity;
import com.cmb.rainbowtv.domain.qna.infra.data.entity.QnaEntity;
import com.cmb.rainbowtv.domain.qna.model.AnswerQna;
import com.cmb.rainbowtv.domain.qna.model.AnswerQnaWriter;
import com.cmb.rainbowtv.domain.qna.model.QuestionQna;
import com.cmb.rainbowtv.domain.qna.model.UserQna;
import com.cmb.rainbowtv.domain.qna.model.enums.WrSeparateEnum;
import com.cmb.rainbowtv.global.define.boardCategory.infra.data.entity.BoardCategoryDefineEntity;
import com.cmb.rainbowtv.global.define.boardCategory.model.BoardCategoryDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:47+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class QnaInfraMapperImpl implements QnaInfraMapper {

    @Override
    public QnaEntity toQnaAnswerEntity(AnswerQna answerQna) {
        if ( answerQna == null ) {
            return null;
        }

        QnaEntity.QnaEntityBuilder<?, ?> qnaEntity = QnaEntity.builder();

        qnaEntity.createdAt( answerQna.getCreatedAt() );
        qnaEntity.updatedAt( answerQna.getUpdatedAt() );
        qnaEntity.wrId( answerQna.getWrId() );
        qnaEntity.member( memberToMemberEntity( answerQna.getMember() ) );
        qnaEntity.wrType( writeTypeEnumToWriteTypeEnum( answerQna.getWrType() ) );
        qnaEntity.wrSeparate( wrSeparateEnumToWrSeparateEnum( answerQna.getWrSeparate() ) );
        qnaEntity.wrParent( answerQna.getWrParent() );
        qnaEntity.wrSubject( answerQna.getWrSubject() );
        qnaEntity.wrContent( answerQna.getWrContent() );
        qnaEntity.wrUse( answerQna.getWrUse() );

        return qnaEntity.build();
    }

    @Override
    public QnaAnswerWriterEntity toQnaAnswerWriterEntity(AnswerQnaWriter answerQnaWriter) {
        if ( answerQnaWriter == null ) {
            return null;
        }

        QnaAnswerWriterEntity.QnaAnswerWriterEntityBuilder<?, ?> qnaAnswerWriterEntity = QnaAnswerWriterEntity.builder();

        qnaAnswerWriterEntity.createdAt( answerQnaWriter.getCreatedAt() );
        qnaAnswerWriterEntity.updatedAt( answerQnaWriter.getUpdatedAt() );
        qnaAnswerWriterEntity.qwIdx( answerQnaWriter.getQwIdx() );
        qnaAnswerWriterEntity.qna( questionQnaToQnaEntity( answerQnaWriter.getQna() ) );
        qnaAnswerWriterEntity.member( memberToMemberEntity( answerQnaWriter.getMember() ) );
        qnaAnswerWriterEntity.mbName( answerQnaWriter.getMbName() );

        return qnaAnswerWriterEntity.build();
    }

    @Override
    public AnswerQna toAnswerQna(QnaEntity qnaEntity) {
        if ( qnaEntity == null ) {
            return null;
        }

        AnswerQna.AnswerQnaBuilder<?, ?> answerQna = AnswerQna.builder();

        answerQna.createdAt( qnaEntity.getCreatedAt() );
        answerQna.updatedAt( qnaEntity.getUpdatedAt() );
        answerQna.wrId( qnaEntity.getWrId() );
        answerQna.member( memberEntityToMember( qnaEntity.getMember() ) );
        answerQna.wrType( writeTypeEnumToWriteTypeEnum1( qnaEntity.getWrType() ) );
        answerQna.wrParent( qnaEntity.getWrParent() );
        answerQna.wrSubject( qnaEntity.getWrSubject() );
        answerQna.wrContent( qnaEntity.getWrContent() );
        answerQna.wrUse( qnaEntity.getWrUse() );
        answerQna.wrSeparate( wrSeparateEnumToWrSeparateEnum1( qnaEntity.getWrSeparate() ) );

        return answerQna.build();
    }

    @Override
    public QuestionQna toQuestionQna(QnaEntity qnaEntity) {
        if ( qnaEntity == null ) {
            return null;
        }

        QuestionQna.QuestionQnaBuilder<?, ?> questionQna = QuestionQna.builder();

        questionQna.createdAt( qnaEntity.getCreatedAt() );
        questionQna.updatedAt( qnaEntity.getUpdatedAt() );
        questionQna.wrId( qnaEntity.getWrId() );
        questionQna.member( memberEntityToMember( qnaEntity.getMember() ) );
        questionQna.wrType( writeTypeEnumToWriteTypeEnum1( qnaEntity.getWrType() ) );
        questionQna.wrParent( qnaEntity.getWrParent() );
        questionQna.wrSubject( qnaEntity.getWrSubject() );
        questionQna.wrContent( qnaEntity.getWrContent() );
        questionQna.wrUse( qnaEntity.getWrUse() );
        questionQna.wrSeparate( wrSeparateEnumToWrSeparateEnum1( qnaEntity.getWrSeparate() ) );

        return questionQna.build();
    }

    @Override
    public QnaEntity toQuestionEntity(QuestionQna question) {
        if ( question == null ) {
            return null;
        }

        QnaEntity.QnaEntityBuilder<?, ?> qnaEntity = QnaEntity.builder();

        qnaEntity.createdAt( question.getCreatedAt() );
        qnaEntity.updatedAt( question.getUpdatedAt() );
        qnaEntity.wrId( question.getWrId() );
        qnaEntity.member( memberToMemberEntity( question.getMember() ) );
        qnaEntity.wrType( writeTypeEnumToWriteTypeEnum( question.getWrType() ) );
        qnaEntity.wrSeparate( wrSeparateEnumToWrSeparateEnum( question.getWrSeparate() ) );
        qnaEntity.wrParent( question.getWrParent() );
        qnaEntity.wrSubject( question.getWrSubject() );
        qnaEntity.wrContent( question.getWrContent() );
        qnaEntity.wrUse( question.getWrUse() );

        return qnaEntity.build();
    }

    @Override
    public QnaEntity toUserQnaEntity(UserQna userQna) {
        if ( userQna == null ) {
            return null;
        }

        QnaEntity.QnaEntityBuilder<?, ?> qnaEntity = QnaEntity.builder();

        qnaEntity.createdAt( userQna.getCreatedAt() );
        qnaEntity.updatedAt( userQna.getUpdatedAt() );
        qnaEntity.wrId( userQna.getWrId() );
        qnaEntity.member( memberToMemberEntity( userQna.getMember() ) );
        qnaEntity.wrType( userQna.getWrType() );
        qnaEntity.wrSeparate( userQna.getWrSeparate() );
        qnaEntity.wrParent( userQna.getWrParent() );
        qnaEntity.wrSubject( userQna.getWrSubject() );
        qnaEntity.wrContent( userQna.getWrContent() );
        qnaEntity.boardCategoryDefine( boardCategoryDefineToBoardCategoryDefineEntity( userQna.getBoardCategoryDefine() ) );
        qnaEntity.wrUse( userQna.getWrUse() );

        return qnaEntity.build();
    }

    @Override
    public UserQna toUserQna(QnaEntity qnaEntity) {
        if ( qnaEntity == null ) {
            return null;
        }

        UserQna.UserQnaBuilder<?, ?> userQna = UserQna.builder();

        userQna.createdAt( qnaEntity.getCreatedAt() );
        userQna.updatedAt( qnaEntity.getUpdatedAt() );
        userQna.wrId( qnaEntity.getWrId() );
        userQna.member( memberEntityToMember( qnaEntity.getMember() ) );
        userQna.wrType( qnaEntity.getWrType() );
        userQna.wrParent( qnaEntity.getWrParent() );
        userQna.wrSubject( qnaEntity.getWrSubject() );
        userQna.wrContent( qnaEntity.getWrContent() );
        userQna.wrUse( qnaEntity.getWrUse() );
        userQna.wrSeparate( qnaEntity.getWrSeparate() );
        userQna.boardCategoryDefine( boardCategoryDefineEntityToBoardCategoryDefine( qnaEntity.getBoardCategoryDefine() ) );

        return userQna.build();
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

    protected com.cmb.rainbowtv.domain.qna.model.enums.WriteTypeEnum writeTypeEnumToWriteTypeEnum(WriteTypeEnum writeTypeEnum) {
        if ( writeTypeEnum == null ) {
            return null;
        }

        com.cmb.rainbowtv.domain.qna.model.enums.WriteTypeEnum writeTypeEnum1;

        switch ( writeTypeEnum ) {
            case POST: writeTypeEnum1 = com.cmb.rainbowtv.domain.qna.model.enums.WriteTypeEnum.POST;
            break;
            case COMMENT: writeTypeEnum1 = com.cmb.rainbowtv.domain.qna.model.enums.WriteTypeEnum.COMMENT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + writeTypeEnum );
        }

        return writeTypeEnum1;
    }

    protected WrSeparateEnum wrSeparateEnumToWrSeparateEnum(com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum wrSeparateEnum) {
        if ( wrSeparateEnum == null ) {
            return null;
        }

        WrSeparateEnum wrSeparateEnum1;

        switch ( wrSeparateEnum ) {
            case CRM: wrSeparateEnum1 = WrSeparateEnum.CRM;
            break;
            case CMS: wrSeparateEnum1 = WrSeparateEnum.CMS;
            break;
            case COMMON: wrSeparateEnum1 = WrSeparateEnum.COMMON;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + wrSeparateEnum );
        }

        return wrSeparateEnum1;
    }

    protected MemberEntity memberToMemberEntity1(Member member) {
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

    protected QnaEntity questionQnaToQnaEntity(QuestionQna questionQna) {
        if ( questionQna == null ) {
            return null;
        }

        QnaEntity.QnaEntityBuilder<?, ?> qnaEntity = QnaEntity.builder();

        qnaEntity.createdAt( questionQna.getCreatedAt() );
        qnaEntity.updatedAt( questionQna.getUpdatedAt() );
        qnaEntity.wrId( questionQna.getWrId() );
        qnaEntity.member( memberToMemberEntity1( questionQna.getMember() ) );
        qnaEntity.wrType( writeTypeEnumToWriteTypeEnum( questionQna.getWrType() ) );
        qnaEntity.wrSeparate( wrSeparateEnumToWrSeparateEnum( questionQna.getWrSeparate() ) );
        qnaEntity.wrParent( questionQna.getWrParent() );
        qnaEntity.wrSubject( questionQna.getWrSubject() );
        qnaEntity.wrContent( questionQna.getWrContent() );
        qnaEntity.wrUse( questionQna.getWrUse() );

        return qnaEntity.build();
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

    protected WriteTypeEnum writeTypeEnumToWriteTypeEnum1(com.cmb.rainbowtv.domain.qna.model.enums.WriteTypeEnum writeTypeEnum) {
        if ( writeTypeEnum == null ) {
            return null;
        }

        WriteTypeEnum writeTypeEnum1;

        switch ( writeTypeEnum ) {
            case POST: writeTypeEnum1 = WriteTypeEnum.POST;
            break;
            case COMMENT: writeTypeEnum1 = WriteTypeEnum.COMMENT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + writeTypeEnum );
        }

        return writeTypeEnum1;
    }

    protected com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum wrSeparateEnumToWrSeparateEnum1(WrSeparateEnum wrSeparateEnum) {
        if ( wrSeparateEnum == null ) {
            return null;
        }

        com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum wrSeparateEnum1;

        switch ( wrSeparateEnum ) {
            case CRM: wrSeparateEnum1 = com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum.CRM;
            break;
            case CMS: wrSeparateEnum1 = com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum.CMS;
            break;
            case COMMON: wrSeparateEnum1 = com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum.COMMON;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + wrSeparateEnum );
        }

        return wrSeparateEnum1;
    }

    protected BoardCategoryDefineEntity boardCategoryDefineToBoardCategoryDefineEntity(BoardCategoryDefine boardCategoryDefine) {
        if ( boardCategoryDefine == null ) {
            return null;
        }

        BoardCategoryDefineEntity.BoardCategoryDefineEntityBuilder boardCategoryDefineEntity = BoardCategoryDefineEntity.builder();

        boardCategoryDefineEntity.bcIdx( boardCategoryDefine.getBcIdx() );
        boardCategoryDefineEntity.boTable( boardCategoryDefine.getBoTable() );
        boardCategoryDefineEntity.bcName( boardCategoryDefine.getBcName() );
        boardCategoryDefineEntity.bcIsDisplay( boardCategoryDefine.getBcIsDisplay() );
        boardCategoryDefineEntity.bcIsUse( boardCategoryDefine.getBcIsUse() );
        boardCategoryDefineEntity.bcSeq( boardCategoryDefine.getBcSeq() );

        return boardCategoryDefineEntity.build();
    }

    protected BoardCategoryDefine boardCategoryDefineEntityToBoardCategoryDefine(BoardCategoryDefineEntity boardCategoryDefineEntity) {
        if ( boardCategoryDefineEntity == null ) {
            return null;
        }

        BoardCategoryDefine.BoardCategoryDefineBuilder<?, ?> boardCategoryDefine = BoardCategoryDefine.builder();

        boardCategoryDefine.createdAt( boardCategoryDefineEntity.getCreatedAt() );
        boardCategoryDefine.updatedAt( boardCategoryDefineEntity.getUpdatedAt() );
        boardCategoryDefine.bcIdx( boardCategoryDefineEntity.getBcIdx() );
        boardCategoryDefine.boTable( boardCategoryDefineEntity.getBoTable() );
        boardCategoryDefine.bcName( boardCategoryDefineEntity.getBcName() );
        boardCategoryDefine.bcIsDisplay( boardCategoryDefineEntity.getBcIsDisplay() );
        boardCategoryDefine.bcIsUse( boardCategoryDefineEntity.getBcIsUse() );
        boardCategoryDefine.bcSeq( boardCategoryDefineEntity.getBcSeq() );

        return boardCategoryDefine.build();
    }
}
