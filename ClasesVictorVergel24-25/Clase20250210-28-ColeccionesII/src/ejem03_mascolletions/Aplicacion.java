package ejem03_mascolletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aplicacion {
	
	public static void main(String args[])
	{
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		//Articulo miArticulo=new Articulo("Articulo a", 130);
		lista.add(new Articulo("Articulo a", 130));
		lista.add(new Articulo("Articulo b", 20));
		lista.add(new Articulo("Articulo a", 130));
		lista.add(new Articulo("Articulo 4", 10));
		
		if (new Articulo("Articulo a", 130).equals(new Articulo("Articulo a", 130)))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		
		
		
		System.out.println("Antes de desordenar");
		for (Articulo articulo : lista) {
			System.out.println(articulo);
		}
		Collections.shuffle(lista);
		System.out.println("Después de desordenar");
		for (Articulo articulo : lista) {
			System.out.println(articulo);
		}
		
		Collections.reverse(lista);
		System.out.println("Después de invertir");
		for (Articulo articulo : lista) {
			System.out.println(articulo);
		}
		
		System.out.println("Antes de sustituir el objeto (new Articulo(\"Articulo a\", 130)");
		Collections.replaceAll(lista,new Articulo("Articulo a", 130), new Articulo("Articulo NUEVO", 999));
		System.out.println("Despues de sustituirlo");
		
		System.out.println(lista.toString());
		
		
		
		
		
	}
}