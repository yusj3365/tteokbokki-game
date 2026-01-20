package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayGoogleEntity is a Querydsl query type for PayGoogleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayGoogleEntity extends EntityPathBase<PayGoogleEntity> {

    private static final long serialVersionUID = -1288067794L;

    public static final QPayGoogleEntity payGoogleEntity = new QPayGoogleEntity("payGoogleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath orderId = createString("orderId");

    public final StringPath orUuid = createString("orUuid");

    public final NumberPath<Long> pgIdx = createNumber("pgIdx", Long.class);

    public final StringPath pgOriginData = createString("pgOriginData");

    public final NumberPath<Long> pgStatus = createNumber("pgStatus", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPayGoogleEntity(String variable) {
        super(PayGoogleEntity.class, forVariable(variable));
    }

    public QPayGoogleEntity(Path<? extends PayGoogleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayGoogleEntity(PathMetadata metadata) {
        super(PayGoogleEntity.class, metadata);
    }

}

