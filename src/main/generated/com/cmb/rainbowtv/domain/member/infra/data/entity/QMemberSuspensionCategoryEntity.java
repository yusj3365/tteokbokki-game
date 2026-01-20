package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberSuspensionCategoryEntity is a Querydsl query type for MemberSuspensionCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberSuspensionCategoryEntity extends EntityPathBase<MemberSuspensionCategoryEntity> {

    private static final long serialVersionUID = 808980096L;

    public static final QMemberSuspensionCategoryEntity memberSuspensionCategoryEntity = new QMemberSuspensionCategoryEntity("memberSuspensionCategoryEntity");

    public final StringPath mscCategory = createString("mscCategory");

    public final StringPath mscCode = createString("mscCode");

    public final NumberPath<Long> mscIdx = createNumber("mscIdx", Long.class);

    public final NumberPath<Integer> mscIsAdmin = createNumber("mscIsAdmin", Integer.class);

    public final NumberPath<Integer> mscIsUse = createNumber("mscIsUse", Integer.class);

    public final NumberPath<Integer> mscRequireInput = createNumber("mscRequireInput", Integer.class);

    public QMemberSuspensionCategoryEntity(String variable) {
        super(MemberSuspensionCategoryEntity.class, forVariable(variable));
    }

    public QMemberSuspensionCategoryEntity(Path<? extends MemberSuspensionCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberSuspensionCategoryEntity(PathMetadata metadata) {
        super(MemberSuspensionCategoryEntity.class, metadata);
    }

}

