package com.tokioschool.videojuego.domain;

public abstract class Character {
    protected String name;
    protected int lives;
    protected Screen screen;

    public Character(String name, int lives, Screen screen) {
        this.name = name;
        this.lives = lives;
        this.screen = screen;
    }

    public Character(String name, int lives) {
        this.name = name;
        this.lives = lives;
        screen = null;
    }

    public String getName() {
        return name;
    }

    public int getLives() {
        return lives;
    }

    public Screen getScreen() {
        return screen;
    }
}
