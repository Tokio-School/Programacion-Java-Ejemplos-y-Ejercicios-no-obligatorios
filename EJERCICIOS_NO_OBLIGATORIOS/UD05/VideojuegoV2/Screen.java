package com.tokioschool.videojuego.domain;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private String name;
    private List<Character> characters;

    public Screen(String name) {
        this.name = name;
        characters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
}
