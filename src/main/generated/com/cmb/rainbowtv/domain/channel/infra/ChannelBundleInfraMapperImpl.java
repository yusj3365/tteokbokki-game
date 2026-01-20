package com.cmb.rainbowtv.domain.channel.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelBundleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelByBundleEntity;
import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelEntity;
import com.cmb.rainbowtv.domain.channel.model.Channel;
import com.cmb.rainbowtv.domain.channel.model.ChannelBundle;
import com.cmb.rainbowtv.domain.channel.model.ChannelByBundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ChannelBundleInfraMapperImpl implements ChannelBundleInfraMapper {

    @Override
    public ChannelBundleEntity toChannelBundleEntity(ChannelBundle channelBundle) {
        if ( channelBundle == null ) {
            return null;
        }

        ChannelBundleEntity.ChannelBundleEntityBuilder channelBundleEntity = ChannelBundleEntity.builder();

        channelBundleEntity.cbIdx( channelBundle.getCbIdx() );
        channelBundleEntity.cbType( channelBundle.getCbType() );
        channelBundleEntity.cbName( channelBundle.getCbName() );
        channelBundleEntity.cbPrice( channelBundle.getCbPrice() );
        channelBundleEntity.cbFeeType( channelBundle.getCbFeeType() );
        channelBundleEntity.cbFee( channelBundle.getCbFee() );
        channelBundleEntity.cbInvest( channelBundle.getCbInvest() );

        return channelBundleEntity.build();
    }

    @Override
    public ChannelBundle toChannelBundle(ChannelBundleEntity channelBundleEntity) {
        if ( channelBundleEntity == null ) {
            return null;
        }

        ChannelBundle.ChannelBundleBuilder<?, ?> channelBundle = ChannelBundle.builder();

        channelBundle.createdAt( channelBundleEntity.getCreatedAt() );
        channelBundle.updatedAt( channelBundleEntity.getUpdatedAt() );
        channelBundle.cbIdx( channelBundleEntity.getCbIdx() );
        channelBundle.cbType( channelBundleEntity.getCbType() );
        channelBundle.cbName( channelBundleEntity.getCbName() );
        channelBundle.cbPrice( channelBundleEntity.getCbPrice() );
        channelBundle.cbFeeType( channelBundleEntity.getCbFeeType() );
        channelBundle.cbFee( channelBundleEntity.getCbFee() );
        channelBundle.cbInvest( channelBundleEntity.getCbInvest() );

        return channelBundle.build();
    }

    @Override
    public List<ChannelByBundle> toChannelByBundleList(List<ChannelByBundleEntity> allByChannelCaIdx) {
        if ( allByChannelCaIdx == null ) {
            return null;
        }

        List<ChannelByBundle> list = new ArrayList<ChannelByBundle>( allByChannelCaIdx.size() );
        for ( ChannelByBundleEntity channelByBundleEntity : allByChannelCaIdx ) {
            list.add( channelByBundleEntityToChannelByBundle( channelByBundleEntity ) );
        }

        return list;
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

    protected ChannelByBundle channelByBundleEntityToChannelByBundle(ChannelByBundleEntity channelByBundleEntity) {
        if ( channelByBundleEntity == null ) {
            return null;
        }

        ChannelByBundle.ChannelByBundleBuilder<?, ?> channelByBundle = ChannelByBundle.builder();

        channelByBundle.cbbIdx( channelByBundleEntity.getCbbIdx() );
        channelByBundle.channelBundle( toChannelBundle( channelByBundleEntity.getChannelBundle() ) );
        channelByBundle.channel( channelEntityToChannel( channelByBundleEntity.getChannel() ) );

        return channelByBundle.build();
    }
}
