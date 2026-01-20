package com.cmb.rainbowtv.domain.fast.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFastMediaEntity is a Querydsl query type for FastMediaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFastMediaEntity extends EntityPathBase<FastMediaEntity> {

    private static final long serialVersionUID = -1569099931L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFastMediaEntity fastMediaEntity = new QFastMediaEntity("fastMediaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final StringPath fmDashUrl = createString("fmDashUrl");

    public final StringPath fmGenreType = createString("fmGenreType");

    public final StringPath fmHlsUrl = createString("fmHlsUrl");

    public final NumberPath<Long> fmIdx = createNumber("fmIdx", Long.class);

    public final NumberPath<Integer> fmIsAllow = createNumber("fmIsAllow", Integer.class);

    public final StringPath fmName = createString("fmName");

    public final NumberPath<Integer> fmPostStatus = createNumber("fmPostStatus", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> fmPostTimeEd = createDateTime("fmPostTimeEd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> fmPostTimeSt = createDateTime("fmPostTimeSt", java.time.LocalDateTime.class);

    public final StringPath fmReason = createString("fmReason");

    public final NumberPath<Long> fmRunningTime = createNumber("fmRunningTime", Long.class);

    public final NumberPath<Integer> fmStatus = createNumber("fmStatus", Integer.class);

    public final NumberPath<Integer> fmType = createNumber("fmType", Integer.class);

    public final NumberPath<Integer> fmUse = createNumber("fmUse", Integer.class);

    public final StringPath fmUuid = createString("fmUuid");

    public final StringPath guid = createString("guid");

    public final StringPath mediaPackageId = createString("mediaPackageId");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath sourceLocationName = createString("sourceLocationName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFastMediaEntity(String variable) {
        this(FastMediaEntity.class, forVariable(variable), INITS);
    }

    public QFastMediaEntity(Path<? extends FastMediaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFastMediaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFastMediaEntity(PathMetadata metadata, PathInits inits) {
        this(FastMediaEntity.class, metadata, inits);
    }

    public QFastMediaEntity(Class<? extends FastMediaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

