package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMbFailEntity is a Querydsl query type for MbFailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMbFailEntity extends EntityPathBase<MbFailEntity> {

    private static final long serialVersionUID = 807275766L;

    public static final QMbFailEntity mbFailEntity = new QMbFailEntity("mbFailEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> fIdx = createNumber("fIdx", Long.class);

    public final StringPath mbId = createString("mbId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMbFailEntity(String variable) {
        super(MbFailEntity.class, forVariable(variable));
    }

    public QMbFailEntity(Path<? extends MbFailEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMbFailEntity(PathMetadata metadata) {
        super(MbFailEntity.class, metadata);
    }

}

