package ejem03_procesos_runnable_lambda;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando el hilo principal");
		Thread p=new Thread(() -> System.out.println("Soy un proceso") );
		/*Thread p=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Soy un proceso");
            }
		});*/
		
		
		
		p.start();
		
		
		System.out.println("Soy el hilo principal");
	}

}
