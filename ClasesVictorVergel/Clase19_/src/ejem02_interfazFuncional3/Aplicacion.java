package ejem02_interfazFuncional3;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation mathOperation = new MathOperation();
		ThreeParameters<Integer, Integer, Integer> operation = mathOperation::performOperation;

		// Ahora puedes usar 'operation' para realizar la operación con tres parámetros
		operation.performAction(2, 3, 4);

	}

}
