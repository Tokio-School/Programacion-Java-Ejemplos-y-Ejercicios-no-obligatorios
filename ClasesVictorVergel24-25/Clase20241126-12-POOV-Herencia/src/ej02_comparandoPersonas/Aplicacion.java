package ej02_comparandoPersonas;

import java.util.Arrays;

public class Aplicacion {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Juan","Rodriguez", 30);
		Persona p2 = new Persona("Ana","Alonso", 30);
		Persona p3 = new Persona("Pedro","Martin", 30);
		Persona p4 = new Persona("Juan","Alonso", 40);
		
		Persona[] personas = {p1,p2,p3,p4};
		//String[] personas = {"Juan","Pedro","Ana","Luis","Carlos"};
		System.out.println(Arrays.toString(personas));
		Arrays.sort(personas);
		System.out.println(Arrays.toString(personas));
		


	}
}
