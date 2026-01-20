package com.cmb.rainbowtv.domain.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminCmsFormatInfoEntity is a Querydsl query type for AdminCmsFormatInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminCmsFormatInfoEntity extends EntityPathBase<AdminCmsFormatInfoEntity> {

    private static final long serialVersionUID = -677726237L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminCmsFormatInfoEntity adminCmsFormatInfoEntity = new QAdminCmsFormatInfoEntity("adminCmsFormatInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acfiIdx = createNumber("acfiIdx", Long.class);

    public final NumberPath<Long> acfiKey = createNumber("acfiKey", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.authority.model.enums.AcfiTypeEnum> acfiType = createEnum("acfiType", com.cmb.rainbowtv.domain.authority.model.enums.AcfiTypeEnum.class);

    public final QAdminCmsFormatEntity adminCmsFormat;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminCmsFormatInfoEntity(String variable) {
        this(AdminCmsFormatInfoEntity.class, forVariable(variable), INITS);
    }

    public QAdminCmsFormatInfoEntity(Path<? extends AdminCmsFormatInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminCmsFormatInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminCmsFormatInfoEntity(PathMetadata metadata, PathInits inits) {
        this(AdminCmsFormatInfoEntity.class, metadata, inits);
    }

    public QAdminCmsFormatInfoEntity(Class<? extends AdminCmsFormatInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adminCmsFormat = inits.isInitialized("adminCmsFormat") ? new QAdminCmsFormatEntity(forProperty("adminCmsFormat")) : null;
    }

}

