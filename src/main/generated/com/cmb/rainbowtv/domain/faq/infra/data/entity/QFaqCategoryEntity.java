package com.cmb.rainbowtv.domain.faq.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFaqCategoryEntity is a Querydsl query type for FaqCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaqCategoryEntity extends EntityPathBase<FaqCategoryEntity> {

    private static final long serialVersionUID = -975109847L;

    public static final QFaqCategoryEntity faqCategoryEntity = new QFaqCategoryEntity("faqCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> fcDisplay = createNumber("fcDisplay", Integer.class);

    public final NumberPath<Long> fcIdx = createNumber("fcIdx", Long.class);

    public final StringPath fcName = createString("fcName");

    public final NumberPath<Integer> fcSeq = createNumber("fcSeq", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFaqCategoryEntity(String variable) {
        super(FaqCategoryEntity.class, forVariable(variable));
    }

    public QFaqCategoryEntity(Path<? extends FaqCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFaqCategoryEntity(PathMetadata metadata) {
        super(FaqCategoryEntity.class, metadata);
    }

}

