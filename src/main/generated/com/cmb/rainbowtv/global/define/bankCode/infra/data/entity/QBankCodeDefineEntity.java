package com.cmb.rainbowtv.global.define.bankCode.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBankCodeDefineEntity is a Querydsl query type for BankCodeDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBankCodeDefineEntity extends EntityPathBase<BankCodeDefineEntity> {

    private static final long serialVersionUID = -2050369744L;

    public static final QBankCodeDefineEntity bankCodeDefineEntity = new QBankCodeDefineEntity("bankCodeDefineEntity");

    public final NumberPath<Integer> baCode = createNumber("baCode", Integer.class);

    public final NumberPath<Long> baIdx = createNumber("baIdx", Long.class);

    public final StringPath baName = createString("baName");

    public final NumberPath<Integer> baSeq = createNumber("baSeq", Integer.class);

    public final NumberPath<Integer> isUsed = createNumber("isUsed", Integer.class);

    public QBankCodeDefineEntity(String variable) {
        super(BankCodeDefineEntity.class, forVariable(variable));
    }

    public QBankCodeDefineEntity(Path<? extends BankCodeDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBankCodeDefineEntity(PathMetadata metadata) {
        super(BankCodeDefineEntity.class, metadata);
    }

}

