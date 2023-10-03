import java.util.Arrays;


public class Ejem03_RecepcionArgumenosEnElMain {

	public static void main(String[] args) {
		int datos[]= {1,2,3,4,5};
		// TODO Auto-generated method stub
		pasarDatos(datos);
		System.out.println(Arrays.toString(datos));
	}

	private static void pasarDatos(int[] datosParametro) {
		// TODO Auto-generated method stub
		int [] arrayInterno=datosParametro;
		arrayInterno[2]=33;
		System.out.println(Arrays.toString(arrayInterno));
		
	}


	

}
