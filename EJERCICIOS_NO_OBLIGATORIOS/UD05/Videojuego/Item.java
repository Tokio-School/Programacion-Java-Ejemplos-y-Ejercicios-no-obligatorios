package com.tokioschool.videojuegopoo.domain;

public class Item {
    private String nombre;
    private String imagen;
    private String efecto;

    private Item[] combinados;

    public Item(String nombre, String imagen, String efecto, Item[] combinados) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.efecto = efecto;
        this.combinados = combinados;
    }

    public Item(String nombre, String imagen, String efecto) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.efecto = efecto;
    }

    public Item(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
        efecto = "Sin efecto";
    }
}
