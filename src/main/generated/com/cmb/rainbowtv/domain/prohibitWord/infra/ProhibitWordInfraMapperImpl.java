package com.cmb.rainbowtv.domain.prohibitWord.infra;

import com.cmb.rainbowtv.domain.prohibitWord.infra.data.data.entity.ProhibitWordEntity;
import com.cmb.rainbowtv.domain.prohibitWord.model.ProhibitWord;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:46+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ProhibitWordInfraMapperImpl implements ProhibitWordInfraMapper {

    @Override
    public ProhibitWord toProhibitWord(ProhibitWordEntity prohibitWordEntity) {
        if ( prohibitWordEntity == null ) {
            return null;
        }

        ProhibitWord.ProhibitWordBuilder<?, ?> prohibitWord = ProhibitWord.builder();

        prohibitWord.createdAt( prohibitWordEntity.getCreatedAt() );
        prohibitWord.updatedAt( prohibitWordEntity.getUpdatedAt() );
        prohibitWord.pwIdx( prohibitWordEntity.getPwIdx() );
        prohibitWord.pwContext( prohibitWordEntity.getPwContext() );

        return prohibitWord.build();
    }

    @Override
    public ProhibitWordEntity toProhibitWordEntity(ProhibitWord prohibitWord) {
        if ( prohibitWord == null ) {
            return null;
        }

        ProhibitWordEntity.ProhibitWordEntityBuilder prohibitWordEntity = ProhibitWordEntity.builder();

        prohibitWordEntity.pwIdx( prohibitWord.getPwIdx() );
        prohibitWordEntity.pwContext( prohibitWord.getPwContext() );

        return prohibitWordEntity.build();
    }
}
