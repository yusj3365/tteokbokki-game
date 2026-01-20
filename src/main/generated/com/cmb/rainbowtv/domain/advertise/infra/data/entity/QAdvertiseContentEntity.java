package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentEntity is a Querydsl query type for AdvertiseContentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentEntity extends EntityPathBase<AdvertiseContentEntity> {

    private static final long serialVersionUID = 1738359666L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentEntity advertiseContentEntity = new QAdvertiseContentEntity("advertiseContentEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> acAdmission = createNumber("acAdmission", Integer.class);

    public final NumberPath<Long> acAdmNo = createNumber("acAdmNo", Long.class);

    public final NumberPath<Long> acIdx = createNumber("acIdx", Long.class);

    public final NumberPath<Integer> acIsPaid = createNumber("acIsPaid", Integer.class);

    public final NumberPath<Integer> acIsUse = createNumber("acIsUse", Integer.class);

    public final NumberPath<Long> acPrice = createNumber("acPrice", Long.class);

    public final NumberPath<Long> acPriceCount = createNumber("acPriceCount", Long.class);

    public final NumberPath<Integer> acPriceType = createNumber("acPriceType", Integer.class);

    public final NumberPath<Integer> acPublishTax = createNumber("acPublishTax", Integer.class);

    public final NumberPath<Integer> acStatus = createNumber("acStatus", Integer.class);

    public final StringPath acUuid = createString("acUuid");

    public final NumberPath<Integer> acWithoutPaid = createNumber("acWithoutPaid", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity item;

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.LpTypeEnum> lpType = createEnum("lpType", com.cmb.rainbowtv.domain.media.model.enums.LpTypeEnum.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentEntity(String variable) {
        this(AdvertiseContentEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentEntity(Path<? extends AdvertiseContentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentEntity.class, metadata, inits);
    }

    public QAdvertiseContentEntity(Class<? extends AdvertiseContentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.cmb.rainbowtv.domain.product.infra.data.entity.QItemEntity(forProperty("item")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

