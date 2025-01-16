package ejem02_gruposProcesosYPrioridades;

public class Aplicacion {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		ThreadGroup grupoHilosPrioritarios = new ThreadGroup("Grupo de hilos principales");
		ThreadGroup grupoHilosSecundarios = new ThreadGroup("Grupo de hilos secundarios");
		
		
		
		new ProcesoRunnable("proceso1", grupoHilosPrioritarios);
		new ProcesoRunnable("proceso2", grupoHilosSecundarios);
		new ProcesoRunnable("proceso3", grupoHilosSecundarios);
		new ProcesoRunnable("proceso4", grupoHilosSecundarios);
		

		
	}
	


}
