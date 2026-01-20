package com.cmb.rainbowtv.domain.log.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLoginLogHistoryEntity is a Querydsl query type for LoginLogHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLoginLogHistoryEntity extends EntityPathBase<LoginLogHistoryEntity> {

    private static final long serialVersionUID = 1100557660L;

    public static final QLoginLogHistoryEntity loginLogHistoryEntity = new QLoginLogHistoryEntity("loginLogHistoryEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final StringPath clientIp = createString("clientIp");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> lhIdx = createNumber("lhIdx", Long.class);

    public final StringPath mbId = createString("mbId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QLoginLogHistoryEntity(String variable) {
        super(LoginLogHistoryEntity.class, forVariable(variable));
    }

    public QLoginLogHistoryEntity(Path<? extends LoginLogHistoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLoginLogHistoryEntity(PathMetadata metadata) {
        super(LoginLogHistoryEntity.class, metadata);
    }

}

