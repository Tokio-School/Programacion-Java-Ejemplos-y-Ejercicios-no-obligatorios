package ejem03_creandoNuestroIteradorParametrizado;

import java.util.Iterator;

import ejem01_creandoNuestroIterador.MiArrayList.MiIterador;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiArrayList<Integer> lista = new MiArrayList<Integer>(5);
		lista.add(Integer.valueOf(1));
		lista.add(Integer.valueOf(2));
	    lista.add(Integer.valueOf(3));
	    lista.add(Integer.valueOf(4));
	    lista.add(Integer.valueOf(5));
		
	   /* System.out.println(lista);
	    
	    lista.remove(3);
	    
	    System.out.println(lista);
	    
	    lista.remove("dato1");
	    System.out.println(lista);*/
	    
	    
	    for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Integer dato= (Integer) iterator.next();
			System.out.println("->"+dato);
		}
		
	}

}
