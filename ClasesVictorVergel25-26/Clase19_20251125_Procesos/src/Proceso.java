
public class Proceso extends Thread {
	private Contador contador;
	
	
	public Proceso(String name, Contador contador) {
		super(name);
		this.contador = contador;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=0;contador.getNumero()<10000;i++)
		{
			
			synchronized (contador) {
				if (contador.getNumero()<10000) {
					System.out.println("Proceso hijo "+this.getName()+": "+contador.getNumero());
					
					int temp=contador.getNumero();
					
					temp++;
					
					contador.setNumero(temp);
				}
			}
			
			
			
		}
		
		
		
	}

	public void prueba()
	{
		System.out.println("2eso es una prueba");
	}
}
