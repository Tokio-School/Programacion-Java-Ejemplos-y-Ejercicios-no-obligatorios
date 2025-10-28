package mi_charsequence;

import java.io.IOException;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiCadenaTexto miCadena = new MiCadenaTexto("Hola Mundo");
		System.out.println(miCadena.charAt(0));
		
		
		try {
			System.out.println(miCadena.append("!!!")); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
