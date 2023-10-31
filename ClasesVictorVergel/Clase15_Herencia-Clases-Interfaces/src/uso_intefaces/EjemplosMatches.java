package uso_intefaces;

public class EjemplosMatches {
	public static void main(String args[])
	{
		String cadena = "12345";
		boolean coincide = cadena.matches("\\d+"); // \d+ verifica si la cadena contiene uno o más dígitos
		System.out.println(coincide); // Imprime true


		String email = "correo@dominio.com";
		boolean coincide2 = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
		System.out.println(coincide2); // Imprime true

		String numeroTelefono = "123-456-7890";
		boolean coincide3 = numeroTelefono.matches("\\d{3}-\\d{3}-\\d{4}"); // Verifica el formato XXX-XXX-XXXX
		System.out.println(coincide3); // Imprime true

		String cadena2 = "SoloLetras";
		boolean coincide4 = cadena2.matches("[a-zA-Z]+"); // Verifica que la cadena contenga solo letras mayúsculas o minúsculas
		System.out.println(coincide4); // Imprime true

		String fecha = "31/12/2022";
		boolean coincide5 = fecha.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$"); // Verifica el formato de fecha
		System.out.println(coincide5); // Imprime true

		
		String cadena3 = "Texto_123";
		boolean coincide6 = cadena3.matches("[a-zA-Z0-9_]+"); // Verifica que la cadena contenga solo letras, números y guiones bajos
		System.out.println(coincide6); // Imprime true
		
		
	}
}
