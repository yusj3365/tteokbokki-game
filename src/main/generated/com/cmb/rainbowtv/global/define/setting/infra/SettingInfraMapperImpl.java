package com.cmb.rainbowtv.global.define.setting.infra;

import com.cmb.rainbowtv.global.define.setting.infra.data.entity.SettingDefineEntity;
import com.cmb.rainbowtv.global.define.setting.model.SettingDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:40+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class SettingInfraMapperImpl implements SettingInfraMapper {

    @Override
    public SettingDefine toSettingDefine(SettingDefineEntity appleClientSecret) {
        if ( appleClientSecret == null ) {
            return null;
        }

        SettingDefine.SettingDefineBuilder<?, ?> settingDefine = SettingDefine.builder();

        settingDefine.createdAt( appleClientSecret.getCreatedAt() );
        settingDefine.updatedAt( appleClientSecret.getUpdatedAt() );
        settingDefine.seIdx( appleClientSecret.getSeIdx() );
        settingDefine.seKey( appleClientSecret.getSeKey() );
        settingDefine.seIosValue( appleClientSecret.getSeIosValue() );
        settingDefine.seAosValue( appleClientSecret.getSeAosValue() );

        return settingDefine.build();
    }
}
