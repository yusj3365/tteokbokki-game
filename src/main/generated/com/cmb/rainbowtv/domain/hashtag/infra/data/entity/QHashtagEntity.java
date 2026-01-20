package com.cmb.rainbowtv.domain.hashtag.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QHashtagEntity is a Querydsl query type for HashtagEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHashtagEntity extends EntityPathBase<HashtagEntity> {

    private static final long serialVersionUID = -1378404617L;

    public static final QHashtagEntity hashtagEntity = new QHashtagEntity("hashtagEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> htIdx = createNumber("htIdx", Long.class);

    public final StringPath name = createString("name");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QHashtagEntity(String variable) {
        super(HashtagEntity.class, forVariable(variable));
    }

    public QHashtagEntity(Path<? extends HashtagEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHashtagEntity(PathMetadata metadata) {
        super(HashtagEntity.class, metadata);
    }

}

