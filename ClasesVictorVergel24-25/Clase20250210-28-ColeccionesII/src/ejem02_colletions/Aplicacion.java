package ejem02_colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aplicacion {
	
	public static void main(String args[])
	{
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		lista.add(new Articulo("Articulo a", 130));
		lista.add(new Articulo("Articulo b", 20));
		lista.add(new Articulo("Articulo 3", 350));
		lista.add(new Articulo("Articulo 4", 10));
		
		if (lista.get(0).compareTo(lista.get(1))>0) 
			//System.out.println("El articulo 1 es mayor que el articulo 2");
			System.out.println("El articulo 1 tiene mayor precio que el 2");
		else
			//System.out.println("El articulo 1 es menor que el articulo 2");
			System.out.println("El articulo 1 tiene menor precio que el 2");
		
		System.out.println("Antes de ordenar");
		for (Articulo articulo : lista) {
			System.out.println(articulo);
		}
		System.out.println("Después de ordenar con el criterio por defecto de los Articulo (precio de menor a mayor)");
		Collections.sort(lista);
		for (Articulo articulo : lista) {
			System.out.println(articulo);
		}
		
		/*Comparator criterioComparacion=new Comparator() {
			@Override
			public int compare(Object articulo1, Object articulo2) {
				// TODO Auto-generated method stub
				if (((Articulo)articulo1).getPrecio() < ((Articulo)articulo2).getPrecio())
					return 1;
				else if (((Articulo)articulo1).getPrecio() > ((Articulo)articulo2).getPrecio())
	                return -1;
	            else
	            	return 0;
			}
			
		};*/
		
		
		Comparator<Articulo> criterioComparacion = new Comparator<Articulo>() {

			@Override
			public int compare(Articulo articulo1, Articulo articulo2) {
				if (articulo1.getPrecio() < articulo2.getPrecio())
					return 1;
				else if (articulo1.getPrecio() > articulo2.getPrecio())
	                return -1;
	            else
	            	return 0;
			}
		};
	
		
		
		System.out.println("Después de ordenar con el criterio establecido en el criterioComparacion  (precio de mayor a menor)");
		Collections.sort(lista,criterioComparacion );
		for (Articulo articulo : lista) {
			System.out.println(articulo);
		}
		
		//Implementación del criterio de comparación con expresión lambda
		System.out.println("AHORA CON LAMBDA:Después de ordenar con el criterio establecido en el criterioComparacion  (precio de mayor a menor)");
		
		Collections.sort(lista, (Articulo articulo1, Articulo articulo2)-> {
			if (articulo1.getPrecio() < articulo2.getPrecio())
				return 1;
			else if (articulo1.getPrecio() > articulo2.getPrecio())
                return -1;
            else
            	return 0;
		} );
		
		for (Articulo articulo : lista) {
			System.out.println(articulo);
		}
	}

}
