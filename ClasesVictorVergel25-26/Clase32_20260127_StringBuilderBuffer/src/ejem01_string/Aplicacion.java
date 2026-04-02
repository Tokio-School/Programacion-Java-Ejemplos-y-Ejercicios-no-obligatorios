package ejem01_string;

import java.util.StringTokenizer;

public class Aplicacion {

	public static void main(String[] args) {
		String mensaje = "Hola";
		System.out.println(mensaje +" - " + mensaje.hashCode());
		
		String mensaje2= "Hola";
		System.out.println(mensaje +" - " + mensaje.hashCode());
		
		
		if (mensaje==mensaje2) {
			System.out.println("Son el mismo objeto cadena");
		} else {
			System.out.println("No son el mismo objeto  cadena");
		}
		if (mensaje.equals(mensaje2)) {
			System.out.println("Son el mismo objeto cadena");
		} else {
			System.out.println("No son el mismo objeto cadena");
		}
		
		System.out.println("-------------------");
		
		
		Persona p1 = new Persona("Ana", 30);
		System.out.println(p1 + " - " + p1.hashCode());
		System.out.println(p1.edad());
		Persona p2 = new Persona("Ana", 30);
		System.out.println(p2 + " - " + p2.hashCode());
		
		if (p1==p2) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("No son el mismo objeto");
		}
		if (p1.equals(p2)) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("No son el mismo objeto");
		}
		
		System.out.println(mensaje +" - hashCode antiguo:" + mensaje.hashCode());	
		mensaje=mensaje+mensaje2;
		System.out.println(mensaje +" - hashCode nuevo" + mensaje.hashCode());	
		
		
		
		String cadena = "victor,jorge,maria,luis,carlos,ana";
		StringTokenizer cadenaTokens = new StringTokenizer(cadena, ",");
		while (cadenaTokens.hasMoreTokens()) {
			System.out.println(cadenaTokens.nextToken());
		}
		System.out.println("-------------------");
		//String[] arrayCadenas = cadena.split(",");
		String[] arrayCadenas = cadena.split("[a|e|i|o|u]");
		for (String s: arrayCadenas) {
			System.out.println(s);
		}

	}

}
