package com.cmb.rainbowtv.domain.note.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoteEntity is a Querydsl query type for NoteEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoteEntity extends EntityPathBase<NoteEntity> {

    private static final long serialVersionUID = -1013937691L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoteEntity noteEntity = new QNoteEntity("noteEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath noContent = createString("noContent");

    public final NumberPath<Long> noIdx = createNumber("noIdx", Long.class);

    public final NumberPath<Long> noIsDelete = createNumber("noIsDelete", Long.class);

    public final QNoteBoxEntity noteBox;

    public final QNoteRecipientEntity noteRecipientEntity;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QNoteEntity(String variable) {
        this(NoteEntity.class, forVariable(variable), INITS);
    }

    public QNoteEntity(Path<? extends NoteEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoteEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoteEntity(PathMetadata metadata, PathInits inits) {
        this(NoteEntity.class, metadata, inits);
    }

    public QNoteEntity(Class<? extends NoteEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.noteBox = inits.isInitialized("noteBox") ? new QNoteBoxEntity(forProperty("noteBox"), inits.get("noteBox")) : null;
        this.noteRecipientEntity = inits.isInitialized("noteRecipientEntity") ? new QNoteRecipientEntity(forProperty("noteRecipientEntity"), inits.get("noteRecipientEntity")) : null;
    }

}

