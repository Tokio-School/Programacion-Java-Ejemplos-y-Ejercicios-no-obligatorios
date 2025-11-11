package paquete_main;

import paqueteA_A.ClaseA;
import paqueteA_B.ClaseB;
import paqueteC_A.ClaseC_A;
import paqueteC_B.ClaseC_B;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseC_A objetoA=new ClaseC_A();
		ClaseC_B objetoB=new ClaseC_B();
		System.out.println(objetoA);
		System.out.println(objetoB);
		ClaseA objetoA2=new ClaseA();
		ClaseB objetoB2=new ClaseB();
	}

}
