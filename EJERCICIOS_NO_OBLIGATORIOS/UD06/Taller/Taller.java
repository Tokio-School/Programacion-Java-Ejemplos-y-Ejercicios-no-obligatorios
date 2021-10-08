package com.tokioschool.ejerciciotaller;

import com.tokioschool.ejerciciotaller.domain.Mecanico;
import com.tokioschool.ejerciciotaller.domain.Vehiculo;

public class Taller {

    Mecanico[] mecanicos;
    Vehiculo[] vehiculos;

    public Taller() {
        mecanicos = new Mecanico[10];
        mecanicos[0] = new Mecanico("asdasd", "asdad", "asdasd", "asdasd", 10);
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        Mecanico mecanico = mecanicos[0];
        mecanico.asignar(vehiculo);
    }

    public Mecanico getMecanico(int posicion) {
        return mecanicos[posicion];
    }
}
