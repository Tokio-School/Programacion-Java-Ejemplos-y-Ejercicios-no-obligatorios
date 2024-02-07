package ejem02_micoleccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		
		numeros.add(3);
		numeros.add(8);
		numeros.add(11);
		
		System.out.println(numeros.remove(numeros.size()-1));
		
		System.out.println(numeros.toString());
		
		System.out.println("Mostrando los datos del ArrayList");
		for (Integer num : numeros) {
			System.out.println(num);
		}
		System.out.println("Mostrando los datos del ArrayList desde el iterator");
		
		
		
		
		for (Iterator num = numeros.iterator(); num.hasNext();) {
			System.out.println((Integer) num.next());
		}
		
		
		
		
		
		
		
	}

}
