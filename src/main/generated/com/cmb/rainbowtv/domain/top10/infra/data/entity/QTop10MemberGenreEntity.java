package com.cmb.rainbowtv.domain.top10.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTop10MemberGenreEntity is a Querydsl query type for Top10MemberGenreEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTop10MemberGenreEntity extends EntityPathBase<Top10MemberGenreEntity> {

    private static final long serialVersionUID = -2478040L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTop10MemberGenreEntity top10MemberGenreEntity = new QTop10MemberGenreEntity("top10MemberGenreEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaGenreEntity mediaGenre;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final NumberPath<Long> tmgIdx = createNumber("tmgIdx", Long.class);

    public final EnumPath<com.cmb.rainbowtv.domain.top10.model.enums.Top10ContentEnum> toContent = createEnum("toContent", com.cmb.rainbowtv.domain.top10.model.enums.Top10ContentEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTop10MemberGenreEntity(String variable) {
        this(Top10MemberGenreEntity.class, forVariable(variable), INITS);
    }

    public QTop10MemberGenreEntity(Path<? extends Top10MemberGenreEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTop10MemberGenreEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTop10MemberGenreEntity(PathMetadata metadata, PathInits inits) {
        this(Top10MemberGenreEntity.class, metadata, inits);
    }

    public QTop10MemberGenreEntity(Class<? extends Top10MemberGenreEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaGenre = inits.isInitialized("mediaGenre") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaGenreEntity(forProperty("mediaGenre"), inits.get("mediaGenre")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

