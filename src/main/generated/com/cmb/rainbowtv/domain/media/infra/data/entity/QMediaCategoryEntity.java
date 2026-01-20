package com.cmb.rainbowtv.domain.media.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMediaCategoryEntity is a Querydsl query type for MediaCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMediaCategoryEntity extends EntityPathBase<MediaCategoryEntity> {

    private static final long serialVersionUID = 2118890373L;

    public static final QMediaCategoryEntity mediaCategoryEntity = new QMediaCategoryEntity("mediaCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> aosDisplay = createNumber("aosDisplay", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath guid = createString("guid");

    public final StringPath mcAosPackage = createString("mcAosPackage");

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryAttributeEnum> mcAttribute = createEnum("mcAttribute", com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryAttributeEnum.class);

    public final StringPath mcChannel = createString("mcChannel");

    public final NumberPath<Integer> mcClass = createNumber("mcClass", Integer.class);

    public final StringPath mcDashUrl = createString("mcDashUrl");

    public final NumberPath<Long> mcDepth = createNumber("mcDepth", Long.class);

    public final StringPath mcGameUrl = createString("mcGameUrl");

    public final StringPath mcGenre = createString("mcGenre");

    public final StringPath mcHlsUrl = createString("mcHlsUrl");

    public final NumberPath<Long> mcIdx = createNumber("mcIdx", Long.class);

    public final StringPath mcIosPackage = createString("mcIosPackage");

    public final NumberPath<Integer> mcIsGame = createNumber("mcIsGame", Integer.class);

    public final NumberPath<Integer> mcKind = createNumber("mcKind", Integer.class);

    public final StringPath mcLgPackage = createString("mcLgPackage");

    public final StringPath mcName = createString("mcName");

    public final StringPath mcPackage = createString("mcPackage");

    public final NumberPath<Long> mcParent = createNumber("mcParent", Long.class);

    public final NumberPath<Integer> mcSeq = createNumber("mcSeq", Integer.class);

    public final NumberPath<Integer> mcStatus = createNumber("mcStatus", Integer.class);

    public final StringPath mcTizenPackage = createString("mcTizenPackage");

    public final EnumPath<com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryEnum> mcType = createEnum("mcType", com.cmb.rainbowtv.domain.media.model.enums.MediaCategoryEnum.class);

    public final StringPath mcUrl = createString("mcUrl");

    public final StringPath mcVideoType = createString("mcVideoType");

    public final NumberPath<Integer> mcView = createNumber("mcView", Integer.class);

    public final StringPath mediaPackageId = createString("mediaPackageId");

    public final NumberPath<Integer> ottAppDisplay = createNumber("ottAppDisplay", Integer.class);

    public final NumberPath<Integer> smartDisplay = createNumber("smartDisplay", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMediaCategoryEntity(String variable) {
        super(MediaCategoryEntity.class, forVariable(variable));
    }

    public QMediaCategoryEntity(Path<? extends MediaCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMediaCategoryEntity(PathMetadata metadata) {
        super(MediaCategoryEntity.class, metadata);
    }

}

