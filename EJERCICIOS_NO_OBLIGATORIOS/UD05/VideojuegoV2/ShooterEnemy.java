package com.tokioschool.videojuego.domain;

public class ShooterEnemy extends Enemy {
    private String weapon;
    private int bullets;

    public ShooterEnemy(String name, int lives, Screen screen, int time, String ability, String weapon, int bullets) {
        super(name, lives, screen, time, ability);
        this.weapon = weapon;
        this.bullets = bullets;
    }

    public ShooterEnemy() {}

    public String getWeapon() {
        return weapon;
    }

    public int getBullets() {
        return bullets;
    }

    @Override
    public void explode() {
        System.out.println("Exploto disparando");
    }

    public void shoot() {
        System.out.println("dispara");
    }

    public void shoot(int bullets) {
        System.out.println("dispara " + bullets + " balas");
    }
}
