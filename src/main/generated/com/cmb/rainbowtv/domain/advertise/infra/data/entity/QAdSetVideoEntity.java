package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdSetVideoEntity is a Querydsl query type for AdSetVideoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdSetVideoEntity extends EntityPathBase<AdSetVideoEntity> {

    private static final long serialVersionUID = -625119780L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdSetVideoEntity adSetVideoEntity = new QAdSetVideoEntity("adSetVideoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final QAdSetEntity adSet;

    public final QAdvertiseContentEntity advertiseContent;

    public final NumberPath<Long> asvIdx = createNumber("asvIdx", Long.class);

    public final NumberPath<Long> asvSeq = createNumber("asvSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdSetVideoEntity(String variable) {
        this(AdSetVideoEntity.class, forVariable(variable), INITS);
    }

    public QAdSetVideoEntity(Path<? extends AdSetVideoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdSetVideoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdSetVideoEntity(PathMetadata metadata, PathInits inits) {
        this(AdSetVideoEntity.class, metadata, inits);
    }

    public QAdSetVideoEntity(Class<? extends AdSetVideoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adSet = inits.isInitialized("adSet") ? new QAdSetEntity(forProperty("adSet")) : null;
        this.advertiseContent = inits.isInitialized("advertiseContent") ? new QAdvertiseContentEntity(forProperty("advertiseContent"), inits.get("advertiseContent")) : null;
    }

}

