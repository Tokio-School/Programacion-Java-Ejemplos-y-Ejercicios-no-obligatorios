package com.tokioschool.videojuegopoo.domain;

public class Enemigo {
    private String nombre;
    private int vida;
    private Pantalla pantalla;
    private String momentoAparecer;
    private String habilidad;

    public Enemigo(String nombre, int vida, Pantalla pantalla, String momentoAparecer, String habilidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.pantalla = pantalla;
        this.momentoAparecer = momentoAparecer;
        this.habilidad = habilidad;
    }

    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Enemigo))
            return false;

        Enemigo otroEnemigo = (Enemigo) objeto;
        if (otroEnemigo.nombre.equals(nombre)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return nombre + ": " + habilidad;
    }
}
