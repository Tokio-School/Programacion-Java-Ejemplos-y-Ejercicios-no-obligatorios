package com.paquetec;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


import com.paquetea.ClaseA;
//import com.paquetea2.ClaseA2;


public class AplicacionC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dataSize = 1024 * 1024;
		 
	   Runtime runtime = Runtime.getRuntime();
	 
	   System.out.println ("Memoria máxima: " + runtime.maxMemory() / dataSize + "MB");
	   System.out.println ("Memoria total: " + runtime.totalMemory() / dataSize + "MB");
	   System.out.println ("Memoria libre: " + runtime.freeMemory() / dataSize + "MB");
	   System.out.println ("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / dataSize + "MB");
		   
		
		
		
		
		
		
		
		ClaseA miDato=new ClaseA();
	//	ClaseA2 miDato2=new ClaseA2();
		
		Scanner teclado =new Scanner(System.in);
		String cadena=teclado.nextLine();
		System.out.println(cadena);
		
		System.out.println(StringUtils.capitalize(cadena));
		teclado.close();
	}

}
