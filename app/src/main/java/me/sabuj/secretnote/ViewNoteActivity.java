package me.sabuj.secretnote;

import androidx.appcompat.app.AppCompatActivity;
import me.sabuj.secretnote.data.Note;
import me.sabuj.secretnote.data.NoteDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ViewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        TextView textView = findViewById(R.id.view_note);

        Intent intent = getIntent();
        int note_id = intent.getIntExtra("note_id", 0);

        NoteDatabase noteDatabase = NoteDatabase.getInstance(ViewNoteActivity.this);
        Note note = noteDatabase.noteDao().getNoteById(note_id);
        textView.setText(note.text);
    }
}
