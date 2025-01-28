package programacion_sincrona3;

public class Aplicacion {
	public static void main(String... args)
	{
		Proceso p1 = new Proceso();
		p1.start();
		
		try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p1.getContador());
		
	}
}
