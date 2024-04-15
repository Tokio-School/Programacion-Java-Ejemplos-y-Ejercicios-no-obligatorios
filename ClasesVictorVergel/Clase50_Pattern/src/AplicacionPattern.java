import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AplicacionPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//Validacion de un nombre
		Pattern patternNombre = Pattern.compile("[a-zA-ZáéíóúÁÉÍÓÚ]+");
		System.out.println(patternNombre.pattern());
		
		
		System.out.println(Pattern.matches("[a-zA-Z]+", "99Juan"));
		System.out.println("******");
		
		//Validad una edad
		Pattern edad = Pattern.compile("[0-9]+");
		Pattern edad2 = Pattern.compile("[0-9]{1,3}");
		
		
		//El . indica cualquier caracter, de ahí que haya que escaparlo con \
		Pattern correoElectronico=Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
		//Dominio sólo en .com o .es
		Pattern correoElectronico3=Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.(com|es)");
		//Teléfono. Primero un paréntesis, 2 números y cierro paréntesis.
		Pattern telefono=Pattern.compile("\\(\\d{2}\\)\\d{3}(\\d{2}){3}");
		//DNI
		Pattern dni=Pattern.compile("\\d{7}[A-Z]");
		//Texto que empieza por mayúscula, luego el conjunto de caracteres que quieras.
		Pattern texto=Pattern.compile("[A-Z].*");
		
		
		Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);  
		
		
		//Matricula de coche
		Pattern matricula=Pattern.compile("\\d{4}[A-Z]{3}");
		//Fecha
		Pattern fecha=Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
		
		
	}

}
