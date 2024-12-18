package ejem02_claseinterna_No_Estatica;

import java.util.ArrayList;

public class ListaTareas {
	private ArrayList<Tarea> tareas = new ArrayList<Tarea>();
	
	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	public class Tarea {
		private String nombre;
		private String descripcion;
		private String prioridad;

		public Tarea(String nombre, String descripcion) {
			this.nombre = nombre;
			this.descripcion = descripcion;
			
			class Prioridad {
				private String prioridad;

				public Prioridad(int prioridad) {
					if (prioridad == 1) {
						this.prioridad = "Baja";
					} else if (prioridad == 2) {
						this.prioridad = "Media";
					} else if (prioridad == 3) {
						this.prioridad = "Alta";
					} else {
						this.prioridad = "Desconocida";
					}
					
				}

				
				
				public String getPrioridad() {
					return prioridad;
				}



				public void setPrioridad(String prioridad) {
					this.prioridad = prioridad;
				}



				@Override
				public String toString() {
					return prioridad;
				}
			}
			
			Prioridad p = new Prioridad(2);
			this.prioridad=p.getPrioridad();
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		@Override
		public String toString() {
			return nombre + ": " + descripcion;
		}
	}
	
}
