package com.cmb.rainbowtv.domain.download.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDownloadRequestEntity is a Querydsl query type for DownloadRequestEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDownloadRequestEntity extends EntityPathBase<DownloadRequestEntity> {

    private static final long serialVersionUID = -1514025904L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDownloadRequestEntity downloadRequestEntity = new QDownloadRequestEntity("downloadRequestEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> drApproveDate = createDateTime("drApproveDate", java.time.LocalDateTime.class);

    public final StringPath drApproveDetail = createString("drApproveDetail");

    public final EnumPath<com.cmb.rainbowtv.domain.download.model.enums.DrCategoryEnum> drCategory = createEnum("drCategory", com.cmb.rainbowtv.domain.download.model.enums.DrCategoryEnum.class);

    public final StringPath drDisposer = createString("drDisposer");

    public final DateTimePath<java.time.LocalDateTime> drDownloadDeadline = createDateTime("drDownloadDeadline", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> drExpireDate = createDateTime("drExpireDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> drIdx = createNumber("drIdx", Long.class);

    public final NumberPath<Long> drLeft = createNumber("drLeft", Long.class);

    public final StringPath drPurpose = createString("drPurpose");

    public final DateTimePath<java.time.LocalDateTime> drRequestDate = createDateTime("drRequestDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> drSearchEnd = createDateTime("drSearchEnd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> drSearchStart = createDateTime("drSearchStart", java.time.LocalDateTime.class);

    public final NumberPath<Long> drStatus = createNumber("drStatus", Long.class);

    public final StringPath drSubmit = createString("drSubmit");

    public final StringPath drTitle = createString("drTitle");

    public final EnumPath<com.cmb.rainbowtv.domain.download.model.enums.PlatformTypeEnum> drType = createEnum("drType", com.cmb.rainbowtv.domain.download.model.enums.PlatformTypeEnum.class);

    public final NumberPath<Long> mbAdminNo = createNumber("mbAdminNo", Long.class);

    public final NumberPath<Long> mbApproveSuperNo = createNumber("mbApproveSuperNo", Long.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity soDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QDownloadRequestEntity(String variable) {
        this(DownloadRequestEntity.class, forVariable(variable), INITS);
    }

    public QDownloadRequestEntity(Path<? extends DownloadRequestEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDownloadRequestEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDownloadRequestEntity(PathMetadata metadata, PathInits inits) {
        this(DownloadRequestEntity.class, metadata, inits);
    }

    public QDownloadRequestEntity(Class<? extends DownloadRequestEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.soDefine = inits.isInitialized("soDefine") ? new com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity(forProperty("soDefine"), inits.get("soDefine")) : null;
    }

}

