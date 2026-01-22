package ejem02_stack;

import java.util.Iterator;
import java.util.Stack;

public class Aplicacion {

	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<Integer>();
		System.out.println("Capacidad pila:"+pila.capacity()+" tamaño pila "+pila.size()+" contenido de la pila: " + pila);
		
		for(int i=0; i<=15; i++) {
			pila.push(i);
		}
		
		for (Iterator<Integer> iterator = pila.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			System.out.println("Elemento: " + integer);
		}
		
		
		
		
		
		
		
		System.out.println("Contenido de la pila: " + pila);
		
		System.out.println("Elemento en la cima de la pila: " + pila.peek());
		System.out.println("Contenido de la pila: " + pila);
		System.out.println("Elemento en la cima de la pila: " + pila.pop());
		System.out.println("Contenido de la pila: " + pila);
		
		while(!pila.isEmpty()) {
			System.out.println("Elemento en la cima de la pila: " + pila.pop());
			System.out.println("Capacidad pila:"+pila.capacity()+" tamaño pila "+pila.size()+" contenido de la pila: " + pila);
		}
		
		

	}

}
