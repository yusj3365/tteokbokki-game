package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelHistoryEntity is a Querydsl query type for ChannelHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelHistoryEntity extends EntityPathBase<ChannelHistoryEntity> {

    private static final long serialVersionUID = 502059797L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelHistoryEntity channelHistoryEntity = new QChannelHistoryEntity("channelHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QChannelEntity channel;

    public final NumberPath<Long> chIdx = createNumber("chIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelHistoryEntity(String variable) {
        this(ChannelHistoryEntity.class, forVariable(variable), INITS);
    }

    public QChannelHistoryEntity(Path<? extends ChannelHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelHistoryEntity.class, metadata, inits);
    }

    public QChannelHistoryEntity(Class<? extends ChannelHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

