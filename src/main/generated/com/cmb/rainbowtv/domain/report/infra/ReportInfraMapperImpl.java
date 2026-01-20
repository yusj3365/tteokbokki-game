package com.cmb.rainbowtv.domain.report.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.report.infra.data.entity.ReportCategoryDefineEntity;
import com.cmb.rainbowtv.domain.report.infra.data.entity.ReportEntity;
import com.cmb.rainbowtv.domain.report.model.Report;
import com.cmb.rainbowtv.domain.report.model.ReportCategoryDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:48+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ReportInfraMapperImpl implements ReportInfraMapper {

    @Override
    public ReportEntity toEntity(Report report) {
        if ( report == null ) {
            return null;
        }

        ReportEntity.ReportEntityBuilder reportEntity = ReportEntity.builder();

        reportEntity.reIdx( report.getReIdx() );
        reportEntity.reportCategory( toEntity( report.getReportCategory() ) );
        reportEntity.reType( report.getReType() );
        reportEntity.member( memberToMemberEntity( report.getMember() ) );
        reportEntity.reReport( report.getReReport() );
        reportEntity.reKey( report.getReKey() );
        reportEntity.reTitle( report.getReTitle() );
        reportEntity.reContent( report.getReContent() );

        return reportEntity.build();
    }

    @Override
    public Report toModel(ReportEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Report.ReportBuilder<?, ?> report = Report.builder();

        report.createdAt( entity.getCreatedAt() );
        report.updatedAt( entity.getUpdatedAt() );
        report.reIdx( entity.getReIdx() );
        report.reportCategory( toModel( entity.getReportCategory() ) );
        report.reType( entity.getReType() );
        report.member( memberEntityToMember( entity.getMember() ) );
        report.reReport( entity.getReReport() );
        report.reKey( entity.getReKey() );
        report.reTitle( entity.getReTitle() );
        report.reContent( entity.getReContent() );

        return report.build();
    }

    @Override
    public ReportCategoryDefine toModel(ReportCategoryDefineEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ReportCategoryDefine.ReportCategoryDefineBuilder<?, ?> reportCategoryDefine = ReportCategoryDefine.builder();

        reportCategoryDefine.rcIdx( entity.getRcIdx() );
        reportCategoryDefine.rcCategory( entity.getRcCategory() );
        reportCategoryDefine.rcSeq( entity.getRcSeq() );

        return reportCategoryDefine.build();
    }

    @Override
    public ReportCategoryDefineEntity toEntity(ReportCategoryDefine model) {
        if ( model == null ) {
            return null;
        }

        ReportCategoryDefineEntity.ReportCategoryDefineEntityBuilder reportCategoryDefineEntity = ReportCategoryDefineEntity.builder();

        reportCategoryDefineEntity.rcIdx( model.getRcIdx() );
        reportCategoryDefineEntity.rcCategory( model.getRcCategory() );
        reportCategoryDefineEntity.rcSeq( model.getRcSeq() );

        return reportCategoryDefineEntity.build();
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
