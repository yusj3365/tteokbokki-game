package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberByInterestEntity is a Querydsl query type for MemberByInterestEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberByInterestEntity extends EntityPathBase<MemberByInterestEntity> {

    private static final long serialVersionUID = -251909978L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberByInterestEntity memberByInterestEntity = new QMemberByInterestEntity("memberByInterestEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbiIdx = createNumber("mbiIdx", Long.class);

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity mediaCategory;

    public final QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberByInterestEntity(String variable) {
        this(MemberByInterestEntity.class, forVariable(variable), INITS);
    }

    public QMemberByInterestEntity(Path<? extends MemberByInterestEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberByInterestEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberByInterestEntity(PathMetadata metadata, PathInits inits) {
        this(MemberByInterestEntity.class, metadata, inits);
    }

    public QMemberByInterestEntity(Class<? extends MemberByInterestEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaCategory = inits.isInitialized("mediaCategory") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaCategoryEntity(forProperty("mediaCategory")) : null;
        this.member = inits.isInitialized("member") ? new QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

