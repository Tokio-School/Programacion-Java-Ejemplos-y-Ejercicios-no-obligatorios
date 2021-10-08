package com.tokioschool.videojuego.domain;

public class JumperShooterEnemy extends JumperEnemy {

    private ShooterEnemy shooterEnemy;

    public JumperShooterEnemy(String name, int lives, Screen screen, int time, String ability, String weapon, int bullets,
                              int jumpHeight) {
        super(name, lives, screen, time, ability, jumpHeight);
        shooterEnemy = new ShooterEnemy(name, lives, screen, time, ability, weapon, bullets);
    }

    public String getWeapon() {
        return shooterEnemy.getWeapon();
    }

    public void shoot() {
        shooterEnemy.shoot();
    }

    @Override
    public void explode() {

    }
}
