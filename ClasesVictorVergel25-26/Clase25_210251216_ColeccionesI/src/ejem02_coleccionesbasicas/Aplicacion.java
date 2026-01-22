package ejem02_coleccionesbasicas;

import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coleccion<String> coleccionDeNombres = new Coleccion<String>();
		coleccionDeNombres.add("Juan");
		coleccionDeNombres.add("María");
		coleccionDeNombres.add("Lucas");
		coleccionDeNombres.add("Ana");
		//coleccionDeNombres.clear();
		coleccionDeNombres.add("Pedro");
		System.out.println(coleccionDeNombres);
		System.out.println(coleccionDeNombres.size());

		System.out.println("--------------");
		
		for (Iterator<String> iterator = coleccionDeNombres.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
		
		
		
		
	}

}
