package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberLastAdvertiseEntity is a Querydsl query type for MemberLastAdvertiseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberLastAdvertiseEntity extends EntityPathBase<MemberLastAdvertiseEntity> {

    private static final long serialVersionUID = -1231400590L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberLastAdvertiseEntity memberLastAdvertiseEntity = new QMemberLastAdvertiseEntity("memberLastAdvertiseEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> acdSeq = createNumber("acdSeq", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDetailTypeEnum> acdTypeEnum = createEnum("acdTypeEnum", com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDetailTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QMemberEntity member;

    public final NumberPath<Long> mlaIdx = createNumber("mlaIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberLastAdvertiseEntity(String variable) {
        this(MemberLastAdvertiseEntity.class, forVariable(variable), INITS);
    }

    public QMemberLastAdvertiseEntity(Path<? extends MemberLastAdvertiseEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberLastAdvertiseEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberLastAdvertiseEntity(PathMetadata metadata, PathInits inits) {
        this(MemberLastAdvertiseEntity.class, metadata, inits);
    }

    public QMemberLastAdvertiseEntity(Class<? extends MemberLastAdvertiseEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

