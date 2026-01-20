package com.cmb.rainbowtv.global.define.awsKey.infra;

import com.cmb.rainbowtv.global.define.awsKey.infra.data.entity.AwsKeyDefineEntity;
import com.cmb.rainbowtv.global.define.awsKey.model.AwsKeyDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:40+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class AwsKeyInfraMapperImpl implements AwsKeyInfraMapper {

    @Override
    public AwsKeyDefine toAwsKeyDefine(AwsKeyDefineEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AwsKeyDefine.AwsKeyDefineBuilder<?, ?> awsKeyDefine = AwsKeyDefine.builder();

        awsKeyDefine.akIdx( entity.getAkIdx() );
        awsKeyDefine.akAccessKey( entity.getAkAccessKey() );
        awsKeyDefine.akSecretAccessKey( entity.getAkSecretAccessKey() );

        return awsKeyDefine.build();
    }
}
