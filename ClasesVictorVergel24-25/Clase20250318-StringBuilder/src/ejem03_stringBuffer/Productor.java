package ejem03_stringBuffer;

public class Productor extends Thread {

	StringBuffer sb;
	
	public Productor(StringBuffer sb) {
		// TODO Auto-generated constructor stub
		this.sb =sb;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < 100; i++) {
            sb.append(i);
			synchronized (sb) {
				sb.notify();
			}
            System.out.println("Productor: "+sb);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
            	e.printStackTrace();
            }
        }
		sb.append("_");
		synchronized (sb) {
			sb.notifyAll();
		}
		
	}

}
