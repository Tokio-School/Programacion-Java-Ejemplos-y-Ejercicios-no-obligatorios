package ejem01_creandoNuestroIterador;

import java.util.Iterator;

import ejem01_creandoNuestroIterador.MiArrayList.MiIterador;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiArrayList lista = new MiArrayList(5);
		lista.add("dato1");
		lista.add("dato2");
	    lista.add("dato3");
	    lista.add("dato4");
	    lista.add("dato5");
		
	   /* System.out.println(lista);
	    
	    lista.remove(3);
	    
	    System.out.println(lista);
	    
	    lista.remove("dato1");
	    System.out.println(lista);*/
	    
	    
	    for (MiIterador iterator = lista.iterator(); iterator.hasNext();) {
			String dato= iterator.next();
			System.out.println("->"+dato);
		}
		
	}

}
