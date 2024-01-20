package ejem03_productor_multiplesconsumidores;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero dato=new Numero();
		
		Productor productor=new Productor(dato);
		Consumidor consumidor=new Consumidor(dato,"Consumidor 1");
		Consumidor consumidor2=new Consumidor(dato,"Consumidor 2");
		
		productor.start();
		consumidor.start();
		consumidor2.start();
		
		
	}

}
