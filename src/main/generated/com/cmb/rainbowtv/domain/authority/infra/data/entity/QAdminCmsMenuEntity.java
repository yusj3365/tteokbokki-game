package com.cmb.rainbowtv.domain.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminCmsMenuEntity is a Querydsl query type for AdminCmsMenuEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminCmsMenuEntity extends EntityPathBase<AdminCmsMenuEntity> {

    private static final long serialVersionUID = 18183357L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminCmsMenuEntity adminCmsMenuEntity = new QAdminCmsMenuEntity("adminCmsMenuEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acmIdx = createNumber("acmIdx", Long.class);

    public final com.cmb.rainbowtv.global.define.authority.infra.data.entity.QCmsAuthorityDefineEntity cmsAuthorityDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminCmsMenuEntity(String variable) {
        this(AdminCmsMenuEntity.class, forVariable(variable), INITS);
    }

    public QAdminCmsMenuEntity(Path<? extends AdminCmsMenuEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminCmsMenuEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminCmsMenuEntity(PathMetadata metadata, PathInits inits) {
        this(AdminCmsMenuEntity.class, metadata, inits);
    }

    public QAdminCmsMenuEntity(Class<? extends AdminCmsMenuEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cmsAuthorityDefine = inits.isInitialized("cmsAuthorityDefine") ? new com.cmb.rainbowtv.global.define.authority.infra.data.entity.QCmsAuthorityDefineEntity(forProperty("cmsAuthorityDefine")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

