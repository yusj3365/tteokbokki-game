package com.cmb.rainbowtv.global.define.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCmsAuthorityDefineEntity is a Querydsl query type for CmsAuthorityDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCmsAuthorityDefineEntity extends EntityPathBase<CmsAuthorityDefineEntity> {

    private static final long serialVersionUID = -1602513847L;

    public static final QCmsAuthorityDefineEntity cmsAuthorityDefineEntity = new QCmsAuthorityDefineEntity("cmsAuthorityDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> cadDepth = createNumber("cadDepth", Integer.class);

    public final NumberPath<Long> cadIdx = createNumber("cadIdx", Long.class);

    public final StringPath cadName = createString("cadName");

    public final NumberPath<Long> cadParent = createNumber("cadParent", Long.class);

    public final StringPath cadRoute = createString("cadRoute");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCmsAuthorityDefineEntity(String variable) {
        super(CmsAuthorityDefineEntity.class, forVariable(variable));
    }

    public QCmsAuthorityDefineEntity(Path<? extends CmsAuthorityDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCmsAuthorityDefineEntity(PathMetadata metadata) {
        super(CmsAuthorityDefineEntity.class, metadata);
    }

}

