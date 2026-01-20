package com.cmb.rainbowtv.domain.memberMemo.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemoWriterEntity is a Querydsl query type for MemoWriterEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemoWriterEntity extends EntityPathBase<MemoWriterEntity> {

    private static final long serialVersionUID = 1137404542L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemoWriterEntity memoWriterEntity = new QMemoWriterEntity("memoWriterEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbName = createString("mbName");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> mwIdx = createNumber("mwIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QWriteMemoEntity writeMemo;

    public QMemoWriterEntity(String variable) {
        this(MemoWriterEntity.class, forVariable(variable), INITS);
    }

    public QMemoWriterEntity(Path<? extends MemoWriterEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemoWriterEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemoWriterEntity(PathMetadata metadata, PathInits inits) {
        this(MemoWriterEntity.class, metadata, inits);
    }

    public QMemoWriterEntity(Class<? extends MemoWriterEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.writeMemo = inits.isInitialized("writeMemo") ? new QWriteMemoEntity(forProperty("writeMemo"), inits.get("writeMemo")) : null;
    }

}

