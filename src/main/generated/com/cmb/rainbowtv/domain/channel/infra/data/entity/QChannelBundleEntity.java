package com.cmb.rainbowtv.domain.channel.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QChannelBundleEntity is a Querydsl query type for ChannelBundleEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelBundleEntity extends EntityPathBase<ChannelBundleEntity> {

    private static final long serialVersionUID = 724341191L;

    public static final QChannelBundleEntity channelBundleEntity = new QChannelBundleEntity("channelBundleEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Double> cbFee = createNumber("cbFee", Double.class);

    public final NumberPath<Integer> cbFeeType = createNumber("cbFeeType", Integer.class);

    public final NumberPath<Long> cbIdx = createNumber("cbIdx", Long.class);

    public final NumberPath<Integer> cbInvest = createNumber("cbInvest", Integer.class);

    public final StringPath cbName = createString("cbName");

    public final NumberPath<Long> cbPrice = createNumber("cbPrice", Long.class);

    public final NumberPath<Integer> cbType = createNumber("cbType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QChannelBundleEntity(String variable) {
        super(ChannelBundleEntity.class, forVariable(variable));
    }

    public QChannelBundleEntity(Path<? extends ChannelBundleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannelBundleEntity(PathMetadata metadata) {
        super(ChannelBundleEntity.class, metadata);
    }

}

