import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AplicacionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		/*scanner.useDelimiter("-+");
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}*/
		
		
		/*Pattern fecha=Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
		
		String fechaTexto;
        boolean fechaValida = false;
        while (!fechaValida) {
            System.out.println("Por favor, introduzca una fecha en formato dd/mm/yyyy:");
            fechaTexto = scanner.nextLine();
  
            // Validar la entrada de la fecha utilizando la expresión regular
            Matcher matcher = fecha.matcher(fechaTexto);
            if (matcher.matches()) {
                System.out.println("Fecha introducida correctamente: " + fecha);
                fechaValida = true; // Establecer la variable a true para salir del bucle
            } else {
                System.out.println("Formato de fecha incorrecto. Por favor, inténtelo de nuevo.");
            }
        }*/
        
        
        String cadenaAValidar="Juan tiene 25 años y vive en Valladolid";
        Scanner scanner2 = new Scanner(cadenaAValidar);
        
        Pattern patron = Pattern.compile("[0-9]{1,3}");
        System.out.println(scanner2.findInLine(patron));
        
        
        
        
        
		
		scanner.close();
		
	}

}
