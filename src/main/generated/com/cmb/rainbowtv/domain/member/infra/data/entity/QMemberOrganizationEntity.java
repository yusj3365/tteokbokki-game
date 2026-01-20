package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberOrganizationEntity is a Querydsl query type for MemberOrganizationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberOrganizationEntity extends EntityPathBase<MemberOrganizationEntity> {

    private static final long serialVersionUID = -243538120L;

    public static final QMemberOrganizationEntity memberOrganizationEntity = new QMemberOrganizationEntity("memberOrganizationEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> moCategory = createNumber("moCategory", Integer.class);

    public final NumberPath<Long> moIdx = createNumber("moIdx", Long.class);

    public final StringPath moName = createString("moName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberOrganizationEntity(String variable) {
        super(MemberOrganizationEntity.class, forVariable(variable));
    }

    public QMemberOrganizationEntity(Path<? extends MemberOrganizationEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberOrganizationEntity(PathMetadata metadata) {
        super(MemberOrganizationEntity.class, metadata);
    }

}

