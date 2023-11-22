package ejem03_lanzandoexcepciones;

public class Aplicacion {

    public static void main(String[] args) {
//        try {
//            dividir(10, 0);
//        } catch (ArithmeticException e) {
//            System.out.println("Error_____: " + e.getMessage());
//        }
          try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         dividir2(10,0);
    }

    // Método que intenta realizar una división y lanza una excepción si el divisor es cero
    private static double dividir(int numerador, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) (numerador / divisor);
    }
    
    // Método que intenta realizar una división y lanza una excepción si el divisor es cero
    private static double dividir2(int numerador, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) (numerador / divisor);
    }
}
