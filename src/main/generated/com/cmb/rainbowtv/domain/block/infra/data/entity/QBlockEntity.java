package com.cmb.rainbowtv.domain.block.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBlockEntity is a Querydsl query type for BlockEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBlockEntity extends EntityPathBase<BlockEntity> {

    private static final long serialVersionUID = -986612295L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBlockEntity blockEntity = new QBlockEntity("blockEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    public final NumberPath<Long> blBlock = createNumber("blBlock", Long.class);

    public final NumberPath<Long> blIdx = createNumber("blIdx", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QBlockEntity(String variable) {
        this(BlockEntity.class, forVariable(variable), INITS);
    }

    public QBlockEntity(Path<? extends BlockEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBlockEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBlockEntity(PathMetadata metadata, PathInits inits) {
        this(BlockEntity.class, metadata, inits);
    }

    public QBlockEntity(Class<? extends BlockEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
    }

}

