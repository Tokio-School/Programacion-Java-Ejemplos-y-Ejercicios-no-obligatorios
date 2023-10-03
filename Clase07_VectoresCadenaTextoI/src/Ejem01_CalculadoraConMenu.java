
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class Ejem03_CalculadoraConMenu.
 */
public class Ejem01_CalculadoraConMenu {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        boolean continuar=false;
        Scanner scanner = new Scanner(System.in);
        do  {
        	
            // Mostrar el menú
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            
            if (opcion == 5) {
                System.out.println("¡Hasta luego!");
                continuar=true; // Salir del bucle y finalizar la aplicación
            }
            else 
            {
	            System.out.print("Ingrese el primer número: ");
	            double numero1 = scanner.nextDouble();
	            
	            System.out.print("Ingrese el segundo número: ");
	            double numero2 = scanner.nextDouble();
	            
	            double resultado = 0.0;
	            
	            switch (opcion) {
	                case 1:
	                    resultado = sumar(numero1, numero2);
	                    break;
	                case 2:
	                    resultado = restar(numero1, numero2);
	                    break;
	                case 3:
	                    resultado = multiplicar(numero1, numero2);
	                    break;
	                case 4:
	                    resultado = dividir(numero1, numero2);
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	            
	            System.out.println("Resultado: " + resultado);
            }
        } while (!continuar);
        
        scanner.close();
    }

    /**
     * Sumar.
     *
     * @param a Este es el primer número metido por el usuario
     * @param b Este es el segundo número metido por el usuario
     * @return the double
     */
    public static double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Restar.
     *
     * @param a the a
     * @param b the b
     * @return the double
     */
    public static double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplicar.
     *
     * @param a the a
     * @param b the b
     * @return the double
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Dividir.
     *
     * @param a the a
     * @param b the b
     * @return the double
     */
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // Valor no válido
        }
        return a / b;
    }
}
