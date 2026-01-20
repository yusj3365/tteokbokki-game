package com.cmb.rainbowtv.domain.homechoice.infra;

import com.cmb.rainbowtv.domain.homechoice.infra.data.entity.HomeChoiceVisibleEntity;
import com.cmb.rainbowtv.domain.homechoice.model.HomeChoiceVisible;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:39+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class HomeChoiceVisibleMapperImpl implements HomeChoiceVisibleMapper {

    @Override
    public HomeChoiceVisible toHomeChoiceVisible(HomeChoiceVisibleEntity homeChoiceVisibleEntity) {
        if ( homeChoiceVisibleEntity == null ) {
            return null;
        }

        HomeChoiceVisible.HomeChoiceVisibleBuilder<?, ?> homeChoiceVisible = HomeChoiceVisible.builder();

        homeChoiceVisible.createdAt( homeChoiceVisibleEntity.getCreatedAt() );
        homeChoiceVisible.updatedAt( homeChoiceVisibleEntity.getUpdatedAt() );
        homeChoiceVisible.hcvIdx( homeChoiceVisibleEntity.getHcvIdx() );
        homeChoiceVisible.hcvCategoryName( homeChoiceVisibleEntity.getHcvCategoryName() );
        homeChoiceVisible.hcvIsVisible( homeChoiceVisibleEntity.getHcvIsVisible() );

        return homeChoiceVisible.build();
    }

    @Override
    public HomeChoiceVisibleEntity toHomeChoiceVisibleEntity(HomeChoiceVisible homeChoiceVisible) {
        if ( homeChoiceVisible == null ) {
            return null;
        }

        HomeChoiceVisibleEntity.HomeChoiceVisibleEntityBuilder homeChoiceVisibleEntity = HomeChoiceVisibleEntity.builder();

        homeChoiceVisibleEntity.hcvIdx( homeChoiceVisible.getHcvIdx() );
        homeChoiceVisibleEntity.hcvCategoryName( homeChoiceVisible.getHcvCategoryName() );
        homeChoiceVisibleEntity.hcvIsVisible( homeChoiceVisible.getHcvIsVisible() );

        return homeChoiceVisibleEntity.build();
    }
}
