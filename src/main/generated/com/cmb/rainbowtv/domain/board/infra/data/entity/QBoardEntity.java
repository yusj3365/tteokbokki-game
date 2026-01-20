package com.cmb.rainbowtv.domain.board.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardEntity is a Querydsl query type for BoardEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardEntity extends EntityPathBase<BoardEntity> {

    private static final long serialVersionUID = 1748961771L;

    public static final QBoardEntity boardEntity = new QBoardEntity("boardEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> boBlindCount = createNumber("boBlindCount", Long.class);

    public final NumberPath<Integer> boBlindUse = createNumber("boBlindUse", Integer.class);

    public final NumberPath<Integer> boCommentAlarm = createNumber("boCommentAlarm", Integer.class);

    public final NumberPath<Integer> boCommentLevel = createNumber("boCommentLevel", Integer.class);

    public final NumberPath<Integer> boDownloadLevel = createNumber("boDownloadLevel", Integer.class);

    public final NumberPath<Integer> boHtmlLevel = createNumber("boHtmlLevel", Integer.class);

    public final NumberPath<Long> boImageHeight = createNumber("boImageHeight", Long.class);

    public final NumberPath<Long> boImageWidth = createNumber("boImageWidth", Long.class);

    public final NumberPath<Integer> boIsMember = createNumber("boIsMember", Integer.class);

    public final NumberPath<Integer> boLinkLevel = createNumber("boLinkLevel", Integer.class);

    public final NumberPath<Integer> boListLevel = createNumber("boListLevel", Integer.class);

    public final StringPath boMobileSubject = createString("boMobileSubject");

    public final NumberPath<Integer> boNoticeUse = createNumber("boNoticeUse", Integer.class);

    public final NumberPath<Integer> boReadLevel = createNumber("boReadLevel", Integer.class);

    public final NumberPath<Integer> boReplyLevel = createNumber("boReplyLevel", Integer.class);

    public final NumberPath<Integer> boReplyOrder = createNumber("boReplyOrder", Integer.class);

    public final StringPath boSortField = createString("boSortField");

    public final StringPath boSubject = createString("boSubject");

    public final StringPath boTable = createString("boTable");

    public final NumberPath<Integer> boUploadCount = createNumber("boUploadCount", Integer.class);

    public final NumberPath<Integer> boUploadLevel = createNumber("boUploadLevel", Integer.class);

    public final NumberPath<Long> boUploadSize = createNumber("boUploadSize", Long.class);

    public final NumberPath<Integer> boUseCategory = createNumber("boUseCategory", Integer.class);

    public final NumberPath<Integer> boUseComment = createNumber("boUseComment", Integer.class);

    public final NumberPath<Integer> boUseFileContent = createNumber("boUseFileContent", Integer.class);

    public final NumberPath<Integer> boUseFileRequired = createNumber("boUseFileRequired", Integer.class);

    public final NumberPath<Integer> boUseListView = createNumber("boUseListView", Integer.class);

    public final NumberPath<Integer> boUseSearch = createNumber("boUseSearch", Integer.class);

    public final NumberPath<Integer> boWriteAlarm = createNumber("boWriteAlarm", Integer.class);

    public final NumberPath<Integer> boWriteLevel = createNumber("boWriteLevel", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBoardEntity(String variable) {
        super(BoardEntity.class, forVariable(variable));
    }

    public QBoardEntity(Path<? extends BoardEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardEntity(PathMetadata metadata) {
        super(BoardEntity.class, metadata);
    }

}

