package ejem04_esperarUnDato;

public class Aplicacion {

	public static void main(String[] args) {
		Proceso p = new Proceso();
		p.start();
		
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.getDato());

	}

}
