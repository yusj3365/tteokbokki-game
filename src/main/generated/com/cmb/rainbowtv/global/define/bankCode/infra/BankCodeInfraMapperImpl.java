package com.cmb.rainbowtv.global.define.bankCode.infra;

import com.cmb.rainbowtv.global.define.bankCode.infra.data.entity.BankCodeDefineEntity;
import com.cmb.rainbowtv.global.define.bankCode.model.BankCodeDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:39+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class BankCodeInfraMapperImpl implements BankCodeInfraMapper {

    @Override
    public BankCodeDefine toBankCode(BankCodeDefineEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BankCodeDefine.BankCodeDefineBuilder<?, ?> bankCodeDefine = BankCodeDefine.builder();

        bankCodeDefine.baIdx( entity.getBaIdx() );
        bankCodeDefine.baCode( entity.getBaCode() );
        bankCodeDefine.baName( entity.getBaName() );
        bankCodeDefine.isUsed( entity.getIsUsed() );
        bankCodeDefine.baSeq( entity.getBaSeq() );

        return bankCodeDefine.build();
    }
}
