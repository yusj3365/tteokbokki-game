package com.cmb.rainbowtv.domain.classarea.infra;

import com.cmb.rainbowtv.domain.classarea.infra.data.entity.ClassAreaByAreaEntity;
import com.cmb.rainbowtv.domain.classarea.infra.data.entity.ClassAreaEntity;
import com.cmb.rainbowtv.domain.classarea.model.ClassArea;
import com.cmb.rainbowtv.domain.classarea.model.ClassAreaByArea;
import com.cmb.rainbowtv.global.define.area.infra.data.entity.AreaDefineEntity;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
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
public class ClassAreaInfraMapperImpl implements ClassAreaInfraMapper {

    @Override
    public ClassArea toClassArea(ClassAreaEntity classAreaEntity) {
        if ( classAreaEntity == null ) {
            return null;
        }

        ClassArea.ClassAreaBuilder<?, ?> classArea = ClassArea.builder();

        classArea.createdAt( classAreaEntity.getCreatedAt() );
        classArea.updatedAt( classAreaEntity.getUpdatedAt() );
        classArea.caIdx( classAreaEntity.getCaIdx() );
        classArea.caName( classAreaEntity.getCaName() );
        classArea.caSeq( classAreaEntity.getCaSeq() );
        classArea.aosDisplay( classAreaEntity.getAosDisplay() );
        classArea.smartDisplay( classAreaEntity.getSmartDisplay() );
        classArea.ottAppDisplay( classAreaEntity.getOttAppDisplay() );
        classArea.caDefault( classAreaEntity.getCaDefault() );

        return classArea.build();
    }

    @Override
    public ClassAreaEntity toClassAreaEntity(ClassArea classArea) {
        if ( classArea == null ) {
            return null;
        }

        ClassAreaEntity.ClassAreaEntityBuilder classAreaEntity = ClassAreaEntity.builder();

        classAreaEntity.caIdx( classArea.getCaIdx() );
        classAreaEntity.caName( classArea.getCaName() );
        classAreaEntity.caSeq( classArea.getCaSeq() );
        classAreaEntity.aosDisplay( classArea.getAosDisplay() );
        classAreaEntity.smartDisplay( classArea.getSmartDisplay() );
        classAreaEntity.ottAppDisplay( classArea.getOttAppDisplay() );
        classAreaEntity.caDefault( classArea.getCaDefault() );

        return classAreaEntity.build();
    }

    @Override
    public ClassAreaByAreaEntity toClassAreaByAreaEntity(ClassAreaByArea classAreaByArea) {
        if ( classAreaByArea == null ) {
            return null;
        }

        ClassAreaByAreaEntity.ClassAreaByAreaEntityBuilder classAreaByAreaEntity = ClassAreaByAreaEntity.builder();

        classAreaByAreaEntity.cabaIdx( classAreaByArea.getCabaIdx() );
        classAreaByAreaEntity.classArea( toClassAreaEntity( classAreaByArea.getClassArea() ) );
        classAreaByAreaEntity.areaDefine( areaDefineToAreaDefineEntity( classAreaByArea.getAreaDefine() ) );
        classAreaByAreaEntity.cabaSi( classAreaByArea.getCabaSi() );

        return classAreaByAreaEntity.build();
    }

    @Override
    public List<ClassAreaByAreaEntity> toClassAreaByAreaEntityList(List<ClassAreaByArea> list) {
        if ( list == null ) {
            return null;
        }

        List<ClassAreaByAreaEntity> list1 = new ArrayList<ClassAreaByAreaEntity>( list.size() );
        for ( ClassAreaByArea classAreaByArea : list ) {
            list1.add( toClassAreaByAreaEntity( classAreaByArea ) );
        }

        return list1;
    }

    @Override
    public List<ClassAreaByArea> toClassAreaByAreaList(List<ClassAreaByAreaEntity> allByClassAreaCaIdx) {
        if ( allByClassAreaCaIdx == null ) {
            return null;
        }

        List<ClassAreaByArea> list = new ArrayList<ClassAreaByArea>( allByClassAreaCaIdx.size() );
        for ( ClassAreaByAreaEntity classAreaByAreaEntity : allByClassAreaCaIdx ) {
            list.add( classAreaByAreaEntityToClassAreaByArea( classAreaByAreaEntity ) );
        }

        return list;
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

    protected ClassAreaByArea classAreaByAreaEntityToClassAreaByArea(ClassAreaByAreaEntity classAreaByAreaEntity) {
        if ( classAreaByAreaEntity == null ) {
            return null;
        }

        ClassAreaByArea.ClassAreaByAreaBuilder<?, ?> classAreaByArea = ClassAreaByArea.builder();

        classAreaByArea.createdAt( classAreaByAreaEntity.getCreatedAt() );
        classAreaByArea.updatedAt( classAreaByAreaEntity.getUpdatedAt() );
        classAreaByArea.cabaIdx( classAreaByAreaEntity.getCabaIdx() );
        classAreaByArea.classArea( toClassArea( classAreaByAreaEntity.getClassArea() ) );
        classAreaByArea.areaDefine( areaDefineEntityToAreaDefine( classAreaByAreaEntity.getAreaDefine() ) );
        classAreaByArea.cabaSi( classAreaByAreaEntity.getCabaSi() );

        return classAreaByArea.build();
    }
}
