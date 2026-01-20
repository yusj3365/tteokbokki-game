package com.cmb.rainbowtv.domain.ip.infra;

import com.cmb.rainbowtv.domain.ip.infra.data.entity.IpAreaDefineEntity;
import com.cmb.rainbowtv.domain.ip.infra.data.entity.IpEntity;
import com.cmb.rainbowtv.domain.ip.model.Ip;
import com.cmb.rainbowtv.domain.ip.model.IpAreaDefine;
import com.cmb.rainbowtv.domain.ip.model.enums.IpTypeEnum;
import com.cmb.rainbowtv.domain.ip.model.enums.ManageEnum;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:48+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IpInfraMapperImpl implements IpInfraMapper {

    @Override
    public IpEntity toIpEntity(Ip ip) {
        if ( ip == null ) {
            return null;
        }

        Long ipIdx = null;
        IpTypeEnum ipType = null;
        String ipIp = null;
        String ipName = null;
        IpAreaDefineEntity ipAreaDefine = null;
        ManageEnum ipManage = null;

        ipIdx = ip.getIpIdx();
        ipType = ip.getIpType();
        ipIp = ip.getIpIp();
        ipName = ip.getIpName();
        ipAreaDefine = ipAreaDefineToIpAreaDefineEntity( ip.getIpAreaDefine() );
        ipManage = ip.getIpManage();

        IpEntity ipEntity = new IpEntity( ipIdx, ipType, ipIp, ipName, ipAreaDefine, ipManage );

        ipEntity.setCreatedAt( ip.getCreatedAt() );
        ipEntity.setUpdatedAt( ip.getUpdatedAt() );

        return ipEntity;
    }

    @Override
    public Ip toIp(IpEntity ipEntity) {
        if ( ipEntity == null ) {
            return null;
        }

        Ip.IpBuilder<?, ?> ip = Ip.builder();

        ip.createdAt( ipEntity.getCreatedAt() );
        ip.updatedAt( ipEntity.getUpdatedAt() );
        ip.ipIdx( ipEntity.getIpIdx() );
        ip.ipType( ipEntity.getIpType() );
        ip.ipIp( ipEntity.getIpIp() );
        ip.ipName( ipEntity.getIpName() );
        ip.ipAreaDefine( ipAreaDefineEntityToIpAreaDefine( ipEntity.getIpAreaDefine() ) );
        ip.ipManage( ipEntity.getIpManage() );

        return ip.build();
    }

    protected IpAreaDefineEntity ipAreaDefineToIpAreaDefineEntity(IpAreaDefine ipAreaDefine) {
        if ( ipAreaDefine == null ) {
            return null;
        }

        IpAreaDefineEntity.IpAreaDefineEntityBuilder ipAreaDefineEntity = IpAreaDefineEntity.builder();

        ipAreaDefineEntity.iadIdx( ipAreaDefine.getIadIdx() );
        ipAreaDefineEntity.iadName( ipAreaDefine.getIadName() );

        return ipAreaDefineEntity.build();
    }

    protected IpAreaDefine ipAreaDefineEntityToIpAreaDefine(IpAreaDefineEntity ipAreaDefineEntity) {
        if ( ipAreaDefineEntity == null ) {
            return null;
        }

        IpAreaDefine.IpAreaDefineBuilder<?, ?> ipAreaDefine = IpAreaDefine.builder();

        ipAreaDefine.iadIdx( ipAreaDefineEntity.getIadIdx() );
        ipAreaDefine.iadName( ipAreaDefineEntity.getIadName() );

        return ipAreaDefine.build();
    }
}
