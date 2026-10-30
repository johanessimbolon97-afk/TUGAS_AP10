package com.unpri.charactermanager.model;

import java.util.ArrayList;

public class CharacterManager {
    private ArrayList<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    public void addCharacter(Character c) {
        characters.add(c);
    }

    public ArrayList<Character> getAllCharacters() {
        return characters;
    }
}