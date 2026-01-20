package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayNaverEntity is a Querydsl query type for PayNaverEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayNaverEntity extends EntityPathBase<PayNaverEntity> {

    private static final long serialVersionUID = 884767009L;

    public static final QPayNaverEntity payNaverEntity = new QPayNaverEntity("payNaverEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath detail = createString("detail");

    public final DateTimePath<java.time.LocalDateTime> errorAt = createDateTime("errorAt", java.time.LocalDateTime.class);

    public final StringPath errorCode = createString("errorCode");

    public final StringPath errorMessage = createString("errorMessage");

    public final StringPath merchantPayId = createString("merchantPayId");

    public final DateTimePath<java.time.LocalDateTime> payAt = createDateTime("payAt", java.time.LocalDateTime.class);

    public final StringPath paymentId = createString("paymentId");

    public final NumberPath<Long> pnIdx = createNumber("pnIdx", Long.class);

    public final StringPath recurrentId = createString("recurrentId");

    public final DateTimePath<java.time.LocalDateTime> reservationAt = createDateTime("reservationAt", java.time.LocalDateTime.class);

    public final StringPath token = createString("token");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPayNaverEntity(String variable) {
        super(PayNaverEntity.class, forVariable(variable));
    }

    public QPayNaverEntity(Path<? extends PayNaverEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayNaverEntity(PathMetadata metadata) {
        super(PayNaverEntity.class, metadata);
    }

}

