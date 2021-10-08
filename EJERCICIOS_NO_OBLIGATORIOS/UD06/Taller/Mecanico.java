package com.tokioschool.ejerciciotaller.domain;

public class Mecanico {

    private String nombre;
    private String apellidos;
    private String email;
    private String especialidad;
    private int numeroRepaciones;
    private Vehiculo vehiculo;

    public Mecanico(String nombre, String apellidos, String email, String especialidad, int numeroRepaciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.especialidad = especialidad;
        this.numeroRepaciones = numeroRepaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getNumeroRepaciones() {
        return numeroRepaciones;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void asignar(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.vehiculo.asignar();
    }

    public void reparar() {

        if (vehiculo instanceof Coche) {
            System.out.println("Coche arreglado");
            Coche coche = (Coche) vehiculo;
            coche.setCapacidadMaletero(coche.getCapacidadMaletero() + 10);
        } else if (vehiculo instanceof Moto) {
            System.out.println("Moto arreglado");
        } else if (vehiculo instanceof Camion) {
            System.out.println("Camion arreglado");
        }

        vehiculo.reparar();
    }
}
