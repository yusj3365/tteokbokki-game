package com.cmb.rainbowtv.domain.tvloginqr.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTvLoginQrEntity is a Querydsl query type for TvLoginQrEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTvLoginQrEntity extends EntityPathBase<TvLoginQrEntity> {

    private static final long serialVersionUID = -1743787345L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTvLoginQrEntity tvLoginQrEntity = new QTvLoginQrEntity("tvLoginQrEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> tlqIdx = createNumber("tlqIdx", Long.class);

    public final StringPath tlqKey = createString("tlqKey");

    public final NumberPath<Integer> tlqStatus = createNumber("tlqStatus", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTvLoginQrEntity(String variable) {
        this(TvLoginQrEntity.class, forVariable(variable), INITS);
    }

    public QTvLoginQrEntity(Path<? extends TvLoginQrEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTvLoginQrEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTvLoginQrEntity(PathMetadata metadata, PathInits inits) {
        this(TvLoginQrEntity.class, metadata, inits);
    }

    public QTvLoginQrEntity(Class<? extends TvLoginQrEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

