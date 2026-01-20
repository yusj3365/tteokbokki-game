package com.cmb.rainbowtv.global.define.area.infra;

import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
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
public class AreaDefineInfraMapperImpl implements AreaDefineInfraMapper {

    @Override
    public AreaDefine toAreaDefine(AreaDefineEntity areaDefineEntity) {
        if ( areaDefineEntity == null ) {
            return null;
        }

        AreaDefine.AreaDefineBuilder areaDefine = AreaDefine.builder();

        areaDefine.adIdx( areaDefineEntity.getAdIdx() );
        areaDefine.adParent( areaDefineEntity.getAdParent() );
        areaDefine.adAdministCode( areaDefineEntity.getAdAdministCode() );
        areaDefine.adSi( areaDefineEntity.getAdSi() );
        areaDefine.adShortSi( areaDefineEntity.getAdShortSi() );
        areaDefine.adGu( areaDefineEntity.getAdGu() );
        areaDefine.adDong( areaDefineEntity.getAdDong() );
        areaDefine.adLegalCode( areaDefineEntity.getAdLegalCode() );
        areaDefine.adDongName( areaDefineEntity.getAdDongName() );
        areaDefine.adCreateDate( areaDefineEntity.getAdCreateDate() );
        areaDefine.adIsExpressCost( areaDefineEntity.getAdIsExpressCost() );

        return areaDefine.build();
    }

    @Override
    public List<AreaDefine> toAreaDefineList(List<AreaDefineEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<AreaDefine> list = new ArrayList<AreaDefine>( allById.size() );
        for ( AreaDefineEntity areaDefineEntity : allById ) {
            list.add( toAreaDefine( areaDefineEntity ) );
        }

        return list;
    }
}
