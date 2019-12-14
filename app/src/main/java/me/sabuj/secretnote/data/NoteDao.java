package me.sabuj.secretnote.data;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface NoteDao {
    @Query("select * from note")
    List<Note> getNoteList();
    @Query("select * from note where id=:note_id LIMIT 1")
    Note getNoteById(int note_id);
    @Insert
    void insertNote(Note note);
    @Update
    void updateNote(Note note);
    @Delete
    void deleteNote(Note note);
}
