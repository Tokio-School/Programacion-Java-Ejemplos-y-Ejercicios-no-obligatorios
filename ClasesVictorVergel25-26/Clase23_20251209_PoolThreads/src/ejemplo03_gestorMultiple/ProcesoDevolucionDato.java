package ejemplo03_gestorMultiple;

import java.util.concurrent.Callable;

public class ProcesoDevolucionDato implements Callable<String> {

	private String nombre;
	public ProcesoDevolucionDato(int id) {
		nombre="Proceso"+id;
	}
	
	
	
	@Override
	public String call() throws Exception {

		for (int i = 0; i < 5; i++) {
			System.out.println(nombre +" - Iteracion " + i);
			Thread.sleep(500);
		}
		return nombre+"->FIN";
	}

}
