package com.cmb.rainbowtv.domain.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminCmsFormatEntity is a Querydsl query type for AdminCmsFormatEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminCmsFormatEntity extends EntityPathBase<AdminCmsFormatEntity> {

    private static final long serialVersionUID = 632933013L;

    public static final QAdminCmsFormatEntity adminCmsFormatEntity = new QAdminCmsFormatEntity("adminCmsFormatEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> acfCmsAccess = createNumber("acfCmsAccess", Integer.class);

    public final NumberPath<Long> acfIdx = createNumber("acfIdx", Long.class);

    public final StringPath acfName = createString("acfName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminCmsFormatEntity(String variable) {
        super(AdminCmsFormatEntity.class, forVariable(variable));
    }

    public QAdminCmsFormatEntity(Path<? extends AdminCmsFormatEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminCmsFormatEntity(PathMetadata metadata) {
        super(AdminCmsFormatEntity.class, metadata);
    }

}

