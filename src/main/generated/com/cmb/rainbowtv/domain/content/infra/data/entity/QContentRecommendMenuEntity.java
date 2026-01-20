package com.cmb.rainbowtv.domain.content.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContentRecommendMenuEntity is a Querydsl query type for ContentRecommendMenuEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContentRecommendMenuEntity extends EntityPathBase<ContentRecommendMenuEntity> {

    private static final long serialVersionUID = 293880848L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContentRecommendMenuEntity contentRecommendMenuEntity = new QContentRecommendMenuEntity("contentRecommendMenuEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> crmDisplay = createNumber("crmDisplay", Integer.class);

    public final NumberPath<Long> crmIdx = createNumber("crmIdx", Long.class);

    public final StringPath crmName = createString("crmName");

    public final NumberPath<Long> crmSeq = createNumber("crmSeq", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.content.model.enums.CrmTypeEnum> crmType = createEnum("crmType", com.cmb.rainbowtv.domain.content.model.enums.CrmTypeEnum.class);

    public final DateTimePath<java.time.LocalDateTime> crmUpdatedat = createDateTime("crmUpdatedat", java.time.LocalDateTime.class);

    public final NumberPath<Integer> displayCtvLg = createNumber("displayCtvLg", Integer.class);

    public final NumberPath<Integer> displayCtvSamsung = createNumber("displayCtvSamsung", Integer.class);

    public final NumberPath<Integer> displayLeMoGlass = createNumber("displayLeMoGlass", Integer.class);

    public final NumberPath<Integer> displayLeTb = createNumber("displayLeTb", Integer.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QContentRecommendMenuEntity(String variable) {
        this(ContentRecommendMenuEntity.class, forVariable(variable), INITS);
    }

    public QContentRecommendMenuEntity(Path<? extends ContentRecommendMenuEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QContentRecommendMenuEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QContentRecommendMenuEntity(PathMetadata metadata, PathInits inits) {
        this(ContentRecommendMenuEntity.class, metadata, inits);
    }

    public QContentRecommendMenuEntity(Class<? extends ContentRecommendMenuEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

