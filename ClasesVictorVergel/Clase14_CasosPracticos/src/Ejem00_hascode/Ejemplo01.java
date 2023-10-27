package Ejem00_hascode;

import java.util.ArrayList;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) obj;
        return this.nombre.equals(other.nombre) && this.edad == other.edad;
    }
}

public class Ejemplo01 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Maria", 30));
        personas.add(new Persona("Pedro", 35));

        Persona personaBuscada = new Persona("Juan", 25);
        boolean estaEnLaLista = personas.contains(personaBuscada);
        System.out.println("¿La persona buscada está en la lista? " + estaEnLaLista);
    }
}
