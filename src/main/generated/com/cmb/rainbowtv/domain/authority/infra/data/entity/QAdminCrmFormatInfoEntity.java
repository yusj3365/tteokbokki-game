package com.cmb.rainbowtv.domain.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminCrmFormatInfoEntity is a Querydsl query type for AdminCrmFormatInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminCrmFormatInfoEntity extends EntityPathBase<AdminCrmFormatInfoEntity> {

    private static final long serialVersionUID = -898044296L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminCrmFormatInfoEntity adminCrmFormatInfoEntity = new QAdminCrmFormatInfoEntity("adminCrmFormatInfoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acfiIdx = createNumber("acfiIdx", Long.class);

    public final NumberPath<Long> acfiKey = createNumber("acfiKey", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.authority.model.enums.AcfiTypeEnum> acfiType = createEnum("acfiType", com.cmb.rainbowtv.domain.authority.model.enums.AcfiTypeEnum.class);

    public final QAdminCrmFormatEntity adminCrmFormat;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminCrmFormatInfoEntity(String variable) {
        this(AdminCrmFormatInfoEntity.class, forVariable(variable), INITS);
    }

    public QAdminCrmFormatInfoEntity(Path<? extends AdminCrmFormatInfoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminCrmFormatInfoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminCrmFormatInfoEntity(PathMetadata metadata, PathInits inits) {
        this(AdminCrmFormatInfoEntity.class, metadata, inits);
    }

    public QAdminCrmFormatInfoEntity(Class<? extends AdminCrmFormatInfoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adminCrmFormat = inits.isInitialized("adminCrmFormat") ? new QAdminCrmFormatEntity(forProperty("adminCrmFormat")) : null;
    }

}

