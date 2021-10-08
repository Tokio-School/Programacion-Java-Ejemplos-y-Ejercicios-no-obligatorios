package com.tokioschool.videojuego.domain;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private String image;
    private String effect;
    private List<Item> combinations;

    public Item(String name, String image, String effect) {
        this.name = name;
        this.image = image;
        this.effect = effect;
        combinations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getEffect() {
        return effect;
    }

    public List<Item> getCombinations() {
        return combinations;
    }
}
