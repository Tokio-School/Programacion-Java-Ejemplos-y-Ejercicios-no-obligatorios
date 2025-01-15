package compartiendo_objetos;

public class Proceso extends Thread{
	
	private ContadorCompartido contadorCompartido; 
	
	public Proceso() {
		super();
	}
	
	public Proceso(String nombre, ContadorCompartido contador) {
		super(nombre);
		contadorCompartido=contador;
	}
	

	private int contadorInterno = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			contadorInterno++;
			synchronized (contadorCompartido) {
				int aux=contadorCompartido.getContador();
				aux++;
				contadorCompartido.setContador(aux);
				System.out.println(getName() + " - " + 
				      contadorInterno + " contador compartido: " + 
					  contadorCompartido.getContador());
			}
			
		}

		
	}

	
	
	
	
}
