package com.cmb.rainbowtv.global.define.authority.infra;

import com.cmb.rainbowtv.global.define.authority.infra.data.entity.CmsAuthorityDefineEntity;
import com.cmb.rainbowtv.global.define.authority.infra.data.entity.CrmAuthorityDefineEntity;
import com.cmb.rainbowtv.global.define.authority.model.CmsAuthorityDefine;
import com.cmb.rainbowtv.global.define.authority.model.CrmAuthorityDefine;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:49+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AuthorityDefineInfraMapperImpl implements AuthorityDefineInfraMapper {

    @Override
    public List<CrmAuthorityDefine> toCrmAuthorityDefineModelList(List<CrmAuthorityDefineEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<CrmAuthorityDefine> list = new ArrayList<CrmAuthorityDefine>( allById.size() );
        for ( CrmAuthorityDefineEntity crmAuthorityDefineEntity : allById ) {
            list.add( toCrmAuthorityDefineModel( crmAuthorityDefineEntity ) );
        }

        return list;
    }

    @Override
    public CrmAuthorityDefineEntity toCrmAuthorityDefineEntity(CrmAuthorityDefine crmAuthorityDefine) {
        if ( crmAuthorityDefine == null ) {
            return null;
        }

        CrmAuthorityDefineEntity.CrmAuthorityDefineEntityBuilder crmAuthorityDefineEntity = CrmAuthorityDefineEntity.builder();

        crmAuthorityDefineEntity.cadIdx( crmAuthorityDefine.getCadIdx() );
        crmAuthorityDefineEntity.cadDepth( crmAuthorityDefine.getCadDepth() );
        crmAuthorityDefineEntity.cadParent( crmAuthorityDefine.getCadParent() );
        crmAuthorityDefineEntity.cadName( crmAuthorityDefine.getCadName() );
        crmAuthorityDefineEntity.cadRoute( crmAuthorityDefine.getCadRoute() );

        return crmAuthorityDefineEntity.build();
    }

    @Override
    public CrmAuthorityDefine toCrmAuthorityDefineModel(CrmAuthorityDefineEntity save) {
        if ( save == null ) {
            return null;
        }

        CrmAuthorityDefine.CrmAuthorityDefineBuilder<?, ?> crmAuthorityDefine = CrmAuthorityDefine.builder();

        crmAuthorityDefine.createdAt( save.getCreatedAt() );
        crmAuthorityDefine.updatedAt( save.getUpdatedAt() );
        crmAuthorityDefine.cadIdx( save.getCadIdx() );
        crmAuthorityDefine.cadDepth( save.getCadDepth() );
        crmAuthorityDefine.cadParent( save.getCadParent() );
        crmAuthorityDefine.cadName( save.getCadName() );
        crmAuthorityDefine.cadRoute( save.getCadRoute() );

        return crmAuthorityDefine.build();
    }

    @Override
    public List<CmsAuthorityDefine> toCmsAuthorityDefineList(List<CmsAuthorityDefineEntity> allById) {
        if ( allById == null ) {
            return null;
        }

        List<CmsAuthorityDefine> list = new ArrayList<CmsAuthorityDefine>( allById.size() );
        for ( CmsAuthorityDefineEntity cmsAuthorityDefineEntity : allById ) {
            list.add( toCmsAuthorityDefineModel( cmsAuthorityDefineEntity ) );
        }

        return list;
    }

    @Override
    public CmsAuthorityDefine toCmsAuthorityDefineModel(CmsAuthorityDefineEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CmsAuthorityDefine.CmsAuthorityDefineBuilder<?, ?> cmsAuthorityDefine = CmsAuthorityDefine.builder();

        cmsAuthorityDefine.createdAt( entity.getCreatedAt() );
        cmsAuthorityDefine.updatedAt( entity.getUpdatedAt() );
        cmsAuthorityDefine.cadIdx( entity.getCadIdx() );
        cmsAuthorityDefine.cadDepth( entity.getCadDepth() );
        cmsAuthorityDefine.cadParent( entity.getCadParent() );
        cmsAuthorityDefine.cadName( entity.getCadName() );
        cmsAuthorityDefine.cadRoute( entity.getCadRoute() );

        return cmsAuthorityDefine.build();
    }

    @Override
    public CmsAuthorityDefineEntity toCmsAuthorityDefineEntity(CmsAuthorityDefine model) {
        if ( model == null ) {
            return null;
        }

        CmsAuthorityDefineEntity.CmsAuthorityDefineEntityBuilder cmsAuthorityDefineEntity = CmsAuthorityDefineEntity.builder();

        cmsAuthorityDefineEntity.cadIdx( model.getCadIdx() );
        cmsAuthorityDefineEntity.cadDepth( model.getCadDepth() );
        cmsAuthorityDefineEntity.cadParent( model.getCadParent() );
        cmsAuthorityDefineEntity.cadName( model.getCadName() );
        cmsAuthorityDefineEntity.cadRoute( model.getCadRoute() );

        return cmsAuthorityDefineEntity.build();
    }
}
