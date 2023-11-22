package ejem03_lanzandoexcepciones;

public class Aplicacion2 {

    public static void main(String[] args) {
      //  try {
            dividir(10, 0);
       /* } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }*/
    }

    // Método que intenta realizar una división y lanza una excepción si el divisor es cero
    private static double dividir(int numerador, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) numerador / divisor;
    }
}
