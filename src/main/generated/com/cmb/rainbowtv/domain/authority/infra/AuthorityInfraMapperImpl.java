package com.cmb.rainbowtv.domain.authority.infra;

import com.cmb.rainbowtv.domain.authority.infra.data.entity.AdminCmsFormatEntity;
import com.cmb.rainbowtv.domain.authority.infra.data.entity.AdminCmsFormatInfoEntity;
import com.cmb.rainbowtv.domain.authority.infra.data.entity.AdminCrmFormatEntity;
import com.cmb.rainbowtv.domain.authority.infra.data.entity.AdminCrmFormatInfoEntity;
import com.cmb.rainbowtv.domain.authority.model.AdminCmsFormat;
import com.cmb.rainbowtv.domain.authority.model.AdminCmsFormatInfo;
import com.cmb.rainbowtv.domain.authority.model.AdminCrmFormat;
import com.cmb.rainbowtv.domain.authority.model.AdminCrmFormatInfo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:45+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AuthorityInfraMapperImpl implements AuthorityInfraMapper {

    @Override
    public AdminCrmFormatEntity toAdminCrmFormatEntity(AdminCrmFormat adminCrmFormatModel) {
        if ( adminCrmFormatModel == null ) {
            return null;
        }

        AdminCrmFormatEntity.AdminCrmFormatEntityBuilder adminCrmFormatEntity = AdminCrmFormatEntity.builder();

        adminCrmFormatEntity.acfIdx( adminCrmFormatModel.getAcfIdx() );
        adminCrmFormatEntity.acfName( adminCrmFormatModel.getAcfName() );
        adminCrmFormatEntity.acfCrmAccess( adminCrmFormatModel.getAcfCrmAccess() );

        return adminCrmFormatEntity.build();
    }

    @Override
    public AdminCrmFormat toAdminCrmFormatModel(AdminCrmFormatEntity save) {
        if ( save == null ) {
            return null;
        }

        AdminCrmFormat.AdminCrmFormatBuilder<?, ?> adminCrmFormat = AdminCrmFormat.builder();

        adminCrmFormat.createdAt( save.getCreatedAt() );
        adminCrmFormat.updatedAt( save.getUpdatedAt() );
        adminCrmFormat.acfIdx( save.getAcfIdx() );
        adminCrmFormat.acfName( save.getAcfName() );
        adminCrmFormat.acfCrmAccess( save.getAcfCrmAccess() );

        return adminCrmFormat.build();
    }

    @Override
    public List<AdminCrmFormatInfoEntity> toAdminCrmFormatInfoEntity(List<AdminCrmFormatInfo> adminCrmFormatInfoList) {
        if ( adminCrmFormatInfoList == null ) {
            return null;
        }

        List<AdminCrmFormatInfoEntity> list = new ArrayList<AdminCrmFormatInfoEntity>( adminCrmFormatInfoList.size() );
        for ( AdminCrmFormatInfo adminCrmFormatInfo : adminCrmFormatInfoList ) {
            list.add( adminCrmFormatInfoToAdminCrmFormatInfoEntity( adminCrmFormatInfo ) );
        }

        return list;
    }

    @Override
    public AdminCmsFormatEntity toAdminCmsFormatEntity(AdminCmsFormat adminCmsFormatModel) {
        if ( adminCmsFormatModel == null ) {
            return null;
        }

        AdminCmsFormatEntity.AdminCmsFormatEntityBuilder adminCmsFormatEntity = AdminCmsFormatEntity.builder();

        adminCmsFormatEntity.acfIdx( adminCmsFormatModel.getAcfIdx() );
        adminCmsFormatEntity.acfName( adminCmsFormatModel.getAcfName() );
        adminCmsFormatEntity.acfCmsAccess( adminCmsFormatModel.getAcfCmsAccess() );

        return adminCmsFormatEntity.build();
    }

    @Override
    public List<AdminCmsFormatInfoEntity> toAdminCmsFormatInfoEntity(List<AdminCmsFormatInfo> adminCmsFormatInfoList) {
        if ( adminCmsFormatInfoList == null ) {
            return null;
        }

        List<AdminCmsFormatInfoEntity> list = new ArrayList<AdminCmsFormatInfoEntity>( adminCmsFormatInfoList.size() );
        for ( AdminCmsFormatInfo adminCmsFormatInfo : adminCmsFormatInfoList ) {
            list.add( adminCmsFormatInfoToAdminCmsFormatInfoEntity( adminCmsFormatInfo ) );
        }

        return list;
    }

    @Override
    public AdminCmsFormat toAdminCmsFormat(AdminCmsFormatEntity save) {
        if ( save == null ) {
            return null;
        }

        AdminCmsFormat.AdminCmsFormatBuilder<?, ?> adminCmsFormat = AdminCmsFormat.builder();

        adminCmsFormat.createdAt( save.getCreatedAt() );
        adminCmsFormat.updatedAt( save.getUpdatedAt() );
        adminCmsFormat.acfIdx( save.getAcfIdx() );
        adminCmsFormat.acfName( save.getAcfName() );
        adminCmsFormat.acfCmsAccess( save.getAcfCmsAccess() );

        return adminCmsFormat.build();
    }

    protected AdminCrmFormatInfoEntity adminCrmFormatInfoToAdminCrmFormatInfoEntity(AdminCrmFormatInfo adminCrmFormatInfo) {
        if ( adminCrmFormatInfo == null ) {
            return null;
        }

        AdminCrmFormatInfoEntity.AdminCrmFormatInfoEntityBuilder adminCrmFormatInfoEntity = AdminCrmFormatInfoEntity.builder();

        adminCrmFormatInfoEntity.acfiIdx( adminCrmFormatInfo.getAcfiIdx() );
        adminCrmFormatInfoEntity.adminCrmFormat( toAdminCrmFormatEntity( adminCrmFormatInfo.getAdminCrmFormat() ) );
        adminCrmFormatInfoEntity.acfiType( adminCrmFormatInfo.getAcfiType() );
        adminCrmFormatInfoEntity.acfiKey( adminCrmFormatInfo.getAcfiKey() );

        return adminCrmFormatInfoEntity.build();
    }

    protected AdminCmsFormatInfoEntity adminCmsFormatInfoToAdminCmsFormatInfoEntity(AdminCmsFormatInfo adminCmsFormatInfo) {
        if ( adminCmsFormatInfo == null ) {
            return null;
        }

        AdminCmsFormatInfoEntity.AdminCmsFormatInfoEntityBuilder adminCmsFormatInfoEntity = AdminCmsFormatInfoEntity.builder();

        adminCmsFormatInfoEntity.acfiIdx( adminCmsFormatInfo.getAcfiIdx() );
        adminCmsFormatInfoEntity.adminCmsFormat( toAdminCmsFormatEntity( adminCmsFormatInfo.getAdminCmsFormat() ) );
        adminCmsFormatInfoEntity.acfiType( adminCmsFormatInfo.getAcfiType() );
        adminCmsFormatInfoEntity.acfiKey( adminCmsFormatInfo.getAcfiKey() );

        return adminCmsFormatInfoEntity.build();
    }
}
