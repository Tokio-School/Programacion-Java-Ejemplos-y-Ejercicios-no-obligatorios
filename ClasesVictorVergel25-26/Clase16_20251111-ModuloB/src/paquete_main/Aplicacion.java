package paquete_main;

import paqueteA_A.ClaseA;
import paqueteA_B.ClaseB;
import paqueteB_A.ClaseB_A;
import paqueteB_B.ClaseB_B;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseB_A objetoA=new ClaseB_A();
		ClaseB_B objetoB=new ClaseB_B();
		System.out.println(objetoA);
		System.out.println(objetoB);
		ClaseA objetoA2=new ClaseA();
		ClaseB objetoB2=new ClaseB();
	}

}
