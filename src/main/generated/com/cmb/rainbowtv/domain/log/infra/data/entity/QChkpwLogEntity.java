package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChkpwLogEntity is a Querydsl query type for ChkpwLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChkpwLogEntity extends EntityPathBase<ChkpwLogEntity> {

    private static final long serialVersionUID = 1467539066L;

    public static final QChkpwLogEntity chkpwLogEntity = new QChkpwLogEntity("chkpwLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final BooleanPath clChk = createBoolean("clChk");

    public final NumberPath<Long> clIdx = createNumber("clIdx", Long.class);

    public final StringPath clIp = createString("clIp");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbId = createString("mbId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChkpwLogEntity(String variable) {
        super(ChkpwLogEntity.class, forVariable(variable));
    }

    public QChkpwLogEntity(Path<? extends ChkpwLogEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChkpwLogEntity(PathMetadata metadata) {
        super(ChkpwLogEntity.class, metadata);
    }

}

