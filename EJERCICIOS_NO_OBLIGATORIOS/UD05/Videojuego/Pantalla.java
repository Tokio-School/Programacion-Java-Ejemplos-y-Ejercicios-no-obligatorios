package com.tokioschool.videojuegopoo.domain;

public class Pantalla {
    private String nombre;
    private Item[] items;

    public Pantalla(String nombre, Item[] items) {
        this.nombre = nombre;
        this.items = items;
    }

    public Pantalla(String nombre) {
        this.nombre = nombre;
    }
}
