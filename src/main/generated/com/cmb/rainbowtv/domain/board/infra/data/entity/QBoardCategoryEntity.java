package com.cmb.rainbowtv.domain.board.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardCategoryEntity is a Querydsl query type for BoardCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardCategoryEntity extends EntityPathBase<BoardCategoryEntity> {

    private static final long serialVersionUID = -1800014711L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardCategoryEntity boardCategoryEntity = new QBoardCategoryEntity("boardCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> bcIdx = createNumber("bcIdx", Long.class);

    public final NumberPath<Integer> bcIsDisplay = createNumber("bcIsDisplay", Integer.class);

    public final NumberPath<Integer> bcIsUse = createNumber("bcIsUse", Integer.class);

    public final StringPath bcName = createString("bcName");

    public final NumberPath<Long> bcSeq = createNumber("bcSeq", Long.class);

    public final QBoardEntity boardEntity;

    public final StringPath boTable = createString("boTable");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QBoardCategoryEntity(String variable) {
        this(BoardCategoryEntity.class, forVariable(variable), INITS);
    }

    public QBoardCategoryEntity(Path<? extends BoardCategoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardCategoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardCategoryEntity(PathMetadata metadata, PathInits inits) {
        this(BoardCategoryEntity.class, metadata, inits);
    }

    public QBoardCategoryEntity(Class<? extends BoardCategoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boardEntity = inits.isInitialized("boardEntity") ? new QBoardEntity(forProperty("boardEntity")) : null;
    }

}

