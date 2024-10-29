
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {1,2,3,4,5,6,7,8,9,10};
		//mostrar(numeros);
		
		System.out.println("Posicion 0:"+ args[0]);
		System.out.println("Posicion 1:"+ args[1]);
		//System.out.println("Posicion 2:"+ args[2]);
		
		
		
		System.out.println(sumar(1,2,3));
		System.out.println(sumar(10,20,30,40));
		System.out.println(sumar(10,4));
		System.out.println(sumar(10,4,3,1,2,3,4,4,56,3,9));
		
		
		
	}

	private static void mostrar(int[] numeros) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	
	private static int sumar(int... numeros) {
		int suma = 0;
		/*for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}*/
		for (int num : numeros) {
			suma += num;
		}
		
		
		System.out.println("La suma es: " + suma);
		return suma;
	}

}
