package ejem02_claseinternanoestatica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListaTareas {
	
	ArrayList<Tarea> listado;
	
	public ListaTareas() {
		super();
		this.listado = new ArrayList<ListaTareas.Tarea>();
	}
	
	
	public ListaTareas(ArrayList<Tarea> listado) {
		super();
		this.listado = listado;
	}

	public void asignarTarea(Tarea tarea) {
		listado.add(tarea);
	}


	public class Tarea
	{
		String nombre;
		boolean completada;
		String prioridad;
		
		
		public Tarea(String nombre,boolean completada, int prioridad)
		{
			this.nombre=nombre;
			this.completada=completada;
			class Prioridad
			{
				
				public String getPrioridad(int valor)
				{
					if (valor<10)
						return "baja";
					else 
						return "alta";
				}
			}
			Prioridad prio=new Prioridad();
			this.prioridad=prio.getPrioridad(prioridad);
			
		}

		@Override
		public String toString() {
			return "Tarea [prioridad=" + prioridad +"nombre=" + nombre + ", completada=" + completada + "]";
		}
		
	}


	@Override
	public String toString() {
		String temporal="Listado [ ";
		for (Tarea tarea : listado) {
			temporal+=tarea.toString()+" , ";
		}
		temporal+=" ]";
		return temporal;
	}

	
	
	
}
