package ejem01_conceptosbasicos;

import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		
		
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			System.out.println(integer);
		}
		System.out.println("------");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		
		
	}

}
