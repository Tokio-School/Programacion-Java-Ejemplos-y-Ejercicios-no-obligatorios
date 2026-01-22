package ejem01_intefazFuncionalBasica;

public class Suma implements Operacion{

	@Override
	public double calcular(double a, double b) {
		return a+b;
	}

}
