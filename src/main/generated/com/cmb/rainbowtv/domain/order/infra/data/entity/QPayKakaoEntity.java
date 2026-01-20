package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayKakaoEntity is a Querydsl query type for PayKakaoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayKakaoEntity extends EntityPathBase<PayKakaoEntity> {

    private static final long serialVersionUID = -656001388L;

    public static final QPayKakaoEntity payKakaoEntity = new QPayKakaoEntity("payKakaoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath aid = createString("aid");

    public final StringPath amount = createString("amount");

    public final DateTimePath<java.time.LocalDateTime> approvedAt = createDateTime("approvedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> cancelAt = createDateTime("cancelAt", java.time.LocalDateTime.class);

    public final StringPath cardInfo = createString("cardInfo");

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> errorAt = createDateTime("errorAt", java.time.LocalDateTime.class);

    public final StringPath errorCode = createString("errorCode");

    public final StringPath errorMessage = createString("errorMessage");

    public final StringPath itemName = createString("itemName");

    public final StringPath partnerOrderId = createString("partnerOrderId");

    public final StringPath partnerUserId = createString("partnerUserId");

    public final StringPath paymentMethodType = createString("paymentMethodType");

    public final NumberPath<Long> pkIdx = createNumber("pkIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> readyAt = createDateTime("readyAt", java.time.LocalDateTime.class);

    public final StringPath sid = createString("sid");

    public final StringPath tid = createString("tid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPayKakaoEntity(String variable) {
        super(PayKakaoEntity.class, forVariable(variable));
    }

    public QPayKakaoEntity(Path<? extends PayKakaoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayKakaoEntity(PathMetadata metadata) {
        super(PayKakaoEntity.class, metadata);
    }

}

