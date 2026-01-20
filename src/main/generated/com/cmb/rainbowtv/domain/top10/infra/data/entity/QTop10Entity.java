package com.cmb.rainbowtv.domain.top10.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTop10Entity is a Querydsl query type for Top10Entity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTop10Entity extends EntityPathBase<Top10Entity> {

    private static final long serialVersionUID = 951994759L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTop10Entity top10Entity = new QTop10Entity("top10Entity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity areaDefine;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity media;

    public final NumberPath<Integer> toCnt = createNumber("toCnt", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.top10.model.enums.Top10ContentEnum> toContent = createEnum("toContent", com.cmb.rainbowtv.domain.top10.model.enums.Top10ContentEnum.class);

    public final EnumPath<com.cmb.rainbowtv.domain.top10.model.enums.Top10DisplayEnum> toDisplay = createEnum("toDisplay", com.cmb.rainbowtv.domain.top10.model.enums.Top10DisplayEnum.class);

    public final DateTimePath<java.time.LocalDateTime> toHitDay = createDateTime("toHitDay", java.time.LocalDateTime.class);

    public final NumberPath<Long> toIdx = createNumber("toIdx", Long.class);

    public final NumberPath<Integer> toRanking = createNumber("toRanking", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.top10.model.enums.Top10TypeEnum> toType = createEnum("toType", com.cmb.rainbowtv.domain.top10.model.enums.Top10TypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTop10Entity(String variable) {
        this(Top10Entity.class, forVariable(variable), INITS);
    }

    public QTop10Entity(Path<? extends Top10Entity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTop10Entity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTop10Entity(PathMetadata metadata, PathInits inits) {
        this(Top10Entity.class, metadata, inits);
    }

    public QTop10Entity(Class<? extends Top10Entity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.areaDefine = inits.isInitialized("areaDefine") ? new com.cmb.rainbowtv.global.define.area.infra.data.entity.QAreaDefineEntity(forProperty("areaDefine")) : null;
        this.media = inits.isInitialized("media") ? new com.cmb.rainbowtv.domain.media.infra.data.entity.QMediaEntity(forProperty("media"), inits.get("media")) : null;
    }

}

