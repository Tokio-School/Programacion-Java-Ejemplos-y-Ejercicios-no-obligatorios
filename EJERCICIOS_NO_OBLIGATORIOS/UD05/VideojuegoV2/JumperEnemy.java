package com.tokioschool.videojuego.domain;

public class JumperEnemy extends Enemy {
    private int jumpHeight;

    public JumperEnemy(String name, int lives, Screen screen, int time, String ability, int jumpHeight) {
        super(name, lives, screen, time, ability);
        this.jumpHeight = jumpHeight;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public void explode() {
        System.out.println("Exploto saltando");
    }

    public void jump() {
        System.out.println("Salta");
    }
}
