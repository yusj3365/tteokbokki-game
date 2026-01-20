package com.cmb.rainbowtv.domain.classarea.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QClassAreaEntity is a Querydsl query type for ClassAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClassAreaEntity extends EntityPathBase<ClassAreaEntity> {

    private static final long serialVersionUID = 1862023369L;

    public static final QClassAreaEntity classAreaEntity = new QClassAreaEntity("classAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> aosDisplay = createNumber("aosDisplay", Integer.class);

    public final NumberPath<Integer> caDefault = createNumber("caDefault", Integer.class);

    public final NumberPath<Long> caIdx = createNumber("caIdx", Long.class);

    public final StringPath caName = createString("caName");

    public final NumberPath<Long> caSeq = createNumber("caSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> ottAppDisplay = createNumber("ottAppDisplay", Integer.class);

    public final NumberPath<Integer> smartDisplay = createNumber("smartDisplay", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QClassAreaEntity(String variable) {
        super(ClassAreaEntity.class, forVariable(variable));
    }

    public QClassAreaEntity(Path<? extends ClassAreaEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClassAreaEntity(PathMetadata metadata) {
        super(ClassAreaEntity.class, metadata);
    }

}

