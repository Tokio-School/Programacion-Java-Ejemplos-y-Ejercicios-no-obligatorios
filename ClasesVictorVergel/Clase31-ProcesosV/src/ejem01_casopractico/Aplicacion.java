package ejem01_casopractico;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entradas=new Entrada();
		ThreadGroup grupoVIP=new ThreadGroup("Grupo VIP");
		//grupoVIP.setMaxPriority(1);
		Taquilla taq1=new Taquilla(grupoVIP,entradas,"Taq1");
		taq1.setPriority(Thread.MAX_PRIORITY);
		Taquilla taq2=new Taquilla(grupoVIP,entradas,"Taq2");
		taq2.setPriority(Thread.MAX_PRIORITY);
		ThreadGroup grupoNormal=new ThreadGroup("Grupo normal");
		Taquilla taq3=new Taquilla(grupoNormal,entradas,"Taq3");
		taq3.setPriority(Thread.MIN_PRIORITY);
		Taquilla taq4=new Taquilla(grupoNormal,entradas,"Taq4");
		taq4.setPriority(Thread.MIN_PRIORITY);
		
		taq1.start();
		taq2.start();
		taq3.start();
		taq4.start();
		

		/*synchronized (entradas) {
			try {
				entradas.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} */
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		grupoVIP.interrupt();
		grupoNormal.interrupt();

		try {
			taq1.join();
			taq2.join();
			taq3.join();
			taq4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		System.out.println("NO HAY MAS ENTRADAS");

	}

}
