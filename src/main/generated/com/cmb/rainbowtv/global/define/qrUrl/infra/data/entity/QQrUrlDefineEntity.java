package com.cmb.rainbowtv.global.define.qrUrl.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QQrUrlDefineEntity is a Querydsl query type for QrUrlDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQrUrlDefineEntity extends EntityPathBase<QrUrlDefineEntity> {

    private static final long serialVersionUID = -2019901978L;

    public static final QQrUrlDefineEntity qrUrlDefineEntity = new QQrUrlDefineEntity("qrUrlDefineEntity");

    public final NumberPath<Long> quIdx = createNumber("quIdx", Long.class);

    public final StringPath quType = createString("quType");

    public final StringPath quUrl = createString("quUrl");

    public QQrUrlDefineEntity(String variable) {
        super(QrUrlDefineEntity.class, forVariable(variable));
    }

    public QQrUrlDefineEntity(Path<? extends QrUrlDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQrUrlDefineEntity(PathMetadata metadata) {
        super(QrUrlDefineEntity.class, metadata);
    }

}

