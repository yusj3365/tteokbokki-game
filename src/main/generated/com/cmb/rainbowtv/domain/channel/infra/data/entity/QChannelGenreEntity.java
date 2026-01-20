package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChannelGenreEntity is a Querydsl query type for ChannelGenreEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelGenreEntity extends EntityPathBase<ChannelGenreEntity> {

    private static final long serialVersionUID = -284979132L;

    public static final QChannelGenreEntity channelGenreEntity = new QChannelGenreEntity("channelGenreEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> cgIdx = createNumber("cgIdx", Long.class);

    public final StringPath cgName = createString("cgName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelGenreEntity(String variable) {
        super(ChannelGenreEntity.class, forVariable(variable));
    }

    public QChannelGenreEntity(Path<? extends ChannelGenreEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannelGenreEntity(PathMetadata metadata) {
        super(ChannelGenreEntity.class, metadata);
    }

}

