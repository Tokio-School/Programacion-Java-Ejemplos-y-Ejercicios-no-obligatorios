package ejem_interfazFuncionalRecord;

import java.util.ArrayList;
import java.util.Arrays;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tarea> tareas = new ArrayList<>();
		
		/*GestionTarea agregarTarea = new GestionTarea() {
			@Override
			public void ejecutar(Tarea tarea, ArrayList<Tarea> tareas) {
				tareas.add(tarea);
			}
		};
		GestionTarea eliminarTarea= new GestionTarea() {

			@Override
			public void ejecutar(Tarea tarea, ArrayList<Tarea> tareas) {
				tareas.remove(tarea);
            }
		};
		GestionTarea completarTarea=new GestionTarea() {

			@Override
			public void ejecutar(Tarea tarea, ArrayList<Tarea> tareas) {
				tarea.setCompletada(true);
			}
			
		};*/
		
		GestionTarea agregarTarea = (Tarea tarea, ArrayList<Tarea> listaTareas) -> {
			listaTareas.add(tarea);
		};
		GestionTarea eliminarTarea= (Tarea tarea, ArrayList<Tarea> listaTareas) -> {
			listaTareas.remove(tarea);
		};
		GestionTarea completarTarea=(Tarea tarea, ArrayList<Tarea> listaTareas)-> {
			for (Tarea t : listaTareas) {
				if (t.equals(tarea))
				{
					listaTareas.remove(t);
					listaTareas.add(new Tarea(tarea.descripcion(), true));
				}
			}
			
		};
		
		Tarea t1 = new Tarea("Estudiar Java", false);
		Tarea t2 = new Tarea("Hacer la compra", false);
		Tarea t3 = new Tarea("Preparar la comida", false);
		tareas.add(t1);
		tareas.add(t2);
		tareas.add(t3);
		/*Tarea miNuevaTarea=new Tarea("Estudiar Angular",false);
		System.out.println(Arrays.toString(tareas.toArray()));
		agregarTarea.ejecutar(miNuevaTarea, tareas);
		System.out.println(Arrays.toString(tareas.toArray()));
		eliminarTarea.ejecutar(miNuevaTarea, tareas);
		System.out.println(Arrays.toString(tareas.toArray()));*/
		
		
		System.out.println(Arrays.toString(tareas.toArray()));
		agregarTarea.ejecutar(new Tarea("Estudiar Angular",false), tareas);
		System.out.println(Arrays.toString(tareas.toArray()));
		/*eliminarTarea.ejecutar(new Tarea("Estudiar Angular",false), tareas);
		System.out.println(Arrays.toString(tareas.toArray()));*/
		completarTarea.ejecutar(new Tarea("Estudiar Angular",false), tareas);
		System.out.println(Arrays.toString(tareas.toArray()));
		
		
		
	}

}
