package com.cmb.rainbowtv.domain.faq.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFaqEntity is a Querydsl query type for FaqEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFaqEntity extends EntityPathBase<FaqEntity> {

    private static final long serialVersionUID = 1427158667L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFaqEntity faqEntity = new QFaqEntity("faqEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final StringPath faContent = createString("faContent");

    public final StringPath faDashUrl = createString("faDashUrl");

    public final StringPath faHlsUrl = createString("faHlsUrl");

    public final NumberPath<Long> faIdx = createNumber("faIdx", Long.class);

    public final QFaqCategoryEntity faqCategory;

    public final NumberPath<Long> faRunningTime = createNumber("faRunningTime", Long.class);

    public final NumberPath<Integer> faSeq = createNumber("faSeq", Integer.class);

    public final NumberPath<Integer> faStatus = createNumber("faStatus", Integer.class);

    public final StringPath faTitle = createString("faTitle");

    public final EnumPath<com.cmb.rainbowtv.domain.faq.model.enums.FaqTypeEnum> faType = createEnum("faType", com.cmb.rainbowtv.domain.faq.model.enums.FaqTypeEnum.class);

    public final StringPath faUrl = createString("faUrl");

    public final StringPath guid = createString("guid");

    public final StringPath mediaPackageId = createString("mediaPackageId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFaqEntity(String variable) {
        this(FaqEntity.class, forVariable(variable), INITS);
    }

    public QFaqEntity(Path<? extends FaqEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFaqEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFaqEntity(PathMetadata metadata, PathInits inits) {
        this(FaqEntity.class, metadata, inits);
    }

    public QFaqEntity(Class<? extends FaqEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.faqCategory = inits.isInitialized("faqCategory") ? new QFaqCategoryEntity(forProperty("faqCategory")) : null;
    }

}

