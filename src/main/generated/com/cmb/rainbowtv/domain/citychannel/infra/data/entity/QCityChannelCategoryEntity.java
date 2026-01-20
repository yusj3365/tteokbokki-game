package com.cmb.rainbowtv.domain.citychannel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCityChannelCategoryEntity is a Querydsl query type for CityChannelCategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityChannelCategoryEntity extends EntityPathBase<CityChannelCategoryEntity> {

    private static final long serialVersionUID = -239393331L;

    public static final QCityChannelCategoryEntity cityChannelCategoryEntity = new QCityChannelCategoryEntity("cityChannelCategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Integer> cccDisplay = createNumber("cccDisplay", Integer.class);

    public final NumberPath<Long> cccIdx = createNumber("cccIdx", Long.class);

    public final StringPath cccName = createString("cccName");

    public final NumberPath<Long> cccSeq = createNumber("cccSeq", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QCityChannelCategoryEntity(String variable) {
        super(CityChannelCategoryEntity.class, forVariable(variable));
    }

    public QCityChannelCategoryEntity(Path<? extends CityChannelCategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCityChannelCategoryEntity(PathMetadata metadata) {
        super(CityChannelCategoryEntity.class, metadata);
    }

}

