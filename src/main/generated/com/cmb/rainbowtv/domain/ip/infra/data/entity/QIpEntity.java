package com.cmb.rainbowtv.domain.ip.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIpEntity is a Querydsl query type for IpEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIpEntity extends EntityPathBase<IpEntity> {

    private static final long serialVersionUID = -1971386171L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIpEntity ipEntity = new QIpEntity("ipEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QIpAreaDefineEntity ipAreaDefine;

    public final NumberPath<Long> ipIdx = createNumber("ipIdx", Long.class);

    public final StringPath ipIp = createString("ipIp");

    public final EnumPath<com.cmb.rainbowtv.domain.ip.model.enums.ManageEnum> ipManage = createEnum("ipManage", com.cmb.rainbowtv.domain.ip.model.enums.ManageEnum.class);

    public final StringPath ipName = createString("ipName");

    public final EnumPath<com.cmb.rainbowtv.domain.ip.model.enums.IpTypeEnum> ipType = createEnum("ipType", com.cmb.rainbowtv.domain.ip.model.enums.IpTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QIpEntity(String variable) {
        this(IpEntity.class, forVariable(variable), INITS);
    }

    public QIpEntity(Path<? extends IpEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIpEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIpEntity(PathMetadata metadata, PathInits inits) {
        this(IpEntity.class, metadata, inits);
    }

    public QIpEntity(Class<? extends IpEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ipAreaDefine = inits.isInitialized("ipAreaDefine") ? new QIpAreaDefineEntity(forProperty("ipAreaDefine")) : null;
    }

}

