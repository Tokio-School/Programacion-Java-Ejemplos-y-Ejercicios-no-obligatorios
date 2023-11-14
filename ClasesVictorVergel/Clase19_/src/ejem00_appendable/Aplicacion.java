package ejem00_appendable;

import java.io.IOException;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadenaCaracteres miCadena=new CadenaCaracteres();
		
		try {
			miCadena=(CadenaCaracteres) miCadena.append('V');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(miCadena.toString());

		
		try {
			miCadena=(CadenaCaracteres) miCadena.append("ictor");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(miCadena.toString());
	}

}
