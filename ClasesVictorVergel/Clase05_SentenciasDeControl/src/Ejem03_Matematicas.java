
public class Ejem03_Matematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.PI);
		
		
		
		double numero = -5.5;
		double valorAbsoluto = Math.abs(numero);
		System.out.println("Valor absoluto de " + numero + " es " + valorAbsoluto);

		double numero2 = 25;
		double raizCuadrada = Math.sqrt(numero2);
		System.out.println("La raíz cuadrada de " + numero2 + " es " + raizCuadrada);
		
		double base = 2;
		double exponente = 3;
		double resultado = Math.pow(base, exponente);
		System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);

		double numero3 = 4.3;
		double redondeado = Math.ceil(numero3);
		System.out.println("Redondeado hacia arriba: " + redondeado);

		
		double numero4 = 4.9;
		double redondeado2 = Math.floor(numero4);
		System.out.println("Redondeado hacia abajo: " + redondeado2);

		double numero5 = 4.6;
		long redondeado3 = Math.round(numero5);
		System.out.println("Redondeado: " + redondeado3);

		//float numeroFloat=3.3f;
		double numero6 = 10;
		double numero7 = 20;
		double maximo = Math.max(numero6, numero7);
		System.out.println("El valor máximo es " + maximo);
		
		double numero8 = 10;
		double numero10 = 20;
		double minimo = Math.min(numero8, numero10);
		System.out.println("El valor mínimo es " + minimo);


		
	}

}
