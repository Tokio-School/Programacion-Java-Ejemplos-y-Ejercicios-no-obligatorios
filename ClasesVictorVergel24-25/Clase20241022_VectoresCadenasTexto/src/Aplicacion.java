import java.util.Random;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Juan";
		
		System.out.println("Hola " + nombre);
		
		int numero = 10;
		
		
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.length());
		
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		
		String nombreCompleto = "Juanito Nicasio";
		
		String nombrePropio="";
		int i=0;
		boolean finalizar=false;
		do {
			if (nombreCompleto.charAt(i) != ' ') {
                nombrePropio += nombreCompleto.charAt(i);
                
            }else {
            	finalizar=true;
            }
			i++;
		} while(!finalizar);
		System.out.println(nombrePropio);
		
		System.out.println(nombreCompleto.substring(0, nombreCompleto.indexOf(" ")));
		System.out.println(nombreCompleto.substring(nombreCompleto.indexOf(" ")+1));
		System.out.println("-->"+nombreCompleto.substring(nombreCompleto.indexOf(" ")+1,
													nombreCompleto.length()));
		
		
		// Funciones estáticas de la clase String.
		int numero1 = 10;
		int numero2 = 20;
		System.out.println(String.valueOf(numero1*numero2));
		
		Random random = new Random();
		for (int j = 0; j < 10; j++) {
            System.out.println(random.nextInt(1, 10));
        }
		System.out.println("----");
		for (int j = 0; j < 10; j++) {
            System.out.println((int)(Math.random() * 10));
        }
		
		// Nombre.......Vergel..........Rodriguez
		// Nombre2......Apellido1.......Apellido2
		// Nombre3......Apellido1.......Apellido2
		
		
		
		
		
		
	}

}
