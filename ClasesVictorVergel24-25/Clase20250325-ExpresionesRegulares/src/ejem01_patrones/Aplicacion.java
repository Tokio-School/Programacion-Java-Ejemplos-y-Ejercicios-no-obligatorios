package ejem01_patrones;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Aplicacion {
	public static void main(String[] args) {
		//Scanner teclado = new Scanner(System.in);
		//Pattern patronNombre=Pattern.compile("[A-Z][a-z]+");
		String nombre1 = "Juan";
		String nombre2 = "J";
		System.out.println(nombre2.matches("[A-Z][a-z]*"));
		System.out.println(nombre2.matches("[A-Z][a-z]"));
		String nombreConTildes="Ángel";
		System.out.println(nombreConTildes.matches("[A-Z][a-z]*"));
		System.out.println("4.-"+nombreConTildes.matches("[A-Za-záéíóúÁÉÍÓÚ]+"));
		String dniEspana="12345678Z";
		System.out.println("5.-"+dniEspana.matches("[0-9]{8}[A-Z]"));
		String dniEspana2="Z12345678";
		System.out.println("6.-"+dniEspana2.matches("[0-9]{8}[A-Z]"));
		
		String correoElectronico="a@b.com";
		System.out.println("7.-"+correoElectronico.matches("[a-z]+@[a-z]+\\.[a-z]{3}"));
		System.out.println("8.-"+correoElectronico.matches("[a-z]+@[a-z]+\\.(com|es)"));
		
		String numeroTelefono="(983)234567";
		String numeroTelefono2="(91)234567";
		System.out.println("9.-"+numeroTelefono.matches("\\([0-9]{2,3}\\)[0-9]{6}"));
		System.out.println("10.-"+numeroTelefono2.matches("\\([0-9]{2,3}\\)[0-9]{6}"));
		System.out.println("11.-"+numeroTelefono.matches("\\(\\d{2,3}\\)\\d{6}"));
		
		String cadenaConUnUnicoEspacioEnBlanco="Hola mundo";
		System.out.println("12.-"+cadenaConUnUnicoEspacioEnBlanco.matches("[a-zA-Z]+ [a-zA-Z]+"));
		
		
		
	}
}
