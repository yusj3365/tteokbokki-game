package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInvestmentManagementLogEntity is a Querydsl query type for InvestmentManagementLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInvestmentManagementLogEntity extends EntityPathBase<InvestmentManagementLogEntity> {

    private static final long serialVersionUID = -1118366575L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInvestmentManagementLogEntity investmentManagementLogEntity = new QInvestmentManagementLogEntity("investmentManagementLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> imlIdx = createNumber("imlIdx", Integer.class);

    public final com.cmb.rainbowtv.domain.investment.infra.data.entity.QInvestmentManagementEntity investmentManagement;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath reason = createString("reason");

    public final StringPath status = createString("status");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QInvestmentManagementLogEntity(String variable) {
        this(InvestmentManagementLogEntity.class, forVariable(variable), INITS);
    }

    public QInvestmentManagementLogEntity(Path<? extends InvestmentManagementLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInvestmentManagementLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInvestmentManagementLogEntity(PathMetadata metadata, PathInits inits) {
        this(InvestmentManagementLogEntity.class, metadata, inits);
    }

    public QInvestmentManagementLogEntity(Class<? extends InvestmentManagementLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.investmentManagement = inits.isInitialized("investmentManagement") ? new com.cmb.rainbowtv.domain.investment.infra.data.entity.QInvestmentManagementEntity(forProperty("investmentManagement"), inits.get("investmentManagement")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

