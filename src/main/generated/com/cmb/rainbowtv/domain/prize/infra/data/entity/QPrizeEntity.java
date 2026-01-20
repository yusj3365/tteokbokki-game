package com.cmb.rainbowtv.domain.prize.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPrizeEntity is a Querydsl query type for PrizeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrizeEntity extends EntityPathBase<PrizeEntity> {

    private static final long serialVersionUID = 470986307L;

    public static final QPrizeEntity prizeEntity = new QPrizeEntity("prizeEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> prCategory = createNumber("prCategory", Integer.class);

    public final StringPath prCode = createString("prCode");

    public final EnumPath<com.cmb.rainbowtv.domain.prize.model.enums.PrizeCompanyEnum> prCompany = createEnum("prCompany", com.cmb.rainbowtv.domain.prize.model.enums.PrizeCompanyEnum.class);

    public final StringPath prExchangeName = createString("prExchangeName");

    public final NumberPath<Long> prIdx = createNumber("prIdx", Long.class);

    public final StringPath prInfo = createString("prInfo");

    public final NumberPath<Integer> prIsUse = createNumber("prIsUse", Integer.class);

    public final NumberPath<Integer> prLimitAge = createNumber("prLimitAge", Integer.class);

    public final StringPath prName = createString("prName");

    public final DatePath<java.time.LocalDate> prPostTimeEd = createDate("prPostTimeEd", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> prPostTimeSt = createDate("prPostTimeSt", java.time.LocalDate.class);

    public final NumberPath<Long> prPrice = createNumber("prPrice", Long.class);

    public final NumberPath<Integer> prSellStatus = createNumber("prSellStatus", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPrizeEntity(String variable) {
        super(PrizeEntity.class, forVariable(variable));
    }

    public QPrizeEntity(Path<? extends PrizeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPrizeEntity(PathMetadata metadata) {
        super(PrizeEntity.class, metadata);
    }

}

