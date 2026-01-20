package com.cmb.rainbowtv.domain.memberMemo.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWriteMemoEntity is a Querydsl query type for WriteMemoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWriteMemoEntity extends EntityPathBase<WriteMemoEntity> {

    private static final long serialVersionUID = 1362186062L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWriteMemoEntity writeMemoEntity = new QWriteMemoEntity("writeMemoEntity");

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

    public QWriteMemoEntity(String variable) {
        this(WriteMemoEntity.class, forVariable(variable), INITS);
    }

    public QWriteMemoEntity(Path<? extends WriteMemoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWriteMemoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWriteMemoEntity(PathMetadata metadata, PathInits inits) {
        this(WriteMemoEntity.class, metadata, inits);
    }

    public QWriteMemoEntity(Class<? extends WriteMemoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

