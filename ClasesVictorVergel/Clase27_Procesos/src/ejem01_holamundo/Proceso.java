package ejem01_holamundo;

public class Proceso extends Thread {

	private int contadorParticular=0; 
	private ContadorComun contadorComun;
	
	
	public Proceso(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Proceso(String string, ContadorComun contadorComun) {
		// TODO Auto-generated constructor stub
		this.contadorComun=contadorComun;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 20; i++) {
			System.out.println(getName()+": hola mundo proceso");
			contadorParticular++;
			
			int temporal=contadorComun.getContador();
			temporal++;
			contadorComun.setContador(temporal);
			System.out.println(getName()+contadorComun);
			
			/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
		}
		System.out.println(getName()+"FIN----"+contadorParticular);
		
	}

	
}
