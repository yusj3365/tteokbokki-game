package com.cmb.rainbowtv.domain.snsChannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSnsChannelLinkEntity is a Querydsl query type for SnsChannelLinkEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSnsChannelLinkEntity extends EntityPathBase<SnsChannelLinkEntity> {

    private static final long serialVersionUID = 153291999L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSnsChannelLinkEntity snsChannelLinkEntity = new QSnsChannelLinkEntity("snsChannelLinkEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> sclIdx = createNumber("sclIdx", Long.class);

    public final StringPath sclUrl = createString("sclUrl");

    public final QSnsChannelEntity snsChannel;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSnsChannelLinkEntity(String variable) {
        this(SnsChannelLinkEntity.class, forVariable(variable), INITS);
    }

    public QSnsChannelLinkEntity(Path<? extends SnsChannelLinkEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSnsChannelLinkEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSnsChannelLinkEntity(PathMetadata metadata, PathInits inits) {
        this(SnsChannelLinkEntity.class, metadata, inits);
    }

    public QSnsChannelLinkEntity(Class<? extends SnsChannelLinkEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.snsChannel = inits.isInitialized("snsChannel") ? new QSnsChannelEntity(forProperty("snsChannel")) : null;
    }

}

