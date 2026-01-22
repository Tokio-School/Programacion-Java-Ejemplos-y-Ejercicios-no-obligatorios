package ejem01_vector;

import java.util.Vector;

public class Aplicacion {

	public static void main(String[] args) {
		Vector<Integer> listado = new Vector<Integer>();
		
		Thread productor= new Thread(() -> {
			
			for (int i = 0; i < 30; i++) {
				
				listado.add(i);
				synchronized (listado)
				{
					listado.notify();
				}
				System.out.println("Productor: Añadido Elemento " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		productor.start();
		
		Thread consumidor= new Thread(() -> {
			for (int i = 0; i < 30; i++) {
				synchronized (listado)
				{
					try {
						listado.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
//				if (!listado.isEmpty()) {
					int elemento = listado.remove(0);
					System.out.println("Consumidor: Eliminado Elemento " + elemento);
/*				} else {
					System.out.println("Consumidor: No hay elementos para eliminar");
				}*/
				/*try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
		});
		consumidor.start();
		
		
		

	}

}
