package com.cmb.rainbowtv.domain.mobileUploadVolume.infra;

import com.cmb.rainbowtv.domain.mobileUploadVolume.infra.data.entity.MobileUploadVolumeEntity;
import com.cmb.rainbowtv.domain.mobileUploadVolume.model.MobileUploadVolume;
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
public class MobileUploadVolumeInfraMapperImpl implements MobileUploadVolumeInfraMapper {

    @Override
    public List<MobileUploadVolume> toMobileUploadVolumeList(List<MobileUploadVolumeEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<MobileUploadVolume> list = new ArrayList<MobileUploadVolume>( allById.size() );
        for ( MobileUploadVolumeEntity mobileUploadVolumeEntity : allById ) {
            list.add( toMobileUploadVolume( mobileUploadVolumeEntity ) );
        }

        return list;
    }

    @Override
    public MobileUploadVolume toMobileUploadVolume(MobileUploadVolumeEntity mobileUploadVolumeEntity) {
        if ( mobileUploadVolumeEntity == null ) {
            return null;
        }

        MobileUploadVolume.MobileUploadVolumeBuilder<?, ?> mobileUploadVolume = MobileUploadVolume.builder();

        mobileUploadVolume.createdAt( mobileUploadVolumeEntity.getCreatedAt() );
        mobileUploadVolume.updatedAt( mobileUploadVolumeEntity.getUpdatedAt() );
        mobileUploadVolume.muvIdx( mobileUploadVolumeEntity.getMuvIdx() );
        mobileUploadVolume.muvType( mobileUploadVolumeEntity.getMuvType() );
        mobileUploadVolume.muvHaveLimit( mobileUploadVolumeEntity.getMuvHaveLimit() );
        mobileUploadVolume.muvVolume( mobileUploadVolumeEntity.getMuvVolume() );

        return mobileUploadVolume.build();
    }

    @Override
    public MobileUploadVolumeEntity toMobileUploadVolumeEntity(MobileUploadVolume mobileUploadVolume) {
        if ( mobileUploadVolume == null ) {
            return null;
        }

        MobileUploadVolumeEntity.MobileUploadVolumeEntityBuilder mobileUploadVolumeEntity = MobileUploadVolumeEntity.builder();

        mobileUploadVolumeEntity.muvIdx( mobileUploadVolume.getMuvIdx() );
        mobileUploadVolumeEntity.muvType( mobileUploadVolume.getMuvType() );
        mobileUploadVolumeEntity.muvHaveLimit( mobileUploadVolume.getMuvHaveLimit() );
        mobileUploadVolumeEntity.muvVolume( mobileUploadVolume.getMuvVolume() );

        return mobileUploadVolumeEntity.build();
    }
}
