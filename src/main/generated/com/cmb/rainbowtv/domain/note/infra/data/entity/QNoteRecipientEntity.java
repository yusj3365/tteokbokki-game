package com.cmb.rainbowtv.domain.note.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoteRecipientEntity is a Querydsl query type for NoteRecipientEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoteRecipientEntity extends EntityPathBase<NoteRecipientEntity> {

    private static final long serialVersionUID = -667056230L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoteRecipientEntity noteRecipientEntity = new QNoteRecipientEntity("noteRecipientEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QNoteEntity note;

    public final NumberPath<Long> nrIdx = createNumber("nrIdx", Long.class);

    public final NumberPath<Long> nrIsBlock = createNumber("nrIsBlock", Long.class);

    public final NumberPath<Long> nrIsDelete = createNumber("nrIsDelete", Long.class);

    public final NumberPath<Long> nrIsRead = createNumber("nrIsRead", Long.class);

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity recipient;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QNoteRecipientEntity(String variable) {
        this(NoteRecipientEntity.class, forVariable(variable), INITS);
    }

    public QNoteRecipientEntity(Path<? extends NoteRecipientEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoteRecipientEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoteRecipientEntity(PathMetadata metadata, PathInits inits) {
        this(NoteRecipientEntity.class, metadata, inits);
    }

    public QNoteRecipientEntity(Class<? extends NoteRecipientEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.note = inits.isInitialized("note") ? new QNoteEntity(forProperty("note"), inits.get("note")) : null;
        this.recipient = inits.isInitialized("recipient") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("recipient"), inits.get("recipient")) : null;
    }

}

