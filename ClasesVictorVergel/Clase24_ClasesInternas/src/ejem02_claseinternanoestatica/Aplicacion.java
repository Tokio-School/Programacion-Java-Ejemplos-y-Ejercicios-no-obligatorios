package ejem02_claseinternanoestatica;

import ejem02_claseinternanoestatica.ListaTareas.Tarea;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaTareas lista=new ListaTareas();
		lista.asignarTarea(lista.new Tarea("Dar clase",true,5));
		lista.asignarTarea(lista.new Tarea("Comer",false,4));
		lista.asignarTarea(lista.new Tarea("Dormir",false,11));
		
		//Tarea tarea=lista.new Tarea("Dar clase",true);
		//System.out.println(tarea);
		
		System.out.println(lista.toString());
		
	}

}
