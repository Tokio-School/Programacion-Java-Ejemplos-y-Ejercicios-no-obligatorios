package ejem02_iniciandoProductorConsumidor;

import java.util.Scanner;

public class Productor extends Thread {

	CadenaCompartida cadena;
	
	public Productor(CadenaCompartida cadena) {
		// TODO Auto-generated constructor stub
		this.cadena=cadena;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		Scanner teclado=new Scanner(System.in);
		String dato;
		do
		{
			dato=teclado.nextLine();
			System.out.println("Productor:"+dato);
			
			
			cadena.setCadenaTexto(dato);
			synchronized (cadena) {
				cadena.notify();
			}
			
			
		}while(!dato.equals("fin"));
		
	}
}
