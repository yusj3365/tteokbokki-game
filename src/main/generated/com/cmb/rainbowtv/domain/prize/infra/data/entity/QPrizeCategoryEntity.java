package com.cmb.rainbowtv.domain.prize.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPrizeCategoryEntity is a Querydsl query type for PrizeCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrizeCategoryEntity extends EntityPathBase<PrizeCategoryEntity> {

    private static final long serialVersionUID = -1809071903L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPrizeCategoryEntity prizeCategoryEntity = new QPrizeCategoryEntity("prizeCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> pcIdx = createNumber("pcIdx", Long.class);

    public final NumberPath<Integer> pcSeq = createNumber("pcSeq", Integer.class);

    public final StringPath pcTitle = createString("pcTitle");

    public final NumberPath<Integer> prCategory = createNumber("prCategory", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPrizeCategoryEntity(String variable) {
        this(PrizeCategoryEntity.class, forVariable(variable), INITS);
    }

    public QPrizeCategoryEntity(Path<? extends PrizeCategoryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPrizeCategoryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPrizeCategoryEntity(PathMetadata metadata, PathInits inits) {
        this(PrizeCategoryEntity.class, metadata, inits);
    }

    public QPrizeCategoryEntity(Class<? extends PrizeCategoryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

