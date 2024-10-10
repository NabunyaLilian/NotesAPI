package com.example.notes_api.service;

import com.example.notes_api.model.Note;
import com.example.notes_api.repository.NoteRepository;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAllNotes(){
        return noteRepository.findAll(); //Fetches all notes
    }

    public Optional<Note> getNoteById(Long id){
        return noteRepository.findById(id); // Fetch a note by ID
    }

    public Note createNote(Note note){
        return noteRepository.save(note); // Create a new note
    }

    public Note updateNote(Long id, Note note){
        note.setId(id); //set the ID of the note to update
        return noteRepository.save(note); //Update the note
    }

    public void deleteNote(Long id){
        noteRepository.deleteById(id); //Delete the note by ID
    }
}

