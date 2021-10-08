package com.tokioschool.videojuegopoo.domain;

public class Personaje {
    private int vida;
    private int puntos;
    private Item[] inventario;
    private Pantalla pantallaActual;
    private int posicionInventario;

    public Personaje() {
        vida = 3;
        puntos = 0;
        inventario = new Item[10];
        posicionInventario = 0;
    }

    public Personaje(int vida, int puntos, Item[] inventario, Pantalla pantalla) {
        this.vida = vida;
        this.puntos = puntos;
        this.inventario = inventario;
        pantallaActual = pantalla;
    }

    public int getVida() { return vida; }
    public int getPuntos() { return puntos; }

    public void cogerItem(Item item) {
        inventario[posicionInventario] = item;
        posicionInventario++;
    }

    public void utilizarItem() {
        posicionInventario--;
        Item item = inventario[posicionInventario];
        inventario[posicionInventario] = null;
    }

    public void quitarVida() {
        vida--;
    }

    public void quitarVida(int puntos) {
        vida -= puntos;
    }

    public void saltar() {

    }
}
