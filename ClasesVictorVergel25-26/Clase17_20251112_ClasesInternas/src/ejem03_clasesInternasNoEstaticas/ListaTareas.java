package ejem03_clasesInternasNoEstaticas;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaTareas {

	ArrayList<Tarea> tareas;
	
	public ListaTareas() {
		tareas = new ArrayList<>();
	}
	/**  Constructor de Tarea que recibe un String y crea una Tarea asignánola a la lista */
	public void agregarTarea(String descripcion) {
		tareas.add(this.new Tarea(descripcion, 2));
	}
	
	@Override
	public String toString() {
		return "ListaTareas [tareas=" + generarCadenaListaTareas(tareas) + "]";
	}
	private String generarCadenaListaTareas(ArrayList<Tarea> tareas2) {
		String cadena = "";
		for (Tarea tarea : tareas2) {
			cadena += tarea.toString() + " - ";
		}	
		return cadena;
	}
	/**  Constructor de Tarea que recibe una Tarea asignánola a la lista */
	public void agregarTarea(Tarea tarea) {
		tareas.add(tarea);
	}
	
	public class Tarea {
		private String descripcion;
		private boolean completada;
		private Prioridad prioridad;

		public Prioridad getPrioridad() {
			return prioridad;
		}

		public void setPrioridad(Prioridad prioridad) {
			this.prioridad = prioridad;
		}

		public Tarea(String descripcion, int nivelPrioridad) {
			this.descripcion = descripcion;
			this.completada = false;
			this.prioridad = this.new Prioridad(nivelPrioridad);
		}

		public String getDescripcion() {
			return descripcion;
		}

		public boolean isCompletada() {
			return completada;
		}

		public void setCompletada() {
			this.completada = true;
		}

		@Override
		public String toString() {
			return "Tarea [descripcion=" + descripcion + ", completada=" + completada +", prioridad=" + prioridad.getNivel() + "]";
		}
		
		class Prioridad
		{
			private String nivel;
			
			public Prioridad (int nivel)
			{
				
				switch (nivel)
				{
					case 1:
						this.nivel = "Baja";
						break;
					case 2:
						this.nivel = "Media";
						break;
					case 3:
						this.nivel = "Alta";
						break;
					default:
						this.nivel = "Otra";
						break;
				}
			}
			
			public String getNivel()
			{
				return nivel;
			}
		}
		
		
	}
}
