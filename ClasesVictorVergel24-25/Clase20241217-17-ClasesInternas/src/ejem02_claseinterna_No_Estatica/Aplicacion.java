package ejem02_claseinterna_No_Estatica;

public class Aplicacion {

	public static void main(String[] args) {
		ListaTareas lista = new ListaTareas();
		ListaTareas.Tarea t1 = lista.new Tarea("Tarea 1", "Descripcion de la tarea 1");
		ListaTareas.Tarea t2 = lista.new Tarea("Tarea 2", "Descripcion de la tarea 2");
		lista.getTareas().add(t1);
		lista.getTareas().add(t2);
		
		for (ListaTareas.Tarea tarea : lista.getTareas()) {
			System.out.println(tarea);
		}

	}

}
