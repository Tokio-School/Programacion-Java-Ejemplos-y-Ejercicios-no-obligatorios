package ej01_appendable;

import java.io.IOException;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cadena = {'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o'};
		
		MiCadenaTexto miCadena = new MiCadenaTexto(cadena);
		MiCadenaTexto miCadena2=null;
		try {
			miCadena2=(MiCadenaTexto) miCadena.append('.');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(miCadena2.toString());
		
		MiCadenaTexto miCadena3=null;
		try {
			miCadena3=(MiCadenaTexto) miCadena2.append(miCadena);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(miCadena3.toString());
	}

}
