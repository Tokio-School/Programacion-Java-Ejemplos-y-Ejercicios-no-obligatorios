import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Persona p2 = new Persona(25, "Juan", "12345678A");
		//Persona p3 = new Persona("87654321B");
		System.out.println(p1);
		System.out.println(p2);
		//System.out.println(p3);
		System.out.println(p2.getDni());
		
		
		
	}

}
