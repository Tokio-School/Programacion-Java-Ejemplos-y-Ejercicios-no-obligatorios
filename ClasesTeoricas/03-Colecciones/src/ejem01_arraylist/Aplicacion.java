package ejem01_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase<Integer> claseJava = new Clase<Integer>("Java", 8);
		Clase<Integer> claseJava2 = new Clase<Integer>("Java", 8);
		Clase<Integer> claseUnity = new Clase<Integer>("Unity", 8);
		Clase<Integer> clasePython = new Clase<Integer>("Python", 6);
		Clase<Integer> claseC = new Clase<Integer>("C", 2);
		Clase<Integer> claseKotlin = new Clase<Integer>("Kotlin", 1);
		
		
		ArrayList<Clase<Integer>> clases = new ArrayList<Clase<Integer>>();
		
		clases.add(claseJava);
		clases.add(claseUnity);
		clases.add(claseJava2);
		clases.add(clasePython);
		clases.add(claseC);
		clases.add(claseKotlin);
		
		
		
		
		/*Collections.sort(clases);
		
		for (Iterator<Clase<Integer>> iterator = clases.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		Collections.shuffle(clases);
		
		for (Iterator<Clase<Integer>> iterator = clases.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}*/
		
		System.out.println(Arrays.toString(clases.toArray()));
		
		TreeSet<Clase<Integer>> treeSet = new TreeSet<Clase<Integer>>(clases);
		System.out.println(Arrays.toString(treeSet.toArray()));
		
		
	}

}
