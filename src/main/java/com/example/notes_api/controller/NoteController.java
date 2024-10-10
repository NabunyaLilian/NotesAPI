package com.example.notes_api.controller;

import com.example.notes_api.model.Note;
import com.example.notes_api.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes") //Base url for the API
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id).map(note -> new ResponseEntity<>(note, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody  Note note){
        Note createdNote = noteService.createNote(note);
        return new ResponseEntity<>(createdNote, HttpStatus.CREATED); // Return created note with 201 status
    }

    @PutMapping("/{id}")
    public ResponseEntity<Note> updateNote(@PathVariable Long id, @RequestBody Note note){
        return new ResponseEntity<>(noteService.updateNote(id, note), HttpStatus.OK); // Return update note
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable Long id){
        noteService.deleteNote(id); //Delete the note
        return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 status
    }
}
