package com.cmb.rainbowtv.domain.notice.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticeEntity is a Querydsl query type for NoticeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticeEntity extends EntityPathBase<NoticeEntity> {

    private static final long serialVersionUID = -786946843L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticeEntity noticeEntity = new QNoticeEntity("noticeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final NumberPath<Long> wrCommentCnt = createNumber("wrCommentCnt", Long.class);

    public final StringPath wrContent = createString("wrContent");

    public final DateTimePath<java.time.LocalDateTime> wrDatetime = createDateTime("wrDatetime", java.time.LocalDateTime.class);

    public final NumberPath<Integer> wrDisplay = createNumber("wrDisplay", Integer.class);

    public final NumberPath<Long> wrHit = createNumber("wrHit", Long.class);

    public final NumberPath<Long> wrId = createNumber("wrId", Long.class);

    public final NumberPath<Integer> wrIsBlind = createNumber("wrIsBlind", Integer.class);

    public final NumberPath<Long> wrParent = createNumber("wrParent", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum> wrSeparate = createEnum("wrSeparate", com.cmb.rainbowtv.domain.notice.model.enums.WrSeparateEnum.class);

    public final NumberPath<Long> wrSeq = createNumber("wrSeq", Long.class);

    public final StringPath wrSubject = createString("wrSubject");

    public final EnumPath<com.cmb.rainbowtv.domain.notice.model.enums.WriteTypeEnum> wrType = createEnum("wrType", com.cmb.rainbowtv.domain.notice.model.enums.WriteTypeEnum.class);

    public final NumberPath<Integer> wrUse = createNumber("wrUse", Integer.class);

    public QNoticeEntity(String variable) {
        this(NoticeEntity.class, forVariable(variable), INITS);
    }

    public QNoticeEntity(Path<? extends NoticeEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticeEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticeEntity(PathMetadata metadata, PathInits inits) {
        this(NoticeEntity.class, metadata, inits);
    }

    public QNoticeEntity(Class<? extends NoticeEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

