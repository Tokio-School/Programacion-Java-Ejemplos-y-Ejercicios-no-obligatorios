package ejem03_utilidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] datos= {5, 3, 8, 1, 2};
		System.out.println(Arrays.toString(datos));
		
		
		ArrayList<Integer> lista= new ArrayList<Integer>();
		for (int i : datos) {
			lista.add(i);
		}
		
		Collections.shuffle(lista);
		System.out.println(lista);
		/*Collections.sort(lista, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}

		});*/
		/*Collections.sort(lista, (Integer o1, Integer o2)-> {
				return o2-o1;
		});*/
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println(lista);
		
		Collections.reverse(lista);
		
		System.out.println(lista);
		
		//Collections.fill(lista, 0);
		System.out.println(lista);
		Collections.addAll(lista, 5,7,9);
		
		ArrayList<Integer> otra= new ArrayList<Integer>();
		otra.addAll(lista);
		//System.out.println(Collections.binarySearch(lista, Integer.valueOf(3)));
		System.out.println(Collections.binarySearch(lista, 3));
		Collections.replaceAll(lista, 3, 33);
		System.out.println(lista);		
		
		
	}

}
