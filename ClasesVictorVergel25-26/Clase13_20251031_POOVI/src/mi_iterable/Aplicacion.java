package mi_iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Datos primitivos: int, char, boolean, float, double, byte, short, long
		// Datos no primitivos: Integer, Character, Boolean, Float, Double, Byte, Short, Long
		
		
		
		ArrayList<String> listaNombres=new ArrayList<String>();
		listaNombres.add("Ana");
		listaNombres.add("Luis");
		listaNombres.add("Pedro");
		for (Iterator iterator = listaNombres.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
		Integer numero=Integer.valueOf(10);
		Integer numero2=Integer.valueOf(20);
		Integer numero3=Integer.valueOf(30);
		MisDatos<Integer> datosEnteros=new MisDatos<Integer>(10);
		datosEnteros.agregar(numero);
		datosEnteros.agregar(numero2);
		datosEnteros.agregar(numero3);
		
		for (Iterator iterator = datosEnteros.iterator(); iterator.hasNext();) {
			Integer numeroInteger= (Integer) iterator.next();
			System.out.println(numeroInteger);
		}
		
	}

}
