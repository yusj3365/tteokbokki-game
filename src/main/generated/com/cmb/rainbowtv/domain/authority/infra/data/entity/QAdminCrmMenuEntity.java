package com.cmb.rainbowtv.domain.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminCrmMenuEntity is a Querydsl query type for AdminCrmMenuEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminCrmMenuEntity extends EntityPathBase<AdminCrmMenuEntity> {

    private static final long serialVersionUID = -1439596782L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminCrmMenuEntity adminCrmMenuEntity = new QAdminCrmMenuEntity("adminCrmMenuEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acmIdx = createNumber("acmIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.global.define.authority.infra.data.entity.QCrmAuthorityDefineEntity crmAuthorityDefine;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminCrmMenuEntity(String variable) {
        this(AdminCrmMenuEntity.class, forVariable(variable), INITS);
    }

    public QAdminCrmMenuEntity(Path<? extends AdminCrmMenuEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminCrmMenuEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminCrmMenuEntity(PathMetadata metadata, PathInits inits) {
        this(AdminCrmMenuEntity.class, metadata, inits);
    }

    public QAdminCrmMenuEntity(Class<? extends AdminCrmMenuEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.crmAuthorityDefine = inits.isInitialized("crmAuthorityDefine") ? new com.cmb.rainbowtv.global.define.authority.infra.data.entity.QCrmAuthorityDefineEntity(forProperty("crmAuthorityDefine")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

