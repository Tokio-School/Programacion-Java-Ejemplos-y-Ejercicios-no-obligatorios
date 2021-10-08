package com.tokioschool.ejerciciotaller.domain;

public class Coche extends Vehiculo {

    private int capacidadMaletero;

    public Coche(String bastidor, String matricula, String modelo, String color, int kilometraje, int capacidadMaletero) {
        super(bastidor, matricula, modelo, color, kilometraje);
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
}
