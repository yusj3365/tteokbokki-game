package com.cmb.rainbowtv.domain.channel.infra;

import com.cmb.rainbowtv.domain.channel.infra.data.entity.ChannelGenreEntity;
import com.cmb.rainbowtv.domain.channel.model.ChannelGenre;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ChannelGenreInfraMapperImpl implements ChannelGenreInfraMapper {

    @Override
    public ChannelGenre toChannelGenre(ChannelGenreEntity channelGenreEntity) {
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

    @Override
    public ChannelGenreEntity toChannelGenreEntity(ChannelGenre channelGenre) {
        if ( channelGenre == null ) {
            return null;
        }

        ChannelGenreEntity.ChannelGenreEntityBuilder channelGenreEntity = ChannelGenreEntity.builder();

        channelGenreEntity.cgIdx( channelGenre.getCgIdx() );
        channelGenreEntity.cgName( channelGenre.getCgName() );

        return channelGenreEntity.build();
    }
}
