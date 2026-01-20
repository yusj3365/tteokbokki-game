package com.cmb.rainbowtv.global.define.express.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QExpressDefineEntity is a Querydsl query type for ExpressDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QExpressDefineEntity extends EntityPathBase<ExpressDefineEntity> {

    private static final long serialVersionUID = 1610428138L;

    public static final QExpressDefineEntity expressDefineEntity = new QExpressDefineEntity("expressDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath edCode = createString("edCode");

    public final NumberPath<Long> edIdx = createNumber("edIdx", Long.class);

    public final NumberPath<Integer> edIsGlobal = createNumber("edIsGlobal", Integer.class);

    public final NumberPath<Integer> edIsUse = createNumber("edIsUse", Integer.class);

    public final StringPath edName = createString("edName");

    public final StringPath edUrl = createString("edUrl");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QExpressDefineEntity(String variable) {
        super(ExpressDefineEntity.class, forVariable(variable));
    }

    public QExpressDefineEntity(Path<? extends ExpressDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExpressDefineEntity(PathMetadata metadata) {
        super(ExpressDefineEntity.class, metadata);
    }

}

