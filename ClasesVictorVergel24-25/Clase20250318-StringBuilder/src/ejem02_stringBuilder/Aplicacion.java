package ejem02_stringBuilder;

import java.util.StringTokenizer;

public class Aplicacion {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hola mundo");
		System.out.println(sb);
		System.out.println("1.-"+sb.hashCode());
		sb.append(" desde Java");
		System.out.println("2.-"+sb.hashCode());
		sb.reverse();
		System.out.println("3.-"+sb.hashCode());
		System.out.println(sb);
		
		while (sb.length() > 2) {
			sb.deleteCharAt(0);
		}
		System.out.println("4.-"+sb.hashCode());
		System.out.println(sb);
		
		System.out.println("------------------");
		String cadenaCSV="uno,dos,tres,cuatro,cinco,seis,siete";
		StringTokenizer st = new StringTokenizer(cadenaCSV, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String[] cadenas=cadenaCSV.split(",");
			
	}

}
