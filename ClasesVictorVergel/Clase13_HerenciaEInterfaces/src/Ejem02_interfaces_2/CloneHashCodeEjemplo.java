package Ejem02_interfaces_2;

public class CloneHashCodeEjemplo {

	public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25,33);

        try {
            // Clonar el objeto persona1
            Persona persona2 = (Persona) persona1.clone();

            // Modificar el objeto clonado
            persona2.setNombre("Ana");
            persona2.setEdad(30);
            persona2.setDni(9393);

            System.out.println("Persona 1: " + persona1);
            System.out.println("Persona 2 (clonada): " + persona2);
            
            System.out.println(persona1.hashCode());
            System.out.println(persona2.hashCode());
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
