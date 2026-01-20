package com.cmb.rainbowtv.domain.recommender.infra;

import com.cmb.rainbowtv.domain.recommender.infra.data.entity.RecommendManagementContentEntity;
import com.cmb.rainbowtv.domain.recommender.infra.data.entity.RecommendManagementEntity;
import com.cmb.rainbowtv.domain.recommender.model.RecommendManagement;
import com.cmb.rainbowtv.domain.recommender.model.RecommendManagementContent;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:40+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class RecommendManagementInfraMapperImpl implements RecommendManagementInfraMapper {

    @Override
    public List<RecommendManagementContent> toRecommendManagementContentList(List<RecommendManagementContentEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RecommendManagementContent> list1 = new ArrayList<RecommendManagementContent>( list.size() );
        for ( RecommendManagementContentEntity recommendManagementContentEntity : list ) {
            list1.add( recommendManagementContentEntityToRecommendManagementContent( recommendManagementContentEntity ) );
        }

        return list1;
    }

    @Override
    public RecommendManagement toRecommendManagement(RecommendManagementEntity recommendManagementEntity) {
        if ( recommendManagementEntity == null ) {
            return null;
        }

        RecommendManagement.RecommendManagementBuilder<?, ?> recommendManagement = RecommendManagement.builder();

        recommendManagement.createdAt( recommendManagementEntity.getCreatedAt() );
        recommendManagement.updatedAt( recommendManagementEntity.getUpdatedAt() );
        recommendManagement.rmIdx( recommendManagementEntity.getRmIdx() );
        recommendManagement.rmType( recommendManagementEntity.getRmType() );
        recommendManagement.rmMenu( recommendManagementEntity.getRmMenu() );
        recommendManagement.rmTitle( recommendManagementEntity.getRmTitle() );
        recommendManagement.rmDisplay( recommendManagementEntity.getRmDisplay() );

        return recommendManagement.build();
    }

    @Override
    public RecommendManagementEntity toREcommendManagementEntity(RecommendManagement recommendManagement) {
        if ( recommendManagement == null ) {
            return null;
        }

        RecommendManagementEntity.RecommendManagementEntityBuilder recommendManagementEntity = RecommendManagementEntity.builder();

        recommendManagementEntity.rmIdx( recommendManagement.getRmIdx() );
        recommendManagementEntity.rmType( recommendManagement.getRmType() );
        recommendManagementEntity.rmMenu( recommendManagement.getRmMenu() );
        recommendManagementEntity.rmTitle( recommendManagement.getRmTitle() );
        recommendManagementEntity.rmDisplay( recommendManagement.getRmDisplay() );

        return recommendManagementEntity.build();
    }

    @Override
    public List<RecommendManagementContentEntity> toRecommendManagementContentListEntity(List<RecommendManagementContent> list) {
        if ( list == null ) {
            return null;
        }

        List<RecommendManagementContentEntity> list1 = new ArrayList<RecommendManagementContentEntity>( list.size() );
        for ( RecommendManagementContent recommendManagementContent : list ) {
            list1.add( recommendManagementContentToRecommendManagementContentEntity( recommendManagementContent ) );
        }

        return list1;
    }

    protected RecommendManagementContent recommendManagementContentEntityToRecommendManagementContent(RecommendManagementContentEntity recommendManagementContentEntity) {
        if ( recommendManagementContentEntity == null ) {
            return null;
        }

        RecommendManagementContent.RecommendManagementContentBuilder<?, ?> recommendManagementContent = RecommendManagementContent.builder();

        recommendManagementContent.createdAt( recommendManagementContentEntity.getCreatedAt() );
        recommendManagementContent.updatedAt( recommendManagementContentEntity.getUpdatedAt() );
        recommendManagementContent.rmcIdx( recommendManagementContentEntity.getRmcIdx() );
        recommendManagementContent.recommendManagement( toRecommendManagement( recommendManagementContentEntity.getRecommendManagement() ) );
        recommendManagementContent.rmcContent( recommendManagementContentEntity.getRmcContent() );
        recommendManagementContent.rmcSeq( recommendManagementContentEntity.getRmcSeq() );

        return recommendManagementContent.build();
    }

    protected RecommendManagementContentEntity recommendManagementContentToRecommendManagementContentEntity(RecommendManagementContent recommendManagementContent) {
        if ( recommendManagementContent == null ) {
            return null;
        }

        RecommendManagementContentEntity.RecommendManagementContentEntityBuilder recommendManagementContentEntity = RecommendManagementContentEntity.builder();

        recommendManagementContentEntity.rmcIdx( recommendManagementContent.getRmcIdx() );
        recommendManagementContentEntity.recommendManagement( toREcommendManagementEntity( recommendManagementContent.getRecommendManagement() ) );
        recommendManagementContentEntity.rmcContent( recommendManagementContent.getRmcContent() );
        recommendManagementContentEntity.rmcSeq( recommendManagementContent.getRmcSeq() );

        return recommendManagementContentEntity.build();
    }
}
