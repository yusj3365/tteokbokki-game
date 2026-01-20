package com.cmb.rainbowtv.domain.ip.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QIpAreaDefineEntity is a Querydsl query type for IpAreaDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QIpAreaDefineEntity extends EntityPathBase<IpAreaDefineEntity> {

    private static final long serialVersionUID = -1306338035L;

    public static final QIpAreaDefineEntity ipAreaDefineEntity = new QIpAreaDefineEntity("ipAreaDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> iadIdx = createNumber("iadIdx", Long.class);

    public final StringPath iadName = createString("iadName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QIpAreaDefineEntity(String variable) {
        super(IpAreaDefineEntity.class, forVariable(variable));
    }

    public QIpAreaDefineEntity(Path<? extends IpAreaDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIpAreaDefineEntity(PathMetadata metadata) {
        super(IpAreaDefineEntity.class, metadata);
    }

}

