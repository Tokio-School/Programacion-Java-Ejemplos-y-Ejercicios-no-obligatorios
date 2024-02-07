package ejem01_miiterable;

import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto conjuntoNumeros=new Conjunto(5);
		conjuntoNumeros.add(3);
		conjuntoNumeros.add(8);
		conjuntoNumeros.add(11);
		
		System.out.println(conjuntoNumeros.remove());
		System.out.println(conjuntoNumeros.toString());
		
		System.out.println("Listado de números recorridos gracias foreach:");
		for (Integer numero: conjuntoNumeros) {
			System.out.println(numero);
		}
		System.out.println("Listado de números recorridos gracias al iterator:");
		for (Iterator iterator = conjuntoNumeros.iterator(); iterator.hasNext();) {
			Integer datoRecuperado = (Integer) iterator.next();
			System.out.println(datoRecuperado);
		}
		
		
	}

}
