package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastChannelHistoryEntity is a Querydsl query type for FastChannelHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastChannelHistoryEntity extends EntityPathBase<FastChannelHistoryEntity> {

    private static final long serialVersionUID = -1929549674L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastChannelHistoryEntity fastChannelHistoryEntity = new QFastChannelHistoryEntity("fastChannelHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFastChannelEntity fastChannel;

    public final NumberPath<Long> fchIdx = createNumber("fchIdx", Long.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastChannelHistoryEntity(String variable) {
        this(FastChannelHistoryEntity.class, forVariable(variable), INITS);
    }

    public QFastChannelHistoryEntity(Path<? extends FastChannelHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastChannelHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastChannelHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(FastChannelHistoryEntity.class, metadata, inits);
    }

    public QFastChannelHistoryEntity(Class<? extends FastChannelHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fastChannel = inits.isInitialized("fastChannel") ? new QFastChannelEntity(forProperty("fastChannel"), inits.get("fastChannel")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

