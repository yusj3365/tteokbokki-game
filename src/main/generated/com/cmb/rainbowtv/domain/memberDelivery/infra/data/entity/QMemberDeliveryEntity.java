package com.cmb.rainbowtv.domain.memberDelivery.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberDeliveryEntity is a Querydsl query type for MemberDeliveryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberDeliveryEntity extends EntityPathBase<MemberDeliveryEntity> {

    private static final long serialVersionUID = 253902501L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberDeliveryEntity memberDeliveryEntity = new QMemberDeliveryEntity("memberDeliveryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mdAddr = createString("mdAddr");

    public final StringPath mdAddrDetail = createString("mdAddrDetail");

    public final NumberPath<Long> mdIdx = createNumber("mdIdx", Long.class);

    public final NumberPath<Integer> mdIsDefault = createNumber("mdIsDefault", Integer.class);

    public final StringPath mdReceiver = createString("mdReceiver");

    public final StringPath mdTel = createString("mdTel");

    public final StringPath mdZipcode = createString("mdZipcode");

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberDeliveryEntity(String variable) {
        this(MemberDeliveryEntity.class, forVariable(variable), INITS);
    }

    public QMemberDeliveryEntity(Path<? extends MemberDeliveryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberDeliveryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberDeliveryEntity(PathMetadata metadata, PathInits inits) {
        this(MemberDeliveryEntity.class, metadata, inits);
    }

    public QMemberDeliveryEntity(Class<? extends MemberDeliveryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

