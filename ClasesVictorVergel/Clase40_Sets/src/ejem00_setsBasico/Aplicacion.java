package ejem00_setsBasico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> datosArrayList=new ArrayList<Integer>(List.of(1,2,3,1,2,3,3,3,5,6,7));
		System.out.println(datosArrayList);
		
		Set<Integer> datos=new HashSet<Integer>(datosArrayList);
		System.out.println(datos);
		
		List<Persona> datosPersonas=new ArrayList<Persona>(List.of(new Persona("Juan","Rodriguez",33)
				,new Persona("Luis","Garcia",22),new Persona("Luis","Garcia",22)));
		
		System.out.println("HashCode:");
		for (Persona persona : datosPersonas) {
			System.out.println(persona.hashCode());
		}
		
		
		Set<Integer> datosPersonas2=new HashSet(datosPersonas);
		System.out.println("==>"+datosPersonas2);
		datosPersonas.sort(Comparator.comparing(Persona::getNombre));
		System.out.println(datosPersonas2);
		
		
		//Persona luis=new Persona("Luis","Garcia",22);
	/**	Persona p1=new Persona("Luis","Garcia",22);
		Persona p2=new Persona("Luis","Garcia",22);
		System.out.println(p1.equals(p2));
		
		/*HashSet<Persona> datosPersonas=new HashSet<Persona>(List.of(new Persona("Juan","Rodriguez",33)
				,new Persona("Luis","Garcia",22)
				,new Persona("Luis","Garcia",22)));*/
	/**	HashSet<Persona> datosPersonas=new HashSet<Persona>();
		datosPersonas.add(new Persona("Juan","Rodriguez",33));
		datosPersonas.add(new Persona("Luis","Garcia",22));
		datosPersonas.add(new Persona("Luis","Garcia",22));
		datosPersonas.add(new Persona("Luis","Rodriguez",22));
		datosPersonas.add(new Persona("Ana","Muños",14));
		datosPersonas.add(new Persona("Belen","Arteaga",15));
		datosPersonas.add(new Persona("Maria","Alonso",18));
		System.out.println(datosPersonas);
		
		
		CriterioOrdenacionPersona comparacion=new CriterioOrdenacionPersona(CriterioOrdenacionPersona.Criterio.EDAD);
		TreeSet<Persona> treeSetPersona=new TreeSet<Persona>(comparacion);
		treeSetPersona.addAll(datosPersonas);
		System.out.println(treeSetPersona);
		*/
		
		
		
		
		
	}

	

}
