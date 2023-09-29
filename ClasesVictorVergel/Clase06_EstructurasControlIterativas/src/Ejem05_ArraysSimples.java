
public class Ejem05_ArraysSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String datos[]= {"Maria","Jose","Victor"};
		
		String cadena="Esta es una cadena de texto";
		System.out.println(cadena.length());
		/*System.out.println(datos[0]);
		System.out.println(datos[1]);
		System.out.println(datos[2]);*/
		
		datos[1]="Pedrito";
		
		mostrarDatosArray(datos);
		
		String datos2[]= {" "," "," "," "};
		for (int i = 0; i < datos.length; i++) {
			datos2[i]=datos[i];
		}
		datos2[3]="Miguel Angel";
		
		mostrarDatosArray(datos2);
		
		
		int datos3[]=new int[20];
		for (int i = 0; i < datos3.length; i++) {
			datos3[i]=i;
		}
		mostrarDatosArray(datos3);
		
		
	}

	private static void mostrarDatosArray(String[] datos) {
		// TODO Auto-generated method stub
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
	}
	
	private static void mostrarDatosArray(int[] datos) {
		// TODO Auto-generated method stub
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
	}

}
