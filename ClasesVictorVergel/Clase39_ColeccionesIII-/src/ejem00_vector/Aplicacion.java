package ejem00_vector;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector=new Vector<Integer>(10);
		AtomicInteger numero=new AtomicInteger(0);
		
		Productor produc=new Productor(vector,numero);
		Consumidor consum1=new Consumidor(vector,numero,"C1");
		Consumidor consum2=new Consumidor(vector,numero,"C2");
		
		produc.start();
		try {
			Thread.sleep(25);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		consum1.start();
		consum2.start();
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vector.setSize(50);
		
	}

}
