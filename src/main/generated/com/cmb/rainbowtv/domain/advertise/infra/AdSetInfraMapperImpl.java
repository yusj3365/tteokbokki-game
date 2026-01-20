package com.cmb.rainbowtv.domain.advertise.infra;

import com.cmb.rainbowtv.domain.advertise.infra.data.entity.AdSetEntity;
import com.cmb.rainbowtv.domain.advertise.model.AdSet;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:45+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AdSetInfraMapperImpl implements AdSetInfraMapper {

    @Override
    public AdSet toAdSet(AdSetEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AdSet.AdSetBuilder<?, ?> adSet = AdSet.builder();

        adSet.createdAt( entity.getCreatedAt() );
        adSet.updatedAt( entity.getUpdatedAt() );
        adSet.asIdx( entity.getAsIdx() );
        adSet.asUse( entity.getAsUse() );
        adSet.asName( entity.getAsName() );
        adSet.asStatus( entity.getAsStatus() );
        adSet.asDashUrl( entity.getAsDashUrl() );
        adSet.asHlsUrl( entity.getAsHlsUrl() );
        adSet.asPostTimeSt( entity.getAsPostTimeSt() );
        adSet.asPostTimeEd( entity.getAsPostTimeEd() );
        adSet.guid( entity.getGuid() );
        adSet.mediaPackageId( entity.getMediaPackageId() );
        adSet.asUuid( entity.getAsUuid() );
        adSet.asRunningTime( entity.getAsRunningTime() );

        return adSet.build();
    }

    @Override
    public AdSetEntity toAdSetEntity(AdSet adSet) {
        if ( adSet == null ) {
            return null;
        }

        AdSetEntity.AdSetEntityBuilder adSetEntity = AdSetEntity.builder();

        adSetEntity.asIdx( adSet.getAsIdx() );
        adSetEntity.asUse( adSet.getAsUse() );
        adSetEntity.asName( adSet.getAsName() );
        adSetEntity.asStatus( adSet.getAsStatus() );
        adSetEntity.asDashUrl( adSet.getAsDashUrl() );
        adSetEntity.asHlsUrl( adSet.getAsHlsUrl() );
        adSetEntity.asPostTimeSt( adSet.getAsPostTimeSt() );
        adSetEntity.asPostTimeEd( adSet.getAsPostTimeEd() );
        adSetEntity.guid( adSet.getGuid() );
        adSetEntity.mediaPackageId( adSet.getMediaPackageId() );
        adSetEntity.asUuid( adSet.getAsUuid() );
        adSetEntity.asRunningTime( adSet.getAsRunningTime() );

        return adSetEntity.build();
    }
}
