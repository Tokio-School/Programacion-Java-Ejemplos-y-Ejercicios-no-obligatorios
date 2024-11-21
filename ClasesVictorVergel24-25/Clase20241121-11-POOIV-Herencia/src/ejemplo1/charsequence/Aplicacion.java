package ejemplo1.charsequence;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cadena = {'H', 'o', 'l', 'a'};
		MiCadenaTexto miCadena = new MiCadenaTexto(cadena);
		System.out.println("El número de caracteres es: "+miCadena.length());
		
		System.out.println("Subcadena de la posicíon 1 a la 3: "+miCadena.subSequence(1, 3));
	}

}
