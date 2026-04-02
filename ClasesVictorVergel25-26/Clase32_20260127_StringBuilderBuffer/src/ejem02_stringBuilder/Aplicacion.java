package ejem02_stringBuilder;

import java.util.ArrayList;

public class Aplicacion {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hola");
		System.out.println(sb.hashCode());
		sb.append(" me llamo Victor");
		System.out.println(sb.hashCode());
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.insert(3, "***** "));
		
		ArrayList<StringBuilder> alineacionTextos=new ArrayList<StringBuilder>();
		alineacionTextos.add(new StringBuilder("prueba 1"));
		alineacionTextos.add(new StringBuilder("prueba 1323214"));
		alineacionTextos.add(new StringBuilder("prueba 13"));
		
		for (StringBuilder texto : alineacionTextos) {
			while (texto.length()<20)
				texto.insert(texto.length(), '.');
		}
		alineacionTextos.forEach(System.out::println);
		
		System.out.println("--------------");
		System.out.println(sb.subSequence(2, 4));
		for (StringBuilder texto : alineacionTextos) {
			System.out.println(texto.indexOf("prueba"));
		}

	}

}
