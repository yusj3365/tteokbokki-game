package com.cmb.rainbowtv.domain.session.infra;

import com.cmb.rainbowtv.domain.media.model.enums.DeviceTypeEnum;
import com.cmb.rainbowtv.domain.session.infra.data.entity.MemberDeviceSessionEntity;
import com.cmb.rainbowtv.domain.session.model.MemberDeviceSession;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:40+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class MemberDeviceSessionInfraMapperImpl implements MemberDeviceSessionInfraMapper {

    @Override
    public MemberDeviceSession toDomain(MemberDeviceSessionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MemberDeviceSession.MemberDeviceSessionBuilder<?, ?> memberDeviceSession = MemberDeviceSession.builder();

        memberDeviceSession.createdAt( entity.getCreatedAt() );
        memberDeviceSession.updatedAt( entity.getUpdatedAt() );
        memberDeviceSession.mdsIdx( entity.getMdsIdx() );
        memberDeviceSession.mbNo( entity.getMbNo() );
        memberDeviceSession.deviceCode( entity.getDeviceCode() );
        memberDeviceSession.platform( entity.getPlatform() );

        return memberDeviceSession.build();
    }

    @Override
    public MemberDeviceSessionEntity toEntity(MemberDeviceSession domain) {
        if ( domain == null ) {
            return null;
        }

        Long mdsIdx = null;
        Long mbNo = null;
        String deviceCode = null;
        DeviceTypeEnum platform = null;

        mdsIdx = domain.getMdsIdx();
        mbNo = domain.getMbNo();
        deviceCode = domain.getDeviceCode();
        platform = domain.getPlatform();

        MemberDeviceSessionEntity memberDeviceSessionEntity = new MemberDeviceSessionEntity( mdsIdx, mbNo, deviceCode, platform );

        memberDeviceSessionEntity.setCreatedAt( domain.getCreatedAt() );
        memberDeviceSessionEntity.setUpdatedAt( domain.getUpdatedAt() );

        return memberDeviceSessionEntity;
    }
}
