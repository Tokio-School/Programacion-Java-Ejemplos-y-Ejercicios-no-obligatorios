package com.tokioschool.ejerciciotaller.domain;

public class Camion extends Vehiculo {

    private boolean remolque;

    public Camion(String bastidor, String matricula, String modelo, String color, int kilometraje, boolean remolque) {
        super(bastidor, matricula, modelo, color, kilometraje);
        this.remolque = remolque;
    }
}
