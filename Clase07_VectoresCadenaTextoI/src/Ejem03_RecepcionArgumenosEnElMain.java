import java.util.Arrays;


public class Ejem03_RecepcionArgumenosEnElMain {

	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	
		int datos[]= {1,2,3,4,5};
		// TODO Auto-generated method stub
		pasarDatos(datos);
		System.out.println(Arrays.toString(datos));
		
		int numero1=3;
		pasarDatosEnteros(numero1);
		System.out.println(numero1);
		
		int datosACopiar[]= {1,2,3,4};
		int datosCopiados[]= {0,0,0,0};
		for (int i = 0; i < datosCopiados.length; i++) {
			datosCopiados[i]=datosACopiar[i];
		}
				
	}

	private static void pasarDatosEnteros(int numeroParametrizado) {
		// TODO Auto-generated method stub
		int numero2=numeroParametrizado;
		numero2=40;
		numeroParametrizado=55;
		System.out.println(numero2);
	}

	private static void pasarDatos(int[] datosParametro) {
		// TODO Auto-generated method stub
		int [] arrayInterno=datosParametro;
		arrayInterno[2]=33;
		System.out.println(Arrays.toString(arrayInterno));
	}
}
