package com.cmb.rainbowtv.domain.faq.infra;

import com.cmb.rainbowtv.domain.faq.infra.data.entity.FaqCategoryEntity;
import com.cmb.rainbowtv.domain.faq.infra.data.entity.FaqEntity;
import com.cmb.rainbowtv.domain.faq.model.Faq;
import com.cmb.rainbowtv.domain.faq.model.FaqCategory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class FaqInfraMapperImpl implements FaqInfraMapper {

    @Override
    public FaqCategoryEntity toFaqCategoryEntity(FaqCategory faqCategory) {
        if ( faqCategory == null ) {
            return null;
        }

        FaqCategoryEntity.FaqCategoryEntityBuilder faqCategoryEntity = FaqCategoryEntity.builder();

        faqCategoryEntity.fcIdx( faqCategory.getFcIdx() );
        faqCategoryEntity.fcSeq( faqCategory.getFcSeq() );
        faqCategoryEntity.fcName( faqCategory.getFcName() );
        faqCategoryEntity.fcDisplay( faqCategory.getFcDisplay() );
        faqCategoryEntity.deletedAt( faqCategory.getDeletedAt() );

        return faqCategoryEntity.build();
    }

    @Override
    public FaqCategory toFaqCategory(FaqCategoryEntity save) {
        if ( save == null ) {
            return null;
        }

        FaqCategory.FaqCategoryBuilder<?, ?> faqCategory = FaqCategory.builder();

        faqCategory.createdAt( save.getCreatedAt() );
        faqCategory.updatedAt( save.getUpdatedAt() );
        faqCategory.fcIdx( save.getFcIdx() );
        faqCategory.fcSeq( save.getFcSeq() );
        faqCategory.fcName( save.getFcName() );
        faqCategory.fcDisplay( save.getFcDisplay() );
        faqCategory.deletedAt( save.getDeletedAt() );

        return faqCategory.build();
    }

    @Override
    public Faq toFaq(FaqEntity faqEntity) {
        if ( faqEntity == null ) {
            return null;
        }

        Faq.FaqBuilder<?, ?> faq = Faq.builder();

        faq.createdAt( faqEntity.getCreatedAt() );
        faq.updatedAt( faqEntity.getUpdatedAt() );
        faq.faIdx( faqEntity.getFaIdx() );
        faq.faqCategory( toFaqCategory( faqEntity.getFaqCategory() ) );
        faq.faType( faqEntity.getFaType() );
        faq.faTitle( faqEntity.getFaTitle() );
        faq.faUrl( faqEntity.getFaUrl() );
        faq.faRunningTime( faqEntity.getFaRunningTime() );
        faq.faStatus( faqEntity.getFaStatus() );
        faq.faDashUrl( faqEntity.getFaDashUrl() );
        faq.faHlsUrl( faqEntity.getFaHlsUrl() );
        faq.guid( faqEntity.getGuid() );
        faq.mediaPackageId( faqEntity.getMediaPackageId() );
        faq.deletedAt( faqEntity.getDeletedAt() );
        faq.faContent( faqEntity.getFaContent() );
        faq.faSeq( faqEntity.getFaSeq() );

        return faq.build();
    }

    @Override
    public List<FaqCategory> toFaqCategoryList(List<FaqCategoryEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<FaqCategory> list = new ArrayList<FaqCategory>( allById.size() );
        for ( FaqCategoryEntity faqCategoryEntity : allById ) {
            list.add( toFaqCategory( faqCategoryEntity ) );
        }

        return list;
    }

    @Override
    public List<Faq> toFaqList(List<FaqEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<Faq> list = new ArrayList<Faq>( allById.size() );
        for ( FaqEntity faqEntity : allById ) {
            list.add( toFaq( faqEntity ) );
        }

        return list;
    }

    @Override
    public FaqEntity toFaqEntity(Faq faq) {
        if ( faq == null ) {
            return null;
        }

        FaqEntity.FaqEntityBuilder faqEntity = FaqEntity.builder();

        faqEntity.faIdx( faq.getFaIdx() );
        faqEntity.faqCategory( toFaqCategoryEntity( faq.getFaqCategory() ) );
        faqEntity.faType( faq.getFaType() );
        faqEntity.faTitle( faq.getFaTitle() );
        faqEntity.faUrl( faq.getFaUrl() );
        faqEntity.faRunningTime( faq.getFaRunningTime() );
        faqEntity.faStatus( faq.getFaStatus() );
        faqEntity.faDashUrl( faq.getFaDashUrl() );
        faqEntity.faHlsUrl( faq.getFaHlsUrl() );
        faqEntity.guid( faq.getGuid() );
        faqEntity.mediaPackageId( faq.getMediaPackageId() );
        faqEntity.deletedAt( faq.getDeletedAt() );
        faqEntity.faContent( faq.getFaContent() );
        faqEntity.faSeq( faq.getFaSeq() );

        return faqEntity.build();
    }
}
