package ejem03_otrosTiposDatos;

import java.util.ArrayList;
import java.util.Arrays;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Boolean> estadoCivil = new ArrayList<Boolean>();
		
		estadoCivil.add(true);  // true = casado
		estadoCivil.add(Boolean.valueOf(false));
		
		ArrayList<Integer> datosNumericos = new ArrayList<Integer>();
		datosNumericos.add(25);  // autoboxing
		datosNumericos.add(Integer.valueOf(30));
		datosNumericos.add(45);
		datosNumericos.add(50);
		
		System.out.println(Arrays.toString(datosNumericos.toArray()));
		//datosNumericos.remove(45);
		datosNumericos.remove(2);
		//datosNumericos.remove(Integer.valueOf(45));
		System.out.println(Arrays.toString(datosNumericos.toArray()));
		
		Character letra = 'A'; // autoboxing
		System.out.println("Letra: " + letra);
		System.out.println(Character.MAX_VALUE);
		Character nueve='9';
		System.out.println(Character.isDigit(nueve));
		
		Character a=Character.valueOf('a');
		System.out.println(Character.isDigit(a));
		
		//Character emoticono=Character.valueOf("U+1F600");
		

	}

}
