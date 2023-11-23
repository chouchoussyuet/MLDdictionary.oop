package com.example.myjavafxapp.model;

import java.util.ArrayList;

public class Dictionary {
    private static ArrayList<Word> words;

    public Dictionary() {
        words = new ArrayList<>();
    }

    public void addWord(Word word) {

        words.add(word);
    }

    public ArrayList<Word> getAllWords() {
        return words;
    }
}
