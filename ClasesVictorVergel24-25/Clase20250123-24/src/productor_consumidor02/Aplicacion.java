package productor_consumidor02;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiBuffer buffer=new MiBuffer();
		Consumidor consumidor=new Consumidor(buffer);
		consumidor.start();
		
		Productor productor=new Productor("Productor1",buffer);
		productor.start();
		

		Productor productor2=new Productor("Productor2",buffer);
		productor2.start();
		
		
		
	}

}
