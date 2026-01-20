package com.cmb.rainbowtv.global.define.awsKey.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAwsKeyDefineEntity is a Querydsl query type for AwsKeyDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAwsKeyDefineEntity extends EntityPathBase<AwsKeyDefineEntity> {

    private static final long serialVersionUID = -711162032L;

    public static final QAwsKeyDefineEntity awsKeyDefineEntity = new QAwsKeyDefineEntity("awsKeyDefineEntity");

    public final StringPath akAccessKey = createString("akAccessKey");

    public final NumberPath<Long> akIdx = createNumber("akIdx", Long.class);

    public final StringPath akSecretAccessKey = createString("akSecretAccessKey");

    public QAwsKeyDefineEntity(String variable) {
        super(AwsKeyDefineEntity.class, forVariable(variable));
    }

    public QAwsKeyDefineEntity(Path<? extends AwsKeyDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAwsKeyDefineEntity(PathMetadata metadata) {
        super(AwsKeyDefineEntity.class, metadata);
    }

}

