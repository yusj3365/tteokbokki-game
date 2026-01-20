package com.cmb.rainbowtv.domain.config.infra;

import com.cmb.rainbowtv.domain.config.infra.data.entity.ConfigCategoryEntity;
import com.cmb.rainbowtv.domain.config.infra.data.entity.ConfigEntity;
import com.cmb.rainbowtv.domain.config.model.Config;
import com.cmb.rainbowtv.domain.config.model.ConfigCategory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ConfigInfraMapperImpl implements ConfigInfraMapper {

    @Override
    public ConfigCategoryEntity toConfigCategoryEntity(ConfigCategory configCategory) {
        if ( configCategory == null ) {
            return null;
        }

        ConfigCategoryEntity.ConfigCategoryEntityBuilder configCategoryEntity = ConfigCategoryEntity.builder();

        configCategoryEntity.ccIdx( configCategory.getCcIdx() );
        configCategoryEntity.ccType( configCategory.getCcType() );
        configCategoryEntity.ccClass( configCategory.getCcClass() );
        configCategoryEntity.ccName( configCategory.getCcName() );
        configCategoryEntity.ccNameEn( configCategory.getCcNameEn() );
        configCategoryEntity.ccFix( configCategory.getCcFix() );
        configCategoryEntity.ccSeq( configCategory.getCcSeq() );
        configCategoryEntity.ccSeparate( configCategory.getCcSeparate() );

        return configCategoryEntity.build();
    }

    @Override
    public ConfigCategory toConfigCategoryModel(ConfigCategoryEntity save) {
        if ( save == null ) {
            return null;
        }

        ConfigCategory.ConfigCategoryBuilder<?, ?> configCategory = ConfigCategory.builder();

        configCategory.createdAt( save.getCreatedAt() );
        configCategory.updatedAt( save.getUpdatedAt() );
        configCategory.ccIdx( save.getCcIdx() );
        configCategory.ccType( save.getCcType() );
        configCategory.ccClass( save.getCcClass() );
        configCategory.ccName( save.getCcName() );
        configCategory.ccNameEn( save.getCcNameEn() );
        configCategory.ccFix( save.getCcFix() );
        configCategory.ccSeq( save.getCcSeq() );
        configCategory.ccSeparate( save.getCcSeparate() );

        return configCategory.build();
    }

    @Override
    public Config toConfigModel(ConfigEntity configEntity) {
        if ( configEntity == null ) {
            return null;
        }

        Config.ConfigBuilder<?, ?> config = Config.builder();

        config.createdAt( configEntity.getCreatedAt() );
        config.updatedAt( configEntity.getUpdatedAt() );
        config.coIdx( configEntity.getCoIdx() );
        config.configCategory( toConfigCategoryModel( configEntity.getConfigCategory() ) );
        config.coConfig( configEntity.getCoConfig() );
        config.coType( configEntity.getCoType() );

        return config.build();
    }

    @Override
    public ConfigEntity toConfigEntity(Config config) {
        if ( config == null ) {
            return null;
        }

        ConfigEntity.ConfigEntityBuilder configEntity = ConfigEntity.builder();

        configEntity.coIdx( config.getCoIdx() );
        configEntity.configCategory( toConfigCategoryEntity( config.getConfigCategory() ) );
        configEntity.coConfig( config.getCoConfig() );
        configEntity.coType( config.getCoType() );

        return configEntity.build();
    }
}
