package programacion_sincrona;

public class Aplicacion {
	public static void main(String... args)
	{
		Proceso p1 = new Proceso();
		p1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p1.getContador());
		
	}
}
