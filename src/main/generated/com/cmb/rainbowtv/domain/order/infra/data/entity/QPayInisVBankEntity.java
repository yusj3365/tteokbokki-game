package com.cmb.rainbowtv.domain.order.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayInisVBankEntity is a Querydsl query type for PayInisVBankEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayInisVBankEntity extends EntityPathBase<PayInisVBankEntity> {

    private static final long serialVersionUID = 608588500L;

    public static final QPayInisVBankEntity payInisVBankEntity = new QPayInisVBankEntity("payInisVBankEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath amtCheck = createString("amtCheck");

    public final NumberPath<Long> amtInput = createNumber("amtInput", Long.class);

    public final StringPath cdBank = createString("cdBank");

    public final StringPath cdDeal = createString("cdDeal");

    public final StringPath clClose = createString("clClose");

    public final StringPath clKor = createString("clKor");

    public final StringPath clTrans = createString("clTrans");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath dtCalculstd = createString("dtCalculstd");

    public final StringPath dtCshr = createString("dtCshr");

    public final StringPath dtInputstd = createString("dtInputstd");

    public final StringPath dtTrans = createString("dtTrans");

    public final StringPath flgClose = createString("flgClose");

    public final StringPath nmInput = createString("nmInput");

    public final StringPath nmInputbank = createString("nmInputbank");

    public final StringPath noCshrAppl = createString("noCshrAppl");

    public final StringPath noCshrTid = createString("noCshrTid");

    public final StringPath noOid = createString("noOid");

    public final StringPath noTid = createString("noTid");

    public final StringPath noVacct = createString("noVacct");

    public final NumberPath<Long> pivIdx = createNumber("pivIdx", Long.class);

    public final StringPath tmCshr = createString("tmCshr");

    public final StringPath tmTrans = createString("tmTrans");

    public final StringPath typeMsg = createString("typeMsg");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPayInisVBankEntity(String variable) {
        super(PayInisVBankEntity.class, forVariable(variable));
    }

    public QPayInisVBankEntity(Path<? extends PayInisVBankEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayInisVBankEntity(PathMetadata metadata) {
        super(PayInisVBankEntity.class, metadata);
    }

}

