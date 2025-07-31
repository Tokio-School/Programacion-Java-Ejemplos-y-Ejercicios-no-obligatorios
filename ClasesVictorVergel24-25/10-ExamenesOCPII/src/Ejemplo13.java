record Persona(String nombre, int edad) {}

public class Ejemplo13 {
    public static void main(String[] args) {
        Persona p = new Persona("Laura", 30);
        System.out.println(p.nombre());
    }
}

/**
Opciones:
A) Laura
B) nombre
C) 30
D) Error de compilación
*/