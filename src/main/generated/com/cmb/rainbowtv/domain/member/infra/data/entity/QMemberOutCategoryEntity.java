package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberOutCategoryEntity is a Querydsl query type for MemberOutCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberOutCategoryEntity extends EntityPathBase<MemberOutCategoryEntity> {

    private static final long serialVersionUID = 1489650925L;

    public static final QMemberOutCategoryEntity memberOutCategoryEntity = new QMemberOutCategoryEntity("memberOutCategoryEntity");

    public final StringPath mocCategory = createString("mocCategory");

    public final NumberPath<Long> mocIdx = createNumber("mocIdx", Long.class);

    public final NumberPath<Integer> mocIsAdmin = createNumber("mocIsAdmin", Integer.class);

    public final NumberPath<Integer> mocIsUse = createNumber("mocIsUse", Integer.class);

    public final NumberPath<Integer> mocRequireInput = createNumber("mocRequireInput", Integer.class);

    public QMemberOutCategoryEntity(String variable) {
        super(MemberOutCategoryEntity.class, forVariable(variable));
    }

    public QMemberOutCategoryEntity(Path<? extends MemberOutCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberOutCategoryEntity(PathMetadata metadata) {
        super(MemberOutCategoryEntity.class, metadata);
    }

}

