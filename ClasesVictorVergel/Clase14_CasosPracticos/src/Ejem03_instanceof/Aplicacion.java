package Ejem03_instanceof;

class Vehiculo {
    // Clase base Vehiculo
}

class Coche extends Vehiculo {
    // Clase derivada Coche
}

public class Aplicacion {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        
        if (miCoche instanceof Vehiculo) {
            System.out.println("miCoche es una instancia de Vehiculo");
        }
        
        if (miCoche instanceof Coche) {
            System.out.println("miCoche es una instancia de Coche");
        }
    }
}

