package ejem04_vector;

import java.util.Random;
import java.util.Vector;

public class Aplicacion {

	public static void main(String[] args) {
		
		Vector<Integer> miVector = new Vector<>(5);
		
		Thread productor=new Thread(()-> {
			while(true) {
                if (miVector.size()<5) {
                    //System.out.println("El vector tiene "+miVector.size()+" elementos");
                    miVector.add(new Random().nextInt(10));
                    try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            }
        });
		productor.start();
		Thread consumidor = new Thread(() -> {
			while (true) {
				if (miVector.size() > 0) {
					System.out.println("El vector tiene " + miVector.size() + " elementos");
					System.out.println(miVector.remove(0));
				}
			}
		});
		consumidor.start();
		
		
		
		
		
		
	}

}
