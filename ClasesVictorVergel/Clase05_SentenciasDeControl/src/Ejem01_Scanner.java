import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejem01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Scanner por teclado
		Scanner teclado=new Scanner(System.in);
		int nota=0;
		do
		{
			System.out.println("Inserta la nota:");
			nota=teclado.nextInt();
		} while(nota<10);
		System.out.println("La nota es superior al 10");
		teclado.close();
		
		//Scanner a partir de un String
        String datos = "Juan 25 1,75";
        Scanner scanner = new Scanner(datos);
        String nombre = scanner.next();
        int edad = scanner.nextInt();
        double altura = scanner.nextDouble();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        scanner.close();
        
        //Scanner a partir de un fichero
        try {
            File file = new File("datos.txt");
            Scanner scannerFichero = new Scanner(file);
            while (scannerFichero.hasNextLine()) {
                String linea = scannerFichero.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
	}

}
