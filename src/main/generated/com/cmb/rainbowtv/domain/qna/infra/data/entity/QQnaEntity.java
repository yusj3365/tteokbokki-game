package com.cmb.rainbowtv.domain.qna.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQnaEntity is a Querydsl query type for QnaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQnaEntity extends EntityPathBase<QnaEntity> {

    private static final long serialVersionUID = 97786023L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQnaEntity qnaEntity = new QQnaEntity("qnaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.boardCategory.infra.data.entity.QBoardCategoryDefineEntity boardCategoryDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath wrContent = createString("wrContent");

    public final NumberPath<Long> wrId = createNumber("wrId", Long.class);

    public final NumberPath<Long> wrParent = createNumber("wrParent", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.qna.model.enums.WrSeparateEnum> wrSeparate = createEnum("wrSeparate", com.cmb.rainbowtv.domain.qna.model.enums.WrSeparateEnum.class);

    public final StringPath wrSubject = createString("wrSubject");

    public final EnumPath<com.cmb.rainbowtv.domain.qna.model.enums.WriteTypeEnum> wrType = createEnum("wrType", com.cmb.rainbowtv.domain.qna.model.enums.WriteTypeEnum.class);

    public final NumberPath<Integer> wrUse = createNumber("wrUse", Integer.class);

    public QQnaEntity(String variable) {
        this(QnaEntity.class, forVariable(variable), INITS);
    }

    public QQnaEntity(Path<? extends QnaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQnaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQnaEntity(PathMetadata metadata, PathInits inits) {
        this(QnaEntity.class, metadata, inits);
    }

    public QQnaEntity(Class<? extends QnaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boardCategoryDefine = inits.isInitialized("boardCategoryDefine") ? new com.cmb.rainbowtv.global.define.boardCategory.infra.data.entity.QBoardCategoryDefineEntity(forProperty("boardCategoryDefine")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

