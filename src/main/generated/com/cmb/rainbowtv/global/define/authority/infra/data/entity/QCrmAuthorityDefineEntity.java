package com.cmb.rainbowtv.global.define.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCrmAuthorityDefineEntity is a Querydsl query type for CrmAuthorityDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCrmAuthorityDefineEntity extends EntityPathBase<CrmAuthorityDefineEntity> {

    private static final long serialVersionUID = -330222892L;

    public static final QCrmAuthorityDefineEntity crmAuthorityDefineEntity = new QCrmAuthorityDefineEntity("crmAuthorityDefineEntity");

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

    public QCrmAuthorityDefineEntity(String variable) {
        super(CrmAuthorityDefineEntity.class, forVariable(variable));
    }

    public QCrmAuthorityDefineEntity(Path<? extends CrmAuthorityDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCrmAuthorityDefineEntity(PathMetadata metadata) {
        super(CrmAuthorityDefineEntity.class, metadata);
    }

}

