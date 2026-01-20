package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMediaEntity is a Querydsl query type for MediaEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaEntity extends EntityPathBase<MediaEntity> {

    private static final long serialVersionUID = 865174759L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMediaEntity mediaEntity = new QMediaEntity("mediaEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final StringPath guid = createString("guid");

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.LpTypeEnum> lpType = createEnum("lpType", com.cmb.rainbowtv.domain.media.model.enums.LpTypeEnum.class);

    public final StringPath meActor = createString("meActor");

    public final NumberPath<Long> meAllowAdminNo = createNumber("meAllowAdminNo", Long.class);

    public final DateTimePath<java.time.LocalDateTime> meAllowDate = createDateTime("meAllowDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> meAosDisplay = createNumber("meAosDisplay", Integer.class);

    public final NumberPath<Integer> meAutoDelete = createNumber("meAutoDelete", Integer.class);

    public final StringPath meDashUrl = createString("meDashUrl");

    public final DateTimePath<java.time.LocalDateTime> meDenyDate = createDateTime("meDenyDate", java.time.LocalDateTime.class);

    public final QMediaCategoryEntity mediaCategory;

    public final QMediaGenreEntity mediaGenre;

    public final StringPath mediaPackageId = createString("mediaPackageId");

    public final NumberPath<Long> meFee = createNumber("meFee", Long.class);

    public final NumberPath<Integer> meFeeType = createNumber("meFeeType", Integer.class);

    public final StringPath meGenreType = createString("meGenreType");

    public final NumberPath<Long> meHit = createNumber("meHit", Long.class);

    public final StringPath meHlsUrl = createString("meHlsUrl");

    public final NumberPath<Long> meIdx = createNumber("meIdx", Long.class);

    public final StringPath meInfo = createString("meInfo");

    public final NumberPath<Integer> meInvest = createNumber("meInvest", Integer.class);

    public final NumberPath<Integer> meIsAllow = createNumber("meIsAllow", Integer.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath meName = createString("meName");

    public final StringPath meName2 = createString("meName2");

    public final NumberPath<Integer> meNameHomeShow = createNumber("meNameHomeShow", Integer.class);

    public final NumberPath<Integer> meOttAppDisplay = createNumber("meOttAppDisplay", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> mePostTimeEd = createDateTime("mePostTimeEd", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> mePostTimeSt = createDateTime("mePostTimeSt", java.time.LocalDateTime.class);

    public final NumberPath<Long> mePreview = createNumber("mePreview", Long.class);

    public final NumberPath<Long> mePrice = createNumber("mePrice", Long.class);

    public final NumberPath<Long> mePriceCoin = createNumber("mePriceCoin", Long.class);

    public final NumberPath<Integer> mePriceType = createNumber("mePriceType", Integer.class);

    public final StringPath meProducer = createString("meProducer");

    public final StringPath meReason = createString("meReason");

    public final NumberPath<Long> meRunningTime = createNumber("meRunningTime", Long.class);

    public final NumberPath<Long> meSeq = createNumber("meSeq", Long.class);

    public final NumberPath<Integer> meSeriesType = createNumber("meSeriesType", Integer.class);

    public final NumberPath<Integer> meSmartDisplay = createNumber("meSmartDisplay", Integer.class);

    public final NumberPath<Integer> meStatus = createNumber("meStatus", Integer.class);

    public final NumberPath<Integer> meUse = createNumber("meUse", Integer.class);

    public final StringPath meUuid = createString("meUuid");

    public final NumberPath<Long> meVersion = createNumber("meVersion", Long.class);

    public final StringPath sourceLocationName = createString("sourceLocationName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaEntity(String variable) {
        this(MediaEntity.class, forVariable(variable), INITS);
    }

    public QMediaEntity(Path<? extends MediaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMediaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMediaEntity(PathMetadata metadata, PathInits inits) {
        this(MediaEntity.class, metadata, inits);
    }

    public QMediaEntity(Class<? extends MediaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mediaCategory = inits.isInitialized("mediaCategory") ? new QMediaCategoryEntity(forProperty("mediaCategory")) : null;
        this.mediaGenre = inits.isInitialized("mediaGenre") ? new QMediaGenreEntity(forProperty("mediaGenre"), inits.get("mediaGenre")) : null;
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

