package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaShopTradeHistoryEntity is a Querydsl query type for MediaShopTradeHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaShopTradeHistoryEntity extends EntityPathBase<MediaShopTradeHistoryEntity> {

    private static final long serialVersionUID = 1000715565L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaShopTradeHistoryEntity mediaShopTradeHistoryEntity = new QMediaShopTradeHistoryEntity("mediaShopTradeHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryAttributeEnum> mcAttribute = createEnum("mcAttribute", com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryAttributeEnum.class);

    public final QMediaEntity media;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath msthAddr = createString("msthAddr");

    public final StringPath msthAddrDetail = createString("msthAddrDetail");

    public final StringPath msthCancelReason = createString("msthCancelReason");

    public final StringPath msthCompany = createString("msthCompany");

    public final StringPath msthHp = createString("msthHp");

    public final NumberPath<Long> msthIdx = createNumber("msthIdx", Long.class);

    public final StringPath msthReceiver = createString("msthReceiver");

    public final NumberPath<Integer> msthStatus = createNumber("msthStatus", Integer.class);

    public final StringPath msthTel = createString("msthTel");

    public final StringPath msthZipcode = createString("msthZipcode");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaShopTradeHistoryEntity(String variable) {
        this(MediaShopTradeHistoryEntity.class, forVariable(variable), INITS);
    }

    public QMediaShopTradeHistoryEntity(Path<? extends MediaShopTradeHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaShopTradeHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaShopTradeHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(MediaShopTradeHistoryEntity.class, metadata, inits);
    }

    public QMediaShopTradeHistoryEntity(Class<? extends MediaShopTradeHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

