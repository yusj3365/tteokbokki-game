package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseLogEntity is a Querydsl query type for AdvertiseLogEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseLogEntity extends EntityPathBase<AdvertiseLogEntity> {

    private static final long serialVersionUID = -509870912L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseLogEntity advertiseLogEntity = new QAdvertiseLogEntity("advertiseLogEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> aaIdx = createNumber("aaIdx", Long.class);

    public final NumberPath<Long> alIdx = createNumber("alIdx", Long.class);

    public final StringPath alName = createString("alName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseLogEntity(String variable) {
        this(AdvertiseLogEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseLogEntity(Path<? extends AdvertiseLogEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseLogEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseLogEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseLogEntity.class, metadata, inits);
    }

    public QAdvertiseLogEntity(Class<? extends AdvertiseLogEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

