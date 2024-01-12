package ejem02_iniciandoProductorConsumidor;

public class Consumidor extends Thread {

	CadenaCompartida cadena;
	
	public Consumidor(CadenaCompartida cadena) {
		// TODO Auto-generated constructor stub
		this.cadena=cadena;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		do
		{
			synchronized (cadena) {
				try {
					cadena.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
			System.out.println("Consumidor:"+cadena.getCadenaTexto());
		}while(!cadena.getCadenaTexto().equals("fin"));
	}

}
