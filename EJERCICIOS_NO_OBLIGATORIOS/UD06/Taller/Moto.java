package com.tokioschool.ejerciciotaller.domain;

public class Moto extends Vehiculo {

    private boolean carenado;
    private float peso;

    public Moto(String bastidor, String matricula, String modelo, String color, int kilometraje) {
        super(bastidor, matricula, modelo, color, kilometraje);
        this.carenado = carenado;
        this.peso = peso;
    }

    public boolean isCarenado() {
        return carenado;
    }

    public float getPeso() {
        return peso;
    }

    public void quitarCarenado() {
        carenado = false;
        peso -= 2;
    }

    public void ponerCarenado() {
        carenado = true;
        peso += 2;
    }
}
