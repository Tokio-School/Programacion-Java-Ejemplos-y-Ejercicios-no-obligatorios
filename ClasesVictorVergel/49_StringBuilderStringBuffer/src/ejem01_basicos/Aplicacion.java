package ejem01_basicos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(20);
		sb.append("Hola");
		sb.append(" Mundo desde Valladolid y periferia");
		System.out.println("---"+sb.toString()+"---"+sb.length()+"---"+sb.capacity()+"---");
		
		
		
		String cadena="hola mundo desde cadena\nme llamo Victor\neste es un curso de java en TokioSchool";
		Scanner sc = new Scanner(cadena);
		StringBuilder sb2 = new StringBuilder();
		
		while (sc.hasNextLine()) {
			String linea = sc.nextLine();
			System.out.println(linea);
			sb2.append(linea+".");
		}
		
		System.out.println(sb2.toString());
		
		
		String cadenaCSV="hola,mundo,desde,cadena,me,llamo,Victor,este,es,un,curso,de,java,en,TokioSchool";
		
		StringTokenizer st = new StringTokenizer(cadenaCSV, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//Convertir a Array
		String[] array = cadenaCSV.split(",");
		System.out.println(Arrays.toString(array));
		
		
		
		StringBuilder cadenaPruebas=new StringBuilder("Hola don Pepito");
		cadenaPruebas.replace(5, 9, "....");
		System.out.println(cadenaPruebas.toString());
		cadenaPruebas.insert(5, ",");
		System.out.println(cadenaPruebas.toString());
		
		System.out.println("***********************");
		for(int i=0;i<cadenaPruebas.length();i++) {
            System.out.println(cadenaPruebas.charAt(i));
        }
		
		
	}

}
