
public class Aplicacion {

	
	/**
	 * Enunciado de la práctica. 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int datoNuevo=33;
		datoNuevo=datoNuevo+2;
		datoNuevo=datoNuevo/2;
		datoNuevo=datoNuevo%2;
		datoNuevo++;
		System.out.println(datoNuevo);
		
		
		byte edad=127;
		System.out.println(edad);
		
		// cast , casteo ...... 
		edad=(byte)datoNuevo;
		
		// Evitamos las ñ en los nombres de variable.
		// Minúscula en la primera letra dela variable... y luego por claridad podemos alternarmay/minu
		short datoPequeno=1200;
		//short r=233;
		
		//System.out.println(dato/0);
		
		float altura=1.25f;
		System.out.println(altura);
		
		
		boolean soltero=true;
		
		System.out.println(soltero);
		boolean casado=!soltero;
		
		String nombre="Victor"+datoPequeno;
		System.out.println(nombre);
		
		char letra='a';
		letra++;
		System.out.println(letra);
		
		if (5>6)
		{
			System.out.println("---------------------------");
			System.out.println("El 5 es mayor que el 6");
			System.out.println("---------------------------");
		}
		else
			System.out.println("El 5 no es mayor que el 6");
		
		
		if (casado)
			System.out.println("Está casado");
		else
			System.out.println("Está soltero");
		
		// && para el Y lógico
		// || para el O lógico
		if (casado && edad>18)
			System.out.println("casado mayor de 18");
		else
			System.out.println("o no está casado o no tiene más de 18");
		
		boolean autorizacionPaterna=true;
		
		if (autorizacionPaterna || edad>18)
			System.out.println("Se le permite pasar");
		else
			System.out.println("No puede pasar.");
		
		//boolean puedePasar=(autorizacionPaterna||edad>18):true:false;
		
		if (autorizacionPaterna )
			if (edad>18)
				System.out.println("Tiene autorización paterna y más de 18");
			else 
				System.out.println("Tiene autorización paterna y menos de 18");
		else
		{
			if (edad>18)
				System.out.println("No tiene autorización paterna y más de 18");
			else 
				System.out.println("No tiene autorización paterna y menos de 18");
		}
		
		
	}

}
