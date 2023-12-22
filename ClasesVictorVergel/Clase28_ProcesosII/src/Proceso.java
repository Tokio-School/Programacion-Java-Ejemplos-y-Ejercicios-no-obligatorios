
public class Proceso implements Runnable {

	private Thread miThread;
	private ContadorComun contador;
	
	
	public Proceso(ContadorComun contador, String nombreProceso) {
		super();
		this.contador=contador;
		miThread=new Thread( this  ,nombreProceso);
		miThread.start();
	}




	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		//for (int i = 1; i <= 100; i++) {
		while(contador.getContador()<=200) {
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (contador) {
				if (contador.getContador()<=200)
				{
					int temporal=contador.getContador();
					temporal++;
					contador.setContador(temporal);
				
				System.out.println(Thread.currentThread().getName()+": "+contador.getContador());
				}
			}

			
		}
	}

}
