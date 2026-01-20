package com.cmb.rainbowtv.domain.note.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoteBoxEntity is a Querydsl query type for NoteBoxEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoteBoxEntity extends EntityPathBase<NoteBoxEntity> {

    private static final long serialVersionUID = 1376259148L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoteBoxEntity noteBoxEntity = new QNoteBoxEntity("noteBoxEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> nbIdx = createNumber("nbIdx", Long.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity receiver;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity sender;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QNoteBoxEntity(String variable) {
        this(NoteBoxEntity.class, forVariable(variable), INITS);
    }

    public QNoteBoxEntity(Path<? extends NoteBoxEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoteBoxEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoteBoxEntity(PathMetadata metadata, PathInits inits) {
        this(NoteBoxEntity.class, metadata, inits);
    }

    public QNoteBoxEntity(Class<? extends NoteBoxEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.receiver = inits.isInitialized("receiver") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("receiver"), inits.get("receiver")) : null;
        this.sender = inits.isInitialized("sender") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("sender"), inits.get("sender")) : null;
    }

}

