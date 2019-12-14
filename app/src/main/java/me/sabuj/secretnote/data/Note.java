package me.sabuj.secretnote.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Note {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "text")
    public String text;
    @ColumnInfo(name = "password")
    public String password;

    public Note(int id, String title, String text, String password){
        this.id = id;
        this.title = title;
        this.text = text;
        this.password = password;
    }

    @Ignore
    public Note(String title, String text, String password){
        this.title = title;
        this.text = text;
        this.password = password;
    }
}
