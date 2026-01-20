package com.cmb.rainbowtv.domain.board.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPartnerBoardEntity is a Querydsl query type for PartnerBoardEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPartnerBoardEntity extends EntityPathBase<PartnerBoardEntity> {

    private static final long serialVersionUID = -1563143489L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPartnerBoardEntity partnerBoardEntity = new QPartnerBoardEntity("partnerBoardEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath pbContent = createString("pbContent");

    public final NumberPath<Long> pbIdx = createNumber("pbIdx", Long.class);

    public final NumberPath<Long> pbParent = createNumber("pbParent", Long.class);

    public final StringPath pbSubject = createString("pbSubject");

    public final EnumPath<com.cmb.rainbowtv.domain.board.model.enums.PartnerBoardTypeEnum> pbType = createEnum("pbType", com.cmb.rainbowtv.domain.board.model.enums.PartnerBoardTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPartnerBoardEntity(String variable) {
        this(PartnerBoardEntity.class, forVariable(variable), INITS);
    }

    public QPartnerBoardEntity(Path<? extends PartnerBoardEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPartnerBoardEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPartnerBoardEntity(PathMetadata metadata, PathInits inits) {
        this(PartnerBoardEntity.class, metadata, inits);
    }

    public QPartnerBoardEntity(Class<? extends PartnerBoardEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

