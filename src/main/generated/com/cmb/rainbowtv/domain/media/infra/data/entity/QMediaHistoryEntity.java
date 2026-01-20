package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaHistoryEntity is a Querydsl query type for MediaHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaHistoryEntity extends EntityPathBase<MediaHistoryEntity> {

    private static final long serialVersionUID = -28579821L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaHistoryEntity mediaHistoryEntity = new QMediaHistoryEntity("mediaHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity mbNo;

    public final QMediaEntity media;

    public final DateTimePath<java.time.LocalDateTime> mhDateEd = createDateTime("mhDateEd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> mhDateSt = createDateTime("mhDateSt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> mhDelete = createNumber("mhDelete", Integer.class);

    public final NumberPath<Long> mhIdx = createNumber("mhIdx", Long.class);

    public final TimePath<java.time.LocalTime> mhTimelineEd = createTime("mhTimelineEd", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> mhTimelineSt = createTime("mhTimelineSt", java.time.LocalTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaHistoryEntity(String variable) {
        this(MediaHistoryEntity.class, forVariable(variable), INITS);
    }

    public QMediaHistoryEntity(Path<? extends MediaHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(MediaHistoryEntity.class, metadata, inits);
    }

    public QMediaHistoryEntity(Class<? extends MediaHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mbNo = inits.isInitialized("mbNo") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("mbNo"), inits.get("mbNo")) : null;
        this.media = inits.isInitialized("media") ? new QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

