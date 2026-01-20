package com.cmb.rainbowtv.domain.investment.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInvestmentManagementEntity is a Querydsl query type for InvestmentManagementEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInvestmentManagementEntity extends EntityPathBase<InvestmentManagementEntity> {

    private static final long serialVersionUID = 1856463336L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInvestmentManagementEntity investmentManagementEntity = new QInvestmentManagementEntity("investmentManagementEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> adPromotionalExpenses = createNumber("adPromotionalExpenses", Long.class);

    public final NumberPath<Long> adultVerificationFee = createNumber("adultVerificationFee", Long.class);

    public final NumberPath<Long> awsPrice = createNumber("awsPrice", Long.class);

    public final NumberPath<Long> contentPurchasePrice = createNumber("contentPurchasePrice", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> devicePrice = createNumber("devicePrice", Long.class);

    public final NumberPath<Long> imIdx = createNumber("imIdx", Long.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath month = createString("month");

    public final NumberPath<Long> operatingPrice = createNumber("operatingPrice", Long.class);

    public final NumberPath<Long> pgFee = createNumber("pgFee", Long.class);

    public final NumberPath<Long> promotionalExpenses = createNumber("promotionalExpenses", Long.class);

    public final NumberPath<Long> shippingPrice = createNumber("shippingPrice", Long.class);

    public final NumberPath<Long> siPrice = createNumber("siPrice", Long.class);

    public final NumberPath<Long> smPrice = createNumber("smPrice", Long.class);

    public final com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity soDefine;

    public final NumberPath<Long> supplyPrice = createNumber("supplyPrice", Long.class);

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final StringPath year = createString("year");

    public QInvestmentManagementEntity(String variable) {
        this(InvestmentManagementEntity.class, forVariable(variable), INITS);
    }

    public QInvestmentManagementEntity(Path<? extends InvestmentManagementEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInvestmentManagementEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInvestmentManagementEntity(PathMetadata metadata, PathInits inits) {
        this(InvestmentManagementEntity.class, metadata, inits);
    }

    public QInvestmentManagementEntity(Class<? extends InvestmentManagementEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.soDefine = inits.isInitialized("soDefine") ? new com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity(forProperty("soDefine"), inits.get("soDefine")) : null;
    }

}

