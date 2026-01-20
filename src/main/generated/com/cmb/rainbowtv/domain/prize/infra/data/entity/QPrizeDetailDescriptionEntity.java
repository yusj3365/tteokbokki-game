package com.cmb.rainbowtv.domain.prize.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPrizeDetailDescriptionEntity is a Querydsl query type for PrizeDetailDescriptionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrizeDetailDescriptionEntity extends EntityPathBase<PrizeDetailDescriptionEntity> {

    private static final long serialVersionUID = 932142158L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPrizeDetailDescriptionEntity prizeDetailDescriptionEntity = new QPrizeDetailDescriptionEntity("prizeDetailDescriptionEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath pddContent = createString("pddContent");

    public final NumberPath<Long> pddIdx = createNumber("pddIdx", Long.class);

    public final NumberPath<Integer> pddSeq = createNumber("pddSeq", Integer.class);

    public final EnumPath<com.cmb.rainbowtv.domain.prize.model.enums.PrizeDetailTypeEnum> pddType = createEnum("pddType", com.cmb.rainbowtv.domain.prize.model.enums.PrizeDetailTypeEnum.class);

    public final QPrizeEntity prize;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPrizeDetailDescriptionEntity(String variable) {
        this(PrizeDetailDescriptionEntity.class, forVariable(variable), INITS);
    }

    public QPrizeDetailDescriptionEntity(Path<? extends PrizeDetailDescriptionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPrizeDetailDescriptionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPrizeDetailDescriptionEntity(PathMetadata metadata, PathInits inits) {
        this(PrizeDetailDescriptionEntity.class, metadata, inits);
    }

    public QPrizeDetailDescriptionEntity(Class<? extends PrizeDetailDescriptionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.prize = inits.isInitialized("prize") ? new QPrizeEntity(forProperty("prize")) : null;
    }

}

