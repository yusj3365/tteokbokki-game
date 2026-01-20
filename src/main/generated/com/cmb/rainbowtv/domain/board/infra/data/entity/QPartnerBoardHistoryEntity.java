package com.cmb.rainbowtv.domain.board.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPartnerBoardHistoryEntity is a Querydsl query type for PartnerBoardHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPartnerBoardHistoryEntity extends EntityPathBase<PartnerBoardHistoryEntity> {

    private static final long serialVersionUID = 934696763L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPartnerBoardHistoryEntity partnerBoardHistoryEntity = new QPartnerBoardHistoryEntity("partnerBoardHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final QPartnerBoardEntity partnerBoard;

    public final NumberPath<Long> pbhIdx = createNumber("pbhIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPartnerBoardHistoryEntity(String variable) {
        this(PartnerBoardHistoryEntity.class, forVariable(variable), INITS);
    }

    public QPartnerBoardHistoryEntity(Path<? extends PartnerBoardHistoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPartnerBoardHistoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPartnerBoardHistoryEntity(PathMetadata metadata, PathInits inits) {
        this(PartnerBoardHistoryEntity.class, metadata, inits);
    }

    public QPartnerBoardHistoryEntity(Class<? extends PartnerBoardHistoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.partnerBoard = inits.isInitialized("partnerBoard") ? new QPartnerBoardEntity(forProperty("partnerBoard"), inits.get("partnerBoard")) : null;
    }

}

