package ejem02_productor_consumidor;

public class Consumidor extends Thread {

	Numero datoCompartido;
	public Consumidor(Numero dato) {
		// TODO Auto-generated constructor stub
		datoCompartido=dato;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i=0;i<10;i++)
		{
			System.out.println("Numero aleatorio generado: "+ datoCompartido.getNumero());
		
		}
		
	}

}
