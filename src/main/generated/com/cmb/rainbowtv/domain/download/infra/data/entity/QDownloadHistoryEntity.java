package com.cmb.rainbowtv.domain.download.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDownloadHistoryEntity is a Querydsl query type for DownloadHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDownloadHistoryEntity extends EntityPathBase<DownloadHistoryEntity> {

    private static final long serialVersionUID = 338978453L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDownloadHistoryEntity downloadHistoryEntity = new QDownloadHistoryEntity("downloadHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath dhGnbFifth = createString("dhGnbFifth");

    public final StringPath dhGnbFirst = createString("dhGnbFirst");

    public final StringPath dhGnbFourth = createString("dhGnbFourth");

    public final StringPath dhGnbSecond = createString("dhGnbSecond");

    public final StringPath dhGnbThird = createString("dhGnbThird");

    public final NumberPath<Long> dhIdx = createNumber("dhIdx", Long.class);

    public final StringPath dhReason = createString("dhReason");

    public final NumberPath<Integer> dhType = createNumber("dhType", Integer.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QDownloadHistoryEntity(String variable) {
        this(DownloadHistoryEntity.class, forVariable(variable), INITS);
    }

    public QDownloadHistoryEntity(Path<? extends DownloadHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDownloadHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDownloadHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(DownloadHistoryEntity.class, metadata, inits);
    }

    public QDownloadHistoryEntity(Class<? extends DownloadHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

