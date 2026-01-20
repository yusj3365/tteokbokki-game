package com.cmb.rainbowtv.domain.channel.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelGenreEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelInfoEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelGenre;
import com.cmb.rainbowtv.domain.channel.model.ChannelInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:47+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ChannelInfoInfraMapperImpl implements ChannelInfoInfraMapper {

    @Override
    public ChannelInfo toChannelInfo(ChannelInfoEntity ChannelInfoEntity) {
        if ( ChannelInfoEntity == null ) {
            return null;
        }

        ChannelInfo.ChannelInfoBuilder<?, ?> channelInfo = ChannelInfo.builder();

        channelInfo.createdAt( ChannelInfoEntity.getCreatedAt() );
        channelInfo.updatedAt( ChannelInfoEntity.getUpdatedAt() );
        channelInfo.ciIdx( ChannelInfoEntity.getCiIdx() );
        channelInfo.channel( channelEntityToChannel( ChannelInfoEntity.getChannel() ) );
        channelInfo.ciEpg( ChannelInfoEntity.getCiEpg() );
        channelInfo.ciBlackout( ChannelInfoEntity.getCiBlackout() );
        channelInfo.ciName( ChannelInfoEntity.getCiName() );
        channelInfo.ciStatus( ChannelInfoEntity.getCiStatus() );
        channelInfo.ciIsLive( ChannelInfoEntity.getCiIsLive() );
        channelInfo.ciSeq( ChannelInfoEntity.getCiSeq() );
        channelInfo.ciIsAdult( ChannelInfoEntity.getCiIsAdult() );
        channelInfo.ciIsPay( ChannelInfoEntity.getCiIsPay() );
        channelInfo.channelGenre( channelGenreEntityToChannelGenre( ChannelInfoEntity.getChannelGenre() ) );
        channelInfo.ciType( ChannelInfoEntity.getCiType() );
        channelInfo.ciFeeType( ChannelInfoEntity.getCiFeeType() );
        channelInfo.ciFee( ChannelInfoEntity.getCiFee() );
        channelInfo.ciInvest( ChannelInfoEntity.getCiInvest() );

        return channelInfo.build();
    }

    @Override
    public ChannelInfoEntity toChannelInfoEntity(ChannelInfo ChannelInfo) {
        if ( ChannelInfo == null ) {
            return null;
        }

        ChannelInfoEntity.ChannelInfoEntityBuilder channelInfoEntity = ChannelInfoEntity.builder();

        channelInfoEntity.ciIdx( ChannelInfo.getCiIdx() );
        channelInfoEntity.channel( channelToChannelEntity( ChannelInfo.getChannel() ) );
        channelInfoEntity.ciEpg( ChannelInfo.getCiEpg() );
        channelInfoEntity.ciBlackout( ChannelInfo.getCiBlackout() );
        channelInfoEntity.ciName( ChannelInfo.getCiName() );
        channelInfoEntity.ciStatus( ChannelInfo.getCiStatus() );
        channelInfoEntity.ciIsLive( ChannelInfo.getCiIsLive() );
        channelInfoEntity.ciSeq( ChannelInfo.getCiSeq() );
        channelInfoEntity.ciIsAdult( ChannelInfo.getCiIsAdult() );
        channelInfoEntity.ciIsPay( ChannelInfo.getCiIsPay() );
        channelInfoEntity.channelGenre( channelGenreToChannelGenreEntity( ChannelInfo.getChannelGenre() ) );
        channelInfoEntity.ciType( ChannelInfo.getCiType() );
        channelInfoEntity.ciFeeType( ChannelInfo.getCiFeeType() );
        channelInfoEntity.ciFee( ChannelInfo.getCiFee() );
        channelInfoEntity.ciInvest( ChannelInfo.getCiInvest() );

        return channelInfoEntity.build();
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

    protected ChannelGenre channelGenreEntityToChannelGenre(ChannelGenreEntity channelGenreEntity) {
        if ( channelGenreEntity == null ) {
            return null;
        }

        ChannelGenre.ChannelGenreBuilder<?, ?> channelGenre = ChannelGenre.builder();

        channelGenre.createdAt( channelGenreEntity.getCreatedAt() );
        channelGenre.updatedAt( channelGenreEntity.getUpdatedAt() );
        channelGenre.cgIdx( channelGenreEntity.getCgIdx() );
        channelGenre.cgName( channelGenreEntity.getCgName() );

        return channelGenre.build();
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

    protected ChannelGenreEntity channelGenreToChannelGenreEntity(ChannelGenre channelGenre) {
        if ( channelGenre == null ) {
            return null;
        }

        ChannelGenreEntity.ChannelGenreEntityBuilder channelGenreEntity = ChannelGenreEntity.builder();

        channelGenreEntity.cgIdx( channelGenre.getCgIdx() );
        channelGenreEntity.cgName( channelGenre.getCgName() );

        return channelGenreEntity.build();
    }
}
