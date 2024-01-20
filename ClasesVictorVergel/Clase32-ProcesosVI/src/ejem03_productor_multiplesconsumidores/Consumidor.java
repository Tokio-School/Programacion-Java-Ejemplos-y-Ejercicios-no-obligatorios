package ejem03_productor_multiplesconsumidores;

public class Consumidor extends Thread {

	Numero datoCompartido;
	public Consumidor(Numero dato, String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
		datoCompartido=dato;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		do
		{
			System.out.println(Thread.currentThread().getName()+": Numero aleatorio generado: "+ datoCompartido.getNumero());
		
		}while(!datoCompartido.isFin());
		/*synchronized (datoCompartido) {
			datoCompartido.notify();
		}*/
		
		
	}

}
