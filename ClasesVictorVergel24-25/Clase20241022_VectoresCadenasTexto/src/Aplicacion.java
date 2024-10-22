
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
		
		
		
		
		
		
		
		
		
	}

}
