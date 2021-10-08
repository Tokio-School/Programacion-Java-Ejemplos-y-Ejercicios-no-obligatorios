package com.tokioschool.videojuego.domain;

public abstract class Enemy extends Character {

    private int time;
    private String ability;

    public Enemy(String name, int lives, Screen screen, int time, String ability) {
        super(name, lives, screen);
        this.time = time;
        this.ability = ability;
    }

    public abstract void explode();
}
