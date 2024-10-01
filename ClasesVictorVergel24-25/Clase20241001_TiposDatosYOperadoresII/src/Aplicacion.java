import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String dato=teclado.nextLine();
		System.out.println("hola mundo de "+dato);
		
		System.out.println("Introduce numero1:");
		int numero1=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce numero2:");
		int numero2=Integer.parseInt(teclado.nextLine());
		
		System.out.println("La suma es: "+Aplicacion.suma(numero1, numero2));
		Aplicacion.mostrarResultado(Aplicacion.suma(numero1, numero2));
		
	}
	
	
	/**
	 * Para escribir nombre de variables. Notación Camell
	 * La primera letra en minuscula
	 * La primera letra de cada palabra en mayuscula. nombreUsuario, edadPersona
	 * 
	 */
	
	// Función porque devuelve un valor
	public static int suma(int dato1, int dato2) {
		return dato1 + dato2;
	}
	
	// Procedimiento porque no devuelve un valor
	public static void mostrarResultado(int resultado) {
		System.out.println("-->Resultado:"+resultado);
	}

	
	public static int resta(int valor1,int valor2) {
		return valor1-valor2;
    }

	
}
