package me.sabuj.secretnote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import me.sabuj.secretnote.data.Note;

public class NoteAdapter extends ArrayAdapter<Note> {
    private final Context context;
    private final Note[] notes;

    public NoteAdapter(Context context, Note[] notes) {
        super(context, R.layout.noteitem, notes);
        this.context = context;
        this.notes = notes;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.noteitem, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.listText);
        textView.setText(notes[position].title);
        return rowView;
    }
}
