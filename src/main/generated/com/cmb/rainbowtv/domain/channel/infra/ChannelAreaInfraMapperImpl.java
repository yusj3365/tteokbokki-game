package com.cmb.rainbowtv.domain.channel.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelByAreaEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelArea;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:47+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ChannelAreaInfraMapperImpl implements ChannelAreaInfraMapper {

    @Override
    public ChannelArea toChannelArea(ChannelByAreaEntity ChannelByAreaEntity) {
        if ( ChannelByAreaEntity == null ) {
            return null;
        }

        ChannelArea.ChannelAreaBuilder<?, ?> channelArea = ChannelArea.builder();

        channelArea.createdAt( ChannelByAreaEntity.getCreatedAt() );
        channelArea.updatedAt( ChannelByAreaEntity.getUpdatedAt() );
        channelArea.cbaIdx( ChannelByAreaEntity.getCbaIdx() );
        channelArea.channel( channelEntityToChannel( ChannelByAreaEntity.getChannel() ) );
        channelArea.areaDefine( areaDefineEntityToAreaDefine( ChannelByAreaEntity.getAreaDefine() ) );
        channelArea.cbaSi( ChannelByAreaEntity.getCbaSi() );

        return channelArea.build();
    }

    @Override
    public ChannelByAreaEntity toChannelByAreaEntity(ChannelArea ChannelArea) {
        if ( ChannelArea == null ) {
            return null;
        }

        ChannelByAreaEntity.ChannelByAreaEntityBuilder channelByAreaEntity = ChannelByAreaEntity.builder();

        channelByAreaEntity.cbaIdx( ChannelArea.getCbaIdx() );
        channelByAreaEntity.channel( channelToChannelEntity( ChannelArea.getChannel() ) );
        channelByAreaEntity.areaDefine( areaDefineToAreaDefineEntity( ChannelArea.getAreaDefine() ) );
        channelByAreaEntity.cbaSi( ChannelArea.getCbaSi() );

        return channelByAreaEntity.build();
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

    protected AreaDefine areaDefineEntityToAreaDefine(AreaDefineEntity areaDefineEntity) {
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

    protected AreaDefineEntity areaDefineToAreaDefineEntity(AreaDefine areaDefine) {
        if ( areaDefine == null ) {
            return null;
        }

        AreaDefineEntity.AreaDefineEntityBuilder areaDefineEntity = AreaDefineEntity.builder();

        areaDefineEntity.adIdx( areaDefine.getAdIdx() );
        areaDefineEntity.adParent( areaDefine.getAdParent() );
        areaDefineEntity.adAdministCode( areaDefine.getAdAdministCode() );
        areaDefineEntity.adSi( areaDefine.getAdSi() );
        areaDefineEntity.adShortSi( areaDefine.getAdShortSi() );
        areaDefineEntity.adGu( areaDefine.getAdGu() );
        areaDefineEntity.adDong( areaDefine.getAdDong() );
        areaDefineEntity.adLegalCode( areaDefine.getAdLegalCode() );
        areaDefineEntity.adDongName( areaDefine.getAdDongName() );
        areaDefineEntity.adCreateDate( areaDefine.getAdCreateDate() );
        areaDefineEntity.adIsExpressCost( areaDefine.getAdIsExpressCost() );

        return areaDefineEntity.build();
    }
}
