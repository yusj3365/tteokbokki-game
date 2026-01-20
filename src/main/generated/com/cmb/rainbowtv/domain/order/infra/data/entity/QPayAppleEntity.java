package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayAppleEntity is a Querydsl query type for PayAppleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayAppleEntity extends EntityPathBase<PayAppleEntity> {

    private static final long serialVersionUID = -1555454997L;

    public static final QPayAppleEntity payAppleEntity = new QPayAppleEntity("payAppleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath orUuid = createString("orUuid");

    public final NumberPath<Long> paIdx = createNumber("paIdx", Long.class);

    public final StringPath paOriginData = createString("paOriginData");

    public final NumberPath<Long> paStatus = createNumber("paStatus", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPayAppleEntity(String variable) {
        super(PayAppleEntity.class, forVariable(variable));
    }

    public QPayAppleEntity(Path<? extends PayAppleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayAppleEntity(PathMetadata metadata) {
        super(PayAppleEntity.class, metadata);
    }

}

