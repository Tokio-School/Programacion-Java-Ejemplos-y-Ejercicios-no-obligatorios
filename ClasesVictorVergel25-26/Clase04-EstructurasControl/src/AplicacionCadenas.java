
public class AplicacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = "Hola";
		
		for (int i = 0; i < cadena1.length(); i++) {
			System.out.print(cadena1.charAt(i)+" - ");
		}
		
		String cadena2 = "hola"+ " soy Victor";
		
		if (cadena1.equals(cadena2)) {
			System.out.println("\nSon iguales");
		} else {
			System.out.println("\nNo son iguales");
		}
		
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		
	}

}
