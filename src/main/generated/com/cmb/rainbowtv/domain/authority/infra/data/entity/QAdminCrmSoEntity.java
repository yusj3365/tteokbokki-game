package com.cmb.rainbowtv.domain.authority.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminCrmSoEntity is a Querydsl query type for AdminCrmSoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminCrmSoEntity extends EntityPathBase<AdminCrmSoEntity> {

    private static final long serialVersionUID = 721388111L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminCrmSoEntity adminCrmSoEntity = new QAdminCrmSoEntity("adminCrmSoEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acsIdx = createNumber("acsIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity soDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAdminCrmSoEntity(String variable) {
        this(AdminCrmSoEntity.class, forVariable(variable), INITS);
    }

    public QAdminCrmSoEntity(Path<? extends AdminCrmSoEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminCrmSoEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminCrmSoEntity(PathMetadata metadata, PathInits inits) {
        this(AdminCrmSoEntity.class, metadata, inits);
    }

    public QAdminCrmSoEntity(Class<? extends AdminCrmSoEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.soDefine = inits.isInitialized("soDefine") ? new com.cmb.rainbowtv.global.define.so.infra.data.entity.QSoDefineEntity(forProperty("soDefine"), inits.get("soDefine")) : null;
    }

}

