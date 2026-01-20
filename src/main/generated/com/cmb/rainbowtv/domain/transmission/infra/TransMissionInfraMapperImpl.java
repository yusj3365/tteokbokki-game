package com.cmb.rainbowtv.domain.transmission.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.transmission.infra.data.entity.TransmissionImpossibleDeviceEntity;
import com.cmb.rainbowtv.domain.transmission.infra.data.entity.TransmissionImpossibleEntity;
import com.cmb.rainbowtv.domain.transmission.model.TransmissionImpossible;
import com.cmb.rainbowtv.domain.transmission.model.TransmissionImpossibleDevice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class TransMissionInfraMapperImpl implements TransMissionInfraMapper {

    @Override
    public TransmissionImpossible toTransmissionImpossible(TransmissionImpossibleEntity transmissionImpossibleEntity) {
        if ( transmissionImpossibleEntity == null ) {
            return null;
        }

        TransmissionImpossible.TransmissionImpossibleBuilder<?, ?> transmissionImpossible = TransmissionImpossible.builder();

        transmissionImpossible.createdAt( transmissionImpossibleEntity.getCreatedAt() );
        transmissionImpossible.updatedAt( transmissionImpossibleEntity.getUpdatedAt() );
        transmissionImpossible.tiIdx( transmissionImpossibleEntity.getTiIdx() );
        transmissionImpossible.channel( channelEntityToChannel( transmissionImpossibleEntity.getChannel() ) );
        transmissionImpossible.tiStartTime( transmissionImpossibleEntity.getTiStartTime() );
        transmissionImpossible.tiEndTime( transmissionImpossibleEntity.getTiEndTime() );

        return transmissionImpossible.build();
    }

    @Override
    public TransmissionImpossibleEntity toTransmissionImpossibleEntity(TransmissionImpossible transmissionImpossible) {
        if ( transmissionImpossible == null ) {
            return null;
        }

        TransmissionImpossibleEntity.TransmissionImpossibleEntityBuilder transmissionImpossibleEntity = TransmissionImpossibleEntity.builder();

        transmissionImpossibleEntity.tiIdx( transmissionImpossible.getTiIdx() );
        transmissionImpossibleEntity.channel( channelToChannelEntity( transmissionImpossible.getChannel() ) );
        transmissionImpossibleEntity.tiStartTime( transmissionImpossible.getTiStartTime() );
        transmissionImpossibleEntity.tiEndTime( transmissionImpossible.getTiEndTime() );

        return transmissionImpossibleEntity.build();
    }

    @Override
    public TransmissionImpossibleDeviceEntity toTransmissionImpossibleDeviceEntity(TransmissionImpossibleDevice device) {
        if ( device == null ) {
            return null;
        }

        TransmissionImpossibleDeviceEntity.TransmissionImpossibleDeviceEntityBuilder transmissionImpossibleDeviceEntity = TransmissionImpossibleDeviceEntity.builder();

        transmissionImpossibleDeviceEntity.tidIdx( device.getTidIdx() );
        transmissionImpossibleDeviceEntity.transmissionImpossible( toTransmissionImpossibleEntity( device.getTransmissionImpossible() ) );
        transmissionImpossibleDeviceEntity.tidType( device.getTidType() );

        return transmissionImpossibleDeviceEntity.build();
    }

    protected Channel channelEntityToChannel(ChannelEntity channelEntity) {
        if ( channelEntity == null ) {
            return null;
        }

        Channel.ChannelBuilder<?, ?> channel = Channel.builder();

        channel.createdAt( channelEntity.getCreatedAt() );
        channel.updatedAt( channelEntity.getUpdatedAt() );
        channel.caIdx( channelEntity.getCaIdx() );
        channel.caType( channelEntity.getCaType() );
        channel.caLiveChannel( channelEntity.getCaLiveChannel() );
        channel.caPackageChannel( channelEntity.getCaPackageChannel() );
        channel.caLiveInput( channelEntity.getCaLiveInput() );
        channel.caEndpoint( channelEntity.getCaEndpoint() );
        channel.caDestination( channelEntity.getCaDestination() );
        channel.caDestinationExtra( channelEntity.getCaDestinationExtra() );
        channel.caDashUrl( channelEntity.getCaDashUrl() );
        channel.caHlsUrl( channelEntity.getCaHlsUrl() );
        channel.caIsUse( channelEntity.getCaIsUse() );

        return channel.build();
    }

    protected ChannelEntity channelToChannelEntity(Channel channel) {
        if ( channel == null ) {
            return null;
        }

        ChannelEntity.ChannelEntityBuilder channelEntity = ChannelEntity.builder();

        channelEntity.caIdx( channel.getCaIdx() );
        channelEntity.caType( channel.getCaType() );
        channelEntity.caLiveChannel( channel.getCaLiveChannel() );
        channelEntity.caPackageChannel( channel.getCaPackageChannel() );
        channelEntity.caLiveInput( channel.getCaLiveInput() );
        channelEntity.caEndpoint( channel.getCaEndpoint() );
        channelEntity.caDestination( channel.getCaDestination() );
        channelEntity.caDestinationExtra( channel.getCaDestinationExtra() );
        channelEntity.caDashUrl( channel.getCaDashUrl() );
        channelEntity.caHlsUrl( channel.getCaHlsUrl() );
        channelEntity.caIsUse( channel.getCaIsUse() );

        return channelEntity.build();
    }
}
