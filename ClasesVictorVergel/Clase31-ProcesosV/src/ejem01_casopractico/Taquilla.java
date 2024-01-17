package ejem01_casopractico;

public class Taquilla extends Thread {

	private int contadorPrivado=0;
	private Entrada entradas; 
	
	public Taquilla(ThreadGroup grupo, Entrada entradas, String nombreProceso) {
		// TODO Auto-generated constructor stub
		super(grupo,nombreProceso);
		this.entradas=entradas;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		//System.out.println(Thread.currentThread().getName()+" - " +Thread.currentThread().getPriority());
		while (entradas.getNumeroEntrada()<=50000 && !isInterrupted())
		{
			
			synchronized (entradas) {
				if (entradas.getNumeroEntrada()<=50000)
				{
					int temporal=entradas.getNumeroEntrada();
					System.out.println(Thread.currentThread().getName()+" - "+  temporal);
					temporal++;
					entradas.setNumeroEntrada(temporal);
					contadorPrivado++;
				}
			}
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				interrupt();
			}
		}
		System.out.println("==>"+Thread.currentThread().getName()+" - "+  contadorPrivado);
		
		/*synchronized (entradas) {
			entradas.notify();
		}*/

	}

	
}
