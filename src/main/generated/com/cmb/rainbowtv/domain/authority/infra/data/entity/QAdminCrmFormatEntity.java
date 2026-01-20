package com.cmb.rainbowtv.domain.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminCrmFormatEntity is a Querydsl query type for AdminCrmFormatEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminCrmFormatEntity extends EntityPathBase<AdminCrmFormatEntity> {

    private static final long serialVersionUID = -134442070L;

    public static final QAdminCrmFormatEntity adminCrmFormatEntity = new QAdminCrmFormatEntity("adminCrmFormatEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> acfCrmAccess = createNumber("acfCrmAccess", Integer.class);

    public final NumberPath<Long> acfIdx = createNumber("acfIdx", Long.class);

    public final StringPath acfName = createString("acfName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminCrmFormatEntity(String variable) {
        super(AdminCrmFormatEntity.class, forVariable(variable));
    }

    public QAdminCrmFormatEntity(Path<? extends AdminCrmFormatEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminCrmFormatEntity(PathMetadata metadata) {
        super(AdminCrmFormatEntity.class, metadata);
    }

}

