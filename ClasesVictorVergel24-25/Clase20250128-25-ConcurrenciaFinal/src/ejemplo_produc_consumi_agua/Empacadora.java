package ejemplo_produc_consumi_agua;

public class Empacadora {

	public static void main(String args[])
	{
		Agua agua=new Agua();
		ThreadGroup botellas=new ThreadGroup("botellas");
		
		
		// Productor
		Fuente fuente=new Fuente(agua);
		fuente.start();

		//Consumidores
		for(int i=0;i<4;i++)
		{
			Botella botella=new Botella(agua,botellas,"Botella "+(i+1));
			botella.start();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Botella[] listadoBotellas=new Botella[4];
		botellas.enumerate(listadoBotellas);
		
		//Finalizar....
		fuente.interrupt();
		botellas.interrupt();
		
		
		
		for (int i = 0; i < listadoBotellas.length; i++) {
			System.out.println("Empacadora: "+listadoBotellas[i].getName()+": "+listadoBotellas[i].getCantidadIndividual());
		}		
		
	}
}
