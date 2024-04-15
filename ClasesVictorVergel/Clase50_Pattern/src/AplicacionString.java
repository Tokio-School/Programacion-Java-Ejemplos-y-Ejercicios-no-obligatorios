
public class AplicacionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saludo="Hola Mundo";	
		boolean haSaludado=saludo.matches("Hola[\\D]*");
		System.out.println(haSaludado);
		
		
		String texto2 = "Juan,          Pedro, Luis,Ana";
		String[] partes = texto2.split(",\\s*");
		for (String string : partes) {
			System.out.println(string);
		}
		
		String nuevoTexto = texto2.replaceAll(",\\s*", "...");
		System.out.println(nuevoTexto);

		
		
		
		
		
		
	}

}
