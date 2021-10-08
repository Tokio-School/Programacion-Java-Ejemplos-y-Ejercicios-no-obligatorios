package com.tokioschool.ejerciciotaller;

import com.tokioschool.ejerciciotaller.domain.Camion;
import com.tokioschool.ejerciciotaller.domain.Coche;
import com.tokioschool.ejerciciotaller.domain.Mecanico;
import com.tokioschool.ejerciciotaller.domain.Moto;

public class Application {
    public static void main(String args[]) {
        Coche coche = new Coche("asdad", "asdad", "asdasd", "rojo", 3443, 343);
        Moto moto = new Moto("asdas", "asdasd", "asdasd", "verde", 434);
        Camion camion = new Camion("asdasd", "asdasd", "asdasd", "asdasd", 3344, true);
        coche.hacerKilometros(1000000);
        Taller taller = new Taller();

        taller.registrarVehiculo(moto);
        System.out.println(camion.isReparado());

        Mecanico mecanico = taller.getMecanico(0);
        mecanico.reparar();

        System.out.println(camion.isReparado());

    }
}
