package com.cmb.rainbowtv.domain.attachments.infra;

import com.cmb.rainbowtv.domain.attachments.infra.data.entity.AttachmentsEntity;
import com.cmb.rainbowtv.domain.attachments.infra.data.entity.FileDeleteLogEntity;
import com.cmb.rainbowtv.domain.attachments.model.Attachments;
import com.cmb.rainbowtv.domain.attachments.model.FileDeleteLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AttachmentsInfraMapperImpl implements AttachmentsInfraMapper {

    @Override
    public AttachmentsEntity toAttachmentsEntity(Attachments attachments) {
        if ( attachments == null ) {
            return null;
        }

        AttachmentsEntity.AttachmentsEntityBuilder attachmentsEntity = AttachmentsEntity.builder();

        attachmentsEntity.atIdx( attachments.getAtIdx() );
        attachmentsEntity.atContainerId( attachments.getAtContainerId() );
        attachmentsEntity.atContainerType( attachments.getAtContainerType() );
        attachmentsEntity.mbNo( attachments.getMbNo() );
        attachmentsEntity.atFilename( attachments.getAtFilename() );
        attachmentsEntity.atDiskFilename( attachments.getAtDiskFilename() );
        attachmentsEntity.atFilesize( attachments.getAtFilesize() );
        attachmentsEntity.atFileExtension( attachments.getAtFileExtension() );
        attachmentsEntity.atContentType( attachments.getAtContentType() );
        attachmentsEntity.atDigest( attachments.getAtDigest() );
        attachmentsEntity.atDownloads( attachments.getAtDownloads() );
        attachmentsEntity.atDescription( attachments.getAtDescription() );
        attachmentsEntity.atDiskDirectory( attachments.getAtDiskDirectory() );
        attachmentsEntity.atSeq( attachments.getAtSeq() );

        return attachmentsEntity.build();
    }

    @Override
    public Attachments toAttachments(AttachmentsEntity save) {
        if ( save == null ) {
            return null;
        }

        Attachments.AttachmentsBuilder<?, ?> attachments = Attachments.builder();

        attachments.createdAt( save.getCreatedAt() );
        attachments.updatedAt( save.getUpdatedAt() );
        attachments.atIdx( save.getAtIdx() );
        attachments.atContainerId( save.getAtContainerId() );
        attachments.atContainerType( save.getAtContainerType() );
        attachments.mbNo( save.getMbNo() );
        attachments.atFilename( save.getAtFilename() );
        attachments.atDiskFilename( save.getAtDiskFilename() );
        attachments.atFilesize( save.getAtFilesize() );
        attachments.atFileExtension( save.getAtFileExtension() );
        attachments.atContentType( save.getAtContentType() );
        attachments.atDigest( save.getAtDigest() );
        attachments.atDownloads( save.getAtDownloads() );
        attachments.atDescription( save.getAtDescription() );
        attachments.atDiskDirectory( save.getAtDiskDirectory() );
        attachments.atSeq( save.getAtSeq() );

        return attachments.build();
    }

    @Override
    public FileDeleteLogEntity toFileDeleteLogEntity(FileDeleteLog fileDeleteLog) {
        if ( fileDeleteLog == null ) {
            return null;
        }

        FileDeleteLogEntity.FileDeleteLogEntityBuilder fileDeleteLogEntity = FileDeleteLogEntity.builder();

        fileDeleteLogEntity.fdlIdx( fileDeleteLog.getFdlIdx() );
        fileDeleteLogEntity.fdlDashUrl( fileDeleteLog.getFdlDashUrl() );
        fileDeleteLogEntity.fdlHlsUrl( fileDeleteLog.getFdlHlsUrl() );
        fileDeleteLogEntity.guid( fileDeleteLog.getGuid() );
        fileDeleteLogEntity.fdlStatus( fileDeleteLog.getFdlStatus() );
        fileDeleteLogEntity.atContainerId( fileDeleteLog.getAtContainerId() );
        fileDeleteLogEntity.atContainerType( fileDeleteLog.getAtContainerType() );
        fileDeleteLogEntity.atFilename( fileDeleteLog.getAtFilename() );
        fileDeleteLogEntity.atDiskFilename( fileDeleteLog.getAtDiskFilename() );

        return fileDeleteLogEntity.build();
    }

    @Override
    public FileDeleteLog toFileDeleteLog(FileDeleteLogEntity save) {
        if ( save == null ) {
            return null;
        }

        FileDeleteLog.FileDeleteLogBuilder<?, ?> fileDeleteLog = FileDeleteLog.builder();

        fileDeleteLog.createdAt( save.getCreatedAt() );
        fileDeleteLog.updatedAt( save.getUpdatedAt() );
        fileDeleteLog.fdlIdx( save.getFdlIdx() );
        fileDeleteLog.fdlDashUrl( save.getFdlDashUrl() );
        fileDeleteLog.fdlHlsUrl( save.getFdlHlsUrl() );
        fileDeleteLog.guid( save.getGuid() );
        fileDeleteLog.fdlStatus( save.getFdlStatus() );
        fileDeleteLog.atContainerId( save.getAtContainerId() );
        fileDeleteLog.atContainerType( save.getAtContainerType() );
        fileDeleteLog.atFilename( save.getAtFilename() );
        fileDeleteLog.atDiskFilename( save.getAtDiskFilename() );

        return fileDeleteLog.build();
    }
}
