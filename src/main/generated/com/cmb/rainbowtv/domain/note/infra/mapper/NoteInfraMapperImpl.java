package com.cmb.rainbowtv.domain.note.infra.mapper;

import com.cmb.rainbowtv.domain.member.infra.MemberInfraMapper;
import com.cmb.rainbowtv.domain.note.infra.data.entity.NoteBoxEntity;
import com.cmb.rainbowtv.domain.note.infra.data.entity.NoteEntity;
import com.cmb.rainbowtv.domain.note.infra.data.entity.NoteRecipientEntity;
import com.cmb.rainbowtv.domain.note.model.Note;
import com.cmb.rainbowtv.domain.note.model.NoteBox;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:40+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class NoteInfraMapperImpl implements NoteInfraMapper {

    @Autowired
    private MemberInfraMapper memberInfraMapper;

    @Override
    public NoteBox toNoteBox(NoteBoxEntity noteBoxEntity, List<Note> notes) {
        if ( noteBoxEntity == null && notes == null ) {
            return null;
        }

        NoteBox.NoteBoxBuilder noteBox = NoteBox.builder();

        if ( noteBoxEntity != null ) {
            noteBox.nbIdx( noteBoxEntity.getNbIdx() );
            noteBox.sender( memberInfraMapper.toMember( noteBoxEntity.getSender() ) );
            noteBox.receiver( memberInfraMapper.toMember( noteBoxEntity.getReceiver() ) );
        }
        List<Note> list = notes;
        if ( list != null ) {
            noteBox.notes( new ArrayList<Note>( list ) );
        }

        return noteBox.build();
    }

    @Override
    public Note toNote(NoteEntity noteEntity, NoteRecipientEntity noteRecipientEntity) {
        if ( noteEntity == null && noteRecipientEntity == null ) {
            return null;
        }

        Note.NoteBuilder note = Note.builder();

        if ( noteEntity != null ) {
            note.createdAt( noteEntity.getCreatedAt() );
            note.writer( memberInfraMapper.toMember( noteEntity.getMember() ) );
            note.noIdx( noteEntity.getNoIdx() );
            note.noContent( noteEntity.getNoContent() );
            note.noIsDelete( noteEntity.getNoIsDelete() );
        }
        if ( noteRecipientEntity != null ) {
            note.recipient( memberInfraMapper.toMember( noteRecipientEntity.getRecipient() ) );
            note.nrIsRead( noteRecipientEntity.getNrIsRead() );
            note.nrIsBlock( noteRecipientEntity.getNrIsBlock() );
            note.nrIsDelete( noteRecipientEntity.getNrIsDelete() );
            note.nrIdx( noteRecipientEntity.getNrIdx() );
        }

        return note.build();
    }

    @Override
    public NoteEntity toNoteEntity(NoteBox noteBox, Note note) {
        if ( noteBox == null && note == null ) {
            return null;
        }

        NoteEntity.NoteEntityBuilder noteEntity = NoteEntity.builder();

        if ( note != null ) {
            noteEntity.noteRecipientEntity( noteToNoteRecipientEntity( note ) );
            noteEntity.member( memberInfraMapper.toMemberEntity( note.getWriter() ) );
            noteEntity.noIdx( note.getNoIdx() );
            noteEntity.noContent( note.getNoContent() );
            noteEntity.noIsDelete( note.getNoIsDelete() );
        }
        noteEntity.noteBox( toNoteBoxEntity( noteBox ) );

        return noteEntity.build();
    }

    @Override
    public NoteBoxEntity toNoteBoxEntity(NoteBox noteBox) {
        if ( noteBox == null ) {
            return null;
        }

        NoteBoxEntity.NoteBoxEntityBuilder noteBoxEntity = NoteBoxEntity.builder();

        noteBoxEntity.nbIdx( noteBox.getNbIdx() );
        noteBoxEntity.sender( memberInfraMapper.toMemberEntity( noteBox.getSender() ) );
        noteBoxEntity.receiver( memberInfraMapper.toMemberEntity( noteBox.getReceiver() ) );

        return noteBoxEntity.build();
    }

    protected NoteRecipientEntity noteToNoteRecipientEntity(Note note) {
        if ( note == null ) {
            return null;
        }

        NoteRecipientEntity.NoteRecipientEntityBuilder noteRecipientEntity = NoteRecipientEntity.builder();

        noteRecipientEntity.recipient( memberInfraMapper.toMemberEntity( note.getRecipient() ) );
        noteRecipientEntity.nrIsRead( note.getNrIsRead() );
        noteRecipientEntity.nrIsBlock( note.getNrIsBlock() );
        noteRecipientEntity.nrIsDelete( note.getNrIsDelete() );

        return noteRecipientEntity.build();
    }
}
