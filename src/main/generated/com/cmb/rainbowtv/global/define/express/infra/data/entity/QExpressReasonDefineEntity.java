package com.cmb.rainbowtv.global.define.express.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QExpressReasonDefineEntity is a Querydsl query type for ExpressReasonDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QExpressReasonDefineEntity extends EntityPathBase<ExpressReasonDefineEntity> {

    private static final long serialVersionUID = -780136882L;

    public static final QExpressReasonDefineEntity expressReasonDefineEntity = new QExpressReasonDefineEntity("expressReasonDefineEntity");

    public final NumberPath<Long> erIdx = createNumber("erIdx", Long.class);

    public final StringPath erName = createString("erName");

    public final NumberPath<Integer> erType = createNumber("erType", Integer.class);

    public QExpressReasonDefineEntity(String variable) {
        super(ExpressReasonDefineEntity.class, forVariable(variable));
    }

    public QExpressReasonDefineEntity(Path<? extends ExpressReasonDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExpressReasonDefineEntity(PathMetadata metadata) {
        super(ExpressReasonDefineEntity.class, metadata);
    }

}

