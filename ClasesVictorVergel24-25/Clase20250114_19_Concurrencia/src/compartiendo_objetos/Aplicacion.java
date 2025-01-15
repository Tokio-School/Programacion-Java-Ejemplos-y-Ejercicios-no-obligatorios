package compartiendo_objetos;

public class Aplicacion {

	public static void main(String[] args) {

		ContadorCompartido contador = new ContadorCompartido();
		
		Proceso p1 = new Proceso("proceso 1",contador);
		p1.start();
		
		Proceso p2 = new Proceso("proceso 2",contador);
		p2.start();

	}
	


}
