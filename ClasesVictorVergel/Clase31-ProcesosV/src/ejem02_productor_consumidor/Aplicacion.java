package ejem02_productor_consumidor;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero dato=new Numero();
		
		Productor productor=new Productor(dato);
		Consumidor consumidor=new Consumidor(dato);
		
		productor.start();
		consumidor.start();
		
		
	}

}
