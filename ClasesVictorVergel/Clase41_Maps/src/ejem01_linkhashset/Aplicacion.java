package ejem01_linkhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> datosArrayList=new ArrayList<Integer>(List.of(1,2,3,1,2,3,3,3,5,6,7));
		System.out.println(datosArrayList);
		
		Set<Integer> datos=new HashSet<Integer>(datosArrayList);
		System.out.println(datos);
		
		List<Persona> datosPersonas=new ArrayList<Persona>(List.of(new Persona("Juan","Rodriguez",33)
				,new Persona("Luis","Garcia",22),new Persona("Luis","Garcia",22),new Persona("Ana","Muñoz",32)));
		
		
		
		Set<Persona> datosPersonas2=new LinkedHashSet<Persona>(datosPersonas);
		for (Persona persona : datosPersonas2) {
			System.out.println(persona);
		}		
		//Collections.addAll(datosPersonas2,new Persona());
		datosPersonas2.addAll(datosPersonas2);
		for (Persona persona : datosPersonas2) {
			System.out.println(persona);
		}
	}

	

}
