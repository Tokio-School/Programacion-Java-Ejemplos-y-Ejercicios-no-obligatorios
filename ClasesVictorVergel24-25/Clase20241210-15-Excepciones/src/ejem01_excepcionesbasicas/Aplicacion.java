package ejem01_excepcionesbasicas;

public class Aplicacion {

	public static void main(String[] args) {
		
		/* Sabiendo el mensaje de error que se ha puede producir
		 * 
		 * try {
			System.out.println("División 8/0:"+8/0);
		} catch (ArithmeticException error) {
			//System.out.println("Error: " + error.getMessage());
			//error.printStackTrace();
		}*/
		
		try {
			System.out.println("División 8/0:"+8/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Esto se ejecuta siempre");
		}
		System.out.println("Fin del programa");
		String cadena[]= {"uno","dos","tres"};
		
		for (int i = 0; i <= cadena.length; i++) {
			try {
				System.out.println(cadena[i]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Fin del programa");
	}

}
