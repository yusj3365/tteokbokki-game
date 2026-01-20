package com.cmb.rainbowtv.domain.point.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPointDefineCodeEntity is a Querydsl query type for PointDefineCodeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPointDefineCodeEntity extends EntityPathBase<PointDefineCodeEntity> {

    private static final long serialVersionUID = 1917035431L;

    public static final QPointDefineCodeEntity pointDefineCodeEntity = new QPointDefineCodeEntity("pointDefineCodeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath pdcApplicableProduct = createString("pdcApplicableProduct");

    public final StringPath pdcApplicableProductEn = createString("pdcApplicableProductEn");

    public final StringPath pdcCategory = createString("pdcCategory");

    public final StringPath pdcCategoryKo = createString("pdcCategoryKo");

    public final NumberPath<Long> pdcIdx = createNumber("pdcIdx", Long.class);

    public final NumberPath<Integer> pdcIsDuplication = createNumber("pdcIsDuplication", Integer.class);

    public final NumberPath<Integer> pdcIsFirst = createNumber("pdcIsFirst", Integer.class);

    public final StringPath pdcJoin = createString("pdcJoin");

    public final NumberPath<Long> pdcMaxCnt = createNumber("pdcMaxCnt", Long.class);

    public final NumberPath<Integer> pdcMaxCntType = createNumber("pdcMaxCntType", Integer.class);

    public final StringPath pdcName = createString("pdcName");

    public final StringPath pdcNameEn = createString("pdcNameEn");

    public final EnumPath<com.cmb.rainbowtv.domain.point.model.enums.PointCodeEnum> pdCode = createEnum("pdCode", com.cmb.rainbowtv.domain.point.model.enums.PointCodeEnum.class);

    public final StringPath pdcReason = createString("pdcReason");

    public final NumberPath<Integer> pdcStandardType = createNumber("pdcStandardType", Integer.class);

    public final StringPath pdcUserReason = createString("pdcUserReason");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPointDefineCodeEntity(String variable) {
        super(PointDefineCodeEntity.class, forVariable(variable));
    }

    public QPointDefineCodeEntity(Path<? extends PointDefineCodeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPointDefineCodeEntity(PathMetadata metadata) {
        super(PointDefineCodeEntity.class, metadata);
    }

}

