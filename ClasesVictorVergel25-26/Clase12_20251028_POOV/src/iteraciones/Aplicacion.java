package iteraciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		String nombres[] = {"Ana", "Luis", "Pedro", "Maria", "Jorge"};
		String apellidos[] = {"Gomez", "Perez", "Lopez", "Garcia"};
		
		System.out.println(nombres.length);
		System.out.println(apellidos.length);
		
		//nombres[5] = "Sofia"; 
		String temporal[] = {"Ana", "Luis", "Pedro", "Maria", "Jorge","Sofia"};
		nombres = temporal;

		
		
		ArrayList<String> listaNombres = new ArrayList();
		listaNombres.add("Ana");
		listaNombres.add("Luis");
		listaNombres.add("Pedro");
		listaNombres.add("Maria");	
		listaNombres.add("Jorge");
		
		System.out.println(listaNombres.contains("Ana"));
		
		
		ArrayList<Nombre> listaNombres2 = new ArrayList();
		Nombre ana=new Nombre("Ana");
		listaNombres2.add(ana);
		listaNombres2.add(new Nombre("Luis"));
		listaNombres2.add(new Nombre("Pedro"));
		listaNombres2.add(new Nombre("Maria"));	
		listaNombres2.add(new Nombre("Jorge"));
		
		System.out.println(listaNombres2.contains("Ana"));
		System.out.println(listaNombres2.contains(new Nombre("Ana")));

		
		//listaNombres2.remove(new Nombre("Ana"));
		listaNombres2.remove(ana);
		//listaNombres2.remove(0);
		//listaNombres2.removeFirst();
		for (Nombre nombre : listaNombres2) {
			System.out.println(nombre);
		}
		System.out.println("Iterando");
		
		for (Iterator iterator = listaNombres2.iterator(); iterator.hasNext();) {
			Nombre nombre = (Nombre) iterator.next();
			System.out.println(nombre);
		}
		
		
	}

}
