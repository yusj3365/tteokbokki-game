package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberMailCertifyEntity is a Querydsl query type for MemberMailCertifyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberMailCertifyEntity extends EntityPathBase<MemberMailCertifyEntity> {

    private static final long serialVersionUID = -1600874654L;

    public static final QMemberMailCertifyEntity memberMailCertifyEntity = new QMemberMailCertifyEntity("memberMailCertifyEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath mbId = createString("mbId");

    public final NumberPath<Long> mmcIdx = createNumber("mmcIdx", Long.class);

    public final NumberPath<Integer> mmcNum = createNumber("mmcNum", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberMailCertifyEntity(String variable) {
        super(MemberMailCertifyEntity.class, forVariable(variable));
    }

    public QMemberMailCertifyEntity(Path<? extends MemberMailCertifyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberMailCertifyEntity(PathMetadata metadata) {
        super(MemberMailCertifyEntity.class, metadata);
    }

}

