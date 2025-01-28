package programacion_sincrona2;

public class Aplicacion {
	public static void main(String... args)
	{
		Contador contador=new Contador();
		Proceso p1 = new Proceso(contador);
		p1.start();
		
		synchronized (contador) {
			try {
				contador.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(p1.getContador());
		
	}
}
