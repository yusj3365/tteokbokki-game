package com.cmb.rainbowtv.domain.prohibitWord.infra.data.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProhibitWordEntity is a Querydsl query type for ProhibitWordEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProhibitWordEntity extends EntityPathBase<ProhibitWordEntity> {

    private static final long serialVersionUID = -1512711899L;

    public static final QProhibitWordEntity prohibitWordEntity = new QProhibitWordEntity("prohibitWordEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath pwContext = createString("pwContext");

    public final NumberPath<Long> pwIdx = createNumber("pwIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QProhibitWordEntity(String variable) {
        super(ProhibitWordEntity.class, forVariable(variable));
    }

    public QProhibitWordEntity(Path<? extends ProhibitWordEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProhibitWordEntity(PathMetadata metadata) {
        super(ProhibitWordEntity.class, metadata);
    }

}

