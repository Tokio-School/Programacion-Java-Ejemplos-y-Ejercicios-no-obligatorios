import java.util.Scanner;

public class Aplicacion {

	
	public final static double PI=3.1416;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclas=new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String dato=teclas.nextLine();
		System.out.println("hola mundo de "+dato);
		
		System.out.println("Introduce numero1:");
		int numero1=Integer.parseInt(teclas.nextLine());
		System.out.println("Introduce numero2:");
		int numero2=Integer.parseInt(teclas.nextLine());
		
		System.out.println("La suma es: "+Aplicacion.suma(numero1, numero2));
		Aplicacion.mostrarResultado(Aplicacion.suma(numero1, numero2));
		System.out.println("La resta es: "+Aplicacion.resta(numero1, numero2));
		
		System.out.println("El valor de PI es "+Aplicacion.PI);

		Aplicacion.cuantoValePI();
		
		
		System.out.println("La división es: "+numero1/numero2);
		
		
		// Operadores lógicos
		// && y || y ! y ==
		int years=19;
		boolean esMayorDeEdad=(years>=18);
		System.out.println("Es mayor de edad: "+esMayorDeEdad);
		int dinero=30000;
		boolean puedoComprarCoche=(years>=18 && dinero>=20000);
		System.out.println("Puedo comprar coche: "+puedoComprarCoche);
		
	    boolean esMenorDeEdad=!(years>=18);
	    System.out.println("Es menor de edad: "+esMenorDeEdad);
		
	    
	    int salario=(years>=18)?2000:100;
	    System.out.println("Salario: "+salario);
	    
	    boolean esMayorDeEdad2=(years==18)?true:false;
	    
	    
		
	}
	
	/**
	 * Para escribir nombre de variables. Notación Camell
	 * La primera letra en minuscula
	 * La primera letra de cada palabra en mayuscula. nombreUsuario, edadPersona
	 * Todo en mayúsculas para definir constantes. Ej.: PI
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
	
	public static void cuantoValePI() {
		System.out.println("El valor de PI es " + Aplicacion.PI);
	}
	

	
}
