package ejem02_interfazFuncional2;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoParameters<Integer, Integer> sumOperation = Calculator::sum;

		// Ahora puedes usar sumOperation para realizar la operación de suma
		sumOperation.performAction(3, 5);

	}

}
