package com.cmb.rainbowtv.domain.advertise.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertiseContentDetailEntity is a Querydsl query type for AdvertiseContentDetailEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdvertiseContentDetailEntity extends EntityPathBase<AdvertiseContentDetailEntity> {

    private static final long serialVersionUID = -1112875037L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertiseContentDetailEntity advertiseContentDetailEntity = new QAdvertiseContentDetailEntity("advertiseContentDetailEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> acdAdmission = createNumber("acdAdmission", Integer.class);

    public final StringPath acdCompany = createString("acdCompany");

    public final StringPath acdCompanyHp = createString("acdCompanyHp");

    public final NumberPath<Long> acdCount = createNumber("acdCount", Long.class);

    public final StringPath acdDashUrl = createString("acdDashUrl");

    public final NumberPath<Integer> acdHaveTarget = createNumber("acdHaveTarget", Integer.class);

    public final StringPath acdHlsUrl = createString("acdHlsUrl");

    public final NumberPath<Long> acdIdx = createNumber("acdIdx", Long.class);

    public final StringPath acdName = createString("acdName");

    public final DateTimePath<java.time.LocalDateTime> acdPostEnd = createDateTime("acdPostEnd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> acdPostStart = createDateTime("acdPostStart", java.time.LocalDateTime.class);

    public final NumberPath<Long> acdRunningTime = createNumber("acdRunningTime", Long.class);

    public final NumberPath<Long> acdSeq = createNumber("acdSeq", Long.class);

    public final NumberPath<Integer> acdStatus = createNumber("acdStatus", Integer.class);

    public final StringPath acdUrl = createString("acdUrl");

    public final NumberPath<Integer> acdVideoStatus = createNumber("acdVideoStatus", Integer.class);

    public final QAdvertiseContentEntity advertiseContent;

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDetailTypeEnum> advertiseContentDetailType = createEnum("advertiseContentDetailType", com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDetailTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath guid = createString("guid");

    public final StringPath mediaPackageId = createString("mediaPackageId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdvertiseContentDetailEntity(String variable) {
        this(AdvertiseContentDetailEntity.class, forVariable(variable), INITS);
    }

    public QAdvertiseContentDetailEntity(Path<? extends AdvertiseContentDetailEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertiseContentDetailEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertiseContentDetailEntity(PathMetadata metadata, PathInits inits) {
        this(AdvertiseContentDetailEntity.class, metadata, inits);
    }

    public QAdvertiseContentDetailEntity(Class<? extends AdvertiseContentDetailEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.advertiseContent = inits.isInitialized("advertiseContent") ? new QAdvertiseContentEntity(forProperty("advertiseContent"), inits.get("advertiseContent")) : null;
    }

}

