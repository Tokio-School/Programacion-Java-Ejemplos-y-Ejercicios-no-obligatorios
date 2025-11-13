package ejem03_clasesInternasNoEstaticas;

import ejem03_clasesInternasNoEstaticas.ListaTareas.Tarea;
import ejem03_clasesInternasNoEstaticas.ListaTareas.Tarea.Prioridad;

public class Aplicacion {

	public static void main(String[] args) {
		ListaTareas lista = new ListaTareas();
		lista.agregarTarea("Comprar pan");
		lista.agregarTarea("Estudiar Java");
		Tarea tarea1 = lista.new Tarea("Comprar vino",4);
		lista.agregarTarea(tarea1);
		System.out.println(lista);
		
		Prioridad prioridadAlta = tarea1.new Prioridad(3);
		tarea1.setPrioridad(prioridadAlta);
		System.out.println(lista);

	}

}
