
public class Proceso extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int i=0;
		while(i<100000000)	
		{
			System.out.println("Proceso hijo->"+i);
			i++;
		}

		
	}

	
	
	
	
}
