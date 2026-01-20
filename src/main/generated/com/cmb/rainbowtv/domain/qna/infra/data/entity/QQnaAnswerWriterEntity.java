package com.cmb.rainbowtv.domain.qna.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQnaAnswerWriterEntity is a Querydsl query type for QnaAnswerWriterEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQnaAnswerWriterEntity extends EntityPathBase<QnaAnswerWriterEntity> {

    private static final long serialVersionUID = 1328818136L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQnaAnswerWriterEntity qnaAnswerWriterEntity = new QQnaAnswerWriterEntity("qnaAnswerWriterEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbName = createString("mbName");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final QQnaEntity qna;

    public final NumberPath<Long> qwIdx = createNumber("qwIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QQnaAnswerWriterEntity(String variable) {
        this(QnaAnswerWriterEntity.class, forVariable(variable), INITS);
    }

    public QQnaAnswerWriterEntity(Path<? extends QnaAnswerWriterEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQnaAnswerWriterEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQnaAnswerWriterEntity(PathMetadata metadata, PathInits inits) {
        this(QnaAnswerWriterEntity.class, metadata, inits);
    }

    public QQnaAnswerWriterEntity(Class<? extends QnaAnswerWriterEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.qna = inits.isInitialized("qna") ? new QQnaEntity(forProperty("qna"), inits.get("qna")) : null;
    }

}

