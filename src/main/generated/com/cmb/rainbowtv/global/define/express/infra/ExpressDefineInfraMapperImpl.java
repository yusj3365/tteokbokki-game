package com.cmb.rainbowtv.global.define.express.infra;

import com.cmb.rainbowtv.global.define.express.infra.data.entity.ExpressDefineEntity;
import com.cmb.rainbowtv.global.define.express.model.ExpressDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ExpressDefineInfraMapperImpl implements ExpressDefineInfraMapper {

    @Override
    public ExpressDefine toExpressDefine(ExpressDefineEntity expressDefineEntity) {
        if ( expressDefineEntity == null ) {
            return null;
        }

        ExpressDefine.ExpressDefineBuilder<?, ?> expressDefine = ExpressDefine.builder();

        expressDefine.createdAt( expressDefineEntity.getCreatedAt() );
        expressDefine.updatedAt( expressDefineEntity.getUpdatedAt() );
        expressDefine.edIdx( expressDefineEntity.getEdIdx() );
        expressDefine.edName( expressDefineEntity.getEdName() );
        expressDefine.edUrl( expressDefineEntity.getEdUrl() );
        expressDefine.edCode( expressDefineEntity.getEdCode() );
        expressDefine.edIsGlobal( expressDefineEntity.getEdIsGlobal() );
        expressDefine.edIsUse( expressDefineEntity.getEdIsUse() );

        return expressDefine.build();
    }
}
