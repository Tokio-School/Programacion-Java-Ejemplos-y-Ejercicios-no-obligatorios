package com.tokioschool.videojuego.domain;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character {
    private List<Item> inventory;

    public Player(String name, int lives, Screen screen) {
        super(name, lives, screen);
        inventory = new ArrayList<>();
    }

    public Player(String name, int lives, Screen screen, List<Item> inventory) {
        super(name, lives, screen);
        this.inventory = inventory;
    }

    public Player(String name, int lives) {
        super(name, lives);
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void addItem(Item... items) {
        System.out.println(items.length);
        // items es un array de Items -> Item[]
    }
}
