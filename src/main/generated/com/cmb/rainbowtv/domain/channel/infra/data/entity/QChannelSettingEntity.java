package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChannelSettingEntity is a Querydsl query type for ChannelSettingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelSettingEntity extends EntityPathBase<ChannelSettingEntity> {

    private static final long serialVersionUID = 39632849L;

    public static final QChannelSettingEntity channelSettingEntity = new QChannelSettingEntity("channelSettingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Integer> csDisplay = createNumber("csDisplay", Integer.class);

    public final NumberPath<Long> csIdx = createNumber("csIdx", Long.class);

    public final NumberPath<Integer> csType = createNumber("csType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelSettingEntity(String variable) {
        super(ChannelSettingEntity.class, forVariable(variable));
    }

    public QChannelSettingEntity(Path<? extends ChannelSettingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannelSettingEntity(PathMetadata metadata) {
        super(ChannelSettingEntity.class, metadata);
    }

}

