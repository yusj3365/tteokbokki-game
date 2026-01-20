package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaVodTradeHistoryEntity is a Querydsl query type for MediaVodTradeHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaVodTradeHistoryEntity extends EntityPathBase<MediaVodTradeHistoryEntity> {

    private static final long serialVersionUID = -449292998L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaVodTradeHistoryEntity mediaVodTradeHistoryEntity = new QMediaVodTradeHistoryEntity("mediaVodTradeHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMediaEntity media;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath mvthCancelReason = createString("mvthCancelReason");

    public final NumberPath<Long> mvthIdx = createNumber("mvthIdx", Long.class);

    public final StringPath mvthMcName = createString("mvthMcName");

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryEnum> mvthMcType = createEnum("mvthMcType", com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryEnum.class);

    public final StringPath mvthMgName = createString("mvthMgName");

    public final NumberPath<Integer> mvthStatus = createNumber("mvthStatus", Integer.class);

    public final StringPath mvthUuid = createString("mvthUuid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaVodTradeHistoryEntity(String variable) {
        this(MediaVodTradeHistoryEntity.class, forVariable(variable), INITS);
    }

    public QMediaVodTradeHistoryEntity(Path<? extends MediaVodTradeHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaVodTradeHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaVodTradeHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(MediaVodTradeHistoryEntity.class, metadata, inits);
    }

    public QMediaVodTradeHistoryEntity(Class<? extends MediaVodTradeHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

