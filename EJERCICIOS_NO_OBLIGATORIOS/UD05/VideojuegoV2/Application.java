package com.tokioschool.videojuego;

import com.tokioschool.videojuego.domain.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String args[]) {
        List<com.tokioschool.videojuego.domain.Character> characters = new ArrayList<>();
        characters.add(new Player("yo", 12, null));
        characters.add(new ShooterEnemy("enemigo", 923, null, 0, "invisible", "asd", 33));

        Player player = new Player("yo", 10);
        player.addItem();
        player.addItem(new Item("asdasd", "asda", "asdas"));
        player.addItem(new Item("asdasd", "asda", "asdas"), new Item("asda", "asdas", "asdas"));

        com.tokioschool.videojuego.domain.Character character = characters.get(1);
        if (character instanceof Player) {
            Player player = (Player) character;
        } else if (character instanceof Enemy) {
            Enemy enemy = (Enemy) character;
            enemy.explode();
        }
    }
}
