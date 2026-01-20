package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRefundEntity is a Querydsl query type for RefundEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRefundEntity extends EntityPathBase<RefundEntity> {

    private static final long serialVersionUID = -566300463L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRefundEntity refundEntity = new QRefundEntity("refundEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final QOrderEntity order;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity reApprover;

    public final StringPath reContent = createString("reContent");

    public final StringPath reDetail = createString("reDetail");

    public final NumberPath<Long> reIdx = createNumber("reIdx", Long.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity reManager;

    public final DateTimePath<java.time.LocalDateTime> reRequestDate = createDateTime("reRequestDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> reRequestPrice = createNumber("reRequestPrice", Long.class);

    public final NumberPath<Integer> reStatus = createNumber("reStatus", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> reStatusDate = createDateTime("reStatusDate", java.time.LocalDateTime.class);

    public final StringPath reStatusReason = createString("reStatusReason");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity reWriter;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QRefundEntity(String variable) {
        this(RefundEntity.class, forVariable(variable), INITS);
    }

    public QRefundEntity(Path<? extends RefundEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRefundEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRefundEntity(PathMetadata metadata, PathInits inits) {
        this(RefundEntity.class, metadata, inits);
    }

    public QRefundEntity(Class<? extends RefundEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.order = inits.isInitialized("order") ? new QOrderEntity(forProperty("order"), inits.get("order")) : null;
        this.reApprover = inits.isInitialized("reApprover") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("reApprover"), inits.get("reApprover")) : null;
        this.reManager = inits.isInitialized("reManager") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("reManager"), inits.get("reManager")) : null;
        this.reWriter = inits.isInitialized("reWriter") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("reWriter"), inits.get("reWriter")) : null;
    }

}

