package Ejem02_hascode;

public class CloneHashCodeEjemplo {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 101);
        Empleado empleado2 = new Empleado("Ana", 102);
        
        System.out.println("Hashcode de empleado1: " + empleado1.hashCode());
        System.out.println("Hashcode de empleado2: " + empleado2.hashCode());
    }
}
