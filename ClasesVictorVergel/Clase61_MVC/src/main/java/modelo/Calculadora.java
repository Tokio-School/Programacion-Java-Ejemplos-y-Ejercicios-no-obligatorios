package modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculadora {
	private double operando1;
	private double operando2;
	private char operador;

	public Calculadora() {
		operando1 = 0;
		operando2 = 0;
		operador = ' ';
	}

	public double calcular() {
		double resultado = 0;

		switch (operador) {
		case '+':
			resultado = operando1 + operando2;
			break;
		case '-':
			resultado = operando1 - operando2;
			break;
		case '*':
			resultado = operando1 * operando2;
			break;
		case '/':
			resultado = operando1 / operando2;
			break;
		default:
		}

		return resultado;
	}
}
