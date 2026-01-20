package com.cmb.rainbowtv.global.define.boardCategory.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardCategoryDefineEntity is a Querydsl query type for BoardCategoryDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardCategoryDefineEntity extends EntityPathBase<BoardCategoryDefineEntity> {

    private static final long serialVersionUID = 383569874L;

    public static final QBoardCategoryDefineEntity boardCategoryDefineEntity = new QBoardCategoryDefineEntity("boardCategoryDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> bcIdx = createNumber("bcIdx", Long.class);

    public final NumberPath<Integer> bcIsDisplay = createNumber("bcIsDisplay", Integer.class);

    public final NumberPath<Integer> bcIsUse = createNumber("bcIsUse", Integer.class);

    public final StringPath bcName = createString("bcName");

    public final NumberPath<Long> bcSeq = createNumber("bcSeq", Long.class);

    public final StringPath boTable = createString("boTable");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBoardCategoryDefineEntity(String variable) {
        super(BoardCategoryDefineEntity.class, forVariable(variable));
    }

    public QBoardCategoryDefineEntity(Path<? extends BoardCategoryDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardCategoryDefineEntity(PathMetadata metadata) {
        super(BoardCategoryDefineEntity.class, metadata);
    }

}

