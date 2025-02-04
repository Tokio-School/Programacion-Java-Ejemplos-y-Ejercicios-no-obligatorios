package ejem01_profundizandoObjetos;

import java.util.ArrayList;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer numero = new Integer(10);
		Integer numero=Integer.valueOf(10); 
		Integer numero1=10; //autoboxing
		int num=numero1; //unboxing
		System.out.println(num);
		
		String cadena="10";
		cadena=cadena+"10";
		System.gc();
		
		numero=Integer.valueOf(33);
		
		
		Persona p1=new Persona("Juan", "Perez", 33);
		System.out.println(p1.nombre());
		
		
		
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		//lista.remove(20);
		//lista.remove(Integer.valueOf(20));
		lista.remove((Integer)20);
		
		for (Integer i : lista) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
