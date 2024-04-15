package ejem02_procesos;

import java.util.concurrent.atomic.AtomicBoolean;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		AtomicBoolean fin = new AtomicBoolean(false);
		Productor p = new Productor(sb,fin);
		Consumidor c = new Consumidor(sb,fin);

		
	}

}
class Productor implements Runnable {

	StringBuffer sb;
	Thread hiloProductor;
	AtomicBoolean fin;
	
	public Productor(StringBuffer sb, AtomicBoolean fin) {
		super();
		this.sb = sb;
		this.fin=fin;
		hiloProductor = new Thread(this);
		hiloProductor.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			synchronized (sb) {
				sb.append(i+"\n");
				System.out.println("Productor pone:"+i);
				sb.notify();	
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		fin.set(true);;
	}
	
	
}


class Consumidor implements Runnable {

	StringBuffer sb;
	Thread hiloConsumidor;
	AtomicBoolean fin;

	public Consumidor(StringBuffer sb, AtomicBoolean fin) {
		super();
		this.sb = sb;
		this.fin=fin;
		hiloConsumidor = new Thread(this);
		hiloConsumidor.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (sb) {
				try {
					if (!fin.get())
						sb.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				String cadenaLeida=sb.substring(0, sb.indexOf("\n"));
				sb.delete(0, sb.indexOf("\n")+1);
				System.out.println("Consumidor lee:"+cadenaLeida);

			}
		}
	}
	
	
}

