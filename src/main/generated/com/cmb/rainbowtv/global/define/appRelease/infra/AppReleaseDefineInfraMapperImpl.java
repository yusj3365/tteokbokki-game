package com.cmb.rainbowtv.global.define.appRelease.infra;

import com.cmb.rainbowtv.global.define.appRelease.infra.data.entity.AppReleaseDefineEntity;
import com.cmb.rainbowtv.global.define.appRelease.model.AppReleaseDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AppReleaseDefineInfraMapperImpl implements AppReleaseDefineInfraMapper {

    @Override
    public AppReleaseDefine toAppReleaseDefine(AppReleaseDefineEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AppReleaseDefine.AppReleaseDefineBuilder<?, ?> appReleaseDefine = AppReleaseDefine.builder();

        appReleaseDefine.createdAt( entity.getCreatedAt() );
        appReleaseDefine.updatedAt( entity.getUpdatedAt() );
        appReleaseDefine.arIdx( entity.getArIdx() );
        appReleaseDefine.appTypeDefineEnum( entity.getAppTypeDefineEnum() );
        appReleaseDefine.arLatestVersion( entity.getArLatestVersion() );
        appReleaseDefine.arCriticalSection( entity.getArCriticalSection() );
        appReleaseDefine.arReleaseNote( entity.getArReleaseNote() );
        appReleaseDefine.arUrl( entity.getArUrl() );
        appReleaseDefine.arDelete( entity.getArDelete() );
        appReleaseDefine.arIsRelease( entity.getArIsRelease() );
        appReleaseDefine.statisticsUrl( entity.getStatisticsUrl() );

        return appReleaseDefine.build();
    }

    @Override
    public AppReleaseDefineEntity toAppReleaseDefineEntity(AppReleaseDefine model) {
        if ( model == null ) {
            return null;
        }

        AppReleaseDefineEntity.AppReleaseDefineEntityBuilder appReleaseDefineEntity = AppReleaseDefineEntity.builder();

        appReleaseDefineEntity.arIdx( model.getArIdx() );
        appReleaseDefineEntity.appTypeDefineEnum( model.getAppTypeDefineEnum() );
        appReleaseDefineEntity.arLatestVersion( model.getArLatestVersion() );
        appReleaseDefineEntity.arCriticalSection( model.getArCriticalSection() );
        appReleaseDefineEntity.arReleaseNote( model.getArReleaseNote() );
        appReleaseDefineEntity.arUrl( model.getArUrl() );
        appReleaseDefineEntity.arDelete( model.getArDelete() );
        appReleaseDefineEntity.arIsRelease( model.getArIsRelease() );
        appReleaseDefineEntity.statisticsUrl( model.getStatisticsUrl() );

        return appReleaseDefineEntity.build();
    }
}
