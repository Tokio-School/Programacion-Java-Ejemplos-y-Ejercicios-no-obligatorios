
public class Aplicacion {

	public static void main(String[] args) {
		int i=0;
		
		Proceso p = new Proceso();
		p.start();
		//p.run();
		
		while(i<100000000)	
		{
			System.out.println("Proceso padre->"+i);
			i++;
		}
	}
	


}
