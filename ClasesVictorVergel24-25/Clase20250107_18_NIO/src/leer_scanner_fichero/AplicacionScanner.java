package leer_scanner_fichero;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AplicacionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = scanner.nextLine();
		System.out.println(nombre);*/
		
		try (Scanner scanner= new Scanner(Paths.get("fichero.txt"));){
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
