package me.sabuj.secretnote;

import androidx.appcompat.app.AppCompatActivity;
import me.sabuj.secretnote.data.Note;
import me.sabuj.secretnote.data.NoteDatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewNoteActivity extends AppCompatActivity {
    EditText title, text, password;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        title = findViewById(R.id.title);
        text = findViewById(R.id.text);
        password = findViewById(R.id.password);
        saveBtn = findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String note_tile = title.getText().toString();
                String note_text = text.getText().toString();
                String note_password = password.getText().toString();

                Note note = new Note(note_tile, note_text, note_password);
                NoteDatabase noteDatabase = NoteDatabase.getInstance(NewNoteActivity.this);
                noteDatabase.noteDao().insertNote(note);
                finish();
            }
        });
    }
}
