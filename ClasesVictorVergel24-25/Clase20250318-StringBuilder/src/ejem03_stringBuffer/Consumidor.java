package ejem03_stringBuffer;

public class Consumidor extends Thread {

	
	StringBuffer sb;
	
	public Consumidor(String nombre,StringBuffer sb) {
		super(nombre);
		this.sb =sb;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		boolean fin = false;
		do
		{
			if (sb.length() == 0) {
				synchronized (sb) {
                    try {
						sb.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}   
			}
                
			char letraInicial=sb.charAt(0);
			System.out.println(Thread.currentThread().getName()+": "+letraInicial);
			sb.delete(0, 1);
			if (letraInicial == '_') {
				fin = true;
			}
			
		} while(!fin);
		
		
	}
}
