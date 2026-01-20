package com.cmb.rainbowtv.domain.auth.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QHpCheckEntity is a Querydsl query type for HpCheckEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHpCheckEntity extends EntityPathBase<HpCheckEntity> {

    private static final long serialVersionUID = -767587031L;

    public static final QHpCheckEntity hpCheckEntity = new QHpCheckEntity("hpCheckEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath authKey = createString("authKey");

    public final StringPath authPhone = createString("authPhone");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath hcCode = createString("hcCode");

    public final NumberPath<Long> hcIdx = createNumber("hcIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QHpCheckEntity(String variable) {
        super(HpCheckEntity.class, forVariable(variable));
    }

    public QHpCheckEntity(Path<? extends HpCheckEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHpCheckEntity(PathMetadata metadata) {
        super(HpCheckEntity.class, metadata);
    }

}

