package com.cmb.rainbowtv.domain.sms.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSmsSendEntity is a Querydsl query type for SmsSendEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSmsSendEntity extends EntityPathBase<SmsSendEntity> {

    private static final long serialVersionUID = 1805449465L;

    public static final QSmsSendEntity smsSendEntity = new QSmsSendEntity("smsSendEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath ssCode = createString("ssCode");

    public final NumberPath<Long> ssError = createNumber("ssError", Long.class);

    public final NumberPath<Long> ssIdx = createNumber("ssIdx", Long.class);

    public final NumberPath<Long> ssKey = createNumber("ssKey", Long.class);

    public final StringPath ssSender = createString("ssSender");

    public final NumberPath<Long> ssSuccess = createNumber("ssSuccess", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSmsSendEntity(String variable) {
        super(SmsSendEntity.class, forVariable(variable));
    }

    public QSmsSendEntity(Path<? extends SmsSendEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSmsSendEntity(PathMetadata metadata) {
        super(SmsSendEntity.class, metadata);
    }

}

