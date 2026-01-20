package com.cmb.rainbowtv.domain.search.infra.mapper;

import com.cmb.rainbowtv.domain.search.infra.data.entity.SearchKeywordEntity;
import com.cmb.rainbowtv.domain.search.model.SearchKeyword;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:40+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class SearchKeywordMapperImpl implements SearchKeywordMapper {

    @Override
    public SearchKeyword toModel(SearchKeywordEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SearchKeyword.SearchKeywordBuilder<?, ?> searchKeyword = SearchKeyword.builder();

        searchKeyword.createdAt( entity.getCreatedAt() );
        searchKeyword.updatedAt( entity.getUpdatedAt() );
        searchKeyword.skIdx( entity.getSkIdx() );
        searchKeyword.skYear( entity.getSkYear() );
        searchKeyword.skMonth( entity.getSkMonth() );
        searchKeyword.skDay( entity.getSkDay() );
        searchKeyword.skKeywords( entity.getSkKeywords() );
        searchKeyword.skAiResult( entity.getSkAiResult() );

        return searchKeyword.build();
    }

    @Override
    public SearchKeywordEntity toEntity(SearchKeyword model) {
        if ( model == null ) {
            return null;
        }

        SearchKeywordEntity.SearchKeywordEntityBuilder searchKeywordEntity = SearchKeywordEntity.builder();

        searchKeywordEntity.skIdx( model.getSkIdx() );
        searchKeywordEntity.skYear( model.getSkYear() );
        searchKeywordEntity.skMonth( model.getSkMonth() );
        searchKeywordEntity.skDay( model.getSkDay() );
        searchKeywordEntity.skKeywords( model.getSkKeywords() );
        searchKeywordEntity.skAiResult( model.getSkAiResult() );

        return searchKeywordEntity.build();
    }
}
