package com.cmb.rainbowtv.domain.channel.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelTypeEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelType;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ChannelTypeInfraMapperImpl implements ChannelTypeInfraMapper {

    @Override
    public ChannelType toChannelType(ChannelTypeEntity ChannelTypeEntity) {
        if ( ChannelTypeEntity == null ) {
            return null;
        }

        ChannelType.ChannelTypeBuilder<?, ?> channelType = ChannelType.builder();

        channelType.ctIdx( ChannelTypeEntity.getCtIdx() );
        channelType.channel( channelEntityToChannel( ChannelTypeEntity.getChannel() ) );
        channelType.ctType( ChannelTypeEntity.getCtType() );

        return channelType.build();
    }

    @Override
    public ChannelTypeEntity toChannelTypeEntity(ChannelType ChannelType) {
        if ( ChannelType == null ) {
            return null;
        }

        ChannelTypeEntity.ChannelTypeEntityBuilder channelTypeEntity = ChannelTypeEntity.builder();

        channelTypeEntity.ctIdx( ChannelType.getCtIdx() );
        channelTypeEntity.channel( channelToChannelEntity( ChannelType.getChannel() ) );
        channelTypeEntity.ctType( ChannelType.getCtType() );

        return channelTypeEntity.build();
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
