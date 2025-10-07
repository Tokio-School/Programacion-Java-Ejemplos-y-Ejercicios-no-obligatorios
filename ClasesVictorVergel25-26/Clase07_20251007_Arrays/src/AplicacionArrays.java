import java.util.Arrays;

public class AplicacionArrays {
	
	public static void main(String[] args) {
		int[] array = {10,50,33,1,2,3,4,5};
		int[] array2 = {10,50,33,1,2,3,4,51};
		
		System.out.println("Posicion: "+Arrays.binarySearch(array, 3)+" -> "+ array[Arrays.binarySearch(array, 3)]);;
		//System.out.println("Posicion: "+Arrays.binarySearch(array, 44)+" -> "+ array[Arrays.binarySearch(array,44)]);;
		
		Arrays.sort(array);
		System.out.println("Array ordenado: "+Arrays.toString(array));
		
		Arrays.fill(array, 99);
		System.out.println("Array: "+Arrays.toString(array));
		
		System.out.println(Arrays.compare(array, array2));
		
		
		/*int arrayCopiado[]=Arrays.copyOfRange(array, 2, 5);
	
		System.out.println("Array copiado: "+Arrays.toString(arrayCopiado));*/		
		
		System.out.println("Array copiado: "+Arrays.toString(Arrays.copyOfRange(array, 2, 5)));
		
		
		System.out.println(array.length);
		int arrayMenor[]= {3,5,7};
		array=arrayMenor;
		System.out.println(array.length);
		

		
		
	}
}
