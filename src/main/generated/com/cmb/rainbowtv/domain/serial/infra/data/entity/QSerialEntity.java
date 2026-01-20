package com.cmb.rainbowtv.domain.serial.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSerialEntity is a Querydsl query type for SerialEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSerialEntity extends EntityPathBase<SerialEntity> {

    private static final long serialVersionUID = -1470661531L;

    public static final QSerialEntity serialEntity = new QSerialEntity("serialEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> seIdx = createNumber("seIdx", Long.class);

    public final StringPath seNumber = createString("seNumber");

    public final NumberPath<Integer> seStatus = createNumber("seStatus", Integer.class);

    public final NumberPath<Integer> seTurnStatus = createNumber("seTurnStatus", Integer.class);

    public final NumberPath<Integer> seUse = createNumber("seUse", Integer.class);

    public final StringPath seUsid = createString("seUsid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSerialEntity(String variable) {
        super(SerialEntity.class, forVariable(variable));
    }

    public QSerialEntity(Path<? extends SerialEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSerialEntity(PathMetadata metadata) {
        super(SerialEntity.class, metadata);
    }

}

