package com.cmb.rainbowtv.domain.member.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberOutEntity is a Querydsl query type for MemberOutEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberOutEntity extends EntityPathBase<MemberOutEntity> {

    private static final long serialVersionUID = 1405877839L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberOutEntity memberOutEntity = new QMemberOutEntity("memberOutEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> mbNo = createNumber("mbNo", Long.class);

    public final QMemberOutCategoryEntity memberOutCategory;

    public final NumberPath<Long> moIdx = createNumber("moIdx", Long.class);

    public final NumberPath<Integer> moIsSelf = createNumber("moIsSelf", Integer.class);

    public final StringPath moReason = createString("moReason");

    public final DatePath<java.time.LocalDate> moStorageTerminationDate = createDate("moStorageTerminationDate", java.time.LocalDate.class);

    public final NumberPath<Integer> moType = createNumber("moType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QMemberOutEntity(String variable) {
        this(MemberOutEntity.class, forVariable(variable), INITS);
    }

    public QMemberOutEntity(Path<? extends MemberOutEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberOutEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberOutEntity(PathMetadata metadata, PathInits inits) {
        this(MemberOutEntity.class, metadata, inits);
    }

    public QMemberOutEntity(Class<? extends MemberOutEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberOutCategory = inits.isInitialized("memberOutCategory") ? new QMemberOutCategoryEntity(forProperty("memberOutCategory")) : null;
    }

}

