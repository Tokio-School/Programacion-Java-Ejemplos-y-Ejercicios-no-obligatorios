package ud04;

import java.util.Random;

public class Ejercicio1_tokio {

	public static void main(String[] args) {
		
		//Escribe un programa que muestre, aleatoriamente, una palabra (Puedes partir de un diccionario almacenado en un array).
		
		String []nombres=new String[] {"Harry","Hermione","Ronald","Voldemort","Dumbledore","Sirius","Bellatrix","Hagrid"};
		
		Random aleatorio=new Random();
		
		int numero=aleatorio.nextInt(7);
		
		System.out.println(nombres[numero]);

	}

}
