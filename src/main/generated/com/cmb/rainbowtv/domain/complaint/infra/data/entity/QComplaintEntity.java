package com.cmb.rainbowtv.domain.complaint.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QComplaintEntity is a Querydsl query type for ComplaintEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QComplaintEntity extends EntityPathBase<ComplaintEntity> {

    private static final long serialVersionUID = 820321269L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComplaintEntity complaintEntity = new QComplaintEntity("complaintEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath coContent = createString("coContent");

    public final NumberPath<Long> coIdx = createNumber("coIdx", Long.class);

    public final NumberPath<Integer> coIsTransfer = createNumber("coIsTransfer", Integer.class);

    public final StringPath coProcessContent = createString("coProcessContent");

    public final DateTimePath<java.time.LocalDateTime> coProcessDate = createDateTime("coProcessDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> coProcessStatus = createNumber("coProcessStatus", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> coTakeDate = createDateTime("coTakeDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> coTransferDate = createDateTime("coTransferDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> coType = createNumber("coType", Integer.class);

    public final NumberPath<Integer> coUseService = createNumber("coUseService", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity customer;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity expectedProcessAdmin;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity processAdmin;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity registerAdmin;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QComplaintEntity(String variable) {
        this(ComplaintEntity.class, forVariable(variable), INITS);
    }

    public QComplaintEntity(Path<? extends ComplaintEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QComplaintEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QComplaintEntity(PathMetadata metadata, PathInits inits) {
        this(ComplaintEntity.class, metadata, inits);
    }

    public QComplaintEntity(Class<? extends ComplaintEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("customer"), inits.get("customer")) : null;
        this.expectedProcessAdmin = inits.isInitialized("expectedProcessAdmin") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("expectedProcessAdmin"), inits.get("expectedProcessAdmin")) : null;
        this.processAdmin = inits.isInitialized("processAdmin") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("processAdmin"), inits.get("processAdmin")) : null;
        this.registerAdmin = inits.isInitialized("registerAdmin") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("registerAdmin"), inits.get("registerAdmin")) : null;
    }

}

