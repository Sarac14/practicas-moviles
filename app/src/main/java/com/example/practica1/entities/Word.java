package com.example.practica1.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @NonNull
    private String word;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Word(@NonNull String word) {this.word = word;}

    @NotNull
    public String getWord(){return this.word;}
}
