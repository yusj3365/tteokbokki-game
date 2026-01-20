package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelInfoEntity is a Querydsl query type for ChannelInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelInfoEntity extends EntityPathBase<ChannelInfoEntity> {

    private static final long serialVersionUID = 345881971L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelInfoEntity channelInfoEntity = new QChannelInfoEntity("channelInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QChannelEntity channel;

    public final QChannelGenreEntity channelGenre;

    public final NumberPath<Integer> ciBlackout = createNumber("ciBlackout", Integer.class);

    public final StringPath ciEpg = createString("ciEpg");

    public final NumberPath<Long> ciFee = createNumber("ciFee", Long.class);

    public final NumberPath<Integer> ciFeeType = createNumber("ciFeeType", Integer.class);

    public final NumberPath<Long> ciIdx = createNumber("ciIdx", Long.class);

    public final NumberPath<Integer> ciInvest = createNumber("ciInvest", Integer.class);

    public final NumberPath<Integer> ciIsAdult = createNumber("ciIsAdult", Integer.class);

    public final NumberPath<Integer> ciIsLive = createNumber("ciIsLive", Integer.class);

    public final NumberPath<Integer> ciIsPay = createNumber("ciIsPay", Integer.class);

    public final StringPath ciName = createString("ciName");

    public final NumberPath<Long> ciSeq = createNumber("ciSeq", Long.class);

    public final NumberPath<Integer> ciStatus = createNumber("ciStatus", Integer.class);

    public final NumberPath<Integer> ciType = createNumber("ciType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelInfoEntity(String variable) {
        this(ChannelInfoEntity.class, forVariable(variable), INITS);
    }

    public QChannelInfoEntity(Path<? extends ChannelInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelInfoEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelInfoEntity.class, metadata, inits);
    }

    public QChannelInfoEntity(Class<? extends ChannelInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel")) : null;
        this.channelGenre = inits.isInitialized("channelGenre") ? new QChannelGenreEntity(forProperty("channelGenre")) : null;
    }

}

