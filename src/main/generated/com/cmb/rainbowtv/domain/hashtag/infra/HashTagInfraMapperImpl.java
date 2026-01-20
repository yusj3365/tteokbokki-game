package com.cmb.rainbowtv.domain.hashtag.infra;

import com.cmb.rainbowtv.domain.hashtag.infra.data.entity.HashtagEntity;
import com.cmb.rainbowtv.domain.hashtag.model.Hashtag;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:40+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class HashTagInfraMapperImpl implements HashTagInfraMapper {

    @Override
    public Hashtag toHashtag(HashtagEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Hashtag.HashtagBuilder<?, ?> hashtag = Hashtag.builder();

        hashtag.createdAt( entity.getCreatedAt() );
        hashtag.updatedAt( entity.getUpdatedAt() );
        hashtag.htIdx( entity.getHtIdx() );
        hashtag.name( entity.getName() );

        return hashtag.build();
    }

    @Override
    public HashtagEntity toHashtagEntity(Hashtag model) {
        if ( model == null ) {
            return null;
        }

        HashtagEntity.HashtagEntityBuilder hashtagEntity = HashtagEntity.builder();

        hashtagEntity.htIdx( model.getHtIdx() );
        hashtagEntity.name( model.getName() );

        return hashtagEntity.build();
    }
}
