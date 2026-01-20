package com.cmb.rainbowtv.domain.ip.infra;

import com.cmb.rainbowtv.domain.ip.infra.data.entity.IpAreaDefineEntity;
import com.cmb.rainbowtv.domain.ip.model.IpAreaDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:39+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IpAreaDefineInfraMapperImpl implements IpAreaDefineInfraMapper {

    @Override
    public IpAreaDefineEntity toIpAreaDefineEntity(IpAreaDefine ipAreaDefine) {
        if ( ipAreaDefine == null ) {
            return null;
        }

        IpAreaDefineEntity.IpAreaDefineEntityBuilder ipAreaDefineEntity = IpAreaDefineEntity.builder();

        ipAreaDefineEntity.iadIdx( ipAreaDefine.getIadIdx() );
        ipAreaDefineEntity.iadName( ipAreaDefine.getIadName() );

        return ipAreaDefineEntity.build();
    }

    @Override
    public IpAreaDefine toIpAreaDefine(IpAreaDefineEntity ipAreaDefineEntity) {
        if ( ipAreaDefineEntity == null ) {
            return null;
        }

        IpAreaDefine.IpAreaDefineBuilder<?, ?> ipAreaDefine = IpAreaDefine.builder();

        ipAreaDefine.iadIdx( ipAreaDefineEntity.getIadIdx() );
        ipAreaDefine.iadName( ipAreaDefineEntity.getIadName() );

        return ipAreaDefine.build();
    }
}
