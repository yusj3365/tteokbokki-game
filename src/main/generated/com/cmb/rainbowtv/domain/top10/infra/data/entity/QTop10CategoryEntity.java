package com.cmb.rainbowtv.domain.top10.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTop10CategoryEntity is a Querydsl query type for Top10CategoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTop10CategoryEntity extends EntityPathBase<Top10CategoryEntity> {

    private static final long serialVersionUID = -1489381339L;

    public static final QTop10CategoryEntity top10CategoryEntity = new QTop10CategoryEntity("top10CategoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> tcAuto = createNumber("tcAuto", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.top10.model.enums.Top10ContentEnum> tcContent = createEnum("tcContent", com.cmb.rainbowtv.domain.top10.model.enums.Top10ContentEnum.class);

    public final EnumPath<com.cmb.rainbowtv.domain.top10.model.enums.Top10DisplayEnum> tcDisplay = createEnum("tcDisplay", com.cmb.rainbowtv.domain.top10.model.enums.Top10DisplayEnum.class);

    public final NumberPath<Long> tcIdx = createNumber("tcIdx", Long.class);

    public final StringPath tcName = createString("tcName");

    public final EnumPath<com.cmb.rainbowtv.domain.top10.model.enums.Top10TypeEnum> tcType = createEnum("tcType", com.cmb.rainbowtv.domain.top10.model.enums.Top10TypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QTop10CategoryEntity(String variable) {
        super(Top10CategoryEntity.class, forVariable(variable));
    }

    public QTop10CategoryEntity(Path<? extends Top10CategoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTop10CategoryEntity(PathMetadata metadata) {
        super(Top10CategoryEntity.class, metadata);
    }

}

