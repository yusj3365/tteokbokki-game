package com.cmb.rainbowtv.domain.homechoice.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QHomeChoiceVisibleEntity is a Querydsl query type for HomeChoiceVisibleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHomeChoiceVisibleEntity extends EntityPathBase<HomeChoiceVisibleEntity> {

    private static final long serialVersionUID = 1223012115L;

    public static final QHomeChoiceVisibleEntity homeChoiceVisibleEntity = new QHomeChoiceVisibleEntity("homeChoiceVisibleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath hcvCategoryName = createString("hcvCategoryName");

    public final NumberPath<Long> hcvIdx = createNumber("hcvIdx", Long.class);

    public final NumberPath<Integer> hcvIsVisible = createNumber("hcvIsVisible", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QHomeChoiceVisibleEntity(String variable) {
        super(HomeChoiceVisibleEntity.class, forVariable(variable));
    }

    public QHomeChoiceVisibleEntity(Path<? extends HomeChoiceVisibleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHomeChoiceVisibleEntity(PathMetadata metadata) {
        super(HomeChoiceVisibleEntity.class, metadata);
    }

}

