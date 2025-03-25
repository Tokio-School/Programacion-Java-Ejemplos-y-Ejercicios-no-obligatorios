package ejem02_string;

import java.util.Arrays;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaHolaMundo = "Hola Mundo";
		System.out.println("1.-"+cadenaHolaMundo.matches("Hola Mundo"));
		
		String cadenaCSV = "Juan;Perez;Calle Mayor;Madrid";
		String[] campos = cadenaCSV.split("[;| ]");
		System.out.println(Arrays.toString(campos));
		
		String cadenaBlancos = "Juan    Perez    Calle Mayor Madrid";
		//String cadenaSinBlancos = cadenaBlancos.replaceAll(" +", "");
		String cadenaSinBlancos = cadenaBlancos.replaceAll("\s+", "");
		System.out.println(cadenaSinBlancos);
		
		String sustituirAporE = "Casa";
		String sustituir = sustituirAporE.replaceFirst("[aeiou]", "_");
		System.out.println(sustituir);
		
	}

}
