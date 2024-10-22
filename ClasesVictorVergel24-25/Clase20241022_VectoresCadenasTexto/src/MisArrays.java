
public class MisArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Declaración de un array de enteros
		int[] numeros = new int[10];
		/*numeros[0] = 10;
		numeros[5] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[8] = 50;*/
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int)(Math.random()*10);
		//	System.out.println( numeros[i]);
		}
		MisArrays.imprimirArray(numeros);
		
		
		
		// Definir array dando valores
		int[] numeros2 = {10, 20, 30, 40, 50};
		/*for (int i = 0; i < numeros2.length; i++) {
			System.out.println( numeros2[i]);
		}*/
		MisArrays.imprimirArray(numeros2);
		
		
		int[] numeros3 = {30, 40, 30, 10, 20};
		
		System.out.println("---------------------");
		MisArrays.imprimirArray(MisArrays.sumaArray(numeros2, numeros3));
		
	}
	
	public static void imprimirArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.println( array[i]);
		}
	}
	
	public static int[] sumaArray(int[] array,int[] array2)
	{
		int[] resultado = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			resultado[i]=array[i]+array2[i];
		}
		return resultado;
	}
	
	// Multiples parámetros entrada
	/*public static int[] sumaArray(int[]... array)
	{
		int[] resultado = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			resultado[i]=array[0][i]+array[0][i];
		}
		return resultado;
		
	}*/
	
	

}
