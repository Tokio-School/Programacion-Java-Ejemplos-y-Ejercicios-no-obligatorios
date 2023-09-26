
public class Ejem04_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creación de cadenas
		String cadena1 = "Hola, ";
		String cadena2 = "mundo!";
		String cadena3 = "   Java es divertido   ";

		// Concatenación de cadenas
		String resultadoConcatenacion = cadena1 + cadena2;
		System.out.println("Concatenación: " + resultadoConcatenacion+"---"+String.valueOf(false));

		// Longitud de una cadena
		int longitud = cadena1.length();
		
		System.out.println("Longitud de cadena1: " + longitud);

		// Conversión a mayúsculas y minúsculas
		String mayusculas = cadena1.toUpperCase();
		String minusculas = cadena2.toLowerCase();
		System.out.println("Mayúsculas: " + mayusculas);
		System.out.println("Minúsculas: " + minusculas);

		// Comparación de cadenas
		boolean igual = cadena1.equals(cadena2);
		boolean ignorarMayusculas = cadena1.equalsIgnoreCase("hOla, MuNdO!");
		System.out.println("Igualdad exacta: " + igual);
		System.out.println("Igualdad ignorando mayúsculas: " + ignorarMayusculas);

		// Eliminación de espacios en blanco al principio y al final
		String sinEspacios = cadena3.trim();
		System.out.println("Cadena sin espacios: " + sinEspacios);

		// Búsqueda de subcadenas
		boolean contiene = cadena1.contains("la");
		int indice = cadena2.indexOf("mun");
		System.out.println("Contiene 'la': " + contiene);
		System.out.println("Índice de 'mun': " + indice);

		// Reemplazo de caracteres o subcadenas
		String reemplazada = cadena1.replace("Hola", "Saludos");
		System.out.println("Reemplazo: " + reemplazada);

		// Recorrer una cadena de texto
		String cadenaTexto="esto es una cadena de texto corta";
		int contador=0;
		for (int i = 0; i < cadenaTexto.length(); i++) {
            char caracter = cadenaTexto.charAt(i);

            // Verificar si el caracter es una vocal (a, e, i, o, u)
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
		System.out.println("numero de vocales:"+contador);	

	}

}
