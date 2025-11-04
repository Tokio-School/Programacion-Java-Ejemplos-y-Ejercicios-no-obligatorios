package ejem01_inteffunciona_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Ana", 30);
		Persona p2 = new Persona("Luis",25);
		Persona p3 = new Persona("Maria",28);
		Persona p4 = new Persona("Carlos",35);
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		Object[] personas=listaPersonas.toArray();
		
		/*Arrays.sort(personas, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Persona pe1 = (Persona)o1;
				Persona pe2 = (Persona)o2;
				return Integer.compare(pe1.getEdad(), pe2.getEdad());
			}
			
		});*/
		
		Arrays.sort(personas, ( o1,  o2)-> {
				Persona pe1 = (Persona)o1;
				Persona pe2 = (Persona)o2;
				return Integer.compare(pe1.getEdad(), pe2.getEdad());
		});
		
		
		System.out.println(Arrays.toString(personas));
	
	}

}
