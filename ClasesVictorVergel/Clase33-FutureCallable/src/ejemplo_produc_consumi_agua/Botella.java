package ejemplo_produc_consumi_agua;

public class Botella extends Thread {

	private Agua agua;
	private int cantidadIndividual;
	
	public Botella(Agua agua, ThreadGroup botellas, String nombre) {
		// TODO Auto-generated constructor stub
		super(botellas, nombre);
		this.agua=agua;
	}

	public int getCantidadIndividual() {
		return cantidadIndividual;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		while(!isInterrupted())
		{
			
			if (agua.cogiendoGota())
			{	
				cantidadIndividual++;
				System.out.println(Thread.currentThread().getName()+": "+cantidadIndividual);
			}
			
		}
		
		
	}
}
