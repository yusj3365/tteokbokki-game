package com.cmb.rainbowtv.global.define.area.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAreaDefineEntity is a Querydsl query type for AreaDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAreaDefineEntity extends EntityPathBase<AreaDefineEntity> {

    private static final long serialVersionUID = -78496080L;

    public static final QAreaDefineEntity areaDefineEntity = new QAreaDefineEntity("areaDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath adAdministCode = createString("adAdministCode");

    public final DatePath<java.time.LocalDate> adCreateDate = createDate("adCreateDate", java.time.LocalDate.class);

    public final StringPath adDong = createString("adDong");

    public final StringPath adDongName = createString("adDongName");

    public final StringPath adGu = createString("adGu");

    public final NumberPath<Long> adIdx = createNumber("adIdx", Long.class);

    public final NumberPath<Integer> adIsExpressCost = createNumber("adIsExpressCost", Integer.class);

    public final StringPath adLegalCode = createString("adLegalCode");

    public final StringPath adParent = createString("adParent");

    public final StringPath adShortSi = createString("adShortSi");

    public final StringPath adSi = createString("adSi");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QAreaDefineEntity(String variable) {
        super(AreaDefineEntity.class, forVariable(variable));
    }

    public QAreaDefineEntity(Path<? extends AreaDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAreaDefineEntity(PathMetadata metadata) {
        super(AreaDefineEntity.class, metadata);
    }

}

