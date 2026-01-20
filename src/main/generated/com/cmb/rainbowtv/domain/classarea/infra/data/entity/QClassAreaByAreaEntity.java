package com.cmb.rainbowtv.domain.classarea.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClassAreaByAreaEntity is a Querydsl query type for ClassAreaByAreaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QClassAreaByAreaEntity extends EntityPathBase<ClassAreaByAreaEntity> {

    private static final long serialVersionUID = 1920432877L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClassAreaByAreaEntity classAreaByAreaEntity = new QClassAreaByAreaEntity("classAreaByAreaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    public final NumberPath<Long> cabaIdx = createNumber("cabaIdx", Long.class);

    public final NumberPath<Integer> cabaSi = createNumber("cabaSi", Integer.class);

    public final QClassAreaEntity classArea;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QClassAreaByAreaEntity(String variable) {
        this(ClassAreaByAreaEntity.class, forVariable(variable), INITS);
    }

    public QClassAreaByAreaEntity(Path<? extends ClassAreaByAreaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClassAreaByAreaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClassAreaByAreaEntity(PathMetadata metadata, PathInits inits) {
        this(ClassAreaByAreaEntity.class, metadata, inits);
    }

    public QClassAreaByAreaEntity(Class<? extends ClassAreaByAreaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.classArea = inits.isInitialized("classArea") ? new QClassAreaEntity(forProperty("classArea")) : null;
    }

}

