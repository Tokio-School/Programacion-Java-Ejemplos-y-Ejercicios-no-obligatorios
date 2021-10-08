package com.tokioschool.videojuegopoo;

import com.tokioschool.videojuegopoo.domain.Enemigo;
import com.tokioschool.videojuegopoo.domain.Item;
import com.tokioschool.videojuegopoo.domain.Pantalla;
import com.tokioschool.videojuegopoo.domain.Personaje;

public class Aplicacion {
    public static void main(String args[]) {
        // Inicio de la partida
        Personaje personaje = new Personaje();
        Pantalla pantalla = new Pantalla("Primera");
        Enemigo enemigo1 = new Enemigo("malo", 3, pantalla, "inicio", "matarme");
        Enemigo enemigo2 = new Enemigo("dfgdfgdfg", 3, pantalla, "inicio", "matarme");

        if (enemigo1.equals(personaje)) {
            System.out.println("Son el mismo enemigo");
        } else {
            System.out.println("Son distinto enemigo");
        }

        System.out.println(enemigo1);

        // el usuario moverÃ­a al personaje con el teclado

        personaje.quitarVida();
        personaje.quitarVida(2);
    }

    public static void cargarPartida() {
        // Carga partida con datos del disco
        int vida = 0;
        int puntos = 0;
        Pantalla pantalla = null;
        Item[] inventario = null;

        Personaje personaje = new Personaje(vida, puntos, inventario, pantalla);
    }
}
