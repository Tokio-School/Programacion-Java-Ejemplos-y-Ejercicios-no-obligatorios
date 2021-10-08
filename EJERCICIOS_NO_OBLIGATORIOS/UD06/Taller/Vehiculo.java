package com.tokioschool.ejerciciotaller.domain;

public class Vehiculo {
    private String bastidor;
    private String matricula;
    private String modelo;
    private String color;
    private int kilometraje;
    private boolean reparado;

    public Vehiculo(String bastidor, String matricula, String modelo, String color, int kilometraje) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        reparado = false;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isReparado() {
        return reparado;
    }

    public void asignar() {
        reparado = false;
    }

    public void reparar() {
        reparado = true;
    }

    public void hacerKilometros(int kilometros) {
        kilometraje += kilometros;
    }

    public void pintar(String color) {
        this.color = color;
    }
}
