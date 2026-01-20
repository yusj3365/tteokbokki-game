package com.cmb.rainbowtv.domain.eventTap.infra;

import com.cmb.rainbowtv.domain.eventTap.infra.data.entity.EventTapEntity;
import com.cmb.rainbowtv.domain.eventTap.model.EventTap;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class EventTapMapperImpl implements EventTapMapper {

    @Override
    public EventTap toEventTap(EventTapEntity eventTapEntity) {
        if ( eventTapEntity == null ) {
            return null;
        }

        EventTap.EventTapBuilder<?, ?> eventTap = EventTap.builder();

        eventTap.createdAt( eventTapEntity.getCreatedAt() );
        eventTap.updatedAt( eventTapEntity.getUpdatedAt() );
        eventTap.etIdx( eventTapEntity.getEtIdx() );
        eventTap.etIsVisible( eventTapEntity.getEtIsVisible() );
        eventTap.etCode( eventTapEntity.getEtCode() );

        return eventTap.build();
    }

    @Override
    public EventTapEntity toEventTapEntity(EventTap eventTap) {
        if ( eventTap == null ) {
            return null;
        }

        EventTapEntity.EventTapEntityBuilder eventTapEntity = EventTapEntity.builder();

        eventTapEntity.etIdx( eventTap.getEtIdx() );
        eventTapEntity.etCode( eventTap.getEtCode() );
        eventTapEntity.etIsVisible( eventTap.getEtIsVisible() );

        return eventTapEntity.build();
    }
}
