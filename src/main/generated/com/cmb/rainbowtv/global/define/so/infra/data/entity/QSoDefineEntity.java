package com.cmb.rainbowtv.global.define.so.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSoDefineEntity is a Querydsl query type for SoDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSoDefineEntity extends EntityPathBase<SoDefineEntity> {

    private static final long serialVersionUID = 2102304528L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSoDefineEntity soDefineEntity = new QSoDefineEntity("soDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> sdDepth = createNumber("sdDepth", Long.class);

    public final NumberPath<Long> sdIdx = createNumber("sdIdx", Long.class);

    public final StringPath sdName = createString("sdName");

    public final NumberPath<Integer> sdOption = createNumber("sdOption", Integer.class);

    public final NumberPath<Long> sdParent = createNumber("sdParent", Long.class);

    public final StringPath sdSi = createString("sdSi");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSoDefineEntity(String variable) {
        this(SoDefineEntity.class, forVariable(variable), INITS);
    }

    public QSoDefineEntity(Path<? extends SoDefineEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSoDefineEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSoDefineEntity(PathMetadata metadata, PathInits inits) {
        this(SoDefineEntity.class, metadata, inits);
    }

    public QSoDefineEntity(Class<? extends SoDefineEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
    }

}

